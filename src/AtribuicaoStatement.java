/*
 * Comando de Atribuição
 */

/**
 *
 * @author roger
 */
public class AtribuicaoStatement {
    public TabSimRecord id;             // Identificador
    public Object expressao;         // Expressão
    
    public AtribuicaoStatement(TabSimRecord id, Object expressao) {
        this.id = id;
        this.expressao = expressao;
    }
}
