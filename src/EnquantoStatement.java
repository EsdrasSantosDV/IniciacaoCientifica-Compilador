/*
 * Enquanto..fimenquanto
 */
import java.util.ArrayList;

// Enquanto..fimenquanto
public class EnquantoStatement {
    public Object  expressao;    // Expressão
    public ArrayList<Object> statements;     // Lista de comandos
    
    public EnquantoStatement(Object expressao, ArrayList statements) {
        this.expressao = expressao;
        this.statements = statements;
    }
}
