/**
 * Algo.g4
 * 
 * Gramática para compilação do VisuALG
 **/

// PARSER
grammar Algo ;

/** Inclusão dos imports no Parser */
@header {
import java.util.Stack;
}

/** Inclusão de campos e métodos na classe Parser */
@parser::members {
	// Sinalizador de erro de compilação
	public static boolean erro = false;
	
	// Lista de comandos do programa 
	private ArrayList<Object> statements;
	
	// Pilha para armazenar a tabela de símbolos ativa
	private Stack<TabSimbolos> stackTabSim; 
	
	// Pilha para armazenar o offset das variáveis/parâmetros 
	// da tabela de símbolos ativa
	private Stack<Integer> stackOffset;		
	
	// Pilha para gerenciamento da construção dos comandos do programa
	//private Stack<ArrayList<Object>> stackStatement;
	
	// Pilha de uso geral
	private Stack stack;

	// Tabela de símbolos principal
	// Ela deve ser pública para ficar disponível ao programa chamador
	// após o término do parser
	private TabSimbolos tabSimbolos;
	
	// Retorna o ArrayList contendo as instruções do programa 
	public ArrayList<Object> getStatements() {
		// Se ocorreu erro durante a compilação, então retorna null
		if (erro) return null;
		// Retorna o ArrayList contendo as instruções do programa
		return statements;
	}
	
	// Retorna a tabela de símbolos do programa principal
	public TabSimbolos getTabSimbols() {
		// Se ocorreu erro durante a compilação, então retorna null
		if (erro) return null;
		// Retorna a tabela de símbolos do programa principal
		return tabSimbolos;
	}
	
	private void createStack() {
        // Cria a pilha para gerenciamento das tabelas de símbolos
		stackTabSim = new Stack<TabSimbolos>();
		// Empilha a tabela de símbolos ativa
        stackTabSim.push(tabSimbolos);
        // Cria a pilha para gerenciamento do offset das variáveis/parâmetros
		stackOffset = new Stack<Integer>();
        // Empilha o offset inicial
        stackOffset.push(0);
		// Cria uma pilha geral
		Stack stack = new Stack();
	}
	
	// Ação 00
	// Cria as stacks para controle da tabela de símbolos e insere na 
	// tabela de símbolos ativa o nome do algoritmo, o qual se encontra 
	// em str	
	private void a00(String str) {
		// Cria a lista de comandos do programa principal
		statements = new ArrayList<Object>();
        // Cria a tabela de símbolos principal
		tabSimbolos = new TabSimbolos(null);
        // Cria as stacks stackTabSim e stackOffset para armazenar a tabela de símbolos ativa e 
		// o offset
        createStack(); 
        // Cria um registro para a tabela de símbolos para o nome do algoritmo
        TabSimRecord rec = new TabSimRecord(str, TabSimRecord.ALGORITMO);
        // Insere o registro na tabela de símbolos ativa
        tabSimbolos.putRecord(str, rec);
	}

	// Ação 01
	// Adiciona a sentença a lista de instruções do programa statements.
	private void a01(Object statement) {
		// Adiciona a sentença a lista de instruções do programa 
		statements.add(statement);

		System.out.println("Inserindo a sentença: " + statement.getClass().getSimpleName() + "\n");
	}

	// Ação 02
	// Atualiza o tipo de dados de cada variável/parâmetro declarado, cujos registros
	// na tabela de símbolos se encontram relacionados em listVar
	private void a02(ArrayList<TabSimRecord> listVar, Type type) {
		// Não há lista de variáveis
		if (listVar == null) return;
		// Atualiza cada variável da lista com o tipo type
		for (int i = 0; i < listVar.size(); i++) {
			listVar.get(i).setType(type);
		}
	}
	
	// Mostra uma mensagem de erro na janela de mensagens
	private void showError(int line, int position, String msg) {
        msg = "Error: line " + line + ", at position " + position + ", message: " + msg;
        if (FormPrincipal.txtMensagem.getText().equals(""))
            FormPrincipal.txtMensagem.setText(msg);
        else
            FormPrincipal.txtMensagem.setText(FormPrincipal.txtMensagem.getText() + "\n" + msg);
    }

	// Ação 03
	// Insere um identificador de variável na tabela de símbolos, caso ainda não
	// exista. Caso já exista, emite uma mensagem de erro de tentativa de redeclaração,
	// indicando a linha e a posição da variável.
	// O registro na tabela de símbolos de cada variável contida na lista 
	// de declaração é armazenada em listVar para que o seu tipo possa ser
	// atualizado posteriormente.
	private void a03(String id, ArrayList listVar, int line, int position) {
		// Verifica se o identificador está declarado na tabela local
		if (stackTabSim.empty()) return;
		if (stackTabSim.peek().contains(id)) {
			// Mostra uma mensagem de erro de tentativa de redeclaração de variável
			showError(line, position, "variable redeclaration attempt for " + id);
			// Sinaliza que houve um erro durante a análise
			erro = true;
			return;
		}
		// Verifica se é uma FUNCAO ou PROCEDIMENTO, pois os nomes dos mesmos não podem ser usados
		TabSimRecord rec = stackTabSim.peek().find(id);
		if (rec != null) {
			if (rec.name.equals(id) && rec.category == TabSimRecord.FUNCAO) {
				// Mostra uma mensagem de erro de tentativa de redeclaração de identificador
				showError(line, position, "the identifier " + id + " is already being used as a FUNCAO.");	
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return;
		    }
			else
			if (rec.name.equals(id) && rec.category == TabSimRecord.PROCEDIMENTO) {
				showError(line, position, "the identifier " + id + " is already being used as a PROCEDIMENTO.");	
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return;
		    }
		}
		// O identificador não está declarado na tabela de símbolos atual
		// Cria um registro na tabela de símbolos para a variável sendo declarada
		rec = new TabSimRecord(id, TabSimRecord.VARIAVEL);
		// Atualiza o offset da variável
		rec.setOffset(stackOffset.peek());
		// Insere o registro na tabela de símbolos ativa
		stackTabSim.peek().putRecord(id, rec);
		// Se lembra da variável na tabela de símbolos para poder atualizar
		// com a informação de tipo
		listVar.add(rec);
		// Atualiza o offset para ser usado pela próxima variável
		stackOffset.push(stackOffset.pop() + 1);
	}
	
	// Ação 04
	// Verifica se o procedimento/função está declarado na tabela de símbolos
	// corrente. Caso esteja, emite uma mensagem de erro de tentativa de redeclaração.
	// Caso contrário, insere o identificador na tabela de símbolos, com a categoria
	// recebida como parâmetro, cria uma nova tabela de símbolos, faz com que o identificador
	// aponte para essa tabela de símbolos, faz com que a tabela de simbolos criada
	// aponte para a tabela ativa como tabela pai, empilha a nova tabela de símbolos
	// em stackTabSim. Empilha 0 em stackOffset. 
	// Retorna o registro criado na tabela de símbolos.
	private TabSimRecord a04(String id, int category, int line, int position) {
	    if (stackTabSim.empty()) return null;
		if (stackTabSim.peek().contains(id)) {
			// Mostra uma mensagem de erro de tentativa de redeclaração 
			// do procedimento/função
			showError(line, position, "identifier redeclaration attempt for " + id);
			// Sinaliza que houve um erro durante a análise
			erro = true;
		}
		// Mesmo que o id já tenha sido declarado, cria a tabela de símbolos para a continuidade
		// do processo de análise
		// Cria um registro na tabela de símbolos para o procedimento/função
		// sendo declarada
		TabSimRecord rec = new TabSimRecord(id, category);
		// Insere o registro na tabela de símbolos ativa
		stackTabSim.peek().putRecord(id, rec);
		// Salva a tabela de símbolos ativa, pois ela será o pai da nova tabela
		TabSimbolos tabSimPai = stackTabSim.peek();
		// Cria uma nova tabela de símbolos, filha da tabela de símbolos
		// anterior, e a empilha na stackTabSim
		stackTabSim.push(new TabSimbolos(tabSimPai));
		// Empilha o offset inicial
		stackOffset.push(0);
		// Faz o registro do procedimento/função apontar para a nova 
		// tabela de símbolos
		rec.setTabSimbolos(stackTabSim.peek());
		// Retorna o registro criado na tabela de símbolos
		return rec;
	}

	// Ação 05
	// Atribui o tipo de dados de retorno da função ao registro da função 
	// na tabela de símbolos
	private void a05(TabSimRecord rec, Type type) {
		// Houve um erro na declaração da função
		if (rec == null) return;
		// Abribui o tipo de dados de retorno da função ao registro 
		// na tabela de símbolos
		rec.type = type;
	}

	// Ação 10
	// Insere um identificador de parâmetro na tabela de símbolos, caso ainda não
	// exista. Caso já exista, emite uma mensagem de erro de tentativa de redeclaração,
	// indicando a linha e a posição da variável.
	// O registro na tabela de símbolos de cada parâmetro contida na lista 
	// de declaração é armazenada em listId para que o seu tipo possa ser
	// atualizado posteriormente.
	private void a10(String id, ArrayList listId, int line, int position) {
		// Verifica se o identificador está declarado na tabela de símbolos local
		if (stackTabSim.empty()) return;
		if (stackTabSim.peek().contains(id)) {
			// Mostra uma mensagem de erro de tentativa de redeclaração de variável
			showError(line, position, "parameter redeclaration attempt for " + id);
			// Sinaliza que houve um erro durante a análise
			erro = true;
			return;
		}
		// Verifica se é uma FUNCAO ou PROCEDIMENTO, pois os nomes dos mesmos não podem ser usados
		TabSimRecord rec = stackTabSim.peek().find(id);
		if (rec != null) {
			if (rec.name.equals(id) && rec.category == TabSimRecord.FUNCAO) {
				// Mostra uma mensagem de erro de tentativa de redeclaração de identificador
				showError(line, position, "the identifier " + id + " is already being used as a FUNCAO.");	
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return;
		    }
			else
			if (rec.name.equals(id) && rec.category == TabSimRecord.PROCEDIMENTO) {
				showError(line, position, "the identifier " + id + " is already being used as a PROCEDIMENTO.");	
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return;
		    }
		}		
		// Cria um registro na tabela de símbolos para o parâmetro sendo declarado
		rec = new TabSimRecord(id, TabSimRecord.PARAMETRO);
		// Atualiza o offset do parâmetro
		rec.setOffset(stackOffset.peek());
		// Insere o registro na tabela de símbolos ativa
		stackTabSim.peek().putRecord(id, rec);
		// Se lembra da variável na tabela de símbolos para poder atualizar
		// com a informação de tipo
		listId.add(rec);
		// Atualiza o offset para ser usado pela próximo parâmetro/variável
		stackOffset.push(stackOffset.pop() + 1);
	}
			
	// Ação 11
	// Verifica se o identificador está declarado e cria uma lista de 
	// identificadores a serem utilizados pelo comando read().
	private void a11(String id, ArrayList listId, int line, int position) {
		// Pesquisa pelo identificador em todas as tabelas de símbolos interlidadas
		if (stackTabSim.empty()) return;
		TabSimRecord rec = stackTabSim.peek().find(id);
		// Se não encontrou o identificador, então emite mensagem de erro.
		if (rec == null) {
			// Mostra uma mensagem de erro se o id não está declarado
			showError(line, position, "identifier " + id + " not declared.");
			// Sinaliza que houve um erro durante a análise
			erro = true;
		}
		else {
			// Insere o registro na lista de identificadores
			listId.add(rec);
		}
	}

	// Ação 12
	// Insere a expressão na lista de expressões a serem impressas pelo 
	// comando escreva()/escreval().
	private void a12(ArrayList<Object> listExpressao, Object expressao) {
		listExpressao.add(expressao);
	}

	// Ação 13
	// Cria o objeto para o comando leia() para a ler a lista de variáveis 
	// especificadas em listId.
	private LeiaStatement a13(ArrayList<TabSimRecord> listId) {
		return new LeiaStatement(listId);
	}
	
	// Ação 14
	// Cria o objeto para o comando escreva()/escreval() para a imprimir
	// as expressões contidas em listExpressao.
	// a) typeEscreva indica se é um escreva() ou um escreval().	
	// b) listExpressao é um ArrayList contendo as expressões a serem escritas.
	private EscrevaStatement a14(int typeEscreva, ArrayList<Object> listExpressao) {
		return new EscrevaStatement(typeEscreva, listExpressao);
	}

    // Ação A15
	// Verifica se o identificador id se encrontra declarado na tabela de
	// símbolos atual ou na tabela pai, retornando o registro correspondente.
	// Caso não esteja declarado, emite uma mensagem de erro.
	// O tipo de dados do identificador deve ser INTEIRO ou REAL
	private TabSimRecord a15(String id, int line, int position) {
		// Pesquisa pelo identificador em todas as tabelas de símbolos interligadas
		if (stackTabSim.empty()) return null;
		TabSimRecord rec = stackTabSim.peek().find(id);
		// Se não encontrou o identificador, então emite mensagem de erro.
		if (rec == null) {
			// Mostra uma mensagem de erro se o id não está declarado
			showError(line, position, "identifier " + id + " not declared.");
			// Sinaliza que houve um erro durante a análise
			erro = true;
			return null;
		}
		else {
			// Verifica se o tipo de dados do identificador é INTEIRO ou REAL
			if (rec.getType() == Type.INTEIRO || rec.getType() == Type.REAL) {
			   // Retorna o registro correspondente na tabela de símbolos
			   return rec;
			}
			else {
				// Mostra uma mensagem de erro sobre os tipos de dados necessários
				showError(line, position, "identifier " + id + " must be INTEIRO or REAL.");
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return null;
			}
		}
	}
	
	// Ação 16
	// Cria o comando PARA 
	// Os argumentos são os seguintes:
	// a) variavel: registro da tabela de símbolos correspondente a variável de controle
	// b) inicial: expressão de ínico
	// c) final: expressão de fimalgoritmo
	// d) passo: valor de incremento da variável de controle
	// e) decrescente: se o incremento da variável de controle é crescente (false) ou decrescente (true)
	// f) statements: lista de comandos
	private ParaStatement a16(TabSimRecord variavel, Object inicial, Object ate, Object passo, boolean decrescente, ArrayList<Object> statements) {
//		if (variavel == null) return null;
		return new ParaStatement(variavel, inicial, ate, passo, decrescente, statements);		
	}

	// Ação 17
	// Cria o comando REPITA..ATÉ 
	// Os argumentos são os seguintes:
	// a) statements: lista de comandos
	// b) expressao: expressão para o ATÉ
	private RepitaStatement a17(ArrayList<Object> statements, Object ate) {
		return new RepitaStatement(statements, ate);		
	}
	
    // Ação A20
	// Verifica se o identificador id se encrontra declarado na tabela de
	// símbolos atual ou na tabela pai e se a categoria é VARIAVEL, PARAMETRO ou FUNCAO,
    // retornando o registro correspondente.
	// Caso não esteja declarado ou não seja VARIAVEL, PARAMETRO ou FUNCAO, emite 
	// uma mensagem de erro.
	// Se a categoria for FUNCAO, só aceita ser referida se estiver dentro da função.
	private TabSimRecord a20(String id, int line, int position) {
		// Pesquisa pelo identificador em todas as tabelas de símbolos interligadas
		if (stackTabSim.empty()) return null;
		TabSimRecord rec = stackTabSim.peek().find(id);
		// Se não encontrou o identificador, então emite mensagem de erro.
		if (rec == null) {
			// Mostra uma mensagem de erro se o id não está declarado
			showError(line, position, "identifier " + id + " not declared.");
			// Sinaliza que houve um erro durante a análise
			erro = true;
			return null;
		}
		else {
			// Se a categoria for FUNCAO, então verifica se está dentro da função.
			// Isto é feito comparando a tabela de símbolos apontada pela função e aquela que 
			// está empilhada.
			if (rec.category == TabSimRecord.FUNCAO) {
			    // Se a tabela de símbolos apontada não é a que está empilhada, então não estou
			    // dentro da função
			    if (rec.tabSimbolos != stackTabSim.peek()) {
					// Mostra uma mensagem de erro se a categoria não é a esperda.
					showError(line, position, "identifier " + id + " is not a declared variable.");
					// Sinaliza que houve um erro durante a análise
					erro = true;
					return null;
			    }
				else {
					// Retorna o registro correspondente na tabela de símbolos
					return rec;			   
				}
		    }
			else
			// Verifica se a categoria do identificador é VARIAVEL ou
			// PARAMETRO. Caso não seja, emite uma mensagem de erro.
			if (rec.category != TabSimRecord.VARIAVEL &&  
				rec.category != TabSimRecord.PARAMETRO) {
				// Mostra uma mensagem de erro se a categoria não é a esperda.
				showError(line, position, "identifier " + id + " is not a variable.");
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return null;
			}
			else {
				//
				// Retorna o registro correspondente na tabela de símbolos
				return rec;
			}
		}
	}

    // Ação A21
	// Verifica se o identificador id se encrontra declarado na tabela de
	// símbolos atual ou na tabela pai e se a categoria é PROCEDIMENTO OU 
	// FUNCAO, retornando o registro correspondente.
	// Caso não esteja declarado ou não seja PROCEDIMENTO OU FUNCAO, emite 
	// uma mensagem de erro.
	private TabSimRecord a21(String id, int line, int position) {
		// Pesquisa pelo identificador em todas as tabelas de símbolos interligadas
		if(stackTabSim.empty()) return null;
		TabSimRecord rec = stackTabSim.peek().find(id);
		// Se não encontrou o identificador, então emite mensagem de erro.
		if (rec == null) {
			// Mostra uma mensagem de erro se o id não está declarado
			showError(line, position, "identifier " + id + " not declared.");
			// Sinaliza que houve um erro durante a análise
			erro = true;
			return null;
		}
		else {
			// Verifica se a categoria do identificador é PROCEDIMENTO ou
			// FUNCAO. Caso não seja, emite uma mensagem de erro.
			if (rec.category != TabSimRecord.PROCEDIMENTO &&  
				rec.category != TabSimRecord.FUNCAO) {
				// Mostra uma mensagem de erro se a categoria não é a esperda.
				showError(line, position, "identifier " + id + " is not a procedure ou a function.");
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return null;
			}
			else {
				// Retorna o registro correspondente na tabela de símbolos
				return rec;
			}
		}
	}

    // Ação A22
	// Verifica se os tipos de dados do identificador de controle do PARA
	// e a expressão de inicialização e finalização do laço são compatíveis.
	private boolean a22(TabSimRecord rec, Object expressao, int line, int position) {
	    // Variável para validar o tipo de dados da expressão
		Type type = Type.NONE;
		if (expressao instanceof Expressao) 
		   type = ((Expressao)expressao).getTypeExpression();
		else
		if (expressao instanceof Integer)
		   type = Type.INTEIRO;
		else 
		if (expressao instanceof Double || expressao instanceof Float)
		   type = type.REAL;
		
		// Está esperando um inteiro, mas encontrou um real.
		// Informa que o valor será truncado
	    if (rec.getType() == Type.INTEIRO && type == Type.REAL) {
			showError(line, position, "type conflict. Waiting a " + rec.getType().name() + " for the variable " + rec.getName() + ", but found a REAL. Warning: the value will be truncated.");
			return true;
		}
		else 
		// Um INTEIRO será promovido para REAL. Então não tem problema.
		if (rec.getType() == Type.REAL && type == Type.INTEIRO ||
			rec.getType() == Type.INTEIRO && type == Type.INTEIRO ||		  
			rec.getType() == Type.REAL && type == Type.REAL) {
			// Do nothing.
			return true;
	 	}
		else {
			// Mostra a mensagem de erro de conflito de tipos
			showError(line, position, "type conflict. Expected a " + rec.getType().name() + " type. Found a " + type.name() + " expression.");
			erro = true;
			return false;
		}
	}
	
	// Ação A23
	// Verifica se o identificador id se encrontra declarado na tabela de
	// símbolos atual ou na tabela pai e se ele é de categoria VARIAVEL ou
    // PARAMETRO, retornando o registro correspondente.
	// Caso não esteja declarado ou não seja da categoria VARIAVEL ou 
	// PARAMETRO, emite uma mensagem de erro.
	private TabSimRecord a23(String id, int line, int position) {
		// Pesquisa pelo identificador em todas as tabelas de símbolos interligadas
		if (stackTabSim.empty()) return null;
		TabSimRecord rec = stackTabSim.peek().find(id);
		// Se não encontrou o identificador, então emite mensagem de erro.
		if (rec == null) {
			// Mostra uma mensagem de erro se o id não está declarado
			showError(line, position, "identifier " + id + " not declared.");
			// Sinaliza que houve um erro durante a análise
			erro = true;
			return null;
		}
		else {
			// A categoria é VARIAVEL ou PARAMETRO?
			if (rec.category == TabSimRecord.VARIAVEL || 
				rec.category == TabSimRecord.PARAMETRO) {
				// Retorna o registro da tabela de símbolos
				return rec;
			}
			else {
				// Mostra uma mensagem de erro se o id não é da categoria
				// VARIAVEL ou PARAMETRO
				showError(line, position, "variable expected.");
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return null;
			}
		}
	}

	// Ação A24
	// Verifica se o identificador id se encrontra declarado na tabela de
	// símbolos atual ou na tabela pai e se ele é de categoria FUNCAO,
    // retornando o registro correspondente.
	// Caso não esteja declarado ou não seja da categoria FUNCAO, então
	// emite uma mensagem de erro.
	private TabSimRecord a24(String id, int line, int position) {
		// Pesquisa pelo identificador em todas as tabelas de símbolos interligadas
		if(stackTabSim.empty()) return null;
		TabSimRecord rec = stackTabSim.peek().find(id);
		// Se não encontrou o identificador, então emite mensagem de erro.
		if (rec == null) {
			// Mostra uma mensagem de erro se o id não está declarado
			showError(line, position, "identifier " + id + " not declared.");
			// Sinaliza que houve um erro durante a análise
			erro = true;
			return null;
		}
		else {
			// A categoria é FUNCAO?
			if (rec.category == TabSimRecord.FUNCAO) {
				// Retorna o registro da tabela de símbolos
				return rec;
			}
			else {
				// Mostra uma mensagem de erro se o id não é da categoria
				// FUNCAO
				showError(line, position, "identifier is not a declared function.");
				// Sinaliza que houve um erro durante a análise
				erro = true;
				return null;
			}
		}
	}

    // Ação A25
	// Verifica se a expressao é do tipo lógico
	// Recebe os seguintes valores:
	// a) Expressao a ser avaliada
	// b) Linha onde ela ocorre
	// c) Posição onde ela ocorre
	private boolean a25(Object expressao, int line, int position) {
		boolean typeLogico = false;
		if(expressao instanceof TabSimRecord) {
		   typeLogico = ((TabSimRecord)expressao).getType() == Type.LOGICO;
		}
		else
		if(expressao instanceof Expressao) { 
		   typeLogico = ((Expressao)expressao).getTypeExpression() == Type.LOGICO;
		}
		else
		if(expressao instanceof Boolean) 
		   typeLogico = true;
		// Mostra a mensagem de erro, caso o tipo não seja lógico
		if(!typeLogico) {
	       showError(line, position, "type conflict for expression. The expression must be a LOGICO type.");
		   erro = true;
		}
		return typeLogico;
	}

    // Ação a26
	// Verifica se os argumentos de procedimentos/funções estão consistentes com o que foi declarado
    public boolean a26(TabSimRecord recIdTabSim, ArrayList<Object> args, int line, int position) {
		// Não há nenhum argumento
		if (recIdTabSim.listParameters == null && args == null) return true;
	    // O número de argumentos especificado difere do esperado.
		if (args.size() != recIdTabSim.listParameters.size()) {
            showError(line, position, "the number of arguments for the " + recIdTabSim.name + " is inconsistent. You must provide " + recIdTabSim.listParameters.size() + " arguments.");
			erro = true;
			return false;
		}
		else {
			for(int i = 0; i < args.size(); i++) {
			    Type typeArgs = Type.NONE;
			    if (args.get(i) instanceof Integer) 
			        typeArgs = Type.INTEIRO;
			    else
			    if (args.get(i) instanceof Double || args.get(i) instanceof Float) 
			        typeArgs = Type.REAL;
			    else
			    if (args.get(i) instanceof Boolean) 
			        typeArgs = Type.LOGICO;
			    else
			    if (args.get(i) instanceof String) 
			        typeArgs = Type.CARACTER;
			    else
			    if (args.get(i) instanceof TabSimRecord) 
			        typeArgs = ((TabSimRecord)args.get(i)).getType();
			    else
			    if (args.get(i) instanceof Expressao) 
			        typeArgs = ((Expressao)args.get(i)).getTypeExpression();
			        // Está esperando um inteiro, mas encontrou um real.
					// Informa que o valor será truncado
					if (typeArgs == Type.REAL && ((TabSimRecord)recIdTabSim.listParameters.get(i)).getType() == Type.INTEIRO) {
					    showError(line, position, "type conflict for the parameter " + (i + 1) + ". Waiting a INTEIRO, but found a REAL. Warning: the value will be truncated.");
					}
					else 
					if (typeArgs == Type.INTEIRO && ((TabSimRecord)recIdTabSim.listParameters.get(i)).getType() == Type.REAL) {
 					    // Do nothing.
 					}
				    else
					if (typeArgs != ((TabSimRecord)recIdTabSim.listParameters.get(i)).getType()) {
					    showError(line, position, "type conflict for the parameter " + (i + 1) + ". Expected a " + ((TabSimRecord)recIdTabSim.listParameters.get(i)).getType().name() + " type. Found a " + typeArgs.name() + " expression.");
					    erro = true;
					    return false;
					}
			    }
		}
		return true;
    }
}

programa         : {erro = false;} // Ainda não ocorreu um erro de compilação
				   ALGORITMO STRING {a00($STRING.text);} corpo  ;
corpo            : declara? rotina* INICIO (sentenca {a01($sentenca.statement);})* FIMALGORITMO ;
declara          : VAR dvar+ ;
dvar             : variaveis ':' tipo {a02($variaveis.listVar, $tipo.type);} ;
tipo             returns [Type type]
				 : INTEIRO {$type = Type.INTEIRO;}
				 | REAL {$type = Type.REAL;}
				 | CARACTERE {$type = Type.CARACTER;}
				 | LOGICO {$type = Type.LOGICO;} 
				 ;
variaveis        returns [ArrayList<TabSimRecord> listVar = new ArrayList<>()]
				 : IDENTIFICADOR {a03($IDENTIFICADOR.text, $listVar, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} ( ',' IDENTIFICADOR {a03($IDENTIFICADOR.text, $listVar, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} )*
				 ;
rotina           : procedimento
                 | funcao 
				 ;
procedimento     : PROCEDIMENTO IDENTIFICADOR {TabSimRecord rec = a04($IDENTIFICADOR.text, TabSimRecord.PROCEDIMENTO, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} 
				   {ArrayList<TabSimRecord> listParameters = new ArrayList<>();}
				   (parametros {listParameters = $parametros.listParameters;})? 
				   {// Atualiza a lista de parâmetros
				    if (rec != null ) 
					    rec.listParameters = listParameters;
				   }
				   declara? 
				   INICIO 
				   {ArrayList<Object> stats = new ArrayList<>();}
				   ( sentenca {stats.add($sentenca.statement);} )* 
				   FIMPROCEDIMENTO
				   {// Desempilha a tabela de símbolos e o offset empilhados pela ação a04()
				    if (!stackTabSim.empty()) {
					    stackTabSim.pop();
				        stackOffset.pop();
					}
					// Se não ocorreu nenhum erro na identificação 
					if (rec != null ) {					
						// Instruções do procedimento
						rec.code = stats;
					}
				   }
				   ;
funcao           : FUNCAO IDENTIFICADOR {TabSimRecord rec = a04($IDENTIFICADOR.text, TabSimRecord.FUNCAO, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} 
				   {ArrayList<TabSimRecord> listParameters = new ArrayList<>();}
				   (parametros {listParameters = $parametros.listParameters;})? 
				   {// Atualiza a lista de parâmetros
				    if (rec != null ) 
					    rec.listParameters = listParameters;
				   }
				   ':' tipo {a05(rec, $tipo.type);} 
				   declara? 
				   INICIO 
				   {ArrayList<Object> stats = new ArrayList<>();}
				   ( sentenca {stats.add($sentenca.statement);} )* 
				   FIMFUNCAO
				   {// Desempilha a tabela de símbolos e o offset empilhados pela ação a04()
				    if (!stackTabSim.empty()) {
					    stackTabSim.pop();
				        stackOffset.pop();
					}
					// Se não ocorreu nenhum erro na identificação 
					if (rec != null ) {
						// Instruções do procedimento
						rec.code = stats;
					}
				   }
				   ;
parametros       returns [ArrayList<TabSimRecord> listParameters = new ArrayList<>()]
				 : '(' lista_parametros+ ')' 
				   {$listParameters = $lista_parametros.listParameters;}
				 ;
lista_parametros returns [ArrayList<TabSimRecord> listParameters = new ArrayList<>()]
				 : lista_id ':' tipo 
				   {a02($lista_id.listId, $tipo.type);
				    // Adiciona os identificadores na lista de parâmetros
					for(int i = 0; i < $lista_id.listId.size(); i ++) {
					    $listParameters.add($lista_id.listId.get(i));
					}
				   } 
				   ( ';' lista_id ':' tipo 
				      {a02($lista_id.listId, $tipo.type);
					   // Adiciona os identificadores na lista de parâmetros
					   for(int i = 0; i < $lista_id.listId.size(); i ++) {
					       $listParameters.add($lista_id.listId.get(i));
					   }
					  } 
				   )* 
                 ;
lista_id         returns [ArrayList<TabSimRecord> listId = new ArrayList<>()]
				 : IDENTIFICADOR {a10($IDENTIFICADOR.text, $listId, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} ( ',' IDENTIFICADOR {a10($IDENTIFICADOR.text, $listId, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} )*   
                 ;  
var_leia         returns [ArrayList<TabSimRecord> listId = new ArrayList<>()]
				 : IDENTIFICADOR {a11($IDENTIFICADOR.text, $listId, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} ( ',' IDENTIFICADOR {a11($IDENTIFICADOR.text, $listId, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} )* 
				 ;
exp_escreva      returns [ArrayList<Object> listExpressao = new ArrayList<>()]
				 : expressao {a12($listExpressao, $expressao.expression);} ( ',' expressao {a12($listExpressao, $expressao.expression);} )* 
				 ;
sentenca         returns [Object statement = null;]
				 : LEIA '(' var_leia ')' {$statement = a13($var_leia.listId);}
                 | ESCREVA '(' exp_escreva ')' {$statement = a14(EscrevaStatement.TYPE_ESCREVA, $exp_escreva.listExpressao);}
				 | ESCREVAL '(' exp_escreva ')' {$statement = a14(EscrevaStatement.TYPE_ESCREVAL, $exp_escreva.listExpressao);} 
				 | PARA IDENTIFICADOR {TabSimRecord recIdTabSim = a15($IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} 
				   DE inicio=expressao {a22(recIdTabSim, $inicio.expression, $DE.getLine(), $DE.getCharPositionInLine());}
				   ATE fim=expressao {a22(recIdTabSim, $fim.expression, $ATE.getLine(), $ATE.getCharPositionInLine());}
				   {Object passo = 1;} 
				   (PASSO {boolean subtracao = false;} (SUBTRACAO {subtracao = true;})? 
				    passopara 
					{if(subtracao) {
					    if($passopara.passo instanceof Integer)
						   passo = (-1) * (Integer)$passopara.passo; 
						else
						   passo = (-1) * (Double)$passopara.passo; 
				     }
					 else {
						   passo = $passopara.passo;
				     }
					 // A variável de controle é inteira, mas o passo é real. 
					 // Então, emite uma mensagem de warning sinalizando que o valor será truncado.
					 if($passopara.type == Type.REAL && recIdTabSim.getType() == Type.INTEIRO) {
						showError($PASSO.getLine(), $PASSO.getCharPositionInLine(), "type conflict. Waiting a " + recIdTabSim.getType().name() + " for the variable " + recIdTabSim.getName() + ", but found a REAL. Warning: the value will be truncated.");					 
					 }
					}
				   )? 
				   {boolean decrescente = false;} (DECRESCENTE {decrescente = true;})? 
				   FACA 
				   {ArrayList<Object> paraStatements = new ArrayList<>();} (sentenca {paraStatements.add($sentenca.statement);})* 
				   FIMPARA 
				   {ParaStatement paraStatement = a16(recIdTabSim, $inicio.expression, $fim.expression, passo, decrescente, paraStatements);
					$statement = paraStatement;
				   }   
				 | REPITA 
				   {ArrayList<Object> repitaStatements = new ArrayList<>();} (sentenca {repitaStatements.add($sentenca.statement);})* 
				   ATE expressao 
				   {// Consiste o tipo da expressão, que deve ser lógica
				    a25($expressao.expression, $ATE.getLine(), $ATE.getCharPositionInLine());				   
				    RepitaStatement repitaStatement = a17(repitaStatements, $expressao.expression);
					$statement = repitaStatement;
				   }
				 | ENQUANTO expressao 
				   {// Consiste o tipo da expressão, que deve ser lógica
				    a25($expressao.expression, $ENQUANTO.getLine(), $ENQUANTO.getCharPositionInLine());
				   }
				   FACA 
				   {ArrayList<Object> enquantoStatements = new ArrayList<>();} (sentenca {enquantoStatements.add($sentenca.statement);})* 
				   FIMENQUANTO
				   {EnquantoStatement enquantoStatement = new EnquantoStatement($expressao.expression, enquantoStatements);
				    $statement = enquantoStatement; 
				   }
				 | SE expressao 
				   {// Consiste o tipo da expressão, que deve ser lógica
				    a25($expressao.expression, $SE.getLine(), $SE.getCharPositionInLine());
				   }
				   ENTAO 
				   {ArrayList<Object> thenStatements = new ArrayList<>();} 
				   ( sentenca {thenStatements.add($sentenca.statement);} )* 
				   {ArrayList<Object> elseStatements = new ArrayList<>();} 
				   ( pfalsa {elseStatements = $pfalsa.statements;} )? 
				   FIMSE 
				   {SeStatement seStatement = new SeStatement($expressao.expression, thenStatements, elseStatements);
				    $statement = seStatement;
				   }
				 | // É uma variável/parâmetro
				   IDENTIFICADOR 
				   {TabSimRecord recIdTabSim = a20($IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());} 
				   '<-' expressao 
				   {// Se retornou um identificador é porque não ocorreu nenhum erro
				    if (recIdTabSim != null) {
						// Verifica os tipos do identificador e da expressão são compatíveis.
						// Está esperando um inteiro, mas encontrou um real.
						// Informa que o valor será truncado
						if (recIdTabSim.getType() == Type.INTEIRO && $expressao.typeExpression == Type.REAL) {
							showError($IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine(), "type conflict. Waiting a INTEIRO, but found a REAL. Warning: the value will be truncated.");
						}
						else 
						if (recIdTabSim.getType() == Type.REAL && $expressao.typeExpression == Type.INTEIRO) {
							// Do nothing.
						}
						else
						if (recIdTabSim.getType() != $expressao.typeExpression) {
							// Mostra a mensagem de erro de conflito de tipos
							showError($IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine(), "type conflict. Expected a " + recIdTabSim.getType().name() + " type. Found a " + $expressao.typeExpression.name() + " expression.");
							erro = true;
						}
					}	
					AtribuicaoStatement atribuicaoStatement = new AtribuicaoStatement(recIdTabSim, $expressao.expression);
					$statement = atribuicaoStatement;
				  }	
				 | // É a chamada de um procedimento
				   IDENTIFICADOR 
				   {TabSimRecord recIdTabSim = a21($IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
				   } 
				   {ArrayList<Object> args = new ArrayList<>();} 
				   ( argumentos {args = $argumentos.listArgs;} )? 
				   {// Verifica se os tipos das expressões são consistentes
				    // com os tipos dos parâmetros declarados
					a26(recIdTabSim, args, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
				    CallStatement callStatement = new CallStatement(recIdTabSim, args);
				    $statement = callStatement;
				   }
                 ;
				 
passopara        returns [Object passo = 1, Type type = Type.NONE]
				 : NUMERO_INTEIRO {$passo = $NUMERO_INTEIRO.int; $type = Type.INTEIRO;} 
				 | NUMERO_REAL    {$passo = Double.parseDouble($NUMERO_REAL.text); $type = Type.REAL;} 
				 ;

argumentos       returns [ArrayList<Object> listArgs = new ArrayList<>()]
				 : '(' expressao {$listArgs.add($expressao.expression);} (',' expressao {$listArgs.add($expressao.expression);})* ')' ;

pfalsa           returns [ArrayList<Object> statements = null]
                 : SENAO {$statements = new ArrayList<>();} (sentenca {$statements.add($sentenca.statement);})* 
				 ;

expressao		 returns [Object expression = null, Type typeExpression = Type.NONE]
				 : simpleExpression 
				   {$expression = $simpleExpression.value; 
				    $typeExpression = $simpleExpression.typeValue;
				   }				   
				   //(operator=relationaloperator expressao
				   (operator=(IGUAL | DIFERENTE | MENOR | MENOR_IGUAL | MAIOR | MAIOR_IGUAL) expressao
				    {// Verifica se os tipos são INTEIRO ou REAL para as expressões esquerda e direita)
					 if($simpleExpression.typeValue != Type.INTEIRO && $simpleExpression.typeValue != Type.REAL) {
 					    showError($operator.getLine(), $operator.getCharPositionInLine(), "invalid type of the first operand for the relational expression. The expression must be of INTEIRO or REAL type.");
					    erro = true;
					    $typeExpression = Type.NONE;					
					 }
					 else
					 if($expressao.typeExpression != Type.INTEIRO && $expressao.typeExpression != Type.REAL) {
 					    showError($operator.getLine(), $operator.getCharPositionInLine(), "invalid type of the second operand for the relational expression. The expression must be of INTEIRO or REAL type.");
					    erro = true;
					    $typeExpression = Type.NONE;					
					 }
					 else {
						// A expressão resultante é do tipo LOGICO
						$typeExpression = Type.LOGICO;
						// É o operador de IGUAL. Então cria uma expressão de IGUALDADE
						if ($operator.type == IGUAL)
							$expression = new Expressao(Expressao.IGUAL, Type.LOGICO, $simpleExpression.value, $expressao.expression);
						else
						// É o operador de MENOR. Então cria uma expressão de MENOR
						if ($operator.type == MENOR)
							$expression = new Expressao(Expressao.MENOR, Type.LOGICO, $simpleExpression.value, $expressao.expression);
						else
						// É o operador de MENOR ou IGUAL. Então cria uma expressão de MENOR ou IGUAL
						if ($operator.type == MENOR_IGUAL)
							$expression = new Expressao(Expressao.MENOR_IGUAL, Type.LOGICO, $simpleExpression.value, $expressao.expression);
						else
						// É o operador de MAIOR. Então cria uma expressão de MAIOR
						if ($operator.type == MAIOR)
							$expression = new Expressao(Expressao.MAIOR, Type.LOGICO, $simpleExpression.value, $expressao.expression);
						else
						// É o operador de MAIOR ou IGUAL. Então cria uma expressão de MAIOR ou IGUAL
						if ($operator.type == MAIOR_IGUAL)
							$expression = new Expressao(Expressao.MAIOR_IGUAL, Type.LOGICO, $simpleExpression.value, $expressao.expression);
						else
						// É o operador de DIFERENTE. Então cria uma expressão de DIFERENTE
						if ($operator.type == DIFERENTE)
							$expression = new Expressao(Expressao.DIFERENTE, Type.LOGICO, $simpleExpression.value, $expressao.expression);
                     }
				    }
				   )?
				 ;

relationaloperator
				 : IGUAL
			     | DIFERENTE
				 | MENOR
				 | MENOR_IGUAL
				 | MAIOR
				 | MAIOR_IGUAL
				 ;

simpleExpression returns [Object value = null, Type typeValue = Type.NONE] 
				 : term 
				   {$value = $term.value; 
				    $typeValue = $term.typeValue;
				   }
//				   (operator=additiveoperator simpleExpression
				   (operator=(ADICAO | SUBTRACAO | OU) simpleExpression
				   {// Verifica se o operador é um OU. 
				    // Neste caso, os dois operandos devem ser lógicos
					if($operator.type == OU) {
					   if ($term.typeValue != Type.LOGICO) {
						   showError($operator.getLine(), $operator.getCharPositionInLine(), "invalid type of the first expression for the OU operator. The expression must be of LOGICO type.");
					       erro = true;
					       $typeValue = Type.NONE;					
					   }
					   else 
					   if ($simpleExpression.typeValue != Type.LOGICO) {
						   showError($operator.getLine(), $operator.getCharPositionInLine(), "invalid type of the second expression for the OU operator. The expression must be of LOGICO type.");
					       erro = true;
					       $typeValue = Type.NONE;					
					   }
					   else {
					      $value = new Expressao(Expressao.OU, Type.LOGICO, $term.value, $simpleExpression.value);	
						  $typeValue = Type.LOGICO;
					   }
					}
					else {
				       // Verifica a consistência de tipos de dados e faz a promoção ou emite uma mensagem de erro
				       if($term.typeValue == Type.INTEIRO && $simpleExpression.typeValue == Type.INTEIRO) 
					      $typeValue = Type.INTEIRO;
					   else
				       if($term.typeValue == Type.REAL && $simpleExpression.typeValue == Type.REAL) 
					      $typeValue = Type.REAL;
					   else
				       if($term.typeValue == Type.INTEIRO && $simpleExpression.typeValue == Type.REAL ||
					      $term.typeValue == Type.REAL && $simpleExpression.typeValue == Type.INTEIRO)
					      $typeValue = Type.REAL;
					   else
					   // Se uma das expressões é CARACTER, então emite mensagem de erro
					   if($term.typeValue == Type.CARACTER || $simpleExpression.typeValue == Type.CARACTER ||
					      $term.typeValue == Type.LOGICO || $simpleExpression.typeValue == Type.LOGICO) {
				          showError($operator.getLine(), $operator.getCharPositionInLine(), "invalid expressions for the operator.");
					      erro = true;
					      $typeValue = Type.NONE;					
					   }
					   else
					   // Se os tipos são diferentes, emite mensagem de erro
					   if($term.typeValue != $simpleExpression.typeValue) {
				          showError($operator.getLine(), $operator.getCharPositionInLine(), "type conflict for the expressions.");
					      erro = true;
					      $typeValue = Type.NONE;
					   }				   
				       // É o operador de adição. Então cria uma expressão de adição
					   if ($operator.type == ADICAO)
					      $value = new Expressao(Expressao.ADICAO, $typeValue, $term.value, $simpleExpression.value);
					   else
				       // É o operador de subtracao. Então cria uma expressão de subtração
				       if ($operator.type == SUBTRACAO)
					      $value = new Expressao(Expressao.SUBTRACAO, $typeValue, $term.value, $simpleExpression.value);
				    }
				   }
				  )?
				 ;

additiveoperator : ADICAO
				 | SUBTRACAO
				 | OU
				 ;

term			 returns [Object value = null, Type typeValue = Type.NONE]
				 : signedFactor 
				  {$value = $signedFactor.value; 
				   $typeValue = $signedFactor.typeValue;
				  }
				  //(operator=multiplicativeoperator term 
				  (operator=(MULTIPLICACAO | DIVISAO | E) term 
				   {// Verifica se é o operador lógico E
					if($operator.type == E) {
					   // Os tipos para o operador E devem ser LOGICO
					   if ($signedFactor.typeValue != Type.LOGICO) {
						   showError($operator.getLine(), $operator.getCharPositionInLine(), "invalid type of the first expression for the E operator. The expression must be of LOGICO type.");
					       erro = true;
					       $typeValue = Type.NONE;					
					   }
					   else 
					   if ($term.typeValue != Type.LOGICO) {
						   showError($operator.getLine(), $operator.getCharPositionInLine(), "invalid type of the second expression for the E operator. The expression must be of LOGICO type.");
					       erro = true;
					       $typeValue = Type.NONE;					
					   }
					   else {
					      $value = new Expressao(Expressao.E, Type.LOGICO, $signedFactor.value, $term.value);	
						  $typeValue = Type.LOGICO;
					   }
					}
					else {
				       // Verifica a consistência de tipos de dados e faz a promoção ou emite uma mensagem de erro
				       if($signedFactor.typeValue == Type.INTEIRO && $term.typeValue == Type.INTEIRO) 
					      $typeValue = Type.INTEIRO;
					   else
				       if($signedFactor.typeValue == Type.REAL && $term.typeValue == Type.REAL) 
					      $typeValue = Type.REAL;
					   else
				       if($signedFactor.typeValue == Type.INTEIRO && $term.typeValue == Type.REAL ||
					      $signedFactor.typeValue == Type.REAL && $term.typeValue == Type.INTEIRO)
					      $typeValue = Type.REAL;
					   else
					   // Se uma das expressões é CARACTER, então emite mensagem de erro
					   if($signedFactor.typeValue == Type.CARACTER || $term.typeValue == Type.CARACTER || 
					      $signedFactor.typeValue == Type.LOGICO || $term.typeValue == Type.LOGICO) {
				          showError($operator.getLine(), $operator.getCharPositionInLine(), "invalid expressions for the operator.");
					      erro = true;
					      $typeValue = Type.NONE;					
					   }
					   else
					   // Se os tipos são diferentes, emite mensagem de erro
					   if($signedFactor.typeValue != $term.typeValue) {
				          showError($operator.getLine(), $operator.getCharPositionInLine(), "type conflict for the expressions.");
					      erro = true;
					      $typeValue = Type.NONE;
					   }				   
				       // É o operador de adição. Então cria uma expressão de adição
					   if ($operator.type == MULTIPLICACAO)
					      $value = new Expressao(Expressao.MULTIPLICACAO, $typeValue, $signedFactor.value, $term.value);
					   else
				       // É o operador de subtracao. Então cria uma expressão de subtração
				       if ($operator.type == DIVISAO)
					      $value = new Expressao(Expressao.DIVISAO, $typeValue, $signedFactor.value, $term.value);
				    }
				   }
				  )?
				 ;

multiplicativeoperator
				 : MULTIPLICACAO 
				 | DIVISAO
				 | E
				 ;

signedFactor 	 returns [Object value = null, Type typeValue = Type.NONE]
				 : {boolean subtracao = false;} 
				   ( ADICAO | SUBTRACAO {subtracao = true;} )? 
				   factor
				   {// É o operador unário UMINUS
				    if (subtracao) {
				       // Consiste o tipo de dados, que tem que ser INTEIRO ou REAL
					   if($factor.typeValue != Type.INTEIRO && $factor.typeValue != Type.REAL) {
						  showError($SUBTRACAO.getLine(), $SUBTRACAO.getCharPositionInLine(), "type conflict for the expression. The expression must be INTEIRO or REAL.");
					      erro = true;
					      $typeValue = Type.NONE;
					   }
					   else {
					      // Cria a expressão
					      $value = new Expressao(Expressao.UMINUS, $factor.typeValue, $factor.value, null);
					      $typeValue = $factor.typeValue;
					   }
					}
					// Não é o UMINUS
					else {
					   $value = $factor.value;
					   $typeValue = $factor.typeValue;
					}
				   }
				 ;

factor			 returns [Object value = null, Type typeValue = Type.NONE]
				 : // É uma variável/parâmetro
				   IDENTIFICADOR 
				   {TabSimRecord rec = a23($IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
				    $value = rec;
					$typeValue = rec.getType(); 
				   }
				 | // É a chamada de uma função
				   IDENTIFICADOR PARENTESE_ESQUERDO 
				   {TabSimRecord rec = a24($IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
				    ArrayList<Object> args = new ArrayList<>();
				   }
				   ( parameterList {args = $parameterList.listArgs;} )? 
				   PARENTESE_DIREITO
				   {// Verifica se os tipos das expressões e dos parâmetros declarados são consistentes
   				    a26(rec, args, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
					$value = new CallStatement(rec, args);
				    $typeValue = rec.getType();
				   }
				 | // É uma expressão entre parenteses
				   PARENTESE_ESQUERDO expressao 
				   {$value = $expressao.expression; 
				    $typeValue = $expressao.typeExpression;
				   } 
				   PARENTESE_DIREITO
				 | // É um INTEIRO, REAL ou CARACTER
				   unsignedConstant 
				   {$value = $unsignedConstant.value; 
				    $typeValue = $unsignedConstant.typeValue;
				   }
				 | NAO factor
				   {// Se o tipo do fator não é lógico, então emite uma mensagem de conflito de tipos
				    if($factor.typeValue != Type.LOGICO) {
				       showError($NAO.getLine(), $NAO.getCharPositionInLine(), "type conflict for the operator NAO. The expression must be of LOGICO type.");
					   erro = true;
					   $typeValue = Type.NONE;
				    }
					else {
				       $value = new Expressao(Expressao.NAO, Type.LOGICO, $factor.value, null);
				       $typeValue = Type.LOGICO;
					}
				   }
				 | booleano 
				   {$value = $booleano.value; 
				    $typeValue = Type.LOGICO;
				   }
				 ;

booleano		 returns [boolean value] 
				 : VERDADEIRO {$value = true;}
				 | FALSO  	  {$value = false;}
				 ;

unsignedConstant returns [Object value = null, Type typeValue = Type.NONE]
				 : NUMERO_INTEIRO {$value = $NUMERO_INTEIRO.int; $typeValue = Type.INTEIRO;}
				 | NUMERO_REAL    {$value = Double.parseDouble($NUMERO_REAL.text); $typeValue = Type.REAL;}
//				 | STRING		  {$value = $STRING.text; $typeValue = Type.CARACTER;}
				   // Retirando as aspas colocadas pelo Lexer() 
				 | STRING		  {$value = ((String)$STRING.getText()).substring(1, ((String)$STRING.getText()).length() - 1); $typeValue = Type.CARACTER;}
				 ;

parameterList	 returns [ArrayList<Object> listArgs = new ArrayList<>()]
				 : expressao {$listArgs.add($expressao.expression);} (VIRGULA expressao {$listArgs.add($expressao.expression);})*
				 ;
 

// LEXER
ALGORITMO   	 : 'algoritmo' ;
INICIO     		 : 'inicio' ;
FIMALGORITMO     : 'fimalgoritmo' ;
VAR       		 : 'var' ;
INTEIRO   		 : 'inteiro' ;
REAL   			 : 'real' ;
CARACTERE		 : 'caractere' ;
LOGICO			 : 'logico' | 'lógico' ;
PROCEDIMENTO 	 : 'procedimento' ;
FIMPROCEDIMENTO  : 'fimprocedimento' ;
FUNCAO  		 : 'funcao' | 'função' ;
FIMFUNCAO  		 : 'fimfuncao' | 'fimfunção' ;
LEIA      		 : 'leia' ;
ESCREVA     	 : 'escreva' ;
ESCREVAL   		 : 'escreval' ;
PARA       		 : 'para' ;
PASSO			 : 'passo' ;
DECRESCENTE		 : 'decrescente' ;
FIMPARA       	 : 'fimpara' ;
DE        		 : 'de' ;
ATE        		 : 'ate' | 'até';
FACA        	 : 'faca' | 'faça';
REPITA    		 : 'repita' ;
FIMREPITA    	 : 'fimrepita' ;
ENQUANTO    	 : 'enquanto' ;
FIMENQUANTO      : 'fimenquanto' ;
SE        		 : 'se' ;
FIMSE        	 : 'fimse' ;
ENTAO      		 : 'entao' | 'então';
SENAO      		 : 'senao' | 'senão';
VERDADEIRO       : 'verdadeiro' ;
FALSO     		 : 'falso' ;
NAO       		 : 'nao' | 'não';
E       		 : 'e' ;
OU        		 : 'ou' ;
PARENTESE_ESQUERDO 
				 : '(' ;
PARENTESE_DIREITO: ')' ;
VIRGULA			 : ',' ;
IGUAL        	 : '=' ;
MAIOR        	 : '>' ;
MAIOR_IGUAL      : '>=' ;
MENOR        	 : '<' ;
MENOR_IGUAL      : '<=' ;
DIFERENTE        : '<>' ;
MULTIPLICACAO    : '*' ;                          // Operador de multiplicação
DIVISAO       	 : '/' ;                          // Operador de divisão
ADICAO       	 : '+' ;                          // Operador de divisão
SUBTRACAO        : '-' ;                          // Operador de subtração
IDENTIFICADOR    : [a-zA-Z] ([a-zA-Z] | [0-9])* ; // Identificador
NUMERO_INTEIRO 	 : [0-9]+ ;                       // Números inteiros
NUMERO_REAL		 : [0-9]+ '.' [0-9]+ ;            // Números reais
STRING   		 : '"' .*? '"' ;                  // String 
WS        		 : [ \t\r\n]+ -> skip ;           // Consome brancos
COMMENT   		 : '{' .*? '}' -> skip;           // Comentários em várias linhas estilo Pascal
CCOMMENT   		 : '/*' .*? '*/' -> skip;         // Comentários em várias linhas estilo C/C++/Java
LCOMMENT  		 : '//' .*? '\r'? '\n' -> skip ;  // Comentário no final de uma linha

