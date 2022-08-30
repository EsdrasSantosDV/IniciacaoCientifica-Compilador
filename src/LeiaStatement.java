
import java.util.ArrayList;

/*
 * Leia Statement
 */

/**
 *
 * @author roger
 */
public class LeiaStatement {
    public ArrayList<TabSimRecord> listId;       // Lista de expressões

    public LeiaStatement() {
        this.listId = null;
    }
    
    public LeiaStatement(ArrayList<TabSimRecord> listId) {
        this.listId = listId;
    }
}
