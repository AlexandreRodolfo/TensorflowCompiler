import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.FileWriter;

class MainDF {
    static FileWriter myWriter;

    static void print(String fmt, Object ...args) {
        System.out.print(String.format(fmt, args));
        try {
            myWriter.write(String.format(fmt, args));
        } catch (Exception e) {}
    }

    static void println(String fmt, Object ...args) {
        System.out.println(String.format(fmt, args));
        try {
            myWriter.write(String.format(fmt, args));
            myWriter.write("\n");
        } catch (Exception e) {}
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
            print("    layers.Input(shape=");
            generateCode(t.getChild(2));
            println("),");
            for (int c=3;c<t.getChildCount()-1;c++) {
                generateCode(t.getChild(c));
                if (c < t.getChildCount()-2)
                    println(",");
                else
                    println("");
            }
            println("])");
            return;
        case "Max":
            print("    layers.MaxPooling%dD(", 1 + t.getChild(1).getChildCount() / 2);
            generateCode(t.getChild(1));
            print(")");
            return;
        case "Avg":
            print("    layers.AveragePooling%dD(", 1 + t.getChild(1).getChildCount() / 2);
            generateCode(t.getChild(1));
            print(")");
            return;
        case "Dropout":
            print("    layers.Dropout(%s)", t.getChild(1).getText());
            return;
        case "Normalization":
            print("    layers.Normalization()");
            return;
        case "Dense":
            print("    layers.Dense(");
            generateCode(t.getChild(0));
            print(")");
            return;
        case "ElementWise":
            String e_op = t.getChild(0).getText();
            String num = t.getChild(1).getText();
            if (e_op.equals("+")) print("    layers.Rescaling(1.0, offset=%s)", num);
            else if (e_op.equals("-")) print("    layers.Rescaling(1.0, offset=-%s)", num);
            else if (e_op.equals("*")) print("    layers.Rescaling(%s, offset=0)", num);
            else if (e_op.equals("/")) print("    layers.Rescaling(1/%s, offset=0)", num);
            return;
        case "TensorWise":
            String t_op = t.getChild(0).getText();
            ParseTree tensor = t.getChild(1);
            if (t_op.equals("~>")) {
                String height = tensor.getChild(0).getText();
                String width = height;
                if (tensor.getChildCount() >= 2)
                    width = tensor.getChild(2).getText();
                print("    layers.Resizing(%s, %s)", height, width);
            } else if (t_op.equals("->"))
                if (tensor.getChildCount() == 1 && tensor.getChild(0).getText().equals("0"))
                    print("    layers.Flatten()");
                else {
                    print("    layers.Reshape(");
                    generateCode(tensor);
                    print(")");
                }
            else if (t_op.equals("@") || t_op.equals("&")) {
                int dim = tensor.getChildCount() / 2;
                String filters = tensor.getChild(0).getText();
                String transpose = (t_op.equals("&")) ? ("Transpose(") : ("");
                String convShape = (tensor.getChildCount() >= 2) ? (tensor.getChild(2).getText()) : ("");
                for (int c=4;c<tensor.getChildCount();c+=2)
                    convShape += "," + tensor.getChild(c).getText();
                print("    layers.Conv%dD%s(%s, (%s))", dim, transpose, filters, convShape);
            }
            return;
        case "Activation":
            print("    layers.Activation(\"%s\")", t.getText());
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
        for (int i=0; i<args.length; i++) {
            CharStream stream = CharStreams.fromFileName(args[i]);
            DummyFlowLexer lexer = new DummyFlowLexer(stream);
            TokenStream tkStream = new CommonTokenStream(lexer);
            DummyFlowParser parser = new DummyFlowParser(tkStream);

            ParseTree tree = parser.program();
            if (parser.getNumberOfSyntaxErrors()==0)
                System.out.println("Programa " + args[i].toString() + " reconhecido corretamente");
            else {
                System.out.println("Programa " + args[i].toString() + " possui erros corrija-os");
                return;
            }

            System.out.println("Gerando código de máquina:");
            myWriter = new FileWriter(args[i].substring(0, args[i].lastIndexOf('.')) + ".py");
            generateCode(tree);
            myWriter.close();
            System.out.println("");
        }
    }
}