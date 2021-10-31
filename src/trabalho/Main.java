package trabalho;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import trabalho.valida_forms.Valida_formsLexer;
import trabalho.valida_forms.Valida_formsParser;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean use_listener = true;
        CharStream cs = fromFileName("src/trabalho/test.txt");  //load the file
        Valida_formsLexer lexer = new Valida_formsLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        Valida_formsParser parser = new Valida_formsParser(tokens);
        ParseTree tree = parser.prog(); //Regra inicial da gram�tica - parse the content and get the tree

        try {
            if (use_listener) {
                ValidaListener listener = new ValidaListener();
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(listener, tree);

            } else {
                ValidaVisitor classVisitor = new ValidaVisitor();
                String result = (String) classVisitor.visit(tree);
//                System.out.println("RESULTADO:" + result);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
