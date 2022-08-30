
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.JDialog;
import java.awt.FlowLayout; 
import javax.swing.JScrollPane;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileReader;
import java.io.File;
import java.io.Writer;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roger
 */
public class FormPrincipal extends javax.swing.JFrame {
    final JFileChooser fileChooser = new JFileChooser();

    //public static FormPrincipal formPrincipal;
    
    
    private File fileToCompile = null;  // Arquivo em edição
    private boolean isModified = false; // Sinaliza se o arquivo em edição foi modificado 
    
    private DefaultTableModel modelo;
    private RTextScrollPane spFonte;
    private RTextScrollPane spAssembly;
    private RTextScrollPane spMensagem;
    private RSyntaxTextArea txtFonte;
    public static RSyntaxTextArea txtMensagem;
    
    private DefaultTableModel modeloMensagens = null;

    private static final int FONT_STYLE = Font.PLAIN;
    private static final int FONT_SIZE = 12;
    private static final String DEFAULT_FONT = "Wingdings";
    
    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);        
        
        txtFonte = new RSyntaxTextArea(20,60);
        txtFonte.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_DELPHI);
        txtFonte.setCodeFoldingEnabled(true);
        
        
/*        
        BufferedReader r;
  try {
    r = new BufferedReader(new FileReader("./exemplo.algo"));
    txtFonte.read(r, null);
    r.close();
    txtFonte.setCaretPosition(0);
    txtFonte.discardAllEdits();
    isModified = false;
  } catch (RuntimeException re) {
    throw re; // FindBugs
  } catch (Exception e) { // Never happens
    txtFonte.setText("Type here to see syntax highlighting");
  }
*/        
        
//  txtFonte.write(out);
  
        spFonte = new RTextScrollPane(txtFonte);
        spFonte.setName("Programa Fonte");
        jPainel.add(spFonte, 0);
        
        txtMensagem = new RSyntaxTextArea(20,60);
        //txtMensagem.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_DELPHI);
        txtMensagem.setCodeFoldingEnabled(true);
        spMensagem = new RTextScrollPane(txtMensagem);
        spMensagem.setName("Mensagens");
        jMensagem.add(spMensagem, 0);
//        jPainelMensagem.add(spMensagem);
        
        jPainel.setSelectedIndex(0);

/*        
        String texto =  "algoritmo \"teste\"\n" +
                        "var\n" +
                        "   x, y : inteiro\n" +
                        "   \n" + 
                        "   procedimento p(x, y : inteiro; z : real)\n" +
                        "   var\n" +
                        "       a, b : real\n" +
                        "   inicio\n" +
                        "   fimprocedimento\n\n" +
                        "inicio\n" +
                        "fimalgoritmo";
        
        txtFonte.setText(texto);                
*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainel = new javax.swing.JTabbedPane();
        jMensagem = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jOpen = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuTreeView = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("formPrincipal"); // NOI18N

        jMenu1.setText("Arquivo");

        jMenuItem3.setText("Novo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jOpen.setText("Abrir");
        jOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jOpen);

        jMenuItem1.setText("Salvar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salvar como");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Executar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuTreeView.setText("Análise Sintática");
        jMenuTreeView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTreeViewActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuTreeView);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sobre");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
            .addComponent(jPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpenActionPerformed
        // TODO add your handling code here:
        
        int returnVal = fileChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            fileToCompile = fileChooser.getSelectedFile();
            BufferedReader r;
            try {
                r = new BufferedReader(new FileReader(fileToCompile));
                txtFonte.read(r, null);
                r.close();
                txtFonte.setCaretPosition(0);
                txtFonte.discardAllEdits();
                isModified = false;
            } catch (RuntimeException re) {
                throw re;                   // FindBugs
            } catch (Exception e) {         // Never happens
                JDialog dialog = new JDialog(this, "Não foi possível abrir o arquivo!");
            }


/*
            //System.out.println( "You chose to open this file: " +
            //                    fileChooser.getSelectedFile().getAbsolutePath());
            BufferedReader bufferRead = null;
            try {
		bufferRead = new BufferedReader(new InputStreamReader(new FileInputStream(fileChooser.getSelectedFile().getAbsolutePath())));
            }
            catch (FileNotFoundException e) {
		System.out.println(e);
            }
			
            String line = null;
		
            try {
		line = bufferRead.readLine();
            }
            catch (Exception e) {
            	System.out.println(e);
            }
		
            String input = "";
		
            while(line != null) {
                input += line + "\n";
		try {
                    line = bufferRead.readLine();
		}
		catch (Exception e) {
                    System.out.println(e);
		}
            }
		
            try {
		bufferRead.close();
            }
            catch (Exception e) {
		System.out.println(e);
            }
            txtFonte.setText(input);
*/
        }
    }//GEN-LAST:event_jOpenActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
/*
        Parser parser = new Parser(txtFonte.getText());
        Object obj = parser.parse();
        JTree tree = parser.getTree();
        
        JFrame jFrame = new JFrame("Tree View");
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        jFrame.setLayout(new BorderLayout());      
        jFrame.setSize(600,400);

        JScrollPane jScroll = new JScrollPane(tree);
        jScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        jScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);          

        jFrame.getContentPane().add(jScroll);        
        jFrame.setVisible(true);

        System.out.println(parser.toString());
        
        txtMensagem.setText(obj.toString());
*/
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuTreeViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTreeViewActionPerformed
        // TODO add your handling code here:
        if (fileToCompile == null) {
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {            
                fileToCompile = fileChooser.getSelectedFile();
            }
            else
                return;    
        }
        // Salva o arquivo em edição
        if (saveAs(fileToCompile)) {
            Compilador parser = new Compilador(fileToCompile);
            parser.parse();
        }
        else {
            JDialog dialog = new JDialog(this, "Não foi possível salvar o arquivo a ser compilado!");
        } 
            
            
                
    }//GEN-LAST:event_jMenuTreeViewActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        int userSelection = fileChooser.showSaveDialog(this);
 
        if (userSelection == JFileChooser.APPROVE_OPTION) {            
            fileToCompile = fileChooser.getSelectedFile();
            saveAs(fileToCompile);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int userSelection = fileChooser.showSaveDialog(this);
 
        if (userSelection == JFileChooser.APPROVE_OPTION) {            
            fileToCompile = fileChooser.getSelectedFile();
            saveAs(fileToCompile);
            txtFonte.setText("");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });

//        formPrincipal = new FormPrincipal();
//        formPrincipal.setVisible(true);
    }
    
    public boolean saveAs(File file) {
        Writer out = null;
        try {
            FileOutputStream outf = new FileOutputStream(file);
            out = new OutputStreamWriter(outf, "utf-8");
            txtFonte.write(out);
            isModified = false;
            return true;
        } catch (IOException eee) {
            JDialog dialog = new JDialog(this, "Não foi possível salvar o arquivo!");
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    JDialog dialog = new JDialog(this, "Não foi possível salvar o arquivo!");
                }
            }
        }
        return false;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jMensagem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuTreeView;
    private javax.swing.JMenuItem jOpen;
    private javax.swing.JTabbedPane jPainel;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}