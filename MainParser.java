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
		RULE_if_statement = 52, RULE_else_if_statement = 53, RULE_else_statement = 54, 
		RULE_loop_statement = 55, RULE_loop_structure = 56, RULE_loop_variable_declaration = 57, 
		RULE_loop_expression = 58, RULE_while_statement = 59, RULE_for_statement = 60, 
		RULE_function_calling = 61, RULE_function_parameters = 62, RULE_function_paremeters_value = 63, 
		RULE_function_declaration = 64, RULE_function_structure = 65, RULE_function_declaration_parameters = 66, 
		RULE_void_function = 67, RULE_non_void_function = 68, RULE_scoping_statement = 69, 
		RULE_main_function = 70, RULE_main_head = 71, RULE_main_body = 72, RULE_main_body_first = 73, 
		RULE_main_body_second = 74;
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
			"conditional_statement", "conditional_comparison_structure", "if_statement", 
			"else_if_statement", "else_statement", "loop_statement", "loop_structure", 
			"loop_variable_declaration", "loop_expression", "while_statement", "for_statement", 
			"function_calling", "function_parameters", "function_paremeters_value", 
			"function_declaration", "function_structure", "function_declaration_parameters", 
			"void_function", "non_void_function", "scoping_statement", "main_function", 
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(150);
				function_declaration();
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(162);
				match(WHITE_SPACE);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			main_function();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(169);
				match(NEWLINE);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(175);
				match(WHITE_SPACE);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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
			setState(183);
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
			setState(185);
			match(T__0);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(186);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(187);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(188);
					label();
					}
					break;
				case 4:
					{
					setState(189);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(194);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(196);
					match(MINUS);
					}
				}

				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(199);
					match(DIGIT);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(205);
				match(DOT);
				setState(207); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(206);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(209); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(211);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(214);
					match(MINUS);
					}
				}

				setState(218); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(217);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(220); 
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
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(224);
				label_words();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
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
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					label_words();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					label();
					}
					} 
				}
				setState(246);
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
			setState(252);
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
				setState(247);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(248);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(249);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(250);
				variable_type();
				}
				break;
			case DIGIT:
				{
				setState(251);
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
			setState(254);
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
			setState(256);
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
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(258);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(259);
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
			setState(262);
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
			setState(264);
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
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(266);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(267);
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
			setState(278);
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
				setState(270);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(271);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(272);
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
				setState(273);
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
				setState(274);
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
				setState(275);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(276);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(277);
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
			setState(280);
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
			setState(282);
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
			setState(284);
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
			setState(286);
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
			setState(288);
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
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				conditional_statement();
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(291);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(297);
					match(LINECOMMENT);
					}
					break;
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						match(NEWLINE);
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				loop_statement();
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(313);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(319);
					match(LINECOMMENT);
					}
					break;
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(322);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(328);
						match(NEWLINE);
						}
						} 
					}
					setState(333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				print_statement();
				setState(335);
				match(SEMICOLON);
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(336);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(342);
					match(LINECOMMENT);
					}
					break;
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(351);
						match(NEWLINE);
						}
						} 
					}
					setState(356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				print_statement();
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(358);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(363);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(364);
					match(LINECOMMENT);
					}
					break;
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(367);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(373);
						match(NEWLINE);
						}
						} 
					}
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(381);
				scan_statement();
				setState(382);
				match(SEMICOLON);
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(383);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(389);
					match(LINECOMMENT);
					}
					break;
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(392);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(397);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						match(NEWLINE);
						}
						} 
					}
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				scan_statement();
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(405);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(411);
					match(LINECOMMENT);
					}
					break;
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(414);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(419);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(420);
						match(NEWLINE);
						}
						} 
					}
					setState(425);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				return_statement();
				setState(429);
				match(SEMICOLON);
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(430);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(436);
					match(LINECOMMENT);
					}
					break;
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(439);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(444);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(445);
						match(NEWLINE);
						}
						} 
					}
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				return_statement();
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(452);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(457);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(458);
					match(LINECOMMENT);
					}
					break;
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(461);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(466);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(467);
						match(NEWLINE);
						}
						} 
					}
					setState(472);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(475);
				constant_declaration();
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(476);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(481);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(482);
					match(LINECOMMENT);
					}
					break;
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(491);
						match(NEWLINE);
						}
						} 
					}
					setState(496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(497);
				any_declaration();
				setState(498);
				match(SEMICOLON);
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(499);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(505);
					match(LINECOMMENT);
					}
					break;
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(508);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(513);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(514);
						match(NEWLINE);
						}
						} 
					}
					setState(519);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(520);
				any_declaration();
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(521);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(526);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(527);
					match(LINECOMMENT);
					}
					break;
				}
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(530);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(535);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(536);
						match(NEWLINE);
						}
						} 
					}
					setState(541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(544);
				scoping_statement();
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(545);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(550);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(551);
					match(LINECOMMENT);
					}
					break;
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(554);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(559);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(560);
						match(NEWLINE);
						}
						} 
					}
					setState(565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(566);
				function_calling();
				setState(567);
				match(SEMICOLON);
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(568);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(574);
					match(LINECOMMENT);
					}
					break;
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(577);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(582);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(583);
						match(NEWLINE);
						}
						} 
					}
					setState(588);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(589);
				function_calling();
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(590);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(596);
					match(LINECOMMENT);
					}
					break;
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(599);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(605);
						match(NEWLINE);
						}
						} 
					}
					setState(610);
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
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
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
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(621);
				string();
				}
				break;
			case 2:
				{
				setState(622);
				number();
				}
				break;
			case 3:
				{
				setState(623);
				label();
				}
				break;
			case 4:
				{
				setState(624);
				expression();
				}
				break;
			case 5:
				{
				setState(625);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(626);
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
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				label();
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(630);
						match(WHITE_SPACE);
						}
					}

					setState(633);
					match(ASSIGN);
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(634);
						match(WHITE_SPACE);
						}
					}

					setState(637);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				label();
				setState(649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(641);
						match(WHITE_SPACE);
						}
					}

					setState(644);
					match(EQUAL);
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(645);
						match(WHITE_SPACE);
						}
					}

					setState(648);
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
			setState(655);
			variable_type();
			setState(656);
			match(WHITE_SPACE);
			setState(657);
			multiple_declaration();
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(658);
						match(WHITE_SPACE);
						}
					}

					setState(661);
					match(COMMA);
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(662);
						match(WHITE_SPACE);
						}
					}

					setState(665);
					multiple_declaration();
					}
					} 
				}
				setState(670);
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
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				label();
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(672);
					match(WHITE_SPACE);
					}
				}

				setState(675);
				match(ASSIGN);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(676);
					match(WHITE_SPACE);
					}
				}

				setState(679);
				assigned_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				label();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(682);
					match(WHITE_SPACE);
					}
				}

				setState(685);
				match(EQUAL);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(686);
					match(WHITE_SPACE);
					}
				}

				setState(689);
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
			setState(694);
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
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				label();
				setState(697);
				match(OPEN_BRACE);
				setState(698);
				array_size();
				setState(699);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				label();
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(702);
					match(OPEN_BRACE);
					}
				}

				setState(705);
				array_size();
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(706);
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
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(CREATE);
				setState(714);
				match(WHITE_SPACE);
				setState(715);
				variable_type();
				setState(716);
				match(OPEN_BRACE);
				setState(717);
				array_size();
				setState(718);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(CREATE);
				setState(721);
				match(WHITE_SPACE);
				setState(722);
				variable_type();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(723);
					match(OPEN_BRACE);
					}
				}

				setState(726);
				array_size();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(727);
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
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				array_assign_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(742);
					match(WHITE_SPACE);
					}
				}

				setState(745);
				match(EQUAL);
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
				array_assign_body();
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(752);
					match(WHITE_SPACE);
					}
				}

				setState(755);
				match(ASSIGN);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(756);
					match(WHITE_SPACE);
					}
				}

				setState(761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(759);
					array_variable();
					}
					break;
				case 2:
					{
					setState(760);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(763);
					match(WHITE_SPACE);
					}
				}

				setState(766);
				match(EQUAL);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(767);
					match(WHITE_SPACE);
					}
				}

				setState(772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(770);
					array_variable();
					}
					break;
				case 2:
					{
					setState(771);
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
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				variable_type();
				setState(779);
				match(OPEN_BRACE);
				setState(780);
				match(CLOSE_BRACE);
				setState(781);
				match(WHITE_SPACE);
				setState(782);
				label();
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(783);
					array_assign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				variable_type();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(787);
					match(OPEN_BRACE);
					}
				}

				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(790);
					match(CLOSE_BRACE);
					}
				}

				setState(793);
				match(WHITE_SPACE);
				setState(794);
				label();
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(795);
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
			setState(802);
			array_variable();
			setState(803);
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
			setState(805);
			match(PRINT);
			setState(806);
			match(OPEN_PAREN);
			setState(807);
			value_print();
			setState(808);
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
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				extended_value_print();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==WHITE_SPACE) {
					{
					{
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(811);
						match(WHITE_SPACE);
						}
					}

					setState(814);
					match(PLUS);
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(815);
						match(WHITE_SPACE);
						}
					}

					setState(818);
					extended_value_print();
					setState(820);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(819);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				label();
				setState(830); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(828);
					match(WHITE_SPACE);
					setState(829);
					label();
					}
					}
					setState(832); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITE_SPACE );
				notifyErrorListeners("No double quotes");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				extended_value_print();
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(838);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(837);
							match(WHITE_SPACE);
							}
						}

						setState(840);
						match(PLUS);
						setState(842);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(841);
							match(WHITE_SPACE);
							}
						}

						setState(844);
						extended_value_print();
						setState(846);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(845);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(852);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(854); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(853);
					match(PLUS);
					}
					}
					setState(856); 
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
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
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
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(SCAN);
				setState(869);
				match(OPEN_PAREN);
				setState(870);
				scan_body();
				setState(871);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(SCAN);
				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(874);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(877);
				scan_body();
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(878);
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
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				display_message_parameter();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(886);
					match(WHITE_SPACE);
					}
				}

				setState(889);
				match(COMMA);
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(890);
					match(WHITE_SPACE);
					}
				}

				setState(893);
				value_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				display_message_parameter();
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(896);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(899);
					match(COMMA);
					}
				}

				notifyErrorListeners("Missing 2nd scan parameter");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				display_message_parameter();
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(905);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(908);
					match(COMMA);
					}
				}

				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(911);
					match(WHITE_SPACE);
					}
				}

				setState(914);
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
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
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
				setState(922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(920);
					expression();
					}
					break;
				case 2:
					{
					setState(921);
					scan_label();
					}
					break;
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(924);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(929);
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
			setState(938); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(938);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						setState(934);
						match(DIGIT);
						}
						break;
					case 2:
						{
						setState(935);
						lexer_predefined_words();
						}
						break;
					case 3:
						{
						setState(936);
						label();
						}
						break;
					case 4:
						{
						setState(937);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(940); 
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
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
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
			setState(949);
			match(CONSTANT);
			setState(950);
			match(WHITE_SPACE);
			setState(951);
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
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				match(RETURN);
				setState(954);
				match(WHITE_SPACE);
				setState(955);
				return_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(RETURN);
				setState(957);
				match(WHITE_SPACE);
				setState(958);
				return_value();
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(959);
					match(WHITE_SPACE);
					}
					}
					setState(964);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(965);
				match(OPEN_PAREN);
				setState(966);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(969);
				match(RETURN);
				setState(970);
				match(WHITE_SPACE);
				setState(971);
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
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(976);
				string();
				}
				break;
			case 2:
				{
				setState(977);
				number();
				}
				break;
			case 3:
				{
				setState(978);
				label();
				}
				break;
			case 4:
				{
				setState(979);
				expression();
				}
				break;
			case 5:
				{
				setState(980);
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
			setState(983);
			parenthesis_expression();
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(984);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(987);
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
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				first_expression_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
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
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(OPEN_PAREN);
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(994);
					match(WHITE_SPACE);
					}
				}

				setState(997);
				expression();
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(998);
					match(WHITE_SPACE);
					}
				}

				setState(1001);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				match(OPEN_PAREN);
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1004);
					match(WHITE_SPACE);
					}
				}

				setState(1007);
				expression();
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1008);
					match(WHITE_SPACE);
					}
				}

				setState(1012); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1011);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1014); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("uneven parenthesis, duplicate ')'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1019); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1018);
						match(OPEN_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1021); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1023);
					match(WHITE_SPACE);
					}
				}

				setState(1026);
				expression();
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1027);
					match(WHITE_SPACE);
					}
				}

				setState(1030);
				match(CLOSE_PAREN);
				notifyErrorListeners("uneven parenthesis, duplicate '('");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1033);
				value_expression();
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1034);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1037);
				operator_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1039);
				value_expression();
				setState(1045); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1040);
						match(WHITE_SPACE);
						setState(1043);
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
						case DOT:
						case UNDERSCORE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1041);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1042);
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
					setState(1047); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1050);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1049);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1052);
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
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				first_operators();
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1058);
					match(WHITE_SPACE);
					}
				}

				setState(1061);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				setState(1073); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1068);
						match(WHITE_SPACE);
						setState(1071);
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
						case DOT:
						case UNDERSCORE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1069);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1070);
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
					setState(1075); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				first_operators();
				setState(1087); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1083);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1080);
							match(WHITE_SPACE);
							}
							}
							setState(1085);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1086);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1089); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1091);
					match(WHITE_SPACE);
					}
				}

				setState(1094);
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
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				second_operators();
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1101);
					match(WHITE_SPACE);
					}
				}

				setState(1104);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				setState(1116); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1111);
						match(WHITE_SPACE);
						setState(1114);
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
						case DOT:
						case UNDERSCORE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1112);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1113);
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
					setState(1118); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				second_operators();
				setState(1130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1126);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1123);
							match(WHITE_SPACE);
							}
							}
							setState(1128);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1129);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1134);
					match(WHITE_SPACE);
					}
				}

				setState(1137);
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
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1145);
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
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1149);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(1150);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1151);
					match(NOT);
					}
				}

				setState(1154);
				match(OPEN_PAREN);
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
				comparison_statement(0);
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1159);
					match(WHITE_SPACE);
					}
				}

				setState(1162);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1166);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1168);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1167);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1170);
						other_operators();
						}
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
						comparison_statement(4);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1177);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1180);
						other_operators();
						setState(1182); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1181);
							other_operators();
							}
							}
							setState(1184); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR))) != 0) );
						}
						setState(1187);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1186);
							match(WHITE_SPACE);
							}
						}

						setState(1189);
						comparison_statement(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1196);
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
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				label();
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
				match(EQUAL);
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1202);
					match(WHITE_SPACE);
					}
				}

				setState(1207);
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
				case DOT:
				case UNDERSCORE:
				case LOWERCASE:
				case UPPERCASE:
				case DIGIT:
					{
					setState(1205);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(1206);
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
				setState(1209);
				label();
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1210);
					match(WHITE_SPACE);
					}
				}

				setState(1213);
				match(ASSIGN);
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1214);
					match(WHITE_SPACE);
					}
				}

				setState(1219);
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
				case DOT:
				case UNDERSCORE:
				case LOWERCASE:
				case UPPERCASE:
				case DIGIT:
					{
					setState(1217);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(1218);
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
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1227);
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
			setState(1230);
			if_statement();
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1231);
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
			setState(1240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1234);
					else_if_statement();
					setState(1236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
					case 1:
						{
						setState(1235);
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
				setState(1242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1243);
				else_statement();
				setState(1247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1244);
						match(NEWLINE);
						}
						} 
					}
					setState(1249);
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
		enterRule(_localctx, 102, RULE_conditional_comparison_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(OPEN_PAREN);
			setState(1253);
			comparison_statement(0);
			setState(1254);
			match(CLOSE_PAREN);
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1255);
				match(WHITE_SPACE);
				}
			}

			setState(1258);
			match(THEN);
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1259);
				match(WHITE_SPACE);
				}
			}

			setState(1262);
			match(OPEN_BRACKET);
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1263);
				match(WHITE_SPACE);
				}
				}
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1269);
				statements();
				}
				}
				setState(1272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1274);
				match(WHITE_SPACE);
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1280);
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
		enterRule(_localctx, 104, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(IF);
			setState(1283);
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
		enterRule(_localctx, 106, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(ELSE_IF);
			setState(1286);
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
		enterRule(_localctx, 108, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(ELSE);
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1289);
				match(WHITE_SPACE);
				}
			}

			setState(1292);
			match(THEN);
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1293);
				match(WHITE_SPACE);
				}
			}

			setState(1296);
			match(OPEN_BRACKET);
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1297);
				match(WHITE_SPACE);
				}
				}
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1303);
				statements();
				}
				}
				setState(1306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1308);
				match(WHITE_SPACE);
				}
				}
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1314);
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
		enterRule(_localctx, 110, RULE_loop_statement);
		try {
			setState(1318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
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
		enterRule(_localctx, 112, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1321);
					match(WHITE_SPACE);
					}
				}

				setState(1324);
				expression();
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1325);
					match(WHITE_SPACE);
					}
				}

				setState(1328);
				match(OPEN_BRACKET);
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1329);
					match(WHITE_SPACE);
					}
					}
					setState(1334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1335);
					statements();
					}
					}
					setState(1338); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1340);
					match(WHITE_SPACE);
					}
					}
					setState(1345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1346);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1348);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1349);
					match(WHITE_SPACE);
					}
				}

				setState(1352);
				expression();
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
				match(OPEN_BRACKET);
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1357);
					match(WHITE_SPACE);
					}
					}
					setState(1362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1364); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1363);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1366); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1368);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				}
				notifyErrorListeners("Missing closing curly brackets");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1376);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1377);
					match(WHITE_SPACE);
					}
				}

				setState(1380);
				expression();
				setState(1382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1381);
					match(WHITE_SPACE);
					}
					break;
				}
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
				setState(1391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1390);
					statements();
					}
					}
					setState(1393); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1395);
					match(WHITE_SPACE);
					}
					}
					setState(1400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1401);
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
		enterRule(_localctx, 114, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(1427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1406);
					variable_type();
					setState(1407);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1411);
				label();
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1412);
					match(WHITE_SPACE);
					}
				}

				setState(1415);
				match(ASSIGN);
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1416);
					match(WHITE_SPACE);
					}
				}

				setState(1419);
				loop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				variable_type();
				setState(1422);
				match(WHITE_SPACE);
				setState(1423);
				label();
				notifyErrorListeners("Missing assignment operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1426);
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
		enterRule(_localctx, 116, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1429);
				number();
				}
				break;
			case 2:
				{
				setState(1430);
				label();
				}
				break;
			case 3:
				{
				setState(1431);
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
		enterRule(_localctx, 118, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			match(WHILE);
			setState(1436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1435);
				match(WHITE_SPACE);
				}
			}

			setState(1438);
			expression();
			setState(1440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1439);
				match(WHITE_SPACE);
				}
			}

			setState(1442);
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
		enterRule(_localctx, 120, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(FOR);
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1445);
				match(WHITE_SPACE);
				}
			}

			setState(1448);
			loop_variable_declaration();
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1449);
				match(WHITE_SPACE);
				}
			}

			setState(1452);
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
		enterRule(_localctx, 122, RULE_function_calling);
		int _la;
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				label();
				setState(1455);
				match(OPEN_PAREN);
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1456);
					function_parameters();
					}
				}

				setState(1459);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				label();
				setState(1462);
				match(OPEN_PAREN);
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1463);
					function_parameters();
					}
				}

				setState(1466);
				match(CLOSE_PAREN);
				setState(1467);
				match(OPEN_PAREN);
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1468);
					function_parameters();
					}
				}

				setState(1471);
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
		enterRule(_localctx, 124, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			function_paremeters_value();
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==WHITE_SPACE) {
				{
				{
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1477);
					match(WHITE_SPACE);
					}
				}

				setState(1480);
				match(COMMA);
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1481);
					match(WHITE_SPACE);
					}
				}

				setState(1484);
				function_paremeters_value();
				}
				}
				setState(1489);
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
		enterRule(_localctx, 126, RULE_function_paremeters_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1490);
				function_calling();
				}
				break;
			case 2:
				{
				setState(1491);
				label();
				}
				break;
			case 3:
				{
				setState(1492);
				expression();
				}
				break;
			case 4:
				{
				setState(1493);
				string();
				}
				break;
			case 5:
				{
				setState(1494);
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
		enterRule(_localctx, 128, RULE_function_declaration);
		try {
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
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
		enterRule(_localctx, 130, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			label();
			setState(1502);
			match(OPEN_PAREN);
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(1503);
				function_declaration_parameters();
				}
			}

			setState(1506);
			match(CLOSE_PAREN);
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1507);
				match(WHITE_SPACE);
				}
			}

			setState(1510);
			match(OPEN_BRACKET);
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1511);
				match(WHITE_SPACE);
				}
				}
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1517);
				statements();
				}
				}
				setState(1520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1522);
				match(WHITE_SPACE);
				}
				}
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1528);
			match(CLOSE_BRACKET);
			setState(1532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1529);
				match(NEWLINE);
				}
				}
				setState(1534);
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
		enterRule(_localctx, 132, RULE_function_declaration_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			variable_type();
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1536);
				match(OPEN_BRACE);
				setState(1537);
				match(CLOSE_BRACE);
				}
			}

			setState(1540);
			match(WHITE_SPACE);
			setState(1541);
			label();
			setState(1549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1542);
					match(COMMA);
					setState(1544);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(1543);
						match(WHITE_SPACE);
						}
					}

					setState(1546);
					function_declaration_parameters();
					}
					} 
				}
				setState(1551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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
		enterRule(_localctx, 134, RULE_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(FUNC);
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1553);
				match(WHITE_SPACE);
				}
			}

			setState(1556);
			match(VOID);
			setState(1557);
			match(WHITE_SPACE);
			setState(1558);
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
		enterRule(_localctx, 136, RULE_non_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			match(FUNC);
			setState(1562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1561);
				match(WHITE_SPACE);
				}
			}

			setState(1564);
			variable_type();
			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1565);
				match(OPEN_BRACE);
				setState(1566);
				match(CLOSE_BRACE);
				}
			}

			setState(1569);
			match(WHITE_SPACE);
			setState(1570);
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
		enterRule(_localctx, 138, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			match(OPEN_BRACKET);
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1573);
				match(WHITE_SPACE);
				}
				}
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1580); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1579);
				statements();
				}
				}
				setState(1582); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1584);
				match(WHITE_SPACE);
				}
				}
				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1590);
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
		enterRule(_localctx, 140, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			main_head();
			setState(1593);
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
		enterRule(_localctx, 142, RULE_main_head);
		int _la;
		try {
			int _alt;
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1595);
				match(MAIN);
				setState(1596);
				match(OPEN_PAREN);
				setState(1597);
				match(CLOSE_PAREN);
				setState(1601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1598);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1603);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
				match(MAIN);
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(1605);
					match(OPEN_PAREN);
					}
				}

				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1608);
					match(CLOSE_PAREN);
					}
				}

				setState(1614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1611);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
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
		enterRule(_localctx, 144, RULE_main_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			main_body_first();
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1621);
				match(WHITE_SPACE);
				}
				}
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1628); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1627);
				statements();
				}
				}
				setState(1630); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(1635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1632);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			}
			setState(1638);
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
		enterRule(_localctx, 146, RULE_main_body_first);
		try {
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1640);
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
		enterRule(_localctx, 148, RULE_main_body_second);
		try {
			setState(1646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0673\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\7\2\u009b\n\2\f\2\16\2\u009e\13\2\7\2\u00a0"+
		"\n\2\f\2\16\2\u00a3\13\2\3\2\7\2\u00a6\n\2\f\2\16\2\u00a9\13\2\3\2\3\2"+
		"\7\2\u00ad\n\2\f\2\16\2\u00b0\13\2\3\2\7\2\u00b3\n\2\f\2\16\2\u00b6\13"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4\u00c1\n\4\r\4\16\4\u00c2\3"+
		"\4\3\4\3\5\5\5\u00c8\n\5\3\5\7\5\u00cb\n\5\f\5\16\5\u00ce\13\5\3\5\3\5"+
		"\6\5\u00d2\n\5\r\5\16\5\u00d3\3\5\5\5\u00d7\n\5\3\5\5\5\u00da\n\5\3\5"+
		"\6\5\u00dd\n\5\r\5\16\5\u00de\5\5\u00e1\n\5\3\6\7\6\u00e4\n\6\f\6\16\6"+
		"\u00e7\13\6\3\6\6\6\u00ea\n\6\r\6\16\6\u00eb\3\6\7\6\u00ef\n\6\f\6\16"+
		"\6\u00f2\13\6\3\6\7\6\u00f5\n\6\f\6\16\6\u00f8\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00ff\n\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u0107\n\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\5\r\u010f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0119\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\7\24\u0127\n\24\f\24\16\24\u012a\13\24\3\24\5\24\u012d\n\24\3\24\7\24"+
		"\u0130\n\24\f\24\16\24\u0133\13\24\3\24\7\24\u0136\n\24\f\24\16\24\u0139"+
		"\13\24\3\24\3\24\7\24\u013d\n\24\f\24\16\24\u0140\13\24\3\24\5\24\u0143"+
		"\n\24\3\24\7\24\u0146\n\24\f\24\16\24\u0149\13\24\3\24\7\24\u014c\n\24"+
		"\f\24\16\24\u014f\13\24\3\24\3\24\3\24\7\24\u0154\n\24\f\24\16\24\u0157"+
		"\13\24\3\24\5\24\u015a\n\24\3\24\7\24\u015d\n\24\f\24\16\24\u0160\13\24"+
		"\3\24\7\24\u0163\n\24\f\24\16\24\u0166\13\24\3\24\3\24\7\24\u016a\n\24"+
		"\f\24\16\24\u016d\13\24\3\24\5\24\u0170\n\24\3\24\7\24\u0173\n\24\f\24"+
		"\16\24\u0176\13\24\3\24\7\24\u0179\n\24\f\24\16\24\u017c\13\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u0183\n\24\f\24\16\24\u0186\13\24\3\24\5\24\u0189"+
		"\n\24\3\24\7\24\u018c\n\24\f\24\16\24\u018f\13\24\3\24\7\24\u0192\n\24"+
		"\f\24\16\24\u0195\13\24\3\24\3\24\7\24\u0199\n\24\f\24\16\24\u019c\13"+
		"\24\3\24\5\24\u019f\n\24\3\24\7\24\u01a2\n\24\f\24\16\24\u01a5\13\24\3"+
		"\24\7\24\u01a8\n\24\f\24\16\24\u01ab\13\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u01b2\n\24\f\24\16\24\u01b5\13\24\3\24\5\24\u01b8\n\24\3\24\7\24\u01bb"+
		"\n\24\f\24\16\24\u01be\13\24\3\24\7\24\u01c1\n\24\f\24\16\24\u01c4\13"+
		"\24\3\24\3\24\7\24\u01c8\n\24\f\24\16\24\u01cb\13\24\3\24\5\24\u01ce\n"+
		"\24\3\24\7\24\u01d1\n\24\f\24\16\24\u01d4\13\24\3\24\7\24\u01d7\n\24\f"+
		"\24\16\24\u01da\13\24\3\24\3\24\3\24\3\24\7\24\u01e0\n\24\f\24\16\24\u01e3"+
		"\13\24\3\24\5\24\u01e6\n\24\3\24\7\24\u01e9\n\24\f\24\16\24\u01ec\13\24"+
		"\3\24\7\24\u01ef\n\24\f\24\16\24\u01f2\13\24\3\24\3\24\3\24\7\24\u01f7"+
		"\n\24\f\24\16\24\u01fa\13\24\3\24\5\24\u01fd\n\24\3\24\7\24\u0200\n\24"+
		"\f\24\16\24\u0203\13\24\3\24\7\24\u0206\n\24\f\24\16\24\u0209\13\24\3"+
		"\24\3\24\7\24\u020d\n\24\f\24\16\24\u0210\13\24\3\24\5\24\u0213\n\24\3"+
		"\24\7\24\u0216\n\24\f\24\16\24\u0219\13\24\3\24\7\24\u021c\n\24\f\24\16"+
		"\24\u021f\13\24\3\24\3\24\3\24\3\24\7\24\u0225\n\24\f\24\16\24\u0228\13"+
		"\24\3\24\5\24\u022b\n\24\3\24\7\24\u022e\n\24\f\24\16\24\u0231\13\24\3"+
		"\24\7\24\u0234\n\24\f\24\16\24\u0237\13\24\3\24\3\24\3\24\7\24\u023c\n"+
		"\24\f\24\16\24\u023f\13\24\3\24\5\24\u0242\n\24\3\24\7\24\u0245\n\24\f"+
		"\24\16\24\u0248\13\24\3\24\7\24\u024b\n\24\f\24\16\24\u024e\13\24\3\24"+
		"\3\24\7\24\u0252\n\24\f\24\16\24\u0255\13\24\3\24\5\24\u0258\n\24\3\24"+
		"\7\24\u025b\n\24\f\24\16\24\u025e\13\24\3\24\7\24\u0261\n\24\f\24\16\24"+
		"\u0264\13\24\3\24\3\24\5\24\u0268\n\24\3\25\3\25\3\25\3\25\5\25\u026e"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0276\n\26\3\27\3\27\5\27\u027a"+
		"\n\27\3\27\3\27\5\27\u027e\n\27\3\27\5\27\u0281\n\27\3\27\3\27\5\27\u0285"+
		"\n\27\3\27\3\27\5\27\u0289\n\27\3\27\5\27\u028c\n\27\3\27\3\27\5\27\u0290"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u0296\n\30\3\30\3\30\5\30\u029a\n\30\3"+
		"\30\7\30\u029d\n\30\f\30\16\30\u02a0\13\30\3\31\3\31\5\31\u02a4\n\31\3"+
		"\31\3\31\5\31\u02a8\n\31\3\31\3\31\3\31\3\31\5\31\u02ae\n\31\3\31\3\31"+
		"\5\31\u02b2\n\31\3\31\3\31\3\31\5\31\u02b7\n\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u02c2\n\33\3\33\3\33\5\33\u02c6\n\33\3\33"+
		"\3\33\5\33\u02ca\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u02d7\n\34\3\34\3\34\5\34\u02db\n\34\3\34\3\34\5\34\u02df\n"+
		"\34\3\35\5\35\u02e2\n\35\3\35\3\35\5\35\u02e6\n\35\3\35\3\35\5\35\u02ea"+
		"\n\35\3\35\3\35\5\35\u02ee\n\35\3\35\3\35\3\35\3\35\5\35\u02f4\n\35\3"+
		"\35\3\35\5\35\u02f8\n\35\3\35\3\35\5\35\u02fc\n\35\3\35\5\35\u02ff\n\35"+
		"\3\35\3\35\5\35\u0303\n\35\3\35\3\35\5\35\u0307\n\35\3\35\3\35\5\35\u030b"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0313\n\36\3\36\3\36\5\36\u0317"+
		"\n\36\3\36\5\36\u031a\n\36\3\36\3\36\3\36\5\36\u031f\n\36\3\36\3\36\5"+
		"\36\u0323\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\5!\u032f\n!\3!\3!\5"+
		"!\u0333\n!\3!\3!\5!\u0337\n!\7!\u0339\n!\f!\16!\u033c\13!\3!\3!\3!\6!"+
		"\u0341\n!\r!\16!\u0342\3!\3!\3!\3!\5!\u0349\n!\3!\3!\5!\u034d\n!\3!\3"+
		"!\5!\u0351\n!\7!\u0353\n!\f!\16!\u0356\13!\3!\6!\u0359\n!\r!\16!\u035a"+
		"\3!\3!\5!\u035f\n!\3\"\3\"\3\"\3\"\5\"\u0365\n\"\3#\3#\3#\3#\3#\3#\3#"+
		"\5#\u036e\n#\3#\3#\5#\u0372\n#\3#\3#\5#\u0376\n#\3$\3$\5$\u037a\n$\3$"+
		"\3$\5$\u037e\n$\3$\3$\3$\3$\5$\u0384\n$\3$\5$\u0387\n$\3$\3$\3$\3$\5$"+
		"\u038d\n$\3$\5$\u0390\n$\3$\5$\u0393\n$\3$\3$\3$\5$\u0398\n$\3%\3%\3%"+
		"\5%\u039d\n%\3%\7%\u03a0\n%\f%\16%\u03a3\13%\3%\3%\5%\u03a7\n%\3&\3&\3"+
		"&\3&\6&\u03ad\n&\r&\16&\u03ae\3\'\3\'\3\'\3\'\3\'\5\'\u03b6\n\'\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\7)\u03c3\n)\f)\16)\u03c6\13)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u03d1\n)\3*\3*\3*\3*\3*\5*\u03d8\n*\3+\3+\5+\u03dc\n"+
		"+\3+\3+\3,\3,\5,\u03e2\n,\3-\3-\5-\u03e6\n-\3-\3-\5-\u03ea\n-\3-\3-\3"+
		"-\3-\5-\u03f0\n-\3-\3-\5-\u03f4\n-\3-\6-\u03f7\n-\r-\16-\u03f8\3-\3-\3"+
		"-\6-\u03fe\n-\r-\16-\u03ff\3-\5-\u0403\n-\3-\3-\5-\u0407\n-\3-\3-\3-\3"+
		"-\3-\5-\u040e\n-\3-\3-\3-\3-\3-\3-\5-\u0416\n-\6-\u0418\n-\r-\16-\u0419"+
		"\3-\5-\u041d\n-\3-\3-\3-\5-\u0422\n-\3.\3.\5.\u0426\n.\3.\3.\3.\3.\5."+
		"\u042c\n.\3.\3.\3.\3.\5.\u0432\n.\6.\u0434\n.\r.\16.\u0435\3.\3.\3.\3"+
		".\7.\u043c\n.\f.\16.\u043f\13.\3.\6.\u0442\n.\r.\16.\u0443\3.\5.\u0447"+
		"\n.\3.\3.\3.\3.\5.\u044d\n.\3/\3/\5/\u0451\n/\3/\3/\3/\3/\5/\u0457\n/"+
		"\3/\3/\3/\3/\5/\u045d\n/\6/\u045f\n/\r/\16/\u0460\3/\3/\3/\3/\7/\u0467"+
		"\n/\f/\16/\u046a\13/\3/\6/\u046d\n/\r/\16/\u046e\3/\5/\u0472\n/\3/\3/"+
		"\3/\3/\5/\u0478\n/\3\60\3\60\3\60\5\60\u047d\n\60\3\61\3\61\3\61\3\61"+
		"\5\61\u0483\n\61\3\61\3\61\5\61\u0487\n\61\3\61\3\61\5\61\u048b\n\61\3"+
		"\61\3\61\5\61\u048f\n\61\3\61\3\61\5\61\u0493\n\61\3\61\3\61\5\61\u0497"+
		"\n\61\3\61\3\61\3\61\3\61\5\61\u049d\n\61\3\61\3\61\6\61\u04a1\n\61\r"+
		"\61\16\61\u04a2\3\61\5\61\u04a6\n\61\3\61\3\61\3\61\7\61\u04ab\n\61\f"+
		"\61\16\61\u04ae\13\61\3\62\3\62\5\62\u04b2\n\62\3\62\3\62\5\62\u04b6\n"+
		"\62\3\62\3\62\5\62\u04ba\n\62\3\62\3\62\5\62\u04be\n\62\3\62\3\62\5\62"+
		"\u04c2\n\62\3\62\3\62\5\62\u04c6\n\62\3\62\3\62\5\62\u04ca\n\62\3\63\3"+
		"\63\3\63\5\63\u04cf\n\63\3\64\3\64\5\64\u04d3\n\64\3\64\3\64\5\64\u04d7"+
		"\n\64\7\64\u04d9\n\64\f\64\16\64\u04dc\13\64\3\64\3\64\7\64\u04e0\n\64"+
		"\f\64\16\64\u04e3\13\64\5\64\u04e5\n\64\3\65\3\65\3\65\3\65\5\65\u04eb"+
		"\n\65\3\65\3\65\5\65\u04ef\n\65\3\65\3\65\7\65\u04f3\n\65\f\65\16\65\u04f6"+
		"\13\65\3\65\6\65\u04f9\n\65\r\65\16\65\u04fa\3\65\7\65\u04fe\n\65\f\65"+
		"\16\65\u0501\13\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\58\u050d"+
		"\n8\38\38\58\u0511\n8\38\38\78\u0515\n8\f8\168\u0518\138\38\68\u051b\n"+
		"8\r8\168\u051c\38\78\u0520\n8\f8\168\u0523\138\38\38\39\39\59\u0529\n"+
		"9\3:\3:\5:\u052d\n:\3:\3:\5:\u0531\n:\3:\3:\7:\u0535\n:\f:\16:\u0538\13"+
		":\3:\6:\u053b\n:\r:\16:\u053c\3:\7:\u0540\n:\f:\16:\u0543\13:\3:\3:\3"+
		":\3:\5:\u0549\n:\3:\3:\5:\u054d\n:\3:\3:\7:\u0551\n:\f:\16:\u0554\13:"+
		"\3:\6:\u0557\n:\r:\16:\u0558\3:\7:\u055c\n:\f:\16:\u055f\13:\3:\3:\3:"+
		"\3:\5:\u0565\n:\3:\3:\5:\u0569\n:\3:\7:\u056c\n:\f:\16:\u056f\13:\3:\6"+
		":\u0572\n:\r:\16:\u0573\3:\7:\u0577\n:\f:\16:\u057a\13:\3:\3:\3:\5:\u057f"+
		"\n:\3;\3;\3;\5;\u0584\n;\3;\3;\5;\u0588\n;\3;\3;\5;\u058c\n;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\5;\u0596\n;\3<\3<\3<\5<\u059b\n<\3=\3=\5=\u059f\n=\3="+
		"\3=\5=\u05a3\n=\3=\3=\3>\3>\5>\u05a9\n>\3>\3>\5>\u05ad\n>\3>\3>\3?\3?"+
		"\3?\5?\u05b4\n?\3?\3?\3?\3?\3?\5?\u05bb\n?\3?\3?\3?\5?\u05c0\n?\3?\3?"+
		"\3?\5?\u05c5\n?\3@\3@\5@\u05c9\n@\3@\3@\5@\u05cd\n@\3@\7@\u05d0\n@\f@"+
		"\16@\u05d3\13@\3A\3A\3A\3A\3A\5A\u05da\nA\3B\3B\5B\u05de\nB\3C\3C\3C\5"+
		"C\u05e3\nC\3C\3C\5C\u05e7\nC\3C\3C\7C\u05eb\nC\fC\16C\u05ee\13C\3C\6C"+
		"\u05f1\nC\rC\16C\u05f2\3C\7C\u05f6\nC\fC\16C\u05f9\13C\3C\3C\7C\u05fd"+
		"\nC\fC\16C\u0600\13C\3D\3D\3D\5D\u0605\nD\3D\3D\3D\3D\5D\u060b\nD\3D\7"+
		"D\u060e\nD\fD\16D\u0611\13D\3E\3E\5E\u0615\nE\3E\3E\3E\3E\3F\3F\5F\u061d"+
		"\nF\3F\3F\3F\5F\u0622\nF\3F\3F\3F\3G\3G\7G\u0629\nG\fG\16G\u062c\13G\3"+
		"G\6G\u062f\nG\rG\16G\u0630\3G\7G\u0634\nG\fG\16G\u0637\13G\3G\3G\3H\3"+
		"H\3H\3I\3I\3I\3I\7I\u0642\nI\fI\16I\u0645\13I\3I\3I\5I\u0649\nI\3I\5I"+
		"\u064c\nI\3I\7I\u064f\nI\fI\16I\u0652\13I\3I\5I\u0655\nI\3J\3J\7J\u0659"+
		"\nJ\fJ\16J\u065c\13J\3J\6J\u065f\nJ\rJ\16J\u0660\3J\7J\u0664\nJ\fJ\16"+
		"J\u0667\13J\3J\3J\3K\3K\5K\u066d\nK\3L\3L\5L\u0671\nL\3L\2\3`M\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\2\17\3\2\26\31\5\2\4\4\63\63\65\66\3\2&(\3\2$%\3\2"+
		")*\3\2 #\3\2\5\f\3\2\r\20\3\2\21\25\3\2+\64\3\2\32\37\4\288::\3\2\22\24"+
		"\2\u0775\2\u00a1\3\2\2\2\4\u00b9\3\2\2\2\6\u00bb\3\2\2\2\b\u00e0\3\2\2"+
		"\2\n\u00e5\3\2\2\2\f\u00fe\3\2\2\2\16\u0100\3\2\2\2\20\u0102\3\2\2\2\22"+
		"\u0106\3\2\2\2\24\u0108\3\2\2\2\26\u010a\3\2\2\2\30\u010e\3\2\2\2\32\u0118"+
		"\3\2\2\2\34\u011a\3\2\2\2\36\u011c\3\2\2\2 \u011e\3\2\2\2\"\u0120\3\2"+
		"\2\2$\u0122\3\2\2\2&\u0267\3\2\2\2(\u026d\3\2\2\2*\u0275\3\2\2\2,\u028f"+
		"\3\2\2\2.\u0291\3\2\2\2\60\u02b6\3\2\2\2\62\u02b8\3\2\2\2\64\u02c9\3\2"+
		"\2\2\66\u02de\3\2\2\28\u030a\3\2\2\2:\u0322\3\2\2\2<\u0324\3\2\2\2>\u0327"+
		"\3\2\2\2@\u035e\3\2\2\2B\u0364\3\2\2\2D\u0375\3\2\2\2F\u0397\3\2\2\2H"+
		"\u03a6\3\2\2\2J\u03ac\3\2\2\2L\u03b5\3\2\2\2N\u03b7\3\2\2\2P\u03d0\3\2"+
		"\2\2R\u03d7\3\2\2\2T\u03d9\3\2\2\2V\u03e1\3\2\2\2X\u0421\3\2\2\2Z\u044c"+
		"\3\2\2\2\\\u0477\3\2\2\2^\u047c\3\2\2\2`\u048e\3\2\2\2b\u04c9\3\2\2\2"+
		"d\u04ce\3\2\2\2f\u04d0\3\2\2\2h\u04e6\3\2\2\2j\u0504\3\2\2\2l\u0507\3"+
		"\2\2\2n\u050a\3\2\2\2p\u0528\3\2\2\2r\u057e\3\2\2\2t\u0595\3\2\2\2v\u059a"+
		"\3\2\2\2x\u059c\3\2\2\2z\u05a6\3\2\2\2|\u05c4\3\2\2\2~\u05c6\3\2\2\2\u0080"+
		"\u05d9\3\2\2\2\u0082\u05dd\3\2\2\2\u0084\u05df\3\2\2\2\u0086\u0601\3\2"+
		"\2\2\u0088\u0612\3\2\2\2\u008a\u061a\3\2\2\2\u008c\u0626\3\2\2\2\u008e"+
		"\u063a\3\2\2\2\u0090\u0654\3\2\2\2\u0092\u0656\3\2\2\2\u0094\u066c\3\2"+
		"\2\2\u0096\u0670\3\2\2\2\u0098\u009c\5\u0082B\2\u0099\u009b\7:\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u0098\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a7\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7:\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ae\5\u008eH\2\u00ab\u00ad\78\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b4\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\7:\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\2\2\3\u00b8"+
		"\3\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba\5\3\2\2\2\u00bb\u00c0\7\3\2\2\u00bc"+
		"\u00c1\7\67\2\2\u00bd\u00c1\5\32\16\2\u00be\u00c1\5\n\6\2\u00bf\u00c1"+
		"\7:\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\3\2\2\u00c5\7\3\2\2\2\u00c6\u00c8"+
		"\7%\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\3\2\2\2\u00c9"+
		"\u00cb\7\67\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d1\7\60\2\2\u00d0\u00d2\7\67\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d7\7\4\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00e1\3\2"+
		"\2\2\u00d8\u00da\7%\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00dd\7\67\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00c7\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e1\t\3\2\2\2\u00e2\u00e4\5\f\7\2"+
		"\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\t\3\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\5\f\7\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f6\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\5\n\6\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\13\3\2\2"+
		"\2\u00f8\u00f6\3\2\2\2\u00f9\u00ff\5\34\17\2\u00fa\u00ff\5\36\20\2\u00fb"+
		"\u00ff\5 \21\2\u00fc\u00ff\5\4\3\2\u00fd\u00ff\7\67\2\2\u00fe\u00f9\3"+
		"\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\r\3\2\2\2\u0100\u0101\t\4\2\2\u0101\17\3\2\2\2\u0102"+
		"\u0103\t\5\2\2\u0103\21\3\2\2\2\u0104\u0107\5\16\b\2\u0105\u0107\5\20"+
		"\t\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\23\3\2\2\2\u0108\u0109"+
		"\t\6\2\2\u0109\25\3\2\2\2\u010a\u010b\t\7\2\2\u010b\27\3\2\2\2\u010c\u010f"+
		"\5\24\13\2\u010d\u010f\5\26\f\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2"+
		"\2\u010f\31\3\2\2\2\u0110\u0119\5\34\17\2\u0111\u0119\5\36\20\2\u0112"+
		"\u0119\5 \21\2\u0113\u0119\5\"\22\2\u0114\u0119\5$\23\2\u0115\u0119\5"+
		"\30\r\2\u0116\u0119\5\22\n\2\u0117\u0119\5\4\3\2\u0118\u0110\3\2\2\2\u0118"+
		"\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2"+
		"\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\33\3\2\2\2\u011a\u011b\t\b\2\2\u011b\35\3\2\2\2\u011c\u011d\t\t\2\2\u011d"+
		"\37\3\2\2\2\u011e\u011f\t\n\2\2\u011f!\3\2\2\2\u0120\u0121\t\13\2\2\u0121"+
		"#\3\2\2\2\u0122\u0123\t\f\2\2\u0123%\3\2\2\2\u0124\u0128\5f\64\2\u0125"+
		"\u0127\7:\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012d\79\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0131\3\2"+
		"\2\2\u012e\u0130\7:\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0137\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0134\u0136\78\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0268\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013e\5p9\2\u013b\u013d\7:\2\2\u013c\u013b\3\2\2\2\u013d\u0140"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0143\79\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0147\3\2\2\2\u0144\u0146\7:\2\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014d\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014c\78\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0268\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0151\5> \2\u0151\u0155\7\61\2\2\u0152"+
		"\u0154\7:\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015a\79\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015e\3\2"+
		"\2\2\u015b\u015d\7:\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0164\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0161\u0163\78\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0268\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0167\u016b\5> \2\u0168\u016a\7:\2\2\u0169\u0168\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0170\79\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0174\3\2\2\2\u0171\u0173\7:\2\2\u0172\u0171\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u017a\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0177\u0179\78\2\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u017e\b\24\1\2\u017e\u0268\3\2\2\2\u017f"+
		"\u0180\5D#\2\u0180\u0184\7\61\2\2\u0181\u0183\7:\2\2\u0182\u0181\3\2\2"+
		"\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0188"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\79\2\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018d\3\2\2\2\u018a\u018c\7:\2\2\u018b\u018a\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0193\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\78\2\2\u0191\u0190\3\2"+
		"\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0268\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u019a\5D#\2\u0197\u0199\7:\2"+
		"\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\79\2\2\u019e"+
		"\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\7:"+
		"\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a9\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\78"+
		"\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\b\24"+
		"\1\2\u01ad\u0268\3\2\2\2\u01ae\u01af\5P)\2\u01af\u01b3\7\61\2\2\u01b0"+
		"\u01b2\7:\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b8\79\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bc\3\2"+
		"\2\2\u01b9\u01bb\7:\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c2\3\2\2\2\u01be\u01bc\3\2"+
		"\2\2\u01bf\u01c1\78\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u0268\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c5\u01c9\5P)\2\u01c6\u01c8\7:\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01ce\79\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01d2\3\2\2\2\u01cf\u01d1\7:\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d8\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d7\78\2\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\b\24\1\2\u01dc\u0268\3\2\2\2\u01dd"+
		"\u01e1\5N(\2\u01de\u01e0\7:\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2"+
		"\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1"+
		"\3\2\2\2\u01e4\u01e6\79\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01ea\3\2\2\2\u01e7\u01e9\7:\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2"+
		"\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01f0\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01ef\78\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u0268\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f3\u01f4\5(\25\2\u01f4\u01f8\7\61\2\2\u01f5\u01f7\7"+
		":\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fd\79"+
		"\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0201\3\2\2\2\u01fe"+
		"\u0200\7:\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0207\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0206\78\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u0268\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020e\5(\25\2\u020b\u020d\7:\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0212\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0211\u0213\79\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0217\3\2\2\2\u0214\u0216\7:\2\2\u0215\u0214\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021d\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u021a\u021c\78\2\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2"+
		"\2\2\u021f\u021d\3\2\2\2\u0220\u0221\b\24\1\2\u0221\u0268\3\2\2\2\u0222"+
		"\u0226\5\u008cG\2\u0223\u0225\7:\2\2\u0224\u0223\3\2\2\2\u0225\u0228\3"+
		"\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0229\u022b\79\2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022f\3\2\2\2\u022c\u022e\7:\2\2\u022d\u022c\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0235\3\2"+
		"\2\2\u0231\u022f\3\2\2\2\u0232\u0234\78\2\2\u0233\u0232\3\2\2\2\u0234"+
		"\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0268\3\2"+
		"\2\2\u0237\u0235\3\2\2\2\u0238\u0239\5|?\2\u0239\u023d\7\61\2\2\u023a"+
		"\u023c\7:\2\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0242\79\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0246\3\2"+
		"\2\2\u0243\u0245\7:\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024c\3\2\2\2\u0248\u0246\3\2"+
		"\2\2\u0249\u024b\78\2\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0268\3\2\2\2\u024e\u024c\3\2"+
		"\2\2\u024f\u0253\5|?\2\u0250\u0252\7:\2\2\u0251\u0250\3\2\2\2\u0252\u0255"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\u0258\79\2\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258\u025c\3\2\2\2\u0259\u025b\7:\2\2\u025a\u0259\3\2\2\2\u025b"+
		"\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0262\3\2"+
		"\2\2\u025e\u025c\3\2\2\2\u025f\u0261\78\2\2\u0260\u025f\3\2\2\2\u0261"+
		"\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2"+
		"\2\2\u0264\u0262\3\2\2\2\u0265\u0266\b\24\1\2\u0266\u0268\3\2\2\2\u0267"+
		"\u0124\3\2\2\2\u0267\u013a\3\2\2\2\u0267\u0150\3\2\2\2\u0267\u0167\3\2"+
		"\2\2\u0267\u017f\3\2\2\2\u0267\u0196\3\2\2\2\u0267\u01ae\3\2\2\2\u0267"+
		"\u01c5\3\2\2\2\u0267\u01dd\3\2\2\2\u0267\u01f3\3\2\2\2\u0267\u020a\3\2"+
		"\2\2\u0267\u0222\3\2\2\2\u0267\u0238\3\2\2\2\u0267\u024f\3\2\2\2\u0268"+
		"\'\3\2\2\2\u0269\u026e\5.\30\2\u026a\u026e\5\60\31\2\u026b\u026e\5:\36"+
		"\2\u026c\u026e\5<\37\2\u026d\u0269\3\2\2\2\u026d\u026a\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026d\u026c\3\2\2\2\u026e)\3\2\2\2\u026f\u0276\5\6\4\2\u0270"+
		"\u0276\5\b\5\2\u0271\u0276\5\n\6\2\u0272\u0276\5T+\2\u0273\u0276\5`\61"+
		"\2\u0274\u0276\5|?\2\u0275\u026f\3\2\2\2\u0275\u0270\3\2\2\2\u0275\u0271"+
		"\3\2\2\2\u0275\u0272\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0274\3\2\2\2\u0276"+
		"+\3\2\2\2\u0277\u0280\5\n\6\2\u0278\u027a\7:\2\2\u0279\u0278\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\7,\2\2\u027c\u027e\7:\2"+
		"\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281"+
		"\5*\26\2\u0280\u0279\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0290\3\2\2\2\u0282"+
		"\u028b\5\n\6\2\u0283\u0285\7:\2\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2"+
		"\2\2\u0285\u0286\3\2\2\2\u0286\u0288\7-\2\2\u0287\u0289\7:\2\2\u0288\u0287"+
		"\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\5*\26\2\u028b"+
		"\u0284\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\b\27"+
		"\1\2\u028e\u0290\3\2\2\2\u028f\u0277\3\2\2\2\u028f\u0282\3\2\2\2\u0290"+
		"-\3\2\2\2\u0291\u0292\5\4\3\2\u0292\u0293\7:\2\2\u0293\u029e\5,\27\2\u0294"+
		"\u0296\7:\2\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2"+
		"\2\2\u0297\u0299\7\62\2\2\u0298\u029a\7:\2\2\u0299\u0298\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\5,\27\2\u029c\u0295\3\2"+
		"\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"/\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a3\5\n\6\2\u02a2\u02a4\7:\2\2\u02a3"+
		"\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\7,"+
		"\2\2\u02a6\u02a8\7:\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02aa\5*\26\2\u02aa\u02b7\3\2\2\2\u02ab\u02ad\5\n"+
		"\6\2\u02ac\u02ae\7:\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b1\7-\2\2\u02b0\u02b2\7:\2\2\u02b1\u02b0\3\2\2"+
		"\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\5*\26\2\u02b4\u02b5"+
		"\b\31\1\2\u02b5\u02b7\3\2\2\2\u02b6\u02a1\3\2\2\2\u02b6\u02ab\3\2\2\2"+
		"\u02b7\61\3\2\2\2\u02b8\u02b9\5T+\2\u02b9\63\3\2\2\2\u02ba\u02bb\5\n\6"+
		"\2\u02bb\u02bc\7\36\2\2\u02bc\u02bd\5\62\32\2\u02bd\u02be\7\37\2\2\u02be"+
		"\u02ca\3\2\2\2\u02bf\u02c1\5\n\6\2\u02c0\u02c2\7\36\2\2\u02c1\u02c0\3"+
		"\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\5\62\32\2\u02c4"+
		"\u02c6\7\37\2\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3"+
		"\2\2\2\u02c7\u02c8\b\33\1\2\u02c8\u02ca\3\2\2\2\u02c9\u02ba\3\2\2\2\u02c9"+
		"\u02bf\3\2\2\2\u02ca\65\3\2\2\2\u02cb\u02cc\7\5\2\2\u02cc\u02cd\7:\2\2"+
		"\u02cd\u02ce\5\4\3\2\u02ce\u02cf\7\36\2\2\u02cf\u02d0\5\62\32\2\u02d0"+
		"\u02d1\7\37\2\2\u02d1\u02df\3\2\2\2\u02d2\u02d3\7\5\2\2\u02d3\u02d4\7"+
		":\2\2\u02d4\u02d6\5\4\3\2\u02d5\u02d7\7\36\2\2\u02d6\u02d5\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\5\62\32\2\u02d9\u02db\7"+
		"\37\2\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02dd\b\34\1\2\u02dd\u02df\3\2\2\2\u02de\u02cb\3\2\2\2\u02de\u02d2\3"+
		"\2\2\2\u02df\67\3\2\2\2\u02e0\u02e2\7:\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\7,\2\2\u02e4\u02e6\7:\2\2\u02e5"+
		"\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u030b\5\66"+
		"\34\2\u02e8\u02ea\7:\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ed\7-\2\2\u02ec\u02ee\7:\2\2\u02ed\u02ec\3\2\2"+
		"\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\5\66\34\2\u02f0"+
		"\u02f1\b\35\1\2\u02f1\u030b\3\2\2\2\u02f2\u02f4\7:\2\2\u02f3\u02f2\3\2"+
		"\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\7,\2\2\u02f6"+
		"\u02f8\7:\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fb\3\2"+
		"\2\2\u02f9\u02fc\5\64\33\2\u02fa\u02fc\5*\26\2\u02fb\u02f9\3\2\2\2\u02fb"+
		"\u02fa\3\2\2\2\u02fc\u030b\3\2\2\2\u02fd\u02ff\7:\2\2\u02fe\u02fd\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\7-\2\2\u0301"+
		"\u0303\7:\2\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0306\3\2"+
		"\2\2\u0304\u0307\5\64\33\2\u0305\u0307\5*\26\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\b\35\1\2\u0309\u030b\3"+
		"\2\2\2\u030a\u02e1\3\2\2\2\u030a\u02e9\3\2\2\2\u030a\u02f3\3\2\2\2\u030a"+
		"\u02fe\3\2\2\2\u030b9\3\2\2\2\u030c\u030d\5\4\3\2\u030d\u030e\7\36\2\2"+
		"\u030e\u030f\7\37\2\2\u030f\u0310\7:\2\2\u0310\u0312\5\n\6\2\u0311\u0313"+
		"\58\35\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0323\3\2\2\2\u0314"+
		"\u0316\5\4\3\2\u0315\u0317\7\36\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3"+
		"\2\2\2\u0317\u0319\3\2\2\2\u0318\u031a\7\37\2\2\u0319\u0318\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7:\2\2\u031c\u031e\5\n"+
		"\6\2\u031d\u031f\58\35\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0321\b\36\1\2\u0321\u0323\3\2\2\2\u0322\u030c\3"+
		"\2\2\2\u0322\u0314\3\2\2\2\u0323;\3\2\2\2\u0324\u0325\5\64\33\2\u0325"+
		"\u0326\58\35\2\u0326=\3\2\2\2\u0327\u0328\7\b\2\2\u0328\u0329\7\32\2\2"+
		"\u0329\u032a\5@!\2\u032a\u032b\7\33\2\2\u032b?\3\2\2\2\u032c\u033a\5B"+
		"\"\2\u032d\u032f\7:\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0332\7$\2\2\u0331\u0333\7:\2\2\u0332\u0331\3\2\2"+
		"\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\5B\"\2\u0335\u0337"+
		"\7:\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338"+
		"\u032e\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u035f\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u0340\5\n\6\2\u033e"+
		"\u033f\7:\2\2\u033f\u0341\5\n\6\2\u0340\u033e\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0345\b!\1\2\u0345\u035f\3\2\2\2\u0346\u0354\5B\"\2\u0347\u0349\7:\2"+
		"\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c"+
		"\7$\2\2\u034b\u034d\7:\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u0350\5B\"\2\u034f\u0351\7:\2\2\u0350\u034f\3\2\2"+
		"\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0348\3\2\2\2\u0353\u0356"+
		"\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0358\3\2\2\2\u0356"+
		"\u0354\3\2\2\2\u0357\u0359\7$\2\2\u0358\u0357\3\2\2\2\u0359\u035a\3\2"+
		"\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"\u035d\b!\1\2\u035d\u035f\3\2\2\2\u035e\u032c\3\2\2\2\u035e\u033d\3\2"+
		"\2\2\u035e\u0346\3\2\2\2\u035fA\3\2\2\2\u0360\u0365\5\6\4\2\u0361\u0365"+
		"\5\n\6\2\u0362\u0365\5T+\2\u0363\u0365\5|?\2\u0364\u0360\3\2\2\2\u0364"+
		"\u0361\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0363\3\2\2\2\u0365C\3\2\2\2"+
		"\u0366\u0367\7\t\2\2\u0367\u0368\7\32\2\2\u0368\u0369\5F$\2\u0369\u036a"+
		"\7\33\2\2\u036a\u0376\3\2\2\2\u036b\u036d\7\t\2\2\u036c\u036e\7\32\2\2"+
		"\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371"+
		"\5F$\2\u0370\u0372\7\33\2\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0374\b#\1\2\u0374\u0376\3\2\2\2\u0375\u0366\3\2"+
		"\2\2\u0375\u036b\3\2\2\2\u0376E\3\2\2\2\u0377\u0379\5H%\2\u0378\u037a"+
		"\7:\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037d\7\62\2\2\u037c\u037e\7:\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u037f\3\2\2\2\u037f\u0380\5L\'\2\u0380\u0398\3\2\2\2\u0381"+
		"\u0383\5H%\2\u0382\u0384\7:\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2"+
		"\2\u0384\u0386\3\2\2\2\u0385\u0387\7\62\2\2\u0386\u0385\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\b$\1\2\u0389\u0398\3\2"+
		"\2\2\u038a\u038c\5H%\2\u038b\u038d\7:\2\2\u038c\u038b\3\2\2\2\u038c\u038d"+
		"\3\2\2\2\u038d\u038f\3\2\2\2\u038e\u0390\7\62\2\2\u038f\u038e\3\2\2\2"+
		"\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u0393\7:\2\2\u0392\u0391"+
		"\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\5L\'\2\u0395"+
		"\u0396\b$\1\2\u0396\u0398\3\2\2\2\u0397\u0377\3\2\2\2\u0397\u0381\3\2"+
		"\2\2\u0397\u038a\3\2\2\2\u0398G\3\2\2\2\u0399\u03a7\5\6\4\2\u039a\u039d"+
		"\5T+\2\u039b\u039d\5J&\2\u039c\u039a\3\2\2\2\u039c\u039b\3\2\2\2\u039d"+
		"\u03a1\3\2\2\2\u039e\u03a0\7:\2\2\u039f\u039e\3\2\2\2\u03a0\u03a3\3\2"+
		"\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a4\u03a5\b%\1\2\u03a5\u03a7\3\2\2\2\u03a6\u0399\3\2"+
		"\2\2\u03a6\u039c\3\2\2\2\u03a7I\3\2\2\2\u03a8\u03ad\7\67\2\2\u03a9\u03ad"+
		"\5\32\16\2\u03aa\u03ad\5\n\6\2\u03ab\u03ad\7:\2\2\u03ac\u03a8\3\2\2\2"+
		"\u03ac\u03a9\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ab\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03afK\3\2\2\2\u03b0"+
		"\u03b6\5T+\2\u03b1\u03b6\5\n\6\2\u03b2\u03b3\5\6\4\2\u03b3\u03b4\b\'\1"+
		"\2\u03b4\u03b6\3\2\2\2\u03b5\u03b0\3\2\2\2\u03b5\u03b1\3\2\2\2\u03b5\u03b2"+
		"\3\2\2\2\u03b6M\3\2\2\2\u03b7\u03b8\7\6\2\2\u03b8\u03b9\7:\2\2\u03b9\u03ba"+
		"\5(\25\2\u03baO\3\2\2\2\u03bb\u03bc\7\7\2\2\u03bc\u03bd\7:\2\2\u03bd\u03d1"+
		"\5R*\2\u03be\u03bf\7\7\2\2\u03bf\u03c0\7:\2\2\u03c0\u03c4\5R*\2\u03c1"+
		"\u03c3\7:\2\2\u03c2\u03c1\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2"+
		"\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7"+
		"\u03c8\7\32\2\2\u03c8\u03c9\7\33\2\2\u03c9\u03ca\b)\1\2\u03ca\u03d1\3"+
		"\2\2\2\u03cb\u03cc\7\7\2\2\u03cc\u03cd\7:\2\2\u03cd\u03ce\5\4\3\2\u03ce"+
		"\u03cf\b)\1\2\u03cf\u03d1\3\2\2\2\u03d0\u03bb\3\2\2\2\u03d0\u03be\3\2"+
		"\2\2\u03d0\u03cb\3\2\2\2\u03d1Q\3\2\2\2\u03d2\u03d8\5\6\4\2\u03d3\u03d8"+
		"\5\b\5\2\u03d4\u03d8\5\n\6\2\u03d5\u03d8\5T+\2\u03d6\u03d8\5|?\2\u03d7"+
		"\u03d2\3\2\2\2\u03d7\u03d3\3\2\2\2\u03d7\u03d4\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d7\u03d6\3\2\2\2\u03d8S\3\2\2\2\u03d9\u03db\5X-\2\u03da\u03dc"+
		"\7:\2\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u03de\5V,\2\u03deU\3\2\2\2\u03df\u03e2\5Z.\2\u03e0\u03e2\5\\/\2\u03e1"+
		"\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2W\3\2\2\2\u03e3\u03e5\7\32\2\2"+
		"\u03e4\u03e6\7:\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7"+
		"\3\2\2\2\u03e7\u03e9\5T+\2\u03e8\u03ea\7:\2\2\u03e9\u03e8\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\7\33\2\2\u03ec\u0422\3"+
		"\2\2\2\u03ed\u03ef\7\32\2\2\u03ee\u03f0\7:\2\2\u03ef\u03ee\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\5T+\2\u03f2\u03f4\7:\2"+
		"\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f7"+
		"\7\33\2\2\u03f6\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f6\3\2\2\2"+
		"\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\b-\1\2\u03fb\u0422"+
		"\3\2\2\2\u03fc\u03fe\7\32\2\2\u03fd\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2"+
		"\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u0403"+
		"\7:\2\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0406\5T+\2\u0405\u0407\7:\2\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2"+
		"\2\u0407\u0408\3\2\2\2\u0408\u0409\7\33\2\2\u0409\u040a\b-\1\2\u040a\u0422"+
		"\3\2\2\2\u040b\u040d\5^\60\2\u040c\u040e\7:\2\2\u040d\u040c\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\5V,\2\u0410\u0422\3\2\2"+
		"\2\u0411\u0417\5^\60\2\u0412\u0415\7:\2\2\u0413\u0416\5^\60\2\u0414\u0416"+
		"\5\6\4\2\u0415\u0413\3\2\2\2\u0415\u0414\3\2\2\2\u0416\u0418\3\2\2\2\u0417"+
		"\u0412\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2"+
		"\2\2\u041a\u041c\3\2\2\2\u041b\u041d\7:\2\2\u041c\u041b\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\5V,\2\u041f\u0420\b-\1"+
		"\2\u0420\u0422\3\2\2\2\u0421\u03e3\3\2\2\2\u0421\u03ed\3\2\2\2\u0421\u03fd"+
		"\3\2\2\2\u0421\u040b\3\2\2\2\u0421\u0411\3\2\2\2\u0422Y\3\2\2\2\u0423"+
		"\u0425\5\16\b\2\u0424\u0426\7:\2\2\u0425\u0424\3\2\2\2\u0425\u0426\3\2"+
		"\2\2\u0426\u0427\3\2\2\2\u0427\u0428\5T+\2\u0428\u044d\3\2\2\2\u0429\u042b"+
		"\5\16\b\2\u042a\u042c\7:\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u042d\3\2\2\2\u042d\u0433\5T+\2\u042e\u0431\7:\2\2\u042f\u0432\5^\60"+
		"\2\u0430\u0432\5\6\4\2\u0431\u042f\3\2\2\2\u0431\u0430\3\2\2\2\u0432\u0434"+
		"\3\2\2\2\u0433\u042e\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0433\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\b.\1\2\u0438\u044d\3\2"+
		"\2\2\u0439\u0441\5\16\b\2\u043a\u043c\7:\2\2\u043b\u043a\3\2\2\2\u043c"+
		"\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0440\3\2"+
		"\2\2\u043f\u043d\3\2\2\2\u0440\u0442\5\22\n\2\u0441\u043d\3\2\2\2\u0442"+
		"\u0443\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0446\3\2"+
		"\2\2\u0445\u0447\7:\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u0449\5T+\2\u0449\u044a\b.\1\2\u044a\u044d\3\2\2"+
		"\2\u044b\u044d\3\2\2\2\u044c\u0423\3\2\2\2\u044c\u0429\3\2\2\2\u044c\u0439"+
		"\3\2\2\2\u044c\u044b\3\2\2\2\u044d[\3\2\2\2\u044e\u0450\5\20\t\2\u044f"+
		"\u0451\7:\2\2\u0450\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\3\2"+
		"\2\2\u0452\u0453\5T+\2\u0453\u0478\3\2\2\2\u0454\u0456\5\20\t\2\u0455"+
		"\u0457\7:\2\2\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\3\2"+
		"\2\2\u0458\u045e\5T+\2\u0459\u045c\7:\2\2\u045a\u045d\5^\60\2\u045b\u045d"+
		"\5\6\4\2\u045c\u045a\3\2\2\2\u045c\u045b\3\2\2\2\u045d\u045f\3\2\2\2\u045e"+
		"\u0459\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2"+
		"\2\2\u0461\u0462\3\2\2\2\u0462\u0463\b/\1\2\u0463\u0478\3\2\2\2\u0464"+
		"\u046c\5\20\t\2\u0465\u0467\7:\2\2\u0466\u0465\3\2\2\2\u0467\u046a\3\2"+
		"\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a"+
		"\u0468\3\2\2\2\u046b\u046d\5\22\n\2\u046c\u0468\3\2\2\2\u046d\u046e\3"+
		"\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470"+
		"\u0472\7:\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2"+
		"\2\2\u0473\u0474\5T+\2\u0474\u0475\b/\1\2\u0475\u0478\3\2\2\2\u0476\u0478"+
		"\3\2\2\2\u0477\u044e\3\2\2\2\u0477\u0454\3\2\2\2\u0477\u0464\3\2\2\2\u0477"+
		"\u0476\3\2\2\2\u0478]\3\2\2\2\u0479\u047d\5\b\5\2\u047a\u047d\5\n\6\2"+
		"\u047b\u047d\5|?\2\u047c\u0479\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047b"+
		"\3\2\2\2\u047d_\3\2\2\2\u047e\u047f\b\61\1\2\u047f\u048f\5d\63\2\u0480"+
		"\u048f\5b\62\2\u0481\u0483\7+\2\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2"+
		"\2\2\u0483\u0484\3\2\2\2\u0484\u0486\7\32\2\2\u0485\u0487\7:\2\2\u0486"+
		"\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048a\5`"+
		"\61\2\u0489\u048b\7:\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048c\3\2\2\2\u048c\u048d\7\33\2\2\u048d\u048f\3\2\2\2\u048e\u047e\3"+
		"\2\2\2\u048e\u0480\3\2\2\2\u048e\u0482\3\2\2\2\u048f\u04ac\3\2\2\2\u0490"+
		"\u0492\f\5\2\2\u0491\u0493\7:\2\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2"+
		"\2\2\u0493\u0494\3\2\2\2\u0494\u0496\5\30\r\2\u0495\u0497\7:\2\2\u0496"+
		"\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\5`"+
		"\61\6\u0499\u04ab\3\2\2\2\u049a\u049c\f\4\2\2\u049b\u049d\7:\2\2\u049c"+
		"\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\5\30"+
		"\r\2\u049f\u04a1\5\30\r\2\u04a0\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a6\7:"+
		"\2\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7"+
		"\u04a8\5`\61\5\u04a8\u04a9\b\61\1\2\u04a9\u04ab\3\2\2\2\u04aa\u0490\3"+
		"\2\2\2\u04aa\u049a\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac"+
		"\u04ad\3\2\2\2\u04ada\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b1\5\n\6\2"+
		"\u04b0\u04b2\7:\2\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3"+
		"\3\2\2\2\u04b3\u04b5\7-\2\2\u04b4\u04b6\7:\2\2\u04b5\u04b4\3\2\2\2\u04b5"+
		"\u04b6\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04ba\5d\63\2\u04b8\u04ba\5\6"+
		"\4\2\u04b9\u04b7\3\2\2\2\u04b9\u04b8\3\2\2\2\u04ba\u04ca\3\2\2\2\u04bb"+
		"\u04bd\5\n\6\2\u04bc\u04be\7:\2\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2"+
		"\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\7,\2\2\u04c0\u04c2\7:\2\2\u04c1\u04c0"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c6\5d\63\2\u04c4"+
		"\u04c6\5\6\4\2\u04c5\u04c3\3\2\2\2\u04c5\u04c4\3\2\2\2\u04c6\u04c7\3\2"+
		"\2\2\u04c7\u04c8\b\62\1\2\u04c8\u04ca\3\2\2\2\u04c9\u04af\3\2\2\2\u04c9"+
		"\u04bb\3\2\2\2\u04cac\3\2\2\2\u04cb\u04cf\5\n\6\2\u04cc\u04cf\5\b\5\2"+
		"\u04cd\u04cf\5T+\2\u04ce\u04cb\3\2\2\2\u04ce\u04cc\3\2\2\2\u04ce\u04cd"+
		"\3\2\2\2\u04cfe\3\2\2\2\u04d0\u04d2\5j\66\2\u04d1\u04d3\t\r\2\2\u04d2"+
		"\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04da\3\2\2\2\u04d4\u04d6\5l"+
		"\67\2\u04d5\u04d7\t\r\2\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7"+
		"\u04d9\3\2\2\2\u04d8\u04d4\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2"+
		"\2\2\u04da\u04db\3\2\2\2\u04db\u04e4\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd"+
		"\u04e1\5n8\2\u04de\u04e0\78\2\2\u04df\u04de\3\2\2\2\u04e0\u04e3\3\2\2"+
		"\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1"+
		"\3\2\2\2\u04e4\u04dd\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5g\3\2\2\2\u04e6"+
		"\u04e7\7\32\2\2\u04e7\u04e8\5`\61\2\u04e8\u04ea\7\33\2\2\u04e9\u04eb\7"+
		":\2\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u04ee\7\20\2\2\u04ed\u04ef\7:\2\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2"+
		"\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f4\7\34\2\2\u04f1\u04f3\7:\2\2\u04f2"+
		"\u04f1\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2"+
		"\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u04f9\5&\24\2\u04f8"+
		"\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2"+
		"\2\2\u04fb\u04ff\3\2\2\2\u04fc\u04fe\7:\2\2\u04fd\u04fc\3\2\2\2\u04fe"+
		"\u0501\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2"+
		"\2\2\u0501\u04ff\3\2\2\2\u0502\u0503\7\35\2\2\u0503i\3\2\2\2\u0504\u0505"+
		"\7\r\2\2\u0505\u0506\5h\65\2\u0506k\3\2\2\2\u0507\u0508\7\17\2\2\u0508"+
		"\u0509\5h\65\2\u0509m\3\2\2\2\u050a\u050c\7\16\2\2\u050b\u050d\7:\2\2"+
		"\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510"+
		"\7\20\2\2\u050f\u0511\7:\2\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511"+
		"\u0512\3\2\2\2\u0512\u0516\7\34\2\2\u0513\u0515\7:\2\2\u0514\u0513\3\2"+
		"\2\2\u0515\u0518\3\2\2\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0519\u051b\5&\24\2\u051a\u0519\3\2"+
		"\2\2\u051b\u051c\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u0521\3\2\2\2\u051e\u0520\7:\2\2\u051f\u051e\3\2\2\2\u0520\u0523\3\2"+
		"\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\3\2\2\2\u0523"+
		"\u0521\3\2\2\2\u0524\u0525\7\35\2\2\u0525o\3\2\2\2\u0526\u0529\5x=\2\u0527"+
		"\u0529\5z>\2\u0528\u0526\3\2\2\2\u0528\u0527\3\2\2\2\u0529q\3\2\2\2\u052a"+
		"\u052c\t\16\2\2\u052b\u052d\7:\2\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2"+
		"\2\2\u052d\u052e\3\2\2\2\u052e\u0530\5T+\2\u052f\u0531\7:\2\2\u0530\u052f"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0536\7\34\2\2"+
		"\u0533\u0535\7:\2\2\u0534\u0533\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534"+
		"\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u053a\3\2\2\2\u0538\u0536\3\2\2\2\u0539"+
		"\u053b\5&\24\2\u053a\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053a\3\2"+
		"\2\2\u053c\u053d\3\2\2\2\u053d\u0541\3\2\2\2\u053e\u0540\7:\2\2\u053f"+
		"\u053e\3\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2"+
		"\2\2\u0542\u0544\3\2\2\2\u0543\u0541\3\2\2\2\u0544\u0545\7\35\2\2\u0545"+
		"\u057f\3\2\2\2\u0546\u0548\t\16\2\2\u0547\u0549\7:\2\2\u0548\u0547\3\2"+
		"\2\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054c\5T+\2\u054b\u054d"+
		"\7:\2\2\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\3\2\2\2\u054e"+
		"\u0552\7\34\2\2\u054f\u0551\7:\2\2\u0550\u054f\3\2\2\2\u0551\u0554\3\2"+
		"\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0556\3\2\2\2\u0554"+
		"\u0552\3\2\2\2\u0555\u0557\5&\24\2\u0556\u0555\3\2\2\2\u0557\u0558\3\2"+
		"\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055d\3\2\2\2\u055a"+
		"\u055c\7:\2\2\u055b\u055a\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2"+
		"\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2\2\2\u055f\u055d\3\2\2\2\u0560"+
		"\u0561\b:\1\2\u0561\u057f\3\2\2\2\u0562\u0564\t\16\2\2\u0563\u0565\7:"+
		"\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2\2\u0566"+
		"\u0568\5T+\2\u0567\u0569\7:\2\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2"+
		"\2\u0569\u056d\3\2\2\2\u056a\u056c\7:\2\2\u056b\u056a\3\2\2\2\u056c\u056f"+
		"\3\2\2\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0571\3\2\2\2\u056f"+
		"\u056d\3\2\2\2\u0570\u0572\5&\24\2\u0571\u0570\3\2\2\2\u0572\u0573\3\2"+
		"\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0578\3\2\2\2\u0575"+
		"\u0577\7:\2\2\u0576\u0575\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2"+
		"\2\2\u0578\u0579\3\2\2\2\u0579\u057b\3\2\2\2\u057a\u0578\3\2\2\2\u057b"+
		"\u057c\7\35\2\2\u057c\u057d\b:\1\2\u057d\u057f\3\2\2\2\u057e\u052a\3\2"+
		"\2\2\u057e\u0546\3\2\2\2\u057e\u0562\3\2\2\2\u057fs\3\2\2\2\u0580\u0581"+
		"\5\4\3\2\u0581\u0582\7:\2\2\u0582\u0584\3\2\2\2\u0583\u0580\3\2\2\2\u0583"+
		"\u0584\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\5\n\6\2\u0586\u0588\7:"+
		"\2\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u058b\7,\2\2\u058a\u058c\7:\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2"+
		"\2\u058c\u058d\3\2\2\2\u058d\u058e\5v<\2\u058e\u0596\3\2\2\2\u058f\u0590"+
		"\5\4\3\2\u0590\u0591\7:\2\2\u0591\u0592\5\n\6\2\u0592\u0593\b;\1\2\u0593"+
		"\u0596\3\2\2\2\u0594\u0596\5T+\2\u0595\u0583\3\2\2\2\u0595\u058f\3\2\2"+
		"\2\u0595\u0594\3\2\2\2\u0596u\3\2\2\2\u0597\u059b\5\b\5\2\u0598\u059b"+
		"\5\n\6\2\u0599\u059b\5T+\2\u059a\u0597\3\2\2\2\u059a\u0598\3\2\2\2\u059a"+
		"\u0599\3\2\2\2\u059bw\3\2\2\2\u059c\u059e\7\25\2\2\u059d\u059f\7:\2\2"+
		"\u059e\u059d\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2"+
		"\5T+\2\u05a1\u05a3\7:\2\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3"+
		"\u05a4\3\2\2\2\u05a4\u05a5\5r:\2\u05a5y\3\2\2\2\u05a6\u05a8\7\21\2\2\u05a7"+
		"\u05a9\7:\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2"+
		"\2\2\u05aa\u05ac\5t;\2\u05ab\u05ad\7:\2\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad"+
		"\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\5r:\2\u05af{\3\2\2\2\u05b0\u05b1"+
		"\5\n\6\2\u05b1\u05b3\7\32\2\2\u05b2\u05b4\5~@\2\u05b3\u05b2\3\2\2\2\u05b3"+
		"\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\7\33\2\2\u05b6\u05c5\3"+
		"\2\2\2\u05b7\u05b8\5\n\6\2\u05b8\u05ba\7\32\2\2\u05b9\u05bb\5~@\2\u05ba"+
		"\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\7\33"+
		"\2\2\u05bd\u05bf\7\32\2\2\u05be\u05c0\5~@\2\u05bf\u05be\3\2\2\2\u05bf"+
		"\u05c0\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\7\33\2\2\u05c2\u05c3\b"+
		"?\1\2\u05c3\u05c5\3\2\2\2\u05c4\u05b0\3\2\2\2\u05c4\u05b7\3\2\2\2\u05c5"+
		"}\3\2\2\2\u05c6\u05d1\5\u0080A\2\u05c7\u05c9\7:\2\2\u05c8\u05c7\3\2\2"+
		"\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc\7\62\2\2\u05cb"+
		"\u05cd\7:\2\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2"+
		"\2\2\u05ce\u05d0\5\u0080A\2\u05cf\u05c8\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1"+
		"\u05cf\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\177\3\2\2\2\u05d3\u05d1\3\2\2"+
		"\2\u05d4\u05da\5|?\2\u05d5\u05da\5\n\6\2\u05d6\u05da\5T+\2\u05d7\u05da"+
		"\5\6\4\2\u05d8\u05da\5\b\5\2\u05d9\u05d4\3\2\2\2\u05d9\u05d5\3\2\2\2\u05d9"+
		"\u05d6\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05d8\3\2\2\2\u05da\u0081\3\2"+
		"\2\2\u05db\u05de\5\u0088E\2\u05dc\u05de\5\u008aF\2\u05dd\u05db\3\2\2\2"+
		"\u05dd\u05dc\3\2\2\2\u05de\u0083\3\2\2\2\u05df\u05e0\5\n\6\2\u05e0\u05e2"+
		"\7\32\2\2\u05e1\u05e3\5\u0086D\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2"+
		"\2\u05e3\u05e4\3\2\2\2\u05e4\u05e6\7\33\2\2\u05e5\u05e7\7:\2\2\u05e6\u05e5"+
		"\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ec\7\34\2\2"+
		"\u05e9\u05eb\7:\2\2\u05ea\u05e9\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ea"+
		"\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef"+
		"\u05f1\5&\24\2\u05f0\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f0\3\2"+
		"\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f7\3\2\2\2\u05f4\u05f6\7:\2\2\u05f5"+
		"\u05f4\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f8\3\2"+
		"\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05f7\3\2\2\2\u05fa\u05fe\7\35\2\2\u05fb"+
		"\u05fd\78\2\2\u05fc\u05fb\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2"+
		"\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0085\3\2\2\2\u0600\u05fe\3\2\2\2\u0601"+
		"\u0604\5\4\3\2\u0602\u0603\7\36\2\2\u0603\u0605\7\37\2\2\u0604\u0602\3"+
		"\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\7:\2\2\u0607"+
		"\u060f\5\n\6\2\u0608\u060a\7\62\2\2\u0609\u060b\7:\2\2\u060a\u0609\3\2"+
		"\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\5\u0086D\2\u060d"+
		"\u0608\3\2\2\2\u060e\u0611\3\2\2\2\u060f\u060d\3\2\2\2\u060f\u0610\3\2"+
		"\2\2\u0610\u0087\3\2\2\2\u0611\u060f\3\2\2\2\u0612\u0614\7\13\2\2\u0613"+
		"\u0615\7:\2\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2"+
		"\2\2\u0616\u0617\7\n\2\2\u0617\u0618\7:\2\2\u0618\u0619\5\u0084C\2\u0619"+
		"\u0089\3\2\2\2\u061a\u061c\7\13\2\2\u061b\u061d\7:\2\2\u061c\u061b\3\2"+
		"\2\2\u061c\u061d\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0621\5\4\3\2\u061f"+
		"\u0620\7\36\2\2\u0620\u0622\7\37\2\2\u0621\u061f\3\2\2\2\u0621\u0622\3"+
		"\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\7:\2\2\u0624\u0625\5\u0084C\2\u0625"+
		"\u008b\3\2\2\2\u0626\u062a\7\34\2\2\u0627\u0629\7:\2\2\u0628\u0627\3\2"+
		"\2\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b"+
		"\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u062f\5&\24\2\u062e\u062d\3\2"+
		"\2\2\u062f\u0630\3\2\2\2\u0630\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u0635\3\2\2\2\u0632\u0634\7:\2\2\u0633\u0632\3\2\2\2\u0634\u0637\3\2"+
		"\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637"+
		"\u0635\3\2\2\2\u0638\u0639\7\35\2\2\u0639\u008d\3\2\2\2\u063a\u063b\5"+
		"\u0090I\2\u063b\u063c\5\u0092J\2\u063c\u008f\3\2\2\2\u063d\u063e\7\f\2"+
		"\2\u063e\u063f\7\32\2\2\u063f\u0643\7\33\2\2\u0640\u0642\7:\2\2\u0641"+
		"\u0640\3\2\2\2\u0642\u0645\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644\3\2"+
		"\2\2\u0644\u0655\3\2\2\2\u0645\u0643\3\2\2\2\u0646\u0648\7\f\2\2\u0647"+
		"\u0649\7\32\2\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064b\3"+
		"\2\2\2\u064a\u064c\7\33\2\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2\2\2\u064c"+
		"\u0650\3\2\2\2\u064d\u064f\7:\2\2\u064e\u064d\3\2\2\2\u064f\u0652\3\2"+
		"\2\2\u0650\u064e\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652"+
		"\u0650\3\2\2\2\u0653\u0655\bI\1\2\u0654\u063d\3\2\2\2\u0654\u0646\3\2"+
		"\2\2\u0655\u0091\3\2\2\2\u0656\u065a\5\u0094K\2\u0657\u0659\7:\2\2\u0658"+
		"\u0657\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2"+
		"\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u065f\5&\24\2\u065e"+
		"\u065d\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661\3\2"+
		"\2\2\u0661\u0665\3\2\2\2\u0662\u0664\7:\2\2\u0663\u0662\3\2\2\2\u0664"+
		"\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2"+
		"\2\2\u0667\u0665\3\2\2\2\u0668\u0669\5\u0096L\2\u0669\u0093\3\2\2\2\u066a"+
		"\u066d\7\34\2\2\u066b\u066d\bK\1\2\u066c\u066a\3\2\2\2\u066c\u066b\3\2"+
		"\2\2\u066d\u0095\3\2\2\2\u066e\u0671\7\35\2\2\u066f\u0671\bL\1\2\u0670"+
		"\u066e\3\2\2\2\u0670\u066f\3\2\2\2\u0671\u0097\3\2\2\2\u0116\u009c\u00a1"+
		"\u00a7\u00ae\u00b4\u00c0\u00c2\u00c7\u00cc\u00d3\u00d6\u00d9\u00de\u00e0"+
		"\u00e5\u00eb\u00f0\u00f6\u00fe\u0106\u010e\u0118\u0128\u012c\u0131\u0137"+
		"\u013e\u0142\u0147\u014d\u0155\u0159\u015e\u0164\u016b\u016f\u0174\u017a"+
		"\u0184\u0188\u018d\u0193\u019a\u019e\u01a3\u01a9\u01b3\u01b7\u01bc\u01c2"+
		"\u01c9\u01cd\u01d2\u01d8\u01e1\u01e5\u01ea\u01f0\u01f8\u01fc\u0201\u0207"+
		"\u020e\u0212\u0217\u021d\u0226\u022a\u022f\u0235\u023d\u0241\u0246\u024c"+
		"\u0253\u0257\u025c\u0262\u0267\u026d\u0275\u0279\u027d\u0280\u0284\u0288"+
		"\u028b\u028f\u0295\u0299\u029e\u02a3\u02a7\u02ad\u02b1\u02b6\u02c1\u02c5"+
		"\u02c9\u02d6\u02da\u02de\u02e1\u02e5\u02e9\u02ed\u02f3\u02f7\u02fb\u02fe"+
		"\u0302\u0306\u030a\u0312\u0316\u0319\u031e\u0322\u032e\u0332\u0336\u033a"+
		"\u0342\u0348\u034c\u0350\u0354\u035a\u035e\u0364\u036d\u0371\u0375\u0379"+
		"\u037d\u0383\u0386\u038c\u038f\u0392\u0397\u039c\u03a1\u03a6\u03ac\u03ae"+
		"\u03b5\u03c4\u03d0\u03d7\u03db\u03e1\u03e5\u03e9\u03ef\u03f3\u03f8\u03ff"+
		"\u0402\u0406\u040d\u0415\u0419\u041c\u0421\u0425\u042b\u0431\u0435\u043d"+
		"\u0443\u0446\u044c\u0450\u0456\u045c\u0460\u0468\u046e\u0471\u0477\u047c"+
		"\u0482\u0486\u048a\u048e\u0492\u0496\u049c\u04a2\u04a5\u04aa\u04ac\u04b1"+
		"\u04b5\u04b9\u04bd\u04c1\u04c5\u04c9\u04ce\u04d2\u04d6\u04da\u04e1\u04e4"+
		"\u04ea\u04ee\u04f4\u04fa\u04ff\u050c\u0510\u0516\u051c\u0521\u0528\u052c"+
		"\u0530\u0536\u053c\u0541\u0548\u054c\u0552\u0558\u055d\u0564\u0568\u056d"+
		"\u0573\u0578\u057e\u0583\u0587\u058b\u0595\u059a\u059e\u05a2\u05a8\u05ac"+
		"\u05b3\u05ba\u05bf\u05c4\u05c8\u05cc\u05d1\u05d9\u05dd\u05e2\u05e6\u05ec"+
		"\u05f2\u05f7\u05fe\u0604\u060a\u060f\u0614\u061c\u0621\u062a\u0630\u0635"+
		"\u0643\u0648\u064b\u0650\u0654\u065a\u0660\u0665\u066c\u0670";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}