/*
 * Se..então..senão..fimse
 */
import java.util.ArrayList;
/**
 *
 * @author roger
 */
public class SeStatement {
    public Object  expressao;    // Expressão
    public ArrayList<Object> thenStatments; // Lista de sentenças do então
    public ArrayList<Object> elseStatments; // Lista de sentenças do senão
    
    public SeStatement(Object expressao, ArrayList thenStatements, ArrayList elseStatements) {
        this.expressao = expressao;
        this.thenStatments = thenStatements;
        this.elseStatments = elseStatements;
    }
}
