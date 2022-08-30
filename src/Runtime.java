/*
 * Módulo de Runtime do Algo
 */

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class Runtime {
    // Pilha do sistema
    Stack<Object> stack;

    public Runtime() {
        // Cria a pilha do sistema
        stack = new Stack();
    }
    // Avalia uma expressao
    private Object evaluate(Object value) {
        // É um inteiro, um real, um lógico ou uma string de caracteres
        if (value instanceof Integer ||
            value instanceof Double ||
            value instanceof Boolean ||
            value instanceof String)
            return value;
        else
        // É uma variável
        if (value instanceof TabSimRecord)
            return evaluate(((TabSimRecord)value).value);
        else
        // É a chamada de uma função
        if (value instanceof CallStatement) {
            executaProcedimento((CallStatement)value);
            // Retorna o valor de retorno da função, que está salvo na tabela de símbolos
            return ((CallStatement)value).id.value;
        }
        else
        // É uma expressao
        if (value instanceof Expressao) {
           Expressao exp = (Expressao)value;
           // É um UMINUS
           if (exp.typeNode == Expressao.UMINUS) {
               Object left = evaluate(exp.left); 
               if (left instanceof Integer)
                   return (Integer)((-1) * (Integer)left);
               else
                   return (Double)((-1) * (Double)left); 
           }
           else
           // É uma NÃO
           if (exp.typeNode == Expressao.NAO)
               return !((Boolean)evaluate(exp.left));
           else
           // É um E
           if (exp.typeNode == Expressao.E)
               return (Boolean)evaluate(exp.left) && (Boolean)evaluate(exp.right) ;
           else
           // É um OU
           if (exp.typeNode == Expressao.OU)
               return (Boolean)evaluate(exp.left) || (Boolean)evaluate(exp.right) ;
           else {
               Object left = evaluate(exp.left);
               Object right = evaluate(exp.right);
               // Igualdade
               if (exp.typeNode == Expressao.IGUAL)
                   return (left instanceof Integer ? (Integer)left : (Double)left) == (right instanceof Integer ? (Integer)right : (Double)right);
               else
               // Menor
               if (exp.typeNode == Expressao.MENOR)
                   return (left instanceof Integer ? (Integer)left : (Double)left) < (right instanceof Integer ? (Integer)right : (Double)right);
               else
               // Menor ou igual
               if (exp.typeNode == Expressao.MENOR_IGUAL)
                   return (left instanceof Integer ? (Integer)left : (Double)left) <= (right instanceof Integer ? (Integer)right : (Double)right);
               else
               // Maior
               if (exp.typeNode == Expressao.MAIOR)
                   return (left instanceof Integer ? (Integer)left : (Double)left) > (right instanceof Integer ? (Integer)right : (Double)right);
               else
               // Maior ou igual
               if (exp.typeNode == Expressao.MAIOR_IGUAL)
                   return (left instanceof Integer ? (Integer)left : (Double)left) >= (right instanceof Integer ? (Integer)right : (Double)right);
               else
               // Diferente
               if (exp.typeNode == Expressao.DIFERENTE)
                   return (left instanceof Integer ? (Integer)left : (Double)left) != (right instanceof Integer ? (Integer)right : (Double)right);
               else
               // Se os valores dos operandos saão inteiros, então o resultado será inteiro
               // para as operações de ADIÇÃO, SUBTRAÇÃO e MULTIPLICAÇÂO. 
               // No caso da DIVISÃO o resultado será real
               if (left instanceof Integer && right instanceof Integer) {
                   int v1 = (Integer)left;
                   int v2 = (Integer)right;
                   // Adição Inteira
                   if (exp.typeNode == Expressao.ADICAO)
                      return (Integer)(v1 + v2);
                   else
                   // Subtração Inteira
                   if (exp.typeNode == Expressao.SUBTRACAO)
                      return (Integer)(v1 - v2);
                   else
                   // Multiplicação Inteira
                   if (exp.typeNode == Expressao.MULTIPLICACAO)
                      return (Integer)(v1 * v2);
                   else
                   // Divisão de inteiros resulta em REAL
                   if (exp.typeNode == Expressao.DIVISAO) {
                       double val1 = (Integer)left;
                       double val2 = (Integer)right;
                       return val1 / val2;
                   }
               }
               // O resultado será real
               else {    
                   double v1 = left instanceof Integer ? (Integer)left : (Double)left;
                   double v2 = right instanceof Integer ? (Integer)right : (Double)right;
                   // Adição 
                   if (exp.typeNode == Expressao.ADICAO)
                      return v1 + v2;
                   else
                   // Subtração
                   if (exp.typeNode == Expressao.SUBTRACAO)
                      return v1 - v2;
                   else
                   // Multiplicação
                   if (exp.typeNode == Expressao.MULTIPLICACAO)
                      return v1 * v2;
                   else
                   // Divisão
                   if (exp.typeNode == Expressao.DIVISAO)
                      return v1 / v2;
               }                  
           }
        }
        return null;
    }

    // Executa o código de um procedimento ou função
    private void executaProcedimento(CallStatement instrucao) {
        // Salva todas as variáveis e parâmetros do procedimento/função
        // protegendo o ambiente de execução no caso de chamadas recursivas.
        // Para isso, itera em todos os registros da tabela de símbolos do procedimento/função
        // e salva todas as variáveis e parâmetros
        ArrayList<Object> savedValues = new ArrayList<>();
        for (var entry : ((CallStatement)instrucao).id.tabSimbolos.records.entrySet()) {
            if(((TabSimRecord)entry.getValue()).category == TabSimRecord.VARIAVEL ||
               ((TabSimRecord)entry.getValue()).category == TabSimRecord.PARAMETRO) {
               savedValues.add(((TabSimRecord)entry.getValue()).value);
            }
        }
        // Parâmetros declarados no procedimento/função
        ArrayList<TabSimRecord> listParameters = ((CallStatement)instrucao).id.listParameters;
        // Atribui os conteúdos dos argumentos da chamada do procedimento/função aos parâmetros declarados
        ArrayList<Object> listArgs = ((CallStatement)instrucao).listArgs;
        for(int i = 0; i < listParameters.size(); i++) 
            listParameters.get(i).value = evaluate(listArgs.get(i));
        // Executa o procedimento ou função
        run(((TabSimRecord)((CallStatement)instrucao).id).code);
        // Itera os registros da tabela de símbolos do procedimento/função restaurando os valores
        // salvos, desde que sejam variáveis ou parâmetros, pois foram salvos anteriormente em savedValues
        int index = 0;
        for (var entry : ((CallStatement)instrucao).id.tabSimbolos.records.entrySet()) {
            if(((TabSimRecord)entry.getValue()).category == TabSimRecord.VARIAVEL ||
               ((TabSimRecord)entry.getValue()).category == TabSimRecord.PARAMETRO) {
               ((TabSimRecord)entry.getValue()).value = savedValues.get(index);
               index++;
            }
        }
    }
    
    // Executa o código contido no ArrayList statements, o qual é gerado por AlgoParser
    public void run(ArrayList<Object> statements) 
 //   throws Exception
    {
        // O ArrayList está vazio, ou seja, não há instruções a serem executadas
        if (statements == null) return;

        // Instruction pointer
        int ip = 0;
        
        // Ciclo de busca e execução
        while (ip != statements.size()) {
            // Qual é a instrução?
            Object instrucao = statements.get(ip);
            // A instrução é um LEIA()
            if (instrucao instanceof LeiaStatement) {
                // Lê o conteúdo de cada variável contida na lista de variáveis
                for (int i = 0; i < ((LeiaStatement)instrucao).listId.size(); i++) {
                    // Pega a identificação da variável
                    TabSimRecord variavel = ((LeiaStatement)instrucao).listId.get(i);
                    // Valores iniciais para a entrada de dados
                    String strValue = "";
                    if (variavel.getType() == Type.INTEIRO)
                        strValue = "0";
                    else
                    if (variavel.getType() == Type.REAL)
                        strValue = "0.0";
                    else
                    if (variavel.getType() == Type.LOGICO)
                        strValue = "verdadeiro";
                    else
                    if (variavel.getType() == Type.CARACTER)
                        strValue = "CARACTERE";
  
                    // Exige que os valores informados sejam consistentes com o tipo
                    while (true) {

                        // Entrada de dados.
                        String text = JOptionPane.showInputDialog("Entre com o conteúdo para " + variavel.name, strValue);                

                        try {
                            if (variavel.getType() == Type.INTEIRO)
                                variavel.value = Integer.parseInt(text);
                            else
                            if (variavel.getType() == Type.REAL)
                                variavel.value = Double.parseDouble(text);
                            else
                            if (variavel.getType() == Type.LOGICO)
                                if (text.toLowerCase().equals("verdadeiro"))
                                    variavel.value = true;
                                else
                                if (text.toLowerCase().equals("falso"))
                                    variavel.value = false;
                                else
                                    throw new Exception();
                            else
                                variavel.value = text;
                            break;
                        }    
                        catch (Exception e) {
                            JOptionPane.showMessageDialog(FormPrincipal.getFrames()[0],"O valor informado para " + variavel.name + " é inválido! O valor deve ser do tipo " + variavel.getType().name() + ". Reentre com o valor.");
                        }
                    }
                }
            }
            else
            if (instrucao instanceof EscrevaStatement) {
                String msg = null;
                for(int i = 0; i < ((EscrevaStatement)instrucao).listExpresao.size(); i++) {
                    Object value = evaluate(((EscrevaStatement)instrucao).listExpresao.get(i));
                    // Verifica se é verdadeiro ou falso
                    // Lembre-se, verdadeiro está armazenado como true e falso como false
                    if (value instanceof Boolean) {
                        if ((Boolean)value)
                            value = "verdadeiro";
                        else
                            value = "falso";
                    }

                    if (msg == null)
                        msg = value.toString();
                    else
                        msg = msg + value;
                }
                JOptionPane.showMessageDialog(FormPrincipal.getFrames()[0], msg);
            }
            else
            if (instrucao instanceof ParaStatement) {
            
            }
            else
            if (instrucao instanceof RepitaStatement) {
            
            }
            else
            if (instrucao instanceof EnquantoStatement) {
               while (((Boolean)evaluate(((EnquantoStatement)instrucao).expressao))) {
                   run(((EnquantoStatement)instrucao).statements);
               }
            }
            else
            if (instrucao instanceof SeStatement) {
               if ((Boolean)evaluate(((SeStatement)instrucao).expressao))
                  run(((SeStatement)instrucao).thenStatments);
               else
                  run(((SeStatement)instrucao).elseStatments);                   
            }
            else
            if (instrucao instanceof AtribuicaoStatement) {
                Object value = evaluate(((AtribuicaoStatement)instrucao).expressao);
                // Se a variável é REAL e o valor de retorno é INTEIRO, então converte para REAL
                if (((AtribuicaoStatement)instrucao).id.getType() == Type.REAL && value instanceof Integer) {
                    double v = (Integer)value;
                    ((AtribuicaoStatement)instrucao).id.value = v;
                }
                else
                // Se a variável é INTEIRO e o valor de retorno é REAL, então converte para INTEIRO, 
                // truncando a parte decimal
                if (((AtribuicaoStatement)instrucao).id.getType() == Type.INTEIRO && value instanceof Double) {
                    Double v = (Double)value;
                    Integer i = v.intValue();
                    ((AtribuicaoStatement)instrucao).id.value = i;
                }
                else
                    ((AtribuicaoStatement)instrucao).id.value = value;
            }
            else
            // Chamada de procedimento
            if (instrucao instanceof CallStatement) {
                executaProcedimento((CallStatement)instrucao);
            }
            // Incrementa o instruction pointer para apontar para a próxima instrução
            ip++;
        }
    }
    
}
