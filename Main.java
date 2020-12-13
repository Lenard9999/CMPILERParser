import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;

import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;




public class Main {
    
    public static void showTree() throws Exception {
        CharStream cStream = CharStreams.fromFileName("inputtext.txt");
        Lexer lexer = new MainLexer(cStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        MainParser parser = new MainParser(tokenStream);
        ParseTree tree = parser.start();
    
        // Tree inspector
         TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
         viewer.open();
    }
    public static void main(String[] args) throws Exception {
        CharStream cStream = CharStreams.fromFileName("inputtext.txt");
        MainLexer lexer = new MainLexer(cStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MainParser parser = new MainParser(tokens);
        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new MainBaseListener(), tree);
        System.out.println();

        System.out.println(tree.toStringTree(parser));
        showTree();
    }


}


