package customfiles;

import java.util.ArrayList;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

public class CustomErrorListener extends BaseErrorListener {

    private ArrayList<String> error_List = new ArrayList<>();

    public CustomErrorListener() {
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {

        String error_Mesaage = msg + " at line " + line + " ,position " + charPositionInLine;
        error_List.add(error_Mesaage);

        System.out.println(error_Mesaage);
    }

    public int getErrorList(){
        return this.error_List.size();
    }
}