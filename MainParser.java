// Generated from Main.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CREATE=3, CONSTANT=4, RETURN=5, PRINT=6, SCAN=7, VOID=8, 
		FUNC=9, MAIN=10, IF=11, ELSE=12, ELSE_IF=13, THEN=14, FOR=15, UP_TO=16, 
		DOWN_TO=17, WHILE=18, INT_DEC=19, BOOLEAN_DEC=20, FLOAT_DEC=21, STRING_DEC=22, 
		OPEN_PAREN=23, CLOSE_PAREN=24, OPEN_BRACKET=25, CLOSE_BRACKET=26, OPEN_BRACE=27, 
		CLOSE_BRACE=28, LESS=29, LESSQEUAL=30, GREATER=31, GREATEREQUAL=32, PLUS=33, 
		MINUS=34, MULTI=35, DIV=36, MOD=37, ANDAND=38, OROR=39, NOT=40, ASSIGN=41, 
		EQUAL=42, QUESTION=43, COLON=44, DOT=45, SEMICOLON=46, COMMA=47, UNDERSCORE=48, 
		SINGLE_QUOTE=49, LOWERCASE=50, UPPERCASE=51, DIGIT=52, NEWLINE=53, LINECOMMENT=54, 
		WHITE_SPACE=55;
	public static final int
		RULE_start = 0, RULE_variable_type = 1, RULE_string = 2, RULE_number = 3, 
		RULE_label = 4, RULE_label_words = 5, RULE_label_words_withoutsymbol = 6, 
		RULE_first_operators = 7, RULE_second_operators = 8, RULE_operators = 9, 
		RULE_logical_operators = 10, RULE_relational_operators = 11, RULE_other_operators = 12, 
		RULE_lexer_predefined_words = 13, RULE_constant_words = 14, RULE_conditional_words = 15, 
		RULE_loop_words = 16, RULE_simple_punctuations = 17, RULE_symbol_words = 18, 
		RULE_statements = 19, RULE_any_declaration = 20, RULE_assigned_expression = 21, 
		RULE_multiple_declaration = 22, RULE_variable_declaration_vartype = 23, 
		RULE_variable_declaration_no_vartype = 24, RULE_array_size = 25, RULE_array_variable = 26, 
		RULE_array_assign_body = 27, RULE_array_assign = 28, RULE_array_declaration_vartype = 29, 
		RULE_array_declaration_no_vartype = 30, RULE_print_statement = 31, RULE_value_print = 32, 
		RULE_extended_value_print = 33, RULE_scan_statement = 34, RULE_scan_body = 35, 
		RULE_display_message_parameter = 36, RULE_scan_label = 37, RULE_value_parameter = 38, 
		RULE_constant_declaration = 39, RULE_return_statement = 40, RULE_return_value = 41, 
		RULE_expression = 42, RULE_array_label = 43, RULE_value_expression = 44, 
		RULE_alt_expression = 45, RULE_alt_operator_expression = 46, RULE_alt_parenthesis_expression = 47, 
		RULE_alt_first_expression_operator = 48, RULE_alt_second_expression_operator = 49, 
		RULE_alt_value_expression = 50, RULE_comparison_statement = 51, RULE_assignment_statement = 52, 
		RULE_value_comparison = 53, RULE_conditional_statement = 54, RULE_conditional_comparison_structure = 55, 
		RULE_with_then = 56, RULE_with_comparison = 57, RULE_conditional_body = 58, 
		RULE_if_statement = 59, RULE_else_if_statement = 60, RULE_else_statement = 61, 
		RULE_loop_statement = 62, RULE_loop_conditional = 63, RULE_loop_structure = 64, 
		RULE_loop_variable_declaration = 65, RULE_loop_expression = 66, RULE_while_statement = 67, 
		RULE_for_statement = 68, RULE_function_calling = 69, RULE_function_parameters = 70, 
		RULE_function_paremeters_value = 71, RULE_function_declaration = 72, RULE_function_label = 73, 
		RULE_function_structure = 74, RULE_function_declaration_parameters = 75, 
		RULE_function_declaration_parameters_body = 76, RULE_void_function = 77, 
		RULE_non_void_function = 78, RULE_error_function = 79, RULE_error_function_head = 80, 
		RULE_scoping_statement = 81, RULE_main_function = 82, RULE_main_head = 83, 
		RULE_main_body = 84, RULE_main_body_first = 85, RULE_main_body_second = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variable_type", "string", "number", "label", "label_words", 
			"label_words_withoutsymbol", "first_operators", "second_operators", "operators", 
			"logical_operators", "relational_operators", "other_operators", "lexer_predefined_words", 
			"constant_words", "conditional_words", "loop_words", "simple_punctuations", 
			"symbol_words", "statements", "any_declaration", "assigned_expression", 
			"multiple_declaration", "variable_declaration_vartype", "variable_declaration_no_vartype", 
			"array_size", "array_variable", "array_assign_body", "array_assign", 
			"array_declaration_vartype", "array_declaration_no_vartype", "print_statement", 
			"value_print", "extended_value_print", "scan_statement", "scan_body", 
			"display_message_parameter", "scan_label", "value_parameter", "constant_declaration", 
			"return_statement", "return_value", "expression", "array_label", "value_expression", 
			"alt_expression", "alt_operator_expression", "alt_parenthesis_expression", 
			"alt_first_expression_operator", "alt_second_expression_operator", "alt_value_expression", 
			"comparison_statement", "assignment_statement", "value_comparison", "conditional_statement", 
			"conditional_comparison_structure", "with_then", "with_comparison", "conditional_body", 
			"if_statement", "else_if_statement", "else_statement", "loop_statement", 
			"loop_conditional", "loop_structure", "loop_variable_declaration", "loop_expression", 
			"while_statement", "for_statement", "function_calling", "function_parameters", 
			"function_paremeters_value", "function_declaration", "function_label", 
			"function_structure", "function_declaration_parameters", "function_declaration_parameters_body", 
			"void_function", "non_void_function", "error_function", "error_function_head", 
			"scoping_statement", "main_function", "main_head", "main_body", "main_body_first", 
			"main_body_second"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'f'", "'create'", "'constant'", "'return'", "'print'", 
			"'scan'", "'void'", "'func'", "'main'", "'if'", "'else'", "'else if'", 
			"'then'", "'for'", "'up to'", "'down to'", "'while'", "'int'", "'bool'", 
			"'float'", "'String'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
			"'!'", "'='", "'=='", "'?'", "':'", "'.'", "';'", "','", "'_'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", 
			"FUNC", "MAIN", "IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", 
			"WHILE", "INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", 
			"LESS", "LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", 
			"DIV", "MOD", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", 
			"COLON", "DOT", "SEMICOLON", "COMMA", "UNDERSCORE", "SINGLE_QUOTE", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "NEWLINE", "LINECOMMENT", "WHITE_SPACE"
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
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MainParser.EOF, 0); }
		public List<TerminalNode> LINECOMMENT() { return getTokens(MainParser.LINECOMMENT); }
		public TerminalNode LINECOMMENT(int i) {
			return getToken(MainParser.LINECOMMENT, i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINECOMMENT) {
				{
				{
				setState(174);
				match(LINECOMMENT);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(175);
					match(NEWLINE);
					}
				}

				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(183);
				function_declaration();
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(184);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(195);
				match(WHITE_SPACE);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			main_function();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(202);
				match(NEWLINE);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(208);
				match(WHITE_SPACE);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(EOF);
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

	public static class Variable_typeContext extends ParserRuleContext {
		public TerminalNode INT_DEC() { return getToken(MainParser.INT_DEC, 0); }
		public TerminalNode BOOLEAN_DEC() { return getToken(MainParser.BOOLEAN_DEC, 0); }
		public TerminalNode FLOAT_DEC() { return getToken(MainParser.FLOAT_DEC, 0); }
		public TerminalNode STRING_DEC() { return getToken(MainParser.STRING_DEC, 0); }
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVariable_type(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) ) {
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<Lexer_predefined_wordsContext> lexer_predefined_words() {
			return getRuleContexts(Lexer_predefined_wordsContext.class);
		}
		public Lexer_predefined_wordsContext lexer_predefined_words(int i) {
			return getRuleContext(Lexer_predefined_wordsContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__0);
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(219);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(220);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(221);
					label();
					}
					break;
				case 4:
					{
					setState(222);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(227);
			match(T__0);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MainParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(MainParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		int _la;
		try {
			int _alt;
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(229);
					match(MINUS);
					}
				}

				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					match(DIGIT);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				{
				setState(237);
				match(DOT);
				setState(239); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(238);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(241); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(243);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(246);
					match(MINUS);
					}
				}

				setState(250); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(249);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(252); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LabelContext extends ParserRuleContext {
		public List<Label_wordsContext> label_words() {
			return getRuleContexts(Label_wordsContext.class);
		}
		public Label_wordsContext label_words(int i) {
			return getRuleContext(Label_wordsContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> LOWERCASE() { return getTokens(MainParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(MainParser.LOWERCASE, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(MainParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MainParser.UNDERSCORE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(MainParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(MainParser.UPPERCASE, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		int _la;
		try {
			int _alt;
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(256);
						label_words();
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(263); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(262);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(265); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267);
						match(DIGIT);
						}
						} 
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(273);
						label_words();
						}
						} 
					}
					setState(278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(279);
						label();
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE))) != 0)) {
					{
					{
					setState(285);
					label_words();
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(291);
				match(DIGIT);
				setState(293); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(292);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(295); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297);
						match(DIGIT);
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						label_words();
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(309);
						label();
						}
						} 
					}
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				notifyErrorListeners("Missing Operator");
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

	public static class Label_wordsContext extends ParserRuleContext {
		public Constant_wordsContext constant_words() {
			return getRuleContext(Constant_wordsContext.class,0);
		}
		public Conditional_wordsContext conditional_words() {
			return getRuleContext(Conditional_wordsContext.class,0);
		}
		public Loop_wordsContext loop_words() {
			return getRuleContext(Loop_wordsContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Simple_punctuationsContext simple_punctuations() {
			return getRuleContext(Simple_punctuationsContext.class,0);
		}
		public Label_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLabel_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLabel_words(this);
		}
	}

	public final Label_wordsContext label_words() throws RecognitionException {
		Label_wordsContext _localctx = new Label_wordsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label_words);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
				{
				setState(318);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(319);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(320);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(321);
				variable_type();
				}
				break;
			case NOT:
			case ASSIGN:
			case EQUAL:
			case QUESTION:
			case COLON:
			case DOT:
			case SEMICOLON:
			case COMMA:
			case UNDERSCORE:
			case SINGLE_QUOTE:
				{
				setState(322);
				simple_punctuations();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Label_words_withoutsymbolContext extends ParserRuleContext {
		public Constant_wordsContext constant_words() {
			return getRuleContext(Constant_wordsContext.class,0);
		}
		public Conditional_wordsContext conditional_words() {
			return getRuleContext(Conditional_wordsContext.class,0);
		}
		public Loop_wordsContext loop_words() {
			return getRuleContext(Loop_wordsContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Label_words_withoutsymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_words_withoutsymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLabel_words_withoutsymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLabel_words_withoutsymbol(this);
		}
	}

	public final Label_words_withoutsymbolContext label_words_withoutsymbol() throws RecognitionException {
		Label_words_withoutsymbolContext _localctx = new Label_words_withoutsymbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label_words_withoutsymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
				{
				setState(325);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(326);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(327);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(328);
				variable_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class First_operatorsContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(MainParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(MainParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MainParser.MOD, 0); }
		public First_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFirst_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFirst_operators(this);
		}
	}

	public final First_operatorsContext first_operators() throws RecognitionException {
		First_operatorsContext _localctx = new First_operatorsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_first_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class Second_operatorsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MainParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MainParser.MINUS, 0); }
		public Second_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSecond_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSecond_operators(this);
		}
	}

	public final Second_operatorsContext second_operators() throws RecognitionException {
		Second_operatorsContext _localctx = new Second_operatorsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_second_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class OperatorsContext extends ParserRuleContext {
		public First_operatorsContext first_operators() {
			return getRuleContext(First_operatorsContext.class,0);
		}
		public Second_operatorsContext second_operators() {
			return getRuleContext(Second_operatorsContext.class,0);
		}
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(335);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(336);
				second_operators();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Logical_operatorsContext extends ParserRuleContext {
		public TerminalNode ANDAND() { return getToken(MainParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(MainParser.OROR, 0); }
		public Logical_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLogical_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLogical_operators(this);
		}
	}

	public final Logical_operatorsContext logical_operators() throws RecognitionException {
		Logical_operatorsContext _localctx = new Logical_operatorsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logical_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==ANDAND || _la==OROR) ) {
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

	public static class Relational_operatorsContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(MainParser.LESS, 0); }
		public TerminalNode LESSQEUAL() { return getToken(MainParser.LESSQEUAL, 0); }
		public TerminalNode GREATER() { return getToken(MainParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(MainParser.GREATEREQUAL, 0); }
		public Relational_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterRelational_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitRelational_operators(this);
		}
	}

	public final Relational_operatorsContext relational_operators() throws RecognitionException {
		Relational_operatorsContext _localctx = new Relational_operatorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relational_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) ) {
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

	public static class Other_operatorsContext extends ParserRuleContext {
		public Logical_operatorsContext logical_operators() {
			return getRuleContext(Logical_operatorsContext.class,0);
		}
		public Relational_operatorsContext relational_operators() {
			return getRuleContext(Relational_operatorsContext.class,0);
		}
		public Other_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOther_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOther_operators(this);
		}
	}

	public final Other_operatorsContext other_operators() throws RecognitionException {
		Other_operatorsContext _localctx = new Other_operatorsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_other_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(343);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(344);
				relational_operators();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Lexer_predefined_wordsContext extends ParserRuleContext {
		public Constant_wordsContext constant_words() {
			return getRuleContext(Constant_wordsContext.class,0);
		}
		public Conditional_wordsContext conditional_words() {
			return getRuleContext(Conditional_wordsContext.class,0);
		}
		public Loop_wordsContext loop_words() {
			return getRuleContext(Loop_wordsContext.class,0);
		}
		public Simple_punctuationsContext simple_punctuations() {
			return getRuleContext(Simple_punctuationsContext.class,0);
		}
		public Symbol_wordsContext symbol_words() {
			return getRuleContext(Symbol_wordsContext.class,0);
		}
		public Other_operatorsContext other_operators() {
			return getRuleContext(Other_operatorsContext.class,0);
		}
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Lexer_predefined_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_predefined_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLexer_predefined_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLexer_predefined_words(this);
		}
	}

	public final Lexer_predefined_wordsContext lexer_predefined_words() throws RecognitionException {
		Lexer_predefined_wordsContext _localctx = new Lexer_predefined_wordsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lexer_predefined_words);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
				{
				setState(347);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(348);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(349);
				loop_words();
				}
				break;
			case NOT:
			case ASSIGN:
			case EQUAL:
			case QUESTION:
			case COLON:
			case DOT:
			case SEMICOLON:
			case COMMA:
			case UNDERSCORE:
			case SINGLE_QUOTE:
				{
				setState(350);
				simple_punctuations();
				}
				break;
			case OPEN_PAREN:
			case CLOSE_PAREN:
			case OPEN_BRACKET:
			case CLOSE_BRACKET:
			case OPEN_BRACE:
			case CLOSE_BRACE:
				{
				setState(351);
				symbol_words();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
			case ANDAND:
			case OROR:
				{
				setState(352);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(353);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(354);
				variable_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Constant_wordsContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public TerminalNode CONSTANT() { return getToken(MainParser.CONSTANT, 0); }
		public TerminalNode RETURN() { return getToken(MainParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(MainParser.PRINT, 0); }
		public TerminalNode SCAN() { return getToken(MainParser.SCAN, 0); }
		public TerminalNode VOID() { return getToken(MainParser.VOID, 0); }
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(MainParser.MAIN, 0); }
		public Constant_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConstant_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConstant_words(this);
		}
	}

	public final Constant_wordsContext constant_words() throws RecognitionException {
		Constant_wordsContext _localctx = new Constant_wordsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN))) != 0)) ) {
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

	public static class Conditional_wordsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MainParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(MainParser.ELSE, 0); }
		public TerminalNode ELSE_IF() { return getToken(MainParser.ELSE_IF, 0); }
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
		public Conditional_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConditional_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConditional_words(this);
		}
	}

	public final Conditional_wordsContext conditional_words() throws RecognitionException {
		Conditional_wordsContext _localctx = new Conditional_wordsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditional_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN))) != 0)) ) {
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

	public static class Loop_wordsContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MainParser.FOR, 0); }
		public TerminalNode UP_TO() { return getToken(MainParser.UP_TO, 0); }
		public TerminalNode DOWN_TO() { return getToken(MainParser.DOWN_TO, 0); }
		public TerminalNode WHILE() { return getToken(MainParser.WHILE, 0); }
		public Loop_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_words(this);
		}
	}

	public final Loop_wordsContext loop_words() throws RecognitionException {
		Loop_wordsContext _localctx = new Loop_wordsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE))) != 0)) ) {
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

	public static class Simple_punctuationsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public TerminalNode DOT() { return getToken(MainParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public TerminalNode NOT() { return getToken(MainParser.NOT, 0); }
		public TerminalNode QUESTION() { return getToken(MainParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(MainParser.COLON, 0); }
		public TerminalNode UNDERSCORE() { return getToken(MainParser.UNDERSCORE, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(MainParser.SINGLE_QUOTE, 0); }
		public Simple_punctuationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_punctuations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSimple_punctuations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSimple_punctuations(this);
		}
	}

	public final Simple_punctuationsContext simple_punctuations() throws RecognitionException {
		Simple_punctuationsContext _localctx = new Simple_punctuationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simple_punctuations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE))) != 0)) ) {
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

	public static class Symbol_wordsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Symbol_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSymbol_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSymbol_words(this);
		}
	}

	public final Symbol_wordsContext symbol_words() throws RecognitionException {
		Symbol_wordsContext _localctx = new Symbol_wordsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_symbol_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE))) != 0)) ) {
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

	public static class StatementsContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode LINECOMMENT() { return getToken(MainParser.LINECOMMENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public Scoping_statementContext scoping_statement() {
			return getRuleContext(Scoping_statementContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statements);
		try {
			int _alt;
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				conditional_statement();
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(368);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(374);
					match(LINECOMMENT);
					}
					break;
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(377);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(382);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(383);
						match(NEWLINE);
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				loop_statement();
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(390);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(396);
					match(LINECOMMENT);
					}
					break;
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(399);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(405);
						match(NEWLINE);
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				print_statement();
				setState(412);
				match(SEMICOLON);
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(413);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(419);
					match(LINECOMMENT);
					}
					break;
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(422);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(428);
						match(NEWLINE);
						}
						} 
					}
					setState(433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				print_statement();
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(441);
					match(LINECOMMENT);
					}
					break;
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(444);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(450);
						match(NEWLINE);
						}
						} 
					}
					setState(455);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				scan_statement();
				setState(459);
				match(SEMICOLON);
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(460);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(465);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(466);
					match(LINECOMMENT);
					}
					break;
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(469);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(475);
						match(NEWLINE);
						}
						} 
					}
					setState(480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				scan_statement();
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(482);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(488);
					match(LINECOMMENT);
					}
					break;
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(491);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(497);
						match(NEWLINE);
						}
						} 
					}
					setState(502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(505);
				return_statement();
				setState(506);
				match(SEMICOLON);
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(507);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(512);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(513);
					match(LINECOMMENT);
					}
					break;
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(516);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(521);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(522);
						match(NEWLINE);
						}
						} 
					}
					setState(527);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(528);
				return_statement();
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(529);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(534);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(535);
					match(LINECOMMENT);
					}
					break;
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(538);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(543);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(544);
						match(NEWLINE);
						}
						} 
					}
					setState(549);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(552);
				constant_declaration();
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(553);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(558);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(559);
					match(LINECOMMENT);
					}
					break;
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(562);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(568);
						match(NEWLINE);
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(574);
				any_declaration();
				setState(575);
				match(SEMICOLON);
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(576);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(582);
					match(LINECOMMENT);
					}
					break;
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(585);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(590);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(591);
						match(NEWLINE);
						}
						} 
					}
					setState(596);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(597);
				any_declaration();
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(598);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(603);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(604);
					match(LINECOMMENT);
					}
					break;
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(607);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(612);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						match(NEWLINE);
						}
						} 
					}
					setState(618);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(621);
				scoping_statement();
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(622);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(628);
					match(LINECOMMENT);
					}
					break;
				}
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(631);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(636);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(637);
						match(NEWLINE);
						}
						} 
					}
					setState(642);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(643);
				function_calling();
				setState(644);
				match(SEMICOLON);
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(645);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(651);
					match(LINECOMMENT);
					}
					break;
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(654);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(660);
						match(NEWLINE);
						}
						} 
					}
					setState(665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(666);
				function_calling();
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(667);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(672);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(673);
					match(LINECOMMENT);
					}
					break;
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(676);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(681);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(682);
						match(NEWLINE);
						}
						} 
					}
					setState(687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(690);
				match(LINECOMMENT);
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

	public static class Any_declarationContext extends ParserRuleContext {
		public Variable_declaration_vartypeContext variable_declaration_vartype() {
			return getRuleContext(Variable_declaration_vartypeContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public Variable_declaration_no_vartypeContext variable_declaration_no_vartype() {
			return getRuleContext(Variable_declaration_no_vartypeContext.class,0);
		}
		public Array_declaration_vartypeContext array_declaration_vartype() {
			return getRuleContext(Array_declaration_vartypeContext.class,0);
		}
		public Array_declaration_no_vartypeContext array_declaration_no_vartype() {
			return getRuleContext(Array_declaration_no_vartypeContext.class,0);
		}
		public Any_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAny_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAny_declaration(this);
		}
	}

	public final Any_declarationContext any_declaration() throws RecognitionException {
		Any_declarationContext _localctx = new Any_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_any_declaration);
		try {
			int _alt;
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(696);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
						case 1:
							{
							setState(694);
							label();
							}
							break;
						case 2:
							{
							setState(695);
							variable_type();
							}
							break;
						}
						setState(698);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(702); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(704);
				variable_declaration_vartype();
				notifyErrorListeners("Invalid declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				variable_declaration_no_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(708);
				array_declaration_vartype();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(715); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(711);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(709);
							label();
							}
							break;
						case 2:
							{
							setState(710);
							variable_type();
							}
							break;
						}
						setState(713);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(717); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(719);
				array_declaration_vartype();
				notifyErrorListeners("Invalid declaration");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(722);
				array_declaration_no_vartype();
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

	public static class Assigned_expressionContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Assigned_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigned_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAssigned_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAssigned_expression(this);
		}
	}

	public final Assigned_expressionContext assigned_expression() throws RecognitionException {
		Assigned_expressionContext _localctx = new Assigned_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assigned_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(725);
				string();
				}
				break;
			case 2:
				{
				setState(726);
				number();
				}
				break;
			case 3:
				{
				setState(727);
				label();
				}
				break;
			case 4:
				{
				setState(728);
				expression(0);
				}
				break;
			case 5:
				{
				setState(729);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(730);
				function_calling();
				}
				break;
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

	public static class Multiple_declarationContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Multiple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMultiple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMultiple_declaration(this);
		}
	}

	public final Multiple_declarationContext multiple_declaration() throws RecognitionException {
		Multiple_declarationContext _localctx = new Multiple_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiple_declaration);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				label();
				setState(742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(734);
						match(WHITE_SPACE);
						}
					}

					setState(737);
					match(ASSIGN);
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(738);
						match(WHITE_SPACE);
						}
					}

					setState(741);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				variable_type();
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(745);
						match(WHITE_SPACE);
						}
					}

					setState(748);
					match(ASSIGN);
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(749);
						match(WHITE_SPACE);
						}
					}

					setState(752);
					assigned_expression();
					}
					break;
				}
				notifyErrorListeners("Invalid declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(757);
				label();
				setState(766);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(758);
						match(WHITE_SPACE);
						}
					}

					setState(761);
					match(EQUAL);
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(762);
						match(WHITE_SPACE);
						}
					}

					setState(765);
					assigned_expression();
					}
					break;
				}
				notifyErrorListeners("Invalid symbol '==' for declaration");
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

	public static class Variable_declaration_vartypeContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Multiple_declarationContext> multiple_declaration() {
			return getRuleContexts(Multiple_declarationContext.class);
		}
		public Multiple_declarationContext multiple_declaration(int i) {
			return getRuleContext(Multiple_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainParser.COMMA, i);
		}
		public Variable_declaration_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVariable_declaration_vartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVariable_declaration_vartype(this);
		}
	}

	public final Variable_declaration_vartypeContext variable_declaration_vartype() throws RecognitionException {
		Variable_declaration_vartypeContext _localctx = new Variable_declaration_vartypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable_declaration_vartype);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			variable_type();
			setState(773);
			match(WHITE_SPACE);
			setState(774);
			multiple_declaration();
			setState(785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(775);
						match(WHITE_SPACE);
						}
					}

					setState(778);
					match(COMMA);
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(779);
						match(WHITE_SPACE);
						}
					}

					setState(782);
					multiple_declaration();
					}
					} 
				}
				setState(787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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

	public static class Variable_declaration_no_vartypeContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Variable_declaration_no_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_no_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVariable_declaration_no_vartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVariable_declaration_no_vartype(this);
		}
	}

	public final Variable_declaration_no_vartypeContext variable_declaration_no_vartype() throws RecognitionException {
		Variable_declaration_no_vartypeContext _localctx = new Variable_declaration_no_vartypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable_declaration_no_vartype);
		int _la;
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				label();
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(789);
					match(WHITE_SPACE);
					}
				}

				setState(792);
				match(ASSIGN);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(793);
					match(WHITE_SPACE);
					}
				}

				setState(796);
				assigned_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				label();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(799);
					match(WHITE_SPACE);
					}
				}

				setState(802);
				match(EQUAL);
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(803);
					match(WHITE_SPACE);
					}
				}

				setState(806);
				assigned_expression();
				notifyErrorListeners("Invalid symbol '==' for declaration");
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

	public static class Array_sizeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_size(this);
		}
	}

	public final Array_sizeContext array_size() throws RecognitionException {
		Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			expression(0);
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

	public static class Array_variableContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Array_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_variable(this);
		}
	}

	public final Array_variableContext array_variable() throws RecognitionException {
		Array_variableContext _localctx = new Array_variableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_variable);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				label();
				setState(814);
				match(OPEN_BRACE);
				setState(815);
				array_size();
				setState(816);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				label();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(819);
					match(OPEN_BRACE);
					}
				}

				setState(822);
				array_size();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(823);
					match(CLOSE_BRACE);
					}
				}

				notifyErrorListeners("Missing brace/s");
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

	public static class Array_assign_bodyContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Array_assign_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assign_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_assign_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_assign_body(this);
		}
	}

	public final Array_assign_bodyContext array_assign_body() throws RecognitionException {
		Array_assign_bodyContext _localctx = new Array_assign_bodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_assign_body);
		int _la;
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				match(CREATE);
				setState(831);
				match(WHITE_SPACE);
				setState(832);
				variable_type();
				setState(833);
				match(OPEN_BRACE);
				setState(834);
				array_size();
				setState(835);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				match(CREATE);
				setState(838);
				match(WHITE_SPACE);
				setState(839);
				variable_type();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(840);
					match(OPEN_BRACE);
					}
				}

				setState(843);
				array_size();
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(844);
					match(CLOSE_BRACE);
					}
				}

				notifyErrorListeners("Missing brace for array declaration");
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

	public static class Array_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Array_assign_bodyContext array_assign_body() {
			return getRuleContext(Array_assign_bodyContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Array_variableContext array_variable() {
			return getRuleContext(Array_variableContext.class,0);
		}
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public Array_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_assign(this);
		}
	}

	public final Array_assignContext array_assign() throws RecognitionException {
		Array_assignContext _localctx = new Array_assignContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_assign);
		int _la;
		try {
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(851);
					match(WHITE_SPACE);
					}
				}

				setState(854);
				match(ASSIGN);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(855);
					match(WHITE_SPACE);
					}
				}

				setState(858);
				array_assign_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(859);
					match(WHITE_SPACE);
					}
				}

				setState(862);
				match(EQUAL);
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(863);
					match(WHITE_SPACE);
					}
				}

				setState(866);
				array_assign_body();
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(869);
					match(WHITE_SPACE);
					}
				}

				setState(872);
				match(ASSIGN);
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(873);
					match(WHITE_SPACE);
					}
				}

				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(876);
					array_variable();
					}
					break;
				case 2:
					{
					setState(877);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(880);
					match(WHITE_SPACE);
					}
				}

				setState(883);
				match(EQUAL);
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(884);
					match(WHITE_SPACE);
					}
				}

				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(887);
					array_variable();
					}
					break;
				case 2:
					{
					setState(888);
					assigned_expression();
					}
					break;
				}
				notifyErrorListeners("Invalid symbol '==' for declaration");
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

	public static class Array_declaration_vartypeContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Array_assignContext array_assign() {
			return getRuleContext(Array_assignContext.class,0);
		}
		public Array_declaration_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_declaration_vartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_declaration_vartype(this);
		}
	}

	public final Array_declaration_vartypeContext array_declaration_vartype() throws RecognitionException {
		Array_declaration_vartypeContext _localctx = new Array_declaration_vartypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array_declaration_vartype);
		int _la;
		try {
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				variable_type();
				setState(896);
				match(OPEN_BRACE);
				setState(897);
				match(CLOSE_BRACE);
				setState(898);
				match(WHITE_SPACE);
				setState(899);
				label();
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(900);
					array_assign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				variable_type();
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(904);
					match(OPEN_BRACE);
					}
				}

				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(907);
					match(CLOSE_BRACE);
					}
				}

				setState(910);
				match(WHITE_SPACE);
				setState(911);
				label();
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(912);
					array_assign();
					}
					break;
				}
				notifyErrorListeners("Missing braces during array declaration");
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

	public static class Array_declaration_no_vartypeContext extends ParserRuleContext {
		public Array_variableContext array_variable() {
			return getRuleContext(Array_variableContext.class,0);
		}
		public Array_assignContext array_assign() {
			return getRuleContext(Array_assignContext.class,0);
		}
		public Array_declaration_no_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration_no_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_declaration_no_vartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_declaration_no_vartype(this);
		}
	}

	public final Array_declaration_no_vartypeContext array_declaration_no_vartype() throws RecognitionException {
		Array_declaration_no_vartypeContext _localctx = new Array_declaration_no_vartypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array_declaration_no_vartype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			array_variable();
			setState(920);
			array_assign();
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MainParser.PRINT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Value_printContext value_print() {
			return getRuleContext(Value_printContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_print_statement);
		int _la;
		try {
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				match(PRINT);
				setState(923);
				match(OPEN_PAREN);
				setState(924);
				value_print();
				setState(925);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				match(PRINT);
				setState(929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(928);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(931);
				value_print();
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(932);
					match(CLOSE_PAREN);
					}
				}

				notifyErrorListeners("Missing parenthesis");
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

	public static class Value_printContext extends ParserRuleContext {
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Extended_value_printContext> extended_value_print() {
			return getRuleContexts(Extended_value_printContext.class);
		}
		public Extended_value_printContext extended_value_print(int i) {
			return getRuleContext(Extended_value_printContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MainParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MainParser.PLUS, i);
		}
		public Value_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterValue_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitValue_print(this);
		}
	}

	public final Value_printContext value_print() throws RecognitionException {
		Value_printContext _localctx = new Value_printContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_value_print);
		int _la;
		try {
			int _alt;
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				label();
				setState(942); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(940);
						match(WHITE_SPACE);
						setState(941);
						label();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(944); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("No double quotes");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				extended_value_print();
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(950);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(949);
							match(WHITE_SPACE);
							}
						}

						setState(952);
						match(PLUS);
						setState(954);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(953);
							match(WHITE_SPACE);
							}
						}

						setState(956);
						extended_value_print();
						setState(958);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
						case 1:
							{
							setState(957);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(964);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				extended_value_print();
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(967);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(966);
							match(WHITE_SPACE);
							}
						}

						setState(969);
						match(PLUS);
						setState(971);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(970);
							match(WHITE_SPACE);
							}
						}

						setState(973);
						extended_value_print();
						setState(975);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
						case 1:
							{
							setState(974);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(981);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				setState(983); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(982);
					match(PLUS);
					}
					}
					setState(985); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				notifyErrorListeners("Additional ‘+’ sign at end of print");
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

	public static class Extended_value_printContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Extended_value_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_value_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExtended_value_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExtended_value_print(this);
		}
	}

	public final Extended_value_printContext extended_value_print() throws RecognitionException {
		Extended_value_printContext _localctx = new Extended_value_printContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_extended_value_print);
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				function_calling();
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

	public static class Scan_statementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(MainParser.SCAN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Scan_bodyContext scan_body() {
			return getRuleContext(Scan_bodyContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterScan_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitScan_statement(this);
		}
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_scan_statement);
		int _la;
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				match(SCAN);
				setState(998);
				match(OPEN_PAREN);
				setState(999);
				scan_body();
				setState(1000);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(SCAN);
				setState(1004);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1003);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(1006);
				scan_body();
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1007);
					match(CLOSE_PAREN);
					}
				}

				notifyErrorListeners("Missing parenthesis");
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

	public static class Scan_bodyContext extends ParserRuleContext {
		public Display_message_parameterContext display_message_parameter() {
			return getRuleContext(Display_message_parameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public Value_parameterContext value_parameter() {
			return getRuleContext(Value_parameterContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Scan_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterScan_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitScan_body(this);
		}
	}

	public final Scan_bodyContext scan_body() throws RecognitionException {
		Scan_bodyContext _localctx = new Scan_bodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_scan_body);
		int _la;
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				display_message_parameter();
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1015);
					match(WHITE_SPACE);
					}
				}

				setState(1018);
				match(COMMA);
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1019);
					match(WHITE_SPACE);
					}
				}

				setState(1022);
				value_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				display_message_parameter();
				setState(1026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1025);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1028);
					match(COMMA);
					}
					break;
				}
				notifyErrorListeners("Missing 2nd scan parameter");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1033);
				display_message_parameter();
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1034);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1038);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1037);
					match(COMMA);
					}
					break;
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1040);
					match(WHITE_SPACE);
					}
				}

				setState(1043);
				value_parameter();
				notifyErrorListeners("Missing comma");
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

	public static class Display_message_parameterContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Scan_labelContext scan_label() {
			return getRuleContext(Scan_labelContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Display_message_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_message_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDisplay_message_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDisplay_message_parameter(this);
		}
	}

	public final Display_message_parameterContext display_message_parameter() throws RecognitionException {
		Display_message_parameterContext _localctx = new Display_message_parameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_display_message_parameter);
		try {
			int _alt;
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				string();
				}
				break;
			case T__1:
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case OPEN_PAREN:
			case CLOSE_PAREN:
			case OPEN_BRACKET:
			case CLOSE_BRACKET:
			case OPEN_BRACE:
			case CLOSE_BRACE:
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
			case ANDAND:
			case OROR:
			case NOT:
			case ASSIGN:
			case EQUAL:
			case QUESTION:
			case COLON:
			case DOT:
			case SEMICOLON:
			case COMMA:
			case UNDERSCORE:
			case SINGLE_QUOTE:
			case LOWERCASE:
			case UPPERCASE:
			case DIGIT:
			case WHITE_SPACE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1049);
					expression(0);
					}
					break;
				case 2:
					{
					setState(1050);
					scan_label();
					}
					break;
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1053);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1058);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				}
				notifyErrorListeners("1st parameter should be string");
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

	public static class Scan_labelContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<Lexer_predefined_wordsContext> lexer_predefined_words() {
			return getRuleContexts(Lexer_predefined_wordsContext.class);
		}
		public Lexer_predefined_wordsContext lexer_predefined_words(int i) {
			return getRuleContext(Lexer_predefined_wordsContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Scan_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterScan_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitScan_label(this);
		}
	}

	public final Scan_labelContext scan_label() throws RecognitionException {
		Scan_labelContext _localctx = new Scan_labelContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_scan_label);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1067);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1063);
						match(DIGIT);
						}
						break;
					case 2:
						{
						setState(1064);
						lexer_predefined_words();
						}
						break;
					case 3:
						{
						setState(1065);
						label();
						}
						break;
					case 4:
						{
						setState(1066);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1069); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Value_parameterContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Value_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterValue_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitValue_parameter(this);
		}
	}

	public final Value_parameterContext value_parameter() throws RecognitionException {
		Value_parameterContext _localctx = new Value_parameterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value_parameter);
		try {
			setState(1075);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case NOT:
			case ASSIGN:
			case EQUAL:
			case QUESTION:
			case COLON:
			case DOT:
			case SEMICOLON:
			case COMMA:
			case UNDERSCORE:
			case SINGLE_QUOTE:
			case LOWERCASE:
			case UPPERCASE:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				label();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				string();
				notifyErrorListeners("2nd parameter should not be string");
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(MainParser.CONSTANT, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConstant_declaration(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(CONSTANT);
			setState(1078);
			match(WHITE_SPACE);
			setState(1079);
			any_declaration();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MainParser.RETURN, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_return_statement);
		int _la;
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				match(RETURN);
				setState(1082);
				match(WHITE_SPACE);
				setState(1083);
				return_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(RETURN);
				setState(1085);
				match(WHITE_SPACE);
				setState(1086);
				return_value();
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1087);
					match(WHITE_SPACE);
					}
					}
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1093);
				match(OPEN_PAREN);
				setState(1094);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				match(RETURN);
				setState(1098);
				match(WHITE_SPACE);
				setState(1099);
				variable_type();
				notifyErrorListeners("Invalid return value");
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

	public static class Return_valueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Return_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterReturn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitReturn_value(this);
		}
	}

	public final Return_valueContext return_value() throws RecognitionException {
		Return_valueContext _localctx = new Return_valueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_return_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1104);
				string();
				}
				break;
			case 2:
				{
				setState(1105);
				number();
				}
				break;
			case 3:
				{
				setState(1106);
				label();
				}
				break;
			case 4:
				{
				setState(1107);
				expression(0);
				}
				break;
			case 5:
				{
				setState(1108);
				function_calling();
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(MainParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(MainParser.OPEN_PAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MainParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MainParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1112);
				value_expression();
				}
				break;
			case 2:
				{
				setState(1113);
				match(OPEN_PAREN);
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1114);
					match(WHITE_SPACE);
					}
				}

				setState(1117);
				expression(0);
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1118);
					match(WHITE_SPACE);
					}
				}

				setState(1121);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				setState(1124); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1123);
						match(OPEN_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1126); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1128);
					match(WHITE_SPACE);
					}
				}

				setState(1131);
				expression(0);
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1132);
					match(WHITE_SPACE);
					}
				}

				setState(1136); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1135);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1138); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Multiple parenthesis");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1145);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1148);
						operators();
						}
						setState(1150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1149);
							match(WHITE_SPACE);
							}
						}

						setState(1152);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1154);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1156);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1155);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1158);
						operators();
						setState(1160); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1159);
								operators();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1162); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						setState(1165);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1164);
							match(WHITE_SPACE);
							}
						}

						setState(1167);
						expression(4);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Array_labelContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Alt_expressionContext alt_expression() {
			return getRuleContext(Alt_expressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Array_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_label(this);
		}
	}

	public final Array_labelContext array_label() throws RecognitionException {
		Array_labelContext _localctx = new Array_labelContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_array_label);
		int _la;
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				label();
				setState(1176);
				match(OPEN_BRACE);
				setState(1177);
				alt_expression();
				setState(1178);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
				label();
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1181);
					match(OPEN_BRACE);
					}
				}

				setState(1184);
				alt_expression();
				setState(1186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1185);
					match(CLOSE_BRACE);
					}
					break;
				}
				notifyErrorListeners("Missing brace/s");
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

	public static class Value_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Array_labelContext array_label() {
			return getRuleContext(Array_labelContext.class,0);
		}
		public Value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterValue_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitValue_expression(this);
		}
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_value_expression);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1194);
				function_calling();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1195);
				array_label();
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

	public static class Alt_expressionContext extends ParserRuleContext {
		public Alt_parenthesis_expressionContext alt_parenthesis_expression() {
			return getRuleContext(Alt_parenthesis_expressionContext.class,0);
		}
		public Alt_operator_expressionContext alt_operator_expression() {
			return getRuleContext(Alt_operator_expressionContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Alt_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_expression(this);
		}
	}

	public final Alt_expressionContext alt_expression() throws RecognitionException {
		Alt_expressionContext _localctx = new Alt_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_alt_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			alt_parenthesis_expression();
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1199);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1202);
			alt_operator_expression();
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

	public static class Alt_operator_expressionContext extends ParserRuleContext {
		public Alt_first_expression_operatorContext alt_first_expression_operator() {
			return getRuleContext(Alt_first_expression_operatorContext.class,0);
		}
		public Alt_second_expression_operatorContext alt_second_expression_operator() {
			return getRuleContext(Alt_second_expression_operatorContext.class,0);
		}
		public Alt_operator_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_operator_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_operator_expression(this);
		}
	}

	public final Alt_operator_expressionContext alt_operator_expression() throws RecognitionException {
		Alt_operator_expressionContext _localctx = new Alt_operator_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alt_operator_expression);
		try {
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				alt_first_expression_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				alt_second_expression_operator();
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

	public static class Alt_parenthesis_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Alt_expressionContext alt_expression() {
			return getRuleContext(Alt_expressionContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MainParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MainParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Alt_value_expressionContext> alt_value_expression() {
			return getRuleContexts(Alt_value_expressionContext.class);
		}
		public Alt_value_expressionContext alt_value_expression(int i) {
			return getRuleContext(Alt_value_expressionContext.class,i);
		}
		public Alt_operator_expressionContext alt_operator_expression() {
			return getRuleContext(Alt_operator_expressionContext.class,0);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public Alt_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_parenthesis_expression(this);
		}
	}

	public final Alt_parenthesis_expressionContext alt_parenthesis_expression() throws RecognitionException {
		Alt_parenthesis_expressionContext _localctx = new Alt_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alt_parenthesis_expression);
		int _la;
		try {
			int _alt;
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				match(OPEN_PAREN);
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1209);
					match(WHITE_SPACE);
					}
				}

				setState(1212);
				alt_expression();
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1213);
					match(WHITE_SPACE);
					}
				}

				setState(1216);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				match(OPEN_PAREN);
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1219);
					match(WHITE_SPACE);
					}
				}

				setState(1222);
				alt_expression();
				setState(1224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1223);
					match(WHITE_SPACE);
					}
					break;
				}
				notifyErrorListeners("Uneven parenthesis, missing ')'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1228);
				match(OPEN_PAREN);
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1229);
					match(WHITE_SPACE);
					}
				}

				setState(1232);
				alt_expression();
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1233);
					match(WHITE_SPACE);
					}
				}

				setState(1237); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1236);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1239); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Uneven parenthesis, duplicate ')'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1243);
				alt_value_expression();
				setState(1245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1244);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1247);
				alt_operator_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1249);
				alt_value_expression();
				setState(1255); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1250);
						match(WHITE_SPACE);
						setState(1253);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__1:
						case CREATE:
						case CONSTANT:
						case RETURN:
						case PRINT:
						case SCAN:
						case VOID:
						case FUNC:
						case MAIN:
						case IF:
						case ELSE:
						case ELSE_IF:
						case THEN:
						case FOR:
						case UP_TO:
						case DOWN_TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case NOT:
						case ASSIGN:
						case EQUAL:
						case QUESTION:
						case COLON:
						case DOT:
						case SEMICOLON:
						case COMMA:
						case UNDERSCORE:
						case SINGLE_QUOTE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1251);
							alt_value_expression();
							}
							break;
						case T__0:
							{
							setState(1252);
							string();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1257); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1259);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1262);
				alt_operator_expression();
				notifyErrorListeners("Too many value expression");
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

	public static class Alt_first_expression_operatorContext extends ParserRuleContext {
		public First_operatorsContext first_operators() {
			return getRuleContext(First_operatorsContext.class,0);
		}
		public Alt_expressionContext alt_expression() {
			return getRuleContext(Alt_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Alt_value_expressionContext> alt_value_expression() {
			return getRuleContexts(Alt_value_expressionContext.class);
		}
		public Alt_value_expressionContext alt_value_expression(int i) {
			return getRuleContext(Alt_value_expressionContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public Alt_first_expression_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_first_expression_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_first_expression_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_first_expression_operator(this);
		}
	}

	public final Alt_first_expression_operatorContext alt_first_expression_operator() throws RecognitionException {
		Alt_first_expression_operatorContext _localctx = new Alt_first_expression_operatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_alt_first_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				first_operators();
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1268);
					match(WHITE_SPACE);
					}
				}

				setState(1271);
				alt_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				first_operators();
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1274);
					match(WHITE_SPACE);
					}
				}

				setState(1277);
				alt_expression();
				setState(1283); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1278);
						match(WHITE_SPACE);
						setState(1281);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__1:
						case CREATE:
						case CONSTANT:
						case RETURN:
						case PRINT:
						case SCAN:
						case VOID:
						case FUNC:
						case MAIN:
						case IF:
						case ELSE:
						case ELSE_IF:
						case THEN:
						case FOR:
						case UP_TO:
						case DOWN_TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case NOT:
						case ASSIGN:
						case EQUAL:
						case QUESTION:
						case COLON:
						case DOT:
						case SEMICOLON:
						case COMMA:
						case UNDERSCORE:
						case SINGLE_QUOTE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1279);
							alt_value_expression();
							}
							break;
						case T__0:
							{
							setState(1280);
							string();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1285); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1289);
				first_operators();
				setState(1297); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1293);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1290);
							match(WHITE_SPACE);
							}
							}
							setState(1295);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1296);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1299); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1301);
					match(WHITE_SPACE);
					}
				}

				setState(1304);
				alt_expression();
				notifyErrorListeners("Too Many Operators");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Alt_second_expression_operatorContext extends ParserRuleContext {
		public Second_operatorsContext second_operators() {
			return getRuleContext(Second_operatorsContext.class,0);
		}
		public Alt_expressionContext alt_expression() {
			return getRuleContext(Alt_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Alt_value_expressionContext> alt_value_expression() {
			return getRuleContexts(Alt_value_expressionContext.class);
		}
		public Alt_value_expressionContext alt_value_expression(int i) {
			return getRuleContext(Alt_value_expressionContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public Alt_second_expression_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_second_expression_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_second_expression_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_second_expression_operator(this);
		}
	}

	public final Alt_second_expression_operatorContext alt_second_expression_operator() throws RecognitionException {
		Alt_second_expression_operatorContext _localctx = new Alt_second_expression_operatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_alt_second_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				second_operators();
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1311);
					match(WHITE_SPACE);
					}
				}

				setState(1314);
				alt_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				second_operators();
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1317);
					match(WHITE_SPACE);
					}
				}

				setState(1320);
				alt_expression();
				setState(1326); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1321);
						match(WHITE_SPACE);
						setState(1324);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__1:
						case CREATE:
						case CONSTANT:
						case RETURN:
						case PRINT:
						case SCAN:
						case VOID:
						case FUNC:
						case MAIN:
						case IF:
						case ELSE:
						case ELSE_IF:
						case THEN:
						case FOR:
						case UP_TO:
						case DOWN_TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case NOT:
						case ASSIGN:
						case EQUAL:
						case QUESTION:
						case COLON:
						case DOT:
						case SEMICOLON:
						case COMMA:
						case UNDERSCORE:
						case SINGLE_QUOTE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1322);
							alt_value_expression();
							}
							break;
						case T__0:
							{
							setState(1323);
							string();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1328); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1332);
				second_operators();
				setState(1340); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1336);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1333);
							match(WHITE_SPACE);
							}
							}
							setState(1338);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1339);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1342); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1344);
					match(WHITE_SPACE);
					}
				}

				setState(1347);
				alt_expression();
				notifyErrorListeners("Too Many Operators");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Alt_value_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Alt_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_value_expression(this);
		}
	}

	public final Alt_value_expressionContext alt_value_expression() throws RecognitionException {
		Alt_value_expressionContext _localctx = new Alt_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_alt_value_expression);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1355);
				function_calling();
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

	public static class Comparison_statementContext extends ParserRuleContext {
		public Value_comparisonContext value_comparison() {
			return getRuleContext(Value_comparisonContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public List<Comparison_statementContext> comparison_statement() {
			return getRuleContexts(Comparison_statementContext.class);
		}
		public Comparison_statementContext comparison_statement(int i) {
			return getRuleContext(Comparison_statementContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode NOT() { return getToken(MainParser.NOT, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Other_operatorsContext> other_operators() {
			return getRuleContexts(Other_operatorsContext.class);
		}
		public Other_operatorsContext other_operators(int i) {
			return getRuleContext(Other_operatorsContext.class,i);
		}
		public Comparison_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterComparison_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitComparison_statement(this);
		}
	}

	public final Comparison_statementContext comparison_statement() throws RecognitionException {
		return comparison_statement(0);
	}

	private Comparison_statementContext comparison_statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comparison_statementContext _localctx = new Comparison_statementContext(_ctx, _parentState);
		Comparison_statementContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_comparison_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1359);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(1360);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1361);
					match(NOT);
					}
				}

				setState(1364);
				match(OPEN_PAREN);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1365);
					match(WHITE_SPACE);
					}
				}

				setState(1368);
				comparison_statement(0);
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1369);
					match(WHITE_SPACE);
					}
				}

				setState(1372);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1376);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1378);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1377);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1380);
						other_operators();
						}
						setState(1382);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1381);
							match(WHITE_SPACE);
							}
						}

						setState(1384);
						comparison_statement(4);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1386);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1388);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1387);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1390);
						other_operators();
						setState(1392); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1391);
							other_operators();
							}
							}
							setState(1394); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR))) != 0) );
						}
						setState(1397);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1396);
							match(WHITE_SPACE);
							}
						}

						setState(1399);
						comparison_statement(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Value_comparisonContext value_comparison() {
			return getRuleContext(Value_comparisonContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignment_statement);
		int _la;
		try {
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				label();
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1408);
					match(WHITE_SPACE);
					}
				}

				setState(1411);
				match(EQUAL);
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1412);
					match(WHITE_SPACE);
					}
				}

				setState(1417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1415);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(1416);
					string();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1419);
				label();
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1420);
					match(WHITE_SPACE);
					}
				}

				setState(1423);
				match(ASSIGN);
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1424);
					match(WHITE_SPACE);
					}
				}

				setState(1429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1427);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(1428);
					string();
					}
					break;
				}
				notifyErrorListeners("Invalid comparison symbol '=', should be '=='");
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

	public static class Value_comparisonContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Value_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterValue_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitValue_comparison(this);
		}
	}

	public final Value_comparisonContext value_comparison() throws RecognitionException {
		Value_comparisonContext _localctx = new Value_comparisonContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_value_comparison);
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1437);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1438);
				string();
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_conditional_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			if_statement();
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1442);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==WHITE_SPACE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1445);
					else_if_statement();
					setState(1447);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
					case 1:
						{
						setState(1446);
						_la = _input.LA(1);
						if ( !(_la==NEWLINE || _la==WHITE_SPACE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(1453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1454);
				else_statement();
				setState(1458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1455);
						match(NEWLINE);
						}
						} 
					}
					setState(1460);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				}
				}
				break;
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

	public static class Conditional_comparison_structureContext extends ParserRuleContext {
		public With_comparisonContext with_comparison() {
			return getRuleContext(With_comparisonContext.class,0);
		}
		public Conditional_bodyContext conditional_body() {
			return getRuleContext(Conditional_bodyContext.class,0);
		}
		public Conditional_comparison_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_comparison_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConditional_comparison_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConditional_comparison_structure(this);
		}
	}

	public final Conditional_comparison_structureContext conditional_comparison_structure() throws RecognitionException {
		Conditional_comparison_structureContext _localctx = new Conditional_comparison_structureContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_conditional_comparison_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			with_comparison();
			setState(1464);
			conditional_body();
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

	public static class With_thenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode LINECOMMENT() { return getToken(MainParser.LINECOMMENT, 0); }
		public With_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterWith_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitWith_then(this);
		}
	}

	public final With_thenContext with_then() throws RecognitionException {
		With_thenContext _localctx = new With_thenContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_with_then);
		int _la;
		try {
			int _alt;
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1466);
					match(WHITE_SPACE);
					}
				}

				setState(1469);
				match(THEN);
				setState(1471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1470);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1473);
					match(LINECOMMENT);
					}
					break;
				}
				setState(1479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1476);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1481);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1482);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1485);
					match(THEN);
					}
					break;
				}
				setState(1489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1488);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1491);
					match(LINECOMMENT);
					}
					break;
				}
				setState(1497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1494);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1499);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
				}
				notifyErrorListeners("Missing 'then' word");
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

	public static class With_comparisonContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public With_thenContext with_then() {
			return getRuleContext(With_thenContext.class,0);
		}
		public With_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterWith_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitWith_comparison(this);
		}
	}

	public final With_comparisonContext with_comparison() throws RecognitionException {
		With_comparisonContext _localctx = new With_comparisonContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_with_comparison);
		int _la;
		try {
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				match(OPEN_PAREN);
				setState(1504);
				comparison_statement(0);
				setState(1505);
				match(CLOSE_PAREN);
				setState(1506);
				with_then();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1508);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(1511);
				comparison_statement(0);
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1512);
					match(CLOSE_PAREN);
					}
				}

				setState(1515);
				with_then();
				notifyErrorListeners("Uneven parenthesis");
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

	public static class Conditional_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Conditional_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConditional_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConditional_body(this);
		}
	}

	public final Conditional_bodyContext conditional_body() throws RecognitionException {
		Conditional_bodyContext _localctx = new Conditional_bodyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_conditional_body);
		int _la;
		try {
			int _alt;
			setState(1577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1520);
					match(WHITE_SPACE);
					}
					}
					setState(1525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1526);
				match(OPEN_BRACKET);
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1527);
					match(WHITE_SPACE);
					}
					}
					setState(1532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1533);
					statements();
					}
					}
					setState(1536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1538);
					match(WHITE_SPACE);
					}
					}
					setState(1543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1544);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1546);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				}
				setState(1553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(1552);
					match(OPEN_BRACKET);
					}
					break;
				}
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1555);
					match(WHITE_SPACE);
					}
					}
					setState(1560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1562); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1561);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1564); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1566);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				}
				setState(1573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(1572);
					match(CLOSE_BRACKET);
					}
					break;
				}
				notifyErrorListeners("Uneven bracket/s");
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MainParser.IF, 0); }
		public Conditional_comparison_structureContext conditional_comparison_structure() {
			return getRuleContext(Conditional_comparison_structureContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			match(IF);
			setState(1580);
			conditional_comparison_structure();
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

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(MainParser.ELSE_IF, 0); }
		public Conditional_comparison_structureContext conditional_comparison_structure() {
			return getRuleContext(Conditional_comparison_structureContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitElse_if_statement(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			match(ELSE_IF);
			setState(1583);
			conditional_comparison_structure();
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MainParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
		public Conditional_bodyContext conditional_body() {
			return getRuleContext(Conditional_bodyContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(ELSE);
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1586);
				match(WHITE_SPACE);
				}
			}

			setState(1589);
			match(THEN);
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1590);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1593);
			conditional_body();
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

	public static class Loop_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_statement(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_loop_statement);
		try {
			setState(1597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1595);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				for_statement();
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

	public static class Loop_conditionalContext extends ParserRuleContext {
		public TerminalNode UP_TO() { return getToken(MainParser.UP_TO, 0); }
		public TerminalNode DOWN_TO() { return getToken(MainParser.DOWN_TO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Loop_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_conditional(this);
		}
	}

	public final Loop_conditionalContext loop_conditional() throws RecognitionException {
		Loop_conditionalContext _localctx = new Loop_conditionalContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_loop_conditional);
		try {
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1599);
				match(UP_TO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
				match(DOWN_TO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1601);
				label();
				notifyErrorListeners("Must be 'up to' or 'down to' only");
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

	public static class Loop_structureContext extends ParserRuleContext {
		public Loop_conditionalContext loop_conditional() {
			return getRuleContext(Loop_conditionalContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Loop_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_structure(this);
		}
	}

	public final Loop_structureContext loop_structure() throws RecognitionException {
		Loop_structureContext _localctx = new Loop_structureContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				loop_conditional();
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1607);
					match(WHITE_SPACE);
					}
				}

				setState(1610);
				expression(0);
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1611);
					match(WHITE_SPACE);
					}
				}

				setState(1614);
				match(OPEN_BRACKET);
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1615);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
				}
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0)) {
					{
					{
					setState(1621);
					statements();
					}
					}
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1627);
					match(WHITE_SPACE);
					}
					}
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1633);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1635);
				loop_conditional();
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1636);
					match(WHITE_SPACE);
					}
				}

				setState(1639);
				expression(0);
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1640);
					match(WHITE_SPACE);
					}
				}

				setState(1643);
				match(OPEN_BRACKET);
				setState(1647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1644);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1650);
						statements();
						}
						} 
					}
					setState(1655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				}
				setState(1659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1656);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				}
				notifyErrorListeners("Missing closing curly brackets");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1664);
				loop_conditional();
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1665);
					match(WHITE_SPACE);
					}
				}

				setState(1668);
				expression(0);
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(1669);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1672);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				}
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0)) {
					{
					{
					setState(1678);
					statements();
					}
					}
					setState(1683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1684);
					match(WHITE_SPACE);
					}
					}
					setState(1689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1690);
				match(CLOSE_BRACKET);
				notifyErrorListeners("Missing opening curly brackets");
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

	public static class Loop_variable_declarationContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_variable_declaration(this);
		}
	}

	public final Loop_variable_declarationContext loop_variable_declaration() throws RecognitionException {
		Loop_variable_declarationContext _localctx = new Loop_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(1695);
					variable_type();
					setState(1696);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1700);
				label();
				setState(1702);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(1701);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(1704);
					match(ASSIGN);
					setState(1706);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(1705);
						match(WHITE_SPACE);
						}
					}

					setState(1708);
					loop_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				expression(0);
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

	public static class Loop_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_expression(this);
		}
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(1714);
				number();
				}
				break;
			case 2:
				{
				setState(1715);
				label();
				}
				break;
			case 3:
				{
				setState(1716);
				expression(0);
				}
				break;
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MainParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_structureContext loop_structure() {
			return getRuleContext(Loop_structureContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(WHILE);
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1720);
				match(WHITE_SPACE);
				}
			}

			setState(1723);
			expression(0);
			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1724);
				match(WHITE_SPACE);
				}
			}

			setState(1727);
			loop_structure();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MainParser.FOR, 0); }
		public Loop_variable_declarationContext loop_variable_declaration() {
			return getRuleContext(Loop_variable_declarationContext.class,0);
		}
		public Loop_structureContext loop_structure() {
			return getRuleContext(Loop_structureContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			match(FOR);
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1730);
				match(WHITE_SPACE);
				}
			}

			setState(1733);
			loop_variable_declaration();
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1734);
				match(WHITE_SPACE);
				}
			}

			setState(1737);
			loop_structure();
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

	public static class Function_callingContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(MainParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(MainParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MainParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MainParser.CLOSE_PAREN, i);
		}
		public List<Function_parametersContext> function_parameters() {
			return getRuleContexts(Function_parametersContext.class);
		}
		public Function_parametersContext function_parameters(int i) {
			return getRuleContext(Function_parametersContext.class,i);
		}
		public Function_callingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_calling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_calling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_calling(this);
		}
	}

	public final Function_callingContext function_calling() throws RecognitionException {
		Function_callingContext _localctx = new Function_callingContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_function_calling);
		int _la;
		try {
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				label();
				setState(1740);
				match(OPEN_PAREN);
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1741);
					function_parameters();
					}
				}

				setState(1744);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746);
				label();
				setState(1747);
				match(OPEN_PAREN);
				setState(1749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(1748);
					function_parameters();
					}
					break;
				}
				notifyErrorListeners("Missing closing parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1753);
				label();
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1754);
					function_parameters();
					}
				}

				setState(1757);
				match(CLOSE_PAREN);
				notifyErrorListeners("Missing opening parenthesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1760);
				label();
				setState(1761);
				match(OPEN_PAREN);
				setState(1763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1762);
					function_parameters();
					}
				}

				setState(1765);
				match(CLOSE_PAREN);
				setState(1766);
				match(OPEN_PAREN);
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1767);
					function_parameters();
					}
				}

				setState(1770);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
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

	public static class Function_parametersContext extends ParserRuleContext {
		public List<Function_paremeters_valueContext> function_paremeters_value() {
			return getRuleContexts(Function_paremeters_valueContext.class);
		}
		public Function_paremeters_valueContext function_paremeters_value(int i) {
			return getRuleContext(Function_paremeters_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainParser.COMMA, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_parameters(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_function_parameters);
		int _la;
		try {
			int _alt;
			setState(1820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1775);
				function_paremeters_value();
				setState(1786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1777);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1776);
							match(WHITE_SPACE);
							}
						}

						setState(1779);
						match(COMMA);
						setState(1781);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1780);
							match(WHITE_SPACE);
							}
						}

						setState(1783);
						function_paremeters_value();
						}
						} 
					}
					setState(1788);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				function_paremeters_value();
				setState(1794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1790);
						match(WHITE_SPACE);
						setState(1791);
						function_paremeters_value();
						}
						} 
					}
					setState(1796);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
				}
				notifyErrorListeners("Missing Comma");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1799);
				function_paremeters_value();
				setState(1815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1801);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1800);
							match(WHITE_SPACE);
							}
						}

						setState(1803);
						match(COMMA);
						setState(1805); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1804);
								match(COMMA);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1807); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1810);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1809);
							match(WHITE_SPACE);
							}
						}

						setState(1812);
						function_paremeters_value();
						}
						} 
					}
					setState(1817);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				}
				notifyErrorListeners("Too much Commas");
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

	public static class Function_paremeters_valueContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Function_paremeters_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_paremeters_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_paremeters_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_paremeters_value(this);
		}
	}

	public final Function_paremeters_valueContext function_paremeters_value() throws RecognitionException {
		Function_paremeters_valueContext _localctx = new Function_paremeters_valueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_function_paremeters_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				setState(1822);
				label();
				}
				break;
			case 2:
				{
				setState(1823);
				expression(0);
				}
				break;
			case 3:
				{
				setState(1824);
				string();
				}
				break;
			case 4:
				{
				setState(1825);
				number();
				}
				break;
			case 5:
				{
				setState(1826);
				function_calling();
				}
				break;
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Void_functionContext void_function() {
			return getRuleContext(Void_functionContext.class,0);
		}
		public Non_void_functionContext non_void_function() {
			return getRuleContext(Non_void_functionContext.class,0);
		}
		public Error_functionContext error_function() {
			return getRuleContext(Error_functionContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_function_declaration);
		try {
			setState(1832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1829);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
				non_void_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1831);
				error_function();
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

	public static class Function_labelContext extends ParserRuleContext {
		public List<Label_words_withoutsymbolContext> label_words_withoutsymbol() {
			return getRuleContexts(Label_words_withoutsymbolContext.class);
		}
		public Label_words_withoutsymbolContext label_words_withoutsymbol(int i) {
			return getRuleContext(Label_words_withoutsymbolContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<Function_labelContext> function_label() {
			return getRuleContexts(Function_labelContext.class);
		}
		public Function_labelContext function_label(int i) {
			return getRuleContext(Function_labelContext.class,i);
		}
		public List<TerminalNode> LOWERCASE() { return getTokens(MainParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(MainParser.LOWERCASE, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(MainParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MainParser.UNDERSCORE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(MainParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(MainParser.UPPERCASE, i);
		}
		public Function_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_label(this);
		}
	}

	public final Function_labelContext function_label() throws RecognitionException {
		Function_labelContext _localctx = new Function_labelContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_function_label);
		int _la;
		try {
			int _alt;
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
					{
					{
					setState(1834);
					label_words_withoutsymbol();
					}
					}
					setState(1839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1841); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1840);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1843); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1845);
						match(DIGIT);
						}
						} 
					}
					setState(1850);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
				}
				setState(1854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1851);
						label_words_withoutsymbol();
						}
						} 
					}
					setState(1856);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
				}
				setState(1860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1857);
						function_label();
						}
						} 
					}
					setState(1862);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
					{
					{
					setState(1863);
					label_words_withoutsymbol();
					}
					}
					setState(1868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1869);
				match(DIGIT);
				setState(1871); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1870);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1873); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1875);
						match(DIGIT);
						}
						} 
					}
					setState(1880);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
				}
				setState(1884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1881);
						label_words_withoutsymbol();
						}
						} 
					}
					setState(1886);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				}
				setState(1890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1887);
						function_label();
						}
						} 
					}
					setState(1892);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
				}
				notifyErrorListeners("Missing Operator");
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

	public static class Function_structureContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
		}
		public Function_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_structure(this);
		}
	}

	public final Function_structureContext function_structure() throws RecognitionException {
		Function_structureContext _localctx = new Function_structureContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			label();
			setState(1897);
			match(OPEN_PAREN);
			setState(1899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACE) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0)) {
				{
				setState(1898);
				function_declaration_parameters();
				}
			}

			setState(1901);
			match(CLOSE_PAREN);
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1902);
				match(WHITE_SPACE);
				}
			}

			setState(1905);
			match(OPEN_BRACKET);
			setState(1909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1906);
				match(WHITE_SPACE);
				}
				}
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1913); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1912);
				statements();
				}
				}
				setState(1915); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(1920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1917);
				match(WHITE_SPACE);
				}
				}
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1923);
			match(CLOSE_BRACKET);
			setState(1927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1924);
				match(NEWLINE);
				}
				}
				setState(1929);
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

	public static class Function_declaration_parametersContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Function_labelContext function_label() {
			return getRuleContext(Function_labelContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Function_declaration_parameters_bodyContext function_declaration_parameters_body() {
			return getRuleContext(Function_declaration_parameters_bodyContext.class,0);
		}
		public Function_declaration_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_declaration_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_declaration_parameters(this);
		}
	}

	public final Function_declaration_parametersContext function_declaration_parameters() throws RecognitionException {
		Function_declaration_parametersContext _localctx = new Function_declaration_parametersContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_function_declaration_parameters);
		int _la;
		try {
			setState(1956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				variable_type();
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1931);
					match(OPEN_BRACE);
					setState(1932);
					match(CLOSE_BRACE);
					}
				}

				setState(1935);
				match(WHITE_SPACE);
				setState(1936);
				function_label();
				setState(1938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==WHITE_SPACE) {
					{
					setState(1937);
					function_declaration_parameters_body();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(1940);
					variable_type();
					}
					break;
				}
				setState(1945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1943);
					match(OPEN_BRACE);
					setState(1944);
					match(CLOSE_BRACE);
					}
				}

				setState(1948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1947);
					match(WHITE_SPACE);
					}
				}

				setState(1950);
				function_label();
				setState(1952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==WHITE_SPACE) {
					{
					setState(1951);
					function_declaration_parameters_body();
					}
				}

				notifyErrorListeners("Missing data type in function parameter");
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

	public static class Function_declaration_parameters_bodyContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Function_declaration_parameters_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_parameters_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_declaration_parameters_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_declaration_parameters_body(this);
		}
	}

	public final Function_declaration_parameters_bodyContext function_declaration_parameters_body() throws RecognitionException {
		Function_declaration_parameters_bodyContext _localctx = new Function_declaration_parameters_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_function_declaration_parameters_body);
		try {
			int _alt;
			setState(1971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1958);
				match(COMMA);
				setState(1960);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(1959);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1962);
				function_declaration_parameters();
				}
				break;
			case WHITE_SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1964); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1963);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1966); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1968);
				function_declaration_parameters();
				notifyErrorListeners("Missing comma after each parameter");
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

	public static class Void_functionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode VOID() { return getToken(MainParser.VOID, 0); }
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public Void_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVoid_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVoid_function(this);
		}
	}

	public final Void_functionContext void_function() throws RecognitionException {
		Void_functionContext _localctx = new Void_functionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_void_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			match(FUNC);
			setState(1974);
			match(WHITE_SPACE);
			setState(1975);
			match(VOID);
			setState(1976);
			match(WHITE_SPACE);
			setState(1977);
			function_structure();
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

	public static class Non_void_functionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Non_void_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_void_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterNon_void_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitNon_void_function(this);
		}
	}

	public final Non_void_functionContext non_void_function() throws RecognitionException {
		Non_void_functionContext _localctx = new Non_void_functionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_non_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			match(FUNC);
			setState(1980);
			match(WHITE_SPACE);
			setState(1981);
			variable_type();
			setState(1984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1982);
				match(OPEN_BRACE);
				setState(1983);
				match(CLOSE_BRACE);
				}
			}

			setState(1986);
			match(WHITE_SPACE);
			setState(1987);
			function_structure();
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

	public static class Error_functionContext extends ParserRuleContext {
		public Error_function_headContext error_function_head() {
			return getRuleContext(Error_function_headContext.class,0);
		}
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public Error_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterError_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitError_function(this);
		}
	}

	public final Error_functionContext error_function() throws RecognitionException {
		Error_functionContext _localctx = new Error_functionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_error_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			error_function_head();
			setState(1990);
			function_structure();
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

	public static class Error_function_headContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Error_function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterError_function_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitError_function_head(this);
		}
	}

	public final Error_function_headContext error_function_head() throws RecognitionException {
		Error_function_headContext _localctx = new Error_function_headContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_error_function_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			match(FUNC);
			setState(1993);
			match(WHITE_SPACE);
			notifyErrorListeners("Missing datatype after func");
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

	public static class Scoping_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Scoping_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoping_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterScoping_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitScoping_statement(this);
		}
	}

	public final Scoping_statementContext scoping_statement() throws RecognitionException {
		Scoping_statementContext _localctx = new Scoping_statementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(OPEN_BRACKET);
			setState(2000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1997);
				match(WHITE_SPACE);
				}
				}
				setState(2002);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2004); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2003);
				statements();
				}
				}
				setState(2006); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(2011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(2008);
				match(WHITE_SPACE);
				}
				}
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2014);
			match(CLOSE_BRACKET);
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

	public static class Main_functionContext extends ParserRuleContext {
		public Main_headContext main_head() {
			return getRuleContext(Main_headContext.class,0);
		}
		public Main_bodyContext main_body() {
			return getRuleContext(Main_bodyContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			main_head();
			setState(2017);
			main_body();
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

	public static class Main_headContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(MainParser.MAIN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Main_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_head(this);
		}
	}

	public final Main_headContext main_head() throws RecognitionException {
		Main_headContext _localctx = new Main_headContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_main_head);
		int _la;
		try {
			int _alt;
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				match(MAIN);
				setState(2020);
				match(OPEN_PAREN);
				setState(2021);
				match(CLOSE_PAREN);
				setState(2025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2022);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(2027);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2028);
				match(MAIN);
				setState(2030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(2029);
					match(OPEN_PAREN);
					}
				}

				setState(2033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(2032);
					match(CLOSE_PAREN);
					}
				}

				setState(2038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2035);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(2040);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				}
				notifyErrorListeners("Missing parenthesis");
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

	public static class Main_bodyContext extends ParserRuleContext {
		public Main_body_firstContext main_body_first() {
			return getRuleContext(Main_body_firstContext.class,0);
		}
		public Main_body_secondContext main_body_second() {
			return getRuleContext(Main_body_secondContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Main_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_body(this);
		}
	}

	public final Main_bodyContext main_body() throws RecognitionException {
		Main_bodyContext _localctx = new Main_bodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_main_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			main_body_first();
			setState(2048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(2045);
				match(WHITE_SPACE);
				}
				}
				setState(2050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2052); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2051);
				statements();
				}
				}
				setState(2054); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(2059);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2056);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(2061);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			setState(2062);
			main_body_second();
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

	public static class Main_body_firstContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public Main_body_firstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_body_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_body_first(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_body_first(this);
		}
	}

	public final Main_body_firstContext main_body_first() throws RecognitionException {
		Main_body_firstContext _localctx = new Main_body_firstContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_main_body_first);
		try {
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2064);
				match(OPEN_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing opening curly brackets");
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

	public static class Main_body_secondContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public Main_body_secondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_body_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_body_second(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_body_second(this);
		}
	}

	public final Main_body_secondContext main_body_second() throws RecognitionException {
		Main_body_secondContext _localctx = new Main_body_secondContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_main_body_second);
		try {
			setState(2070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				match(CLOSE_BRACKET);
				}
				break;
			case EOF:
			case NEWLINE:
			case WHITE_SPACE:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing closing curly brackets");
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 51:
			return comparison_statement_sempred((Comparison_statementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean comparison_statement_sempred(Comparison_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u081b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\5\2\u00b3\n\2\7\2\u00b5\n\2\f\2\16\2"+
		"\u00b8\13\2\3\2\3\2\7\2\u00bc\n\2\f\2\16\2\u00bf\13\2\7\2\u00c1\n\2\f"+
		"\2\16\2\u00c4\13\2\3\2\7\2\u00c7\n\2\f\2\16\2\u00ca\13\2\3\2\3\2\7\2\u00ce"+
		"\n\2\f\2\16\2\u00d1\13\2\3\2\7\2\u00d4\n\2\f\2\16\2\u00d7\13\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4\u00e2\n\4\r\4\16\4\u00e3\3\4\3\4\3\5"+
		"\5\5\u00e9\n\5\3\5\6\5\u00ec\n\5\r\5\16\5\u00ed\3\5\3\5\6\5\u00f2\n\5"+
		"\r\5\16\5\u00f3\3\5\5\5\u00f7\n\5\3\5\5\5\u00fa\n\5\3\5\6\5\u00fd\n\5"+
		"\r\5\16\5\u00fe\5\5\u0101\n\5\3\6\7\6\u0104\n\6\f\6\16\6\u0107\13\6\3"+
		"\6\6\6\u010a\n\6\r\6\16\6\u010b\3\6\7\6\u010f\n\6\f\6\16\6\u0112\13\6"+
		"\3\6\7\6\u0115\n\6\f\6\16\6\u0118\13\6\3\6\7\6\u011b\n\6\f\6\16\6\u011e"+
		"\13\6\3\6\7\6\u0121\n\6\f\6\16\6\u0124\13\6\3\6\3\6\6\6\u0128\n\6\r\6"+
		"\16\6\u0129\3\6\7\6\u012d\n\6\f\6\16\6\u0130\13\6\3\6\7\6\u0133\n\6\f"+
		"\6\16\6\u0136\13\6\3\6\7\6\u0139\n\6\f\6\16\6\u013c\13\6\3\6\5\6\u013f"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u0146\n\7\3\b\3\b\3\b\3\b\5\b\u014c\n\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\5\13\u0154\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16"+
		"\u015c\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0166\n\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u0174"+
		"\n\25\f\25\16\25\u0177\13\25\3\25\5\25\u017a\n\25\3\25\7\25\u017d\n\25"+
		"\f\25\16\25\u0180\13\25\3\25\7\25\u0183\n\25\f\25\16\25\u0186\13\25\3"+
		"\25\3\25\7\25\u018a\n\25\f\25\16\25\u018d\13\25\3\25\5\25\u0190\n\25\3"+
		"\25\7\25\u0193\n\25\f\25\16\25\u0196\13\25\3\25\7\25\u0199\n\25\f\25\16"+
		"\25\u019c\13\25\3\25\3\25\3\25\7\25\u01a1\n\25\f\25\16\25\u01a4\13\25"+
		"\3\25\5\25\u01a7\n\25\3\25\7\25\u01aa\n\25\f\25\16\25\u01ad\13\25\3\25"+
		"\7\25\u01b0\n\25\f\25\16\25\u01b3\13\25\3\25\3\25\7\25\u01b7\n\25\f\25"+
		"\16\25\u01ba\13\25\3\25\5\25\u01bd\n\25\3\25\7\25\u01c0\n\25\f\25\16\25"+
		"\u01c3\13\25\3\25\7\25\u01c6\n\25\f\25\16\25\u01c9\13\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u01d0\n\25\f\25\16\25\u01d3\13\25\3\25\5\25\u01d6\n\25"+
		"\3\25\7\25\u01d9\n\25\f\25\16\25\u01dc\13\25\3\25\7\25\u01df\n\25\f\25"+
		"\16\25\u01e2\13\25\3\25\3\25\7\25\u01e6\n\25\f\25\16\25\u01e9\13\25\3"+
		"\25\5\25\u01ec\n\25\3\25\7\25\u01ef\n\25\f\25\16\25\u01f2\13\25\3\25\7"+
		"\25\u01f5\n\25\f\25\16\25\u01f8\13\25\3\25\3\25\3\25\3\25\3\25\7\25\u01ff"+
		"\n\25\f\25\16\25\u0202\13\25\3\25\5\25\u0205\n\25\3\25\7\25\u0208\n\25"+
		"\f\25\16\25\u020b\13\25\3\25\7\25\u020e\n\25\f\25\16\25\u0211\13\25\3"+
		"\25\3\25\7\25\u0215\n\25\f\25\16\25\u0218\13\25\3\25\5\25\u021b\n\25\3"+
		"\25\7\25\u021e\n\25\f\25\16\25\u0221\13\25\3\25\7\25\u0224\n\25\f\25\16"+
		"\25\u0227\13\25\3\25\3\25\3\25\3\25\7\25\u022d\n\25\f\25\16\25\u0230\13"+
		"\25\3\25\5\25\u0233\n\25\3\25\7\25\u0236\n\25\f\25\16\25\u0239\13\25\3"+
		"\25\7\25\u023c\n\25\f\25\16\25\u023f\13\25\3\25\3\25\3\25\7\25\u0244\n"+
		"\25\f\25\16\25\u0247\13\25\3\25\5\25\u024a\n\25\3\25\7\25\u024d\n\25\f"+
		"\25\16\25\u0250\13\25\3\25\7\25\u0253\n\25\f\25\16\25\u0256\13\25\3\25"+
		"\3\25\7\25\u025a\n\25\f\25\16\25\u025d\13\25\3\25\5\25\u0260\n\25\3\25"+
		"\7\25\u0263\n\25\f\25\16\25\u0266\13\25\3\25\7\25\u0269\n\25\f\25\16\25"+
		"\u026c\13\25\3\25\3\25\3\25\3\25\7\25\u0272\n\25\f\25\16\25\u0275\13\25"+
		"\3\25\5\25\u0278\n\25\3\25\7\25\u027b\n\25\f\25\16\25\u027e\13\25\3\25"+
		"\7\25\u0281\n\25\f\25\16\25\u0284\13\25\3\25\3\25\3\25\7\25\u0289\n\25"+
		"\f\25\16\25\u028c\13\25\3\25\5\25\u028f\n\25\3\25\7\25\u0292\n\25\f\25"+
		"\16\25\u0295\13\25\3\25\7\25\u0298\n\25\f\25\16\25\u029b\13\25\3\25\3"+
		"\25\7\25\u029f\n\25\f\25\16\25\u02a2\13\25\3\25\5\25\u02a5\n\25\3\25\7"+
		"\25\u02a8\n\25\f\25\16\25\u02ab\13\25\3\25\7\25\u02ae\n\25\f\25\16\25"+
		"\u02b1\13\25\3\25\3\25\3\25\5\25\u02b6\n\25\3\26\3\26\3\26\5\26\u02bb"+
		"\n\26\3\26\3\26\6\26\u02bf\n\26\r\26\16\26\u02c0\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u02ca\n\26\3\26\3\26\6\26\u02ce\n\26\r\26\16\26\u02cf"+
		"\3\26\3\26\3\26\3\26\5\26\u02d6\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u02de\n\27\3\30\3\30\5\30\u02e2\n\30\3\30\3\30\5\30\u02e6\n\30\3\30\5"+
		"\30\u02e9\n\30\3\30\3\30\5\30\u02ed\n\30\3\30\3\30\5\30\u02f1\n\30\3\30"+
		"\5\30\u02f4\n\30\3\30\3\30\3\30\3\30\5\30\u02fa\n\30\3\30\3\30\5\30\u02fe"+
		"\n\30\3\30\5\30\u0301\n\30\3\30\3\30\5\30\u0305\n\30\3\31\3\31\3\31\3"+
		"\31\5\31\u030b\n\31\3\31\3\31\5\31\u030f\n\31\3\31\7\31\u0312\n\31\f\31"+
		"\16\31\u0315\13\31\3\32\3\32\5\32\u0319\n\32\3\32\3\32\5\32\u031d\n\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0323\n\32\3\32\3\32\5\32\u0327\n\32\3\32\3"+
		"\32\3\32\5\32\u032c\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0337\n\34\3\34\3\34\5\34\u033b\n\34\3\34\3\34\5\34\u033f\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u034c\n\35"+
		"\3\35\3\35\5\35\u0350\n\35\3\35\3\35\5\35\u0354\n\35\3\36\5\36\u0357\n"+
		"\36\3\36\3\36\5\36\u035b\n\36\3\36\3\36\5\36\u035f\n\36\3\36\3\36\5\36"+
		"\u0363\n\36\3\36\3\36\3\36\3\36\5\36\u0369\n\36\3\36\3\36\5\36\u036d\n"+
		"\36\3\36\3\36\5\36\u0371\n\36\3\36\5\36\u0374\n\36\3\36\3\36\5\36\u0378"+
		"\n\36\3\36\3\36\5\36\u037c\n\36\3\36\3\36\5\36\u0380\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u0388\n\37\3\37\3\37\5\37\u038c\n\37\3\37\5\37"+
		"\u038f\n\37\3\37\3\37\3\37\5\37\u0394\n\37\3\37\3\37\5\37\u0398\n\37\3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u03a4\n!\3!\3!\5!\u03a8\n!\3!\3!\5!\u03ac"+
		"\n!\3\"\3\"\3\"\6\"\u03b1\n\"\r\"\16\"\u03b2\3\"\3\"\3\"\3\"\5\"\u03b9"+
		"\n\"\3\"\3\"\5\"\u03bd\n\"\3\"\3\"\5\"\u03c1\n\"\7\"\u03c3\n\"\f\"\16"+
		"\"\u03c6\13\"\3\"\3\"\5\"\u03ca\n\"\3\"\3\"\5\"\u03ce\n\"\3\"\3\"\5\""+
		"\u03d2\n\"\7\"\u03d4\n\"\f\"\16\"\u03d7\13\"\3\"\6\"\u03da\n\"\r\"\16"+
		"\"\u03db\3\"\3\"\5\"\u03e0\n\"\3#\3#\3#\3#\5#\u03e6\n#\3$\3$\3$\3$\3$"+
		"\3$\3$\5$\u03ef\n$\3$\3$\5$\u03f3\n$\3$\3$\5$\u03f7\n$\3%\3%\5%\u03fb"+
		"\n%\3%\3%\5%\u03ff\n%\3%\3%\3%\3%\5%\u0405\n%\3%\5%\u0408\n%\3%\3%\3%"+
		"\3%\5%\u040e\n%\3%\5%\u0411\n%\3%\5%\u0414\n%\3%\3%\3%\5%\u0419\n%\3&"+
		"\3&\3&\5&\u041e\n&\3&\7&\u0421\n&\f&\16&\u0424\13&\3&\3&\5&\u0428\n&\3"+
		"\'\3\'\3\'\3\'\6\'\u042e\n\'\r\'\16\'\u042f\3(\3(\3(\3(\5(\u0436\n(\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\7*\u0443\n*\f*\16*\u0446\13*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u0451\n*\3+\3+\3+\3+\3+\5+\u0458\n+\3,\3,\3,\3,"+
		"\5,\u045e\n,\3,\3,\5,\u0462\n,\3,\3,\3,\6,\u0467\n,\r,\16,\u0468\3,\5"+
		",\u046c\n,\3,\3,\5,\u0470\n,\3,\6,\u0473\n,\r,\16,\u0474\3,\3,\5,\u0479"+
		"\n,\3,\3,\5,\u047d\n,\3,\3,\5,\u0481\n,\3,\3,\3,\3,\5,\u0487\n,\3,\3,"+
		"\6,\u048b\n,\r,\16,\u048c\3,\5,\u0490\n,\3,\3,\3,\7,\u0495\n,\f,\16,\u0498"+
		"\13,\3-\3-\3-\3-\3-\3-\3-\5-\u04a1\n-\3-\3-\5-\u04a5\n-\3-\3-\5-\u04a9"+
		"\n-\3.\3.\3.\3.\5.\u04af\n.\3/\3/\5/\u04b3\n/\3/\3/\3\60\3\60\5\60\u04b9"+
		"\n\60\3\61\3\61\5\61\u04bd\n\61\3\61\3\61\5\61\u04c1\n\61\3\61\3\61\3"+
		"\61\3\61\5\61\u04c7\n\61\3\61\3\61\5\61\u04cb\n\61\3\61\3\61\3\61\3\61"+
		"\5\61\u04d1\n\61\3\61\3\61\5\61\u04d5\n\61\3\61\6\61\u04d8\n\61\r\61\16"+
		"\61\u04d9\3\61\3\61\3\61\3\61\5\61\u04e0\n\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u04e8\n\61\6\61\u04ea\n\61\r\61\16\61\u04eb\3\61\5\61\u04ef"+
		"\n\61\3\61\3\61\3\61\5\61\u04f4\n\61\3\62\3\62\5\62\u04f8\n\62\3\62\3"+
		"\62\3\62\3\62\5\62\u04fe\n\62\3\62\3\62\3\62\3\62\5\62\u0504\n\62\6\62"+
		"\u0506\n\62\r\62\16\62\u0507\3\62\3\62\3\62\3\62\7\62\u050e\n\62\f\62"+
		"\16\62\u0511\13\62\3\62\6\62\u0514\n\62\r\62\16\62\u0515\3\62\5\62\u0519"+
		"\n\62\3\62\3\62\3\62\3\62\5\62\u051f\n\62\3\63\3\63\5\63\u0523\n\63\3"+
		"\63\3\63\3\63\3\63\5\63\u0529\n\63\3\63\3\63\3\63\3\63\5\63\u052f\n\63"+
		"\6\63\u0531\n\63\r\63\16\63\u0532\3\63\3\63\3\63\3\63\7\63\u0539\n\63"+
		"\f\63\16\63\u053c\13\63\3\63\6\63\u053f\n\63\r\63\16\63\u0540\3\63\5\63"+
		"\u0544\n\63\3\63\3\63\3\63\3\63\5\63\u054a\n\63\3\64\3\64\3\64\5\64\u054f"+
		"\n\64\3\65\3\65\3\65\3\65\5\65\u0555\n\65\3\65\3\65\5\65\u0559\n\65\3"+
		"\65\3\65\5\65\u055d\n\65\3\65\3\65\5\65\u0561\n\65\3\65\3\65\5\65\u0565"+
		"\n\65\3\65\3\65\5\65\u0569\n\65\3\65\3\65\3\65\3\65\5\65\u056f\n\65\3"+
		"\65\3\65\6\65\u0573\n\65\r\65\16\65\u0574\3\65\5\65\u0578\n\65\3\65\3"+
		"\65\3\65\7\65\u057d\n\65\f\65\16\65\u0580\13\65\3\66\3\66\5\66\u0584\n"+
		"\66\3\66\3\66\5\66\u0588\n\66\3\66\3\66\5\66\u058c\n\66\3\66\3\66\5\66"+
		"\u0590\n\66\3\66\3\66\5\66\u0594\n\66\3\66\3\66\5\66\u0598\n\66\3\66\3"+
		"\66\5\66\u059c\n\66\3\67\3\67\3\67\3\67\5\67\u05a2\n\67\38\38\58\u05a6"+
		"\n8\38\38\58\u05aa\n8\78\u05ac\n8\f8\168\u05af\138\38\38\78\u05b3\n8\f"+
		"8\168\u05b6\138\58\u05b8\n8\39\39\39\3:\5:\u05be\n:\3:\3:\5:\u05c2\n:"+
		"\3:\5:\u05c5\n:\3:\7:\u05c8\n:\f:\16:\u05cb\13:\3:\5:\u05ce\n:\3:\5:\u05d1"+
		"\n:\3:\5:\u05d4\n:\3:\5:\u05d7\n:\3:\7:\u05da\n:\f:\16:\u05dd\13:\3:\5"+
		":\u05e0\n:\3;\3;\3;\3;\3;\3;\5;\u05e8\n;\3;\3;\5;\u05ec\n;\3;\3;\3;\5"+
		";\u05f1\n;\3<\7<\u05f4\n<\f<\16<\u05f7\13<\3<\3<\7<\u05fb\n<\f<\16<\u05fe"+
		"\13<\3<\6<\u0601\n<\r<\16<\u0602\3<\7<\u0606\n<\f<\16<\u0609\13<\3<\3"+
		"<\3<\7<\u060e\n<\f<\16<\u0611\13<\3<\5<\u0614\n<\3<\7<\u0617\n<\f<\16"+
		"<\u061a\13<\3<\6<\u061d\n<\r<\16<\u061e\3<\7<\u0622\n<\f<\16<\u0625\13"+
		"<\3<\5<\u0628\n<\3<\3<\5<\u062c\n<\3=\3=\3=\3>\3>\3>\3?\3?\5?\u0636\n"+
		"?\3?\3?\5?\u063a\n?\3?\3?\3@\3@\5@\u0640\n@\3A\3A\3A\3A\3A\5A\u0647\n"+
		"A\3B\3B\5B\u064b\nB\3B\3B\5B\u064f\nB\3B\3B\7B\u0653\nB\fB\16B\u0656\13"+
		"B\3B\7B\u0659\nB\fB\16B\u065c\13B\3B\7B\u065f\nB\fB\16B\u0662\13B\3B\3"+
		"B\3B\3B\5B\u0668\nB\3B\3B\5B\u066c\nB\3B\3B\7B\u0670\nB\fB\16B\u0673\13"+
		"B\3B\7B\u0676\nB\fB\16B\u0679\13B\3B\7B\u067c\nB\fB\16B\u067f\13B\3B\3"+
		"B\3B\3B\5B\u0685\nB\3B\3B\5B\u0689\nB\3B\7B\u068c\nB\fB\16B\u068f\13B"+
		"\3B\7B\u0692\nB\fB\16B\u0695\13B\3B\7B\u0698\nB\fB\16B\u069b\13B\3B\3"+
		"B\3B\5B\u06a0\nB\3C\3C\3C\5C\u06a5\nC\3C\3C\5C\u06a9\nC\3C\3C\5C\u06ad"+
		"\nC\3C\5C\u06b0\nC\3C\5C\u06b3\nC\3D\3D\3D\5D\u06b8\nD\3E\3E\5E\u06bc"+
		"\nE\3E\3E\5E\u06c0\nE\3E\3E\3F\3F\5F\u06c6\nF\3F\3F\5F\u06ca\nF\3F\3F"+
		"\3G\3G\3G\5G\u06d1\nG\3G\3G\3G\3G\3G\5G\u06d8\nG\3G\3G\3G\3G\5G\u06de"+
		"\nG\3G\3G\3G\3G\3G\3G\5G\u06e6\nG\3G\3G\3G\5G\u06eb\nG\3G\3G\3G\5G\u06f0"+
		"\nG\3H\3H\5H\u06f4\nH\3H\3H\5H\u06f8\nH\3H\7H\u06fb\nH\fH\16H\u06fe\13"+
		"H\3H\3H\3H\7H\u0703\nH\fH\16H\u0706\13H\3H\3H\3H\3H\5H\u070c\nH\3H\3H"+
		"\6H\u0710\nH\rH\16H\u0711\3H\5H\u0715\nH\3H\7H\u0718\nH\fH\16H\u071b\13"+
		"H\3H\3H\5H\u071f\nH\3I\3I\3I\3I\3I\5I\u0726\nI\3J\3J\3J\5J\u072b\nJ\3"+
		"K\7K\u072e\nK\fK\16K\u0731\13K\3K\6K\u0734\nK\rK\16K\u0735\3K\7K\u0739"+
		"\nK\fK\16K\u073c\13K\3K\7K\u073f\nK\fK\16K\u0742\13K\3K\7K\u0745\nK\f"+
		"K\16K\u0748\13K\3K\7K\u074b\nK\fK\16K\u074e\13K\3K\3K\6K\u0752\nK\rK\16"+
		"K\u0753\3K\7K\u0757\nK\fK\16K\u075a\13K\3K\7K\u075d\nK\fK\16K\u0760\13"+
		"K\3K\7K\u0763\nK\fK\16K\u0766\13K\3K\5K\u0769\nK\3L\3L\3L\5L\u076e\nL"+
		"\3L\3L\5L\u0772\nL\3L\3L\7L\u0776\nL\fL\16L\u0779\13L\3L\6L\u077c\nL\r"+
		"L\16L\u077d\3L\7L\u0781\nL\fL\16L\u0784\13L\3L\3L\7L\u0788\nL\fL\16L\u078b"+
		"\13L\3M\3M\3M\5M\u0790\nM\3M\3M\3M\5M\u0795\nM\3M\5M\u0798\nM\3M\3M\5"+
		"M\u079c\nM\3M\5M\u079f\nM\3M\3M\5M\u07a3\nM\3M\3M\5M\u07a7\nM\3N\3N\5"+
		"N\u07ab\nN\3N\3N\6N\u07af\nN\rN\16N\u07b0\3N\3N\3N\5N\u07b6\nN\3O\3O\3"+
		"O\3O\3O\3O\3P\3P\3P\3P\3P\5P\u07c3\nP\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3R\3"+
		"S\3S\7S\u07d1\nS\fS\16S\u07d4\13S\3S\6S\u07d7\nS\rS\16S\u07d8\3S\7S\u07dc"+
		"\nS\fS\16S\u07df\13S\3S\3S\3T\3T\3T\3U\3U\3U\3U\7U\u07ea\nU\fU\16U\u07ed"+
		"\13U\3U\3U\5U\u07f1\nU\3U\5U\u07f4\nU\3U\7U\u07f7\nU\fU\16U\u07fa\13U"+
		"\3U\5U\u07fd\nU\3V\3V\7V\u0801\nV\fV\16V\u0804\13V\3V\6V\u0807\nV\rV\16"+
		"V\u0808\3V\7V\u080c\nV\fV\16V\u080f\13V\3V\3V\3W\3W\5W\u0815\nW\3X\3X"+
		"\5X\u0819\nX\3X\2\4VhY\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\16\3\2\25\30\5\2\4"+
		"\4\62\62\64\65\3\2%\'\3\2#$\3\2()\3\2\37\"\3\2\5\f\3\2\r\20\3\2\21\24"+
		"\3\2*\63\3\2\31\36\4\2\67\6799\2\u096d\2\u00b6\3\2\2\2\4\u00da\3\2\2\2"+
		"\6\u00dc\3\2\2\2\b\u0100\3\2\2\2\n\u013e\3\2\2\2\f\u0145\3\2\2\2\16\u014b"+
		"\3\2\2\2\20\u014d\3\2\2\2\22\u014f\3\2\2\2\24\u0153\3\2\2\2\26\u0155\3"+
		"\2\2\2\30\u0157\3\2\2\2\32\u015b\3\2\2\2\34\u0165\3\2\2\2\36\u0167\3\2"+
		"\2\2 \u0169\3\2\2\2\"\u016b\3\2\2\2$\u016d\3\2\2\2&\u016f\3\2\2\2(\u02b5"+
		"\3\2\2\2*\u02d5\3\2\2\2,\u02dd\3\2\2\2.\u0304\3\2\2\2\60\u0306\3\2\2\2"+
		"\62\u032b\3\2\2\2\64\u032d\3\2\2\2\66\u033e\3\2\2\28\u0353\3\2\2\2:\u037f"+
		"\3\2\2\2<\u0397\3\2\2\2>\u0399\3\2\2\2@\u03ab\3\2\2\2B\u03df\3\2\2\2D"+
		"\u03e5\3\2\2\2F\u03f6\3\2\2\2H\u0418\3\2\2\2J\u0427\3\2\2\2L\u042d\3\2"+
		"\2\2N\u0435\3\2\2\2P\u0437\3\2\2\2R\u0450\3\2\2\2T\u0457\3\2\2\2V\u0478"+
		"\3\2\2\2X\u04a8\3\2\2\2Z\u04ae\3\2\2\2\\\u04b0\3\2\2\2^\u04b8\3\2\2\2"+
		"`\u04f3\3\2\2\2b\u051e\3\2\2\2d\u0549\3\2\2\2f\u054e\3\2\2\2h\u0560\3"+
		"\2\2\2j\u059b\3\2\2\2l\u05a1\3\2\2\2n\u05a3\3\2\2\2p\u05b9\3\2\2\2r\u05df"+
		"\3\2\2\2t\u05f0\3\2\2\2v\u062b\3\2\2\2x\u062d\3\2\2\2z\u0630\3\2\2\2|"+
		"\u0633\3\2\2\2~\u063f\3\2\2\2\u0080\u0646\3\2\2\2\u0082\u069f\3\2\2\2"+
		"\u0084\u06b2\3\2\2\2\u0086\u06b7\3\2\2\2\u0088\u06b9\3\2\2\2\u008a\u06c3"+
		"\3\2\2\2\u008c\u06ef\3\2\2\2\u008e\u071e\3\2\2\2\u0090\u0725\3\2\2\2\u0092"+
		"\u072a\3\2\2\2\u0094\u0768\3\2\2\2\u0096\u076a\3\2\2\2\u0098\u07a6\3\2"+
		"\2\2\u009a\u07b5\3\2\2\2\u009c\u07b7\3\2\2\2\u009e\u07bd\3\2\2\2\u00a0"+
		"\u07c7\3\2\2\2\u00a2\u07ca\3\2\2\2\u00a4\u07ce\3\2\2\2\u00a6\u07e2\3\2"+
		"\2\2\u00a8\u07fc\3\2\2\2\u00aa\u07fe\3\2\2\2\u00ac\u0814\3\2\2\2\u00ae"+
		"\u0818\3\2\2\2\u00b0\u00b2\78\2\2\u00b1\u00b3\7\67\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c2\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bd\5\u0092J\2\u00ba\u00bc\79\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c8\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\79\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\5\u00a6T\2\u00cc\u00ce\7\67\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\79\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\2\2\3\u00d9"+
		"\3\3\2\2\2\u00da\u00db\t\2\2\2\u00db\5\3\2\2\2\u00dc\u00e1\7\3\2\2\u00dd"+
		"\u00e2\7\66\2\2\u00de\u00e2\5\34\17\2\u00df\u00e2\5\n\6\2\u00e0\u00e2"+
		"\79\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\3\2\2\u00e6\7\3\2\2\2\u00e7\u00e9"+
		"\7$\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00ec\7\66\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\7/\2\2\u00f0"+
		"\u00f2\7\66\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\7\4\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0101\3\2\2\2\u00f8\u00fa\7$"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00fd\7\66\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00e8\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0101\t\3\2\2\2\u0102\u0104\5\f\7\2\u0103\u0102\3\2\2\2"+
		"\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\t\3\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0110\3\2"+
		"\2\2\u010d\u010f\7\66\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0116\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0115\5\f\7\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0119\u011b\5\n\6\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u013f\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0121\5\f\7\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0127\7\66\2\2\u0126\u0128\t\3\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012e\3\2"+
		"\2\2\u012b\u012d\7\66\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0134\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0133\5\f\7\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013a\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0139\5\n\6\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013f\b\6\1\2\u013e\u0105\3\2\2\2\u013e\u0122\3\2\2\2\u013f"+
		"\13\3\2\2\2\u0140\u0146\5\36\20\2\u0141\u0146\5 \21\2\u0142\u0146\5\""+
		"\22\2\u0143\u0146\5\4\3\2\u0144\u0146\5$\23\2\u0145\u0140\3\2\2\2\u0145"+
		"\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2"+
		"\2\2\u0146\r\3\2\2\2\u0147\u014c\5\36\20\2\u0148\u014c\5 \21\2\u0149\u014c"+
		"\5\"\22\2\u014a\u014c\5\4\3\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\17\3\2\2\2\u014d\u014e"+
		"\t\4\2\2\u014e\21\3\2\2\2\u014f\u0150\t\5\2\2\u0150\23\3\2\2\2\u0151\u0154"+
		"\5\20\t\2\u0152\u0154\5\22\n\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2"+
		"\u0154\25\3\2\2\2\u0155\u0156\t\6\2\2\u0156\27\3\2\2\2\u0157\u0158\t\7"+
		"\2\2\u0158\31\3\2\2\2\u0159\u015c\5\26\f\2\u015a\u015c\5\30\r\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\33\3\2\2\2\u015d\u0166\5\36\20"+
		"\2\u015e\u0166\5 \21\2\u015f\u0166\5\"\22\2\u0160\u0166\5$\23\2\u0161"+
		"\u0166\5&\24\2\u0162\u0166\5\32\16\2\u0163\u0166\5\24\13\2\u0164\u0166"+
		"\5\4\3\2\u0165\u015d\3\2\2\2\u0165\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0165"+
		"\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0164\3\2\2\2\u0166\35\3\2\2\2\u0167\u0168\t\b\2\2\u0168\37"+
		"\3\2\2\2\u0169\u016a\t\t\2\2\u016a!\3\2\2\2\u016b\u016c\t\n\2\2\u016c"+
		"#\3\2\2\2\u016d\u016e\t\13\2\2\u016e%\3\2\2\2\u016f\u0170\t\f\2\2\u0170"+
		"\'\3\2\2\2\u0171\u0175\5n8\2\u0172\u0174\79\2\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0178\u017a\78\2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017e\3\2\2\2\u017b\u017d\79\2\2\u017c\u017b\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0184\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\7\67\2\2\u0182\u0181\3"+
		"\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u02b6\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018b\5~@\2\u0188\u018a\79\2"+
		"\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\78\2\2\u018f"+
		"\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0194\3\2\2\2\u0191\u0193\79"+
		"\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u019a\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\7\67"+
		"\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u02b6\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\5@"+
		"!\2\u019e\u01a2\7\60\2\2\u019f\u01a1\79\2\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\78\2\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01aa\79\2\2\u01a9\u01a8\3\2"+
		"\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01b1\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\7\67\2\2\u01af\u01ae\3"+
		"\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u02b6\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b8\5@!\2\u01b5\u01b7\79\2"+
		"\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\78\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1\3\2\2\2\u01be\u01c0\79"+
		"\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c7\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c6\7\67"+
		"\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\b\25"+
		"\1\2\u01cb\u02b6\3\2\2\2\u01cc\u01cd\5F$\2\u01cd\u01d1\7\60\2\2\u01ce"+
		"\u01d0\79\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01d6\78\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01da\3\2"+
		"\2\2\u01d7\u01d9\79\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01e0\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dd\u01df\7\67\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u02b6\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e3\u01e7\5F$\2\u01e4\u01e6\79\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01ec\78\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01ef\79\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f6\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\7\67\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\b\25\1\2\u01fa\u02b6\3\2\2\2\u01fb"+
		"\u01fc\5R*\2\u01fc\u0200\7\60\2\2\u01fd\u01ff\79\2\2\u01fe\u01fd\3\2\2"+
		"\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0204"+
		"\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0205\78\2\2\u0204\u0203\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0209\3\2\2\2\u0206\u0208\79\2\2\u0207\u0206\3\2"+
		"\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020f\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020e\7\67\2\2\u020d\u020c\3"+
		"\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u02b6\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0216\5R*\2\u0213\u0215\79\2"+
		"\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021b\78\2\2\u021a"+
		"\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021f\3\2\2\2\u021c\u021e\79"+
		"\2\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0225\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\7\67"+
		"\2\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\b\25"+
		"\1\2\u0229\u02b6\3\2\2\2\u022a\u022e\5P)\2\u022b\u022d\79\2\2\u022c\u022b"+
		"\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233\78\2\2\u0232\u0231\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233\u0237\3\2\2\2\u0234\u0236\79\2\2\u0235"+
		"\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u023d\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023c\7\67\2\2\u023b"+
		"\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\u02b6\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\5*\26\2\u0241"+
		"\u0245\7\60\2\2\u0242\u0244\79\2\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2"+
		"\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0248\u024a\78\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024e\3\2\2\2\u024b\u024d\79\2\2\u024c\u024b\3\2\2\2\u024d"+
		"\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0254\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0251\u0253\7\67\2\2\u0252\u0251\3\2\2\2\u0253"+
		"\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u02b6\3\2"+
		"\2\2\u0256\u0254\3\2\2\2\u0257\u025b\5*\26\2\u0258\u025a\79\2\2\u0259"+
		"\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0260\78\2\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0264\3\2\2\2\u0261\u0263\79"+
		"\2\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u026a\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0269\7\67"+
		"\2\2\u0268\u0267\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026e\b\25"+
		"\1\2\u026e\u02b6\3\2\2\2\u026f\u0273\5\u00a4S\2\u0270\u0272\79\2\2\u0271"+
		"\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0278\78\2\2\u0277"+
		"\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027c\3\2\2\2\u0279\u027b\79"+
		"\2\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u0282\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0281\7\67"+
		"\2\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u02b6\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286\5\u008c"+
		"G\2\u0286\u028a\7\60\2\2\u0287\u0289\79\2\2\u0288\u0287\3\2\2\2\u0289"+
		"\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028e\3\2"+
		"\2\2\u028c\u028a\3\2\2\2\u028d\u028f\78\2\2\u028e\u028d\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0293\3\2\2\2\u0290\u0292\79\2\2\u0291\u0290\3\2"+
		"\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0299\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\7\67\2\2\u0297\u0296\3"+
		"\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u02b6\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u02a0\5\u008cG\2\u029d\u029f"+
		"\79\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a5\78"+
		"\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a9\3\2\2\2\u02a6"+
		"\u02a8\79\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02af\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac"+
		"\u02ae\7\67\2\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3"+
		"\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2"+
		"\u02b3\b\25\1\2\u02b3\u02b6\3\2\2\2\u02b4\u02b6\78\2\2\u02b5\u0171\3\2"+
		"\2\2\u02b5\u0187\3\2\2\2\u02b5\u019d\3\2\2\2\u02b5\u01b4\3\2\2\2\u02b5"+
		"\u01cc\3\2\2\2\u02b5\u01e3\3\2\2\2\u02b5\u01fb\3\2\2\2\u02b5\u0212\3\2"+
		"\2\2\u02b5\u022a\3\2\2\2\u02b5\u0240\3\2\2\2\u02b5\u0257\3\2\2\2\u02b5"+
		"\u026f\3\2\2\2\u02b5\u0285\3\2\2\2\u02b5\u029c\3\2\2\2\u02b5\u02b4\3\2"+
		"\2\2\u02b6)\3\2\2\2\u02b7\u02d6\5\60\31\2\u02b8\u02bb\5\n\6\2\u02b9\u02bb"+
		"\5\4\3\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"\u02bd\79\2\2\u02bd\u02bf\3\2\2\2\u02be\u02ba\3\2\2\2\u02bf\u02c0\3\2"+
		"\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c3\5\60\31\2\u02c3\u02c4\b\26\1\2\u02c4\u02d6\3\2\2\2\u02c5\u02d6"+
		"\5\62\32\2\u02c6\u02d6\5<\37\2\u02c7\u02ca\5\n\6\2\u02c8\u02ca\5\4\3\2"+
		"\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc"+
		"\79\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02c9\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\5<"+
		"\37\2\u02d2\u02d3\b\26\1\2\u02d3\u02d6\3\2\2\2\u02d4\u02d6\5> \2\u02d5"+
		"\u02b7\3\2\2\2\u02d5\u02be\3\2\2\2\u02d5\u02c5\3\2\2\2\u02d5\u02c6\3\2"+
		"\2\2\u02d5\u02cd\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6+\3\2\2\2\u02d7\u02de"+
		"\5\6\4\2\u02d8\u02de\5\b\5\2\u02d9\u02de\5\n\6\2\u02da\u02de\5V,\2\u02db"+
		"\u02de\5h\65\2\u02dc\u02de\5\u008cG\2\u02dd\u02d7\3\2\2\2\u02dd\u02d8"+
		"\3\2\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02da\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02dc\3\2\2\2\u02de-\3\2\2\2\u02df\u02e8\5\n\6\2\u02e0\u02e2\79\2\2\u02e1"+
		"\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\7+"+
		"\2\2\u02e4\u02e6\79\2\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e9\5,\27\2\u02e8\u02e1\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9\u0305\3\2\2\2\u02ea\u02f3\5\4\3\2\u02eb\u02ed\79\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\7+"+
		"\2\2\u02ef\u02f1\79\2\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f4\5,\27\2\u02f3\u02ec\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\b\30\1\2\u02f6\u0305\3\2\2\2\u02f7"+
		"\u0300\5\n\6\2\u02f8\u02fa\79\2\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\7,\2\2\u02fc\u02fe\79\2\2\u02fd\u02fc"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\5,\27\2\u0300"+
		"\u02f9\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\b\30"+
		"\1\2\u0303\u0305\3\2\2\2\u0304\u02df\3\2\2\2\u0304\u02ea\3\2\2\2\u0304"+
		"\u02f7\3\2\2\2\u0305/\3\2\2\2\u0306\u0307\5\4\3\2\u0307\u0308\79\2\2\u0308"+
		"\u0313\5.\30\2\u0309\u030b\79\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u030e\7\61\2\2\u030d\u030f\79\2\2\u030e"+
		"\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312\5."+
		"\30\2\u0311\u030a\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\61\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0318\5\n\6"+
		"\2\u0317\u0319\79\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a"+
		"\3\2\2\2\u031a\u031c\7+\2\2\u031b\u031d\79\2\2\u031c\u031b\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\5,\27\2\u031f\u032c\3\2"+
		"\2\2\u0320\u0322\5\n\6\2\u0321\u0323\79\2\2\u0322\u0321\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\7,\2\2\u0325\u0327\79\2"+
		"\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329"+
		"\5,\27\2\u0329\u032a\b\32\1\2\u032a\u032c\3\2\2\2\u032b\u0316\3\2\2\2"+
		"\u032b\u0320\3\2\2\2\u032c\63\3\2\2\2\u032d\u032e\5V,\2\u032e\65\3\2\2"+
		"\2\u032f\u0330\5\n\6\2\u0330\u0331\7\35\2\2\u0331\u0332\5\64\33\2\u0332"+
		"\u0333\7\36\2\2\u0333\u033f\3\2\2\2\u0334\u0336\5\n\6\2\u0335\u0337\7"+
		"\35\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u033a\5\64\33\2\u0339\u033b\7\36\2\2\u033a\u0339\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\b\34\1\2\u033d\u033f\3\2\2\2"+
		"\u033e\u032f\3\2\2\2\u033e\u0334\3\2\2\2\u033f\67\3\2\2\2\u0340\u0341"+
		"\7\5\2\2\u0341\u0342\79\2\2\u0342\u0343\5\4\3\2\u0343\u0344\7\35\2\2\u0344"+
		"\u0345\5\64\33\2\u0345\u0346\7\36\2\2\u0346\u0354\3\2\2\2\u0347\u0348"+
		"\7\5\2\2\u0348\u0349\79\2\2\u0349\u034b\5\4\3\2\u034a\u034c\7\35\2\2\u034b"+
		"\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\5\64"+
		"\33\2\u034e\u0350\7\36\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0352\b\35\1\2\u0352\u0354\3\2\2\2\u0353\u0340\3"+
		"\2\2\2\u0353\u0347\3\2\2\2\u03549\3\2\2\2\u0355\u0357\79\2\2\u0356\u0355"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035a\7+\2\2\u0359"+
		"\u035b\79\2\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2"+
		"\2\2\u035c\u0380\58\35\2\u035d\u035f\79\2\2\u035e\u035d\3\2\2\2\u035e"+
		"\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\7,\2\2\u0361\u0363\79\2"+
		"\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365"+
		"\58\35\2\u0365\u0366\b\36\1\2\u0366\u0380\3\2\2\2\u0367\u0369\79\2\2\u0368"+
		"\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\7+"+
		"\2\2\u036b\u036d\79\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u0370\3\2\2\2\u036e\u0371\5\66\34\2\u036f\u0371\5,\27\2\u0370\u036e\3"+
		"\2\2\2\u0370\u036f\3\2\2\2\u0371\u0380\3\2\2\2\u0372\u0374\79\2\2\u0373"+
		"\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377\7,"+
		"\2\2\u0376\u0378\79\2\2\u0377\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u037b\3\2\2\2\u0379\u037c\5\66\34\2\u037a\u037c\5,\27\2\u037b\u0379\3"+
		"\2\2\2\u037b\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\b\36\1\2\u037e"+
		"\u0380\3\2\2\2\u037f\u0356\3\2\2\2\u037f\u035e\3\2\2\2\u037f\u0368\3\2"+
		"\2\2\u037f\u0373\3\2\2\2\u0380;\3\2\2\2\u0381\u0382\5\4\3\2\u0382\u0383"+
		"\7\35\2\2\u0383\u0384\7\36\2\2\u0384\u0385\79\2\2\u0385\u0387\5\n\6\2"+
		"\u0386\u0388\5:\36\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0398"+
		"\3\2\2\2\u0389\u038b\5\4\3\2\u038a\u038c\7\35\2\2\u038b\u038a\3\2\2\2"+
		"\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u038f\7\36\2\2\u038e\u038d"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\79\2\2\u0391"+
		"\u0393\5\n\6\2\u0392\u0394\5:\36\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0396\b\37\1\2\u0396\u0398\3\2\2\2\u0397"+
		"\u0381\3\2\2\2\u0397\u0389\3\2\2\2\u0398=\3\2\2\2\u0399\u039a\5\66\34"+
		"\2\u039a\u039b\5:\36\2\u039b?\3\2\2\2\u039c\u039d\7\b\2\2\u039d\u039e"+
		"\7\31\2\2\u039e\u039f\5B\"\2\u039f\u03a0\7\32\2\2\u03a0\u03ac\3\2\2\2"+
		"\u03a1\u03a3\7\b\2\2\u03a2\u03a4\7\31\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4"+
		"\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\5B\"\2\u03a6\u03a8\7\32\2\2\u03a7"+
		"\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\b!"+
		"\1\2\u03aa\u03ac\3\2\2\2\u03ab\u039c\3\2\2\2\u03ab\u03a1\3\2\2\2\u03ac"+
		"A\3\2\2\2\u03ad\u03b0\5\n\6\2\u03ae\u03af\79\2\2\u03af\u03b1\5\n\6\2\u03b0"+
		"\u03ae\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\b\"\1\2\u03b5\u03e0\3\2\2\2\u03b6"+
		"\u03c4\5D#\2\u03b7\u03b9\79\2\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2"+
		"\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\7#\2\2\u03bb\u03bd\79\2\2\u03bc\u03bb"+
		"\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\5D#\2\u03bf"+
		"\u03c1\79\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2"+
		"\2\2\u03c2\u03b8\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03e0\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03d5\5D"+
		"#\2\u03c8\u03ca\79\2\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb"+
		"\3\2\2\2\u03cb\u03cd\7#\2\2\u03cc\u03ce\79\2\2\u03cd\u03cc\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\5D#\2\u03d0\u03d2\79\2"+
		"\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03c9"+
		"\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03da\7#\2\2\u03d9\u03d8\3\2"+
		"\2\2\u03da\u03db\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03de\b\"\1\2\u03de\u03e0\3\2\2\2\u03df\u03ad\3\2"+
		"\2\2\u03df\u03b6\3\2\2\2\u03df\u03c7\3\2\2\2\u03e0C\3\2\2\2\u03e1\u03e6"+
		"\5\6\4\2\u03e2\u03e6\5\n\6\2\u03e3\u03e6\5V,\2\u03e4\u03e6\5\u008cG\2"+
		"\u03e5\u03e1\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e4"+
		"\3\2\2\2\u03e6E\3\2\2\2\u03e7\u03e8\7\t\2\2\u03e8\u03e9\7\31\2\2\u03e9"+
		"\u03ea\5H%\2\u03ea\u03eb\7\32\2\2\u03eb\u03f7\3\2\2\2\u03ec\u03ee\7\t"+
		"\2\2\u03ed\u03ef\7\31\2\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u03f2\5H%\2\u03f1\u03f3\7\32\2\2\u03f2\u03f1\3\2"+
		"\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\b$\1\2\u03f5"+
		"\u03f7\3\2\2\2\u03f6\u03e7\3\2\2\2\u03f6\u03ec\3\2\2\2\u03f7G\3\2\2\2"+
		"\u03f8\u03fa\5J&\2\u03f9\u03fb\79\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\7\61\2\2\u03fd\u03ff\79\2\2\u03fe"+
		"\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\5N"+
		"(\2\u0401\u0419\3\2\2\2\u0402\u0404\5J&\2\u0403\u0405\79\2\2\u0404\u0403"+
		"\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406\u0408\7\61\2\2"+
		"\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a"+
		"\b%\1\2\u040a\u0419\3\2\2\2\u040b\u040d\5J&\2\u040c\u040e\79\2\2\u040d"+
		"\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u0411\7\61"+
		"\2\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\3\2\2\2\u0412"+
		"\u0414\79\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2"+
		"\2\2\u0415\u0416\5N(\2\u0416\u0417\b%\1\2\u0417\u0419\3\2\2\2\u0418\u03f8"+
		"\3\2\2\2\u0418\u0402\3\2\2\2\u0418\u040b\3\2\2\2\u0419I\3\2\2\2\u041a"+
		"\u0428\5\6\4\2\u041b\u041e\5V,\2\u041c\u041e\5L\'\2\u041d\u041b\3\2\2"+
		"\2\u041d\u041c\3\2\2\2\u041e\u0422\3\2\2\2\u041f\u0421\79\2\2\u0420\u041f"+
		"\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0425\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0426\b&\1\2\u0426\u0428\3\2"+
		"\2\2\u0427\u041a\3\2\2\2\u0427\u041d\3\2\2\2\u0428K\3\2\2\2\u0429\u042e"+
		"\7\66\2\2\u042a\u042e\5\34\17\2\u042b\u042e\5\n\6\2\u042c\u042e\79\2\2"+
		"\u042d\u0429\3\2\2\2\u042d\u042a\3\2\2\2\u042d\u042b\3\2\2\2\u042d\u042c"+
		"\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"M\3\2\2\2\u0431\u0436\5\n\6\2\u0432\u0433\5\6\4\2\u0433\u0434\b(\1\2\u0434"+
		"\u0436\3\2\2\2\u0435\u0431\3\2\2\2\u0435\u0432\3\2\2\2\u0436O\3\2\2\2"+
		"\u0437\u0438\7\6\2\2\u0438\u0439\79\2\2\u0439\u043a\5*\26\2\u043aQ\3\2"+
		"\2\2\u043b\u043c\7\7\2\2\u043c\u043d\79\2\2\u043d\u0451\5T+\2\u043e\u043f"+
		"\7\7\2\2\u043f\u0440\79\2\2\u0440\u0444\5T+\2\u0441\u0443\79\2\2\u0442"+
		"\u0441\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2"+
		"\2\2\u0445\u0447\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0448\7\31\2\2\u0448"+
		"\u0449\7\32\2\2\u0449\u044a\b*\1\2\u044a\u0451\3\2\2\2\u044b\u044c\7\7"+
		"\2\2\u044c\u044d\79\2\2\u044d\u044e\5\4\3\2\u044e\u044f\b*\1\2\u044f\u0451"+
		"\3\2\2\2\u0450\u043b\3\2\2\2\u0450\u043e\3\2\2\2\u0450\u044b\3\2\2\2\u0451"+
		"S\3\2\2\2\u0452\u0458\5\6\4\2\u0453\u0458\5\b\5\2\u0454\u0458\5\n\6\2"+
		"\u0455\u0458\5V,\2\u0456\u0458\5\u008cG\2\u0457\u0452\3\2\2\2\u0457\u0453"+
		"\3\2\2\2\u0457\u0454\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0456\3\2\2\2\u0458"+
		"U\3\2\2\2\u0459\u045a\b,\1\2\u045a\u0479\5Z.\2\u045b\u045d\7\31\2\2\u045c"+
		"\u045e\79\2\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f\3\2"+
		"\2\2\u045f\u0461\5V,\2\u0460\u0462\79\2\2\u0461\u0460\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\7\32\2\2\u0464\u0479\3\2\2\2"+
		"\u0465\u0467\7\31\2\2\u0466\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0466"+
		"\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u046c\79\2\2\u046b"+
		"\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\5V"+
		",\2\u046e\u0470\79\2\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472"+
		"\3\2\2\2\u0471\u0473\7\32\2\2\u0472\u0471\3\2\2\2\u0473\u0474\3\2\2\2"+
		"\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477"+
		"\b,\1\2\u0477\u0479\3\2\2\2\u0478\u0459\3\2\2\2\u0478\u045b\3\2\2\2\u0478"+
		"\u0466\3\2\2\2\u0479\u0496\3\2\2\2\u047a\u047c\f\6\2\2\u047b\u047d\79"+
		"\2\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u0480\5\24\13\2\u047f\u0481\79\2\2\u0480\u047f\3\2\2\2\u0480\u0481\3"+
		"\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\5V,\7\u0483\u0495\3\2\2\2\u0484"+
		"\u0486\f\5\2\2\u0485\u0487\79\2\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2"+
		"\2\2\u0487\u0488\3\2\2\2\u0488\u048a\5\24\13\2\u0489\u048b\5\24\13\2\u048a"+
		"\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2"+
		"\2\2\u048d\u048f\3\2\2\2\u048e\u0490\79\2\2\u048f\u048e\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\5V,\6\u0492\u0493\b,\1"+
		"\2\u0493\u0495\3\2\2\2\u0494\u047a\3\2\2\2\u0494\u0484\3\2\2\2\u0495\u0498"+
		"\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497W\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0499\u049a\5\n\6\2\u049a\u049b\7\35\2\2\u049b\u049c\5"+
		"\\/\2\u049c\u049d\7\36\2\2\u049d\u04a9\3\2\2\2\u049e\u04a0\5\n\6\2\u049f"+
		"\u04a1\7\35\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3"+
		"\2\2\2\u04a2\u04a4\5\\/\2\u04a3\u04a5\7\36\2\2\u04a4\u04a3\3\2\2\2\u04a4"+
		"\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\b-\1\2\u04a7\u04a9\3\2"+
		"\2\2\u04a8\u0499\3\2\2\2\u04a8\u049e\3\2\2\2\u04a9Y\3\2\2\2\u04aa\u04af"+
		"\5\b\5\2\u04ab\u04af\5\n\6\2\u04ac\u04af\5\u008cG\2\u04ad\u04af\5X-\2"+
		"\u04ae\u04aa\3\2\2\2\u04ae\u04ab\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04ad"+
		"\3\2\2\2\u04af[\3\2\2\2\u04b0\u04b2\5`\61\2\u04b1\u04b3\79\2\2\u04b2\u04b1"+
		"\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\5^\60\2\u04b5"+
		"]\3\2\2\2\u04b6\u04b9\5b\62\2\u04b7\u04b9\5d\63\2\u04b8\u04b6\3\2\2\2"+
		"\u04b8\u04b7\3\2\2\2\u04b9_\3\2\2\2\u04ba\u04bc\7\31\2\2\u04bb\u04bd\7"+
		"9\2\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04c0\5\\/\2\u04bf\u04c1\79\2\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1\3\2\2"+
		"\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7\32\2\2\u04c3\u04f4\3\2\2\2\u04c4"+
		"\u04c6\7\31\2\2\u04c5\u04c7\79\2\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2"+
		"\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\5\\/\2\u04c9\u04cb\79\2\2\u04ca\u04c9"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\b\61\1\2"+
		"\u04cd\u04f4\3\2\2\2\u04ce\u04d0\7\31\2\2\u04cf\u04d1\79\2\2\u04d0\u04cf"+
		"\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\5\\/\2\u04d3"+
		"\u04d5\79\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2"+
		"\2\2\u04d6\u04d8\7\32\2\2\u04d7\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\b\61"+
		"\1\2\u04dc\u04f4\3\2\2\2\u04dd\u04df\5f\64\2\u04de\u04e0\79\2\2\u04df"+
		"\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\5^"+
		"\60\2\u04e2\u04f4\3\2\2\2\u04e3\u04e9\5f\64\2\u04e4\u04e7\79\2\2\u04e5"+
		"\u04e8\5f\64\2\u04e6\u04e8\5\6\4\2\u04e7\u04e5\3\2\2\2\u04e7\u04e6\3\2"+
		"\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04e4\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\3\2\2\2\u04ed\u04ef\79"+
		"\2\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f1\5^\60\2\u04f1\u04f2\b\61\1\2\u04f2\u04f4\3\2\2\2\u04f3\u04ba\3"+
		"\2\2\2\u04f3\u04c4\3\2\2\2\u04f3\u04ce\3\2\2\2\u04f3\u04dd\3\2\2\2\u04f3"+
		"\u04e3\3\2\2\2\u04f4a\3\2\2\2\u04f5\u04f7\5\20\t\2\u04f6\u04f8\79\2\2"+
		"\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa"+
		"\5\\/\2\u04fa\u051f\3\2\2\2\u04fb\u04fd\5\20\t\2\u04fc\u04fe\79\2\2\u04fd"+
		"\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0505\5\\"+
		"/\2\u0500\u0503\79\2\2\u0501\u0504\5f\64\2\u0502\u0504\5\6\4\2\u0503\u0501"+
		"\3\2\2\2\u0503\u0502\3\2\2\2\u0504\u0506\3\2\2\2\u0505\u0500\3\2\2\2\u0506"+
		"\u0507\3\2\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2"+
		"\2\2\u0509\u050a\b\62\1\2\u050a\u051f\3\2\2\2\u050b\u0513\5\20\t\2\u050c"+
		"\u050e\79\2\2\u050d\u050c\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u050d\3\2"+
		"\2\2\u050f\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u050f\3\2\2\2\u0512"+
		"\u0514\5\24\13\2\u0513\u050f\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0513\3"+
		"\2\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u0519\79\2\2\u0518"+
		"\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\5\\"+
		"/\2\u051b\u051c\b\62\1\2\u051c\u051f\3\2\2\2\u051d\u051f\3\2\2\2\u051e"+
		"\u04f5\3\2\2\2\u051e\u04fb\3\2\2\2\u051e\u050b\3\2\2\2\u051e\u051d\3\2"+
		"\2\2\u051fc\3\2\2\2\u0520\u0522\5\22\n\2\u0521\u0523\79\2\2\u0522\u0521"+
		"\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\5\\/\2\u0525"+
		"\u054a\3\2\2\2\u0526\u0528\5\22\n\2\u0527\u0529\79\2\2\u0528\u0527\3\2"+
		"\2\2\u0528\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u0530\5\\/\2\u052b"+
		"\u052e\79\2\2\u052c\u052f\5f\64\2\u052d\u052f\5\6\4\2\u052e\u052c\3\2"+
		"\2\2\u052e\u052d\3\2\2\2\u052f\u0531\3\2\2\2\u0530\u052b\3\2\2\2\u0531"+
		"\u0532\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2"+
		"\2\2\u0534\u0535\b\63\1\2\u0535\u054a\3\2\2\2\u0536\u053e\5\22\n\2\u0537"+
		"\u0539\79\2\2\u0538\u0537\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2"+
		"\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2\2\2\u053d"+
		"\u053f\5\24\13\2\u053e\u053a\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u053e\3"+
		"\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0544\79\2\2\u0543"+
		"\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\5\\"+
		"/\2\u0546\u0547\b\63\1\2\u0547\u054a\3\2\2\2\u0548\u054a\3\2\2\2\u0549"+
		"\u0520\3\2\2\2\u0549\u0526\3\2\2\2\u0549\u0536\3\2\2\2\u0549\u0548\3\2"+
		"\2\2\u054ae\3\2\2\2\u054b\u054f\5\b\5\2\u054c\u054f\5\n\6\2\u054d\u054f"+
		"\5\u008cG\2\u054e\u054b\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054d\3\2\2"+
		"\2\u054fg\3\2\2\2\u0550\u0551\b\65\1\2\u0551\u0561\5l\67\2\u0552\u0561"+
		"\5j\66\2\u0553\u0555\7*\2\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555"+
		"\u0556\3\2\2\2\u0556\u0558\7\31\2\2\u0557\u0559\79\2\2\u0558\u0557\3\2"+
		"\2\2\u0558\u0559\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055c\5h\65\2\u055b"+
		"\u055d\79\2\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2"+
		"\2\2\u055e\u055f\7\32\2\2\u055f\u0561\3\2\2\2\u0560\u0550\3\2\2\2\u0560"+
		"\u0552\3\2\2\2\u0560\u0554\3\2\2\2\u0561\u057e\3\2\2\2\u0562\u0564\f\5"+
		"\2\2\u0563\u0565\79\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565"+
		"\u0566\3\2\2\2\u0566\u0568\5\32\16\2\u0567\u0569\79\2\2\u0568\u0567\3"+
		"\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\5h\65\6\u056b"+
		"\u057d\3\2\2\2\u056c\u056e\f\4\2\2\u056d\u056f\79\2\2\u056e\u056d\3\2"+
		"\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0572\5\32\16\2\u0571"+
		"\u0573\5\32\16\2\u0572\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0572\3"+
		"\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\3\2\2\2\u0576\u0578\79\2\2\u0577"+
		"\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\5h"+
		"\65\5\u057a\u057b\b\65\1\2\u057b\u057d\3\2\2\2\u057c\u0562\3\2\2\2\u057c"+
		"\u056c\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2"+
		"\2\2\u057fi\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0583\5\n\6\2\u0582\u0584"+
		"\79\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0587\7,\2\2\u0586\u0588\79\2\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2"+
		"\2\u0588\u058b\3\2\2\2\u0589\u058c\5l\67\2\u058a\u058c\5\6\4\2\u058b\u0589"+
		"\3\2\2\2\u058b\u058a\3\2\2\2\u058c\u059c\3\2\2\2\u058d\u058f\5\n\6\2\u058e"+
		"\u0590\79\2\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2"+
		"\2\2\u0591\u0593\7+\2\2\u0592\u0594\79\2\2\u0593\u0592\3\2\2\2\u0593\u0594"+
		"\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0598\5l\67\2\u0596\u0598\5\6\4\2\u0597"+
		"\u0595\3\2\2\2\u0597\u0596\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\b\66"+
		"\1\2\u059a\u059c\3\2\2\2\u059b\u0581\3\2\2\2\u059b\u058d\3\2\2\2\u059c"+
		"k\3\2\2\2\u059d\u05a2\5\n\6\2\u059e\u05a2\5\b\5\2\u059f\u05a2\5V,\2\u05a0"+
		"\u05a2\5\6\4\2\u05a1\u059d\3\2\2\2\u05a1\u059e\3\2\2\2\u05a1\u059f\3\2"+
		"\2\2\u05a1\u05a0\3\2\2\2\u05a2m\3\2\2\2\u05a3\u05a5\5x=\2\u05a4\u05a6"+
		"\t\r\2\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05ad\3\2\2\2\u05a7"+
		"\u05a9\5z>\2\u05a8\u05aa\t\r\2\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2"+
		"\2\u05aa\u05ac\3\2\2\2\u05ab\u05a7\3\2\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab"+
		"\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b7\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0"+
		"\u05b4\5|?\2\u05b1\u05b3\7\67\2\2\u05b2\u05b1\3\2\2\2\u05b3\u05b6\3\2"+
		"\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6"+
		"\u05b4\3\2\2\2\u05b7\u05b0\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8o\3\2\2\2"+
		"\u05b9\u05ba\5t;\2\u05ba\u05bb\5v<\2\u05bbq\3\2\2\2\u05bc\u05be\79\2\2"+
		"\u05bd\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1"+
		"\7\20\2\2\u05c0\u05c2\79\2\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2"+
		"\u05c4\3\2\2\2\u05c3\u05c5\78\2\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2"+
		"\2\2\u05c5\u05c9\3\2\2\2\u05c6\u05c8\79\2\2\u05c7\u05c6\3\2\2\2\u05c8"+
		"\u05cb\3\2\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05e0\3\2"+
		"\2\2\u05cb\u05c9\3\2\2\2\u05cc\u05ce\79\2\2\u05cd\u05cc\3\2\2\2\u05cd"+
		"\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05d1\7\20\2\2\u05d0\u05cf\3"+
		"\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d4\79\2\2\u05d3"+
		"\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05d7\78"+
		"\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05db\3\2\2\2\u05d8"+
		"\u05da\79\2\2\u05d9\u05d8\3\2\2\2\u05da\u05dd\3\2\2\2\u05db\u05d9\3\2"+
		"\2\2\u05db\u05dc\3\2\2\2\u05dc\u05de\3\2\2\2\u05dd\u05db\3\2\2\2\u05de"+
		"\u05e0\b:\1\2\u05df\u05bd\3\2\2\2\u05df\u05cd\3\2\2\2\u05e0s\3\2\2\2\u05e1"+
		"\u05e2\7\31\2\2\u05e2\u05e3\5h\65\2\u05e3\u05e4\7\32\2\2\u05e4\u05e5\5"+
		"r:\2\u05e5\u05f1\3\2\2\2\u05e6\u05e8\7\31\2\2\u05e7\u05e6\3\2\2\2\u05e7"+
		"\u05e8\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\5h\65\2\u05ea\u05ec\7\32"+
		"\2\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed"+
		"\u05ee\5r:\2\u05ee\u05ef\b;\1\2\u05ef\u05f1\3\2\2\2\u05f0\u05e1\3\2\2"+
		"\2\u05f0\u05e7\3\2\2\2\u05f1u\3\2\2\2\u05f2\u05f4\79\2\2\u05f3\u05f2\3"+
		"\2\2\2\u05f4\u05f7\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6"+
		"\u05f8\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f8\u05fc\7\33\2\2\u05f9\u05fb\7"+
		"9\2\2\u05fa\u05f9\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc"+
		"\u05fd\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0601\5("+
		"\25\2\u0600\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0600\3\2\2\2\u0602"+
		"\u0603\3\2\2\2\u0603\u0607\3\2\2\2\u0604\u0606\79\2\2\u0605\u0604\3\2"+
		"\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608"+
		"\u060a\3\2\2\2\u0609\u0607\3\2\2\2\u060a\u060b\7\34\2\2\u060b\u062c\3"+
		"\2\2\2\u060c\u060e\79\2\2\u060d\u060c\3\2\2\2\u060e\u0611\3\2\2\2\u060f"+
		"\u060d\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f\3\2"+
		"\2\2\u0612\u0614\7\33\2\2\u0613\u0612\3\2\2\2\u0613\u0614\3\2\2\2\u0614"+
		"\u0618\3\2\2\2\u0615\u0617\79\2\2\u0616\u0615\3\2\2\2\u0617\u061a\3\2"+
		"\2\2\u0618\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061c\3\2\2\2\u061a"+
		"\u0618\3\2\2\2\u061b\u061d\5(\25\2\u061c\u061b\3\2\2\2\u061d\u061e\3\2"+
		"\2\2\u061e\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0623\3\2\2\2\u0620"+
		"\u0622\79\2\2\u0621\u0620\3\2\2\2\u0622\u0625\3\2\2\2\u0623\u0621\3\2"+
		"\2\2\u0623\u0624\3\2\2\2\u0624\u0627\3\2\2\2\u0625\u0623\3\2\2\2\u0626"+
		"\u0628\7\34\2\2\u0627\u0626\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\3"+
		"\2\2\2\u0629\u062a\b<\1\2\u062a\u062c\3\2\2\2\u062b\u05f5\3\2\2\2\u062b"+
		"\u060f\3\2\2\2\u062cw\3\2\2\2\u062d\u062e\7\r\2\2\u062e\u062f\5p9\2\u062f"+
		"y\3\2\2\2\u0630\u0631\7\17\2\2\u0631\u0632\5p9\2\u0632{\3\2\2\2\u0633"+
		"\u0635\7\16\2\2\u0634\u0636\79\2\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2"+
		"\2\2\u0636\u0637\3\2\2\2\u0637\u0639\7\20\2\2\u0638\u063a\79\2\2\u0639"+
		"\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063c\5v"+
		"<\2\u063c}\3\2\2\2\u063d\u0640\5\u0088E\2\u063e\u0640\5\u008aF\2\u063f"+
		"\u063d\3\2\2\2\u063f\u063e\3\2\2\2\u0640\177\3\2\2\2\u0641\u0647\7\22"+
		"\2\2\u0642\u0647\7\23\2\2\u0643\u0644\5\n\6\2\u0644\u0645\bA\1\2\u0645"+
		"\u0647\3\2\2\2\u0646\u0641\3\2\2\2\u0646\u0642\3\2\2\2\u0646\u0643\3\2"+
		"\2\2\u0647\u0081\3\2\2\2\u0648\u064a\5\u0080A\2\u0649\u064b\79\2\2\u064a"+
		"\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064e\5V"+
		",\2\u064d\u064f\79\2\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650"+
		"\3\2\2\2\u0650\u0654\7\33\2\2\u0651\u0653\79\2\2\u0652\u0651\3\2\2\2\u0653"+
		"\u0656\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u065a\3\2"+
		"\2\2\u0656\u0654\3\2\2\2\u0657\u0659\5(\25\2\u0658\u0657\3\2\2\2\u0659"+
		"\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u0660\3\2"+
		"\2\2\u065c\u065a\3\2\2\2\u065d\u065f\79\2\2\u065e\u065d\3\2\2\2\u065f"+
		"\u0662\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0663\3\2"+
		"\2\2\u0662\u0660\3\2\2\2\u0663\u0664\7\34\2\2\u0664\u06a0\3\2\2\2\u0665"+
		"\u0667\5\u0080A\2\u0666\u0668\79\2\2\u0667\u0666\3\2\2\2\u0667\u0668\3"+
		"\2\2\2\u0668\u0669\3\2\2\2\u0669\u066b\5V,\2\u066a\u066c\79\2\2\u066b"+
		"\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u0671\7\33"+
		"\2\2\u066e\u0670\79\2\2\u066f\u066e\3\2\2\2\u0670\u0673\3\2\2\2\u0671"+
		"\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0677\3\2\2\2\u0673\u0671\3\2"+
		"\2\2\u0674\u0676\5(\25\2\u0675\u0674\3\2\2\2\u0676\u0679\3\2\2\2\u0677"+
		"\u0675\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u067d\3\2\2\2\u0679\u0677\3\2"+
		"\2\2\u067a\u067c\79\2\2\u067b\u067a\3\2\2\2\u067c\u067f\3\2\2\2\u067d"+
		"\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u067d\3\2"+
		"\2\2\u0680\u0681\bB\1\2\u0681\u06a0\3\2\2\2\u0682\u0684\5\u0080A\2\u0683"+
		"\u0685\79\2\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\3\2"+
		"\2\2\u0686\u0688\5V,\2\u0687\u0689\79\2\2\u0688\u0687\3\2\2\2\u0688\u0689"+
		"\3\2\2\2\u0689\u068d\3\2\2\2\u068a\u068c\79\2\2\u068b\u068a\3\2\2\2\u068c"+
		"\u068f\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0693\3\2"+
		"\2\2\u068f\u068d\3\2\2\2\u0690\u0692\5(\25\2\u0691\u0690\3\2\2\2\u0692"+
		"\u0695\3\2\2\2\u0693\u0691\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0699\3\2"+
		"\2\2\u0695\u0693\3\2\2\2\u0696\u0698\79\2\2\u0697\u0696\3\2\2\2\u0698"+
		"\u069b\3\2\2\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069c\3\2"+
		"\2\2\u069b\u0699\3\2\2\2\u069c\u069d\7\34\2\2\u069d\u069e\bB\1\2\u069e"+
		"\u06a0\3\2\2\2\u069f\u0648\3\2\2\2\u069f\u0665\3\2\2\2\u069f\u0682\3\2"+
		"\2\2\u06a0\u0083\3\2\2\2\u06a1\u06a2\5\4\3\2\u06a2\u06a3\79\2\2\u06a3"+
		"\u06a5\3\2\2\2\u06a4\u06a1\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\3\2"+
		"\2\2\u06a6\u06a8\5\n\6\2\u06a7\u06a9\79\2\2\u06a8\u06a7\3\2\2\2\u06a8"+
		"\u06a9\3\2\2\2\u06a9\u06af\3\2\2\2\u06aa\u06ac\7+\2\2\u06ab\u06ad\79\2"+
		"\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b0"+
		"\5\u0086D\2\u06af\u06aa\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b3\3\2\2"+
		"\2\u06b1\u06b3\5V,\2\u06b2\u06a4\3\2\2\2\u06b2\u06b1\3\2\2\2\u06b3\u0085"+
		"\3\2\2\2\u06b4\u06b8\5\b\5\2\u06b5\u06b8\5\n\6\2\u06b6\u06b8\5V,\2\u06b7"+
		"\u06b4\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b6\3\2\2\2\u06b8\u0087\3\2"+
		"\2\2\u06b9\u06bb\7\24\2\2\u06ba\u06bc\79\2\2\u06bb\u06ba\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06bf\5V,\2\u06be\u06c0\79\2"+
		"\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2"+
		"\5\u0082B\2\u06c2\u0089\3\2\2\2\u06c3\u06c5\7\21\2\2\u06c4\u06c6\79\2"+
		"\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c9"+
		"\5\u0084C\2\u06c8\u06ca\79\2\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2\2\2"+
		"\u06ca\u06cb\3\2\2\2\u06cb\u06cc\5\u0082B\2\u06cc\u008b\3\2\2\2\u06cd"+
		"\u06ce\5\n\6\2\u06ce\u06d0\7\31\2\2\u06cf\u06d1\5\u008eH\2\u06d0\u06cf"+
		"\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\7\32\2\2"+
		"\u06d3\u06f0\3\2\2\2\u06d4\u06d5\5\n\6\2\u06d5\u06d7\7\31\2\2\u06d6\u06d8"+
		"\5\u008eH\2\u06d7\u06d6\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06d9\3\2\2"+
		"\2\u06d9\u06da\bG\1\2\u06da\u06f0\3\2\2\2\u06db\u06dd\5\n\6\2\u06dc\u06de"+
		"\5\u008eH\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\3\2\2"+
		"\2\u06df\u06e0\7\32\2\2\u06e0\u06e1\bG\1\2\u06e1\u06f0\3\2\2\2\u06e2\u06e3"+
		"\5\n\6\2\u06e3\u06e5\7\31\2\2\u06e4\u06e6\5\u008eH\2\u06e5\u06e4\3\2\2"+
		"\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\7\32\2\2\u06e8"+
		"\u06ea\7\31\2\2\u06e9\u06eb\5\u008eH\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb"+
		"\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\7\32\2\2\u06ed\u06ee\bG\1\2\u06ee"+
		"\u06f0\3\2\2\2\u06ef\u06cd\3\2\2\2\u06ef\u06d4\3\2\2\2\u06ef\u06db\3\2"+
		"\2\2\u06ef\u06e2\3\2\2\2\u06f0\u008d\3\2\2\2\u06f1\u06fc\5\u0090I\2\u06f2"+
		"\u06f4\79\2\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\3\2"+
		"\2\2\u06f5\u06f7\7\61\2\2\u06f6\u06f8\79\2\2\u06f7\u06f6\3\2\2\2\u06f7"+
		"\u06f8\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\5\u0090I\2\u06fa\u06f3"+
		"\3\2\2\2\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd"+
		"\u071f\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u0704\5\u0090I\2\u0700\u0701"+
		"\79\2\2\u0701\u0703\5\u0090I\2\u0702\u0700\3\2\2\2\u0703\u0706\3\2\2\2"+
		"\u0704\u0702\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0707\3\2\2\2\u0706\u0704"+
		"\3\2\2\2\u0707\u0708\bH\1\2\u0708\u071f\3\2\2\2\u0709\u0719\5\u0090I\2"+
		"\u070a\u070c\79\2\2\u070b\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d"+
		"\3\2\2\2\u070d\u070f\7\61\2\2\u070e\u0710\7\61\2\2\u070f\u070e\3\2\2\2"+
		"\u0710\u0711\3\2\2\2\u0711\u070f\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0714"+
		"\3\2\2\2\u0713\u0715\79\2\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2\u0715"+
		"\u0716\3\2\2\2\u0716\u0718\5\u0090I\2\u0717\u070b\3\2\2\2\u0718\u071b"+
		"\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071c\3\2\2\2\u071b"+
		"\u0719\3\2\2\2\u071c\u071d\bH\1\2\u071d\u071f\3\2\2\2\u071e\u06f1\3\2"+
		"\2\2\u071e\u06ff\3\2\2\2\u071e\u0709\3\2\2\2\u071f\u008f\3\2\2\2\u0720"+
		"\u0726\5\n\6\2\u0721\u0726\5V,\2\u0722\u0726\5\6\4\2\u0723\u0726\5\b\5"+
		"\2\u0724\u0726\5\u008cG\2\u0725\u0720\3\2\2\2\u0725\u0721\3\2\2\2\u0725"+
		"\u0722\3\2\2\2\u0725\u0723\3\2\2\2\u0725\u0724\3\2\2\2\u0726\u0091\3\2"+
		"\2\2\u0727\u072b\5\u009cO\2\u0728\u072b\5\u009eP\2\u0729\u072b\5\u00a0"+
		"Q\2\u072a\u0727\3\2\2\2\u072a\u0728\3\2\2\2\u072a\u0729\3\2\2\2\u072b"+
		"\u0093\3\2\2\2\u072c\u072e\5\16\b\2\u072d\u072c\3\2\2\2\u072e\u0731\3"+
		"\2\2\2\u072f\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0733\3\2\2\2\u0731"+
		"\u072f\3\2\2\2\u0732\u0734\t\3\2\2\u0733\u0732\3\2\2\2\u0734\u0735\3\2"+
		"\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u073a\3\2\2\2\u0737"+
		"\u0739\7\66\2\2\u0738\u0737\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u0738\3"+
		"\2\2\2\u073a\u073b\3\2\2\2\u073b\u0740\3\2\2\2\u073c\u073a\3\2\2\2\u073d"+
		"\u073f\5\16\b\2\u073e\u073d\3\2\2\2\u073f\u0742\3\2\2\2\u0740\u073e\3"+
		"\2\2\2\u0740\u0741\3\2\2\2\u0741\u0746\3\2\2\2\u0742\u0740\3\2\2\2\u0743"+
		"\u0745\5\u0094K\2\u0744\u0743\3\2\2\2\u0745\u0748\3\2\2\2\u0746\u0744"+
		"\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0769\3\2\2\2\u0748\u0746\3\2\2\2\u0749"+
		"\u074b\5\16\b\2\u074a\u0749\3\2\2\2\u074b\u074e\3\2\2\2\u074c\u074a\3"+
		"\2\2\2\u074c\u074d\3\2\2\2\u074d\u074f\3\2\2\2\u074e\u074c\3\2\2\2\u074f"+
		"\u0751\7\66\2\2\u0750\u0752\t\3\2\2\u0751\u0750\3\2\2\2\u0752\u0753\3"+
		"\2\2\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0758\3\2\2\2\u0755"+
		"\u0757\7\66\2\2\u0756\u0755\3\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3"+
		"\2\2\2\u0758\u0759\3\2\2\2\u0759\u075e\3\2\2\2\u075a\u0758\3\2\2\2\u075b"+
		"\u075d\5\16\b\2\u075c\u075b\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3"+
		"\2\2\2\u075e\u075f\3\2\2\2\u075f\u0764\3\2\2\2\u0760\u075e\3\2\2\2\u0761"+
		"\u0763\5\u0094K\2\u0762\u0761\3\2\2\2\u0763\u0766\3\2\2\2\u0764\u0762"+
		"\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767\3\2\2\2\u0766\u0764\3\2\2\2\u0767"+
		"\u0769\bK\1\2\u0768\u072f\3\2\2\2\u0768\u074c\3\2\2\2\u0769\u0095\3\2"+
		"\2\2\u076a\u076b\5\n\6\2\u076b\u076d\7\31\2\2\u076c\u076e\5\u0098M\2\u076d"+
		"\u076c\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0771\7\32"+
		"\2\2\u0770\u0772\79\2\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0777\7\33\2\2\u0774\u0776\79\2\2\u0775\u0774\3\2"+
		"\2\2\u0776\u0779\3\2\2\2\u0777\u0775\3\2\2\2\u0777\u0778\3\2\2\2\u0778"+
		"\u077b\3\2\2\2\u0779\u0777\3\2\2\2\u077a\u077c\5(\25\2\u077b\u077a\3\2"+
		"\2\2\u077c\u077d\3\2\2\2\u077d\u077b\3\2\2\2\u077d\u077e\3\2\2\2\u077e"+
		"\u0782\3\2\2\2\u077f\u0781\79\2\2\u0780\u077f\3\2\2\2\u0781\u0784\3\2"+
		"\2\2\u0782\u0780\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0785\3\2\2\2\u0784"+
		"\u0782\3\2\2\2\u0785\u0789\7\34\2\2\u0786\u0788\7\67\2\2\u0787\u0786\3"+
		"\2\2\2\u0788\u078b\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u078a\3\2\2\2\u078a"+
		"\u0097\3\2\2\2\u078b\u0789\3\2\2\2\u078c\u078f\5\4\3\2\u078d\u078e\7\35"+
		"\2\2\u078e\u0790\7\36\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790"+
		"\u0791\3\2\2\2\u0791\u0792\79\2\2\u0792\u0794\5\u0094K\2\u0793\u0795\5"+
		"\u009aN\2\u0794\u0793\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u07a7\3\2\2\2"+
		"\u0796\u0798\5\4\3\2\u0797\u0796\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u079b"+
		"\3\2\2\2\u0799\u079a\7\35\2\2\u079a\u079c\7\36\2\2\u079b\u0799\3\2\2\2"+
		"\u079b\u079c\3\2\2\2\u079c\u079e\3\2\2\2\u079d\u079f\79\2\2\u079e\u079d"+
		"\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a2\5\u0094K"+
		"\2\u07a1\u07a3\5\u009aN\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3"+
		"\u07a4\3\2\2\2\u07a4\u07a5\bM\1\2\u07a5\u07a7\3\2\2\2\u07a6\u078c\3\2"+
		"\2\2\u07a6\u0797\3\2\2\2\u07a7\u0099\3\2\2\2\u07a8\u07aa\7\61\2\2\u07a9"+
		"\u07ab\79\2\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ac\3\2"+
		"\2\2\u07ac\u07b6\5\u0098M\2\u07ad\u07af\79\2\2\u07ae\u07ad\3\2\2\2\u07af"+
		"\u07b0\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2\3\2"+
		"\2\2\u07b2\u07b3\5\u0098M\2\u07b3\u07b4\bN\1\2\u07b4\u07b6\3\2\2\2\u07b5"+
		"\u07a8\3\2\2\2\u07b5\u07ae\3\2\2\2\u07b6\u009b\3\2\2\2\u07b7\u07b8\7\13"+
		"\2\2\u07b8\u07b9\79\2\2\u07b9\u07ba\7\n\2\2\u07ba\u07bb\79\2\2\u07bb\u07bc"+
		"\5\u0096L\2\u07bc\u009d\3\2\2\2\u07bd\u07be\7\13\2\2\u07be\u07bf\79\2"+
		"\2\u07bf\u07c2\5\4\3\2\u07c0\u07c1\7\35\2\2\u07c1\u07c3\7\36\2\2\u07c2"+
		"\u07c0\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c5\79"+
		"\2\2\u07c5\u07c6\5\u0096L\2\u07c6\u009f\3\2\2\2\u07c7\u07c8\5\u00a2R\2"+
		"\u07c8\u07c9\5\u0096L\2\u07c9\u00a1\3\2\2\2\u07ca\u07cb\7\13\2\2\u07cb"+
		"\u07cc\79\2\2\u07cc\u07cd\bR\1\2\u07cd\u00a3\3\2\2\2\u07ce\u07d2\7\33"+
		"\2\2\u07cf\u07d1\79\2\2\u07d0\u07cf\3\2\2\2\u07d1\u07d4\3\2\2\2\u07d2"+
		"\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2\3\2"+
		"\2\2\u07d5\u07d7\5(\25\2\u07d6\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8"+
		"\u07d6\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07dd\3\2\2\2\u07da\u07dc\79"+
		"\2\2\u07db\u07da\3\2\2\2\u07dc\u07df\3\2\2\2\u07dd\u07db\3\2\2\2\u07dd"+
		"\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df\u07dd\3\2\2\2\u07e0\u07e1\7\34"+
		"\2\2\u07e1\u00a5\3\2\2\2\u07e2\u07e3\5\u00a8U\2\u07e3\u07e4\5\u00aaV\2"+
		"\u07e4\u00a7\3\2\2\2\u07e5\u07e6\7\f\2\2\u07e6\u07e7\7\31\2\2\u07e7\u07eb"+
		"\7\32\2\2\u07e8\u07ea\79\2\2\u07e9\u07e8\3\2\2\2\u07ea\u07ed\3\2\2\2\u07eb"+
		"\u07e9\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07fd\3\2\2\2\u07ed\u07eb\3\2"+
		"\2\2\u07ee\u07f0\7\f\2\2\u07ef\u07f1\7\31\2\2\u07f0\u07ef\3\2\2\2\u07f0"+
		"\u07f1\3\2\2\2\u07f1\u07f3\3\2\2\2\u07f2\u07f4\7\32\2\2\u07f3\u07f2\3"+
		"\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f8\3\2\2\2\u07f5\u07f7\79\2\2\u07f6"+
		"\u07f5\3\2\2\2\u07f7\u07fa\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f8\u07f9\3\2"+
		"\2\2\u07f9\u07fb\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fb\u07fd\bU\1\2\u07fc"+
		"\u07e5\3\2\2\2\u07fc\u07ee\3\2\2\2\u07fd\u00a9\3\2\2\2\u07fe\u0802\5\u00ac"+
		"W\2\u07ff\u0801\79\2\2\u0800\u07ff\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0800"+
		"\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0806\3\2\2\2\u0804\u0802\3\2\2\2\u0805"+
		"\u0807\5(\25\2\u0806\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0806\3\2"+
		"\2\2\u0808\u0809\3\2\2\2\u0809\u080d\3\2\2\2\u080a\u080c\79\2\2\u080b"+
		"\u080a\3\2\2\2\u080c\u080f\3\2\2\2\u080d\u080b\3\2\2\2\u080d\u080e\3\2"+
		"\2\2\u080e\u0810\3\2\2\2\u080f\u080d\3\2\2\2\u0810\u0811\5\u00aeX\2\u0811"+
		"\u00ab\3\2\2\2\u0812\u0815\7\33\2\2\u0813\u0815\bW\1\2\u0814\u0812\3\2"+
		"\2\2\u0814\u0813\3\2\2\2\u0815\u00ad\3\2\2\2\u0816\u0819\7\34\2\2\u0817"+
		"\u0819\bX\1\2\u0818\u0816\3\2\2\2\u0818\u0817\3\2\2\2\u0819\u00af\3\2"+
		"\2\2\u0165\u00b2\u00b6\u00bd\u00c2\u00c8\u00cf\u00d5\u00e1\u00e3\u00e8"+
		"\u00ed\u00f3\u00f6\u00f9\u00fe\u0100\u0105\u010b\u0110\u0116\u011c\u0122"+
		"\u0129\u012e\u0134\u013a\u013e\u0145\u014b\u0153\u015b\u0165\u0175\u0179"+
		"\u017e\u0184\u018b\u018f\u0194\u019a\u01a2\u01a6\u01ab\u01b1\u01b8\u01bc"+
		"\u01c1\u01c7\u01d1\u01d5\u01da\u01e0\u01e7\u01eb\u01f0\u01f6\u0200\u0204"+
		"\u0209\u020f\u0216\u021a\u021f\u0225\u022e\u0232\u0237\u023d\u0245\u0249"+
		"\u024e\u0254\u025b\u025f\u0264\u026a\u0273\u0277\u027c\u0282\u028a\u028e"+
		"\u0293\u0299\u02a0\u02a4\u02a9\u02af\u02b5\u02ba\u02c0\u02c9\u02cf\u02d5"+
		"\u02dd\u02e1\u02e5\u02e8\u02ec\u02f0\u02f3\u02f9\u02fd\u0300\u0304\u030a"+
		"\u030e\u0313\u0318\u031c\u0322\u0326\u032b\u0336\u033a\u033e\u034b\u034f"+
		"\u0353\u0356\u035a\u035e\u0362\u0368\u036c\u0370\u0373\u0377\u037b\u037f"+
		"\u0387\u038b\u038e\u0393\u0397\u03a3\u03a7\u03ab\u03b2\u03b8\u03bc\u03c0"+
		"\u03c4\u03c9\u03cd\u03d1\u03d5\u03db\u03df\u03e5\u03ee\u03f2\u03f6\u03fa"+
		"\u03fe\u0404\u0407\u040d\u0410\u0413\u0418\u041d\u0422\u0427\u042d\u042f"+
		"\u0435\u0444\u0450\u0457\u045d\u0461\u0468\u046b\u046f\u0474\u0478\u047c"+
		"\u0480\u0486\u048c\u048f\u0494\u0496\u04a0\u04a4\u04a8\u04ae\u04b2\u04b8"+
		"\u04bc\u04c0\u04c6\u04ca\u04d0\u04d4\u04d9\u04df\u04e7\u04eb\u04ee\u04f3"+
		"\u04f7\u04fd\u0503\u0507\u050f\u0515\u0518\u051e\u0522\u0528\u052e\u0532"+
		"\u053a\u0540\u0543\u0549\u054e\u0554\u0558\u055c\u0560\u0564\u0568\u056e"+
		"\u0574\u0577\u057c\u057e\u0583\u0587\u058b\u058f\u0593\u0597\u059b\u05a1"+
		"\u05a5\u05a9\u05ad\u05b4\u05b7\u05bd\u05c1\u05c4\u05c9\u05cd\u05d0\u05d3"+
		"\u05d6\u05db\u05df\u05e7\u05eb\u05f0\u05f5\u05fc\u0602\u0607\u060f\u0613"+
		"\u0618\u061e\u0623\u0627\u062b\u0635\u0639\u063f\u0646\u064a\u064e\u0654"+
		"\u065a\u0660\u0667\u066b\u0671\u0677\u067d\u0684\u0688\u068d\u0693\u0699"+
		"\u069f\u06a4\u06a8\u06ac\u06af\u06b2\u06b7\u06bb\u06bf\u06c5\u06c9\u06d0"+
		"\u06d7\u06dd\u06e5\u06ea\u06ef\u06f3\u06f7\u06fc\u0704\u070b\u0711\u0714"+
		"\u0719\u071e\u0725\u072a\u072f\u0735\u073a\u0740\u0746\u074c\u0753\u0758"+
		"\u075e\u0764\u0768\u076d\u0771\u0777\u077d\u0782\u0789\u078f\u0794\u0797"+
		"\u079b\u079e\u07a2\u07a6\u07aa\u07b0\u07b5\u07c2\u07d2\u07d8\u07dd\u07eb"+
		"\u07f0\u07f3\u07f8\u07fc\u0802\u0808\u080d\u0814\u0818";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}