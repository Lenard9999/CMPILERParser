import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

public class CustomErrorListener extends BaseErrorListener {

    public CustomErrorListener() {
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {

        String error_Mesaage = msg + " at line " + line + " ,position " + charPositionInLine;

        System.out.println(error_Mesaage);
    }
}