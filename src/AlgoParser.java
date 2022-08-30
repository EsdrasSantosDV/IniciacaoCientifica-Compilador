// Generated from Algo.g4 by ANTLR 4.10.1

import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ALGORITMO=4, INICIO=5, FIMALGORITMO=6, VAR=7, 
		INTEIRO=8, REAL=9, CARACTERE=10, LOGICO=11, PROCEDIMENTO=12, FIMPROCEDIMENTO=13, 
		FUNCAO=14, FIMFUNCAO=15, LEIA=16, ESCREVA=17, ESCREVAL=18, PARA=19, PASSO=20, 
		DECRESCENTE=21, FIMPARA=22, DE=23, ATE=24, FACA=25, REPITA=26, FIMREPITA=27, 
		ENQUANTO=28, FIMENQUANTO=29, SE=30, FIMSE=31, ENTAO=32, SENAO=33, VERDADEIRO=34, 
		FALSO=35, NAO=36, E=37, OU=38, PARENTESE_ESQUERDO=39, PARENTESE_DIREITO=40, 
		VIRGULA=41, IGUAL=42, MAIOR=43, MAIOR_IGUAL=44, MENOR=45, MENOR_IGUAL=46, 
		DIFERENTE=47, MULTIPLICACAO=48, DIVISAO=49, ADICAO=50, SUBTRACAO=51, IDENTIFICADOR=52, 
		NUMERO_INTEIRO=53, NUMERO_REAL=54, STRING=55, WS=56, COMMENT=57, CCOMMENT=58, 
		LCOMMENT=59;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_declara = 2, RULE_dvar = 3, RULE_tipo = 4, 
		RULE_variaveis = 5, RULE_rotina = 6, RULE_procedimento = 7, RULE_funcao = 8, 
		RULE_parametros = 9, RULE_lista_parametros = 10, RULE_lista_id = 11, RULE_var_leia = 12, 
		RULE_exp_escreva = 13, RULE_sentenca = 14, RULE_passopara = 15, RULE_argumentos = 16, 
		RULE_pfalsa = 17, RULE_expressao = 18, RULE_relationaloperator = 19, RULE_simpleExpression = 20, 
		RULE_additiveoperator = 21, RULE_term = 22, RULE_multiplicativeoperator = 23, 
		RULE_signedFactor = 24, RULE_factor = 25, RULE_booleano = 26, RULE_unsignedConstant = 27, 
		RULE_parameterList = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "declara", "dvar", "tipo", "variaveis", "rotina", 
			"procedimento", "funcao", "parametros", "lista_parametros", "lista_id", 
			"var_leia", "exp_escreva", "sentenca", "passopara", "argumentos", "pfalsa", 
			"expressao", "relationaloperator", "simpleExpression", "additiveoperator", 
			"term", "multiplicativeoperator", "signedFactor", "factor", "booleano", 
			"unsignedConstant", "parameterList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'<-'", "'algoritmo'", "'inicio'", "'fimalgoritmo'", 
			"'var'", "'inteiro'", "'real'", "'caractere'", null, "'procedimento'", 
			"'fimprocedimento'", null, null, "'leia'", "'escreva'", "'escreval'", 
			"'para'", "'passo'", "'decrescente'", "'fimpara'", "'de'", null, null, 
			"'repita'", "'fimrepita'", "'enquanto'", "'fimenquanto'", "'se'", "'fimse'", 
			null, null, "'verdadeiro'", "'falso'", null, "'e'", "'ou'", "'('", "')'", 
			"','", "'='", "'>'", "'>='", "'<'", "'<='", "'<>'", "'*'", "'/'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ALGORITMO", "INICIO", "FIMALGORITMO", "VAR", 
			"INTEIRO", "REAL", "CARACTERE", "LOGICO", "PROCEDIMENTO", "FIMPROCEDIMENTO", 
			"FUNCAO", "FIMFUNCAO", "LEIA", "ESCREVA", "ESCREVAL", "PARA", "PASSO", 
			"DECRESCENTE", "FIMPARA", "DE", "ATE", "FACA", "REPITA", "FIMREPITA", 
			"ENQUANTO", "FIMENQUANTO", "SE", "FIMSE", "ENTAO", "SENAO", "VERDADEIRO", 
			"FALSO", "NAO", "E", "OU", "PARENTESE_ESQUERDO", "PARENTESE_DIREITO", 
			"VIRGULA", "IGUAL", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "DIFERENTE", 
			"MULTIPLICACAO", "DIVISAO", "ADICAO", "SUBTRACAO", "IDENTIFICADOR", "NUMERO_INTEIRO", 
			"NUMERO_REAL", "STRING", "WS", "COMMENT", "CCOMMENT", "LCOMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Algo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public AlgoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public Token STRING;
		public TerminalNode ALGORITMO() { return getToken(AlgoParser.ALGORITMO, 0); }
		public TerminalNode STRING() { return getToken(AlgoParser.STRING, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			erro = false;
			setState(59);
			match(ALGORITMO);
			setState(60);
			((ProgramaContext)_localctx).STRING = match(STRING);
			a00((((ProgramaContext)_localctx).STRING!=null?((ProgramaContext)_localctx).STRING.getText():null));
			setState(62);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public SentencaContext sentenca;
		public TerminalNode INICIO() { return getToken(AlgoParser.INICIO, 0); }
		public TerminalNode FIMALGORITMO() { return getToken(AlgoParser.FIMALGORITMO, 0); }
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public List<RotinaContext> rotina() {
			return getRuleContexts(RotinaContext.class);
		}
		public RotinaContext rotina(int i) {
			return getRuleContext(RotinaContext.class,i);
		}
		public List<SentencaContext> sentenca() {
			return getRuleContexts(SentencaContext.class);
		}
		public SentencaContext sentenca(int i) {
			return getRuleContext(SentencaContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(64);
				declara();
				}
			}

			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDIMENTO || _la==FUNCAO) {
				{
				{
				setState(67);
				rotina();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(INICIO);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << ESCREVAL) | (1L << PARA) | (1L << REPITA) | (1L << ENQUANTO) | (1L << SE) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(74);
				((CorpoContext)_localctx).sentenca = sentenca();
				a01(((CorpoContext)_localctx).sentenca.statement);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(FIMALGORITMO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaraContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AlgoParser.VAR, 0); }
		public List<DvarContext> dvar() {
			return getRuleContexts(DvarContext.class);
		}
		public DvarContext dvar(int i) {
			return getRuleContext(DvarContext.class,i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(VAR);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				dvar();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFICADOR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DvarContext extends ParserRuleContext {
		public VariaveisContext variaveis;
		public TipoContext tipo;
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dvar; }
	}

	public final DvarContext dvar() throws RecognitionException {
		DvarContext _localctx = new DvarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((DvarContext)_localctx).variaveis = variaveis();
			setState(91);
			match(T__0);
			setState(92);
			((DvarContext)_localctx).tipo = tipo();
			a02(((DvarContext)_localctx).variaveis.listVar, ((DvarContext)_localctx).tipo.type);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public Type type;
		public TerminalNode INTEIRO() { return getToken(AlgoParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(AlgoParser.REAL, 0); }
		public TerminalNode CARACTERE() { return getToken(AlgoParser.CARACTERE, 0); }
		public TerminalNode LOGICO() { return getToken(AlgoParser.LOGICO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(INTEIRO);
				((TipoContext)_localctx).type =  Type.INTEIRO;
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(REAL);
				((TipoContext)_localctx).type =  Type.REAL;
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(CARACTERE);
				((TipoContext)_localctx).type =  Type.CARACTER;
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(LOGICO);
				((TipoContext)_localctx).type =  Type.LOGICO;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariaveisContext extends ParserRuleContext {
		public ArrayList<TabSimRecord> listVar = new ArrayList<>();
		public Token IDENTIFICADOR;
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(AlgoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(AlgoParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlgoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlgoParser.VIRGULA, i);
		}
		public VariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variaveis; }
	}

	public final VariaveisContext variaveis() throws RecognitionException {
		VariaveisContext _localctx = new VariaveisContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((VariaveisContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			a03((((VariaveisContext)_localctx).IDENTIFICADOR!=null?((VariaveisContext)_localctx).IDENTIFICADOR.getText():null), _localctx.listVar, ((VariaveisContext)_localctx).IDENTIFICADOR.getLine(), ((VariaveisContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(107);
				match(VIRGULA);
				setState(108);
				((VariaveisContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				a03((((VariaveisContext)_localctx).IDENTIFICADOR!=null?((VariaveisContext)_localctx).IDENTIFICADOR.getText():null), _localctx.listVar, ((VariaveisContext)_localctx).IDENTIFICADOR.getLine(), ((VariaveisContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RotinaContext extends ParserRuleContext {
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public RotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotina; }
	}

	public final RotinaContext rotina() throws RecognitionException {
		RotinaContext _localctx = new RotinaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rotina);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				procedimento();
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				funcao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedimentoContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public ParametrosContext parametros;
		public SentencaContext sentenca;
		public TerminalNode PROCEDIMENTO() { return getToken(AlgoParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(AlgoParser.IDENTIFICADOR, 0); }
		public TerminalNode INICIO() { return getToken(AlgoParser.INICIO, 0); }
		public TerminalNode FIMPROCEDIMENTO() { return getToken(AlgoParser.FIMPROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public List<SentencaContext> sentenca() {
			return getRuleContexts(SentencaContext.class);
		}
		public SentencaContext sentenca(int i) {
			return getRuleContext(SentencaContext.class,i);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PROCEDIMENTO);
			setState(120);
			((ProcedimentoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			TabSimRecord rec = a04((((ProcedimentoContext)_localctx).IDENTIFICADOR!=null?((ProcedimentoContext)_localctx).IDENTIFICADOR.getText():null), TabSimRecord.PROCEDIMENTO, ((ProcedimentoContext)_localctx).IDENTIFICADOR.getLine(), ((ProcedimentoContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
			ArrayList<TabSimRecord> listParameters = new ArrayList<>();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTESE_ESQUERDO) {
				{
				setState(123);
				((ProcedimentoContext)_localctx).parametros = parametros();
				listParameters = ((ProcedimentoContext)_localctx).parametros.listParameters;
				}
			}

			// Atualiza a lista de parâmetros
							    if (rec != null ) 
								    rec.listParameters = listParameters;
							   
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(129);
				declara();
				}
			}

			setState(132);
			match(INICIO);
			ArrayList<Object> stats = new ArrayList<>();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << ESCREVAL) | (1L << PARA) | (1L << REPITA) | (1L << ENQUANTO) | (1L << SE) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(134);
				((ProcedimentoContext)_localctx).sentenca = sentenca();
				stats.add(((ProcedimentoContext)_localctx).sentenca.statement);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(FIMPROCEDIMENTO);
			// Desempilha a tabela de símbolos e o offset empilhados pela ação a04()
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public ParametrosContext parametros;
		public TipoContext tipo;
		public SentencaContext sentenca;
		public TerminalNode FUNCAO() { return getToken(AlgoParser.FUNCAO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(AlgoParser.IDENTIFICADOR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode INICIO() { return getToken(AlgoParser.INICIO, 0); }
		public TerminalNode FIMFUNCAO() { return getToken(AlgoParser.FIMFUNCAO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public List<SentencaContext> sentenca() {
			return getRuleContexts(SentencaContext.class);
		}
		public SentencaContext sentenca(int i) {
			return getRuleContext(SentencaContext.class,i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(FUNCAO);
			setState(146);
			((FuncaoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			TabSimRecord rec = a04((((FuncaoContext)_localctx).IDENTIFICADOR!=null?((FuncaoContext)_localctx).IDENTIFICADOR.getText():null), TabSimRecord.FUNCAO, ((FuncaoContext)_localctx).IDENTIFICADOR.getLine(), ((FuncaoContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
			ArrayList<TabSimRecord> listParameters = new ArrayList<>();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTESE_ESQUERDO) {
				{
				setState(149);
				((FuncaoContext)_localctx).parametros = parametros();
				listParameters = ((FuncaoContext)_localctx).parametros.listParameters;
				}
			}

			// Atualiza a lista de parâmetros
							    if (rec != null ) 
								    rec.listParameters = listParameters;
							   
			setState(155);
			match(T__0);
			setState(156);
			((FuncaoContext)_localctx).tipo = tipo();
			a05(rec, ((FuncaoContext)_localctx).tipo.type);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(158);
				declara();
				}
			}

			setState(161);
			match(INICIO);
			ArrayList<Object> stats = new ArrayList<>();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << ESCREVAL) | (1L << PARA) | (1L << REPITA) | (1L << ENQUANTO) | (1L << SE) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(163);
				((FuncaoContext)_localctx).sentenca = sentenca();
				stats.add(((FuncaoContext)_localctx).sentenca.statement);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(FIMFUNCAO);
			// Desempilha a tabela de símbolos e o offset empilhados pela ação a04()
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public ArrayList<TabSimRecord> listParameters = new ArrayList<>();
		public Lista_parametrosContext lista_parametros;
		public TerminalNode PARENTESE_ESQUERDO() { return getToken(AlgoParser.PARENTESE_ESQUERDO, 0); }
		public TerminalNode PARENTESE_DIREITO() { return getToken(AlgoParser.PARENTESE_DIREITO, 0); }
		public List<Lista_parametrosContext> lista_parametros() {
			return getRuleContexts(Lista_parametrosContext.class);
		}
		public Lista_parametrosContext lista_parametros(int i) {
			return getRuleContext(Lista_parametrosContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(PARENTESE_ESQUERDO);
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				((ParametrosContext)_localctx).lista_parametros = lista_parametros();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFICADOR );
			setState(180);
			match(PARENTESE_DIREITO);
			((ParametrosContext)_localctx).listParameters =  ((ParametrosContext)_localctx).lista_parametros.listParameters;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_parametrosContext extends ParserRuleContext {
		public ArrayList<TabSimRecord> listParameters = new ArrayList<>();
		public Lista_idContext lista_id;
		public TipoContext tipo;
		public List<Lista_idContext> lista_id() {
			return getRuleContexts(Lista_idContext.class);
		}
		public Lista_idContext lista_id(int i) {
			return getRuleContext(Lista_idContext.class,i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public Lista_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros; }
	}

	public final Lista_parametrosContext lista_parametros() throws RecognitionException {
		Lista_parametrosContext _localctx = new Lista_parametrosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lista_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((Lista_parametrosContext)_localctx).lista_id = lista_id();
			setState(184);
			match(T__0);
			setState(185);
			((Lista_parametrosContext)_localctx).tipo = tipo();
			a02(((Lista_parametrosContext)_localctx).lista_id.listId, ((Lista_parametrosContext)_localctx).tipo.type);
							    // Adiciona os identificadores na lista de parâmetros
								for(int i = 0; i < ((Lista_parametrosContext)_localctx).lista_id.listId.size(); i ++) {
								    _localctx.listParameters.add(((Lista_parametrosContext)_localctx).lista_id.listId.get(i));
								}
							   
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(187);
				match(T__1);
				setState(188);
				((Lista_parametrosContext)_localctx).lista_id = lista_id();
				setState(189);
				match(T__0);
				setState(190);
				((Lista_parametrosContext)_localctx).tipo = tipo();
				a02(((Lista_parametrosContext)_localctx).lista_id.listId, ((Lista_parametrosContext)_localctx).tipo.type);
									   // Adiciona os identificadores na lista de parâmetros
									   for(int i = 0; i < ((Lista_parametrosContext)_localctx).lista_id.listId.size(); i ++) {
									       _localctx.listParameters.add(((Lista_parametrosContext)_localctx).lista_id.listId.get(i));
									   }
									  
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_idContext extends ParserRuleContext {
		public ArrayList<TabSimRecord> listId = new ArrayList<>();
		public Token IDENTIFICADOR;
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(AlgoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(AlgoParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlgoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlgoParser.VIRGULA, i);
		}
		public Lista_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_id; }
	}

	public final Lista_idContext lista_id() throws RecognitionException {
		Lista_idContext _localctx = new Lista_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lista_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((Lista_idContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			a10((((Lista_idContext)_localctx).IDENTIFICADOR!=null?((Lista_idContext)_localctx).IDENTIFICADOR.getText():null), _localctx.listId, ((Lista_idContext)_localctx).IDENTIFICADOR.getLine(), ((Lista_idContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(200);
				match(VIRGULA);
				setState(201);
				((Lista_idContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				a10((((Lista_idContext)_localctx).IDENTIFICADOR!=null?((Lista_idContext)_localctx).IDENTIFICADOR.getText():null), _localctx.listId, ((Lista_idContext)_localctx).IDENTIFICADOR.getLine(), ((Lista_idContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_leiaContext extends ParserRuleContext {
		public ArrayList<TabSimRecord> listId = new ArrayList<>();
		public Token IDENTIFICADOR;
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(AlgoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(AlgoParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlgoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlgoParser.VIRGULA, i);
		}
		public Var_leiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_leia; }
	}

	public final Var_leiaContext var_leia() throws RecognitionException {
		Var_leiaContext _localctx = new Var_leiaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((Var_leiaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			a11((((Var_leiaContext)_localctx).IDENTIFICADOR!=null?((Var_leiaContext)_localctx).IDENTIFICADOR.getText():null), _localctx.listId, ((Var_leiaContext)_localctx).IDENTIFICADOR.getLine(), ((Var_leiaContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(210);
				match(VIRGULA);
				setState(211);
				((Var_leiaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				a11((((Var_leiaContext)_localctx).IDENTIFICADOR!=null?((Var_leiaContext)_localctx).IDENTIFICADOR.getText():null), _localctx.listId, ((Var_leiaContext)_localctx).IDENTIFICADOR.getLine(), ((Var_leiaContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_escrevaContext extends ParserRuleContext {
		public ArrayList<Object> listExpressao = new ArrayList<>();
		public ExpressaoContext expressao;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlgoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlgoParser.VIRGULA, i);
		}
		public Exp_escrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_escreva; }
	}

	public final Exp_escrevaContext exp_escreva() throws RecognitionException {
		Exp_escrevaContext _localctx = new Exp_escrevaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp_escreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			((Exp_escrevaContext)_localctx).expressao = expressao();
			a12(_localctx.listExpressao, ((Exp_escrevaContext)_localctx).expressao.expression);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(220);
				match(VIRGULA);
				setState(221);
				((Exp_escrevaContext)_localctx).expressao = expressao();
				a12(_localctx.listExpressao, ((Exp_escrevaContext)_localctx).expressao.expression);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentencaContext extends ParserRuleContext {
		public Object statement = null;;
		public Var_leiaContext var_leia;
		public Exp_escrevaContext exp_escreva;
		public Token IDENTIFICADOR;
		public Token DE;
		public ExpressaoContext inicio;
		public Token ATE;
		public ExpressaoContext fim;
		public Token PASSO;
		public PassoparaContext passopara;
		public SentencaContext sentenca;
		public ExpressaoContext expressao;
		public Token ENQUANTO;
		public Token SE;
		public PfalsaContext pfalsa;
		public ArgumentosContext argumentos;
		public TerminalNode LEIA() { return getToken(AlgoParser.LEIA, 0); }
		public TerminalNode PARENTESE_ESQUERDO() { return getToken(AlgoParser.PARENTESE_ESQUERDO, 0); }
		public Var_leiaContext var_leia() {
			return getRuleContext(Var_leiaContext.class,0);
		}
		public TerminalNode PARENTESE_DIREITO() { return getToken(AlgoParser.PARENTESE_DIREITO, 0); }
		public TerminalNode ESCREVA() { return getToken(AlgoParser.ESCREVA, 0); }
		public Exp_escrevaContext exp_escreva() {
			return getRuleContext(Exp_escrevaContext.class,0);
		}
		public TerminalNode ESCREVAL() { return getToken(AlgoParser.ESCREVAL, 0); }
		public TerminalNode PARA() { return getToken(AlgoParser.PARA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(AlgoParser.IDENTIFICADOR, 0); }
		public TerminalNode DE() { return getToken(AlgoParser.DE, 0); }
		public TerminalNode ATE() { return getToken(AlgoParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(AlgoParser.FACA, 0); }
		public TerminalNode FIMPARA() { return getToken(AlgoParser.FIMPARA, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode PASSO() { return getToken(AlgoParser.PASSO, 0); }
		public PassoparaContext passopara() {
			return getRuleContext(PassoparaContext.class,0);
		}
		public TerminalNode DECRESCENTE() { return getToken(AlgoParser.DECRESCENTE, 0); }
		public List<SentencaContext> sentenca() {
			return getRuleContexts(SentencaContext.class);
		}
		public SentencaContext sentenca(int i) {
			return getRuleContext(SentencaContext.class,i);
		}
		public TerminalNode SUBTRACAO() { return getToken(AlgoParser.SUBTRACAO, 0); }
		public TerminalNode REPITA() { return getToken(AlgoParser.REPITA, 0); }
		public TerminalNode ENQUANTO() { return getToken(AlgoParser.ENQUANTO, 0); }
		public TerminalNode FIMENQUANTO() { return getToken(AlgoParser.FIMENQUANTO, 0); }
		public TerminalNode SE() { return getToken(AlgoParser.SE, 0); }
		public TerminalNode ENTAO() { return getToken(AlgoParser.ENTAO, 0); }
		public TerminalNode FIMSE() { return getToken(AlgoParser.FIMSE, 0); }
		public PfalsaContext pfalsa() {
			return getRuleContext(PfalsaContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public SentencaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenca; }
	}

	public final SentencaContext sentenca() throws RecognitionException {
		SentencaContext _localctx = new SentencaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentenca);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(LEIA);
				setState(230);
				match(PARENTESE_ESQUERDO);
				setState(231);
				((SentencaContext)_localctx).var_leia = var_leia();
				setState(232);
				match(PARENTESE_DIREITO);
				((SentencaContext)_localctx).statement =  a13(((SentencaContext)_localctx).var_leia.listId);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(ESCREVA);
				setState(236);
				match(PARENTESE_ESQUERDO);
				setState(237);
				((SentencaContext)_localctx).exp_escreva = exp_escreva();
				setState(238);
				match(PARENTESE_DIREITO);
				((SentencaContext)_localctx).statement =  a14(EscrevaStatement.TYPE_ESCREVA, ((SentencaContext)_localctx).exp_escreva.listExpressao);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(ESCREVAL);
				setState(242);
				match(PARENTESE_ESQUERDO);
				setState(243);
				((SentencaContext)_localctx).exp_escreva = exp_escreva();
				setState(244);
				match(PARENTESE_DIREITO);
				((SentencaContext)_localctx).statement =  a14(EscrevaStatement.TYPE_ESCREVAL, ((SentencaContext)_localctx).exp_escreva.listExpressao);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(PARA);
				setState(248);
				((SentencaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				TabSimRecord recIdTabSim = a15((((SentencaContext)_localctx).IDENTIFICADOR!=null?((SentencaContext)_localctx).IDENTIFICADOR.getText():null), ((SentencaContext)_localctx).IDENTIFICADOR.getLine(), ((SentencaContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
				setState(250);
				((SentencaContext)_localctx).DE = match(DE);
				setState(251);
				((SentencaContext)_localctx).inicio = expressao();
				a22(recIdTabSim, ((SentencaContext)_localctx).inicio.expression, ((SentencaContext)_localctx).DE.getLine(), ((SentencaContext)_localctx).DE.getCharPositionInLine());
				setState(253);
				((SentencaContext)_localctx).ATE = match(ATE);
				setState(254);
				((SentencaContext)_localctx).fim = expressao();
				a22(recIdTabSim, ((SentencaContext)_localctx).fim.expression, ((SentencaContext)_localctx).ATE.getLine(), ((SentencaContext)_localctx).ATE.getCharPositionInLine());
				Object passo = 1;
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PASSO) {
					{
					setState(257);
					((SentencaContext)_localctx).PASSO = match(PASSO);
					boolean subtracao = false;
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SUBTRACAO) {
						{
						setState(259);
						match(SUBTRACAO);
						subtracao = true;
						}
					}

					setState(263);
					((SentencaContext)_localctx).passopara = passopara();
					if(subtracao) {
										    if(((SentencaContext)_localctx).passopara.passo instanceof Integer)
											   passo = (-1) * (Integer)((SentencaContext)_localctx).passopara.passo; 
											else
											   passo = (-1) * (Double)((SentencaContext)_localctx).passopara.passo; 
									     }
										 else {
											   passo = ((SentencaContext)_localctx).passopara.passo;
									     }
										 // A variável de controle é inteira, mas o passo é real. 
										 // Então, emite uma mensagem de warning sinalizando que o valor será truncado.
										 if(((SentencaContext)_localctx).passopara.type == Type.REAL && recIdTabSim.getType() == Type.INTEIRO) {
											showError(((SentencaContext)_localctx).PASSO.getLine(), ((SentencaContext)_localctx).PASSO.getCharPositionInLine(), "type conflict. Waiting a " + recIdTabSim.getType().name() + " for the variable " + recIdTabSim.getName() + ", but found a REAL. Warning: the value will be truncated.");					 
										 }
										
					}
				}

				boolean decrescente = false;
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DECRESCENTE) {
					{
					setState(269);
					match(DECRESCENTE);
					decrescente = true;
					}
				}

				setState(273);
				match(FACA);
				ArrayList<Object> paraStatements = new ArrayList<>();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << ESCREVAL) | (1L << PARA) | (1L << REPITA) | (1L << ENQUANTO) | (1L << SE) | (1L << IDENTIFICADOR))) != 0)) {
					{
					{
					setState(275);
					((SentencaContext)_localctx).sentenca = sentenca();
					paraStatements.add(((SentencaContext)_localctx).sentenca.statement);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(FIMPARA);
				ParaStatement paraStatement = a16(recIdTabSim, ((SentencaContext)_localctx).inicio.expression, ((SentencaContext)_localctx).fim.expression, passo, decrescente, paraStatements);
									((SentencaContext)_localctx).statement =  paraStatement;
								   
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(REPITA);
				ArrayList<Object> repitaStatements = new ArrayList<>();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << ESCREVAL) | (1L << PARA) | (1L << REPITA) | (1L << ENQUANTO) | (1L << SE) | (1L << IDENTIFICADOR))) != 0)) {
					{
					{
					setState(288);
					((SentencaContext)_localctx).sentenca = sentenca();
					repitaStatements.add(((SentencaContext)_localctx).sentenca.statement);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				((SentencaContext)_localctx).ATE = match(ATE);
				setState(297);
				((SentencaContext)_localctx).expressao = expressao();
				// Consiste o tipo da expressão, que deve ser lógica
								    a25(((SentencaContext)_localctx).expressao.expression, ((SentencaContext)_localctx).ATE.getLine(), ((SentencaContext)_localctx).ATE.getCharPositionInLine());				   
								    RepitaStatement repitaStatement = a17(repitaStatements, ((SentencaContext)_localctx).expressao.expression);
									((SentencaContext)_localctx).statement =  repitaStatement;
								   
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				((SentencaContext)_localctx).ENQUANTO = match(ENQUANTO);
				setState(301);
				((SentencaContext)_localctx).expressao = expressao();
				// Consiste o tipo da expressão, que deve ser lógica
								    a25(((SentencaContext)_localctx).expressao.expression, ((SentencaContext)_localctx).ENQUANTO.getLine(), ((SentencaContext)_localctx).ENQUANTO.getCharPositionInLine());
								   
				setState(303);
				match(FACA);
				ArrayList<Object> enquantoStatements = new ArrayList<>();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << ESCREVAL) | (1L << PARA) | (1L << REPITA) | (1L << ENQUANTO) | (1L << SE) | (1L << IDENTIFICADOR))) != 0)) {
					{
					{
					setState(305);
					((SentencaContext)_localctx).sentenca = sentenca();
					enquantoStatements.add(((SentencaContext)_localctx).sentenca.statement);
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				match(FIMENQUANTO);
				EnquantoStatement enquantoStatement = new EnquantoStatement(((SentencaContext)_localctx).expressao.expression, enquantoStatements);
								    ((SentencaContext)_localctx).statement =  enquantoStatement; 
								   
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(316);
				((SentencaContext)_localctx).SE = match(SE);
				setState(317);
				((SentencaContext)_localctx).expressao = expressao();
				// Consiste o tipo da expressão, que deve ser lógica
								    a25(((SentencaContext)_localctx).expressao.expression, ((SentencaContext)_localctx).SE.getLine(), ((SentencaContext)_localctx).SE.getCharPositionInLine());
								   
				setState(319);
				match(ENTAO);
				ArrayList<Object> thenStatements = new ArrayList<>();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << ESCREVAL) | (1L << PARA) | (1L << REPITA) | (1L << ENQUANTO) | (1L << SE) | (1L << IDENTIFICADOR))) != 0)) {
					{
					{
					setState(321);
					((SentencaContext)_localctx).sentenca = sentenca();
					thenStatements.add(((SentencaContext)_localctx).sentenca.statement);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				ArrayList<Object> elseStatements = new ArrayList<>();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENAO) {
					{
					setState(330);
					((SentencaContext)_localctx).pfalsa = pfalsa();
					elseStatements = ((SentencaContext)_localctx).pfalsa.statements;
					}
				}

				setState(335);
				match(FIMSE);
				SeStatement seStatement = new SeStatement(((SentencaContext)_localctx).expressao.expression, thenStatements, elseStatements);
								    ((SentencaContext)_localctx).statement =  seStatement;
								   
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(338);
				((SentencaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				TabSimRecord recIdTabSim = a20((((SentencaContext)_localctx).IDENTIFICADOR!=null?((SentencaContext)_localctx).IDENTIFICADOR.getText():null), ((SentencaContext)_localctx).IDENTIFICADOR.getLine(), ((SentencaContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
				setState(340);
				match(T__2);
				setState(341);
				((SentencaContext)_localctx).expressao = expressao();
				// Se retornou um identificador é porque não ocorreu nenhum erro
								    if (recIdTabSim != null) {
										// Verifica os tipos do identificador e da expressão são compatíveis.
										// Está esperando um inteiro, mas encontrou um real.
										// Informa que o valor será truncado
										if (recIdTabSim.getType() == Type.INTEIRO && ((SentencaContext)_localctx).expressao.typeExpression == Type.REAL) {
											showError(((SentencaContext)_localctx).IDENTIFICADOR.getLine(), ((SentencaContext)_localctx).IDENTIFICADOR.getCharPositionInLine(), "type conflict. Waiting a INTEIRO, but found a REAL. Warning: the value will be truncated.");
										}
										else 
										if (recIdTabSim.getType() == Type.REAL && ((SentencaContext)_localctx).expressao.typeExpression == Type.INTEIRO) {
											// Do nothing.
										}
										else
										if (recIdTabSim.getType() != ((SentencaContext)_localctx).expressao.typeExpression) {
											// Mostra a mensagem de erro de conflito de tipos
											showError(((SentencaContext)_localctx).IDENTIFICADOR.getLine(), ((SentencaContext)_localctx).IDENTIFICADOR.getCharPositionInLine(), "type conflict. Expected a " + recIdTabSim.getType().name() + " type. Found a " + ((SentencaContext)_localctx).expressao.typeExpression.name() + " expression.");
											erro = true;
										}
									}	
									AtribuicaoStatement atribuicaoStatement = new AtribuicaoStatement(recIdTabSim, ((SentencaContext)_localctx).expressao.expression);
									((SentencaContext)_localctx).statement =  atribuicaoStatement;
								  
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(344);
				((SentencaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				TabSimRecord recIdTabSim = a21((((SentencaContext)_localctx).IDENTIFICADOR!=null?((SentencaContext)_localctx).IDENTIFICADOR.getText():null), ((SentencaContext)_localctx).IDENTIFICADOR.getLine(), ((SentencaContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
								   
				ArrayList<Object> args = new ArrayList<>();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTESE_ESQUERDO) {
					{
					setState(347);
					((SentencaContext)_localctx).argumentos = argumentos();
					args = ((SentencaContext)_localctx).argumentos.listArgs;
					}
				}

				// Verifica se os tipos das expressões são consistentes
								    // com os tipos dos parâmetros declarados
									a26(recIdTabSim, args, ((SentencaContext)_localctx).IDENTIFICADOR.getLine(), ((SentencaContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
								    CallStatement callStatement = new CallStatement(recIdTabSim, args);
								    ((SentencaContext)_localctx).statement =  callStatement;
								   
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassoparaContext extends ParserRuleContext {
		public Object passo = 1;
		public Type type = Type.NONE;
		public Token NUMERO_INTEIRO;
		public Token NUMERO_REAL;
		public TerminalNode NUMERO_INTEIRO() { return getToken(AlgoParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_REAL() { return getToken(AlgoParser.NUMERO_REAL, 0); }
		public PassoparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passopara; }
	}

	public final PassoparaContext passopara() throws RecognitionException {
		PassoparaContext _localctx = new PassoparaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_passopara);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO_INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((PassoparaContext)_localctx).NUMERO_INTEIRO = match(NUMERO_INTEIRO);
				((PassoparaContext)_localctx).passo =  (((PassoparaContext)_localctx).NUMERO_INTEIRO!=null?Integer.valueOf(((PassoparaContext)_localctx).NUMERO_INTEIRO.getText()):0); ((PassoparaContext)_localctx).type =  Type.INTEIRO;
				}
				break;
			case NUMERO_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				((PassoparaContext)_localctx).NUMERO_REAL = match(NUMERO_REAL);
				((PassoparaContext)_localctx).passo =  Double.parseDouble((((PassoparaContext)_localctx).NUMERO_REAL!=null?((PassoparaContext)_localctx).NUMERO_REAL.getText():null)); ((PassoparaContext)_localctx).type =  Type.REAL;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentosContext extends ParserRuleContext {
		public ArrayList<Object> listArgs = new ArrayList<>();
		public ExpressaoContext expressao;
		public TerminalNode PARENTESE_ESQUERDO() { return getToken(AlgoParser.PARENTESE_ESQUERDO, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode PARENTESE_DIREITO() { return getToken(AlgoParser.PARENTESE_DIREITO, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(AlgoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlgoParser.VIRGULA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(PARENTESE_ESQUERDO);
			setState(362);
			((ArgumentosContext)_localctx).expressao = expressao();
			_localctx.listArgs.add(((ArgumentosContext)_localctx).expressao.expression);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(364);
				match(VIRGULA);
				setState(365);
				((ArgumentosContext)_localctx).expressao = expressao();
				_localctx.listArgs.add(((ArgumentosContext)_localctx).expressao.expression);
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(PARENTESE_DIREITO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PfalsaContext extends ParserRuleContext {
		public ArrayList<Object> statements = null;
		public SentencaContext sentenca;
		public TerminalNode SENAO() { return getToken(AlgoParser.SENAO, 0); }
		public List<SentencaContext> sentenca() {
			return getRuleContexts(SentencaContext.class);
		}
		public SentencaContext sentenca(int i) {
			return getRuleContext(SentencaContext.class,i);
		}
		public PfalsaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pfalsa; }
	}

	public final PfalsaContext pfalsa() throws RecognitionException {
		PfalsaContext _localctx = new PfalsaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pfalsa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(SENAO);
			((PfalsaContext)_localctx).statements =  new ArrayList<>();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << ESCREVAL) | (1L << PARA) | (1L << REPITA) | (1L << ENQUANTO) | (1L << SE) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(377);
				((PfalsaContext)_localctx).sentenca = sentenca();
				_localctx.statements.add(((PfalsaContext)_localctx).sentenca.statement);
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public Object expression = null;
		public Type typeExpression = Type.NONE;
		public SimpleExpressionContext simpleExpression;
		public Token operator;
		public ExpressaoContext expressao;
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(AlgoParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(AlgoParser.DIFERENTE, 0); }
		public TerminalNode MENOR() { return getToken(AlgoParser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(AlgoParser.MENOR_IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(AlgoParser.MAIOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(AlgoParser.MAIOR_IGUAL, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((ExpressaoContext)_localctx).simpleExpression = simpleExpression();
			((ExpressaoContext)_localctx).expression =  ((ExpressaoContext)_localctx).simpleExpression.value; 
							    ((ExpressaoContext)_localctx).typeExpression =  ((ExpressaoContext)_localctx).simpleExpression.typeValue;
							   
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL) | (1L << DIFERENTE))) != 0)) {
				{
				setState(387);
				((ExpressaoContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL) | (1L << DIFERENTE))) != 0)) ) {
					((ExpressaoContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(388);
				((ExpressaoContext)_localctx).expressao = expressao();
				// Verifica se os tipos são INTEIRO ou REAL para as expressões esquerda e direita)
									 if(((ExpressaoContext)_localctx).simpleExpression.typeValue != Type.INTEIRO && ((ExpressaoContext)_localctx).simpleExpression.typeValue != Type.REAL) {
				 					    showError(((ExpressaoContext)_localctx).operator.getLine(), ((ExpressaoContext)_localctx).operator.getCharPositionInLine(), "invalid type of the first operand for the relational expression. The expression must be of INTEIRO or REAL type.");
									    erro = true;
									    ((ExpressaoContext)_localctx).typeExpression =  Type.NONE;					
									 }
									 else
									 if(((ExpressaoContext)_localctx).expressao.typeExpression != Type.INTEIRO && ((ExpressaoContext)_localctx).expressao.typeExpression != Type.REAL) {
				 					    showError(((ExpressaoContext)_localctx).operator.getLine(), ((ExpressaoContext)_localctx).operator.getCharPositionInLine(), "invalid type of the second operand for the relational expression. The expression must be of INTEIRO or REAL type.");
									    erro = true;
									    ((ExpressaoContext)_localctx).typeExpression =  Type.NONE;					
									 }
									 else {
										// A expressão resultante é do tipo LOGICO
										((ExpressaoContext)_localctx).typeExpression =  Type.LOGICO;
										// É o operador de IGUAL. Então cria uma expressão de IGUALDADE
										if ((((ExpressaoContext)_localctx).operator!=null?((ExpressaoContext)_localctx).operator.getType():0) == IGUAL)
											((ExpressaoContext)_localctx).expression =  new Expressao(Expressao.IGUAL, Type.LOGICO, ((ExpressaoContext)_localctx).simpleExpression.value, ((ExpressaoContext)_localctx).expressao.expression);
										else
										// É o operador de MENOR. Então cria uma expressão de MENOR
										if ((((ExpressaoContext)_localctx).operator!=null?((ExpressaoContext)_localctx).operator.getType():0) == MENOR)
											((ExpressaoContext)_localctx).expression =  new Expressao(Expressao.MENOR, Type.LOGICO, ((ExpressaoContext)_localctx).simpleExpression.value, ((ExpressaoContext)_localctx).expressao.expression);
										else
										// É o operador de MENOR ou IGUAL. Então cria uma expressão de MENOR ou IGUAL
										if ((((ExpressaoContext)_localctx).operator!=null?((ExpressaoContext)_localctx).operator.getType():0) == MENOR_IGUAL)
											((ExpressaoContext)_localctx).expression =  new Expressao(Expressao.MENOR_IGUAL, Type.LOGICO, ((ExpressaoContext)_localctx).simpleExpression.value, ((ExpressaoContext)_localctx).expressao.expression);
										else
										// É o operador de MAIOR. Então cria uma expressão de MAIOR
										if ((((ExpressaoContext)_localctx).operator!=null?((ExpressaoContext)_localctx).operator.getType():0) == MAIOR)
											((ExpressaoContext)_localctx).expression =  new Expressao(Expressao.MAIOR, Type.LOGICO, ((ExpressaoContext)_localctx).simpleExpression.value, ((ExpressaoContext)_localctx).expressao.expression);
										else
										// É o operador de MAIOR ou IGUAL. Então cria uma expressão de MAIOR ou IGUAL
										if ((((ExpressaoContext)_localctx).operator!=null?((ExpressaoContext)_localctx).operator.getType():0) == MAIOR_IGUAL)
											((ExpressaoContext)_localctx).expression =  new Expressao(Expressao.MAIOR_IGUAL, Type.LOGICO, ((ExpressaoContext)_localctx).simpleExpression.value, ((ExpressaoContext)_localctx).expressao.expression);
										else
										// É o operador de DIFERENTE. Então cria uma expressão de DIFERENTE
										if ((((ExpressaoContext)_localctx).operator!=null?((ExpressaoContext)_localctx).operator.getType():0) == DIFERENTE)
											((ExpressaoContext)_localctx).expression =  new Expressao(Expressao.DIFERENTE, Type.LOGICO, ((ExpressaoContext)_localctx).simpleExpression.value, ((ExpressaoContext)_localctx).expressao.expression);
				                     }
								    
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(AlgoParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(AlgoParser.DIFERENTE, 0); }
		public TerminalNode MENOR() { return getToken(AlgoParser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(AlgoParser.MENOR_IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(AlgoParser.MAIOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(AlgoParser.MAIOR_IGUAL, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL) | (1L << DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public Object value = null;
		public Type typeValue = Type.NONE;
		public TermContext term;
		public Token operator;
		public SimpleExpressionContext simpleExpression;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode ADICAO() { return getToken(AlgoParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(AlgoParser.SUBTRACAO, 0); }
		public TerminalNode OU() { return getToken(AlgoParser.OU, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			((SimpleExpressionContext)_localctx).term = term();
			((SimpleExpressionContext)_localctx).value =  ((SimpleExpressionContext)_localctx).term.value; 
							    ((SimpleExpressionContext)_localctx).typeValue =  ((SimpleExpressionContext)_localctx).term.typeValue;
							   
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OU) | (1L << ADICAO) | (1L << SUBTRACAO))) != 0)) {
				{
				setState(397);
				((SimpleExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OU) | (1L << ADICAO) | (1L << SUBTRACAO))) != 0)) ) {
					((SimpleExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(398);
				((SimpleExpressionContext)_localctx).simpleExpression = simpleExpression();
				// Verifica se o operador é um OU. 
								    // Neste caso, os dois operandos devem ser lógicos
									if((((SimpleExpressionContext)_localctx).operator!=null?((SimpleExpressionContext)_localctx).operator.getType():0) == OU) {
									   if (((SimpleExpressionContext)_localctx).term.typeValue != Type.LOGICO) {
										   showError(((SimpleExpressionContext)_localctx).operator.getLine(), ((SimpleExpressionContext)_localctx).operator.getCharPositionInLine(), "invalid type of the first expression for the OU operator. The expression must be of LOGICO type.");
									       erro = true;
									       ((SimpleExpressionContext)_localctx).typeValue =  Type.NONE;					
									   }
									   else 
									   if (((SimpleExpressionContext)_localctx).simpleExpression.typeValue != Type.LOGICO) {
										   showError(((SimpleExpressionContext)_localctx).operator.getLine(), ((SimpleExpressionContext)_localctx).operator.getCharPositionInLine(), "invalid type of the second expression for the OU operator. The expression must be of LOGICO type.");
									       erro = true;
									       ((SimpleExpressionContext)_localctx).typeValue =  Type.NONE;					
									   }
									   else {
									      ((SimpleExpressionContext)_localctx).value =  new Expressao(Expressao.OU, Type.LOGICO, ((SimpleExpressionContext)_localctx).term.value, ((SimpleExpressionContext)_localctx).simpleExpression.value);	
										  ((SimpleExpressionContext)_localctx).typeValue =  Type.LOGICO;
									   }
									}
									else {
								       // Verifica a consistência de tipos de dados e faz a promoção ou emite uma mensagem de erro
								       if(((SimpleExpressionContext)_localctx).term.typeValue == Type.INTEIRO && ((SimpleExpressionContext)_localctx).simpleExpression.typeValue == Type.INTEIRO) 
									      ((SimpleExpressionContext)_localctx).typeValue =  Type.INTEIRO;
									   else
								       if(((SimpleExpressionContext)_localctx).term.typeValue == Type.REAL && ((SimpleExpressionContext)_localctx).simpleExpression.typeValue == Type.REAL) 
									      ((SimpleExpressionContext)_localctx).typeValue =  Type.REAL;
									   else
								       if(((SimpleExpressionContext)_localctx).term.typeValue == Type.INTEIRO && ((SimpleExpressionContext)_localctx).simpleExpression.typeValue == Type.REAL ||
									      ((SimpleExpressionContext)_localctx).term.typeValue == Type.REAL && ((SimpleExpressionContext)_localctx).simpleExpression.typeValue == Type.INTEIRO)
									      ((SimpleExpressionContext)_localctx).typeValue =  Type.REAL;
									   else
									   // Se uma das expressões é CARACTER, então emite mensagem de erro
									   if(((SimpleExpressionContext)_localctx).term.typeValue == Type.CARACTER || ((SimpleExpressionContext)_localctx).simpleExpression.typeValue == Type.CARACTER ||
									      ((SimpleExpressionContext)_localctx).term.typeValue == Type.LOGICO || ((SimpleExpressionContext)_localctx).simpleExpression.typeValue == Type.LOGICO) {
								          showError(((SimpleExpressionContext)_localctx).operator.getLine(), ((SimpleExpressionContext)_localctx).operator.getCharPositionInLine(), "invalid expressions for the operator.");
									      erro = true;
									      ((SimpleExpressionContext)_localctx).typeValue =  Type.NONE;					
									   }
									   else
									   // Se os tipos são diferentes, emite mensagem de erro
									   if(((SimpleExpressionContext)_localctx).term.typeValue != ((SimpleExpressionContext)_localctx).simpleExpression.typeValue) {
								          showError(((SimpleExpressionContext)_localctx).operator.getLine(), ((SimpleExpressionContext)_localctx).operator.getCharPositionInLine(), "type conflict for the expressions.");
									      erro = true;
									      ((SimpleExpressionContext)_localctx).typeValue =  Type.NONE;
									   }				   
								       // É o operador de adição. Então cria uma expressão de adição
									   if ((((SimpleExpressionContext)_localctx).operator!=null?((SimpleExpressionContext)_localctx).operator.getType():0) == ADICAO)
									      ((SimpleExpressionContext)_localctx).value =  new Expressao(Expressao.ADICAO, _localctx.typeValue, ((SimpleExpressionContext)_localctx).term.value, ((SimpleExpressionContext)_localctx).simpleExpression.value);
									   else
								       // É o operador de subtracao. Então cria uma expressão de subtração
								       if ((((SimpleExpressionContext)_localctx).operator!=null?((SimpleExpressionContext)_localctx).operator.getType():0) == SUBTRACAO)
									      ((SimpleExpressionContext)_localctx).value =  new Expressao(Expressao.SUBTRACAO, _localctx.typeValue, ((SimpleExpressionContext)_localctx).term.value, ((SimpleExpressionContext)_localctx).simpleExpression.value);
								    }
								   
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(AlgoParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(AlgoParser.SUBTRACAO, 0); }
		public TerminalNode OU() { return getToken(AlgoParser.OU, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OU) | (1L << ADICAO) | (1L << SUBTRACAO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Object value = null;
		public Type typeValue = Type.NONE;
		public SignedFactorContext signedFactor;
		public Token operator;
		public TermContext term;
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULTIPLICACAO() { return getToken(AlgoParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(AlgoParser.DIVISAO, 0); }
		public TerminalNode E() { return getToken(AlgoParser.E, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			((TermContext)_localctx).signedFactor = signedFactor();
			((TermContext)_localctx).value =  ((TermContext)_localctx).signedFactor.value; 
							   ((TermContext)_localctx).typeValue =  ((TermContext)_localctx).signedFactor.typeValue;
							  
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E) | (1L << MULTIPLICACAO) | (1L << DIVISAO))) != 0)) {
				{
				setState(407);
				((TermContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E) | (1L << MULTIPLICACAO) | (1L << DIVISAO))) != 0)) ) {
					((TermContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(408);
				((TermContext)_localctx).term = term();
				// Verifica se é o operador lógico E
									if((((TermContext)_localctx).operator!=null?((TermContext)_localctx).operator.getType():0) == E) {
									   // Os tipos para o operador E devem ser LOGICO
									   if (((TermContext)_localctx).signedFactor.typeValue != Type.LOGICO) {
										   showError(((TermContext)_localctx).operator.getLine(), ((TermContext)_localctx).operator.getCharPositionInLine(), "invalid type of the first expression for the E operator. The expression must be of LOGICO type.");
									       erro = true;
									       ((TermContext)_localctx).typeValue =  Type.NONE;					
									   }
									   else 
									   if (((TermContext)_localctx).term.typeValue != Type.LOGICO) {
										   showError(((TermContext)_localctx).operator.getLine(), ((TermContext)_localctx).operator.getCharPositionInLine(), "invalid type of the second expression for the E operator. The expression must be of LOGICO type.");
									       erro = true;
									       ((TermContext)_localctx).typeValue =  Type.NONE;					
									   }
									   else {
									      ((TermContext)_localctx).value =  new Expressao(Expressao.E, Type.LOGICO, ((TermContext)_localctx).signedFactor.value, ((TermContext)_localctx).term.value);	
										  ((TermContext)_localctx).typeValue =  Type.LOGICO;
									   }
									}
									else {
								       // Verifica a consistência de tipos de dados e faz a promoção ou emite uma mensagem de erro
								       if(((TermContext)_localctx).signedFactor.typeValue == Type.INTEIRO && ((TermContext)_localctx).term.typeValue == Type.INTEIRO) 
									      ((TermContext)_localctx).typeValue =  Type.INTEIRO;
									   else
								       if(((TermContext)_localctx).signedFactor.typeValue == Type.REAL && ((TermContext)_localctx).term.typeValue == Type.REAL) 
									      ((TermContext)_localctx).typeValue =  Type.REAL;
									   else
								       if(((TermContext)_localctx).signedFactor.typeValue == Type.INTEIRO && ((TermContext)_localctx).term.typeValue == Type.REAL ||
									      ((TermContext)_localctx).signedFactor.typeValue == Type.REAL && ((TermContext)_localctx).term.typeValue == Type.INTEIRO)
									      ((TermContext)_localctx).typeValue =  Type.REAL;
									   else
									   // Se uma das expressões é CARACTER, então emite mensagem de erro
									   if(((TermContext)_localctx).signedFactor.typeValue == Type.CARACTER || ((TermContext)_localctx).term.typeValue == Type.CARACTER || 
									      ((TermContext)_localctx).signedFactor.typeValue == Type.LOGICO || ((TermContext)_localctx).term.typeValue == Type.LOGICO) {
								          showError(((TermContext)_localctx).operator.getLine(), ((TermContext)_localctx).operator.getCharPositionInLine(), "invalid expressions for the operator.");
									      erro = true;
									      ((TermContext)_localctx).typeValue =  Type.NONE;					
									   }
									   else
									   // Se os tipos são diferentes, emite mensagem de erro
									   if(((TermContext)_localctx).signedFactor.typeValue != ((TermContext)_localctx).term.typeValue) {
								          showError(((TermContext)_localctx).operator.getLine(), ((TermContext)_localctx).operator.getCharPositionInLine(), "type conflict for the expressions.");
									      erro = true;
									      ((TermContext)_localctx).typeValue =  Type.NONE;
									   }				   
								       // É o operador de adição. Então cria uma expressão de adição
									   if ((((TermContext)_localctx).operator!=null?((TermContext)_localctx).operator.getType():0) == MULTIPLICACAO)
									      ((TermContext)_localctx).value =  new Expressao(Expressao.MULTIPLICACAO, _localctx.typeValue, ((TermContext)_localctx).signedFactor.value, ((TermContext)_localctx).term.value);
									   else
								       // É o operador de subtracao. Então cria uma expressão de subtração
								       if ((((TermContext)_localctx).operator!=null?((TermContext)_localctx).operator.getType():0) == DIVISAO)
									      ((TermContext)_localctx).value =  new Expressao(Expressao.DIVISAO, _localctx.typeValue, ((TermContext)_localctx).signedFactor.value, ((TermContext)_localctx).term.value);
								    }
								   
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(AlgoParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(AlgoParser.DIVISAO, 0); }
		public TerminalNode E() { return getToken(AlgoParser.E, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E) | (1L << MULTIPLICACAO) | (1L << DIVISAO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorContext extends ParserRuleContext {
		public Object value = null;
		public Type typeValue = Type.NONE;
		public Token SUBTRACAO;
		public FactorContext factor;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ADICAO() { return getToken(AlgoParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(AlgoParser.SUBTRACAO, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_signedFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			boolean subtracao = false;
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADICAO:
				{
				setState(416);
				match(ADICAO);
				}
				break;
			case SUBTRACAO:
				{
				setState(417);
				((SignedFactorContext)_localctx).SUBTRACAO = match(SUBTRACAO);
				subtracao = true;
				}
				break;
			case VERDADEIRO:
			case FALSO:
			case NAO:
			case PARENTESE_ESQUERDO:
			case IDENTIFICADOR:
			case NUMERO_INTEIRO:
			case NUMERO_REAL:
			case STRING:
				break;
			default:
				break;
			}
			setState(421);
			((SignedFactorContext)_localctx).factor = factor();
			// É o operador unário UMINUS
							    if (subtracao) {
							       // Consiste o tipo de dados, que tem que ser INTEIRO ou REAL
								   if(((SignedFactorContext)_localctx).factor.typeValue != Type.INTEIRO && ((SignedFactorContext)_localctx).factor.typeValue != Type.REAL) {
									  showError(((SignedFactorContext)_localctx).SUBTRACAO.getLine(), ((SignedFactorContext)_localctx).SUBTRACAO.getCharPositionInLine(), "type conflict for the expression. The expression must be INTEIRO or REAL.");
								      erro = true;
								      ((SignedFactorContext)_localctx).typeValue =  Type.NONE;
								   }
								   else {
								      // Cria a expressão
								      ((SignedFactorContext)_localctx).value =  new Expressao(Expressao.UMINUS, ((SignedFactorContext)_localctx).factor.typeValue, ((SignedFactorContext)_localctx).factor.value, null);
								      ((SignedFactorContext)_localctx).typeValue =  ((SignedFactorContext)_localctx).factor.typeValue;
								   }
								}
								// Não é o UMINUS
								else {
								   ((SignedFactorContext)_localctx).value =  ((SignedFactorContext)_localctx).factor.value;
								   ((SignedFactorContext)_localctx).typeValue =  ((SignedFactorContext)_localctx).factor.typeValue;
								}
							   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Object value = null;
		public Type typeValue = Type.NONE;
		public Token IDENTIFICADOR;
		public ParameterListContext parameterList;
		public ExpressaoContext expressao;
		public UnsignedConstantContext unsignedConstant;
		public Token NAO;
		public FactorContext factor;
		public BooleanoContext booleano;
		public TerminalNode IDENTIFICADOR() { return getToken(AlgoParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENTESE_ESQUERDO() { return getToken(AlgoParser.PARENTESE_ESQUERDO, 0); }
		public TerminalNode PARENTESE_DIREITO() { return getToken(AlgoParser.PARENTESE_DIREITO, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode NAO() { return getToken(AlgoParser.NAO, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		int _la;
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				((FactorContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				TabSimRecord rec = a23((((FactorContext)_localctx).IDENTIFICADOR!=null?((FactorContext)_localctx).IDENTIFICADOR.getText():null), ((FactorContext)_localctx).IDENTIFICADOR.getLine(), ((FactorContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
								    ((FactorContext)_localctx).value =  rec;
									((FactorContext)_localctx).typeValue =  rec.getType(); 
								   
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				((FactorContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(427);
				match(PARENTESE_ESQUERDO);
				TabSimRecord rec = a24((((FactorContext)_localctx).IDENTIFICADOR!=null?((FactorContext)_localctx).IDENTIFICADOR.getText():null), ((FactorContext)_localctx).IDENTIFICADOR.getLine(), ((FactorContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
								    ArrayList<Object> args = new ArrayList<>();
								   
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VERDADEIRO) | (1L << FALSO) | (1L << NAO) | (1L << PARENTESE_ESQUERDO) | (1L << ADICAO) | (1L << SUBTRACAO) | (1L << IDENTIFICADOR) | (1L << NUMERO_INTEIRO) | (1L << NUMERO_REAL) | (1L << STRING))) != 0)) {
					{
					setState(429);
					((FactorContext)_localctx).parameterList = parameterList();
					args = ((FactorContext)_localctx).parameterList.listArgs;
					}
				}

				setState(434);
				match(PARENTESE_DIREITO);
				// Verifica se os tipos das expressões e dos parâmetros declarados são consistentes
				   				    a26(rec, args, ((FactorContext)_localctx).IDENTIFICADOR.getLine(), ((FactorContext)_localctx).IDENTIFICADOR.getCharPositionInLine());
									((FactorContext)_localctx).value =  new CallStatement(rec, args);
								    ((FactorContext)_localctx).typeValue =  rec.getType();
								   
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(PARENTESE_ESQUERDO);
				setState(437);
				((FactorContext)_localctx).expressao = expressao();
				((FactorContext)_localctx).value =  ((FactorContext)_localctx).expressao.expression; 
								    ((FactorContext)_localctx).typeValue =  ((FactorContext)_localctx).expressao.typeExpression;
								   
				setState(439);
				match(PARENTESE_DIREITO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				((FactorContext)_localctx).unsignedConstant = unsignedConstant();
				((FactorContext)_localctx).value =  ((FactorContext)_localctx).unsignedConstant.value; 
								    ((FactorContext)_localctx).typeValue =  ((FactorContext)_localctx).unsignedConstant.typeValue;
								   
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				((FactorContext)_localctx).NAO = match(NAO);
				setState(445);
				((FactorContext)_localctx).factor = factor();
				// Se o tipo do fator não é lógico, então emite uma mensagem de conflito de tipos
								    if(((FactorContext)_localctx).factor.typeValue != Type.LOGICO) {
								       showError(((FactorContext)_localctx).NAO.getLine(), ((FactorContext)_localctx).NAO.getCharPositionInLine(), "type conflict for the operator NAO. The expression must be of LOGICO type.");
									   erro = true;
									   ((FactorContext)_localctx).typeValue =  Type.NONE;
								    }
									else {
								       ((FactorContext)_localctx).value =  new Expressao(Expressao.NAO, Type.LOGICO, ((FactorContext)_localctx).factor.value, null);
								       ((FactorContext)_localctx).typeValue =  Type.LOGICO;
									}
								   
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				((FactorContext)_localctx).booleano = booleano();
				((FactorContext)_localctx).value =  ((FactorContext)_localctx).booleano.value; 
								    ((FactorContext)_localctx).typeValue =  Type.LOGICO;
								   
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanoContext extends ParserRuleContext {
		public boolean value;
		public TerminalNode VERDADEIRO() { return getToken(AlgoParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(AlgoParser.FALSO, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleano);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(VERDADEIRO);
				((BooleanoContext)_localctx).value =  true;
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(FALSO);
				((BooleanoContext)_localctx).value =  false;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantContext extends ParserRuleContext {
		public Object value = null;
		public Type typeValue = Type.NONE;
		public Token NUMERO_INTEIRO;
		public Token NUMERO_REAL;
		public Token STRING;
		public TerminalNode NUMERO_INTEIRO() { return getToken(AlgoParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_REAL() { return getToken(AlgoParser.NUMERO_REAL, 0); }
		public TerminalNode STRING() { return getToken(AlgoParser.STRING, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unsignedConstant);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO_INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				((UnsignedConstantContext)_localctx).NUMERO_INTEIRO = match(NUMERO_INTEIRO);
				((UnsignedConstantContext)_localctx).value =  (((UnsignedConstantContext)_localctx).NUMERO_INTEIRO!=null?Integer.valueOf(((UnsignedConstantContext)_localctx).NUMERO_INTEIRO.getText()):0); ((UnsignedConstantContext)_localctx).typeValue =  Type.INTEIRO;
				}
				break;
			case NUMERO_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				((UnsignedConstantContext)_localctx).NUMERO_REAL = match(NUMERO_REAL);
				((UnsignedConstantContext)_localctx).value =  Double.parseDouble((((UnsignedConstantContext)_localctx).NUMERO_REAL!=null?((UnsignedConstantContext)_localctx).NUMERO_REAL.getText():null)); ((UnsignedConstantContext)_localctx).typeValue =  Type.REAL;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				((UnsignedConstantContext)_localctx).STRING = match(STRING);
				((UnsignedConstantContext)_localctx).value =  ((String)((UnsignedConstantContext)_localctx).STRING.getText()).substring(1, ((String)((UnsignedConstantContext)_localctx).STRING.getText()).length() - 1); ((UnsignedConstantContext)_localctx).typeValue =  Type.CARACTER;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ArrayList<Object> listArgs = new ArrayList<>();
		public ExpressaoContext expressao;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlgoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlgoParser.VIRGULA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			((ParameterListContext)_localctx).expressao = expressao();
			_localctx.listArgs.add(((ParameterListContext)_localctx).expressao.expression);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(469);
				match(VIRGULA);
				setState(470);
				((ParameterListContext)_localctx).expressao = expressao();
				_localctx.listArgs.add(((ParameterListContext)_localctx).expressao.expression);
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u01df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001"+
		"\u0005\u0001E\b\u0001\n\u0001\f\u0001H\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001N\b\u0001\n\u0001\f\u0001Q\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002W\b\u0002"+
		"\u000b\u0002\f\u0002X\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005"+
		"\n\u0005\f\u0005r\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006v\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u007f\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0083\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u008a\b\u0007\n\u0007\f\u0007\u008d\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0099\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a0"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a7\b\b\n\b\f\b"+
		"\u00aa\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t\u00b1\b\t\u000b"+
		"\t\f\t\u00b2\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c2\b\n\n\n\f\n\u00c5"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00cc\b\u000b\n\u000b\f\u000b\u00cf\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00d6\b\f\n\f\f\f\u00d9\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e1\b\r\n\r\f\r\u00e4\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0106\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u010b\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0110\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0117\b\u000e\n\u000e\f\u000e\u011a\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0124\b\u000e\n\u000e\f\u000e\u0127\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0135\b\u000e\n\u000e\f\u000e\u0138\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0145\b\u000e\n\u000e"+
		"\f\u000e\u0148\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u014e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u015f\b\u000e\u0001\u000e\u0003\u000e\u0162\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0168\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0171\b\u0010\n\u0010\f\u0010\u0174\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u017d\b\u0011\n\u0011\f\u0011\u0180\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0188\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0192\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u019c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01a4\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01b1\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01c4\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01ca\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01d2\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01da\b\u001c\n\u001c\f\u001c\u01dd\t\u001c"+
		"\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0003\u0001"+
		"\u0000*/\u0002\u0000&&23\u0002\u0000%%01\u01f8\u0000:\u0001\u0000\u0000"+
		"\u0000\u0002A\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006"+
		"Z\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000"+
		"\u0000\fu\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010"+
		"\u0091\u0001\u0000\u0000\u0000\u0012\u00ae\u0001\u0000\u0000\u0000\u0014"+
		"\u00b7\u0001\u0000\u0000\u0000\u0016\u00c6\u0001\u0000\u0000\u0000\u0018"+
		"\u00d0\u0001\u0000\u0000\u0000\u001a\u00da\u0001\u0000\u0000\u0000\u001c"+
		"\u0161\u0001\u0000\u0000\u0000\u001e\u0167\u0001\u0000\u0000\u0000 \u0169"+
		"\u0001\u0000\u0000\u0000\"\u0177\u0001\u0000\u0000\u0000$\u0181\u0001"+
		"\u0000\u0000\u0000&\u0189\u0001\u0000\u0000\u0000(\u018b\u0001\u0000\u0000"+
		"\u0000*\u0193\u0001\u0000\u0000\u0000,\u0195\u0001\u0000\u0000\u0000."+
		"\u019d\u0001\u0000\u0000\u00000\u019f\u0001\u0000\u0000\u00002\u01c3\u0001"+
		"\u0000\u0000\u00004\u01c9\u0001\u0000\u0000\u00006\u01d1\u0001\u0000\u0000"+
		"\u00008\u01d3\u0001\u0000\u0000\u0000:;\u0006\u0000\uffff\uffff\u0000"+
		";<\u0005\u0004\u0000\u0000<=\u00057\u0000\u0000=>\u0006\u0000\uffff\uffff"+
		"\u0000>?\u0003\u0002\u0001\u0000?\u0001\u0001\u0000\u0000\u0000@B\u0003"+
		"\u0004\u0002\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BF\u0001\u0000\u0000\u0000CE\u0003\f\u0006\u0000DC\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IO\u0005\u0005"+
		"\u0000\u0000JK\u0003\u001c\u000e\u0000KL\u0006\u0001\uffff\uffff\u0000"+
		"LN\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005\u0006\u0000\u0000S\u0003"+
		"\u0001\u0000\u0000\u0000TV\u0005\u0007\u0000\u0000UW\u0003\u0006\u0003"+
		"\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0005\u0001\u0000\u0000\u0000"+
		"Z[\u0003\n\u0005\u0000[\\\u0005\u0001\u0000\u0000\\]\u0003\b\u0004\u0000"+
		"]^\u0006\u0003\uffff\uffff\u0000^\u0007\u0001\u0000\u0000\u0000_`\u0005"+
		"\b\u0000\u0000`h\u0006\u0004\uffff\uffff\u0000ab\u0005\t\u0000\u0000b"+
		"h\u0006\u0004\uffff\uffff\u0000cd\u0005\n\u0000\u0000dh\u0006\u0004\uffff"+
		"\uffff\u0000ef\u0005\u000b\u0000\u0000fh\u0006\u0004\uffff\uffff\u0000"+
		"g_\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000\u0000ij\u00054\u0000"+
		"\u0000jp\u0006\u0005\uffff\uffff\u0000kl\u0005)\u0000\u0000lm\u00054\u0000"+
		"\u0000mo\u0006\u0005\uffff\uffff\u0000nk\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"q\u000b\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sv\u0003\u000e"+
		"\u0007\u0000tv\u0003\u0010\b\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000"+
		"\u0000\u0000v\r\u0001\u0000\u0000\u0000wx\u0005\f\u0000\u0000xy\u0005"+
		"4\u0000\u0000yz\u0006\u0007\uffff\uffff\u0000z~\u0006\u0007\uffff\uffff"+
		"\u0000{|\u0003\u0012\t\u0000|}\u0006\u0007\uffff\uffff\u0000}\u007f\u0001"+
		"\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0006\u0007\uffff"+
		"\uffff\u0000\u0081\u0083\u0003\u0004\u0002\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\u0005\u0000\u0000\u0085\u008b\u0006\u0007"+
		"\uffff\uffff\u0000\u0086\u0087\u0003\u001c\u000e\u0000\u0087\u0088\u0006"+
		"\u0007\uffff\uffff\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0086"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\r\u0000\u0000\u008f\u0090\u0006\u0007\uffff\uffff\u0000\u0090\u000f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u000e\u0000\u0000\u0092\u0093"+
		"\u00054\u0000\u0000\u0093\u0094\u0006\b\uffff\uffff\u0000\u0094\u0098"+
		"\u0006\b\uffff\uffff\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096\u0097"+
		"\u0006\b\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0006\b\uffff\uffff\u0000\u009b\u009c"+
		"\u0005\u0001\u0000\u0000\u009c\u009d\u0003\b\u0004\u0000\u009d\u009f\u0006"+
		"\b\uffff\uffff\u0000\u009e\u00a0\u0003\u0004\u0002\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\u0005\u0000\u0000\u00a2\u00a8\u0006"+
		"\b\uffff\uffff\u0000\u00a3\u00a4\u0003\u001c\u000e\u0000\u00a4\u00a5\u0006"+
		"\b\uffff\uffff\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"\u000f\u0000\u0000\u00ac\u00ad\u0006\b\uffff\uffff\u0000\u00ad\u0011\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0005\'\u0000\u0000\u00af\u00b1\u0003\u0014"+
		"\n\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005(\u0000\u0000"+
		"\u00b5\u00b6\u0006\t\uffff\uffff\u0000\u00b6\u0013\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0003\u0016\u000b\u0000\u00b8\u00b9\u0005\u0001\u0000\u0000"+
		"\u00b9\u00ba\u0003\b\u0004\u0000\u00ba\u00c3\u0006\n\uffff\uffff\u0000"+
		"\u00bb\u00bc\u0005\u0002\u0000\u0000\u00bc\u00bd\u0003\u0016\u000b\u0000"+
		"\u00bd\u00be\u0005\u0001\u0000\u0000\u00be\u00bf\u0003\b\u0004\u0000\u00bf"+
		"\u00c0\u0006\n\uffff\uffff\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u0015\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u00054\u0000\u0000\u00c7\u00cd\u0006\u000b\uffff\uffff\u0000\u00c8"+
		"\u00c9\u0005)\u0000\u0000\u00c9\u00ca\u00054\u0000\u0000\u00ca\u00cc\u0006"+
		"\u000b\uffff\uffff\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u0017\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u00054\u0000\u0000\u00d1\u00d7\u0006"+
		"\f\uffff\uffff\u0000\u00d2\u00d3\u0005)\u0000\u0000\u00d3\u00d4\u0005"+
		"4\u0000\u0000\u00d4\u00d6\u0006\f\uffff\uffff\u0000\u00d5\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u0019\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0003"+
		"$\u0012\u0000\u00db\u00e2\u0006\r\uffff\uffff\u0000\u00dc\u00dd\u0005"+
		")\u0000\u0000\u00dd\u00de\u0003$\u0012\u0000\u00de\u00df\u0006\r\uffff"+
		"\uffff\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u001b\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0010"+
		"\u0000\u0000\u00e6\u00e7\u0005\'\u0000\u0000\u00e7\u00e8\u0003\u0018\f"+
		"\u0000\u00e8\u00e9\u0005(\u0000\u0000\u00e9\u00ea\u0006\u000e\uffff\uffff"+
		"\u0000\u00ea\u0162\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0011\u0000"+
		"\u0000\u00ec\u00ed\u0005\'\u0000\u0000\u00ed\u00ee\u0003\u001a\r\u0000"+
		"\u00ee\u00ef\u0005(\u0000\u0000\u00ef\u00f0\u0006\u000e\uffff\uffff\u0000"+
		"\u00f0\u0162\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0012\u0000\u0000"+
		"\u00f2\u00f3\u0005\'\u0000\u0000\u00f3\u00f4\u0003\u001a\r\u0000\u00f4"+
		"\u00f5\u0005(\u0000\u0000\u00f5\u00f6\u0006\u000e\uffff\uffff\u0000\u00f6"+
		"\u0162\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0013\u0000\u0000\u00f8"+
		"\u00f9\u00054\u0000\u0000\u00f9\u00fa\u0006\u000e\uffff\uffff\u0000\u00fa"+
		"\u00fb\u0005\u0017\u0000\u0000\u00fb\u00fc\u0003$\u0012\u0000\u00fc\u00fd"+
		"\u0006\u000e\uffff\uffff\u0000\u00fd\u00fe\u0005\u0018\u0000\u0000\u00fe"+
		"\u00ff\u0003$\u0012\u0000\u00ff\u0100\u0006\u000e\uffff\uffff\u0000\u0100"+
		"\u010a\u0006\u000e\uffff\uffff\u0000\u0101\u0102\u0005\u0014\u0000\u0000"+
		"\u0102\u0105\u0006\u000e\uffff\uffff\u0000\u0103\u0104\u00053\u0000\u0000"+
		"\u0104\u0106\u0006\u000e\uffff\uffff\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108\u0109\u0006\u000e\uffff"+
		"\uffff\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0101\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010f\u0006\u000e\uffff\uffff\u0000\u010d\u010e\u0005"+
		"\u0015\u0000\u0000\u010e\u0110\u0006\u000e\uffff\uffff\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0019\u0000\u0000\u0112\u0118"+
		"\u0006\u000e\uffff\uffff\u0000\u0113\u0114\u0003\u001c\u000e\u0000\u0114"+
		"\u0115\u0006\u000e\uffff\uffff\u0000\u0115\u0117\u0001\u0000\u0000\u0000"+
		"\u0116\u0113\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0005\u0016\u0000\u0000\u011c\u011d\u0006\u000e\uffff\uffff"+
		"\u0000\u011d\u0162\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u001a\u0000"+
		"\u0000\u011f\u0125\u0006\u000e\uffff\uffff\u0000\u0120\u0121\u0003\u001c"+
		"\u000e\u0000\u0121\u0122\u0006\u000e\uffff\uffff\u0000\u0122\u0124\u0001"+
		"\u0000\u0000\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0124\u0127\u0001"+
		"\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005\u0018\u0000\u0000\u0129\u012a\u0003"+
		"$\u0012\u0000\u012a\u012b\u0006\u000e\uffff\uffff\u0000\u012b\u0162\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005\u001c\u0000\u0000\u012d\u012e\u0003"+
		"$\u0012\u0000\u012e\u012f\u0006\u000e\uffff\uffff\u0000\u012f\u0130\u0005"+
		"\u0019\u0000\u0000\u0130\u0136\u0006\u000e\uffff\uffff\u0000\u0131\u0132"+
		"\u0003\u001c\u000e\u0000\u0132\u0133\u0006\u000e\uffff\uffff\u0000\u0133"+
		"\u0135\u0001\u0000\u0000\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u0135"+
		"\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u001d\u0000\u0000\u013a"+
		"\u013b\u0006\u000e\uffff\uffff\u0000\u013b\u0162\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0005\u001e\u0000\u0000\u013d\u013e\u0003$\u0012\u0000\u013e"+
		"\u013f\u0006\u000e\uffff\uffff\u0000\u013f\u0140\u0005 \u0000\u0000\u0140"+
		"\u0146\u0006\u000e\uffff\uffff\u0000\u0141\u0142\u0003\u001c\u000e\u0000"+
		"\u0142\u0143\u0006\u000e\uffff\uffff\u0000\u0143\u0145\u0001\u0000\u0000"+
		"\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u014d\u0006\u000e\uffff\uffff\u0000\u014a\u014b\u0003\"\u0011"+
		"\u0000\u014b\u014c\u0006\u000e\uffff\uffff\u0000\u014c\u014e\u0001\u0000"+
		"\u0000\u0000\u014d\u014a\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u001f"+
		"\u0000\u0000\u0150\u0151\u0006\u000e\uffff\uffff\u0000\u0151\u0162\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u00054\u0000\u0000\u0153\u0154\u0006\u000e"+
		"\uffff\uffff\u0000\u0154\u0155\u0005\u0003\u0000\u0000\u0155\u0156\u0003"+
		"$\u0012\u0000\u0156\u0157\u0006\u000e\uffff\uffff\u0000\u0157\u0162\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u00054\u0000\u0000\u0159\u015a\u0006\u000e"+
		"\uffff\uffff\u0000\u015a\u015e\u0006\u000e\uffff\uffff\u0000\u015b\u015c"+
		"\u0003 \u0010\u0000\u015c\u015d\u0006\u000e\uffff\uffff\u0000\u015d\u015f"+
		"\u0001\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162"+
		"\u0006\u000e\uffff\uffff\u0000\u0161\u00e5\u0001\u0000\u0000\u0000\u0161"+
		"\u00eb\u0001\u0000\u0000\u0000\u0161\u00f1\u0001\u0000\u0000\u0000\u0161"+
		"\u00f7\u0001\u0000\u0000\u0000\u0161\u011e\u0001\u0000\u0000\u0000\u0161"+
		"\u012c\u0001\u0000\u0000\u0000\u0161\u013c\u0001\u0000\u0000\u0000\u0161"+
		"\u0152\u0001\u0000\u0000\u0000\u0161\u0158\u0001\u0000\u0000\u0000\u0162"+
		"\u001d\u0001\u0000\u0000\u0000\u0163\u0164\u00055\u0000\u0000\u0164\u0168"+
		"\u0006\u000f\uffff\uffff\u0000\u0165\u0166\u00056\u0000\u0000\u0166\u0168"+
		"\u0006\u000f\uffff\uffff\u0000\u0167\u0163\u0001\u0000\u0000\u0000\u0167"+
		"\u0165\u0001\u0000\u0000\u0000\u0168\u001f\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0005\'\u0000\u0000\u016a\u016b\u0003$\u0012\u0000\u016b\u0172"+
		"\u0006\u0010\uffff\uffff\u0000\u016c\u016d\u0005)\u0000\u0000\u016d\u016e"+
		"\u0003$\u0012\u0000\u016e\u016f\u0006\u0010\uffff\uffff\u0000\u016f\u0171"+
		"\u0001\u0000\u0000\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0171\u0174"+
		"\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0005(\u0000\u0000\u0176!\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0005!\u0000\u0000\u0178\u017e\u0006\u0011\uffff"+
		"\uffff\u0000\u0179\u017a\u0003\u001c\u000e\u0000\u017a\u017b\u0006\u0011"+
		"\uffff\uffff\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u0179\u0001"+
		"\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f#\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0182\u0003(\u0014"+
		"\u0000\u0182\u0187\u0006\u0012\uffff\uffff\u0000\u0183\u0184\u0007\u0000"+
		"\u0000\u0000\u0184\u0185\u0003$\u0012\u0000\u0185\u0186\u0006\u0012\uffff"+
		"\uffff\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0183\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188%\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0007\u0000\u0000\u0000\u018a\'\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0003,\u0016\u0000\u018c\u0191\u0006\u0014\uffff\uffff\u0000"+
		"\u018d\u018e\u0007\u0001\u0000\u0000\u018e\u018f\u0003(\u0014\u0000\u018f"+
		"\u0190\u0006\u0014\uffff\uffff\u0000\u0190\u0192\u0001\u0000\u0000\u0000"+
		"\u0191\u018d\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192)\u0001\u0000\u0000\u0000\u0193\u0194\u0007\u0001\u0000\u0000\u0194"+
		"+\u0001\u0000\u0000\u0000\u0195\u0196\u00030\u0018\u0000\u0196\u019b\u0006"+
		"\u0016\uffff\uffff\u0000\u0197\u0198\u0007\u0002\u0000\u0000\u0198\u0199"+
		"\u0003,\u0016\u0000\u0199\u019a\u0006\u0016\uffff\uffff\u0000\u019a\u019c"+
		"\u0001\u0000\u0000\u0000\u019b\u0197\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0001\u0000\u0000\u0000\u019c-\u0001\u0000\u0000\u0000\u019d\u019e\u0007"+
		"\u0002\u0000\u0000\u019e/\u0001\u0000\u0000\u0000\u019f\u01a3\u0006\u0018"+
		"\uffff\uffff\u0000\u01a0\u01a4\u00052\u0000\u0000\u01a1\u01a2\u00053\u0000"+
		"\u0000\u01a2\u01a4\u0006\u0018\uffff\uffff\u0000\u01a3\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u00032\u0019"+
		"\u0000\u01a6\u01a7\u0006\u0018\uffff\uffff\u0000\u01a71\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u00054\u0000\u0000\u01a9\u01c4\u0006\u0019\uffff\uffff"+
		"\u0000\u01aa\u01ab\u00054\u0000\u0000\u01ab\u01ac\u0005\'\u0000\u0000"+
		"\u01ac\u01b0\u0006\u0019\uffff\uffff\u0000\u01ad\u01ae\u00038\u001c\u0000"+
		"\u01ae\u01af\u0006\u0019\uffff\uffff\u0000\u01af\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b0\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005(\u0000\u0000"+
		"\u01b3\u01c4\u0006\u0019\uffff\uffff\u0000\u01b4\u01b5\u0005\'\u0000\u0000"+
		"\u01b5\u01b6\u0003$\u0012\u0000\u01b6\u01b7\u0006\u0019\uffff\uffff\u0000"+
		"\u01b7\u01b8\u0005(\u0000\u0000\u01b8\u01c4\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u00036\u001b\u0000\u01ba\u01bb\u0006\u0019\uffff\uffff\u0000\u01bb"+
		"\u01c4\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005$\u0000\u0000\u01bd\u01be"+
		"\u00032\u0019\u0000\u01be\u01bf\u0006\u0019\uffff\uffff\u0000\u01bf\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u00034\u001a\u0000\u01c1\u01c2\u0006"+
		"\u0019\uffff\uffff\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01a8"+
		"\u0001\u0000\u0000\u0000\u01c3\u01aa\u0001\u0000\u0000\u0000\u01c3\u01b4"+
		"\u0001\u0000\u0000\u0000\u01c3\u01b9\u0001\u0000\u0000\u0000\u01c3\u01bc"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000\u01c43\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0005\"\u0000\u0000\u01c6\u01ca\u0006\u001a"+
		"\uffff\uffff\u0000\u01c7\u01c8\u0005#\u0000\u0000\u01c8\u01ca\u0006\u001a"+
		"\uffff\uffff\u0000\u01c9\u01c5\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ca5\u0001\u0000\u0000\u0000\u01cb\u01cc\u00055\u0000"+
		"\u0000\u01cc\u01d2\u0006\u001b\uffff\uffff\u0000\u01cd\u01ce\u00056\u0000"+
		"\u0000\u01ce\u01d2\u0006\u001b\uffff\uffff\u0000\u01cf\u01d0\u00057\u0000"+
		"\u0000\u01d0\u01d2\u0006\u001b\uffff\uffff\u0000\u01d1\u01cb\u0001\u0000"+
		"\u0000\u0000\u01d1\u01cd\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d27\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003$\u0012\u0000"+
		"\u01d4\u01db\u0006\u001c\uffff\uffff\u0000\u01d5\u01d6\u0005)\u0000\u0000"+
		"\u01d6\u01d7\u0003$\u0012\u0000\u01d7\u01d8\u0006\u001c\uffff\uffff\u0000"+
		"\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000"+
		"\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc9\u0001\u0000\u0000\u0000\u01dd"+
		"\u01db\u0001\u0000\u0000\u0000(AFOXgpu~\u0082\u008b\u0098\u009f\u00a8"+
		"\u00b2\u00c3\u00cd\u00d7\u00e2\u0105\u010a\u010f\u0118\u0125\u0136\u0146"+
		"\u014d\u015e\u0161\u0167\u0172\u017e\u0187\u0191\u019b\u01a3\u01b0\u01c3"+
		"\u01c9\u01d1\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}