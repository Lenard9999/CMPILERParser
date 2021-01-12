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
		DOWN_TO=17, TO=18, WHILE=19, INT_DEC=20, BOOLEAN_DEC=21, FLOAT_DEC=22, 
		STRING_DEC=23, OPEN_PAREN=24, CLOSE_PAREN=25, OPEN_BRACKET=26, CLOSE_BRACKET=27, 
		OPEN_BRACE=28, CLOSE_BRACE=29, LESS=30, LESSQEUAL=31, GREATER=32, GREATEREQUAL=33, 
		PLUS=34, MINUS=35, MULTI=36, DIV=37, MOD=38, ANDAND=39, OROR=40, NOT=41, 
		ASSIGN=42, EQUAL=43, QUESTION=44, COLON=45, DOT=46, SEMICOLON=47, COMMA=48, 
		UNDERSCORE=49, SINGLE_QUOTE=50, LOWERCASE=51, UPPERCASE=52, DIGIT=53, 
		NEWLINE=54, LINECOMMENT=55, WHITE_SPACE=56;
	public static final int
		RULE_start = 0, RULE_variable_type = 1, RULE_string = 2, RULE_number = 3, 
		RULE_label = 4, RULE_label_words = 5, RULE_first_operators = 6, RULE_second_operators = 7, 
		RULE_operators = 8, RULE_logical_operators = 9, RULE_relational_operators = 10, 
		RULE_other_operators = 11, RULE_lexer_predefined_words = 12, RULE_constant_words = 13, 
		RULE_conditional_words = 14, RULE_loop_words = 15, RULE_simple_punctuations = 16, 
		RULE_symbol_words = 17, RULE_statements = 18, RULE_any_declaration = 19, 
		RULE_assigned_expression = 20, RULE_multiple_declaration = 21, RULE_variable_declaration_vartype = 22, 
		RULE_variable_declaration_no_vartype = 23, RULE_array_size = 24, RULE_array_variable = 25, 
		RULE_array_assign_body = 26, RULE_array_assign = 27, RULE_array_declaration_vartype = 28, 
		RULE_array_declaration_no_vartype = 29, RULE_print_statement = 30, RULE_value_print = 31, 
		RULE_extended_value_print = 32, RULE_scan_statement = 33, RULE_scan_body = 34, 
		RULE_display_message_parameter = 35, RULE_scan_label = 36, RULE_value_parameter = 37, 
		RULE_constant_declaration = 38, RULE_return_statement = 39, RULE_return_value = 40, 
		RULE_expression = 41, RULE_operator_expression = 42, RULE_parenthesis_expression = 43, 
		RULE_first_expression_operator = 44, RULE_second_expression_operator = 45, 
		RULE_value_expression = 46, RULE_comparison_statement = 47, RULE_assignment_statement = 48, 
		RULE_value_comparison = 49, RULE_conditional_statement = 50, RULE_conditional_comparison_structure = 51, 
		RULE_with_then = 52, RULE_with_comparison = 53, RULE_conditional_body = 54, 
		RULE_if_statement = 55, RULE_else_if_statement = 56, RULE_else_statement = 57, 
		RULE_loop_statement = 58, RULE_loop_structure = 59, RULE_loop_variable_declaration = 60, 
		RULE_loop_expression = 61, RULE_while_statement = 62, RULE_for_statement = 63, 
		RULE_function_calling = 64, RULE_function_parameters = 65, RULE_function_paremeters_value = 66, 
		RULE_function_declaration = 67, RULE_function_structure = 68, RULE_function_declaration_parameters = 69, 
		RULE_void_function = 70, RULE_non_void_function = 71, RULE_error_function = 72, 
		RULE_scoping_statement = 73, RULE_main_function = 74, RULE_main_head = 75, 
		RULE_main_body = 76, RULE_main_body_first = 77, RULE_main_body_second = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variable_type", "string", "number", "label", "label_words", 
			"first_operators", "second_operators", "operators", "logical_operators", 
			"relational_operators", "other_operators", "lexer_predefined_words", 
			"constant_words", "conditional_words", "loop_words", "simple_punctuations", 
			"symbol_words", "statements", "any_declaration", "assigned_expression", 
			"multiple_declaration", "variable_declaration_vartype", "variable_declaration_no_vartype", 
			"array_size", "array_variable", "array_assign_body", "array_assign", 
			"array_declaration_vartype", "array_declaration_no_vartype", "print_statement", 
			"value_print", "extended_value_print", "scan_statement", "scan_body", 
			"display_message_parameter", "scan_label", "value_parameter", "constant_declaration", 
			"return_statement", "return_value", "expression", "operator_expression", 
			"parenthesis_expression", "first_expression_operator", "second_expression_operator", 
			"value_expression", "comparison_statement", "assignment_statement", "value_comparison", 
			"conditional_statement", "conditional_comparison_structure", "with_then", 
			"with_comparison", "conditional_body", "if_statement", "else_if_statement", 
			"else_statement", "loop_statement", "loop_structure", "loop_variable_declaration", 
			"loop_expression", "while_statement", "for_statement", "function_calling", 
			"function_parameters", "function_paremeters_value", "function_declaration", 
			"function_structure", "function_declaration_parameters", "void_function", 
			"non_void_function", "error_function", "scoping_statement", "main_function", 
			"main_head", "main_body", "main_body_first", "main_body_second"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'f'", "'create'", "'constant'", "'return'", "'print'", 
			"'scan'", "'void'", "'func'", "'main'", "'if'", "'else'", "'else if'", 
			"'then'", "'for'", "'up to'", "'down to'", "'to'", "'while'", "'int'", 
			"'bool'", "'float'", "'String'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
			"'||'", "'!'", "'='", "'=='", "'?'", "':'", "'.'", "';'", "','", "'_'", 
			"'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", 
			"FUNC", "MAIN", "IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", 
			"TO", "WHILE", "INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", 
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
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(158);
				function_declaration();
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(159);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(170);
				match(WHITE_SPACE);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			main_function();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(177);
				match(NEWLINE);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(183);
				match(WHITE_SPACE);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
			setState(191);
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
			setState(193);
			match(T__0);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(194);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(195);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(196);
					label();
					}
					break;
				case 4:
					{
					setState(197);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(202);
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
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(204);
					match(MINUS);
					}
				}

				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					match(DIGIT);
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				{
				setState(212);
				match(DOT);
				setState(214); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(213);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(216); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(218);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(221);
					match(MINUS);
					}
				}

				setState(225); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(224);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(227); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				{
				setState(231);
				label_words();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(237);
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
				setState(240); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					match(DIGIT);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					label_words();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					label();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(264);
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
				setState(260);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(261);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(262);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(263);
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
		enterRule(_localctx, 12, RULE_first_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 14, RULE_second_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 16, RULE_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(270);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(271);
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
		enterRule(_localctx, 18, RULE_logical_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 20, RULE_relational_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 22, RULE_other_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(278);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(279);
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
		enterRule(_localctx, 24, RULE_lexer_predefined_words);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
				setState(282);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(283);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(284);
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
				setState(285);
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
				setState(286);
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
				setState(287);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(288);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(289);
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
		enterRule(_localctx, 26, RULE_constant_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		enterRule(_localctx, 28, RULE_conditional_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		public TerminalNode TO() { return getToken(MainParser.TO, 0); }
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
		enterRule(_localctx, 30, RULE_loop_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_simple_punctuations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		enterRule(_localctx, 34, RULE_symbol_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		enterRule(_localctx, 36, RULE_statements);
		try {
			int _alt;
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				conditional_statement();
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(309);
					match(LINECOMMENT);
					}
					break;
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(312);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(318);
						match(NEWLINE);
						}
						} 
					}
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				loop_statement();
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(331);
					match(LINECOMMENT);
					}
					break;
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(334);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(339);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(340);
						match(NEWLINE);
						}
						} 
					}
					setState(345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				print_statement();
				setState(347);
				match(SEMICOLON);
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(354);
					match(LINECOMMENT);
					}
					break;
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(357);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(363);
						match(NEWLINE);
						}
						} 
					}
					setState(368);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				print_statement();
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(370);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(376);
					match(LINECOMMENT);
					}
					break;
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385);
						match(NEWLINE);
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				scan_statement();
				setState(394);
				match(SEMICOLON);
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(395);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(401);
					match(LINECOMMENT);
					}
					break;
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(404);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(409);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(410);
						match(NEWLINE);
						}
						} 
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				scan_statement();
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(417);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(423);
					match(LINECOMMENT);
					}
					break;
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(426);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(432);
						match(NEWLINE);
						}
						} 
					}
					setState(437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(440);
				return_statement();
				setState(441);
				match(SEMICOLON);
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(442);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(447);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(448);
					match(LINECOMMENT);
					}
					break;
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(451);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(457);
						match(NEWLINE);
						}
						} 
					}
					setState(462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(463);
				return_statement();
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(464);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(469);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(470);
					match(LINECOMMENT);
					}
					break;
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(473);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(479);
						match(NEWLINE);
						}
						} 
					}
					setState(484);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(487);
				constant_declaration();
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(488);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(493);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(494);
					match(LINECOMMENT);
					}
					break;
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(497);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(503);
						match(NEWLINE);
						}
						} 
					}
					setState(508);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(509);
				any_declaration();
				setState(510);
				match(SEMICOLON);
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(511);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(516);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(517);
					match(LINECOMMENT);
					}
					break;
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(520);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(525);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(526);
						match(NEWLINE);
						}
						} 
					}
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(532);
				any_declaration();
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(533);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(538);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(539);
					match(LINECOMMENT);
					}
					break;
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(542);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(547);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(548);
						match(NEWLINE);
						}
						} 
					}
					setState(553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(556);
				scoping_statement();
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(557);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(563);
					match(LINECOMMENT);
					}
					break;
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(566);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						match(NEWLINE);
						}
						} 
					}
					setState(577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(578);
				function_calling();
				setState(579);
				match(SEMICOLON);
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(580);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(585);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(586);
					match(LINECOMMENT);
					}
					break;
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(589);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						match(NEWLINE);
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(601);
				function_calling();
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(607);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(608);
					match(LINECOMMENT);
					}
					break;
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(611);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(617);
						match(NEWLINE);
						}
						} 
					}
					setState(622);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
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
		enterRule(_localctx, 38, RULE_any_declaration);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(630);
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
		enterRule(_localctx, 40, RULE_assigned_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(633);
				string();
				}
				break;
			case 2:
				{
				setState(634);
				number();
				}
				break;
			case 3:
				{
				setState(635);
				label();
				}
				break;
			case 4:
				{
				setState(636);
				expression();
				}
				break;
			case 5:
				{
				setState(637);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(638);
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
		enterRule(_localctx, 42, RULE_multiple_declaration);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				label();
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(642);
						match(WHITE_SPACE);
						}
					}

					setState(645);
					match(ASSIGN);
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(646);
						match(WHITE_SPACE);
						}
					}

					setState(649);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				label();
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(653);
						match(WHITE_SPACE);
						}
					}

					setState(656);
					match(EQUAL);
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(657);
						match(WHITE_SPACE);
						}
					}

					setState(660);
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
		enterRule(_localctx, 44, RULE_variable_declaration_vartype);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			variable_type();
			setState(668);
			match(WHITE_SPACE);
			setState(669);
			multiple_declaration();
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(670);
						match(WHITE_SPACE);
						}
					}

					setState(673);
					match(COMMA);
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(674);
						match(WHITE_SPACE);
						}
					}

					setState(677);
					multiple_declaration();
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
		enterRule(_localctx, 46, RULE_variable_declaration_no_vartype);
		int _la;
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				label();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(684);
					match(WHITE_SPACE);
					}
				}

				setState(687);
				match(ASSIGN);
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(688);
					match(WHITE_SPACE);
					}
				}

				setState(691);
				assigned_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				label();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(694);
					match(WHITE_SPACE);
					}
				}

				setState(697);
				match(EQUAL);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(698);
					match(WHITE_SPACE);
					}
				}

				setState(701);
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
		enterRule(_localctx, 48, RULE_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			expression();
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
		enterRule(_localctx, 50, RULE_array_variable);
		int _la;
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				label();
				setState(709);
				match(OPEN_BRACE);
				setState(710);
				array_size();
				setState(711);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				label();
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(714);
					match(OPEN_BRACE);
					}
				}

				setState(717);
				array_size();
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(718);
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
		enterRule(_localctx, 52, RULE_array_assign_body);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(CREATE);
				setState(726);
				match(WHITE_SPACE);
				setState(727);
				variable_type();
				setState(728);
				match(OPEN_BRACE);
				setState(729);
				array_size();
				setState(730);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(CREATE);
				setState(733);
				match(WHITE_SPACE);
				setState(734);
				variable_type();
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(735);
					match(OPEN_BRACE);
					}
				}

				setState(738);
				array_size();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(739);
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
		enterRule(_localctx, 54, RULE_array_assign);
		int _la;
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(746);
					match(WHITE_SPACE);
					}
				}

				setState(749);
				match(ASSIGN);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(750);
					match(WHITE_SPACE);
					}
				}

				setState(753);
				array_assign_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(754);
					match(WHITE_SPACE);
					}
				}

				setState(757);
				match(EQUAL);
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
				array_assign_body();
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(764);
					match(WHITE_SPACE);
					}
				}

				setState(767);
				match(ASSIGN);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(768);
					match(WHITE_SPACE);
					}
				}

				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(771);
					array_variable();
					}
					break;
				case 2:
					{
					setState(772);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				match(EQUAL);
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(779);
					match(WHITE_SPACE);
					}
				}

				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(782);
					array_variable();
					}
					break;
				case 2:
					{
					setState(783);
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
		enterRule(_localctx, 56, RULE_array_declaration_vartype);
		int _la;
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				variable_type();
				setState(791);
				match(OPEN_BRACE);
				setState(792);
				match(CLOSE_BRACE);
				setState(793);
				match(WHITE_SPACE);
				setState(794);
				label();
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(795);
					array_assign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				variable_type();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(799);
					match(OPEN_BRACE);
					}
				}

				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(802);
					match(CLOSE_BRACE);
					}
				}

				setState(805);
				match(WHITE_SPACE);
				setState(806);
				label();
				setState(808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(807);
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
		enterRule(_localctx, 58, RULE_array_declaration_no_vartype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			array_variable();
			setState(815);
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
		enterRule(_localctx, 60, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(PRINT);
			setState(818);
			match(OPEN_PAREN);
			setState(819);
			value_print();
			setState(820);
			match(CLOSE_PAREN);
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
		enterRule(_localctx, 62, RULE_value_print);
		int _la;
		try {
			int _alt;
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				extended_value_print();
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==WHITE_SPACE) {
					{
					{
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(823);
						match(WHITE_SPACE);
						}
					}

					setState(826);
					match(PLUS);
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(827);
						match(WHITE_SPACE);
						}
					}

					setState(830);
					extended_value_print();
					setState(832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(831);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					}
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				label();
				setState(842); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(840);
					match(WHITE_SPACE);
					setState(841);
					label();
					}
					}
					setState(844); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITE_SPACE );
				notifyErrorListeners("No double quotes");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				extended_value_print();
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(850);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(849);
							match(WHITE_SPACE);
							}
						}

						setState(852);
						match(PLUS);
						setState(854);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(853);
							match(WHITE_SPACE);
							}
						}

						setState(856);
						extended_value_print();
						setState(858);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
						case 1:
							{
							setState(857);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(864);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				setState(866); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(865);
					match(PLUS);
					}
					}
					setState(868); 
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
		enterRule(_localctx, 64, RULE_extended_value_print);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
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
		enterRule(_localctx, 66, RULE_scan_statement);
		int _la;
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				match(SCAN);
				setState(881);
				match(OPEN_PAREN);
				setState(882);
				scan_body();
				setState(883);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(SCAN);
				setState(887);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(886);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(889);
				scan_body();
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(890);
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
		enterRule(_localctx, 68, RULE_scan_body);
		int _la;
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				display_message_parameter();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(898);
					match(WHITE_SPACE);
					}
				}

				setState(901);
				match(COMMA);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(902);
					match(WHITE_SPACE);
					}
				}

				setState(905);
				value_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				display_message_parameter();
				setState(909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(908);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(911);
					match(COMMA);
					}
				}

				notifyErrorListeners("Missing 2nd scan parameter");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				display_message_parameter();
				setState(918);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(917);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(920);
					match(COMMA);
					}
				}

				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(923);
					match(WHITE_SPACE);
					}
				}

				setState(926);
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
		enterRule(_localctx, 70, RULE_display_message_parameter);
		try {
			int _alt;
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
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
			case TO:
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
				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(932);
					expression();
					}
					break;
				case 2:
					{
					setState(933);
					scan_label();
					}
					break;
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(936);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
		enterRule(_localctx, 72, RULE_scan_label);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(950); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(950);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
					case 1:
						{
						setState(946);
						match(DIGIT);
						}
						break;
					case 2:
						{
						setState(947);
						lexer_predefined_words();
						}
						break;
					case 3:
						{
						setState(948);
						label();
						}
						break;
					case 4:
						{
						setState(949);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(952); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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
		enterRule(_localctx, 74, RULE_value_parameter);
		try {
			setState(958);
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
			case TO:
			case WHILE:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case UNDERSCORE:
			case LOWERCASE:
			case UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				label();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
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
		enterRule(_localctx, 76, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(CONSTANT);
			setState(961);
			match(WHITE_SPACE);
			setState(962);
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
		enterRule(_localctx, 78, RULE_return_statement);
		int _la;
		try {
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(RETURN);
				setState(965);
				match(WHITE_SPACE);
				setState(966);
				return_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				match(RETURN);
				setState(968);
				match(WHITE_SPACE);
				setState(969);
				return_value();
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(970);
					match(WHITE_SPACE);
					}
					}
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(976);
				match(OPEN_PAREN);
				setState(977);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				match(RETURN);
				setState(981);
				match(WHITE_SPACE);
				setState(982);
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
		enterRule(_localctx, 80, RULE_return_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(987);
				string();
				}
				break;
			case 2:
				{
				setState(988);
				number();
				}
				break;
			case 3:
				{
				setState(989);
				label();
				}
				break;
			case 4:
				{
				setState(990);
				expression();
				}
				break;
			case 5:
				{
				setState(991);
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
		public Parenthesis_expressionContext parenthesis_expression() {
			return getRuleContext(Parenthesis_expressionContext.class,0);
		}
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			parenthesis_expression();
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(995);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(998);
			operator_expression();
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

	public static class Operator_expressionContext extends ParserRuleContext {
		public First_expression_operatorContext first_expression_operator() {
			return getRuleContext(First_expression_operatorContext.class,0);
		}
		public Second_expression_operatorContext second_expression_operator() {
			return getRuleContext(Second_expression_operatorContext.class,0);
		}
		public Operator_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOperator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOperator_expression(this);
		}
	}

	public final Operator_expressionContext operator_expression() throws RecognitionException {
		Operator_expressionContext _localctx = new Operator_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operator_expression);
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				first_expression_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				second_expression_operator();
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

	public static class Parenthesis_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MainParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MainParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public Parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterParenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitParenthesis_expression(this);
		}
	}

	public final Parenthesis_expressionContext parenthesis_expression() throws RecognitionException {
		Parenthesis_expressionContext _localctx = new Parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parenthesis_expression);
		int _la;
		try {
			int _alt;
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(OPEN_PAREN);
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1005);
					match(WHITE_SPACE);
					}
				}

				setState(1008);
				expression();
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1009);
					match(WHITE_SPACE);
					}
				}

				setState(1012);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(OPEN_PAREN);
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
				expression();
				setState(1020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1019);
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
				setState(1024);
				match(OPEN_PAREN);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1025);
					match(WHITE_SPACE);
					}
				}

				setState(1028);
				expression();
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1029);
					match(WHITE_SPACE);
					}
				}

				setState(1033); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1032);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1035); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Uneven parenthesis, duplicate ')'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1039);
				value_expression();
				setState(1041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1040);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1043);
				operator_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1045);
				value_expression();
				setState(1051); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1046);
						match(WHITE_SPACE);
						setState(1049);
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
						case TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case UNDERSCORE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1047);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1048);
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
					setState(1053); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1056);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1055);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1058);
				operator_expression();
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

	public static class First_expression_operatorContext extends ParserRuleContext {
		public First_operatorsContext first_operators() {
			return getRuleContext(First_operatorsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
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
		public First_expression_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_expression_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFirst_expression_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFirst_expression_operator(this);
		}
	}

	public final First_expression_operatorContext first_expression_operator() throws RecognitionException {
		First_expression_operatorContext _localctx = new First_expression_operatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_first_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				first_operators();
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1064);
					match(WHITE_SPACE);
					}
				}

				setState(1067);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				first_operators();
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1070);
					match(WHITE_SPACE);
					}
				}

				setState(1073);
				expression();
				setState(1079); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1074);
						match(WHITE_SPACE);
						setState(1077);
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
						case TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case UNDERSCORE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1075);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1076);
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
					setState(1081); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				first_operators();
				setState(1093); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1089);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1086);
							match(WHITE_SPACE);
							}
							}
							setState(1091);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1092);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1095); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1097);
					match(WHITE_SPACE);
					}
				}

				setState(1100);
				expression();
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

	public static class Second_expression_operatorContext extends ParserRuleContext {
		public Second_operatorsContext second_operators() {
			return getRuleContext(Second_operatorsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
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
		public Second_expression_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_expression_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSecond_expression_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSecond_expression_operator(this);
		}
	}

	public final Second_expression_operatorContext second_expression_operator() throws RecognitionException {
		Second_expression_operatorContext _localctx = new Second_expression_operatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_second_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				second_operators();
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1107);
					match(WHITE_SPACE);
					}
				}

				setState(1110);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				second_operators();
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1113);
					match(WHITE_SPACE);
					}
				}

				setState(1116);
				expression();
				setState(1122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1117);
						match(WHITE_SPACE);
						setState(1120);
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
						case TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case UNDERSCORE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1118);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1119);
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
					setState(1124); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				second_operators();
				setState(1136); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1132);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1129);
							match(WHITE_SPACE);
							}
							}
							setState(1134);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1135);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1138); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1140);
					match(WHITE_SPACE);
					}
				}

				setState(1143);
				expression();
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
		enterRule(_localctx, 92, RULE_value_expression);
		try {
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1151);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_comparison_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1155);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(1156);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1157);
					match(NOT);
					}
				}

				setState(1160);
				match(OPEN_PAREN);
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1161);
					match(WHITE_SPACE);
					}
				}

				setState(1164);
				comparison_statement(0);
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1165);
					match(WHITE_SPACE);
					}
				}

				setState(1168);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1172);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1174);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1173);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1176);
						other_operators();
						}
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1177);
							match(WHITE_SPACE);
							}
						}

						setState(1180);
						comparison_statement(4);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1184);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1183);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1186);
						other_operators();
						setState(1188); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1187);
							other_operators();
							}
							}
							setState(1190); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR))) != 0) );
						}
						setState(1193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1192);
							match(WHITE_SPACE);
							}
						}

						setState(1195);
						comparison_statement(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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
		enterRule(_localctx, 96, RULE_assignment_statement);
		int _la;
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				label();
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1204);
					match(WHITE_SPACE);
					}
				}

				setState(1207);
				match(EQUAL);
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1208);
					match(WHITE_SPACE);
					}
				}

				setState(1213);
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
				case TO:
				case WHILE:
				case INT_DEC:
				case BOOLEAN_DEC:
				case FLOAT_DEC:
				case STRING_DEC:
				case OPEN_PAREN:
				case MINUS:
				case UNDERSCORE:
				case LOWERCASE:
				case UPPERCASE:
				case DIGIT:
					{
					setState(1211);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(1212);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				label();
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1216);
					match(WHITE_SPACE);
					}
				}

				setState(1219);
				match(ASSIGN);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1220);
					match(WHITE_SPACE);
					}
				}

				setState(1225);
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
				case TO:
				case WHILE:
				case INT_DEC:
				case BOOLEAN_DEC:
				case FLOAT_DEC:
				case STRING_DEC:
				case OPEN_PAREN:
				case MINUS:
				case UNDERSCORE:
				case LOWERCASE:
				case UPPERCASE:
				case DIGIT:
					{
					setState(1223);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(1224);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 98, RULE_value_comparison);
		try {
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1233);
				expression();
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
		enterRule(_localctx, 100, RULE_conditional_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			if_statement();
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1237);
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
			setState(1246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1240);
					else_if_statement();
					setState(1242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
					case 1:
						{
						setState(1241);
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
				setState(1248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1249);
				else_statement();
				setState(1253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1250);
						match(NEWLINE);
						}
						} 
					}
					setState(1255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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
		enterRule(_localctx, 102, RULE_conditional_comparison_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			with_comparison();
			setState(1259);
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
		enterRule(_localctx, 104, RULE_with_then);
		int _la;
		try {
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1261);
					match(WHITE_SPACE);
					}
				}

				setState(1264);
				match(THEN);
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1265);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1268);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1271);
					match(THEN);
					}
					break;
				}
				setState(1275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1274);
					match(WHITE_SPACE);
					}
					break;
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
		enterRule(_localctx, 106, RULE_with_comparison);
		int _la;
		try {
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				match(OPEN_PAREN);
				setState(1281);
				comparison_statement(0);
				setState(1282);
				match(CLOSE_PAREN);
				setState(1283);
				with_then();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1285);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(1288);
				comparison_statement(0);
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1289);
					match(CLOSE_PAREN);
					}
				}

				setState(1292);
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
		enterRule(_localctx, 108, RULE_conditional_body);
		int _la;
		try {
			int _alt;
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				match(OPEN_BRACKET);
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1298);
					match(WHITE_SPACE);
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1304);
					statements();
					}
					}
					setState(1307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1309);
					match(WHITE_SPACE);
					}
					}
					setState(1314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1315);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1317);
					match(OPEN_BRACKET);
					}
					break;
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1320);
					match(WHITE_SPACE);
					}
					}
					setState(1325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1327); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1326);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1329); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1331);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				}
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1337);
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
		enterRule(_localctx, 110, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(IF);
			setState(1345);
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
		enterRule(_localctx, 112, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(ELSE_IF);
			setState(1348);
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
		enterRule(_localctx, 114, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(ELSE);
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1351);
				match(WHITE_SPACE);
				}
			}

			setState(1354);
			match(THEN);
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1355);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1358);
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
		enterRule(_localctx, 116, RULE_loop_statement);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1361);
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

	public static class Loop_structureContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public TerminalNode UP_TO() { return getToken(MainParser.UP_TO, 0); }
		public TerminalNode DOWN_TO() { return getToken(MainParser.DOWN_TO, 0); }
		public TerminalNode TO() { return getToken(MainParser.TO, 0); }
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
		enterRule(_localctx, 118, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				expression();
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
				match(OPEN_BRACKET);
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1373);
					match(WHITE_SPACE);
					}
					}
					setState(1378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1379);
					statements();
					}
					}
					setState(1382); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1384);
					match(WHITE_SPACE);
					}
					}
					setState(1389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1390);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1393);
					match(WHITE_SPACE);
					}
				}

				setState(1396);
				expression();
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1397);
					match(WHITE_SPACE);
					}
				}

				setState(1400);
				match(OPEN_BRACKET);
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1401);
					match(WHITE_SPACE);
					}
					}
					setState(1406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1408); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1407);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1410); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1412);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				}
				notifyErrorListeners("Missing closing curly brackets");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1421);
					match(WHITE_SPACE);
					}
				}

				setState(1424);
				expression();
				setState(1426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1425);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1428);
					match(WHITE_SPACE);
					}
					}
					setState(1433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1434);
					statements();
					}
					}
					setState(1437); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1439);
					match(WHITE_SPACE);
					}
					}
					setState(1444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1445);
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
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
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
		enterRule(_localctx, 120, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1450);
					variable_type();
					setState(1451);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1455);
				label();
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1456);
					match(WHITE_SPACE);
					}
				}

				setState(1459);
				match(ASSIGN);
				setState(1461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1460);
					match(WHITE_SPACE);
					}
				}

				setState(1463);
				loop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				variable_type();
				setState(1466);
				match(WHITE_SPACE);
				setState(1467);
				label();
				notifyErrorListeners("Missing assignment operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1470);
				expression();
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
		enterRule(_localctx, 122, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1473);
				number();
				}
				break;
			case 2:
				{
				setState(1474);
				label();
				}
				break;
			case 3:
				{
				setState(1475);
				expression();
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
		enterRule(_localctx, 124, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(WHILE);
			setState(1480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1479);
				match(WHITE_SPACE);
				}
			}

			setState(1482);
			expression();
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1483);
				match(WHITE_SPACE);
				}
			}

			setState(1486);
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
		enterRule(_localctx, 126, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(FOR);
			setState(1490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1489);
				match(WHITE_SPACE);
				}
			}

			setState(1492);
			loop_variable_declaration();
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1493);
				match(WHITE_SPACE);
				}
			}

			setState(1496);
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
		enterRule(_localctx, 128, RULE_function_calling);
		int _la;
		try {
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				label();
				setState(1499);
				match(OPEN_PAREN);
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1500);
					function_parameters();
					}
				}

				setState(1503);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1505);
				label();
				setState(1506);
				match(OPEN_PAREN);
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1507);
					function_parameters();
					}
				}

				setState(1510);
				match(CLOSE_PAREN);
				setState(1511);
				match(OPEN_PAREN);
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1512);
					function_parameters();
					}
				}

				setState(1515);
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
		enterRule(_localctx, 130, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			function_paremeters_value();
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==WHITE_SPACE) {
				{
				{
				setState(1522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1521);
					match(WHITE_SPACE);
					}
				}

				setState(1524);
				match(COMMA);
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1525);
					match(WHITE_SPACE);
					}
				}

				setState(1528);
				function_paremeters_value();
				}
				}
				setState(1533);
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

	public static class Function_paremeters_valueContext extends ParserRuleContext {
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
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
		enterRule(_localctx, 132, RULE_function_paremeters_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1534);
				function_calling();
				}
				break;
			case 2:
				{
				setState(1535);
				label();
				}
				break;
			case 3:
				{
				setState(1536);
				expression();
				}
				break;
			case 4:
				{
				setState(1537);
				string();
				}
				break;
			case 5:
				{
				setState(1538);
				number();
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
		enterRule(_localctx, 134, RULE_function_declaration);
		try {
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1541);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				non_void_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1543);
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
		enterRule(_localctx, 136, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			label();
			setState(1547);
			match(OPEN_PAREN);
			setState(1549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(1548);
				function_declaration_parameters();
				}
			}

			setState(1551);
			match(CLOSE_PAREN);
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1552);
				match(WHITE_SPACE);
				}
			}

			setState(1555);
			match(OPEN_BRACKET);
			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1556);
				match(WHITE_SPACE);
				}
				}
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1563); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1562);
				statements();
				}
				}
				setState(1565); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1567);
				match(WHITE_SPACE);
				}
				}
				setState(1572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1573);
			match(CLOSE_BRACKET);
			setState(1577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1574);
				match(NEWLINE);
				}
				}
				setState(1579);
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
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
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
		enterRule(_localctx, 138, RULE_function_declaration_parameters);
		int _la;
		try {
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
				variable_type();
				setState(1583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1581);
					match(OPEN_BRACE);
					setState(1582);
					match(CLOSE_BRACE);
					}
				}

				setState(1585);
				match(WHITE_SPACE);
				setState(1586);
				label();
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1587);
					match(COMMA);
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(1588);
						match(WHITE_SPACE);
						}
					}

					setState(1591);
					function_declaration_parameters();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				variable_type();
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1595);
					match(OPEN_BRACE);
					setState(1596);
					match(CLOSE_BRACE);
					}
				}

				setState(1599);
				match(WHITE_SPACE);
				setState(1600);
				label();
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==WHITE_SPACE) {
					{
					setState(1602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1601);
						match(COMMA);
						}
					}

					setState(1605); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1604);
						match(WHITE_SPACE);
						}
						}
						setState(1607); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WHITE_SPACE );
					setState(1609);
					function_declaration_parameters();
					}
				}

				notifyErrorListeners("Missing comma after each parameter");
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
		enterRule(_localctx, 140, RULE_void_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			match(FUNC);
			setState(1617);
			match(WHITE_SPACE);
			setState(1618);
			match(VOID);
			setState(1619);
			match(WHITE_SPACE);
			setState(1620);
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
		enterRule(_localctx, 142, RULE_non_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(FUNC);
			setState(1623);
			match(WHITE_SPACE);
			setState(1624);
			variable_type();
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1625);
				match(OPEN_BRACE);
				setState(1626);
				match(CLOSE_BRACE);
				}
			}

			setState(1629);
			match(WHITE_SPACE);
			setState(1630);
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
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
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
		enterRule(_localctx, 144, RULE_error_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			match(FUNC);
			setState(1633);
			match(WHITE_SPACE);
			setState(1634);
			function_structure();
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
		enterRule(_localctx, 146, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(OPEN_BRACKET);
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1638);
				match(WHITE_SPACE);
				}
				}
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1644);
				statements();
				}
				}
				setState(1647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(1652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1649);
				match(WHITE_SPACE);
				}
				}
				setState(1654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1655);
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
		enterRule(_localctx, 148, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			main_head();
			setState(1658);
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
		enterRule(_localctx, 150, RULE_main_head);
		int _la;
		try {
			int _alt;
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1660);
				match(MAIN);
				setState(1661);
				match(OPEN_PAREN);
				setState(1662);
				match(CLOSE_PAREN);
				setState(1666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1663);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1668);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				match(MAIN);
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(1670);
					match(OPEN_PAREN);
					}
				}

				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1673);
					match(CLOSE_PAREN);
					}
				}

				setState(1679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1676);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1681);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
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
		enterRule(_localctx, 152, RULE_main_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			main_body_first();
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1686);
				match(WHITE_SPACE);
				}
				}
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1693); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1692);
				statements();
				}
				}
				setState(1695); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(1700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1697);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			setState(1703);
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
		enterRule(_localctx, 154, RULE_main_body_first);
		try {
			setState(1707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1705);
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
		enterRule(_localctx, 156, RULE_main_body_second);
		try {
			setState(1711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1709);
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
		case 47:
			return comparison_statement_sempred((Comparison_statementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean comparison_statement_sempred(Comparison_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u06b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\7\2\u00a3\n\2\f"+
		"\2\16\2\u00a6\13\2\7\2\u00a8\n\2\f\2\16\2\u00ab\13\2\3\2\7\2\u00ae\n\2"+
		"\f\2\16\2\u00b1\13\2\3\2\3\2\7\2\u00b5\n\2\f\2\16\2\u00b8\13\2\3\2\7\2"+
		"\u00bb\n\2\f\2\16\2\u00be\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4"+
		"\u00c9\n\4\r\4\16\4\u00ca\3\4\3\4\3\5\5\5\u00d0\n\5\3\5\6\5\u00d3\n\5"+
		"\r\5\16\5\u00d4\3\5\3\5\6\5\u00d9\n\5\r\5\16\5\u00da\3\5\5\5\u00de\n\5"+
		"\3\5\5\5\u00e1\n\5\3\5\6\5\u00e4\n\5\r\5\16\5\u00e5\5\5\u00e8\n\5\3\6"+
		"\7\6\u00eb\n\6\f\6\16\6\u00ee\13\6\3\6\6\6\u00f1\n\6\r\6\16\6\u00f2\3"+
		"\6\7\6\u00f6\n\6\f\6\16\6\u00f9\13\6\3\6\7\6\u00fc\n\6\f\6\16\6\u00ff"+
		"\13\6\3\6\7\6\u0102\n\6\f\6\16\6\u0105\13\6\3\7\3\7\3\7\3\7\5\7\u010b"+
		"\n\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u0113\n\n\3\13\3\13\3\f\3\f\3\r\3\r\5"+
		"\r\u011b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0125\n\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\7\24\u0133"+
		"\n\24\f\24\16\24\u0136\13\24\3\24\5\24\u0139\n\24\3\24\7\24\u013c\n\24"+
		"\f\24\16\24\u013f\13\24\3\24\7\24\u0142\n\24\f\24\16\24\u0145\13\24\3"+
		"\24\3\24\7\24\u0149\n\24\f\24\16\24\u014c\13\24\3\24\5\24\u014f\n\24\3"+
		"\24\7\24\u0152\n\24\f\24\16\24\u0155\13\24\3\24\7\24\u0158\n\24\f\24\16"+
		"\24\u015b\13\24\3\24\3\24\3\24\7\24\u0160\n\24\f\24\16\24\u0163\13\24"+
		"\3\24\5\24\u0166\n\24\3\24\7\24\u0169\n\24\f\24\16\24\u016c\13\24\3\24"+
		"\7\24\u016f\n\24\f\24\16\24\u0172\13\24\3\24\3\24\7\24\u0176\n\24\f\24"+
		"\16\24\u0179\13\24\3\24\5\24\u017c\n\24\3\24\7\24\u017f\n\24\f\24\16\24"+
		"\u0182\13\24\3\24\7\24\u0185\n\24\f\24\16\24\u0188\13\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u018f\n\24\f\24\16\24\u0192\13\24\3\24\5\24\u0195\n\24"+
		"\3\24\7\24\u0198\n\24\f\24\16\24\u019b\13\24\3\24\7\24\u019e\n\24\f\24"+
		"\16\24\u01a1\13\24\3\24\3\24\7\24\u01a5\n\24\f\24\16\24\u01a8\13\24\3"+
		"\24\5\24\u01ab\n\24\3\24\7\24\u01ae\n\24\f\24\16\24\u01b1\13\24\3\24\7"+
		"\24\u01b4\n\24\f\24\16\24\u01b7\13\24\3\24\3\24\3\24\3\24\3\24\7\24\u01be"+
		"\n\24\f\24\16\24\u01c1\13\24\3\24\5\24\u01c4\n\24\3\24\7\24\u01c7\n\24"+
		"\f\24\16\24\u01ca\13\24\3\24\7\24\u01cd\n\24\f\24\16\24\u01d0\13\24\3"+
		"\24\3\24\7\24\u01d4\n\24\f\24\16\24\u01d7\13\24\3\24\5\24\u01da\n\24\3"+
		"\24\7\24\u01dd\n\24\f\24\16\24\u01e0\13\24\3\24\7\24\u01e3\n\24\f\24\16"+
		"\24\u01e6\13\24\3\24\3\24\3\24\3\24\7\24\u01ec\n\24\f\24\16\24\u01ef\13"+
		"\24\3\24\5\24\u01f2\n\24\3\24\7\24\u01f5\n\24\f\24\16\24\u01f8\13\24\3"+
		"\24\7\24\u01fb\n\24\f\24\16\24\u01fe\13\24\3\24\3\24\3\24\7\24\u0203\n"+
		"\24\f\24\16\24\u0206\13\24\3\24\5\24\u0209\n\24\3\24\7\24\u020c\n\24\f"+
		"\24\16\24\u020f\13\24\3\24\7\24\u0212\n\24\f\24\16\24\u0215\13\24\3\24"+
		"\3\24\7\24\u0219\n\24\f\24\16\24\u021c\13\24\3\24\5\24\u021f\n\24\3\24"+
		"\7\24\u0222\n\24\f\24\16\24\u0225\13\24\3\24\7\24\u0228\n\24\f\24\16\24"+
		"\u022b\13\24\3\24\3\24\3\24\3\24\7\24\u0231\n\24\f\24\16\24\u0234\13\24"+
		"\3\24\5\24\u0237\n\24\3\24\7\24\u023a\n\24\f\24\16\24\u023d\13\24\3\24"+
		"\7\24\u0240\n\24\f\24\16\24\u0243\13\24\3\24\3\24\3\24\7\24\u0248\n\24"+
		"\f\24\16\24\u024b\13\24\3\24\5\24\u024e\n\24\3\24\7\24\u0251\n\24\f\24"+
		"\16\24\u0254\13\24\3\24\7\24\u0257\n\24\f\24\16\24\u025a\13\24\3\24\3"+
		"\24\7\24\u025e\n\24\f\24\16\24\u0261\13\24\3\24\5\24\u0264\n\24\3\24\7"+
		"\24\u0267\n\24\f\24\16\24\u026a\13\24\3\24\7\24\u026d\n\24\f\24\16\24"+
		"\u0270\13\24\3\24\3\24\5\24\u0274\n\24\3\25\3\25\3\25\3\25\5\25\u027a"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0282\n\26\3\27\3\27\5\27\u0286"+
		"\n\27\3\27\3\27\5\27\u028a\n\27\3\27\5\27\u028d\n\27\3\27\3\27\5\27\u0291"+
		"\n\27\3\27\3\27\5\27\u0295\n\27\3\27\5\27\u0298\n\27\3\27\3\27\5\27\u029c"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u02a2\n\30\3\30\3\30\5\30\u02a6\n\30\3"+
		"\30\7\30\u02a9\n\30\f\30\16\30\u02ac\13\30\3\31\3\31\5\31\u02b0\n\31\3"+
		"\31\3\31\5\31\u02b4\n\31\3\31\3\31\3\31\3\31\5\31\u02ba\n\31\3\31\3\31"+
		"\5\31\u02be\n\31\3\31\3\31\3\31\5\31\u02c3\n\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u02ce\n\33\3\33\3\33\5\33\u02d2\n\33\3\33"+
		"\3\33\5\33\u02d6\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u02e3\n\34\3\34\3\34\5\34\u02e7\n\34\3\34\3\34\5\34\u02eb\n"+
		"\34\3\35\5\35\u02ee\n\35\3\35\3\35\5\35\u02f2\n\35\3\35\3\35\5\35\u02f6"+
		"\n\35\3\35\3\35\5\35\u02fa\n\35\3\35\3\35\3\35\3\35\5\35\u0300\n\35\3"+
		"\35\3\35\5\35\u0304\n\35\3\35\3\35\5\35\u0308\n\35\3\35\5\35\u030b\n\35"+
		"\3\35\3\35\5\35\u030f\n\35\3\35\3\35\5\35\u0313\n\35\3\35\3\35\5\35\u0317"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u031f\n\36\3\36\3\36\5\36\u0323"+
		"\n\36\3\36\5\36\u0326\n\36\3\36\3\36\3\36\5\36\u032b\n\36\3\36\3\36\5"+
		"\36\u032f\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\5!\u033b\n!\3!\3!\5"+
		"!\u033f\n!\3!\3!\5!\u0343\n!\7!\u0345\n!\f!\16!\u0348\13!\3!\3!\3!\6!"+
		"\u034d\n!\r!\16!\u034e\3!\3!\3!\3!\5!\u0355\n!\3!\3!\5!\u0359\n!\3!\3"+
		"!\5!\u035d\n!\7!\u035f\n!\f!\16!\u0362\13!\3!\6!\u0365\n!\r!\16!\u0366"+
		"\3!\3!\5!\u036b\n!\3\"\3\"\3\"\3\"\5\"\u0371\n\"\3#\3#\3#\3#\3#\3#\3#"+
		"\5#\u037a\n#\3#\3#\5#\u037e\n#\3#\3#\5#\u0382\n#\3$\3$\5$\u0386\n$\3$"+
		"\3$\5$\u038a\n$\3$\3$\3$\3$\5$\u0390\n$\3$\5$\u0393\n$\3$\3$\3$\3$\5$"+
		"\u0399\n$\3$\5$\u039c\n$\3$\5$\u039f\n$\3$\3$\3$\5$\u03a4\n$\3%\3%\3%"+
		"\5%\u03a9\n%\3%\7%\u03ac\n%\f%\16%\u03af\13%\3%\3%\5%\u03b3\n%\3&\3&\3"+
		"&\3&\6&\u03b9\n&\r&\16&\u03ba\3\'\3\'\3\'\3\'\5\'\u03c1\n\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\7)\u03ce\n)\f)\16)\u03d1\13)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\5)\u03dc\n)\3*\3*\3*\3*\3*\5*\u03e3\n*\3+\3+\5+\u03e7\n+\3+"+
		"\3+\3,\3,\5,\u03ed\n,\3-\3-\5-\u03f1\n-\3-\3-\5-\u03f5\n-\3-\3-\3-\3-"+
		"\5-\u03fb\n-\3-\3-\5-\u03ff\n-\3-\3-\3-\3-\5-\u0405\n-\3-\3-\5-\u0409"+
		"\n-\3-\6-\u040c\n-\r-\16-\u040d\3-\3-\3-\3-\5-\u0414\n-\3-\3-\3-\3-\3"+
		"-\3-\5-\u041c\n-\6-\u041e\n-\r-\16-\u041f\3-\5-\u0423\n-\3-\3-\3-\5-\u0428"+
		"\n-\3.\3.\5.\u042c\n.\3.\3.\3.\3.\5.\u0432\n.\3.\3.\3.\3.\5.\u0438\n."+
		"\6.\u043a\n.\r.\16.\u043b\3.\3.\3.\3.\7.\u0442\n.\f.\16.\u0445\13.\3."+
		"\6.\u0448\n.\r.\16.\u0449\3.\5.\u044d\n.\3.\3.\3.\3.\5.\u0453\n.\3/\3"+
		"/\5/\u0457\n/\3/\3/\3/\3/\5/\u045d\n/\3/\3/\3/\3/\5/\u0463\n/\6/\u0465"+
		"\n/\r/\16/\u0466\3/\3/\3/\3/\7/\u046d\n/\f/\16/\u0470\13/\3/\6/\u0473"+
		"\n/\r/\16/\u0474\3/\5/\u0478\n/\3/\3/\3/\3/\5/\u047e\n/\3\60\3\60\3\60"+
		"\5\60\u0483\n\60\3\61\3\61\3\61\3\61\5\61\u0489\n\61\3\61\3\61\5\61\u048d"+
		"\n\61\3\61\3\61\5\61\u0491\n\61\3\61\3\61\5\61\u0495\n\61\3\61\3\61\5"+
		"\61\u0499\n\61\3\61\3\61\5\61\u049d\n\61\3\61\3\61\3\61\3\61\5\61\u04a3"+
		"\n\61\3\61\3\61\6\61\u04a7\n\61\r\61\16\61\u04a8\3\61\5\61\u04ac\n\61"+
		"\3\61\3\61\3\61\7\61\u04b1\n\61\f\61\16\61\u04b4\13\61\3\62\3\62\5\62"+
		"\u04b8\n\62\3\62\3\62\5\62\u04bc\n\62\3\62\3\62\5\62\u04c0\n\62\3\62\3"+
		"\62\5\62\u04c4\n\62\3\62\3\62\5\62\u04c8\n\62\3\62\3\62\5\62\u04cc\n\62"+
		"\3\62\3\62\5\62\u04d0\n\62\3\63\3\63\3\63\5\63\u04d5\n\63\3\64\3\64\5"+
		"\64\u04d9\n\64\3\64\3\64\5\64\u04dd\n\64\7\64\u04df\n\64\f\64\16\64\u04e2"+
		"\13\64\3\64\3\64\7\64\u04e6\n\64\f\64\16\64\u04e9\13\64\5\64\u04eb\n\64"+
		"\3\65\3\65\3\65\3\66\5\66\u04f1\n\66\3\66\3\66\5\66\u04f5\n\66\3\66\5"+
		"\66\u04f8\n\66\3\66\5\66\u04fb\n\66\3\66\5\66\u04fe\n\66\3\66\5\66\u0501"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0509\n\67\3\67\3\67\5\67\u050d"+
		"\n\67\3\67\3\67\3\67\5\67\u0512\n\67\38\38\78\u0516\n8\f8\168\u0519\13"+
		"8\38\68\u051c\n8\r8\168\u051d\38\78\u0521\n8\f8\168\u0524\138\38\38\3"+
		"8\58\u0529\n8\38\78\u052c\n8\f8\168\u052f\138\38\68\u0532\n8\r8\168\u0533"+
		"\38\78\u0537\n8\f8\168\u053a\138\38\58\u053d\n8\38\38\58\u0541\n8\39\3"+
		"9\39\3:\3:\3:\3;\3;\5;\u054b\n;\3;\3;\5;\u054f\n;\3;\3;\3<\3<\5<\u0555"+
		"\n<\3=\3=\5=\u0559\n=\3=\3=\5=\u055d\n=\3=\3=\7=\u0561\n=\f=\16=\u0564"+
		"\13=\3=\6=\u0567\n=\r=\16=\u0568\3=\7=\u056c\n=\f=\16=\u056f\13=\3=\3"+
		"=\3=\3=\5=\u0575\n=\3=\3=\5=\u0579\n=\3=\3=\7=\u057d\n=\f=\16=\u0580\13"+
		"=\3=\6=\u0583\n=\r=\16=\u0584\3=\7=\u0588\n=\f=\16=\u058b\13=\3=\3=\3"+
		"=\3=\5=\u0591\n=\3=\3=\5=\u0595\n=\3=\7=\u0598\n=\f=\16=\u059b\13=\3="+
		"\6=\u059e\n=\r=\16=\u059f\3=\7=\u05a3\n=\f=\16=\u05a6\13=\3=\3=\3=\5="+
		"\u05ab\n=\3>\3>\3>\5>\u05b0\n>\3>\3>\5>\u05b4\n>\3>\3>\5>\u05b8\n>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\5>\u05c2\n>\3?\3?\3?\5?\u05c7\n?\3@\3@\5@\u05cb"+
		"\n@\3@\3@\5@\u05cf\n@\3@\3@\3A\3A\5A\u05d5\nA\3A\3A\5A\u05d9\nA\3A\3A"+
		"\3B\3B\3B\5B\u05e0\nB\3B\3B\3B\3B\3B\5B\u05e7\nB\3B\3B\3B\5B\u05ec\nB"+
		"\3B\3B\3B\5B\u05f1\nB\3C\3C\5C\u05f5\nC\3C\3C\5C\u05f9\nC\3C\7C\u05fc"+
		"\nC\fC\16C\u05ff\13C\3D\3D\3D\3D\3D\5D\u0606\nD\3E\3E\3E\5E\u060b\nE\3"+
		"F\3F\3F\5F\u0610\nF\3F\3F\5F\u0614\nF\3F\3F\7F\u0618\nF\fF\16F\u061b\13"+
		"F\3F\6F\u061e\nF\rF\16F\u061f\3F\7F\u0623\nF\fF\16F\u0626\13F\3F\3F\7"+
		"F\u062a\nF\fF\16F\u062d\13F\3G\3G\3G\5G\u0632\nG\3G\3G\3G\3G\5G\u0638"+
		"\nG\3G\5G\u063b\nG\3G\3G\3G\5G\u0640\nG\3G\3G\3G\5G\u0645\nG\3G\6G\u0648"+
		"\nG\rG\16G\u0649\3G\5G\u064d\nG\3G\3G\5G\u0651\nG\3H\3H\3H\3H\3H\3H\3"+
		"I\3I\3I\3I\3I\5I\u065e\nI\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\7K\u066a\nK\f"+
		"K\16K\u066d\13K\3K\6K\u0670\nK\rK\16K\u0671\3K\7K\u0675\nK\fK\16K\u0678"+
		"\13K\3K\3K\3L\3L\3L\3M\3M\3M\3M\7M\u0683\nM\fM\16M\u0686\13M\3M\3M\5M"+
		"\u068a\nM\3M\5M\u068d\nM\3M\7M\u0690\nM\fM\16M\u0693\13M\3M\5M\u0696\n"+
		"M\3N\3N\7N\u069a\nN\fN\16N\u069d\13N\3N\6N\u06a0\nN\rN\16N\u06a1\3N\7"+
		"N\u06a5\nN\fN\16N\u06a8\13N\3N\3N\3O\3O\5O\u06ae\nO\3P\3P\5P\u06b2\nP"+
		"\3P\2\3`Q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\17\3\2"+
		"\26\31\5\2\4\4\63\63\65\66\3\2&(\3\2$%\3\2)*\3\2 #\3\2\5\f\3\2\r\20\3"+
		"\2\21\25\3\2+\64\3\2\32\37\4\288::\3\2\22\24\2\u07be\2\u00a9\3\2\2\2\4"+
		"\u00c1\3\2\2\2\6\u00c3\3\2\2\2\b\u00e7\3\2\2\2\n\u00ec\3\2\2\2\f\u010a"+
		"\3\2\2\2\16\u010c\3\2\2\2\20\u010e\3\2\2\2\22\u0112\3\2\2\2\24\u0114\3"+
		"\2\2\2\26\u0116\3\2\2\2\30\u011a\3\2\2\2\32\u0124\3\2\2\2\34\u0126\3\2"+
		"\2\2\36\u0128\3\2\2\2 \u012a\3\2\2\2\"\u012c\3\2\2\2$\u012e\3\2\2\2&\u0273"+
		"\3\2\2\2(\u0279\3\2\2\2*\u0281\3\2\2\2,\u029b\3\2\2\2.\u029d\3\2\2\2\60"+
		"\u02c2\3\2\2\2\62\u02c4\3\2\2\2\64\u02d5\3\2\2\2\66\u02ea\3\2\2\28\u0316"+
		"\3\2\2\2:\u032e\3\2\2\2<\u0330\3\2\2\2>\u0333\3\2\2\2@\u036a\3\2\2\2B"+
		"\u0370\3\2\2\2D\u0381\3\2\2\2F\u03a3\3\2\2\2H\u03b2\3\2\2\2J\u03b8\3\2"+
		"\2\2L\u03c0\3\2\2\2N\u03c2\3\2\2\2P\u03db\3\2\2\2R\u03e2\3\2\2\2T\u03e4"+
		"\3\2\2\2V\u03ec\3\2\2\2X\u0427\3\2\2\2Z\u0452\3\2\2\2\\\u047d\3\2\2\2"+
		"^\u0482\3\2\2\2`\u0494\3\2\2\2b\u04cf\3\2\2\2d\u04d4\3\2\2\2f\u04d6\3"+
		"\2\2\2h\u04ec\3\2\2\2j\u0500\3\2\2\2l\u0511\3\2\2\2n\u0540\3\2\2\2p\u0542"+
		"\3\2\2\2r\u0545\3\2\2\2t\u0548\3\2\2\2v\u0554\3\2\2\2x\u05aa\3\2\2\2z"+
		"\u05c1\3\2\2\2|\u05c6\3\2\2\2~\u05c8\3\2\2\2\u0080\u05d2\3\2\2\2\u0082"+
		"\u05f0\3\2\2\2\u0084\u05f2\3\2\2\2\u0086\u0605\3\2\2\2\u0088\u060a\3\2"+
		"\2\2\u008a\u060c\3\2\2\2\u008c\u0650\3\2\2\2\u008e\u0652\3\2\2\2\u0090"+
		"\u0658\3\2\2\2\u0092\u0662\3\2\2\2\u0094\u0667\3\2\2\2\u0096\u067b\3\2"+
		"\2\2\u0098\u0695\3\2\2\2\u009a\u0697\3\2\2\2\u009c\u06ad\3\2\2\2\u009e"+
		"\u06b1\3\2\2\2\u00a0\u00a4\5\u0088E\2\u00a1\u00a3\7:\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00ae\7:\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b6\5\u0096L\2\u00b3\u00b5\78\2\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00bc\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7:\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\2\2\3\u00c0\3\3\2\2\2"+
		"\u00c1\u00c2\t\2\2\2\u00c2\5\3\2\2\2\u00c3\u00c8\7\3\2\2\u00c4\u00c9\7"+
		"\67\2\2\u00c5\u00c9\5\32\16\2\u00c6\u00c9\5\n\6\2\u00c7\u00c9\7:\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7\3\2\2\u00cd\7\3\2\2\2\u00ce\u00d0\7%\2\2"+
		"\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00d3"+
		"\7\67\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\60\2\2\u00d7\u00d9"+
		"\7\67\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\7\4\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e8\3\2\2\2\u00df\u00e1\7%\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\7\67"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00cf\3\2\2\2\u00e7\u00e0\3\2"+
		"\2\2\u00e8\t\3\2\2\2\u00e9\u00eb\5\f\7\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4"+
		"\u00f6\7\67\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fc\5\f\7\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0103\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0102\5\n\6\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\13\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010b"+
		"\5\34\17\2\u0107\u010b\5\36\20\2\u0108\u010b\5 \21\2\u0109\u010b\5\4\3"+
		"\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\r\3\2\2\2\u010c\u010d\t\4\2\2\u010d\17\3\2\2\2\u010e\u010f"+
		"\t\5\2\2\u010f\21\3\2\2\2\u0110\u0113\5\16\b\2\u0111\u0113\5\20\t\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\23\3\2\2\2\u0114\u0115\t\6\2"+
		"\2\u0115\25\3\2\2\2\u0116\u0117\t\7\2\2\u0117\27\3\2\2\2\u0118\u011b\5"+
		"\24\13\2\u0119\u011b\5\26\f\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2"+
		"\u011b\31\3\2\2\2\u011c\u0125\5\34\17\2\u011d\u0125\5\36\20\2\u011e\u0125"+
		"\5 \21\2\u011f\u0125\5\"\22\2\u0120\u0125\5$\23\2\u0121\u0125\5\30\r\2"+
		"\u0122\u0125\5\22\n\2\u0123\u0125\5\4\3\2\u0124\u011c\3\2\2\2\u0124\u011d"+
		"\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124"+
		"\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\33\3\2\2"+
		"\2\u0126\u0127\t\b\2\2\u0127\35\3\2\2\2\u0128\u0129\t\t\2\2\u0129\37\3"+
		"\2\2\2\u012a\u012b\t\n\2\2\u012b!\3\2\2\2\u012c\u012d\t\13\2\2\u012d#"+
		"\3\2\2\2\u012e\u012f\t\f\2\2\u012f%\3\2\2\2\u0130\u0134\5f\64\2\u0131"+
		"\u0133\7:\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0139\79\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d\3\2"+
		"\2\2\u013a\u013c\7:\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0142\78\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0274\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0146\u014a\5v<\2\u0147\u0149\7:\2\2\u0148\u0147\3\2\2\2\u0149\u014c"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014f\79\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0153\3\2\2\2\u0150\u0152\7:\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0159\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u0158\78\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0274\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015c\u015d\5> \2\u015d\u0161\7\61\2\2\u015e"+
		"\u0160\7:\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0166\79\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016a\3\2"+
		"\2\2\u0167\u0169\7:\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0170\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u016f\78\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0274\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0177\5> \2\u0174\u0176\7:\2\2\u0175\u0174\3\2\2\2\u0176\u0179"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017c\79\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u0180\3\2\2\2\u017d\u017f\7:\2\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0186\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0185\78\2\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u018a\b\24\1\2\u018a\u0274\3\2\2\2\u018b"+
		"\u018c\5D#\2\u018c\u0190\7\61\2\2\u018d\u018f\7:\2\2\u018e\u018d\3\2\2"+
		"\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0195\79\2\2\u0194\u0193\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0199\3\2\2\2\u0196\u0198\7:\2\2\u0197\u0196\3\2"+
		"\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019f\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\78\2\2\u019d\u019c\3\2"+
		"\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u0274\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a6\5D#\2\u01a3\u01a5\7:\2"+
		"\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\79\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01af\3\2\2\2\u01ac\u01ae\7:"+
		"\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b5\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\78"+
		"\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\b\24"+
		"\1\2\u01b9\u0274\3\2\2\2\u01ba\u01bb\5P)\2\u01bb\u01bf\7\61\2\2\u01bc"+
		"\u01be\7:\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c4\79\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c8\3\2"+
		"\2\2\u01c5\u01c7\7:\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ce\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01cb\u01cd\78\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u0274\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d1\u01d5\5P)\2\u01d2\u01d4\7:\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7"+
		"\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01da\79\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01de\3\2\2\2\u01db\u01dd\7:\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e4\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\78\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\b\24\1\2\u01e8\u0274\3\2\2\2\u01e9"+
		"\u01ed\5N(\2\u01ea\u01ec\7:\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2"+
		"\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed"+
		"\3\2\2\2\u01f0\u01f2\79\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f6\3\2\2\2\u01f3\u01f5\7:\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2"+
		"\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fc\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f9\u01fb\78\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0274\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0200\5(\25\2\u0200\u0204\7\61\2\2\u0201\u0203\7"+
		":\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\79"+
		"\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020d\3\2\2\2\u020a"+
		"\u020c\7:\2\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u0213\3\2\2\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0212\78\2\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214\u0274\3\2\2\2\u0215\u0213\3\2\2\2\u0216"+
		"\u021a\5(\25\2\u0217\u0219\7:\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021e\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u021f\79\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0223\3\2\2\2\u0220\u0222\7:\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0229\3\2"+
		"\2\2\u0225\u0223\3\2\2\2\u0226\u0228\78\2\2\u0227\u0226\3\2\2\2\u0228"+
		"\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u0229\3\2\2\2\u022c\u022d\b\24\1\2\u022d\u0274\3\2\2\2\u022e"+
		"\u0232\5\u0094K\2\u022f\u0231\7:\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3"+
		"\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0235\u0237\79\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u023b\3\2\2\2\u0238\u023a\7:\2\2\u0239\u0238\3\2\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0241\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023e\u0240\78\2\2\u023f\u023e\3\2\2\2\u0240"+
		"\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0274\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0244\u0245\5\u0082B\2\u0245\u0249\7\61\2\2\u0246"+
		"\u0248\7:\2\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024e\79\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0252\3\2"+
		"\2\2\u024f\u0251\7:\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0258\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0255\u0257\78\2\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0274\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025b\u025f\5\u0082B\2\u025c\u025e\7:\2\2\u025d\u025c\3\2\2\2\u025e"+
		"\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0263\3\2"+
		"\2\2\u0261\u025f\3\2\2\2\u0262\u0264\79\2\2\u0263\u0262\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0268\3\2\2\2\u0265\u0267\7:\2\2\u0266\u0265\3\2"+
		"\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026e\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\78\2\2\u026c\u026b\3\2"+
		"\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0271\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\b\24\1\2\u0272\u0274\3"+
		"\2\2\2\u0273\u0130\3\2\2\2\u0273\u0146\3\2\2\2\u0273\u015c\3\2\2\2\u0273"+
		"\u0173\3\2\2\2\u0273\u018b\3\2\2\2\u0273\u01a2\3\2\2\2\u0273\u01ba\3\2"+
		"\2\2\u0273\u01d1\3\2\2\2\u0273\u01e9\3\2\2\2\u0273\u01ff\3\2\2\2\u0273"+
		"\u0216\3\2\2\2\u0273\u022e\3\2\2\2\u0273\u0244\3\2\2\2\u0273\u025b\3\2"+
		"\2\2\u0274\'\3\2\2\2\u0275\u027a\5.\30\2\u0276\u027a\5\60\31\2\u0277\u027a"+
		"\5:\36\2\u0278\u027a\5<\37\2\u0279\u0275\3\2\2\2\u0279\u0276\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027a)\3\2\2\2\u027b\u0282\5\6\4\2"+
		"\u027c\u0282\5\b\5\2\u027d\u0282\5\n\6\2\u027e\u0282\5T+\2\u027f\u0282"+
		"\5`\61\2\u0280\u0282\5\u0082B\2\u0281\u027b\3\2\2\2\u0281\u027c\3\2\2"+
		"\2\u0281\u027d\3\2\2\2\u0281\u027e\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0280"+
		"\3\2\2\2\u0282+\3\2\2\2\u0283\u028c\5\n\6\2\u0284\u0286\7:\2\2\u0285\u0284"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\7,\2\2\u0288"+
		"\u028a\7:\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2"+
		"\2\2\u028b\u028d\5*\26\2\u028c\u0285\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u029c\3\2\2\2\u028e\u0297\5\n\6\2\u028f\u0291\7:\2\2\u0290\u028f\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\7-\2\2\u0293"+
		"\u0295\7:\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2"+
		"\2\2\u0296\u0298\5*\26\2\u0297\u0290\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\b\27\1\2\u029a\u029c\3\2\2\2\u029b\u0283\3"+
		"\2\2\2\u029b\u028e\3\2\2\2\u029c-\3\2\2\2\u029d\u029e\5\4\3\2\u029e\u029f"+
		"\7:\2\2\u029f\u02aa\5,\27\2\u02a0\u02a2\7:\2\2\u02a1\u02a0\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\7\62\2\2\u02a4\u02a6\7"+
		":\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a9\5,\27\2\u02a8\u02a1\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab/\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af"+
		"\5\n\6\2\u02ae\u02b0\7:\2\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b3\7,\2\2\u02b2\u02b4\7:\2\2\u02b3\u02b2\3\2\2"+
		"\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\5*\26\2\u02b6\u02c3"+
		"\3\2\2\2\u02b7\u02b9\5\n\6\2\u02b8\u02ba\7:\2\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\7-\2\2\u02bc\u02be\7:\2"+
		"\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0"+
		"\5*\26\2\u02c0\u02c1\b\31\1\2\u02c1\u02c3\3\2\2\2\u02c2\u02ad\3\2\2\2"+
		"\u02c2\u02b7\3\2\2\2\u02c3\61\3\2\2\2\u02c4\u02c5\5T+\2\u02c5\63\3\2\2"+
		"\2\u02c6\u02c7\5\n\6\2\u02c7\u02c8\7\36\2\2\u02c8\u02c9\5\62\32\2\u02c9"+
		"\u02ca\7\37\2\2\u02ca\u02d6\3\2\2\2\u02cb\u02cd\5\n\6\2\u02cc\u02ce\7"+
		"\36\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d1\5\62\32\2\u02d0\u02d2\7\37\2\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\b\33\1\2\u02d4\u02d6\3\2\2\2"+
		"\u02d5\u02c6\3\2\2\2\u02d5\u02cb\3\2\2\2\u02d6\65\3\2\2\2\u02d7\u02d8"+
		"\7\5\2\2\u02d8\u02d9\7:\2\2\u02d9\u02da\5\4\3\2\u02da\u02db\7\36\2\2\u02db"+
		"\u02dc\5\62\32\2\u02dc\u02dd\7\37\2\2\u02dd\u02eb\3\2\2\2\u02de\u02df"+
		"\7\5\2\2\u02df\u02e0\7:\2\2\u02e0\u02e2\5\4\3\2\u02e1\u02e3\7\36\2\2\u02e2"+
		"\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\5\62"+
		"\32\2\u02e5\u02e7\7\37\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\b\34\1\2\u02e9\u02eb\3\2\2\2\u02ea\u02d7\3"+
		"\2\2\2\u02ea\u02de\3\2\2\2\u02eb\67\3\2\2\2\u02ec\u02ee\7:\2\2\u02ed\u02ec"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\7,\2\2\u02f0"+
		"\u02f2\7:\2\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2"+
		"\2\2\u02f3\u0317\5\66\34\2\u02f4\u02f6\7:\2\2\u02f5\u02f4\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\7-\2\2\u02f8\u02fa\7:\2"+
		"\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc"+
		"\5\66\34\2\u02fc\u02fd\b\35\1\2\u02fd\u0317\3\2\2\2\u02fe\u0300\7:\2\2"+
		"\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303"+
		"\7,\2\2\u0302\u0304\7:\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0307\3\2\2\2\u0305\u0308\5\64\33\2\u0306\u0308\5*\26\2\u0307\u0305\3"+
		"\2\2\2\u0307\u0306\3\2\2\2\u0308\u0317\3\2\2\2\u0309\u030b\7:\2\2\u030a"+
		"\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\7-"+
		"\2\2\u030d\u030f\7:\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0312\3\2\2\2\u0310\u0313\5\64\33\2\u0311\u0313\5*\26\2\u0312\u0310\3"+
		"\2\2\2\u0312\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\b\35\1\2\u0315"+
		"\u0317\3\2\2\2\u0316\u02ed\3\2\2\2\u0316\u02f5\3\2\2\2\u0316\u02ff\3\2"+
		"\2\2\u0316\u030a\3\2\2\2\u03179\3\2\2\2\u0318\u0319\5\4\3\2\u0319\u031a"+
		"\7\36\2\2\u031a\u031b\7\37\2\2\u031b\u031c\7:\2\2\u031c\u031e\5\n\6\2"+
		"\u031d\u031f\58\35\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u032f"+
		"\3\2\2\2\u0320\u0322\5\4\3\2\u0321\u0323\7\36\2\2\u0322\u0321\3\2\2\2"+
		"\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0326\7\37\2\2\u0325\u0324"+
		"\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\7:\2\2\u0328"+
		"\u032a\5\n\6\2\u0329\u032b\58\35\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2"+
		"\2\2\u032b\u032c\3\2\2\2\u032c\u032d\b\36\1\2\u032d\u032f\3\2\2\2\u032e"+
		"\u0318\3\2\2\2\u032e\u0320\3\2\2\2\u032f;\3\2\2\2\u0330\u0331\5\64\33"+
		"\2\u0331\u0332\58\35\2\u0332=\3\2\2\2\u0333\u0334\7\b\2\2\u0334\u0335"+
		"\7\32\2\2\u0335\u0336\5@!\2\u0336\u0337\7\33\2\2\u0337?\3\2\2\2\u0338"+
		"\u0346\5B\"\2\u0339\u033b\7:\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2"+
		"\2\u033b\u033c\3\2\2\2\u033c\u033e\7$\2\2\u033d\u033f\7:\2\2\u033e\u033d"+
		"\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\5B\"\2\u0341"+
		"\u0343\7:\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2"+
		"\2\2\u0344\u033a\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u036b\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034c\5\n"+
		"\6\2\u034a\u034b\7:\2\2\u034b\u034d\5\n\6\2\u034c\u034a\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0351\b!\1\2\u0351\u036b\3\2\2\2\u0352\u0360\5B\"\2\u0353\u0355"+
		"\7:\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0358\7$\2\2\u0357\u0359\7:\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2"+
		"\2\u0359\u035a\3\2\2\2\u035a\u035c\5B\"\2\u035b\u035d\7:\2\2\u035c\u035b"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0354\3\2\2\2\u035f"+
		"\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0364\3\2"+
		"\2\2\u0362\u0360\3\2\2\2\u0363\u0365\7$\2\2\u0364\u0363\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u0369\b!\1\2\u0369\u036b\3\2\2\2\u036a\u0338\3\2\2\2\u036a"+
		"\u0349\3\2\2\2\u036a\u0352\3\2\2\2\u036bA\3\2\2\2\u036c\u0371\5\6\4\2"+
		"\u036d\u0371\5\n\6\2\u036e\u0371\5T+\2\u036f\u0371\5\u0082B\2\u0370\u036c"+
		"\3\2\2\2\u0370\u036d\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371"+
		"C\3\2\2\2\u0372\u0373\7\t\2\2\u0373\u0374\7\32\2\2\u0374\u0375\5F$\2\u0375"+
		"\u0376\7\33\2\2\u0376\u0382\3\2\2\2\u0377\u0379\7\t\2\2\u0378\u037a\7"+
		"\32\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037d\5F$\2\u037c\u037e\7\33\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u037f\3\2\2\2\u037f\u0380\b#\1\2\u0380\u0382\3\2\2\2\u0381"+
		"\u0372\3\2\2\2\u0381\u0377\3\2\2\2\u0382E\3\2\2\2\u0383\u0385\5H%\2\u0384"+
		"\u0386\7:\2\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2"+
		"\2\2\u0387\u0389\7\62\2\2\u0388\u038a\7:\2\2\u0389\u0388\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\5L\'\2\u038c\u03a4\3\2"+
		"\2\2\u038d\u038f\5H%\2\u038e\u0390\7:\2\2\u038f\u038e\3\2\2\2\u038f\u0390"+
		"\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u0393\7\62\2\2\u0392\u0391\3\2\2\2"+
		"\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\b$\1\2\u0395\u03a4"+
		"\3\2\2\2\u0396\u0398\5H%\2\u0397\u0399\7:\2\2\u0398\u0397\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u039c\7\62\2\2\u039b\u039a\3"+
		"\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039f\7:\2\2\u039e"+
		"\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\5L"+
		"\'\2\u03a1\u03a2\b$\1\2\u03a2\u03a4\3\2\2\2\u03a3\u0383\3\2\2\2\u03a3"+
		"\u038d\3\2\2\2\u03a3\u0396\3\2\2\2\u03a4G\3\2\2\2\u03a5\u03b3\5\6\4\2"+
		"\u03a6\u03a9\5T+\2\u03a7\u03a9\5J&\2\u03a8\u03a6\3\2\2\2\u03a8\u03a7\3"+
		"\2\2\2\u03a9\u03ad\3\2\2\2\u03aa\u03ac\7:\2\2\u03ab\u03aa\3\2\2\2\u03ac"+
		"\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\3\2"+
		"\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b1\b%\1\2\u03b1\u03b3\3\2\2\2\u03b2"+
		"\u03a5\3\2\2\2\u03b2\u03a8\3\2\2\2\u03b3I\3\2\2\2\u03b4\u03b9\7\67\2\2"+
		"\u03b5\u03b9\5\32\16\2\u03b6\u03b9\5\n\6\2\u03b7\u03b9\7:\2\2\u03b8\u03b4"+
		"\3\2\2\2\u03b8\u03b5\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b7\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bbK\3\2\2\2"+
		"\u03bc\u03c1\5\n\6\2\u03bd\u03be\5\6\4\2\u03be\u03bf\b\'\1\2\u03bf\u03c1"+
		"\3\2\2\2\u03c0\u03bc\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c1M\3\2\2\2\u03c2"+
		"\u03c3\7\6\2\2\u03c3\u03c4\7:\2\2\u03c4\u03c5\5(\25\2\u03c5O\3\2\2\2\u03c6"+
		"\u03c7\7\7\2\2\u03c7\u03c8\7:\2\2\u03c8\u03dc\5R*\2\u03c9\u03ca\7\7\2"+
		"\2\u03ca\u03cb\7:\2\2\u03cb\u03cf\5R*\2\u03cc\u03ce\7:\2\2\u03cd\u03cc"+
		"\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
		"\u03d2\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d3\7\32\2\2\u03d3\u03d4\7"+
		"\33\2\2\u03d4\u03d5\b)\1\2\u03d5\u03dc\3\2\2\2\u03d6\u03d7\7\7\2\2\u03d7"+
		"\u03d8\7:\2\2\u03d8\u03d9\5\4\3\2\u03d9\u03da\b)\1\2\u03da\u03dc\3\2\2"+
		"\2\u03db\u03c6\3\2\2\2\u03db\u03c9\3\2\2\2\u03db\u03d6\3\2\2\2\u03dcQ"+
		"\3\2\2\2\u03dd\u03e3\5\6\4\2\u03de\u03e3\5\b\5\2\u03df\u03e3\5\n\6\2\u03e0"+
		"\u03e3\5T+\2\u03e1\u03e3\5\u0082B\2\u03e2\u03dd\3\2\2\2\u03e2\u03de\3"+
		"\2\2\2\u03e2\u03df\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3"+
		"S\3\2\2\2\u03e4\u03e6\5X-\2\u03e5\u03e7\7:\2\2\u03e6\u03e5\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\5V,\2\u03e9U\3\2\2\2\u03ea"+
		"\u03ed\5Z.\2\u03eb\u03ed\5\\/\2\u03ec\u03ea\3\2\2\2\u03ec\u03eb\3\2\2"+
		"\2\u03edW\3\2\2\2\u03ee\u03f0\7\32\2\2\u03ef\u03f1\7:\2\2\u03f0\u03ef"+
		"\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\5T+\2\u03f3"+
		"\u03f5\7:\2\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2"+
		"\2\2\u03f6\u03f7\7\33\2\2\u03f7\u0428\3\2\2\2\u03f8\u03fa\7\32\2\2\u03f9"+
		"\u03fb\7:\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2"+
		"\2\2\u03fc\u03fe\5T+\2\u03fd\u03ff\7:\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\b-\1\2\u0401\u0428\3\2\2\2\u0402"+
		"\u0404\7\32\2\2\u0403\u0405\7:\2\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2"+
		"\2\2\u0405\u0406\3\2\2\2\u0406\u0408\5T+\2\u0407\u0409\7:\2\2\u0408\u0407"+
		"\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u040c\7\33\2\2"+
		"\u040b\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\b-\1\2\u0410\u0428\3\2\2\2\u0411"+
		"\u0413\5^\60\2\u0412\u0414\7:\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2"+
		"\2\2\u0414\u0415\3\2\2\2\u0415\u0416\5V,\2\u0416\u0428\3\2\2\2\u0417\u041d"+
		"\5^\60\2\u0418\u041b\7:\2\2\u0419\u041c\5^\60\2\u041a\u041c\5\6\4\2\u041b"+
		"\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041c\u041e\3\2\2\2\u041d\u0418\3\2"+
		"\2\2\u041e\u041f\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
		"\u0422\3\2\2\2\u0421\u0423\7:\2\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2"+
		"\2\2\u0423\u0424\3\2\2\2\u0424\u0425\5V,\2\u0425\u0426\b-\1\2\u0426\u0428"+
		"\3\2\2\2\u0427\u03ee\3\2\2\2\u0427\u03f8\3\2\2\2\u0427\u0402\3\2\2\2\u0427"+
		"\u0411\3\2\2\2\u0427\u0417\3\2\2\2\u0428Y\3\2\2\2\u0429\u042b\5\16\b\2"+
		"\u042a\u042c\7:\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d"+
		"\3\2\2\2\u042d\u042e\5T+\2\u042e\u0453\3\2\2\2\u042f\u0431\5\16\b\2\u0430"+
		"\u0432\7:\2\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2"+
		"\2\2\u0433\u0439\5T+\2\u0434\u0437\7:\2\2\u0435\u0438\5^\60\2\u0436\u0438"+
		"\5\6\4\2\u0437\u0435\3\2\2\2\u0437\u0436\3\2\2\2\u0438\u043a\3\2\2\2\u0439"+
		"\u0434\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2"+
		"\2\2\u043c\u043d\3\2\2\2\u043d\u043e\b.\1\2\u043e\u0453\3\2\2\2\u043f"+
		"\u0447\5\16\b\2\u0440\u0442\7:\2\2\u0441\u0440\3\2\2\2\u0442\u0445\3\2"+
		"\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0446\3\2\2\2\u0445"+
		"\u0443\3\2\2\2\u0446\u0448\5\22\n\2\u0447\u0443\3\2\2\2\u0448\u0449\3"+
		"\2\2\2\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b"+
		"\u044d\7:\2\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2"+
		"\2\2\u044e\u044f\5T+\2\u044f\u0450\b.\1\2\u0450\u0453\3\2\2\2\u0451\u0453"+
		"\3\2\2\2\u0452\u0429\3\2\2\2\u0452\u042f\3\2\2\2\u0452\u043f\3\2\2\2\u0452"+
		"\u0451\3\2\2\2\u0453[\3\2\2\2\u0454\u0456\5\20\t\2\u0455\u0457\7:\2\2"+
		"\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0459"+
		"\5T+\2\u0459\u047e\3\2\2\2\u045a\u045c\5\20\t\2\u045b\u045d\7:\2\2\u045c"+
		"\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0464\5T"+
		"+\2\u045f\u0462\7:\2\2\u0460\u0463\5^\60\2\u0461\u0463\5\6\4\2\u0462\u0460"+
		"\3\2\2\2\u0462\u0461\3\2\2\2\u0463\u0465\3\2\2\2\u0464\u045f\3\2\2\2\u0465"+
		"\u0466\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2"+
		"\2\2\u0468\u0469\b/\1\2\u0469\u047e\3\2\2\2\u046a\u0472\5\20\t\2\u046b"+
		"\u046d\7:\2\2\u046c\u046b\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2"+
		"\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470\u046e\3\2\2\2\u0471"+
		"\u0473\5\22\n\2\u0472\u046e\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0472\3"+
		"\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0478\7:\2\2\u0477"+
		"\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\5T"+
		"+\2\u047a\u047b\b/\1\2\u047b\u047e\3\2\2\2\u047c\u047e\3\2\2\2\u047d\u0454"+
		"\3\2\2\2\u047d\u045a\3\2\2\2\u047d\u046a\3\2\2\2\u047d\u047c\3\2\2\2\u047e"+
		"]\3\2\2\2\u047f\u0483\5\b\5\2\u0480\u0483\5\n\6\2\u0481\u0483\5\u0082"+
		"B\2\u0482\u047f\3\2\2\2\u0482\u0480\3\2\2\2\u0482\u0481\3\2\2\2\u0483"+
		"_\3\2\2\2\u0484\u0485\b\61\1\2\u0485\u0495\5d\63\2\u0486\u0495\5b\62\2"+
		"\u0487\u0489\7+\2\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a"+
		"\3\2\2\2\u048a\u048c\7\32\2\2\u048b\u048d\7:\2\2\u048c\u048b\3\2\2\2\u048c"+
		"\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\5`\61\2\u048f\u0491\7:"+
		"\2\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492"+
		"\u0493\7\33\2\2\u0493\u0495\3\2\2\2\u0494\u0484\3\2\2\2\u0494\u0486\3"+
		"\2\2\2\u0494\u0488\3\2\2\2\u0495\u04b2\3\2\2\2\u0496\u0498\f\5\2\2\u0497"+
		"\u0499\7:\2\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2"+
		"\2\2\u049a\u049c\5\30\r\2\u049b\u049d\7:\2\2\u049c\u049b\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\5`\61\6\u049f\u04b1\3\2"+
		"\2\2\u04a0\u04a2\f\4\2\2\u04a1\u04a3\7:\2\2\u04a2\u04a1\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a6\5\30\r\2\u04a5\u04a7\5"+
		"\30\r\2\u04a6\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8"+
		"\u04a9\3\2\2\2\u04a9\u04ab\3\2\2\2\u04aa\u04ac\7:\2\2\u04ab\u04aa\3\2"+
		"\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\5`\61\5\u04ae"+
		"\u04af\b\61\1\2\u04af\u04b1\3\2\2\2\u04b0\u0496\3\2\2\2\u04b0\u04a0\3"+
		"\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"a\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b5\u04b7\5\n\6\2\u04b6\u04b8\7:\2\2\u04b7"+
		"\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bb\7-"+
		"\2\2\u04ba\u04bc\7:\2\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc"+
		"\u04bf\3\2\2\2\u04bd\u04c0\5d\63\2\u04be\u04c0\5\6\4\2\u04bf\u04bd\3\2"+
		"\2\2\u04bf\u04be\3\2\2\2\u04c0\u04d0\3\2\2\2\u04c1\u04c3\5\n\6\2\u04c2"+
		"\u04c4\7:\2\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2"+
		"\2\2\u04c5\u04c7\7,\2\2\u04c6\u04c8\7:\2\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8"+
		"\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04cc\5d\63\2\u04ca\u04cc\5\6\4\2\u04cb"+
		"\u04c9\3\2\2\2\u04cb\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\b\62"+
		"\1\2\u04ce\u04d0\3\2\2\2\u04cf\u04b5\3\2\2\2\u04cf\u04c1\3\2\2\2\u04d0"+
		"c\3\2\2\2\u04d1\u04d5\5\n\6\2\u04d2\u04d5\5\b\5\2\u04d3\u04d5\5T+\2\u04d4"+
		"\u04d1\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4\u04d3\3\2\2\2\u04d5e\3\2\2\2"+
		"\u04d6\u04d8\5p9\2\u04d7\u04d9\t\r\2\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u04e0\3\2\2\2\u04da\u04dc\5r:\2\u04db\u04dd\t\r\2\2\u04dc"+
		"\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04da\3\2"+
		"\2\2\u04df\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"\u04ea\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e7\5t;\2\u04e4\u04e6\78\2"+
		"\2\u04e5\u04e4\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8"+
		"\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea\u04e3\3\2\2\2\u04ea"+
		"\u04eb\3\2\2\2\u04ebg\3\2\2\2\u04ec\u04ed\5l\67\2\u04ed\u04ee\5n8\2\u04ee"+
		"i\3\2\2\2\u04ef\u04f1\7:\2\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f4\7\20\2\2\u04f3\u04f5\7:\2\2\u04f4\u04f3\3\2"+
		"\2\2\u04f4\u04f5\3\2\2\2\u04f5\u0501\3\2\2\2\u04f6\u04f8\7:\2\2\u04f7"+
		"\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04fb\7\20"+
		"\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc"+
		"\u04fe\7:\2\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2"+
		"\2\2\u04ff\u0501\b\66\1\2\u0500\u04f0\3\2\2\2\u0500\u04f7\3\2\2\2\u0501"+
		"k\3\2\2\2\u0502\u0503\7\32\2\2\u0503\u0504\5`\61\2\u0504\u0505\7\33\2"+
		"\2\u0505\u0506\5j\66\2\u0506\u0512\3\2\2\2\u0507\u0509\7\32\2\2\u0508"+
		"\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\5`"+
		"\61\2\u050b\u050d\7\33\2\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u050e\3\2\2\2\u050e\u050f\5j\66\2\u050f\u0510\b\67\1\2\u0510\u0512\3"+
		"\2\2\2\u0511\u0502\3\2\2\2\u0511\u0508\3\2\2\2\u0512m\3\2\2\2\u0513\u0517"+
		"\7\34\2\2\u0514\u0516\7:\2\2\u0515\u0514\3\2\2\2\u0516\u0519\3\2\2\2\u0517"+
		"\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2"+
		"\2\2\u051a\u051c\5&\24\2\u051b\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0522\3\2\2\2\u051f\u0521\7:"+
		"\2\2\u0520\u051f\3\2\2\2\u0521\u0524\3\2\2\2\u0522\u0520\3\2\2\2\u0522"+
		"\u0523\3\2\2\2\u0523\u0525\3\2\2\2\u0524\u0522\3\2\2\2\u0525\u0526\7\35"+
		"\2\2\u0526\u0541\3\2\2\2\u0527\u0529\7\34\2\2\u0528\u0527\3\2\2\2\u0528"+
		"\u0529\3\2\2\2\u0529\u052d\3\2\2\2\u052a\u052c\7:\2\2\u052b\u052a\3\2"+
		"\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e"+
		"\u0531\3\2\2\2\u052f\u052d\3\2\2\2\u0530\u0532\5&\24\2\u0531\u0530\3\2"+
		"\2\2\u0532\u0533\3\2\2\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534"+
		"\u0538\3\2\2\2\u0535\u0537\7:\2\2\u0536\u0535\3\2\2\2\u0537\u053a\3\2"+
		"\2\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053c\3\2\2\2\u053a"+
		"\u0538\3\2\2\2\u053b\u053d\7\35\2\2\u053c\u053b\3\2\2\2\u053c\u053d\3"+
		"\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\b8\1\2\u053f\u0541\3\2\2\2\u0540"+
		"\u0513\3\2\2\2\u0540\u0528\3\2\2\2\u0541o\3\2\2\2\u0542\u0543\7\r\2\2"+
		"\u0543\u0544\5h\65\2\u0544q\3\2\2\2\u0545\u0546\7\17\2\2\u0546\u0547\5"+
		"h\65\2\u0547s\3\2\2\2\u0548\u054a\7\16\2\2\u0549\u054b\7:\2\2\u054a\u0549"+
		"\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054e\7\20\2\2"+
		"\u054d\u054f\7:\2\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550"+
		"\3\2\2\2\u0550\u0551\5n8\2\u0551u\3\2\2\2\u0552\u0555\5~@\2\u0553\u0555"+
		"\5\u0080A\2\u0554\u0552\3\2\2\2\u0554\u0553\3\2\2\2\u0555w\3\2\2\2\u0556"+
		"\u0558\t\16\2\2\u0557\u0559\7:\2\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055a\3\2\2\2\u055a\u055c\5T+\2\u055b\u055d\7:\2\2\u055c\u055b"+
		"\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0562\7\34\2\2"+
		"\u055f\u0561\7:\2\2\u0560\u055f\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560"+
		"\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0565"+
		"\u0567\5&\24\2\u0566\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0566\3\2"+
		"\2\2\u0568\u0569\3\2\2\2\u0569\u056d\3\2\2\2\u056a\u056c\7:\2\2\u056b"+
		"\u056a\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2"+
		"\2\2\u056e\u0570\3\2\2\2\u056f\u056d\3\2\2\2\u0570\u0571\7\35\2\2\u0571"+
		"\u05ab\3\2\2\2\u0572\u0574\t\16\2\2\u0573\u0575\7:\2\2\u0574\u0573\3\2"+
		"\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\5T+\2\u0577\u0579"+
		"\7:\2\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\3\2\2\2\u057a"+
		"\u057e\7\34\2\2\u057b\u057d\7:\2\2\u057c\u057b\3\2\2\2\u057d\u0580\3\2"+
		"\2\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0582\3\2\2\2\u0580"+
		"\u057e\3\2\2\2\u0581\u0583\5&\24\2\u0582\u0581\3\2\2\2\u0583\u0584\3\2"+
		"\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0589\3\2\2\2\u0586"+
		"\u0588\7:\2\2\u0587\u0586\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2"+
		"\2\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2\2\2\u058b\u0589\3\2\2\2\u058c"+
		"\u058d\b=\1\2\u058d\u05ab\3\2\2\2\u058e\u0590\t\16\2\2\u058f\u0591\7:"+
		"\2\2\u0590\u058f\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\3\2\2\2\u0592"+
		"\u0594\5T+\2\u0593\u0595\7:\2\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2"+
		"\2\u0595\u0599\3\2\2\2\u0596\u0598\7:\2\2\u0597\u0596\3\2\2\2\u0598\u059b"+
		"\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059d\3\2\2\2\u059b"+
		"\u0599\3\2\2\2\u059c\u059e\5&\24\2\u059d\u059c\3\2\2\2\u059e\u059f\3\2"+
		"\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a4\3\2\2\2\u05a1"+
		"\u05a3\7:\2\2\u05a2\u05a1\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2\3\2"+
		"\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7"+
		"\u05a8\7\35\2\2\u05a8\u05a9\b=\1\2\u05a9\u05ab\3\2\2\2\u05aa\u0556\3\2"+
		"\2\2\u05aa\u0572\3\2\2\2\u05aa\u058e\3\2\2\2\u05aby\3\2\2\2\u05ac\u05ad"+
		"\5\4\3\2\u05ad\u05ae\7:\2\2\u05ae\u05b0\3\2\2\2\u05af\u05ac\3\2\2\2\u05af"+
		"\u05b0\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\5\n\6\2\u05b2\u05b4\7:"+
		"\2\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
		"\u05b7\7,\2\2\u05b6\u05b8\7:\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2"+
		"\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\5|?\2\u05ba\u05c2\3\2\2\2\u05bb\u05bc"+
		"\5\4\3\2\u05bc\u05bd\7:\2\2\u05bd\u05be\5\n\6\2\u05be\u05bf\b>\1\2\u05bf"+
		"\u05c2\3\2\2\2\u05c0\u05c2\5T+\2\u05c1\u05af\3\2\2\2\u05c1\u05bb\3\2\2"+
		"\2\u05c1\u05c0\3\2\2\2\u05c2{\3\2\2\2\u05c3\u05c7\5\b\5\2\u05c4\u05c7"+
		"\5\n\6\2\u05c5\u05c7\5T+\2\u05c6\u05c3\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6"+
		"\u05c5\3\2\2\2\u05c7}\3\2\2\2\u05c8\u05ca\7\25\2\2\u05c9\u05cb\7:\2\2"+
		"\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce"+
		"\5T+\2\u05cd\u05cf\7:\2\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf"+
		"\u05d0\3\2\2\2\u05d0\u05d1\5x=\2\u05d1\177\3\2\2\2\u05d2\u05d4\7\21\2"+
		"\2\u05d3\u05d5\7:\2\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6"+
		"\3\2\2\2\u05d6\u05d8\5z>\2\u05d7\u05d9\7:\2\2\u05d8\u05d7\3\2\2\2\u05d8"+
		"\u05d9\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db\5x=\2\u05db\u0081\3\2\2"+
		"\2\u05dc\u05dd\5\n\6\2\u05dd\u05df\7\32\2\2\u05de\u05e0\5\u0084C\2\u05df"+
		"\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\7\33"+
		"\2\2\u05e2\u05f1\3\2\2\2\u05e3\u05e4\5\n\6\2\u05e4\u05e6\7\32\2\2\u05e5"+
		"\u05e7\5\u0084C\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05e9\7\33\2\2\u05e9\u05eb\7\32\2\2\u05ea\u05ec\5\u0084"+
		"C\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed"+
		"\u05ee\7\33\2\2\u05ee\u05ef\bB\1\2\u05ef\u05f1\3\2\2\2\u05f0\u05dc\3\2"+
		"\2\2\u05f0\u05e3\3\2\2\2\u05f1\u0083\3\2\2\2\u05f2\u05fd\5\u0086D\2\u05f3"+
		"\u05f5\7:\2\2\u05f4\u05f3\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f6\3\2"+
		"\2\2\u05f6\u05f8\7\62\2\2\u05f7\u05f9\7:\2\2\u05f8\u05f7\3\2\2\2\u05f8"+
		"\u05f9\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fc\5\u0086D\2\u05fb\u05f4"+
		"\3\2\2\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe"+
		"\u0085\3\2\2\2\u05ff\u05fd\3\2\2\2\u0600\u0606\5\u0082B\2\u0601\u0606"+
		"\5\n\6\2\u0602\u0606\5T+\2\u0603\u0606\5\6\4\2\u0604\u0606\5\b\5\2\u0605"+
		"\u0600\3\2\2\2\u0605\u0601\3\2\2\2\u0605\u0602\3\2\2\2\u0605\u0603\3\2"+
		"\2\2\u0605\u0604\3\2\2\2\u0606\u0087\3\2\2\2\u0607\u060b\5\u008eH\2\u0608"+
		"\u060b\5\u0090I\2\u0609\u060b\5\u0092J\2\u060a\u0607\3\2\2\2\u060a\u0608"+
		"\3\2\2\2\u060a\u0609\3\2\2\2\u060b\u0089\3\2\2\2\u060c\u060d\5\n\6\2\u060d"+
		"\u060f\7\32\2\2\u060e\u0610\5\u008cG\2\u060f\u060e\3\2\2\2\u060f\u0610"+
		"\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0613\7\33\2\2\u0612\u0614\7:\2\2\u0613"+
		"\u0612\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0619\7\34"+
		"\2\2\u0616\u0618\7:\2\2\u0617\u0616\3\2\2\2\u0618\u061b\3\2\2\2\u0619"+
		"\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061d\3\2\2\2\u061b\u0619\3\2"+
		"\2\2\u061c\u061e\5&\24\2\u061d\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f"+
		"\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0624\3\2\2\2\u0621\u0623\7:"+
		"\2\2\u0622\u0621\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622\3\2\2\2\u0624"+
		"\u0625\3\2\2\2\u0625\u0627\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u062b\7\35"+
		"\2\2\u0628\u062a\78\2\2\u0629\u0628\3\2\2\2\u062a\u062d\3\2\2\2\u062b"+
		"\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u008b\3\2\2\2\u062d\u062b\3\2"+
		"\2\2\u062e\u0631\5\4\3\2\u062f\u0630\7\36\2\2\u0630\u0632\7\37\2\2\u0631"+
		"\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634\7:"+
		"\2\2\u0634\u063a\5\n\6\2\u0635\u0637\7\62\2\2\u0636\u0638\7:\2\2\u0637"+
		"\u0636\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\5\u008c"+
		"G\2\u063a\u0635\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u0651\3\2\2\2\u063c"+
		"\u063f\5\4\3\2\u063d\u063e\7\36\2\2\u063e\u0640\7\37\2\2\u063f\u063d\3"+
		"\2\2\2\u063f\u0640\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\7:\2\2\u0642"+
		"\u064c\5\n\6\2\u0643\u0645\7\62\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3"+
		"\2\2\2\u0645\u0647\3\2\2\2\u0646\u0648\7:\2\2\u0647\u0646\3\2\2\2\u0648"+
		"\u0649\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064b\3\2"+
		"\2\2\u064b\u064d\5\u008cG\2\u064c\u0644\3\2\2\2\u064c\u064d\3\2\2\2\u064d"+
		"\u064e\3\2\2\2\u064e\u064f\bG\1\2\u064f\u0651\3\2\2\2\u0650\u062e\3\2"+
		"\2\2\u0650\u063c\3\2\2\2\u0651\u008d\3\2\2\2\u0652\u0653\7\13\2\2\u0653"+
		"\u0654\7:\2\2\u0654\u0655\7\n\2\2\u0655\u0656\7:\2\2\u0656\u0657\5\u008a"+
		"F\2\u0657\u008f\3\2\2\2\u0658\u0659\7\13\2\2\u0659\u065a\7:\2\2\u065a"+
		"\u065d\5\4\3\2\u065b\u065c\7\36\2\2\u065c\u065e\7\37\2\2\u065d\u065b\3"+
		"\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\7:\2\2\u0660"+
		"\u0661\5\u008aF\2\u0661\u0091\3\2\2\2\u0662\u0663\7\13\2\2\u0663\u0664"+
		"\7:\2\2\u0664\u0665\5\u008aF\2\u0665\u0666\bJ\1\2\u0666\u0093\3\2\2\2"+
		"\u0667\u066b\7\34\2\2\u0668\u066a\7:\2\2\u0669\u0668\3\2\2\2\u066a\u066d"+
		"\3\2\2\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066f\3\2\2\2\u066d"+
		"\u066b\3\2\2\2\u066e\u0670\5&\24\2\u066f\u066e\3\2\2\2\u0670\u0671\3\2"+
		"\2\2\u0671\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0676\3\2\2\2\u0673"+
		"\u0675\7:\2\2\u0674\u0673\3\2\2\2\u0675\u0678\3\2\2\2\u0676\u0674\3\2"+
		"\2\2\u0676\u0677\3\2\2\2\u0677\u0679\3\2\2\2\u0678\u0676\3\2\2\2\u0679"+
		"\u067a\7\35\2\2\u067a\u0095\3\2\2\2\u067b\u067c\5\u0098M\2\u067c\u067d"+
		"\5\u009aN\2\u067d\u0097\3\2\2\2\u067e\u067f\7\f\2\2\u067f\u0680\7\32\2"+
		"\2\u0680\u0684\7\33\2\2\u0681\u0683\7:\2\2\u0682\u0681\3\2\2\2\u0683\u0686"+
		"\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0696\3\2\2\2\u0686"+
		"\u0684\3\2\2\2\u0687\u0689\7\f\2\2\u0688\u068a\7\32\2\2\u0689\u0688\3"+
		"\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b\u068d\7\33\2\2\u068c"+
		"\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u0691\3\2\2\2\u068e\u0690\7:"+
		"\2\2\u068f\u068e\3\2\2\2\u0690\u0693\3\2\2\2\u0691\u068f\3\2\2\2\u0691"+
		"\u0692\3\2\2\2\u0692\u0694\3\2\2\2\u0693\u0691\3\2\2\2\u0694\u0696\bM"+
		"\1\2\u0695\u067e\3\2\2\2\u0695\u0687\3\2\2\2\u0696\u0099\3\2\2\2\u0697"+
		"\u069b\5\u009cO\2\u0698\u069a\7:\2\2\u0699\u0698\3\2\2\2\u069a\u069d\3"+
		"\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069f\3\2\2\2\u069d"+
		"\u069b\3\2\2\2\u069e\u06a0\5&\24\2\u069f\u069e\3\2\2\2\u06a0\u06a1\3\2"+
		"\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a6\3\2\2\2\u06a3"+
		"\u06a5\7:\2\2\u06a4\u06a3\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6\u06a4\3\2"+
		"\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a9\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a9"+
		"\u06aa\5\u009eP\2\u06aa\u009b\3\2\2\2\u06ab\u06ae\7\34\2\2\u06ac\u06ae"+
		"\bO\1\2\u06ad\u06ab\3\2\2\2\u06ad\u06ac\3\2\2\2\u06ae\u009d\3\2\2\2\u06af"+
		"\u06b2\7\35\2\2\u06b0\u06b2\bP\1\2\u06b1\u06af\3\2\2\2\u06b1\u06b0\3\2"+
		"\2\2\u06b2\u009f\3\2\2\2\u0123\u00a4\u00a9\u00af\u00b6\u00bc\u00c8\u00ca"+
		"\u00cf\u00d4\u00da\u00dd\u00e0\u00e5\u00e7\u00ec\u00f2\u00f7\u00fd\u0103"+
		"\u010a\u0112\u011a\u0124\u0134\u0138\u013d\u0143\u014a\u014e\u0153\u0159"+
		"\u0161\u0165\u016a\u0170\u0177\u017b\u0180\u0186\u0190\u0194\u0199\u019f"+
		"\u01a6\u01aa\u01af\u01b5\u01bf\u01c3\u01c8\u01ce\u01d5\u01d9\u01de\u01e4"+
		"\u01ed\u01f1\u01f6\u01fc\u0204\u0208\u020d\u0213\u021a\u021e\u0223\u0229"+
		"\u0232\u0236\u023b\u0241\u0249\u024d\u0252\u0258\u025f\u0263\u0268\u026e"+
		"\u0273\u0279\u0281\u0285\u0289\u028c\u0290\u0294\u0297\u029b\u02a1\u02a5"+
		"\u02aa\u02af\u02b3\u02b9\u02bd\u02c2\u02cd\u02d1\u02d5\u02e2\u02e6\u02ea"+
		"\u02ed\u02f1\u02f5\u02f9\u02ff\u0303\u0307\u030a\u030e\u0312\u0316\u031e"+
		"\u0322\u0325\u032a\u032e\u033a\u033e\u0342\u0346\u034e\u0354\u0358\u035c"+
		"\u0360\u0366\u036a\u0370\u0379\u037d\u0381\u0385\u0389\u038f\u0392\u0398"+
		"\u039b\u039e\u03a3\u03a8\u03ad\u03b2\u03b8\u03ba\u03c0\u03cf\u03db\u03e2"+
		"\u03e6\u03ec\u03f0\u03f4\u03fa\u03fe\u0404\u0408\u040d\u0413\u041b\u041f"+
		"\u0422\u0427\u042b\u0431\u0437\u043b\u0443\u0449\u044c\u0452\u0456\u045c"+
		"\u0462\u0466\u046e\u0474\u0477\u047d\u0482\u0488\u048c\u0490\u0494\u0498"+
		"\u049c\u04a2\u04a8\u04ab\u04b0\u04b2\u04b7\u04bb\u04bf\u04c3\u04c7\u04cb"+
		"\u04cf\u04d4\u04d8\u04dc\u04e0\u04e7\u04ea\u04f0\u04f4\u04f7\u04fa\u04fd"+
		"\u0500\u0508\u050c\u0511\u0517\u051d\u0522\u0528\u052d\u0533\u0538\u053c"+
		"\u0540\u054a\u054e\u0554\u0558\u055c\u0562\u0568\u056d\u0574\u0578\u057e"+
		"\u0584\u0589\u0590\u0594\u0599\u059f\u05a4\u05aa\u05af\u05b3\u05b7\u05c1"+
		"\u05c6\u05ca\u05ce\u05d4\u05d8\u05df\u05e6\u05eb\u05f0\u05f4\u05f8\u05fd"+
		"\u0605\u060a\u060f\u0613\u0619\u061f\u0624\u062b\u0631\u0637\u063a\u063f"+
		"\u0644\u0649\u064c\u0650\u065d\u066b\u0671\u0676\u0684\u0689\u068c\u0691"+
		"\u0695\u069b\u06a1\u06a6\u06ad\u06b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}