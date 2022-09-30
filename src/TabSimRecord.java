/*
 * Registro de entrada na tabela de símbolos
 */
import java.util.ArrayList;


public class TabSimRecord {
    // Nada
    public static final int NONE            = -1;   // Nada
    // Categorias do identificador
    public static final int ALGORITMO       = 0;    // O identificador é o nome do algoritmo
    public static final int VARIAVEL        = 1;    // O identificador é uma variável
    public static final int PARAMETRO       = 2;    // O identificador é um parâmetro
    public static final int PROCEDIMENTO    = 3;    // O identificador é um procedimento
    public static final int FUNCAO          = 4;    // O identificador é uma função
    
    public String                   name;           // Nome do identificador
    public int                      category;       // Categoria do identificador
    public Type                     type;           // Tipo de dados do identificador
    public int                      offset;         // Deslocamento da variável na memória
    // O campo value armazena o valor do identificador
    public Object                   value;          // Valor armazenado no identificador
    public TabSimbolos              tabSimbolos;    // Tabela de símbolos do procedimento ou função
    public ArrayList<TabSimRecord>  listParameters; // Lista de parâmetros do procedimento ou função
    public String                   label;          // Rótulo de identificação do procedimento ou função
    public ArrayList<Object>        code;           // Lista de instruções do procedimento/função
            
    public TabSimRecord() {
        this.name = null;
        this.category = NONE;
        this.type = Type.NONE;
        this.offset = -1;
        this.value = null; 
        this.tabSimbolos = null;
        this.listParameters = new ArrayList<>();
        this.label = null;
    }
    
    public TabSimRecord(String name) {
        this.name = name;
        this.category = NONE;
        this.type = Type.NONE;
        this.offset = -1;
        this.value = null;
        this.tabSimbolos = null;
        this.listParameters = new ArrayList<>();
        this.label = null;
    }

    public TabSimRecord(String name, int category) {
        this.name = name;
        this.category = category;
        this.type = Type.NONE;
        this.offset = -1;
        this.value = null;
        this.tabSimbolos = null;
        this.listParameters = new ArrayList<>();
        this.label = null;
    }

    public TabSimRecord(String name, int category, Type type) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.offset = -1;
        this.value = null;
        this.tabSimbolos = null;
        this.listParameters = new ArrayList<>();
        this.label = null;
    }

    public TabSimRecord(String name, int category, Type type, int offset) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.offset = offset;
        this.value = null;
        this.tabSimbolos = null;
        this.listParameters = new ArrayList<>();
        this.label = null;
    }

    public TabSimRecord(String name, int category, Type type, int offset, Object value) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.offset = offset;
        this.offset = -1;
        this.value = value;
        this.tabSimbolos = null;
        this.listParameters = new ArrayList<>();
        this.label = null;
    }

    public TabSimRecord(String name, int category, Type type, int offset, Object value, TabSimbolos tabSim) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.offset = offset;
        this.value = value;
        this.tabSimbolos = tabSim;
        this.listParameters = listParameters;
        this.label = null;
    }

    public TabSimRecord(String name, int category, Type type, int offset, Object value, TabSimbolos tabSim, ArrayList listParameters) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.offset = offset;
        this.value = value;
        this.tabSimbolos = tabSim;
        this.listParameters = listParameters;
        this.label = null;
    }

    public TabSimRecord(String name, int category, Type type, int offset, Object value, TabSimbolos tabSim, ArrayList listParameters, String label) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.offset = offset;
        this.value = value;
        this.tabSimbolos = tabSim;
        this.listParameters = listParameters;
        this.label = label;
    }
	
    // Retorna o nome do identificador 
    public String getName() {
	return this.name;
    }

    // Atualiza o tipo de dados 
    public void setType(Type type) {
	this.type = type;
    }
	
    // Retorna o tipo de dados
    public Type getType() {
	return this.type;
    }

    // Atualiza o offset 
    public void setOffset(int offset) {
	this.offset = offset;
    }
	
    // Retorna o offset
    public int getOffset() {
	return this.offset;
    }

    // Atualiza a tabela de símbolos 
    public void setTabSimbolos(TabSimbolos tabSimbolos) {
	this.tabSimbolos = tabSimbolos;
    }
	
    // Retorna a tabela de símbolos
    public TabSimbolos getTabSimbolos() {
	return this.tabSimbolos;
    }
}
