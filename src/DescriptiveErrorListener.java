/***
	Sobrecarga do método syntaxError do ANTLR4 para exibição de mensagens de erros durante a análise léxica e sintática
***/

import java.awt.Frame;
import javax.swing.JDialog;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class DescriptiveErrorListener extends BaseErrorListener {
    public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
            //throws ParseCancellationException
    {
/*        
        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }
*/
        msg = "Syntax error: line " + line + ", at position " + charPositionInLine + ", message: " + msg;

        if (FormPrincipal.txtMensagem.getText().equals(""))
            FormPrincipal.txtMensagem.setText(msg);
        else
            FormPrincipal.txtMensagem.setText(FormPrincipal.txtMensagem.getText() + "\n" + msg);
        
        // Sinaliza que houve um erro durante a análise
        AlgoParser.erro = true;
        
        //throw new ParseCancellationException("");
    }
}