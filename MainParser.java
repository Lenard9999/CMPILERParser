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
		RULE_error_expression = 44, RULE_first_expression_operator = 45, RULE_second_expression_operator = 46, 
		RULE_value_expression = 47, RULE_comparison_statement = 48, RULE_assignment_statement = 49, 
		RULE_value_comparison = 50, RULE_conditional_statement = 51, RULE_conditional_comparison_structure = 52, 
		RULE_if_statement = 53, RULE_else_if_statement = 54, RULE_else_statement = 55, 
		RULE_loop_statement = 56, RULE_loop_structure = 57, RULE_loop_variable_declaration = 58, 
		RULE_loop_expression = 59, RULE_while_statement = 60, RULE_for_statement = 61, 
		RULE_function_calling = 62, RULE_function_parameters = 63, RULE_function_paremeters_value = 64, 
		RULE_function_declaration = 65, RULE_function_structure = 66, RULE_function_declaration_parameters = 67, 
		RULE_void_function = 68, RULE_non_void_function = 69, RULE_scoping_statement = 70, 
		RULE_main_function = 71, RULE_main_head = 72, RULE_main_body = 73, RULE_main_body_first = 74, 
		RULE_main_body_second = 75;
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
			"parenthesis_expression", "error_expression", "first_expression_operator", 
			"second_expression_operator", "value_expression", "comparison_statement", 
			"assignment_statement", "value_comparison", "conditional_statement", 
			"conditional_comparison_structure", "if_statement", "else_if_statement", 
			"else_statement", "loop_statement", "loop_structure", "loop_variable_declaration", 
			"loop_expression", "while_statement", "for_statement", "function_calling", 
			"function_parameters", "function_paremeters_value", "function_declaration", 
			"function_structure", "function_declaration_parameters", "void_function", 
			"non_void_function", "scoping_statement", "main_function", "main_head", 
			"main_body", "main_body_first", "main_body_second"
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
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(152);
				function_declaration();
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(153);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(164);
				match(WHITE_SPACE);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			main_function();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(171);
				match(NEWLINE);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(177);
				match(WHITE_SPACE);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
			setState(185);
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
			setState(187);
			match(T__0);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(188);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(189);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(190);
					label();
					}
					break;
				case 4:
					{
					setState(191);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(196);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(198);
					match(MINUS);
					}
				}

				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(201);
					match(DIGIT);
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				{
				setState(206);
				match(DOT);
				setState(208); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(207);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(210); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(212);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(215);
					match(MINUS);
					}
				}

				setState(219); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(218);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(221); 
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
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(225);
				label_words();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(231);
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
				setState(234); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					label_words();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					label();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public TerminalNode DIGIT() { return getToken(MainParser.DIGIT, 0); }
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
			setState(253);
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
				setState(248);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(249);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(250);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(251);
				variable_type();
				}
				break;
			case DIGIT:
				{
				setState(252);
				match(DIGIT);
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
			setState(255);
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
			setState(257);
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
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(259);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(260);
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
			setState(263);
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
			setState(265);
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
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(267);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(268);
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
			setState(279);
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
				setState(271);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(272);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(273);
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
				setState(274);
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
				setState(275);
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
				setState(276);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(277);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(278);
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
			setState(281);
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
			setState(283);
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
			setState(285);
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
			setState(287);
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
			setState(289);
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
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				conditional_statement();
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(292);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(298);
					match(LINECOMMENT);
					}
					break;
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(301);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						match(NEWLINE);
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				loop_statement();
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(320);
					match(LINECOMMENT);
					}
					break;
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(328);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(329);
						match(NEWLINE);
						}
						} 
					}
					setState(334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				print_statement();
				setState(336);
				match(SEMICOLON);
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(342);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(343);
					match(LINECOMMENT);
					}
					break;
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(351);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(352);
						match(NEWLINE);
						}
						} 
					}
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				print_statement();
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(365);
					match(LINECOMMENT);
					}
					break;
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(374);
						match(NEWLINE);
						}
						} 
					}
					setState(379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				scan_statement();
				setState(383);
				match(SEMICOLON);
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(384);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(389);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(390);
					match(LINECOMMENT);
					}
					break;
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(393);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(398);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(399);
						match(NEWLINE);
						}
						} 
					}
					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
				scan_statement();
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(406);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(411);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(412);
					match(LINECOMMENT);
					}
					break;
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(420);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(421);
						match(NEWLINE);
						}
						} 
					}
					setState(426);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(429);
				return_statement();
				setState(430);
				match(SEMICOLON);
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(431);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(437);
					match(LINECOMMENT);
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(440);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(446);
						match(NEWLINE);
						}
						} 
					}
					setState(451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(452);
				return_statement();
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(453);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(459);
					match(LINECOMMENT);
					}
					break;
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(462);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(468);
						match(NEWLINE);
						}
						} 
					}
					setState(473);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(476);
				constant_declaration();
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(477);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(483);
					match(LINECOMMENT);
					}
					break;
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(486);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(491);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(492);
						match(NEWLINE);
						}
						} 
					}
					setState(497);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(498);
				any_declaration();
				setState(499);
				match(SEMICOLON);
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(500);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(505);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(506);
					match(LINECOMMENT);
					}
					break;
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(509);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(515);
						match(NEWLINE);
						}
						} 
					}
					setState(520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(521);
				any_declaration();
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(522);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(527);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(528);
					match(LINECOMMENT);
					}
					break;
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(531);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(537);
						match(NEWLINE);
						}
						} 
					}
					setState(542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(545);
				scoping_statement();
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(546);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(552);
					match(LINECOMMENT);
					}
					break;
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(561);
						match(NEWLINE);
						}
						} 
					}
					setState(566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(567);
				function_calling();
				setState(568);
				match(SEMICOLON);
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(569);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(575);
					match(LINECOMMENT);
					}
					break;
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(578);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(584);
						match(NEWLINE);
						}
						} 
					}
					setState(589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(590);
				function_calling();
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(591);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(596);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(597);
					match(LINECOMMENT);
					}
					break;
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(605);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(606);
						match(NEWLINE);
						}
						} 
					}
					setState(611);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
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
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(622);
				string();
				}
				break;
			case 2:
				{
				setState(623);
				number();
				}
				break;
			case 3:
				{
				setState(624);
				label();
				}
				break;
			case 4:
				{
				setState(625);
				expression();
				}
				break;
			case 5:
				{
				setState(626);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(627);
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
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				label();
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(631);
						match(WHITE_SPACE);
						}
					}

					setState(634);
					match(ASSIGN);
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(635);
						match(WHITE_SPACE);
						}
					}

					setState(638);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				label();
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
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
					match(EQUAL);
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
			setState(656);
			variable_type();
			setState(657);
			match(WHITE_SPACE);
			setState(658);
			multiple_declaration();
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(659);
						match(WHITE_SPACE);
						}
					}

					setState(662);
					match(COMMA);
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(663);
						match(WHITE_SPACE);
						}
					}

					setState(666);
					multiple_declaration();
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				label();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(673);
					match(WHITE_SPACE);
					}
				}

				setState(676);
				match(ASSIGN);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(677);
					match(WHITE_SPACE);
					}
				}

				setState(680);
				assigned_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				label();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(683);
					match(WHITE_SPACE);
					}
				}

				setState(686);
				match(EQUAL);
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(687);
					match(WHITE_SPACE);
					}
				}

				setState(690);
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
			setState(695);
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
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				label();
				setState(698);
				match(OPEN_BRACE);
				setState(699);
				array_size();
				setState(700);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				label();
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(703);
					match(OPEN_BRACE);
					}
				}

				setState(706);
				array_size();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(707);
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
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(CREATE);
				setState(715);
				match(WHITE_SPACE);
				setState(716);
				variable_type();
				setState(717);
				match(OPEN_BRACE);
				setState(718);
				array_size();
				setState(719);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(CREATE);
				setState(722);
				match(WHITE_SPACE);
				setState(723);
				variable_type();
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(724);
					match(OPEN_BRACE);
					}
				}

				setState(727);
				array_size();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(728);
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
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(735);
					match(WHITE_SPACE);
					}
				}

				setState(738);
				match(ASSIGN);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(739);
					match(WHITE_SPACE);
					}
				}

				setState(742);
				array_assign_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(743);
					match(WHITE_SPACE);
					}
				}

				setState(746);
				match(EQUAL);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(747);
					match(WHITE_SPACE);
					}
				}

				setState(750);
				array_assign_body();
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(753);
					match(WHITE_SPACE);
					}
				}

				setState(756);
				match(ASSIGN);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(757);
					match(WHITE_SPACE);
					}
				}

				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(760);
					array_variable();
					}
					break;
				case 2:
					{
					setState(761);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				match(EQUAL);
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
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
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
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				variable_type();
				setState(780);
				match(OPEN_BRACE);
				setState(781);
				match(CLOSE_BRACE);
				setState(782);
				match(WHITE_SPACE);
				setState(783);
				label();
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(784);
					array_assign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				variable_type();
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(788);
					match(OPEN_BRACE);
					}
				}

				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(791);
					match(CLOSE_BRACE);
					}
				}

				setState(794);
				match(WHITE_SPACE);
				setState(795);
				label();
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(796);
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
			setState(803);
			array_variable();
			setState(804);
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
			setState(806);
			match(PRINT);
			setState(807);
			match(OPEN_PAREN);
			setState(808);
			value_print();
			setState(809);
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
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				extended_value_print();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==WHITE_SPACE) {
					{
					{
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(812);
						match(WHITE_SPACE);
						}
					}

					setState(815);
					match(PLUS);
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(816);
						match(WHITE_SPACE);
						}
					}

					setState(819);
					extended_value_print();
					setState(821);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(820);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				label();
				setState(831); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(829);
					match(WHITE_SPACE);
					setState(830);
					label();
					}
					}
					setState(833); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITE_SPACE );
				notifyErrorListeners("No double quotes");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				extended_value_print();
				setState(851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(839);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(838);
							match(WHITE_SPACE);
							}
						}

						setState(841);
						match(PLUS);
						setState(843);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(842);
							match(WHITE_SPACE);
							}
						}

						setState(845);
						extended_value_print();
						setState(847);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(846);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(853);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(855); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(854);
					match(PLUS);
					}
					}
					setState(857); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				notifyErrorListeners("additional ‘+’ sign at end of print");
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
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(865);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(866);
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
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(SCAN);
				setState(870);
				match(OPEN_PAREN);
				setState(871);
				scan_body();
				setState(872);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				match(SCAN);
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(875);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(878);
				scan_body();
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(879);
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
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				display_message_parameter();
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(887);
					match(WHITE_SPACE);
					}
				}

				setState(890);
				match(COMMA);
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(891);
					match(WHITE_SPACE);
					}
				}

				setState(894);
				value_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				display_message_parameter();
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(897);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(900);
					match(COMMA);
					}
				}

				notifyErrorListeners("Missing 2nd scan parameter");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(905);
				display_message_parameter();
				setState(907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(906);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(909);
					match(COMMA);
					}
				}

				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(912);
					match(WHITE_SPACE);
					}
				}

				setState(915);
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
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
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
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(921);
					expression();
					}
					break;
				case 2:
					{
					setState(922);
					scan_label();
					}
					break;
				}
				setState(928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(925);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(930);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
			setState(939); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(939);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						setState(935);
						match(DIGIT);
						}
						break;
					case 2:
						{
						setState(936);
						lexer_predefined_words();
						}
						break;
					case 3:
						{
						setState(937);
						label();
						}
						break;
					case 4:
						{
						setState(938);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(941); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(945);
				string();
				notifyErrorListeners("2nd parameter should not be string");
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
			setState(950);
			match(CONSTANT);
			setState(951);
			match(WHITE_SPACE);
			setState(952);
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
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(RETURN);
				setState(955);
				match(WHITE_SPACE);
				setState(956);
				return_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				match(RETURN);
				setState(958);
				match(WHITE_SPACE);
				setState(959);
				return_value();
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(960);
					match(WHITE_SPACE);
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				match(OPEN_PAREN);
				setState(967);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				match(RETURN);
				setState(971);
				match(WHITE_SPACE);
				setState(972);
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
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(977);
				string();
				}
				break;
			case 2:
				{
				setState(978);
				number();
				}
				break;
			case 3:
				{
				setState(979);
				label();
				}
				break;
			case 4:
				{
				setState(980);
				expression();
				}
				break;
			case 5:
				{
				setState(981);
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
			setState(984);
			parenthesis_expression();
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(985);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(988);
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
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				first_expression_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
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
		public List<TerminalNode> OPEN_PAREN() { return getTokens(MainParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(MainParser.OPEN_PAREN, i);
		}
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
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				match(OPEN_PAREN);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(995);
					match(WHITE_SPACE);
					}
				}

				setState(998);
				expression();
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(999);
					match(WHITE_SPACE);
					}
				}

				setState(1002);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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

				setState(1013); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1012);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1015); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("uneven parenthesis, duplicate ')'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1019);
						match(OPEN_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1022); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1024);
					match(WHITE_SPACE);
					}
				}

				setState(1027);
				expression();
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1028);
					match(WHITE_SPACE);
					}
				}

				setState(1031);
				match(CLOSE_PAREN);
				notifyErrorListeners("uneven parenthesis, duplicate '('");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1034);
				value_expression();
				setState(1036);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1035);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1038);
				operator_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1040);
				value_expression();
				setState(1046); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1041);
						match(WHITE_SPACE);
						setState(1044);
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
							setState(1042);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1043);
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
					setState(1048); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1050);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1053);
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

	public static class Error_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(MainParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(MainParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MainParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MainParser.CLOSE_PAREN, i);
		}
		public Error_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterError_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitError_expression(this);
		}
	}

	public final Error_expressionContext error_expression() throws RecognitionException {
		Error_expressionContext _localctx = new Error_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_error_expression);
		int _la;
		try {
			int _alt;
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1059);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1062);
					match(WHITE_SPACE);
					}
				}

				setState(1065);
				expression();
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1066);
					match(WHITE_SPACE);
					}
				}

				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1069);
					match(CLOSE_PAREN);
					}
				}

				notifyErrorListeners("uneven parenthesis, duplicate ')'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1074);
						match(OPEN_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1077); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1079);
					match(WHITE_SPACE);
					}
				}

				setState(1082);
				expression();
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1083);
					match(WHITE_SPACE);
					}
				}

				setState(1086);
				match(CLOSE_PAREN);
				notifyErrorListeners("uneven parenthesis, duplicate '('");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1089);
				match(OPEN_PAREN);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1090);
					match(WHITE_SPACE);
					}
				}

				setState(1093);
				expression();
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1094);
					match(WHITE_SPACE);
					}
				}

				setState(1098); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1097);
					match(CLOSE_PAREN);
					}
					}
					setState(1100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CLOSE_PAREN );
				notifyErrorListeners("uneven parenthesis, duplicate ')'");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1105); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1104);
						match(OPEN_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1107); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1109);
					match(WHITE_SPACE);
					}
				}

				setState(1112);
				expression();
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
				match(CLOSE_PAREN);
				notifyErrorListeners("uneven parenthesis, duplicate '('");
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
		enterRule(_localctx, 90, RULE_first_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1121);
				first_operators();
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1122);
					match(WHITE_SPACE);
					}
				}

				setState(1125);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				first_operators();
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
				expression();
				setState(1137); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1132);
						match(WHITE_SPACE);
						setState(1135);
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
							setState(1133);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1134);
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
					setState(1139); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				first_operators();
				setState(1151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1147);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1144);
							match(WHITE_SPACE);
							}
							}
							setState(1149);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1150);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1155);
					match(WHITE_SPACE);
					}
				}

				setState(1158);
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
		enterRule(_localctx, 92, RULE_second_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				second_operators();
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
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				second_operators();
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1171);
					match(WHITE_SPACE);
					}
				}

				setState(1174);
				expression();
				setState(1180); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1175);
						match(WHITE_SPACE);
						setState(1178);
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
							setState(1176);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1177);
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
					setState(1182); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1186);
				second_operators();
				setState(1194); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1190);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1187);
							match(WHITE_SPACE);
							}
							}
							setState(1192);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1193);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1196); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1198);
					match(WHITE_SPACE);
					}
				}

				setState(1201);
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
		enterRule(_localctx, 94, RULE_value_expression);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1207);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1209);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_comparison_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1213);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(1214);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1215);
					match(NOT);
					}
				}

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
				comparison_statement(0);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1223);
					match(WHITE_SPACE);
					}
				}

				setState(1226);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1230);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1232);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1231);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1234);
						other_operators();
						}
						setState(1236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1235);
							match(WHITE_SPACE);
							}
						}

						setState(1238);
						comparison_statement(4);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1242);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1241);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1244);
						other_operators();
						setState(1246); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1245);
							other_operators();
							}
							}
							setState(1248); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR))) != 0) );
						}
						setState(1251);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1250);
							match(WHITE_SPACE);
							}
						}

						setState(1253);
						comparison_statement(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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
		enterRule(_localctx, 98, RULE_assignment_statement);
		int _la;
		try {
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				label();
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1262);
					match(WHITE_SPACE);
					}
				}

				setState(1265);
				match(EQUAL);
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1266);
					match(WHITE_SPACE);
					}
				}

				setState(1271);
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
					setState(1269);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(1270);
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
				setState(1273);
				label();
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
				match(ASSIGN);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1278);
					match(WHITE_SPACE);
					}
				}

				setState(1283);
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
					setState(1281);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(1282);
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
		enterRule(_localctx, 100, RULE_value_comparison);
		try {
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1291);
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
		enterRule(_localctx, 102, RULE_conditional_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			if_statement();
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1295);
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
			setState(1304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1298);
					else_if_statement();
					setState(1300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						setState(1299);
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
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1307);
				else_statement();
				setState(1311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1308);
						match(NEWLINE);
						}
						} 
					}
					setState(1313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
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
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
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
		enterRule(_localctx, 104, RULE_conditional_comparison_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(OPEN_PAREN);
			setState(1317);
			comparison_statement(0);
			setState(1318);
			match(CLOSE_PAREN);
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1319);
				match(WHITE_SPACE);
				}
			}

			setState(1322);
			match(THEN);
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1323);
				match(WHITE_SPACE);
				}
			}

			setState(1326);
			match(OPEN_BRACKET);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1327);
				match(WHITE_SPACE);
				}
				}
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1333);
				statements();
				}
				}
				setState(1336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1338);
				match(WHITE_SPACE);
				}
				}
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1344);
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
		enterRule(_localctx, 106, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(IF);
			setState(1347);
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
		enterRule(_localctx, 108, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(ELSE_IF);
			setState(1350);
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
		enterRule(_localctx, 110, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(ELSE);
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1353);
				match(WHITE_SPACE);
				}
			}

			setState(1356);
			match(THEN);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1357);
				match(WHITE_SPACE);
				}
			}

			setState(1360);
			match(OPEN_BRACKET);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1361);
				match(WHITE_SPACE);
				}
				}
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1368); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1367);
				statements();
				}
				}
				setState(1370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1372);
				match(WHITE_SPACE);
				}
				}
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1378);
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
		enterRule(_localctx, 112, RULE_loop_statement);
		try {
			setState(1382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1380);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1381);
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
		enterRule(_localctx, 114, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1385);
					match(WHITE_SPACE);
					}
				}

				setState(1388);
				expression();
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1389);
					match(WHITE_SPACE);
					}
				}

				setState(1392);
				match(OPEN_BRACKET);
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1393);
					match(WHITE_SPACE);
					}
					}
					setState(1398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1399);
					statements();
					}
					}
					setState(1402); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1404);
					match(WHITE_SPACE);
					}
					}
					setState(1409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1410);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1413);
					match(WHITE_SPACE);
					}
				}

				setState(1416);
				expression();
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1417);
					match(WHITE_SPACE);
					}
				}

				setState(1420);
				match(OPEN_BRACKET);
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1421);
					match(WHITE_SPACE);
					}
					}
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1428); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1427);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1430); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1432);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				}
				notifyErrorListeners("Missing closing curly brackets");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1440);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1441);
					match(WHITE_SPACE);
					}
				}

				setState(1444);
				expression();
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1445);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1448);
					match(WHITE_SPACE);
					}
					}
					setState(1453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1454);
					statements();
					}
					}
					setState(1457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
				setState(1462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1459);
					match(WHITE_SPACE);
					}
					}
					setState(1464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1465);
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
		enterRule(_localctx, 116, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1470);
					variable_type();
					setState(1471);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1475);
				label();
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1476);
					match(WHITE_SPACE);
					}
				}

				setState(1479);
				match(ASSIGN);
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1480);
					match(WHITE_SPACE);
					}
				}

				setState(1483);
				loop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				variable_type();
				setState(1486);
				match(WHITE_SPACE);
				setState(1487);
				label();
				notifyErrorListeners("Missing assignment operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
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
		enterRule(_localctx, 118, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1493);
				number();
				}
				break;
			case 2:
				{
				setState(1494);
				label();
				}
				break;
			case 3:
				{
				setState(1495);
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
		enterRule(_localctx, 120, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(WHILE);
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1499);
				match(WHITE_SPACE);
				}
			}

			setState(1502);
			expression();
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1503);
				match(WHITE_SPACE);
				}
			}

			setState(1506);
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
		enterRule(_localctx, 122, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			match(FOR);
			setState(1510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1509);
				match(WHITE_SPACE);
				}
			}

			setState(1512);
			loop_variable_declaration();
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1513);
				match(WHITE_SPACE);
				}
			}

			setState(1516);
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
		enterRule(_localctx, 124, RULE_function_calling);
		int _la;
		try {
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				label();
				setState(1519);
				match(OPEN_PAREN);
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1520);
					function_parameters();
					}
				}

				setState(1523);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1525);
				label();
				setState(1526);
				match(OPEN_PAREN);
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1527);
					function_parameters();
					}
				}

				setState(1530);
				match(CLOSE_PAREN);
				setState(1531);
				match(OPEN_PAREN);
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1532);
					function_parameters();
					}
				}

				setState(1535);
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
		enterRule(_localctx, 126, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			function_paremeters_value();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==WHITE_SPACE) {
				{
				{
				setState(1542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1541);
					match(WHITE_SPACE);
					}
				}

				setState(1544);
				match(COMMA);
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1545);
					match(WHITE_SPACE);
					}
				}

				setState(1548);
				function_paremeters_value();
				}
				}
				setState(1553);
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
		enterRule(_localctx, 128, RULE_function_paremeters_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1554);
				function_calling();
				}
				break;
			case 2:
				{
				setState(1555);
				label();
				}
				break;
			case 3:
				{
				setState(1556);
				expression();
				}
				break;
			case 4:
				{
				setState(1557);
				string();
				}
				break;
			case 5:
				{
				setState(1558);
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
		enterRule(_localctx, 130, RULE_function_declaration);
		try {
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				non_void_function();
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
		enterRule(_localctx, 132, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			label();
			setState(1566);
			match(OPEN_PAREN);
			setState(1568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(1567);
				function_declaration_parameters();
				}
			}

			setState(1570);
			match(CLOSE_PAREN);
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1571);
				match(WHITE_SPACE);
				}
			}

			setState(1574);
			match(OPEN_BRACKET);
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1575);
				match(WHITE_SPACE);
				}
				}
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1582); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1581);
				statements();
				}
				}
				setState(1584); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1586);
				match(WHITE_SPACE);
				}
				}
				setState(1591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1592);
			match(CLOSE_BRACKET);
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1593);
				match(NEWLINE);
				}
				}
				setState(1598);
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
		public List<TerminalNode> COMMA() { return getTokens(MainParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainParser.COMMA, i);
		}
		public List<Function_declaration_parametersContext> function_declaration_parameters() {
			return getRuleContexts(Function_declaration_parametersContext.class);
		}
		public Function_declaration_parametersContext function_declaration_parameters(int i) {
			return getRuleContext(Function_declaration_parametersContext.class,i);
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
		enterRule(_localctx, 134, RULE_function_declaration_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			variable_type();
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1600);
				match(OPEN_BRACE);
				setState(1601);
				match(CLOSE_BRACE);
				}
			}

			setState(1604);
			match(WHITE_SPACE);
			setState(1605);
			label();
			setState(1613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1606);
					match(COMMA);
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
					function_declaration_parameters();
					}
					} 
				}
				setState(1615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
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

	public static class Void_functionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public TerminalNode VOID() { return getToken(MainParser.VOID, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
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
		enterRule(_localctx, 136, RULE_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			match(FUNC);
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1617);
				match(WHITE_SPACE);
				}
			}

			setState(1620);
			match(VOID);
			setState(1621);
			match(WHITE_SPACE);
			setState(1622);
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
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
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
		enterRule(_localctx, 138, RULE_non_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			match(FUNC);
			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1625);
				match(WHITE_SPACE);
				}
			}

			setState(1628);
			variable_type();
			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1629);
				match(OPEN_BRACE);
				setState(1630);
				match(CLOSE_BRACE);
				}
			}

			setState(1633);
			match(WHITE_SPACE);
			setState(1634);
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
		enterRule(_localctx, 140, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			match(OPEN_BRACKET);
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1637);
				match(WHITE_SPACE);
				}
				}
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1644); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1643);
				statements();
				}
				}
				setState(1646); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1648);
				match(WHITE_SPACE);
				}
				}
				setState(1653);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1654);
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
		enterRule(_localctx, 142, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			main_head();
			setState(1657);
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
		enterRule(_localctx, 144, RULE_main_head);
		int _la;
		try {
			int _alt;
			setState(1682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				match(MAIN);
				setState(1660);
				match(OPEN_PAREN);
				setState(1661);
				match(CLOSE_PAREN);
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1662);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				match(MAIN);
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(1669);
					match(OPEN_PAREN);
					}
				}

				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1672);
					match(CLOSE_PAREN);
					}
				}

				setState(1678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1675);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
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
		enterRule(_localctx, 146, RULE_main_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			main_body_first();
			setState(1688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1685);
				match(WHITE_SPACE);
				}
				}
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1692); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1691);
				statements();
				}
				}
				setState(1694); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1696);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			setState(1702);
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
		enterRule(_localctx, 148, RULE_main_body_first);
		try {
			setState(1706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1704);
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
		enterRule(_localctx, 150, RULE_main_body_second);
		try {
			setState(1710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1708);
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
		case 48:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u06b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\7\2\u009d\n\2\f\2\16\2\u00a0\13\2"+
		"\7\2\u00a2\n\2\f\2\16\2\u00a5\13\2\3\2\7\2\u00a8\n\2\f\2\16\2\u00ab\13"+
		"\2\3\2\3\2\7\2\u00af\n\2\f\2\16\2\u00b2\13\2\3\2\7\2\u00b5\n\2\f\2\16"+
		"\2\u00b8\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4\u00c3\n\4\r\4\16"+
		"\4\u00c4\3\4\3\4\3\5\5\5\u00ca\n\5\3\5\6\5\u00cd\n\5\r\5\16\5\u00ce\3"+
		"\5\3\5\6\5\u00d3\n\5\r\5\16\5\u00d4\3\5\5\5\u00d8\n\5\3\5\5\5\u00db\n"+
		"\5\3\5\6\5\u00de\n\5\r\5\16\5\u00df\5\5\u00e2\n\5\3\6\7\6\u00e5\n\6\f"+
		"\6\16\6\u00e8\13\6\3\6\6\6\u00eb\n\6\r\6\16\6\u00ec\3\6\7\6\u00f0\n\6"+
		"\f\6\16\6\u00f3\13\6\3\6\7\6\u00f6\n\6\f\6\16\6\u00f9\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0100\n\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u0108\n\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\5\r\u0110\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u011a\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\7\24\u0128\n\24\f\24\16\24\u012b\13\24\3\24\5\24\u012e\n\24\3\24"+
		"\7\24\u0131\n\24\f\24\16\24\u0134\13\24\3\24\7\24\u0137\n\24\f\24\16\24"+
		"\u013a\13\24\3\24\3\24\7\24\u013e\n\24\f\24\16\24\u0141\13\24\3\24\5\24"+
		"\u0144\n\24\3\24\7\24\u0147\n\24\f\24\16\24\u014a\13\24\3\24\7\24\u014d"+
		"\n\24\f\24\16\24\u0150\13\24\3\24\3\24\3\24\7\24\u0155\n\24\f\24\16\24"+
		"\u0158\13\24\3\24\5\24\u015b\n\24\3\24\7\24\u015e\n\24\f\24\16\24\u0161"+
		"\13\24\3\24\7\24\u0164\n\24\f\24\16\24\u0167\13\24\3\24\3\24\7\24\u016b"+
		"\n\24\f\24\16\24\u016e\13\24\3\24\5\24\u0171\n\24\3\24\7\24\u0174\n\24"+
		"\f\24\16\24\u0177\13\24\3\24\7\24\u017a\n\24\f\24\16\24\u017d\13\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u0184\n\24\f\24\16\24\u0187\13\24\3\24\5"+
		"\24\u018a\n\24\3\24\7\24\u018d\n\24\f\24\16\24\u0190\13\24\3\24\7\24\u0193"+
		"\n\24\f\24\16\24\u0196\13\24\3\24\3\24\7\24\u019a\n\24\f\24\16\24\u019d"+
		"\13\24\3\24\5\24\u01a0\n\24\3\24\7\24\u01a3\n\24\f\24\16\24\u01a6\13\24"+
		"\3\24\7\24\u01a9\n\24\f\24\16\24\u01ac\13\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u01b3\n\24\f\24\16\24\u01b6\13\24\3\24\5\24\u01b9\n\24\3\24\7\24"+
		"\u01bc\n\24\f\24\16\24\u01bf\13\24\3\24\7\24\u01c2\n\24\f\24\16\24\u01c5"+
		"\13\24\3\24\3\24\7\24\u01c9\n\24\f\24\16\24\u01cc\13\24\3\24\5\24\u01cf"+
		"\n\24\3\24\7\24\u01d2\n\24\f\24\16\24\u01d5\13\24\3\24\7\24\u01d8\n\24"+
		"\f\24\16\24\u01db\13\24\3\24\3\24\3\24\3\24\7\24\u01e1\n\24\f\24\16\24"+
		"\u01e4\13\24\3\24\5\24\u01e7\n\24\3\24\7\24\u01ea\n\24\f\24\16\24\u01ed"+
		"\13\24\3\24\7\24\u01f0\n\24\f\24\16\24\u01f3\13\24\3\24\3\24\3\24\7\24"+
		"\u01f8\n\24\f\24\16\24\u01fb\13\24\3\24\5\24\u01fe\n\24\3\24\7\24\u0201"+
		"\n\24\f\24\16\24\u0204\13\24\3\24\7\24\u0207\n\24\f\24\16\24\u020a\13"+
		"\24\3\24\3\24\7\24\u020e\n\24\f\24\16\24\u0211\13\24\3\24\5\24\u0214\n"+
		"\24\3\24\7\24\u0217\n\24\f\24\16\24\u021a\13\24\3\24\7\24\u021d\n\24\f"+
		"\24\16\24\u0220\13\24\3\24\3\24\3\24\3\24\7\24\u0226\n\24\f\24\16\24\u0229"+
		"\13\24\3\24\5\24\u022c\n\24\3\24\7\24\u022f\n\24\f\24\16\24\u0232\13\24"+
		"\3\24\7\24\u0235\n\24\f\24\16\24\u0238\13\24\3\24\3\24\3\24\7\24\u023d"+
		"\n\24\f\24\16\24\u0240\13\24\3\24\5\24\u0243\n\24\3\24\7\24\u0246\n\24"+
		"\f\24\16\24\u0249\13\24\3\24\7\24\u024c\n\24\f\24\16\24\u024f\13\24\3"+
		"\24\3\24\7\24\u0253\n\24\f\24\16\24\u0256\13\24\3\24\5\24\u0259\n\24\3"+
		"\24\7\24\u025c\n\24\f\24\16\24\u025f\13\24\3\24\7\24\u0262\n\24\f\24\16"+
		"\24\u0265\13\24\3\24\3\24\5\24\u0269\n\24\3\25\3\25\3\25\3\25\5\25\u026f"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0277\n\26\3\27\3\27\5\27\u027b"+
		"\n\27\3\27\3\27\5\27\u027f\n\27\3\27\5\27\u0282\n\27\3\27\3\27\5\27\u0286"+
		"\n\27\3\27\3\27\5\27\u028a\n\27\3\27\5\27\u028d\n\27\3\27\3\27\5\27\u0291"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u0297\n\30\3\30\3\30\5\30\u029b\n\30\3"+
		"\30\7\30\u029e\n\30\f\30\16\30\u02a1\13\30\3\31\3\31\5\31\u02a5\n\31\3"+
		"\31\3\31\5\31\u02a9\n\31\3\31\3\31\3\31\3\31\5\31\u02af\n\31\3\31\3\31"+
		"\5\31\u02b3\n\31\3\31\3\31\3\31\5\31\u02b8\n\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u02c3\n\33\3\33\3\33\5\33\u02c7\n\33\3\33"+
		"\3\33\5\33\u02cb\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u02d8\n\34\3\34\3\34\5\34\u02dc\n\34\3\34\3\34\5\34\u02e0\n"+
		"\34\3\35\5\35\u02e3\n\35\3\35\3\35\5\35\u02e7\n\35\3\35\3\35\5\35\u02eb"+
		"\n\35\3\35\3\35\5\35\u02ef\n\35\3\35\3\35\3\35\3\35\5\35\u02f5\n\35\3"+
		"\35\3\35\5\35\u02f9\n\35\3\35\3\35\5\35\u02fd\n\35\3\35\5\35\u0300\n\35"+
		"\3\35\3\35\5\35\u0304\n\35\3\35\3\35\5\35\u0308\n\35\3\35\3\35\5\35\u030c"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0314\n\36\3\36\3\36\5\36\u0318"+
		"\n\36\3\36\5\36\u031b\n\36\3\36\3\36\3\36\5\36\u0320\n\36\3\36\3\36\5"+
		"\36\u0324\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\5!\u0330\n!\3!\3!\5"+
		"!\u0334\n!\3!\3!\5!\u0338\n!\7!\u033a\n!\f!\16!\u033d\13!\3!\3!\3!\6!"+
		"\u0342\n!\r!\16!\u0343\3!\3!\3!\3!\5!\u034a\n!\3!\3!\5!\u034e\n!\3!\3"+
		"!\5!\u0352\n!\7!\u0354\n!\f!\16!\u0357\13!\3!\6!\u035a\n!\r!\16!\u035b"+
		"\3!\3!\5!\u0360\n!\3\"\3\"\3\"\3\"\5\"\u0366\n\"\3#\3#\3#\3#\3#\3#\3#"+
		"\5#\u036f\n#\3#\3#\5#\u0373\n#\3#\3#\5#\u0377\n#\3$\3$\5$\u037b\n$\3$"+
		"\3$\5$\u037f\n$\3$\3$\3$\3$\5$\u0385\n$\3$\5$\u0388\n$\3$\3$\3$\3$\5$"+
		"\u038e\n$\3$\5$\u0391\n$\3$\5$\u0394\n$\3$\3$\3$\5$\u0399\n$\3%\3%\3%"+
		"\5%\u039e\n%\3%\7%\u03a1\n%\f%\16%\u03a4\13%\3%\3%\5%\u03a8\n%\3&\3&\3"+
		"&\3&\6&\u03ae\n&\r&\16&\u03af\3\'\3\'\3\'\3\'\3\'\5\'\u03b7\n\'\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\7)\u03c4\n)\f)\16)\u03c7\13)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u03d2\n)\3*\3*\3*\3*\3*\5*\u03d9\n*\3+\3+\5+\u03dd\n"+
		"+\3+\3+\3,\3,\5,\u03e3\n,\3-\3-\5-\u03e7\n-\3-\3-\5-\u03eb\n-\3-\3-\3"+
		"-\3-\5-\u03f1\n-\3-\3-\5-\u03f5\n-\3-\6-\u03f8\n-\r-\16-\u03f9\3-\3-\3"+
		"-\6-\u03ff\n-\r-\16-\u0400\3-\5-\u0404\n-\3-\3-\5-\u0408\n-\3-\3-\3-\3"+
		"-\3-\5-\u040f\n-\3-\3-\3-\3-\3-\3-\5-\u0417\n-\6-\u0419\n-\r-\16-\u041a"+
		"\3-\5-\u041e\n-\3-\3-\3-\5-\u0423\n-\3.\3.\5.\u0427\n.\3.\5.\u042a\n."+
		"\3.\3.\5.\u042e\n.\3.\5.\u0431\n.\3.\3.\3.\6.\u0436\n.\r.\16.\u0437\3"+
		".\5.\u043b\n.\3.\3.\5.\u043f\n.\3.\3.\3.\3.\3.\5.\u0446\n.\3.\3.\5.\u044a"+
		"\n.\3.\6.\u044d\n.\r.\16.\u044e\3.\3.\3.\6.\u0454\n.\r.\16.\u0455\3.\5"+
		".\u0459\n.\3.\3.\5.\u045d\n.\3.\3.\3.\5.\u0462\n.\3/\3/\5/\u0466\n/\3"+
		"/\3/\3/\3/\5/\u046c\n/\3/\3/\3/\3/\5/\u0472\n/\6/\u0474\n/\r/\16/\u0475"+
		"\3/\3/\3/\3/\7/\u047c\n/\f/\16/\u047f\13/\3/\6/\u0482\n/\r/\16/\u0483"+
		"\3/\5/\u0487\n/\3/\3/\3/\3/\5/\u048d\n/\3\60\3\60\5\60\u0491\n\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0497\n\60\3\60\3\60\3\60\3\60\5\60\u049d\n\60\6"+
		"\60\u049f\n\60\r\60\16\60\u04a0\3\60\3\60\3\60\3\60\7\60\u04a7\n\60\f"+
		"\60\16\60\u04aa\13\60\3\60\6\60\u04ad\n\60\r\60\16\60\u04ae\3\60\5\60"+
		"\u04b2\n\60\3\60\3\60\3\60\3\60\5\60\u04b8\n\60\3\61\3\61\3\61\5\61\u04bd"+
		"\n\61\3\62\3\62\3\62\3\62\5\62\u04c3\n\62\3\62\3\62\5\62\u04c7\n\62\3"+
		"\62\3\62\5\62\u04cb\n\62\3\62\3\62\5\62\u04cf\n\62\3\62\3\62\5\62\u04d3"+
		"\n\62\3\62\3\62\5\62\u04d7\n\62\3\62\3\62\3\62\3\62\5\62\u04dd\n\62\3"+
		"\62\3\62\6\62\u04e1\n\62\r\62\16\62\u04e2\3\62\5\62\u04e6\n\62\3\62\3"+
		"\62\3\62\7\62\u04eb\n\62\f\62\16\62\u04ee\13\62\3\63\3\63\5\63\u04f2\n"+
		"\63\3\63\3\63\5\63\u04f6\n\63\3\63\3\63\5\63\u04fa\n\63\3\63\3\63\5\63"+
		"\u04fe\n\63\3\63\3\63\5\63\u0502\n\63\3\63\3\63\5\63\u0506\n\63\3\63\3"+
		"\63\5\63\u050a\n\63\3\64\3\64\3\64\5\64\u050f\n\64\3\65\3\65\5\65\u0513"+
		"\n\65\3\65\3\65\5\65\u0517\n\65\7\65\u0519\n\65\f\65\16\65\u051c\13\65"+
		"\3\65\3\65\7\65\u0520\n\65\f\65\16\65\u0523\13\65\5\65\u0525\n\65\3\66"+
		"\3\66\3\66\3\66\5\66\u052b\n\66\3\66\3\66\5\66\u052f\n\66\3\66\3\66\7"+
		"\66\u0533\n\66\f\66\16\66\u0536\13\66\3\66\6\66\u0539\n\66\r\66\16\66"+
		"\u053a\3\66\7\66\u053e\n\66\f\66\16\66\u0541\13\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\59\u054d\n9\39\39\59\u0551\n9\39\39\79\u0555\n9\f"+
		"9\169\u0558\139\39\69\u055b\n9\r9\169\u055c\39\79\u0560\n9\f9\169\u0563"+
		"\139\39\39\3:\3:\5:\u0569\n:\3;\3;\5;\u056d\n;\3;\3;\5;\u0571\n;\3;\3"+
		";\7;\u0575\n;\f;\16;\u0578\13;\3;\6;\u057b\n;\r;\16;\u057c\3;\7;\u0580"+
		"\n;\f;\16;\u0583\13;\3;\3;\3;\3;\5;\u0589\n;\3;\3;\5;\u058d\n;\3;\3;\7"+
		";\u0591\n;\f;\16;\u0594\13;\3;\6;\u0597\n;\r;\16;\u0598\3;\7;\u059c\n"+
		";\f;\16;\u059f\13;\3;\3;\3;\3;\5;\u05a5\n;\3;\3;\5;\u05a9\n;\3;\7;\u05ac"+
		"\n;\f;\16;\u05af\13;\3;\6;\u05b2\n;\r;\16;\u05b3\3;\7;\u05b7\n;\f;\16"+
		";\u05ba\13;\3;\3;\3;\5;\u05bf\n;\3<\3<\3<\5<\u05c4\n<\3<\3<\5<\u05c8\n"+
		"<\3<\3<\5<\u05cc\n<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u05d6\n<\3=\3=\3=\5=\u05db"+
		"\n=\3>\3>\5>\u05df\n>\3>\3>\5>\u05e3\n>\3>\3>\3?\3?\5?\u05e9\n?\3?\3?"+
		"\5?\u05ed\n?\3?\3?\3@\3@\3@\5@\u05f4\n@\3@\3@\3@\3@\3@\5@\u05fb\n@\3@"+
		"\3@\3@\5@\u0600\n@\3@\3@\3@\5@\u0605\n@\3A\3A\5A\u0609\nA\3A\3A\5A\u060d"+
		"\nA\3A\7A\u0610\nA\fA\16A\u0613\13A\3B\3B\3B\3B\3B\5B\u061a\nB\3C\3C\5"+
		"C\u061e\nC\3D\3D\3D\5D\u0623\nD\3D\3D\5D\u0627\nD\3D\3D\7D\u062b\nD\f"+
		"D\16D\u062e\13D\3D\6D\u0631\nD\rD\16D\u0632\3D\7D\u0636\nD\fD\16D\u0639"+
		"\13D\3D\3D\7D\u063d\nD\fD\16D\u0640\13D\3E\3E\3E\5E\u0645\nE\3E\3E\3E"+
		"\3E\5E\u064b\nE\3E\7E\u064e\nE\fE\16E\u0651\13E\3F\3F\5F\u0655\nF\3F\3"+
		"F\3F\3F\3G\3G\5G\u065d\nG\3G\3G\3G\5G\u0662\nG\3G\3G\3G\3H\3H\7H\u0669"+
		"\nH\fH\16H\u066c\13H\3H\6H\u066f\nH\rH\16H\u0670\3H\7H\u0674\nH\fH\16"+
		"H\u0677\13H\3H\3H\3I\3I\3I\3J\3J\3J\3J\7J\u0682\nJ\fJ\16J\u0685\13J\3"+
		"J\3J\5J\u0689\nJ\3J\5J\u068c\nJ\3J\7J\u068f\nJ\fJ\16J\u0692\13J\3J\5J"+
		"\u0695\nJ\3K\3K\7K\u0699\nK\fK\16K\u069c\13K\3K\6K\u069f\nK\rK\16K\u06a0"+
		"\3K\7K\u06a4\nK\fK\16K\u06a7\13K\3K\3K\3L\3L\5L\u06ad\nL\3M\3M\5M\u06b1"+
		"\nM\3M\2\3bN\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\2\17\3\2\26\31\5\2\4"+
		"\4\63\63\65\66\3\2&(\3\2$%\3\2)*\3\2 #\3\2\5\f\3\2\r\20\3\2\21\25\3\2"+
		"+\64\3\2\32\37\4\288::\3\2\22\24\2\u07c5\2\u00a3\3\2\2\2\4\u00bb\3\2\2"+
		"\2\6\u00bd\3\2\2\2\b\u00e1\3\2\2\2\n\u00e6\3\2\2\2\f\u00ff\3\2\2\2\16"+
		"\u0101\3\2\2\2\20\u0103\3\2\2\2\22\u0107\3\2\2\2\24\u0109\3\2\2\2\26\u010b"+
		"\3\2\2\2\30\u010f\3\2\2\2\32\u0119\3\2\2\2\34\u011b\3\2\2\2\36\u011d\3"+
		"\2\2\2 \u011f\3\2\2\2\"\u0121\3\2\2\2$\u0123\3\2\2\2&\u0268\3\2\2\2(\u026e"+
		"\3\2\2\2*\u0276\3\2\2\2,\u0290\3\2\2\2.\u0292\3\2\2\2\60\u02b7\3\2\2\2"+
		"\62\u02b9\3\2\2\2\64\u02ca\3\2\2\2\66\u02df\3\2\2\28\u030b\3\2\2\2:\u0323"+
		"\3\2\2\2<\u0325\3\2\2\2>\u0328\3\2\2\2@\u035f\3\2\2\2B\u0365\3\2\2\2D"+
		"\u0376\3\2\2\2F\u0398\3\2\2\2H\u03a7\3\2\2\2J\u03ad\3\2\2\2L\u03b6\3\2"+
		"\2\2N\u03b8\3\2\2\2P\u03d1\3\2\2\2R\u03d8\3\2\2\2T\u03da\3\2\2\2V\u03e2"+
		"\3\2\2\2X\u0422\3\2\2\2Z\u0461\3\2\2\2\\\u048c\3\2\2\2^\u04b7\3\2\2\2"+
		"`\u04bc\3\2\2\2b\u04ce\3\2\2\2d\u0509\3\2\2\2f\u050e\3\2\2\2h\u0510\3"+
		"\2\2\2j\u0526\3\2\2\2l\u0544\3\2\2\2n\u0547\3\2\2\2p\u054a\3\2\2\2r\u0568"+
		"\3\2\2\2t\u05be\3\2\2\2v\u05d5\3\2\2\2x\u05da\3\2\2\2z\u05dc\3\2\2\2|"+
		"\u05e6\3\2\2\2~\u0604\3\2\2\2\u0080\u0606\3\2\2\2\u0082\u0619\3\2\2\2"+
		"\u0084\u061d\3\2\2\2\u0086\u061f\3\2\2\2\u0088\u0641\3\2\2\2\u008a\u0652"+
		"\3\2\2\2\u008c\u065a\3\2\2\2\u008e\u0666\3\2\2\2\u0090\u067a\3\2\2\2\u0092"+
		"\u0694\3\2\2\2\u0094\u0696\3\2\2\2\u0096\u06ac\3\2\2\2\u0098\u06b0\3\2"+
		"\2\2\u009a\u009e\5\u0084C\2\u009b\u009d\7:\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a1\u009a\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a8\7:\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00b0\5\u0090I\2\u00ad\u00af\78\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7:\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\2\2\3\u00ba\3\3\2\2\2\u00bb\u00bc"+
		"\t\2\2\2\u00bc\5\3\2\2\2\u00bd\u00c2\7\3\2\2\u00be\u00c3\7\67\2\2\u00bf"+
		"\u00c3\5\32\16\2\u00c0\u00c3\5\n\6\2\u00c1\u00c3\7:\2\2\u00c2\u00be\3"+
		"\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\7\3\2\2\u00c7\7\3\2\2\2\u00c8\u00ca\7%\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00cd\7\67\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7\60\2\2\u00d1\u00d3\7\67\2\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\7\4\2\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00e2\3\2\2\2\u00d9\u00db\7%\2\2\u00da\u00d9\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\7\67\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00c9\3\2\2\2\u00e1\u00da\3\2\2\2\u00e2"+
		"\t\3\2\2\2\u00e3\u00e5\5\f\7\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00eb\t\3\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\5\f"+
		"\7\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f7\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\5\n"+
		"\6\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\13\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0100\5\34\17"+
		"\2\u00fb\u0100\5\36\20\2\u00fc\u0100\5 \21\2\u00fd\u0100\5\4\3\2\u00fe"+
		"\u0100\7\67\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\r\3\2\2\2\u0101\u0102"+
		"\t\4\2\2\u0102\17\3\2\2\2\u0103\u0104\t\5\2\2\u0104\21\3\2\2\2\u0105\u0108"+
		"\5\16\b\2\u0106\u0108\5\20\t\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\23\3\2\2\2\u0109\u010a\t\6\2\2\u010a\25\3\2\2\2\u010b\u010c\t\7"+
		"\2\2\u010c\27\3\2\2\2\u010d\u0110\5\24\13\2\u010e\u0110\5\26\f\2\u010f"+
		"\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\31\3\2\2\2\u0111\u011a\5\34\17"+
		"\2\u0112\u011a\5\36\20\2\u0113\u011a\5 \21\2\u0114\u011a\5\"\22\2\u0115"+
		"\u011a\5$\23\2\u0116\u011a\5\30\r\2\u0117\u011a\5\22\n\2\u0118\u011a\5"+
		"\4\3\2\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0113\3\2\2\2\u0119"+
		"\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u0118\3\2\2\2\u011a\33\3\2\2\2\u011b\u011c\t\b\2\2\u011c\35"+
		"\3\2\2\2\u011d\u011e\t\t\2\2\u011e\37\3\2\2\2\u011f\u0120\t\n\2\2\u0120"+
		"!\3\2\2\2\u0121\u0122\t\13\2\2\u0122#\3\2\2\2\u0123\u0124\t\f\2\2\u0124"+
		"%\3\2\2\2\u0125\u0129\5h\65\2\u0126\u0128\7:\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012d\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012c\u012e\79\2\2\u012d\u012c\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0132\3\2\2\2\u012f\u0131\7:\2\2\u0130\u012f\3\2"+
		"\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0138\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\78\2\2\u0136\u0135\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u0269\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013f\5r:\2\u013c\u013e\7:\2"+
		"\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\79\2\2\u0143"+
		"\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0148\3\2\2\2\u0145\u0147\7:"+
		"\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014e\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\78"+
		"\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0269\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5>"+
		" \2\u0152\u0156\7\61\2\2\u0153\u0155\7:\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015b\79\2\2\u015a\u0159\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015f\3\2\2\2\u015c\u015e\7:\2\2\u015d\u015c\3\2"+
		"\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0165\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\78\2\2\u0163\u0162\3\2"+
		"\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0269\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016c\5> \2\u0169\u016b\7:\2"+
		"\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\79\2\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0175\3\2\2\2\u0172\u0174\7:"+
		"\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u017b\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\78"+
		"\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\b\24"+
		"\1\2\u017f\u0269\3\2\2\2\u0180\u0181\5D#\2\u0181\u0185\7\61\2\2\u0182"+
		"\u0184\7:\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018a\79\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018e\3\2"+
		"\2\2\u018b\u018d\7:\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0194\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0193\78\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0269\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0197\u019b\5D#\2\u0198\u019a\7:\2\2\u0199\u0198\3\2\2\2\u019a\u019d"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u01a0\79\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a4\3\2\2\2\u01a1\u01a3\7:\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01aa\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\78\2\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\b\24\1\2\u01ae\u0269\3\2\2\2\u01af"+
		"\u01b0\5P)\2\u01b0\u01b4\7\61\2\2\u01b1\u01b3\7:\2\2\u01b2\u01b1\3\2\2"+
		"\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\79\2\2\u01b8\u01b7\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bd\3\2\2\2\u01ba\u01bc\7:\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c3\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2\78\2\2\u01c1\u01c0\3\2"+
		"\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u0269\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01ca\5P)\2\u01c7\u01c9\7:\2"+
		"\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01cf\79\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d3\3\2\2\2\u01d0\u01d2\7:"+
		"\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d9\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\78"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\b\24"+
		"\1\2\u01dd\u0269\3\2\2\2\u01de\u01e2\5N(\2\u01df\u01e1\7:\2\2\u01e0\u01df"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e7\79\2\2\u01e6\u01e5\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\3\2\2\2\u01e8\u01ea\7:\2\2\u01e9"+
		"\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01f1\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f0\78\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u0269\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\5(\25\2\u01f5"+
		"\u01f9\7\61\2\2\u01f6\u01f8\7:\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01fe\79\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0202\3\2\2\2\u01ff\u0201\7:\2\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0208\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0207\78\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0269\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020b\u020f\5(\25\2\u020c\u020e\7:\2\2\u020d"+
		"\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\79\2\2\u0213"+
		"\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0218\3\2\2\2\u0215\u0217\7:"+
		"\2\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021e\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021d\78"+
		"\2\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\b\24"+
		"\1\2\u0222\u0269\3\2\2\2\u0223\u0227\5\u008eH\2\u0224\u0226\7:\2\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022c\79\2\2\u022b"+
		"\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u0230\3\2\2\2\u022d\u022f\7:"+
		"\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0236\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0235\78"+
		"\2\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0269\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\5~"+
		"@\2\u023a\u023e\7\61\2\2\u023b\u023d\7:\2\2\u023c\u023b\3\2\2\2\u023d"+
		"\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0242\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0241\u0243\79\2\2\u0242\u0241\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0247\3\2\2\2\u0244\u0246\7:\2\2\u0245\u0244\3\2"+
		"\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u024d\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\78\2\2\u024b\u024a\3\2"+
		"\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0269\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0254\5~@\2\u0251\u0253\7:\2"+
		"\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0259\79\2\2\u0258"+
		"\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025d\3\2\2\2\u025a\u025c\7:"+
		"\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0263\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0262\78"+
		"\2\2\u0261\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\b\24"+
		"\1\2\u0267\u0269\3\2\2\2\u0268\u0125\3\2\2\2\u0268\u013b\3\2\2\2\u0268"+
		"\u0151\3\2\2\2\u0268\u0168\3\2\2\2\u0268\u0180\3\2\2\2\u0268\u0197\3\2"+
		"\2\2\u0268\u01af\3\2\2\2\u0268\u01c6\3\2\2\2\u0268\u01de\3\2\2\2\u0268"+
		"\u01f4\3\2\2\2\u0268\u020b\3\2\2\2\u0268\u0223\3\2\2\2\u0268\u0239\3\2"+
		"\2\2\u0268\u0250\3\2\2\2\u0269\'\3\2\2\2\u026a\u026f\5.\30\2\u026b\u026f"+
		"\5\60\31\2\u026c\u026f\5:\36\2\u026d\u026f\5<\37\2\u026e\u026a\3\2\2\2"+
		"\u026e\u026b\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f)\3"+
		"\2\2\2\u0270\u0277\5\6\4\2\u0271\u0277\5\b\5\2\u0272\u0277\5\n\6\2\u0273"+
		"\u0277\5T+\2\u0274\u0277\5b\62\2\u0275\u0277\5~@\2\u0276\u0270\3\2\2\2"+
		"\u0276\u0271\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0273\3\2\2\2\u0276\u0274"+
		"\3\2\2\2\u0276\u0275\3\2\2\2\u0277+\3\2\2\2\u0278\u0281\5\n\6\2\u0279"+
		"\u027b\7:\2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u027e\7,\2\2\u027d\u027f\7:\2\2\u027e\u027d\3\2\2\2\u027e\u027f"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\5*\26\2\u0281\u027a\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0291\3\2\2\2\u0283\u028c\5\n\6\2\u0284\u0286\7:"+
		"\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0289\7-\2\2\u0288\u028a\7:\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2"+
		"\2\u028a\u028b\3\2\2\2\u028b\u028d\5*\26\2\u028c\u0285\3\2\2\2\u028c\u028d"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\b\27\1\2\u028f\u0291\3\2\2\2"+
		"\u0290\u0278\3\2\2\2\u0290\u0283\3\2\2\2\u0291-\3\2\2\2\u0292\u0293\5"+
		"\4\3\2\u0293\u0294\7:\2\2\u0294\u029f\5,\27\2\u0295\u0297\7:\2\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\7\62"+
		"\2\2\u0299\u029b\7:\2\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029e\5,\27\2\u029d\u0296\3\2\2\2\u029e\u02a1\3\2"+
		"\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0/\3\2\2\2\u02a1\u029f"+
		"\3\2\2\2\u02a2\u02a4\5\n\6\2\u02a3\u02a5\7:\2\2\u02a4\u02a3\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\7,\2\2\u02a7\u02a9\7:\2"+
		"\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab"+
		"\5*\26\2\u02ab\u02b8\3\2\2\2\u02ac\u02ae\5\n\6\2\u02ad\u02af\7:\2\2\u02ae"+
		"\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\7-"+
		"\2\2\u02b1\u02b3\7:\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b5\5*\26\2\u02b5\u02b6\b\31\1\2\u02b6\u02b8\3"+
		"\2\2\2\u02b7\u02a2\3\2\2\2\u02b7\u02ac\3\2\2\2\u02b8\61\3\2\2\2\u02b9"+
		"\u02ba\5T+\2\u02ba\63\3\2\2\2\u02bb\u02bc\5\n\6\2\u02bc\u02bd\7\36\2\2"+
		"\u02bd\u02be\5\62\32\2\u02be\u02bf\7\37\2\2\u02bf\u02cb\3\2\2\2\u02c0"+
		"\u02c2\5\n\6\2\u02c1\u02c3\7\36\2\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3"+
		"\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\5\62\32\2\u02c5\u02c7\7\37\2\2"+
		"\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9"+
		"\b\33\1\2\u02c9\u02cb\3\2\2\2\u02ca\u02bb\3\2\2\2\u02ca\u02c0\3\2\2\2"+
		"\u02cb\65\3\2\2\2\u02cc\u02cd\7\5\2\2\u02cd\u02ce\7:\2\2\u02ce\u02cf\5"+
		"\4\3\2\u02cf\u02d0\7\36\2\2\u02d0\u02d1\5\62\32\2\u02d1\u02d2\7\37\2\2"+
		"\u02d2\u02e0\3\2\2\2\u02d3\u02d4\7\5\2\2\u02d4\u02d5\7:\2\2\u02d5\u02d7"+
		"\5\4\3\2\u02d6\u02d8\7\36\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2"+
		"\u02d8\u02d9\3\2\2\2\u02d9\u02db\5\62\32\2\u02da\u02dc\7\37\2\2\u02db"+
		"\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\b\34"+
		"\1\2\u02de\u02e0\3\2\2\2\u02df\u02cc\3\2\2\2\u02df\u02d3\3\2\2\2\u02e0"+
		"\67\3\2\2\2\u02e1\u02e3\7:\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2"+
		"\u02e3\u02e4\3\2\2\2\u02e4\u02e6\7,\2\2\u02e5\u02e7\7:\2\2\u02e6\u02e5"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u030c\5\66\34\2"+
		"\u02e9\u02eb\7:\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec"+
		"\3\2\2\2\u02ec\u02ee\7-\2\2\u02ed\u02ef\7:\2\2\u02ee\u02ed\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\5\66\34\2\u02f1\u02f2\b"+
		"\35\1\2\u02f2\u030c\3\2\2\2\u02f3\u02f5\7:\2\2\u02f4\u02f3\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\7,\2\2\u02f7\u02f9\7:\2"+
		"\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02fd"+
		"\5\64\33\2\u02fb\u02fd\5*\26\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2"+
		"\u02fd\u030c\3\2\2\2\u02fe\u0300\7:\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\7-\2\2\u0302\u0304\7:\2\2\u0303"+
		"\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0308\5\64"+
		"\33\2\u0306\u0308\5*\26\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u030a\b\35\1\2\u030a\u030c\3\2\2\2\u030b\u02e2\3"+
		"\2\2\2\u030b\u02ea\3\2\2\2\u030b\u02f4\3\2\2\2\u030b\u02ff\3\2\2\2\u030c"+
		"9\3\2\2\2\u030d\u030e\5\4\3\2\u030e\u030f\7\36\2\2\u030f\u0310\7\37\2"+
		"\2\u0310\u0311\7:\2\2\u0311\u0313\5\n\6\2\u0312\u0314\58\35\2\u0313\u0312"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0324\3\2\2\2\u0315\u0317\5\4\3\2\u0316"+
		"\u0318\7\36\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3"+
		"\2\2\2\u0319\u031b\7\37\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u031d\7:\2\2\u031d\u031f\5\n\6\2\u031e\u0320\58\35"+
		"\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322"+
		"\b\36\1\2\u0322\u0324\3\2\2\2\u0323\u030d\3\2\2\2\u0323\u0315\3\2\2\2"+
		"\u0324;\3\2\2\2\u0325\u0326\5\64\33\2\u0326\u0327\58\35\2\u0327=\3\2\2"+
		"\2\u0328\u0329\7\b\2\2\u0329\u032a\7\32\2\2\u032a\u032b\5@!\2\u032b\u032c"+
		"\7\33\2\2\u032c?\3\2\2\2\u032d\u033b\5B\"\2\u032e\u0330\7:\2\2\u032f\u032e"+
		"\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333\7$\2\2\u0332"+
		"\u0334\7:\2\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2"+
		"\2\2\u0335\u0337\5B\"\2\u0336\u0338\7:\2\2\u0337\u0336\3\2\2\2\u0337\u0338"+
		"\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u032f\3\2\2\2\u033a\u033d\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u0360\3\2\2\2\u033d\u033b\3\2"+
		"\2\2\u033e\u0341\5\n\6\2\u033f\u0340\7:\2\2\u0340\u0342\5\n\6\2\u0341"+
		"\u033f\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u0345\3\2\2\2\u0345\u0346\b!\1\2\u0346\u0360\3\2\2\2\u0347"+
		"\u0355\5B\"\2\u0348\u034a\7:\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2"+
		"\2\u034a\u034b\3\2\2\2\u034b\u034d\7$\2\2\u034c\u034e\7:\2\2\u034d\u034c"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\5B\"\2\u0350"+
		"\u0352\7:\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2"+
		"\2\2\u0353\u0349\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u035a\7$"+
		"\2\2\u0359\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0359\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\b!\1\2\u035e\u0360\3\2"+
		"\2\2\u035f\u032d\3\2\2\2\u035f\u033e\3\2\2\2\u035f\u0347\3\2\2\2\u0360"+
		"A\3\2\2\2\u0361\u0366\5\6\4\2\u0362\u0366\5\n\6\2\u0363\u0366\5T+\2\u0364"+
		"\u0366\5~@\2\u0365\u0361\3\2\2\2\u0365\u0362\3\2\2\2\u0365\u0363\3\2\2"+
		"\2\u0365\u0364\3\2\2\2\u0366C\3\2\2\2\u0367\u0368\7\t\2\2\u0368\u0369"+
		"\7\32\2\2\u0369\u036a\5F$\2\u036a\u036b\7\33\2\2\u036b\u0377\3\2\2\2\u036c"+
		"\u036e\7\t\2\2\u036d\u036f\7\32\2\2\u036e\u036d\3\2\2\2\u036e\u036f\3"+
		"\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\5F$\2\u0371\u0373\7\33\2\2\u0372"+
		"\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\b#"+
		"\1\2\u0375\u0377\3\2\2\2\u0376\u0367\3\2\2\2\u0376\u036c\3\2\2\2\u0377"+
		"E\3\2\2\2\u0378\u037a\5H%\2\u0379\u037b\7:\2\2\u037a\u0379\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\7\62\2\2\u037d\u037f\7"+
		":\2\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0381\5L\'\2\u0381\u0399\3\2\2\2\u0382\u0384\5H%\2\u0383\u0385\7:\2\2"+
		"\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0388"+
		"\7\62\2\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\3\2\2\2"+
		"\u0389\u038a\b$\1\2\u038a\u0399\3\2\2\2\u038b\u038d\5H%\2\u038c\u038e"+
		"\7:\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f"+
		"\u0391\7\62\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\3"+
		"\2\2\2\u0392\u0394\7:\2\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0396\5L\'\2\u0396\u0397\b$\1\2\u0397\u0399\3\2\2"+
		"\2\u0398\u0378\3\2\2\2\u0398\u0382\3\2\2\2\u0398\u038b\3\2\2\2\u0399G"+
		"\3\2\2\2\u039a\u03a8\5\6\4\2\u039b\u039e\5T+\2\u039c\u039e\5J&\2\u039d"+
		"\u039b\3\2\2\2\u039d\u039c\3\2\2\2\u039e\u03a2\3\2\2\2\u039f\u03a1\7:"+
		"\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\b%"+
		"\1\2\u03a6\u03a8\3\2\2\2\u03a7\u039a\3\2\2\2\u03a7\u039d\3\2\2\2\u03a8"+
		"I\3\2\2\2\u03a9\u03ae\7\67\2\2\u03aa\u03ae\5\32\16\2\u03ab\u03ae\5\n\6"+
		"\2\u03ac\u03ae\7:\2\2\u03ad\u03a9\3\2\2\2\u03ad\u03aa\3\2\2\2\u03ad\u03ab"+
		"\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0K\3\2\2\2\u03b1\u03b7\5T+\2\u03b2\u03b7\5\n\6\2\u03b3"+
		"\u03b4\5\6\4\2\u03b4\u03b5\b\'\1\2\u03b5\u03b7\3\2\2\2\u03b6\u03b1\3\2"+
		"\2\2\u03b6\u03b2\3\2\2\2\u03b6\u03b3\3\2\2\2\u03b7M\3\2\2\2\u03b8\u03b9"+
		"\7\6\2\2\u03b9\u03ba\7:\2\2\u03ba\u03bb\5(\25\2\u03bbO\3\2\2\2\u03bc\u03bd"+
		"\7\7\2\2\u03bd\u03be\7:\2\2\u03be\u03d2\5R*\2\u03bf\u03c0\7\7\2\2\u03c0"+
		"\u03c1\7:\2\2\u03c1\u03c5\5R*\2\u03c2\u03c4\7:\2\2\u03c3\u03c2\3\2\2\2"+
		"\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8"+
		"\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\7\32\2\2\u03c9\u03ca\7\33\2\2"+
		"\u03ca\u03cb\b)\1\2\u03cb\u03d2\3\2\2\2\u03cc\u03cd\7\7\2\2\u03cd\u03ce"+
		"\7:\2\2\u03ce\u03cf\5\4\3\2\u03cf\u03d0\b)\1\2\u03d0\u03d2\3\2\2\2\u03d1"+
		"\u03bc\3\2\2\2\u03d1\u03bf\3\2\2\2\u03d1\u03cc\3\2\2\2\u03d2Q\3\2\2\2"+
		"\u03d3\u03d9\5\6\4\2\u03d4\u03d9\5\b\5\2\u03d5\u03d9\5\n\6\2\u03d6\u03d9"+
		"\5T+\2\u03d7\u03d9\5~@\2\u03d8\u03d3\3\2\2\2\u03d8\u03d4\3\2\2\2\u03d8"+
		"\u03d5\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d7\3\2\2\2\u03d9S\3\2\2\2"+
		"\u03da\u03dc\5X-\2\u03db\u03dd\7:\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\5V,\2\u03dfU\3\2\2\2\u03e0\u03e3"+
		"\5\\/\2\u03e1\u03e3\5^\60\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3"+
		"W\3\2\2\2\u03e4\u03e6\7\32\2\2\u03e5\u03e7\7:\2\2\u03e6\u03e5\3\2\2\2"+
		"\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\5T+\2\u03e9\u03eb"+
		"\7:\2\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec"+
		"\u03ed\7\33\2\2\u03ed\u0423\3\2\2\2\u03ee\u03f0\7\32\2\2\u03ef\u03f1\7"+
		":\2\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2"+
		"\u03f4\5T+\2\u03f3\u03f5\7:\2\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2"+
		"\2\u03f5\u03f7\3\2\2\2\u03f6\u03f8\7\33\2\2\u03f7\u03f6\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2"+
		"\2\2\u03fb\u03fc\b-\1\2\u03fc\u0423\3\2\2\2\u03fd\u03ff\7\32\2\2\u03fe"+
		"\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2"+
		"\2\2\u0401\u0403\3\2\2\2\u0402\u0404\7:\2\2\u0403\u0402\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\5T+\2\u0406\u0408\7:\2"+
		"\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a"+
		"\7\33\2\2\u040a\u040b\b-\1\2\u040b\u0423\3\2\2\2\u040c\u040e\5`\61\2\u040d"+
		"\u040f\7:\2\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u0411\5V,\2\u0411\u0423\3\2\2\2\u0412\u0418\5`\61\2\u0413\u0416"+
		"\7:\2\2\u0414\u0417\5`\61\2\u0415\u0417\5\6\4\2\u0416\u0414\3\2\2\2\u0416"+
		"\u0415\3\2\2\2\u0417\u0419\3\2\2\2\u0418\u0413\3\2\2\2\u0419\u041a\3\2"+
		"\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c"+
		"\u041e\7:\2\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2"+
		"\2\2\u041f\u0420\5V,\2\u0420\u0421\b-\1\2\u0421\u0423\3\2\2\2\u0422\u03e4"+
		"\3\2\2\2\u0422\u03ee\3\2\2\2\u0422\u03fe\3\2\2\2\u0422\u040c\3\2\2\2\u0422"+
		"\u0412\3\2\2\2\u0423Y\3\2\2\2\u0424\u0462\3\2\2\2\u0425\u0427\7\32\2\2"+
		"\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u042a"+
		"\7:\2\2\u0429\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b"+
		"\u042d\5T+\2\u042c\u042e\7:\2\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2"+
		"\2\u042e\u0430\3\2\2\2\u042f\u0431\7\33\2\2\u0430\u042f\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\b.\1\2\u0433\u0462\3\2"+
		"\2\2\u0434\u0436\7\32\2\2\u0435\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439\u043b\7:"+
		"\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043e\5T+\2\u043d\u043f\7:\2\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2"+
		"\2\u043f\u0440\3\2\2\2\u0440\u0441\7\33\2\2\u0441\u0442\b.\1\2\u0442\u0462"+
		"\3\2\2\2\u0443\u0445\7\32\2\2\u0444\u0446\7:\2\2\u0445\u0444\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449\5T+\2\u0448\u044a\7:\2"+
		"\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b\u044d"+
		"\7\33\2\2\u044c\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044c\3\2\2\2"+
		"\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\b.\1\2\u0451\u0462"+
		"\3\2\2\2\u0452\u0454\7\32\2\2\u0453\u0452\3\2\2\2\u0454\u0455\3\2\2\2"+
		"\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0459"+
		"\7:\2\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a"+
		"\u045c\5T+\2\u045b\u045d\7:\2\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2"+
		"\2\u045d\u045e\3\2\2\2\u045e\u045f\7\33\2\2\u045f\u0460\b.\1\2\u0460\u0462"+
		"\3\2\2\2\u0461\u0424\3\2\2\2\u0461\u0426\3\2\2\2\u0461\u0435\3\2\2\2\u0461"+
		"\u0443\3\2\2\2\u0461\u0453\3\2\2\2\u0462[\3\2\2\2\u0463\u0465\5\16\b\2"+
		"\u0464\u0466\7:\2\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0468\5T+\2\u0468\u048d\3\2\2\2\u0469\u046b\5\16\b\2\u046a"+
		"\u046c\7:\2\2\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2"+
		"\2\2\u046d\u0473\5T+\2\u046e\u0471\7:\2\2\u046f\u0472\5`\61\2\u0470\u0472"+
		"\5\6\4\2\u0471\u046f\3\2\2\2\u0471\u0470\3\2\2\2\u0472\u0474\3\2\2\2\u0473"+
		"\u046e\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2"+
		"\2\2\u0476\u0477\3\2\2\2\u0477\u0478\b/\1\2\u0478\u048d\3\2\2\2\u0479"+
		"\u0481\5\16\b\2\u047a\u047c\7:\2\2\u047b\u047a\3\2\2\2\u047c\u047f\3\2"+
		"\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0480\3\2\2\2\u047f"+
		"\u047d\3\2\2\2\u0480\u0482\5\22\n\2\u0481\u047d\3\2\2\2\u0482\u0483\3"+
		"\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0486\3\2\2\2\u0485"+
		"\u0487\7:\2\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2"+
		"\2\2\u0488\u0489\5T+\2\u0489\u048a\b/\1\2\u048a\u048d\3\2\2\2\u048b\u048d"+
		"\3\2\2\2\u048c\u0463\3\2\2\2\u048c\u0469\3\2\2\2\u048c\u0479\3\2\2\2\u048c"+
		"\u048b\3\2\2\2\u048d]\3\2\2\2\u048e\u0490\5\20\t\2\u048f\u0491\7:\2\2"+
		"\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493"+
		"\5T+\2\u0493\u04b8\3\2\2\2\u0494\u0496\5\20\t\2\u0495\u0497\7:\2\2\u0496"+
		"\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049e\5T"+
		"+\2\u0499\u049c\7:\2\2\u049a\u049d\5`\61\2\u049b\u049d\5\6\4\2\u049c\u049a"+
		"\3\2\2\2\u049c\u049b\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u0499\3\2\2\2\u049f"+
		"\u04a0\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2"+
		"\2\2\u04a2\u04a3\b\60\1\2\u04a3\u04b8\3\2\2\2\u04a4\u04ac\5\20\t\2\u04a5"+
		"\u04a7\7:\2\2\u04a6\u04a5\3\2\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2"+
		"\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\3\2\2\2\u04aa\u04a8\3\2\2\2\u04ab"+
		"\u04ad\5\22\n\2\u04ac\u04a8\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04ac\3"+
		"\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b1\3\2\2\2\u04b0\u04b2\7:\2\2\u04b1"+
		"\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\5T"+
		"+\2\u04b4\u04b5\b\60\1\2\u04b5\u04b8\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7"+
		"\u048e\3\2\2\2\u04b7\u0494\3\2\2\2\u04b7\u04a4\3\2\2\2\u04b7\u04b6\3\2"+
		"\2\2\u04b8_\3\2\2\2\u04b9\u04bd\5\b\5\2\u04ba\u04bd\5\n\6\2\u04bb\u04bd"+
		"\5~@\2\u04bc\u04b9\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bd"+
		"a\3\2\2\2\u04be\u04bf\b\62\1\2\u04bf\u04cf\5f\64\2\u04c0\u04cf\5d\63\2"+
		"\u04c1\u04c3\7+\2\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4"+
		"\3\2\2\2\u04c4\u04c6\7\32\2\2\u04c5\u04c7\7:\2\2\u04c6\u04c5\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\5b\62\2\u04c9\u04cb\7:"+
		"\2\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc"+
		"\u04cd\7\33\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04be\3\2\2\2\u04ce\u04c0\3"+
		"\2\2\2\u04ce\u04c2\3\2\2\2\u04cf\u04ec\3\2\2\2\u04d0\u04d2\f\5\2\2\u04d1"+
		"\u04d3\7:\2\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2"+
		"\2\2\u04d4\u04d6\5\30\r\2\u04d5\u04d7\7:\2\2\u04d6\u04d5\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\5b\62\6\u04d9\u04eb\3\2"+
		"\2\2\u04da\u04dc\f\4\2\2\u04db\u04dd\7:\2\2\u04dc\u04db\3\2\2\2\u04dc"+
		"\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\5\30\r\2\u04df\u04e1\5"+
		"\30\r\2\u04e0\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2"+
		"\u04e3\3\2\2\2\u04e3\u04e5\3\2\2\2\u04e4\u04e6\7:\2\2\u04e5\u04e4\3\2"+
		"\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\5b\62\5\u04e8"+
		"\u04e9\b\62\1\2\u04e9\u04eb\3\2\2\2\u04ea\u04d0\3\2\2\2\u04ea\u04da\3"+
		"\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"c\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f1\5\n\6\2\u04f0\u04f2\7:\2\2\u04f1"+
		"\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\7-"+
		"\2\2\u04f4\u04f6\7:\2\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04f9\3\2\2\2\u04f7\u04fa\5f\64\2\u04f8\u04fa\5\6\4\2\u04f9\u04f7\3\2"+
		"\2\2\u04f9\u04f8\3\2\2\2\u04fa\u050a\3\2\2\2\u04fb\u04fd\5\n\6\2\u04fc"+
		"\u04fe\7:\2\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2"+
		"\2\2\u04ff\u0501\7,\2\2\u0500\u0502\7:\2\2\u0501\u0500\3\2\2\2\u0501\u0502"+
		"\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0506\5f\64\2\u0504\u0506\5\6\4\2\u0505"+
		"\u0503\3\2\2\2\u0505\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\b\63"+
		"\1\2\u0508\u050a\3\2\2\2\u0509\u04ef\3\2\2\2\u0509\u04fb\3\2\2\2\u050a"+
		"e\3\2\2\2\u050b\u050f\5\n\6\2\u050c\u050f\5\b\5\2\u050d\u050f\5T+\2\u050e"+
		"\u050b\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050d\3\2\2\2\u050fg\3\2\2\2"+
		"\u0510\u0512\5l\67\2\u0511\u0513\t\r\2\2\u0512\u0511\3\2\2\2\u0512\u0513"+
		"\3\2\2\2\u0513\u051a\3\2\2\2\u0514\u0516\5n8\2\u0515\u0517\t\r\2\2\u0516"+
		"\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\3\2\2\2\u0518\u0514\3\2"+
		"\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b"+
		"\u0524\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u0521\5p9\2\u051e\u0520\78\2"+
		"\2\u051f\u051e\3\2\2\2\u0520\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522"+
		"\3\2\2\2\u0522\u0525\3\2\2\2\u0523\u0521\3\2\2\2\u0524\u051d\3\2\2\2\u0524"+
		"\u0525\3\2\2\2\u0525i\3\2\2\2\u0526\u0527\7\32\2\2\u0527\u0528\5b\62\2"+
		"\u0528\u052a\7\33\2\2\u0529\u052b\7:\2\2\u052a\u0529\3\2\2\2\u052a\u052b"+
		"\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\7\20\2\2\u052d\u052f\7:\2\2\u052e"+
		"\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0534\7\34"+
		"\2\2\u0531\u0533\7:\2\2\u0532\u0531\3\2\2\2\u0533\u0536\3\2\2\2\u0534"+
		"\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534\3\2"+
		"\2\2\u0537\u0539\5&\24\2\u0538\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053f\3\2\2\2\u053c\u053e\7:"+
		"\2\2\u053d\u053c\3\2\2\2\u053e\u0541\3\2\2\2\u053f\u053d\3\2\2\2\u053f"+
		"\u0540\3\2\2\2\u0540\u0542\3\2\2\2\u0541\u053f\3\2\2\2\u0542\u0543\7\35"+
		"\2\2\u0543k\3\2\2\2\u0544\u0545\7\r\2\2\u0545\u0546\5j\66\2\u0546m\3\2"+
		"\2\2\u0547\u0548\7\17\2\2\u0548\u0549\5j\66\2\u0549o\3\2\2\2\u054a\u054c"+
		"\7\16\2\2\u054b\u054d\7:\2\2\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u0550\7\20\2\2\u054f\u0551\7:\2\2\u0550\u054f\3\2"+
		"\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0556\7\34\2\2\u0553"+
		"\u0555\7:\2\2\u0554\u0553\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2"+
		"\2\2\u0556\u0557\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0559"+
		"\u055b\5&\24\2\u055a\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055a\3\2"+
		"\2\2\u055c\u055d\3\2\2\2\u055d\u0561\3\2\2\2\u055e\u0560\7:\2\2\u055f"+
		"\u055e\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2"+
		"\2\2\u0562\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0565\7\35\2\2\u0565"+
		"q\3\2\2\2\u0566\u0569\5z>\2\u0567\u0569\5|?\2\u0568\u0566\3\2\2\2\u0568"+
		"\u0567\3\2\2\2\u0569s\3\2\2\2\u056a\u056c\t\16\2\2\u056b\u056d\7:\2\2"+
		"\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570"+
		"\5T+\2\u056f\u0571\7:\2\2\u0570\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571"+
		"\u0572\3\2\2\2\u0572\u0576\7\34\2\2\u0573\u0575\7:\2\2\u0574\u0573\3\2"+
		"\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
		"\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057b\5&\24\2\u057a\u0579\3\2"+
		"\2\2\u057b\u057c\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d"+
		"\u0581\3\2\2\2\u057e\u0580\7:\2\2\u057f\u057e\3\2\2\2\u0580\u0583\3\2"+
		"\2\2\u0581\u057f\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583"+
		"\u0581\3\2\2\2\u0584\u0585\7\35\2\2\u0585\u05bf\3\2\2\2\u0586\u0588\t"+
		"\16\2\2\u0587\u0589\7:\2\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u058a\3\2\2\2\u058a\u058c\5T+\2\u058b\u058d\7:\2\2\u058c\u058b\3\2\2"+
		"\2\u058c\u058d\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0592\7\34\2\2\u058f"+
		"\u0591\7:\2\2\u0590\u058f\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2"+
		"\2\2\u0592\u0593\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0595"+
		"\u0597\5&\24\2\u0596\u0595\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0596\3\2"+
		"\2\2\u0598\u0599\3\2\2\2\u0599\u059d\3\2\2\2\u059a\u059c\7:\2\2\u059b"+
		"\u059a\3\2\2\2\u059c\u059f\3\2\2\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2"+
		"\2\2\u059e\u05a0\3\2\2\2\u059f\u059d\3\2\2\2\u05a0\u05a1\b;\1\2\u05a1"+
		"\u05bf\3\2\2\2\u05a2\u05a4\t\16\2\2\u05a3\u05a5\7:\2\2\u05a4\u05a3\3\2"+
		"\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\5T+\2\u05a7\u05a9"+
		"\7:\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ad\3\2\2\2\u05aa"+
		"\u05ac\7:\2\2\u05ab\u05aa\3\2\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab\3\2"+
		"\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0"+
		"\u05b2\5&\24\2\u05b1\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b1\3\2"+
		"\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b8\3\2\2\2\u05b5\u05b7\7:\2\2\u05b6"+
		"\u05b5\3\2\2\2\u05b7\u05ba\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2"+
		"\2\2\u05b9\u05bb\3\2\2\2\u05ba\u05b8\3\2\2\2\u05bb\u05bc\7\35\2\2\u05bc"+
		"\u05bd\b;\1\2\u05bd\u05bf\3\2\2\2\u05be\u056a\3\2\2\2\u05be\u0586\3\2"+
		"\2\2\u05be\u05a2\3\2\2\2\u05bfu\3\2\2\2\u05c0\u05c1\5\4\3\2\u05c1\u05c2"+
		"\7:\2\2\u05c2\u05c4\3\2\2\2\u05c3\u05c0\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05c5\3\2\2\2\u05c5\u05c7\5\n\6\2\u05c6\u05c8\7:\2\2\u05c7\u05c6\3\2"+
		"\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\7,\2\2\u05ca"+
		"\u05cc\7:\2\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2"+
		"\2\2\u05cd\u05ce\5x=\2\u05ce\u05d6\3\2\2\2\u05cf\u05d0\5\4\3\2\u05d0\u05d1"+
		"\7:\2\2\u05d1\u05d2\5\n\6\2\u05d2\u05d3\b<\1\2\u05d3\u05d6\3\2\2\2\u05d4"+
		"\u05d6\5T+\2\u05d5\u05c3\3\2\2\2\u05d5\u05cf\3\2\2\2\u05d5\u05d4\3\2\2"+
		"\2\u05d6w\3\2\2\2\u05d7\u05db\5\b\5\2\u05d8\u05db\5\n\6\2\u05d9\u05db"+
		"\5T+\2\u05da\u05d7\3\2\2\2\u05da\u05d8\3\2\2\2\u05da\u05d9\3\2\2\2\u05db"+
		"y\3\2\2\2\u05dc\u05de\7\25\2\2\u05dd\u05df\7:\2\2\u05de\u05dd\3\2\2\2"+
		"\u05de\u05df\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2\5T+\2\u05e1\u05e3"+
		"\7:\2\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4"+
		"\u05e5\5t;\2\u05e5{\3\2\2\2\u05e6\u05e8\7\21\2\2\u05e7\u05e9\7:\2\2\u05e8"+
		"\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec\5v"+
		"<\2\u05eb\u05ed\7:\2\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee"+
		"\3\2\2\2\u05ee\u05ef\5t;\2\u05ef}\3\2\2\2\u05f0\u05f1\5\n\6\2\u05f1\u05f3"+
		"\7\32\2\2\u05f2\u05f4\5\u0080A\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2"+
		"\2\u05f4\u05f5\3\2\2\2\u05f5\u05f6\7\33\2\2\u05f6\u0605\3\2\2\2\u05f7"+
		"\u05f8\5\n\6\2\u05f8\u05fa\7\32\2\2\u05f9\u05fb\5\u0080A\2\u05fa\u05f9"+
		"\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\7\33\2\2"+
		"\u05fd\u05ff\7\32\2\2\u05fe\u0600\5\u0080A\2\u05ff\u05fe\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\7\33\2\2\u0602\u0603\b"+
		"@\1\2\u0603\u0605\3\2\2\2\u0604\u05f0\3\2\2\2\u0604\u05f7\3\2\2\2\u0605"+
		"\177\3\2\2\2\u0606\u0611\5\u0082B\2\u0607\u0609\7:\2\2\u0608\u0607\3\2"+
		"\2\2\u0608\u0609\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060c\7\62\2\2\u060b"+
		"\u060d\7:\2\2\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e\3\2"+
		"\2\2\u060e\u0610\5\u0082B\2\u060f\u0608\3\2\2\2\u0610\u0613\3\2\2\2\u0611"+
		"\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0081\3\2\2\2\u0613\u0611\3\2"+
		"\2\2\u0614\u061a\5~@\2\u0615\u061a\5\n\6\2\u0616\u061a\5T+\2\u0617\u061a"+
		"\5\6\4\2\u0618\u061a\5\b\5\2\u0619\u0614\3\2\2\2\u0619\u0615\3\2\2\2\u0619"+
		"\u0616\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u0618\3\2\2\2\u061a\u0083\3\2"+
		"\2\2\u061b\u061e\5\u008aF\2\u061c\u061e\5\u008cG\2\u061d\u061b\3\2\2\2"+
		"\u061d\u061c\3\2\2\2\u061e\u0085\3\2\2\2\u061f\u0620\5\n\6\2\u0620\u0622"+
		"\7\32\2\2\u0621\u0623\5\u0088E\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2"+
		"\2\u0623\u0624\3\2\2\2\u0624\u0626\7\33\2\2\u0625\u0627\7:\2\2\u0626\u0625"+
		"\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062c\7\34\2\2"+
		"\u0629\u062b\7:\2\2\u062a\u0629\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a"+
		"\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u062c\3\2\2\2\u062f"+
		"\u0631\5&\24\2\u0630\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0630\3\2"+
		"\2\2\u0632\u0633\3\2\2\2\u0633\u0637\3\2\2\2\u0634\u0636\7:\2\2\u0635"+
		"\u0634\3\2\2\2\u0636\u0639\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0638\3\2"+
		"\2\2\u0638\u063a\3\2\2\2\u0639\u0637\3\2\2\2\u063a\u063e\7\35\2\2\u063b"+
		"\u063d\78\2\2\u063c\u063b\3\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c\3\2"+
		"\2\2\u063e\u063f\3\2\2\2\u063f\u0087\3\2\2\2\u0640\u063e\3\2\2\2\u0641"+
		"\u0644\5\4\3\2\u0642\u0643\7\36\2\2\u0643\u0645\7\37\2\2\u0644\u0642\3"+
		"\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\7:\2\2\u0647"+
		"\u064f\5\n\6\2\u0648\u064a\7\62\2\2\u0649\u064b\7:\2\2\u064a\u0649\3\2"+
		"\2\2\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064e\5\u0088E\2\u064d"+
		"\u0648\3\2\2\2\u064e\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2"+
		"\2\2\u0650\u0089\3\2\2\2\u0651\u064f\3\2\2\2\u0652\u0654\7\13\2\2\u0653"+
		"\u0655\7:\2\2\u0654\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\3\2"+
		"\2\2\u0656\u0657\7\n\2\2\u0657\u0658\7:\2\2\u0658\u0659\5\u0086D\2\u0659"+
		"\u008b\3\2\2\2\u065a\u065c\7\13\2\2\u065b\u065d\7:\2\2\u065c\u065b\3\2"+
		"\2\2\u065c\u065d\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0661\5\4\3\2\u065f"+
		"\u0660\7\36\2\2\u0660\u0662\7\37\2\2\u0661\u065f\3\2\2\2\u0661\u0662\3"+
		"\2\2\2\u0662\u0663\3\2\2\2\u0663\u0664\7:\2\2\u0664\u0665\5\u0086D\2\u0665"+
		"\u008d\3\2\2\2\u0666\u066a\7\34\2\2\u0667\u0669\7:\2\2\u0668\u0667\3\2"+
		"\2\2\u0669\u066c\3\2\2\2\u066a\u0668\3\2\2\2\u066a\u066b\3\2\2\2\u066b"+
		"\u066e\3\2\2\2\u066c\u066a\3\2\2\2\u066d\u066f\5&\24\2\u066e\u066d\3\2"+
		"\2\2\u066f\u0670\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671"+
		"\u0675\3\2\2\2\u0672\u0674\7:\2\2\u0673\u0672\3\2\2\2\u0674\u0677\3\2"+
		"\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677"+
		"\u0675\3\2\2\2\u0678\u0679\7\35\2\2\u0679\u008f\3\2\2\2\u067a\u067b\5"+
		"\u0092J\2\u067b\u067c\5\u0094K\2\u067c\u0091\3\2\2\2\u067d\u067e\7\f\2"+
		"\2\u067e\u067f\7\32\2\2\u067f\u0683\7\33\2\2\u0680\u0682\7:\2\2\u0681"+
		"\u0680\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2"+
		"\2\2\u0684\u0695\3\2\2\2\u0685\u0683\3\2\2\2\u0686\u0688\7\f\2\2\u0687"+
		"\u0689\7\32\2\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\3"+
		"\2\2\2\u068a\u068c\7\33\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c"+
		"\u0690\3\2\2\2\u068d\u068f\7:\2\2\u068e\u068d\3\2\2\2\u068f\u0692\3\2"+
		"\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0693\3\2\2\2\u0692"+
		"\u0690\3\2\2\2\u0693\u0695\bJ\1\2\u0694\u067d\3\2\2\2\u0694\u0686\3\2"+
		"\2\2\u0695\u0093\3\2\2\2\u0696\u069a\5\u0096L\2\u0697\u0699\7:\2\2\u0698"+
		"\u0697\3\2\2\2\u0699\u069c\3\2\2\2\u069a\u0698\3\2\2\2\u069a\u069b\3\2"+
		"\2\2\u069b\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069d\u069f\5&\24\2\u069e"+
		"\u069d\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u069e\3\2\2\2\u06a0\u06a1\3\2"+
		"\2\2\u06a1\u06a5\3\2\2\2\u06a2\u06a4\7:\2\2\u06a3\u06a2\3\2\2\2\u06a4"+
		"\u06a7\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8\3\2"+
		"\2\2\u06a7\u06a5\3\2\2\2\u06a8\u06a9\5\u0098M\2\u06a9\u0095\3\2\2\2\u06aa"+
		"\u06ad\7\34\2\2\u06ab\u06ad\bL\1\2\u06ac\u06aa\3\2\2\2\u06ac\u06ab\3\2"+
		"\2\2\u06ad\u0097\3\2\2\2\u06ae\u06b1\7\35\2\2\u06af\u06b1\bM\1\2\u06b0"+
		"\u06ae\3\2\2\2\u06b0\u06af\3\2\2\2\u06b1\u0099\3\2\2\2\u0124\u009e\u00a3"+
		"\u00a9\u00b0\u00b6\u00c2\u00c4\u00c9\u00ce\u00d4\u00d7\u00da\u00df\u00e1"+
		"\u00e6\u00ec\u00f1\u00f7\u00ff\u0107\u010f\u0119\u0129\u012d\u0132\u0138"+
		"\u013f\u0143\u0148\u014e\u0156\u015a\u015f\u0165\u016c\u0170\u0175\u017b"+
		"\u0185\u0189\u018e\u0194\u019b\u019f\u01a4\u01aa\u01b4\u01b8\u01bd\u01c3"+
		"\u01ca\u01ce\u01d3\u01d9\u01e2\u01e6\u01eb\u01f1\u01f9\u01fd\u0202\u0208"+
		"\u020f\u0213\u0218\u021e\u0227\u022b\u0230\u0236\u023e\u0242\u0247\u024d"+
		"\u0254\u0258\u025d\u0263\u0268\u026e\u0276\u027a\u027e\u0281\u0285\u0289"+
		"\u028c\u0290\u0296\u029a\u029f\u02a4\u02a8\u02ae\u02b2\u02b7\u02c2\u02c6"+
		"\u02ca\u02d7\u02db\u02df\u02e2\u02e6\u02ea\u02ee\u02f4\u02f8\u02fc\u02ff"+
		"\u0303\u0307\u030b\u0313\u0317\u031a\u031f\u0323\u032f\u0333\u0337\u033b"+
		"\u0343\u0349\u034d\u0351\u0355\u035b\u035f\u0365\u036e\u0372\u0376\u037a"+
		"\u037e\u0384\u0387\u038d\u0390\u0393\u0398\u039d\u03a2\u03a7\u03ad\u03af"+
		"\u03b6\u03c5\u03d1\u03d8\u03dc\u03e2\u03e6\u03ea\u03f0\u03f4\u03f9\u0400"+
		"\u0403\u0407\u040e\u0416\u041a\u041d\u0422\u0426\u0429\u042d\u0430\u0437"+
		"\u043a\u043e\u0445\u0449\u044e\u0455\u0458\u045c\u0461\u0465\u046b\u0471"+
		"\u0475\u047d\u0483\u0486\u048c\u0490\u0496\u049c\u04a0\u04a8\u04ae\u04b1"+
		"\u04b7\u04bc\u04c2\u04c6\u04ca\u04ce\u04d2\u04d6\u04dc\u04e2\u04e5\u04ea"+
		"\u04ec\u04f1\u04f5\u04f9\u04fd\u0501\u0505\u0509\u050e\u0512\u0516\u051a"+
		"\u0521\u0524\u052a\u052e\u0534\u053a\u053f\u054c\u0550\u0556\u055c\u0561"+
		"\u0568\u056c\u0570\u0576\u057c\u0581\u0588\u058c\u0592\u0598\u059d\u05a4"+
		"\u05a8\u05ad\u05b3\u05b8\u05be\u05c3\u05c7\u05cb\u05d5\u05da\u05de\u05e2"+
		"\u05e8\u05ec\u05f3\u05fa\u05ff\u0604\u0608\u060c\u0611\u0619\u061d\u0622"+
		"\u0626\u062c\u0632\u0637\u063e\u0644\u064a\u064f\u0654\u065c\u0661\u066a"+
		"\u0670\u0675\u0683\u0688\u068b\u0690\u0694\u069a\u06a0\u06a5\u06ac\u06b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}