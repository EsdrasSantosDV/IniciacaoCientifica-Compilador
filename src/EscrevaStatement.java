/*
 * Escreva() ou EscrevaL()
 */
import java.util.ArrayList;

/**
 *
 * @author roger
 */
// Escreva() ou Escreval()
public class EscrevaStatement {
    public static final int TYPE_ESCREVA = 1;       // Usado quando é um escreva()
    public static final int TYPE_ESCREVAL = 2;      // Usado quando é um escreval()
    public int type;                                // Tipo do escreva: TYPE_ESCREVA ou TYPE_ESCREVAL 
    public ArrayList<Object> listExpresao;       // Lista de expressões
    
    public EscrevaStatement(int typeEscreva, ArrayList<Object> listExpressao) {
        this.type = typeEscreva;
        this.listExpresao = listExpressao;
    }
}