/*
 * Tabela de Símbolos
 */
import java.util.HashMap;
import java.util.Map;


public class TabSimbolos {
    public Map<String, TabSimRecord>    records;            // Registro das entradas na tabela de símbolos
    public TabSimbolos                  tabSimPai;          // Tabela de símbolos pai
    
    public TabSimbolos() {
        this.records = new HashMap<String, TabSimRecord>();
        this.tabSimPai = null;
    }
    
    public TabSimbolos(TabSimbolos tabSimPai) {
        this.records = new HashMap<String, TabSimRecord>();
        this.tabSimPai = tabSimPai;
    }

    // Pesquisa um item na tabela de símbolos. Caso ele exista, retorno o registro
    // correspondente. Caso contrário, retorna null.
    public TabSimRecord getRecord(String key) {
        if (this.records.containsKey(key)) 
            return this.records.get(key);
        else
            return null;
    }
    
    // Pesquisa um item na tabela de símbolos. Caso ele exista, retorno o registro
    // correspondente. Caso contrário, retorna null.
    public boolean contains(String key) {
        return this.records.containsKey(key);
    }
    
    public void putRecord(String key, TabSimRecord record) {
        this.records.put(key, record);
    }
    
    public void setTabSimPai(TabSimbolos tabSim) {
        this.tabSimPai = tabSim;
    }
    
    public TabSimbolos getTabSimPai() {
        return this.tabSimPai;
    }
    
    public TabSimRecord find(String key) {
        if (this.records.containsKey(key)) 
            return this.records.get(key);
        else
        if (this.tabSimPai != null)
            return this.tabSimPai.find(key);
        else
            return null;
    }
}
