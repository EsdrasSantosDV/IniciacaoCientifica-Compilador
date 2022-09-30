/*
 * Repita..até
 */
import java.util.ArrayList;

// Repita..até
public class RepitaStatement {
    public Object  expressao;    // Expressão
    public ArrayList<Object> statements;     // Lista de comandos
    
    public RepitaStatement(ArrayList<Object> statements, Object expressao) {
        this.statements = statements;
        this.expressao = expressao;
    }
}
