/***
 * Parser para o ALGO
 ***/
import java.util.ArrayList;
import java.util.Stack;

import java.io.FileInputStream;
import java.io.InputStream;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

import javax.swing.*;

import org.antlr.v4.runtime.*;

public class Compilador {
    // Arquivo a ser compilado
    private final File fileToCompile;
    // Erro
    boolean erro = false;
    
    /***
     * Construtor
     * @param fileToCompile
     ***/	
     public Compilador(File fileToCompile) {
         this.fileToCompile = fileToCompile;
    }

    /***
     * Faz a análise sintática
     ***/	
    public void parse() {
        // Limpa a área de mensagem
        FormPrincipal.txtMensagem.setText("");
        
        // Não há erro
        erro = false;
                
        InputStream is = null;
        ANTLRInputStream input = null;
        
        try {
            is = new FileInputStream(fileToCompile);        
            input = new ANTLRInputStream(is);
        }
        catch (FileNotFoundException e) {
            FormPrincipal.txtMensagem.setText("O arquivo a ser compilado não foi encontrado!");
            erro = true;
        }
        catch (IOException e) {
            FormPrincipal.txtMensagem.setText("Erro ao abrir o arquivo a ser compilado!");
            erro = true;
        }
               
        if (!erro) {
            AlgoLexer lexer = new AlgoLexer(input);
            // Remove o tratamento de erros padrão
            lexer.removeErrorListeners();
	    // Adiciona o meu tratamento de erros
            lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgoParser parser = new AlgoParser(tokens);
	    // Remove o tratamento de erros padrão
	    parser.removeErrorListeners();
	    // Adiciona o meu tratamento de erros
	    parser.addErrorListener(DescriptiveErrorListener.INSTANCE);
            parser.programa(); // parse

            // Mensagem de erro, inconsistência ou sucesso
            String msg = FormPrincipal.txtMensagem.getText();
            if (!parser.erro) {
                if (!msg.equals("")) 
                    msg = msg + "\nAnálise concluída com inconsistências!";
                else
                    msg = "Análise concluída com sucesso!";
            }
            else {
                msg = msg + "\nAnálise concluída com erros!";
            }
            FormPrincipal.txtMensagem.setText(msg);

            // Não ocorreu erro de compilação
            // Então pode ser executado
            if (!parser.erro) {
                Runtime runtime = new Runtime();
                runtime.run(parser.getStatements());
            }
        }
    }
    
}
