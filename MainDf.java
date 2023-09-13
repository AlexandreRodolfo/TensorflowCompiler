import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MainDf {
    static void print(String fmt, Object ...args) {
        System.out.print(String.format(fmt, args));
    }

    static void println(String fmt, Object ...args) {
        System.out.println(String.format(fmt, args));
    }

    static String opName(ParseTree t) {
        String name = t.getClass().getName();
        name = name.substring(name.indexOf("$")+1);
        name = name.substring(0,name.indexOf("Context"));
        return name;
    }

    static void generateCode(ParseTree t) {
        switch (opName(t)) {
        case "Program":
            println("from tensorflow import keras");
            println("from tensorflow.keras import layers");
            println("from tensorflow.keras.models import Sequential");
            for (int c=0;c<t.getChildCount()-1;c++)
                generateCode(t.getChild(c));
            return;
        case "Model":
            println("\n%s = Sequential([", t.getChild(0).getText());
            for (int c=2;c<t.getChildCount()-1;c++) {
                if (!t.getChild(c).getText().equals(",")) {
                    generateCode(t.getChild(c));
                    if (c < t.getChildCount()-2)
                        println(",");
                    else
                        println("");
                    }
            }
            println("])");
            return;
        case "Dense":
            print("\tlayers.Dense(");
            generateCode(t.getChild(0));
            print(")");
            return;
        case "ElementWise":
            String e_op = t.getChild(0).getText();
            String num = t.getChild(1).getText();
            if (e_op.equals("+")) print("\tlayers.Rescaling(1.0, offset=%s)", num);
            else if (e_op.equals("-")) print("\tlayers.Rescaling(1.0, offset=-%s)", num);
            else if (e_op.equals("*")) print("\tlayers.Rescaling(%s, offset=0)", num);
            else if (e_op.equals("/")) print("\tlayers.Rescaling(1/%s, offset=0)", num);
            return;
        case "TensorWise":
            String t_op = t.getChild(0).getText();
            ParseTree tensor = t.getChild(1);
            if (t_op.equals("~>")) {
                String height = tensor.getChild(0).getText();
                String width = height;
                if (tensor.getChildCount() >= 2)
                    width = tensor.getChild(2).getText();
                print("\tlayers.Resizing(%s, %s)", height, width);
            } else if (t_op.equals("->"))
                if (tensor.getChildCount() == 1 && tensor.getChild(0).getText().equals("0"))
                    print("\tlayers.Flatten()");
                else {
                    print("\tlayers.Reshape(");
                    generateCode(tensor);
                    print(")");
                }
            else if (t_op.equals("@") || t_op.equals("&")) {
                println("Devia aparecer");
                int dim = 1;
                String filters = tensor.getChild(0).getText();
                String transpose = (t_op.equals("&")) ? ("Transpose(") : ("");
                String convShape = (tensor.getChildCount() >= 2) ? (tensor.getChild(2).getText()) : ("");
                for (int c=4;c<tensor.getChildCount();c+=2){
                    convShape += "," + tensor.getChild(c).getText();
                    dim++;
                }
                print("\tlayers.Conv%dD%s(%s, (%s))", dim, transpose, filters, convShape);
            }
            return;
        case "Activation":
            print("\tlayers.Activation(\"%s\")", t.getText());
            return;
        case "Tensor":
            print("(%s", t.getChild(0).getText());
            for (int c=2;c<t.getChildCount();c+=2)
                print(",%s", t.getChild(c).getText());
            print(")");
            return;
        }
    }

    public static void main(String args[]) throws Exception {
        CharStream stream = CharStreams.fromFileName("exemplo.df");
        DummyFlowLexer lexer = new DummyFlowLexer(stream);
        TokenStream tkStream = new CommonTokenStream(lexer);
        DummyFlowParser parser = new DummyFlowParser(tkStream);

        ParseTree tree = parser.program();
        if (parser.getNumberOfSyntaxErrors()==0)
           System.out.println("Programa reconhecido corretamente");
        else {
            System.out.println("Programa possui erros corrija-os");
            return;
        }
        println("Gerando código de máquina:");
        generateCode(tree);
    }
}

//java -jar antlr.jar DummyFlow.g4 -o gen
//javac -cp antlr.jar:gen *.java gen/*.java -d gen
//java -cp antlr.jar:gen MainDf