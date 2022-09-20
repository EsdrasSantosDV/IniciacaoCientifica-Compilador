

/*
  Console Simulator.
  
  Disponível em: https://stackoverflow.com/questions/7704405/how-do-i-make-my-java-application-open-a-console-terminal-window
  Acesso em: 01/09/2022
*/

import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.text.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;
import swingExamples.NonModalDialogs;

class InitComponents {

	///////////////////////
	// Se a variável closeWindow for setada para true, então a thread do Runtime() deverá ser finalizada.
	///////////////////////
    public static boolean closeWindow = false;
	
    public static JFrame setupJFrameAndGet(String title, int width, int height) {
        JFrame tmpJF = new JFrame(title);
        tmpJF.setSize(width, height);
        tmpJF.setLocationRelativeTo(null);
        tmpJF.setLayout(null);
        tmpJF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tmpJF.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				closeWindow = true;
			}
			public void windowClosing(WindowEvent e) {
				closeWindow = true;
			}
		});
        return tmpJF;
    } // end of setupJFrameAndGet

    public static JTextArea setupJTextAreaAndGet(String text, int rows, int columns, boolean setEditableFlag, boolean setLineWrapFlag, boolean setWrapStyleWordFlag, boolean setBoundsFlag, int xpos, int ypos, int width, int height) {
        JTextArea tmpJTA = new JTextArea(text, rows, columns);
        tmpJTA.setEditable(setEditableFlag);
        tmpJTA.setLineWrap(setLineWrapFlag);
        tmpJTA.setWrapStyleWord(setWrapStyleWordFlag);
        if (setBoundsFlag == true) {
            tmpJTA.setBounds(xpos, ypos, width, height);
        }
        return tmpJTA;
    } // end of setupJTextAreaAndGet

    public static JScrollPane setupScrollableJTextAreaAndGet(JTextArea jta, int xpos, int ypos, int width, int height) {
        JScrollPane tmpJSP = new JScrollPane(jta);
        tmpJSP.setBounds(xpos, ypos, width, height);
        return tmpJSP;
    } // end of setupScrollableJTextAreaAndGet

    public static JMenuBar setupJMenuBarAndGet() {
        JMenuBar tmpJMB = new JMenuBar();
        return tmpJMB;
    } // end of setupJMenuBarAndGet

    public static JMenu setupJMenuAndGet(String text) {
        JMenu tmpJM = new JMenu(text);
        return tmpJM;
    } // end of setupJMenuAndGet

    public static JMenuItem setupJMenuItemAndGet(String text) {
        JMenuItem tmpJMI = new JMenuItem(text);
        return tmpJMI;
    } // end of setupJMenuItemAndGet

}// end of InitComponents

public class Runtime implements KeyListener, ActionListener {
 // Pilha do sistema
    Stack<Object> stack; 
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;

    String title = null;
    String text = null;

    JFrame jf = null;
    JTextArea jta = null;
    JScrollPane jsp = null;
    JMenuBar jmb = null;
    JMenu jm = null;
    JMenuItem jmi = null;

    int initialCaretPosition = 0;
    int currentCaretPosition = 0;
    boolean inputAvailable = false;

    // key codes
    int BACKSPACE = 8;
    int ENTER = 10;
    int PG_UP = 33; // do nothing for this key pressed
    int PG_DN = 34; // do nothing for this key pressed
    int END = 35;
    int HOME = 36;
    int LEFT_ARROW = 37;
    int UP_ARROW = 38; // do nothing for this key pressed
    //int RIGHT_ARROW = 39; // handled by JTextArea
    int DOWN_ARROW = 40; // do nothing for this key pressed

    int CTRL = 128;
    int A = 65; // disable ctrl-a
    int H = 72; // handle ctrl-h
    //int DELETE = 127; // handled by JTextArea
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
        begin(((TabSimRecord)((CallStatement)instrucao).id).code);
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

    public void actionPerformed(ActionEvent ae) {
        int cCurrPos = jta.getCaretPosition();
        jta.selectAll();
        jta.copy();
        jta.select(cCurrPos, cCurrPos);
    } // end of actionPerformed

    public void keyTyped(KeyEvent ke) {
    } // end of keyTyped

    public void keyReleased(KeyEvent ke) {
    } // end of keyReleased

    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        if ((keyCode == PG_UP) || (keyCode == PG_DN) || (keyCode == UP_ARROW) || (keyCode == DOWN_ARROW) || ((keyCode == A) && (ke.getModifiersEx() == CTRL))) {
            ke.consume();
        } else if ((keyCode == LEFT_ARROW) || (keyCode == BACKSPACE) || ((keyCode == H) && (ke.getModifiersEx() == CTRL))) {
            synchronized(this) {
                if (jta.getCaretPosition() <= initialCaretPosition) {
                    ke.consume();
                }
            } // end of synchronized block
        } else if (keyCode == HOME) {
            synchronized(this) {
                jta.setCaretPosition(initialCaretPosition);
                ke.consume();
            } // end of synchronized block
        } else if (keyCode == END) {
            synchronized(this) {
                jta.setCaretPosition(jta.getDocument().getLength());
                ke.consume();
            } // end of synchronized block
        } else if (keyCode == ENTER) {
            jta.setCaretPosition(jta.getDocument().getLength());
            synchronized(this) {
                currentCaretPosition = jta.getCaretPosition();

                // If character at initial caret position is newline then it means that the user has
                // pressed enter without enetring any other character. Also, the code gets called here
                // as soon as enter is pressed which means that the caret position (jta.getCaretPosition())
                // of the document will be incremented by 1 by the system after this code returns.
                // This means that if at initial caret position, the character is newline, then we must ignore
                // this enter and increment initial caret position by 1 and do not set inputAvailable to true.
                try {
                    String charAtInitialCaretPosition = jta.getText(initialCaretPosition, 1);
                    if ((charAtInitialCaretPosition.equals("\n")) == true) {
                        initialCaretPosition++;
                    }
                } catch (Exception e) {
                }
                /*
                debug: start
                try {
                    System.out.println("keyPressed (1): initial = " + initialCaretPosition + ", current = " + currentCaretPosition + ", System current = " + jta.getDocument().getLength());
                    String initialString = jta.getText(initialCaretPosition, 1);
                    String currentString = jta.getText(currentCaretPosition, 1);
                    System.out.println("char at initial = " + initialString + ", char at current = " + currentString);
                    if ((initialString.equals("\n")) == true) {
                        System.out.println("char at initial is newline");
                    }
                    if ((currentString.equals("\n")) == true) {
                        System.out.println("char at current is newline");
                    }
                } catch (Exception e) {
                }
                debug:end
                */

                if ((currentCaretPosition - initialCaretPosition) > 0) {
                    inputAvailable = true;
                    notifyAll();
                }
            } // end of synchronized block
        } // end of if else if
    } // end of keyPressed

    String getInputFromJTextArea(JTextArea jta) {
        int len = 0;
        String inputFromUser = "";
        while (true) {
            synchronized(this) {
                if (inputAvailable == true) {
                    len = currentCaretPosition - initialCaretPosition;

                    try {
                        inputFromUser = jta.getText(initialCaretPosition, len);
                        initialCaretPosition = currentCaretPosition;
                    } catch (Exception e) {
                        inputFromUser = "";
                        return inputFromUser;
                    } // end of outer try catch

              
                    inputAvailable = false;
                    return inputFromUser;
                } else {
                    try {
                        wait();
                        continue;
                    } catch (Exception e) {
                    } // end of try catch
                } // end of if else inputAvailable
            } // end of synchronized block
        } // end of while true
    } // end of getInoutFromJtextArea

    void outputToJTextArea(JTextArea jta, String text) {
        jta.append(text);
        jta.setCaretPosition(jta.getDocument().getLength());
        synchronized(this) {
            initialCaretPosition = jta.getCaretPosition();
        }
    } // end of outputToJTextArea

    void begin(ArrayList<Object> statements) {
        System.out.println("ESTOU AQUI");
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
               //JOptionPane.showMessageDialog(FormPrincipal.getFrames()[0], msg);
                outputToJTextArea(jta, msg);
               
            
    
            }
            else
            if (instrucao instanceof ParaStatement) {
              //CASO INTEIRO
                if(((ParaStatement) instrucao).variavel.getType()==Type.INTEIRO )
                {
                    
                    //  Se descrecente = true, a variável é decrementada, senão ela é incrementada
                    if(((ParaStatement) instrucao).decrescente==true)
                    {
                        //((ParaStatement) instrucao).variavel=(TabSimRecord) ((ParaStatement) instrucao).inicial;
                         Object value = evaluate(((ParaStatement)instrucao).inicial);
                         ((ParaStatement) instrucao).variavel.value=value;
                         
                       System.out.println("VALOR DA VARIAVEL D"+ ((ParaStatement) instrucao).ate);
                       
                       
                      //  System.out.println(""+(int)((ParaStatement) instrucao).variavel.value);
                       // System.out.println(""+(int)((ParaStatement)instrucao).ate.hashCode());
                       while((int)((ParaStatement) instrucao).variavel.value>=(int)((ParaStatement)instrucao).ate)
                       {
                           System.out.println("TESTE");
                           begin(((ParaStatement)instrucao).statements);
                           
                           System.out.println(""+((ParaStatement) instrucao).variavel.value);
                           ((ParaStatement) instrucao).variavel.value=(int)((ParaStatement) instrucao).variavel.value-(int)((ParaStatement) instrucao).passo;
                       }
                            
                       
                    }
                    else
                    {
                          //((ParaStatement) instrucao).variavel=(TabSimRecord) ((ParaStatement) instrucao).inicial;
                         Object value = evaluate(((ParaStatement)instrucao).inicial);
                         ((ParaStatement) instrucao).variavel.value=value;
                         
                       System.out.println("VALOR DA VARIAVEL C"+ ((ParaStatement) instrucao).ate);
                       
                       
                       
                       while((int)((ParaStatement) instrucao).variavel.value<=(int)((ParaStatement)instrucao).ate)
                       {
                           
                           begin(((ParaStatement)instrucao).statements);
                           
                           System.out.println(""+((ParaStatement) instrucao).variavel.value);
                           ((ParaStatement) instrucao).variavel.value=(int)((ParaStatement) instrucao).variavel.value+(int)((ParaStatement) instrucao).passo;
                       }
                    }
                        
                }
                else
                {
                    //REAL SO PEGAR A PARTE REAL
                      //  Se descrecente = true, a variável é decrementada, senão ela é incrementada
                    if(((ParaStatement) instrucao).decrescente==true)
                    {
                        //((ParaStatement) instrucao).variavel=(TabSimRecord) ((ParaStatement) instrucao).inicial;
                         Object value = evaluate(((ParaStatement)instrucao).inicial);
                         ((ParaStatement) instrucao).variavel.value=value;
                         
                       System.out.println("VALOR DA VARIAVEL D"+ ((ParaStatement) instrucao).ate);
                       
                       
                      //  System.out.println(""+(int)((ParaStatement) instrucao).variavel.value);
                       // System.out.println(""+(int)((ParaStatement)instrucao).ate.hashCode());
                       while((float)((ParaStatement) instrucao).variavel.value>=(float)((ParaStatement)instrucao).ate)
                       {
                           System.out.println("TESTE");
                           begin(((ParaStatement)instrucao).statements);
                           
                           System.out.println(""+((ParaStatement) instrucao).variavel.value);
                           ((ParaStatement) instrucao).variavel.value=(float)((ParaStatement) instrucao).variavel.value-(float)((ParaStatement) instrucao).passo;
                       }
                            
                       
                    }
                    else
                    {
                          //((ParaStatement) instrucao).variavel=(TabSimRecord) ((ParaStatement) instrucao).inicial;
                         Object value = evaluate(((ParaStatement)instrucao).inicial);
                         ((ParaStatement) instrucao).variavel.value=value;
                         
                       System.out.println("VALOR DA VARIAVEL C"+ ((ParaStatement) instrucao).ate);
                       
                 
                       
                       while((float)((ParaStatement) instrucao).variavel.value<=(float)((ParaStatement)instrucao).ate)
                       {
                           
                           begin(((ParaStatement)instrucao).statements);
                           
                           System.out.println(""+((ParaStatement) instrucao).variavel.value);
                           ((ParaStatement) instrucao).variavel.value=(float)((ParaStatement) instrucao).variavel.value+(float)((ParaStatement) instrucao).passo;
                       }
                    }
                    
                }
            }
            else
            if (instrucao instanceof RepitaStatement) {
                begin(((RepitaStatement)instrucao).statements);
                    while (!((Boolean)evaluate(((RepitaStatement)instrucao).expressao))) {
                       begin(((RepitaStatement)instrucao).statements);
                    }
                }
            else
            if (instrucao instanceof EnquantoStatement) {
               while (((Boolean)evaluate(((EnquantoStatement)instrucao).expressao))) {
                   begin(((EnquantoStatement)instrucao).statements);
               }
            }
            else
            if (instrucao instanceof SeStatement) {
               if ((Boolean)evaluate(((SeStatement)instrucao).expressao))
                  begin(((SeStatement)instrucao).thenStatments);
               else
                  begin(((SeStatement)instrucao).elseStatments);                   
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
    } // end of begin

    void configureJTextAreaForInputOutput(JTextArea jta) {
        jta.addKeyListener(this);

        // remove all mouse listeners
        for (MouseListener listener : jta.getMouseListeners()) {
            //outputToJTextArea(jta, "\nRemoving mouse listener\n");
            jta.removeMouseListener(listener);
        }

        // remove all mouse motion listeners
        for (MouseMotionListener listener : jta.getMouseMotionListeners()) {
            //outputToJTextArea(jta, "\nRemoving mouse motion listener\n");
            jta.removeMouseMotionListener(listener);
        }

        // remove all mouse wheel listeners
        for (MouseWheelListener listener : jta.getMouseWheelListeners()) {
            //outputToJTextArea(jta, "\nRemoving mouse wheel listener\n");
            jta.removeMouseWheelListener(listener);
        }
    } // end of configureJTextAreaForInputOutput

    void createAndShowGUI() {
        title = "Console";
        jf = InitComponents.setupJFrameAndGet(title, screenWidth - 150, screenHeight - 100);

        jta = InitComponents.setupJTextAreaAndGet("", 1000, 100, true, true, true, false, 0, 0, 0, 0);
        configureJTextAreaForInputOutput(jta);
        System.out.println("entrei");
        jsp = InitComponents.setupScrollableJTextAreaAndGet(jta, 10, 10, screenWidth - 180, screenHeight - 180);
        jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jf.add(jsp);
        //jf.setLocation(screenWidth / 5, screenHeight / 6);

        jmb = InitComponents.setupJMenuBarAndGet();
        jm = InitComponents.setupJMenuAndGet("Copy All to Clipboard");
        jm.setBorder(BorderFactory.createLineBorder(Color.green, 2));
        jmi = InitComponents.setupJMenuItemAndGet("Copy All to Clipboard");
        jm.add(jmi);
        jmb.add(jm);
        jmi.addActionListener(this);
        jf.setJMenuBar(jmb);

        jf.setVisible(true);
    } // end of createAndShowGUI

    public void run (ArrayList<Object> statements) {
        System.out.println("estou aqui");
        Runtime cfjp = new Runtime();
        cfjp.createAndShowGUI();
       
        cfjp.begin(statements);
    } // end of main

} // end of ConsoleForJARPrograms