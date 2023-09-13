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
            println("Comecei");
            generateCode(t.getChild(0));
            return;
        case "Model":
            for (int c=2;c<t.getChildCount()-1;c+=2)
                generateCode(t.getChild(c));
            return;
        case "Activation":
            println("\tlayers.Activation(\"%s\")", t.getText());
            return;
        case "Dense":
            for (int c=0;c<t.getChildCount();c++)
                generateCode(t.getChild(c));
        case "ElementWise":
            String op = t.getChild(0).getText();
            String num = t.getChild(1).getText();
            if (op.equals("+"))
                println("\tlayers.Rescaling(1.0, offset=%s)", num);
            else if (op.equals("-"))
                println("\tlayers.Rescaling(1.0, offset=-%s)", num);
            else if (op.equals("*"))
                println("\tlayers.Rescaling(%s, offset=0)", num);
            else if (op.equals("/"))
                println("\tlayers.Rescaling(1/%s, offset=0)", num);
            return;
        case "TensorWise":
            String op = t.getChild(0).getText();
            ParseTree tensor = t.getChild(1);
            if (op.equals("~>"))

                println("\tlayers.Rescaling(1.0, offset=%s)", num);
            else
                if (op.equals("->"))
                    print("\tlayers.Reshape(");
                    println("\tlayers.Rescaling(1.0, offset=-%s)", num);
                else if (op.equals("@"))
                    println("\tlayers.Rescaling(%s, offset=0)", num);
                else if (op.equals("&"))
                    println("\tlayers.Rescaling(1/%s, offset=0)", num);
            return;
        case "Tensor":
            print("(");
            for (int c=0;c<t.getChildCount();c+=2)
                print(t.getChild(c).getText());
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