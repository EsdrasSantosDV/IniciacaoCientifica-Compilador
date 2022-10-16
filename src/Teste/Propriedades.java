/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Teste;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import javax.swing.DefaultListModel;
import javax.swing.border.Border;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author Pichau
 */
public class Propriedades extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    RSyntaxTextArea textArea = new RSyntaxTextArea(20,60);
    DefaultListModel DLM = new DefaultListModel();
    public Propriedades() {
        initComponents();
        LISTAPRINCIPAL.setModel(DLM);
        
        
        DLM.addElement("COMENTARIO MULTILINHA");
        DLM.addElement("STRING");
        DLM.addElement("SEPARADOR");
        DLM.addElement("LOGICO");
        DLM.addElement("IDENTIFICADOR");
        DLM.addElement("OPERADOR");
        DLM.addElement("FUNCAO");
        DLM.addElement("TIPOS DE DADOS");
        ChangeFontBox.removeAllItems();
        ChangeFontBox.addItem("VERDANA"); 
        ChangeFontBox.addItem("SERIF"); 
        ChangeFontBox.addItem("MONOSPACED");

        
        SizeBox.removeAllItems();
        SizeBox.addItem("14");
        SizeBox.addItem("18");
        SizeBox.addItem("24");

        RSyntax();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exampletext = new javax.swing.JPanel();
        CancelarPropriedades = new javax.swing.JButton();
        Negrito = new javax.swing.JCheckBox();
        AplicarPropriedades1 = new javax.swing.JButton();
        Sublinhado = new javax.swing.JCheckBox();
        Itálico = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        LISTAPRINCIPAL = new javax.swing.JList<>();
        LabelSize = new javax.swing.JLabel();
        LabelFont1 = new javax.swing.JLabel();
        SizeBox = new javax.swing.JComboBox<>();
        ChangeFontBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Exampletext.setLayout(new java.awt.CardLayout());

        CancelarPropriedades.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CancelarPropriedades.setText("Cancelar");

        Negrito.setText("Negrito");

        AplicarPropriedades1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AplicarPropriedades1.setText("Aplicar");

        Sublinhado.setText("Sublinhado");
        Sublinhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SublinhadoActionPerformed(evt);
            }
        });

        Itálico.setText("Itálico");

        LISTAPRINCIPAL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LISTAPRINCIPAL.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LISTAPRINCIPAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LISTAPRINCIPALMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(LISTAPRINCIPAL);

        LabelSize.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelSize.setText("Size");

        LabelFont1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelFont1.setText("Change Font");

        SizeBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SizeBoxItemStateChanged(evt);
            }
        });

        ChangeFontBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ChangeFontBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Exampletext, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Itálico)
                                    .addComponent(Sublinhado)
                                    .addComponent(Negrito)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(LabelFont1)
                                .addGap(18, 18, 18)
                                .addComponent(ChangeFontBox, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelSize)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(AplicarPropriedades1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(CancelarPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFont1)
                            .addComponent(ChangeFontBox, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(LabelSize, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SizeBox)
                                .addGap(68, 68, 68)))
                        .addComponent(Negrito)
                        .addGap(18, 18, 18)
                        .addComponent(Itálico)
                        .addGap(18, 18, 18)
                        .addComponent(Sublinhado)))
                .addGap(44, 44, 44)
                .addComponent(Exampletext, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AplicarPropriedades1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SublinhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SublinhadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SublinhadoActionPerformed

    private void LISTAPRINCIPALMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LISTAPRINCIPALMouseClicked
     String selecionado = LISTAPRINCIPAL.getSelectedValue(); 
        System.out.println(""+selecionado);// TODO add your handling code here:
    }//GEN-LAST:event_LISTAPRINCIPALMouseClicked

    private void ChangeFontBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ChangeFontBoxItemStateChanged
         if (evt.getStateChange() == ItemEvent.SELECTED) {
              String opcao = ChangeFontBox.getSelectedItem().toString();
               int tamanho=14;
                if(SizeBox.getSelectedItem()!=null)
                {
                      System.out.println(""+SizeBox.getSelectedItem().toString());
                      tamanho=Integer.parseInt(SizeBox.getSelectedItem().toString());
                }
              
                if (opcao.equals("VERDANA") == true) {
                    
                     textArea.setFont(new Font("Verdana",Font.PLAIN,tamanho));
                }
                if (opcao.equals("SERIF") == true) {
                    
                    textArea.setFont(new Font("Serif",Font.PLAIN,tamanho));
                }
                if (opcao.equals("MONOSPACED") == true) {
                    
                    textArea.setFont(new Font("Monospaced",Font.PLAIN,tamanho));
                }
                
                
              
         }
    }//GEN-LAST:event_ChangeFontBoxItemStateChanged

    private void SizeBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SizeBoxItemStateChanged
       if (evt.getStateChange() == ItemEvent.SELECTED) {
              String opcao = SizeBox.getSelectedItem().toString();
               String fonte="Verdana";
                if(ChangeFontBox.getSelectedItem()!=null)
                {
                      System.out.println(""+ChangeFontBox.getSelectedItem().toString());
                      fonte=SizeBox.getSelectedItem().toString();
                }
              
                if (opcao.equals("14") == true) {
                    
                     textArea.setFont(new Font(fonte,Font.PLAIN,14));
                }
                if (opcao.equals("18") == true) {
                    
                    textArea.setFont(new Font(fonte,Font.PLAIN,18));
                }
                if (opcao.equals("24") == true) {
                    
                    textArea.setFont(new Font(fonte,Font.PLAIN,24));
                }
                
                
              
         }
    }//GEN-LAST:event_SizeBoxItemStateChanged

    public void RSyntax()
    {
        
        textArea.setFont(new Font("Verdana",Font.PLAIN,14));
        
        //SYNTAX STYLE JAVA SE FOR UMA LINGUAGEM JA DEFINIDA
        //textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        
        //PARA UMA LINGUAGEM PROPRIA COMO A NOSSA
        try{
            AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory)TokenMakerFactory.getDefaultInstance();
            //nome da linguagem e O SEgundo parametro e o pacote das suas cores
            atmf.putMapping("text/myLanguage", "Cores.Cor");
            textArea.setSyntaxEditingStyle("text/myLanguage");
        }
        catch(Exception e)
        {
            
        }
        RTextScrollPane sp = new RTextScrollPane(textArea);
        sp.getGutter().setLineNumberColor(Color.RED);
        sp.getGutter().setLineNumberFont(new Font("Monospaced",Font.BOLD,18));
        sp.getGutter().setBorderColor(Color.yellow);
        Exampletext.add(sp);
        
        //MUDAR A COR
      
        SyntaxScheme esquema=textArea.getSyntaxScheme();
        //MUDAR O TEMA DE UM CERTO AGRUPAMENTO
        esquema.getStyle(Token.RESERVED_WORD).foreground=Color.BLACK;
        
        //COMENTARIO MULTILINHA /*
        esquema.getStyle(Token.COMMENT_MULTILINE).foreground=Color.decode("#A10CCC");
      
        //ESCREVA LEIA
        esquema.getStyle(Token.FUNCTION).foreground=Color.BLUE;
        //TODOS OS OPERADORES
        esquema.getStyle(Token.OPERATOR).foreground=Color.PINK;
        
        //variaveis
        esquema.getStyle(Token.DATA_TYPE).foreground=Color.YELLOW;
        //SERIA OS LOGICOS
        esquema.getStyle(Token.RESERVED_WORD_2).foreground=Color.CYAN;
        //IDENTIFICADORES ,VARIAVEIS FUNCOES
        esquema.getStyle(Token.IDENTIFIER).foreground=Color.red;
       //seria os barras
        esquema.getStyle(Token.SEPARATOR).foreground=Color.GRAY;
        
        //COR DO TEXTO
        esquema.getStyle(Token.LITERAL_STRING_DOUBLE_QUOTE).foreground=Color.GREEN;
        
         
        textArea.setText("/*\n" +
"   Algoritmo de exemplo para teste de compilação\n" +
"*/\n" +
"algoritmo \"exemplo\"\n" +
"var\n" +
"	x, y, z : inteiro\n" +
"	w :	real\n" +
"	\n" +
"	funcao f(a, b : inteiro; c : real) : real  // Função f()\n" +
"	inicio\n" +
"	   f <- a * b * c\n" +
"	fimfuncao\n" +
"{ Comentário estilo Pascal\n" +
"  ------------------------\n" +
"}\n" +
"  \n" +
"inicio\n" +
"	escreva(\"Olá mundo!\")\n" +
"	leia(x, y, z)\n" +
"	para x de 10 ate 1 passo 1 decrescente faca\n" +
"	   leia(x, y)\n" +
"	   escreval(x, y)\n" +
"	fimpara\n" +
"	repita\n" +
"	   escreva(x)\n" +
"	   leia(x)\n" +
"	   para x de 10 ate 1 passo 2 decrescente faca\n" +
"	      escreva(\"X: \", x)\n" +
"	   fimpara\n" +
"	ate x > 10\n" +
"	x <- 1\n" +
"	enquanto x < 10 faca\n" +
"	   x <- x + 1\n" +
"	fimenquanto\n" +
"	se x > 10 entao\n" +
"	   escreva(\"X > 10\")\n" +
"	senao\n" +
"	   escreva(\"X <= 10\")\n" +
"	fimse\n" +
"	x <- 10\n" +
"	escreva(\"Resultado para f(\", x, \", \", y, \", \",z, \"): \", f(x,y,z))\n" +
"fimalgoritmo");
        
        //VALIDAR O TEXT AREA
        textArea.revalidate();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Propriedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Propriedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Propriedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Propriedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Propriedades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AplicarPropriedades1;
    private javax.swing.JButton CancelarPropriedades;
    private javax.swing.JComboBox<String> ChangeFontBox;
    private javax.swing.JPanel Exampletext;
    private javax.swing.JCheckBox Itálico;
    private javax.swing.JList<String> LISTAPRINCIPAL;
    private javax.swing.JLabel LabelFont1;
    private javax.swing.JLabel LabelSize;
    private javax.swing.JCheckBox Negrito;
    private javax.swing.JComboBox<String> SizeBox;
    private javax.swing.JCheckBox Sublinhado;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
