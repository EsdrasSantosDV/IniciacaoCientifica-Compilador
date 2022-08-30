/*
 * Contém uma expressão ou um operando.
 */

/**
 *
 * @author roger
 * 
 */
public class Expressao {
    // As constantes abaixo são usadas para o typeNode, ou seja, se é um operador ou um operando.
    // Constantes para identificação do operando
    public static final int IDENTIFICADOR = 1;  // Nó do tipo identificador
    public static final int INTEIRO = 2;        // Nó contendo um valor inteiro
    public static final int REAL = 3;           // Nó contendo um valor real
    public static final int LOGICO = 4;         // Nó contendo um valor lógico
    public static final int CARACTER = 5;       // Nó contendo uma string
    // Operadores aritméticos
    public static final int ADICAO = 20;        // Indica que o nó é uma adição
    public static final int SUBTRACAO = 21;     // Indica que o nó é uma subtração
    public static final int MULTIPLICACAO = 22; // Indica que o nó é uma multiplicação
    public static final int DIVISAO = 23;       // Indica que o nó é uma divisão
    public static final int UMINUS = 24;        // Indica que o nó é do operador unário UMINUS
    // Operadores lógicos
    public static final int E = 30;             // Indica que o nó é do operador binário E
    public static final int OU = 31;            // Indica que o nó é do operador binário OU
    public static final int NAO = 32;           // Indica que o nó é do operador binário NÃO
    // Operadores relacionais
    public static final int IGUAL = 40;         // Indica que o nó é do operador binário de IGUALDADE
    public static final int MENOR = 41;         // Indica que o nó é do operador binário de MENOR
    public static final int MENOR_IGUAL = 42;   // Indica que o nó é do operador binário de MENOR ou IGUAL
    public static final int MAIOR = 43;         // Indica que o nó é do operador binário de MAIOR
    public static final int MAIOR_IGUAL = 44;   // Indica que o nó é do operador binário de MAIOR ou IGUAL
    public static final int DIFERENTE = 45;   // Indica que o nó é do operador binário de DIFERENÇA
 
    // Indica se é um oparador de ADICAO, SUBTRACAO, MULTIPLICACAO, DIVISAO, UMINUS, E, OU ou NÃO
    // IGUAL, MENOR, MENOR_IGUAL, MAIOR, MAIOR_IGUAL ou DIFERENTE, IDENTIFICADOR, NÚMERO INTEIRO, 
    // NÚMERO REAL, VALOR LÓGICO ou uma STRING de caracteres.
    // Se for operador de ADIÇÃO, SUBTRAÇÃO, MULTIPLICAÇão, DIVISÃO, IGUAL, MENOR, MENOR ou IGUAL,
    // MAIOR, MAIOR ou IGUAL, DIFERENTE, E ou OU left possui a expressão a 
    // esquerda e right possui a expressão da direita do operador. 
    // Nos demais casos, left contêm o operando. 
    public int typeNode;        
    // Tipo de dados da expressão resultante.
    public Type typeExpression = Type.NONE;  
    // Expressão da esquerda
    public Object left;         
    // Expressão da direita
    public Object right;   
    
    public Expressao(int typeNode, Type typeExpression, Object left, Object right) {
        this.typeNode = typeNode;
        this.typeExpression = typeExpression;
        this.left = left;
        this.right = right;
    }
    
    public int getTypeNode() {
        return this.typeNode;
    }
    
    public Type getTypeExpression() {
        return this.typeExpression;
    }
}


