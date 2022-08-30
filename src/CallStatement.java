/*
 * Chamada de procedimento/funcao em uma linha
 */
import java.util.ArrayList;
/**
 *
 * @author roger
 */
public class CallStatement {
    TabSimRecord id;                // Identificação do procedimento ou função
    ArrayList<Object> listArgs;  // Lista de parametros do procedimento/função
    
    public CallStatement(TabSimRecord id, ArrayList<Object> listArgs) {
        this.id = id;
        this.listArgs = listArgs;
    }
}
