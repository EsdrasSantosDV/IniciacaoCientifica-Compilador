/*
 * Para..de..ate..fimpara
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author roger
 */
public class ParaStatement {
    public TabSimRecord      variavel;            // Variável de controle
    public Object            inicial;              // Expressão de inicialização
    public Object            ate;                  // Expressão de finalização, ou seja, o ATÉ
    public Object            passo;                // Expressão identificação do passo. Se não especificado, assume 1
    public boolean           decrescente = false;  // Se descrecente = true, a variável é decrementada, senão ela é incrementada
    public ArrayList<Object> statements;           // Lista de comandos
    
    public ParaStatement(TabSimRecord variavel, Object inicial, Object ate, Object passo, boolean decrescente, ArrayList statements) {
        this.variavel = variavel;
        this.inicial = inicial;
        this.ate = ate;
        this.passo = passo;
        this.decrescente = decrescente;
        this.statements = statements;
    }
}
