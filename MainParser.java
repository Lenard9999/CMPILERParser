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
		RULE_expression = 41, RULE_array_label = 42, RULE_value_expression = 43, 
		RULE_alt_expression = 44, RULE_alt_operator_expression = 45, RULE_alt_parenthesis_expression = 46, 
		RULE_alt_first_expression_operator = 47, RULE_alt_second_expression_operator = 48, 
		RULE_alt_value_expression = 49, RULE_comparison_statement = 50, RULE_assignment_statement = 51, 
		RULE_value_comparison = 52, RULE_conditional_statement = 53, RULE_conditional_comparison_structure = 54, 
		RULE_with_then = 55, RULE_with_comparison = 56, RULE_conditional_body = 57, 
		RULE_if_statement = 58, RULE_else_if_statement = 59, RULE_else_statement = 60, 
		RULE_loop_statement = 61, RULE_loop_conditional = 62, RULE_loop_structure = 63, 
		RULE_loop_variable_declaration = 64, RULE_loop_expression = 65, RULE_while_statement = 66, 
		RULE_for_statement = 67, RULE_function_calling = 68, RULE_function_parameters = 69, 
		RULE_function_paremeters_value = 70, RULE_function_declaration = 71, RULE_function_structure = 72, 
		RULE_function_declaration_parameters = 73, RULE_function_declaration_parameters_body = 74, 
		RULE_void_function = 75, RULE_non_void_function = 76, RULE_error_function = 77, 
		RULE_error_function_head = 78, RULE_scoping_statement = 79, RULE_main_function = 80, 
		RULE_main_head = 81, RULE_main_body = 82, RULE_main_body_first = 83, RULE_main_body_second = 84;
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
			"return_statement", "return_value", "expression", "array_label", "value_expression", 
			"alt_expression", "alt_operator_expression", "alt_parenthesis_expression", 
			"alt_first_expression_operator", "alt_second_expression_operator", "alt_value_expression", 
			"comparison_statement", "assignment_statement", "value_comparison", "conditional_statement", 
			"conditional_comparison_structure", "with_then", "with_comparison", "conditional_body", 
			"if_statement", "else_if_statement", "else_statement", "loop_statement", 
			"loop_conditional", "loop_structure", "loop_variable_declaration", "loop_expression", 
			"while_statement", "for_statement", "function_calling", "function_parameters", 
			"function_paremeters_value", "function_declaration", "function_structure", 
			"function_declaration_parameters", "function_declaration_parameters_body", 
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
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINECOMMENT) {
				{
				{
				setState(170);
				match(LINECOMMENT);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(171);
					match(NEWLINE);
					}
				}

				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(179);
				function_declaration();
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(180);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(191);
				match(WHITE_SPACE);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			main_function();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(198);
				match(NEWLINE);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(204);
				match(WHITE_SPACE);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
			setState(212);
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
			setState(214);
			match(T__0);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(215);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(216);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(217);
					label();
					}
					break;
				case 4:
					{
					setState(218);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(223);
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
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(225);
					match(MINUS);
					}
				}

				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(228);
					match(DIGIT);
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				{
				setState(233);
				match(DOT);
				setState(235); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(237); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(239);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(242);
					match(MINUS);
					}
				}

				setState(246); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(245);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(248); 
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(252);
						label_words();
						}
						} 
					}
					setState(257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(259); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(258);
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
					setState(261); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(263);
						match(DIGIT);
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						label_words();
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						label();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE))) != 0)) {
					{
					{
					setState(281);
					label_words();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				match(DIGIT);
				setState(289); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(288);
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
					setState(291); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293);
						match(DIGIT);
						}
						} 
					}
					setState(298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						label_words();
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						label();
						}
						} 
					}
					setState(310);
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
			setState(319);
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
				setState(314);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(315);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(316);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(317);
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
				setState(318);
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
			setState(321);
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
			setState(323);
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
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(325);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(326);
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
			setState(329);
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
			setState(331);
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
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(333);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(334);
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
			setState(345);
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
				setState(337);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(338);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(339);
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
				setState(340);
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
				setState(341);
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
				setState(342);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(343);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(344);
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
			setState(347);
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
			setState(349);
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
		enterRule(_localctx, 30, RULE_loop_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 32, RULE_simple_punctuations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
			setState(355);
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
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				conditional_statement();
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(364);
					match(LINECOMMENT);
					}
					break;
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				loop_statement();
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(380);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(386);
					match(LINECOMMENT);
					}
					break;
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(389);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(394);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(395);
						match(NEWLINE);
						}
						} 
					}
					setState(400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				print_statement();
				setState(402);
				match(SEMICOLON);
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(409);
					match(LINECOMMENT);
					}
					break;
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(412);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(418);
						match(NEWLINE);
						}
						} 
					}
					setState(423);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				print_statement();
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(425);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(430);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(431);
					match(LINECOMMENT);
					}
					break;
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(434);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(440);
						match(NEWLINE);
						}
						} 
					}
					setState(445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				scan_statement();
				setState(449);
				match(SEMICOLON);
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(450);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(455);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(456);
					match(LINECOMMENT);
					}
					break;
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(459);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(464);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(465);
						match(NEWLINE);
						}
						} 
					}
					setState(470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(471);
				scan_statement();
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(472);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(478);
					match(LINECOMMENT);
					}
					break;
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(481);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(486);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						match(NEWLINE);
						}
						} 
					}
					setState(492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(495);
				return_statement();
				setState(496);
				match(SEMICOLON);
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(503);
					match(LINECOMMENT);
					}
					break;
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(506);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(512);
						match(NEWLINE);
						}
						} 
					}
					setState(517);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(518);
				return_statement();
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(519);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(525);
					match(LINECOMMENT);
					}
					break;
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(528);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(533);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(534);
						match(NEWLINE);
						}
						} 
					}
					setState(539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(542);
				constant_declaration();
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(543);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(549);
					match(LINECOMMENT);
					}
					break;
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(552);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(557);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(558);
						match(NEWLINE);
						}
						} 
					}
					setState(563);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(564);
				any_declaration();
				setState(565);
				match(SEMICOLON);
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(572);
					match(LINECOMMENT);
					}
					break;
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(575);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(581);
						match(NEWLINE);
						}
						} 
					}
					setState(586);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(587);
				any_declaration();
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(588);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(593);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(594);
					match(LINECOMMENT);
					}
					break;
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(597);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(603);
						match(NEWLINE);
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(611);
				scoping_statement();
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(612);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(617);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(618);
					match(LINECOMMENT);
					}
					break;
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(621);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(626);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(627);
						match(NEWLINE);
						}
						} 
					}
					setState(632);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(633);
				function_calling();
				setState(634);
				match(SEMICOLON);
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(635);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(641);
					match(LINECOMMENT);
					}
					break;
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(644);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(650);
						match(NEWLINE);
						}
						} 
					}
					setState(655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(656);
				function_calling();
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(657);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(663);
					match(LINECOMMENT);
					}
					break;
				}
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(666);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(671);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(672);
						match(NEWLINE);
						}
						} 
					}
					setState(677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(680);
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
		enterRule(_localctx, 38, RULE_any_declaration);
		try {
			int _alt;
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(686);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(684);
							label();
							}
							break;
						case 2:
							{
							setState(685);
							variable_type();
							}
							break;
						}
						setState(688);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(692); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(694);
				variable_declaration_vartype();
				notifyErrorListeners("Invalid declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				variable_declaration_no_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				array_declaration_vartype();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(705); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(701);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
						case 1:
							{
							setState(699);
							label();
							}
							break;
						case 2:
							{
							setState(700);
							variable_type();
							}
							break;
						}
						setState(703);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(707); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(709);
				array_declaration_vartype();
				notifyErrorListeners("Invalid declaration");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(712);
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
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(715);
				string();
				}
				break;
			case 2:
				{
				setState(716);
				number();
				}
				break;
			case 3:
				{
				setState(717);
				label();
				}
				break;
			case 4:
				{
				setState(718);
				expression(0);
				}
				break;
			case 5:
				{
				setState(719);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(720);
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
		enterRule(_localctx, 42, RULE_multiple_declaration);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				label();
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(724);
						match(WHITE_SPACE);
						}
					}

					setState(727);
					match(ASSIGN);
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(728);
						match(WHITE_SPACE);
						}
					}

					setState(731);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				variable_type();
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
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
				setState(747);
				label();
				setState(756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(748);
						match(WHITE_SPACE);
						}
					}

					setState(751);
					match(EQUAL);
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
			setState(762);
			variable_type();
			setState(763);
			match(WHITE_SPACE);
			setState(764);
			multiple_declaration();
			setState(775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(765);
						match(WHITE_SPACE);
						}
					}

					setState(768);
					match(COMMA);
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(769);
						match(WHITE_SPACE);
						}
					}

					setState(772);
					multiple_declaration();
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				label();
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
				match(ASSIGN);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(783);
					match(WHITE_SPACE);
					}
				}

				setState(786);
				assigned_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(EQUAL);
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
			setState(801);
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
		enterRule(_localctx, 50, RULE_array_variable);
		int _la;
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				label();
				setState(804);
				match(OPEN_BRACE);
				setState(805);
				array_size();
				setState(806);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				label();
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(809);
					match(OPEN_BRACE);
					}
				}

				setState(812);
				array_size();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(813);
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
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(CREATE);
				setState(821);
				match(WHITE_SPACE);
				setState(822);
				variable_type();
				setState(823);
				match(OPEN_BRACE);
				setState(824);
				array_size();
				setState(825);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				match(CREATE);
				setState(828);
				match(WHITE_SPACE);
				setState(829);
				variable_type();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(830);
					match(OPEN_BRACE);
					}
				}

				setState(833);
				array_size();
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(834);
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
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
				match(ASSIGN);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(845);
					match(WHITE_SPACE);
					}
				}

				setState(848);
				array_assign_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(EQUAL);
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
				array_assign_body();
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(ASSIGN);
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(863);
					match(WHITE_SPACE);
					}
				}

				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(866);
					array_variable();
					}
					break;
				case 2:
					{
					setState(867);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(870);
					match(WHITE_SPACE);
					}
				}

				setState(873);
				match(EQUAL);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(874);
					match(WHITE_SPACE);
					}
				}

				setState(879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(877);
					array_variable();
					}
					break;
				case 2:
					{
					setState(878);
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
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				variable_type();
				setState(886);
				match(OPEN_BRACE);
				setState(887);
				match(CLOSE_BRACE);
				setState(888);
				match(WHITE_SPACE);
				setState(889);
				label();
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(890);
					array_assign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				variable_type();
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(894);
					match(OPEN_BRACE);
					}
				}

				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(897);
					match(CLOSE_BRACE);
					}
				}

				setState(900);
				match(WHITE_SPACE);
				setState(901);
				label();
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(902);
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
			setState(909);
			array_variable();
			setState(910);
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
		int _la;
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				match(PRINT);
				setState(913);
				match(OPEN_PAREN);
				setState(914);
				value_print();
				setState(915);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(PRINT);
				setState(919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(918);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(921);
				value_print();
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(922);
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
		enterRule(_localctx, 62, RULE_value_print);
		int _la;
		try {
			int _alt;
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				label();
				setState(932); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(930);
						match(WHITE_SPACE);
						setState(931);
						label();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(934); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("No double quotes");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				extended_value_print();
				setState(952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(939);
							match(WHITE_SPACE);
							}
						}

						setState(942);
						match(PLUS);
						setState(944);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(943);
							match(WHITE_SPACE);
							}
						}

						setState(946);
						extended_value_print();
						setState(948);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
						case 1:
							{
							setState(947);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(954);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(955);
				extended_value_print();
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(957);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(956);
							match(WHITE_SPACE);
							}
						}

						setState(959);
						match(PLUS);
						setState(961);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(960);
							match(WHITE_SPACE);
							}
						}

						setState(963);
						extended_value_print();
						setState(965);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
						case 1:
							{
							setState(964);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(971);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(973); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(972);
					match(PLUS);
					}
					}
					setState(975); 
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
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(983);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(984);
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
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				match(SCAN);
				setState(988);
				match(OPEN_PAREN);
				setState(989);
				scan_body();
				setState(990);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				match(SCAN);
				setState(994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(993);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(996);
				scan_body();
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(997);
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
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				display_message_parameter();
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
				match(COMMA);
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
				value_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				display_message_parameter();
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1015);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1018);
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
				setState(1023);
				display_message_parameter();
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1024);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1027);
					match(COMMA);
					}
					break;
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1030);
					match(WHITE_SPACE);
					}
				}

				setState(1033);
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
			setState(1051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
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
				setState(1041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1039);
					expression(0);
					}
					break;
				case 2:
					{
					setState(1040);
					scan_label();
					}
					break;
				}
				setState(1046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1043);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1048);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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
			setState(1057); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1057);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						setState(1053);
						match(DIGIT);
						}
						break;
					case 2:
						{
						setState(1054);
						lexer_predefined_words();
						}
						break;
					case 3:
						{
						setState(1055);
						label();
						}
						break;
					case 4:
						{
						setState(1056);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1059); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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
			setState(1065);
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
				setState(1061);
				label();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
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
			setState(1067);
			match(CONSTANT);
			setState(1068);
			match(WHITE_SPACE);
			setState(1069);
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
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				match(RETURN);
				setState(1072);
				match(WHITE_SPACE);
				setState(1073);
				return_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				match(RETURN);
				setState(1075);
				match(WHITE_SPACE);
				setState(1076);
				return_value();
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1077);
					match(WHITE_SPACE);
					}
					}
					setState(1082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1083);
				match(OPEN_PAREN);
				setState(1084);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1087);
				match(RETURN);
				setState(1088);
				match(WHITE_SPACE);
				setState(1089);
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
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1094);
				string();
				}
				break;
			case 2:
				{
				setState(1095);
				number();
				}
				break;
			case 3:
				{
				setState(1096);
				label();
				}
				break;
			case 4:
				{
				setState(1097);
				expression(0);
				}
				break;
			case 5:
				{
				setState(1098);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1102);
				value_expression();
				}
				break;
			case 2:
				{
				setState(1103);
				match(OPEN_PAREN);
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1104);
					match(WHITE_SPACE);
					}
				}

				setState(1107);
				expression(0);
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1108);
					match(WHITE_SPACE);
					}
				}

				setState(1111);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				setState(1114); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1113);
						match(OPEN_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1116); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
				expression(0);
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1122);
					match(WHITE_SPACE);
					}
				}

				setState(1126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1125);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Multiple parenthesis");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1136);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1135);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1138);
						operators();
						}
						setState(1140);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1139);
							match(WHITE_SPACE);
							}
						}

						setState(1142);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
						setState(1150); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1149);
								operators();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1152); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						setState(1155);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1154);
							match(WHITE_SPACE);
							}
						}

						setState(1157);
						expression(4);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
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
		enterRule(_localctx, 84, RULE_array_label);
		int _la;
		try {
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				label();
				setState(1166);
				match(OPEN_BRACE);
				setState(1167);
				alt_expression();
				setState(1168);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				label();
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1171);
					match(OPEN_BRACE);
					}
				}

				setState(1174);
				alt_expression();
				setState(1176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1175);
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
		enterRule(_localctx, 86, RULE_value_expression);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1184);
				function_calling();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1185);
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
		enterRule(_localctx, 88, RULE_alt_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			alt_parenthesis_expression();
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1189);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1192);
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
		enterRule(_localctx, 90, RULE_alt_operator_expression);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				alt_first_expression_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
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
		enterRule(_localctx, 92, RULE_alt_parenthesis_expression);
		int _la;
		try {
			int _alt;
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				match(OPEN_PAREN);
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1199);
					match(WHITE_SPACE);
					}
				}

				setState(1202);
				alt_expression();
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1203);
					match(WHITE_SPACE);
					}
				}

				setState(1206);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1213);
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
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1223);
					match(WHITE_SPACE);
					}
				}

				setState(1227); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1226);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1229); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Uneven parenthesis, duplicate ')'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1233);
				alt_value_expression();
				setState(1235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1234);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1237);
				alt_operator_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1239);
				alt_value_expression();
				setState(1245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1240);
						match(WHITE_SPACE);
						setState(1243);
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
							setState(1241);
							alt_value_expression();
							}
							break;
						case T__0:
							{
							setState(1242);
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
					setState(1247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1249);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1252);
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
		enterRule(_localctx, 94, RULE_alt_first_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				first_operators();
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1258);
					match(WHITE_SPACE);
					}
				}

				setState(1261);
				alt_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				first_operators();
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1264);
					match(WHITE_SPACE);
					}
				}

				setState(1267);
				alt_expression();
				setState(1273); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1268);
						match(WHITE_SPACE);
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
							setState(1269);
							alt_value_expression();
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
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1275); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1279);
				first_operators();
				setState(1287); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1283);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1280);
							match(WHITE_SPACE);
							}
							}
							setState(1285);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1286);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1289); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1291);
					match(WHITE_SPACE);
					}
				}

				setState(1294);
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
		enterRule(_localctx, 96, RULE_alt_second_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				second_operators();
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				second_operators();
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1307);
					match(WHITE_SPACE);
					}
				}

				setState(1310);
				alt_expression();
				setState(1316); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1311);
						match(WHITE_SPACE);
						setState(1314);
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
							setState(1312);
							alt_value_expression();
							}
							break;
						case T__0:
							{
							setState(1313);
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
					setState(1318); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1322);
				second_operators();
				setState(1330); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1326);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1323);
							match(WHITE_SPACE);
							}
							}
							setState(1328);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1329);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1332); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1334);
					match(WHITE_SPACE);
					}
				}

				setState(1337);
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
		enterRule(_localctx, 98, RULE_alt_value_expression);
		try {
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1345);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_comparison_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1349);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(1350);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1351);
					match(NOT);
					}
				}

				setState(1354);
				match(OPEN_PAREN);
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1355);
					match(WHITE_SPACE);
					}
				}

				setState(1358);
				comparison_statement(0);
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1359);
					match(WHITE_SPACE);
					}
				}

				setState(1362);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1366);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1368);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1367);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1370);
						other_operators();
						}
						setState(1372);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1371);
							match(WHITE_SPACE);
							}
						}

						setState(1374);
						comparison_statement(4);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
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
						setState(1382); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1381);
							other_operators();
							}
							}
							setState(1384); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR))) != 0) );
						}
						setState(1387);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1386);
							match(WHITE_SPACE);
							}
						}

						setState(1389);
						comparison_statement(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
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
		enterRule(_localctx, 102, RULE_assignment_statement);
		int _la;
		try {
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				label();
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1398);
					match(WHITE_SPACE);
					}
				}

				setState(1401);
				match(EQUAL);
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1402);
					match(WHITE_SPACE);
					}
				}

				setState(1407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1405);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(1406);
					string();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1409);
				label();
				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1410);
					match(WHITE_SPACE);
					}
				}

				setState(1413);
				match(ASSIGN);
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1414);
					match(WHITE_SPACE);
					}
				}

				setState(1419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1417);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(1418);
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
		enterRule(_localctx, 104, RULE_value_comparison);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1426);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1427);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1428);
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
		enterRule(_localctx, 106, RULE_conditional_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			if_statement();
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1432);
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
			setState(1441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1435);
					else_if_statement();
					setState(1437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
					case 1:
						{
						setState(1436);
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
				setState(1443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			}
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1444);
				else_statement();
				setState(1448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1445);
						match(NEWLINE);
						}
						} 
					}
					setState(1450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
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
		enterRule(_localctx, 108, RULE_conditional_comparison_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			with_comparison();
			setState(1454);
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
		enterRule(_localctx, 110, RULE_with_then);
		int _la;
		try {
			int _alt;
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
				match(THEN);
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1460);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1463);
					match(LINECOMMENT);
					}
					break;
				}
				setState(1469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1466);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1471);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1472);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1475);
					match(THEN);
					}
					break;
				}
				setState(1479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1478);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1481);
					match(LINECOMMENT);
					}
					break;
				}
				setState(1487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1484);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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
		enterRule(_localctx, 112, RULE_with_comparison);
		int _la;
		try {
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				match(OPEN_PAREN);
				setState(1494);
				comparison_statement(0);
				setState(1495);
				match(CLOSE_PAREN);
				setState(1496);
				with_then();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1498);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(1501);
				comparison_statement(0);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1502);
					match(CLOSE_PAREN);
					}
				}

				setState(1505);
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
		enterRule(_localctx, 114, RULE_conditional_body);
		int _la;
		try {
			int _alt;
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1510);
					match(WHITE_SPACE);
					}
					}
					setState(1515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1516);
				match(OPEN_BRACKET);
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1517);
					match(WHITE_SPACE);
					}
					}
					setState(1522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1523);
					statements();
					}
					}
					setState(1526); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1528);
					match(WHITE_SPACE);
					}
					}
					setState(1533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1534);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1536);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				}
				setState(1543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(1542);
					match(OPEN_BRACKET);
					}
					break;
				}
				setState(1548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1545);
					match(WHITE_SPACE);
					}
					}
					setState(1550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1552); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1551);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1554); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1556);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1561);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
				}
				setState(1563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(1562);
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
		enterRule(_localctx, 116, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			match(IF);
			setState(1570);
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
		enterRule(_localctx, 118, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			match(ELSE_IF);
			setState(1573);
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
		enterRule(_localctx, 120, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			match(ELSE);
			setState(1577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1576);
				match(WHITE_SPACE);
				}
			}

			setState(1579);
			match(THEN);
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1580);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1583);
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
		enterRule(_localctx, 122, RULE_loop_statement);
		try {
			setState(1587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
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
		enterRule(_localctx, 124, RULE_loop_conditional);
		try {
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1589);
				match(UP_TO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1590);
				match(DOWN_TO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1591);
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
		enterRule(_localctx, 126, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				loop_conditional();
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1597);
					match(WHITE_SPACE);
					}
				}

				setState(1600);
				expression(0);
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1601);
					match(WHITE_SPACE);
					}
				}

				setState(1604);
				match(OPEN_BRACKET);
				setState(1608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1605);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1610);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
				}
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0)) {
					{
					{
					setState(1611);
					statements();
					}
					}
					setState(1616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1617);
					match(WHITE_SPACE);
					}
					}
					setState(1622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1623);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1625);
				loop_conditional();
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1626);
					match(WHITE_SPACE);
					}
				}

				setState(1629);
				expression(0);
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1630);
					match(WHITE_SPACE);
					}
				}

				setState(1633);
				match(OPEN_BRACKET);
				setState(1637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1634);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
				}
				setState(1643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1640);
						statements();
						}
						} 
					}
					setState(1645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				}
				setState(1649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1646);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				}
				notifyErrorListeners("Missing closing curly brackets");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1654);
				loop_conditional();
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1655);
					match(WHITE_SPACE);
					}
				}

				setState(1658);
				expression(0);
				setState(1660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(1659);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
				}
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0)) {
					{
					{
					setState(1668);
					statements();
					}
					}
					setState(1673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1674);
					match(WHITE_SPACE);
					}
					}
					setState(1679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1680);
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
		enterRule(_localctx, 128, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(1685);
					variable_type();
					setState(1686);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1690);
				label();
				setState(1692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(1691);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(1694);
					match(ASSIGN);
					setState(1696);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(1695);
						match(WHITE_SPACE);
						}
					}

					setState(1698);
					loop_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701);
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
		enterRule(_localctx, 130, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(1704);
				number();
				}
				break;
			case 2:
				{
				setState(1705);
				label();
				}
				break;
			case 3:
				{
				setState(1706);
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
		enterRule(_localctx, 132, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			match(WHILE);
			setState(1711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1710);
				match(WHITE_SPACE);
				}
			}

			setState(1713);
			expression(0);
			setState(1715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1714);
				match(WHITE_SPACE);
				}
			}

			setState(1717);
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
		enterRule(_localctx, 134, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(FOR);
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
			loop_variable_declaration();
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
		enterRule(_localctx, 136, RULE_function_calling);
		int _la;
		try {
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				label();
				setState(1730);
				match(OPEN_PAREN);
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1731);
					function_parameters();
					}
				}

				setState(1734);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1736);
				label();
				setState(1737);
				match(OPEN_PAREN);
				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(1738);
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
				setState(1743);
				label();
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1744);
					function_parameters();
					}
				}

				setState(1747);
				match(CLOSE_PAREN);
				notifyErrorListeners("Missing opening parenthesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1750);
				label();
				setState(1751);
				match(OPEN_PAREN);
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1752);
					function_parameters();
					}
				}

				setState(1755);
				match(CLOSE_PAREN);
				setState(1756);
				match(OPEN_PAREN);
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1757);
					function_parameters();
					}
				}

				setState(1760);
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
		enterRule(_localctx, 138, RULE_function_parameters);
		int _la;
		try {
			int _alt;
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1765);
				function_paremeters_value();
				setState(1776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1767);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1766);
							match(WHITE_SPACE);
							}
						}

						setState(1769);
						match(COMMA);
						setState(1771);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1770);
							match(WHITE_SPACE);
							}
						}

						setState(1773);
						function_paremeters_value();
						}
						} 
					}
					setState(1778);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1779);
				function_paremeters_value();
				setState(1784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1780);
						match(WHITE_SPACE);
						setState(1781);
						function_paremeters_value();
						}
						} 
					}
					setState(1786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
				}
				notifyErrorListeners("Missing Comma");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1789);
				function_paremeters_value();
				setState(1805);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1791);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1790);
							match(WHITE_SPACE);
							}
						}

						setState(1793);
						match(COMMA);
						setState(1795); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1794);
								match(COMMA);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1797); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1800);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1799);
							match(WHITE_SPACE);
							}
						}

						setState(1802);
						function_paremeters_value();
						}
						} 
					}
					setState(1807);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
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
		enterRule(_localctx, 140, RULE_function_paremeters_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(1812);
				label();
				}
				break;
			case 2:
				{
				setState(1813);
				expression(0);
				}
				break;
			case 3:
				{
				setState(1814);
				string();
				}
				break;
			case 4:
				{
				setState(1815);
				number();
				}
				break;
			case 5:
				{
				setState(1816);
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
		enterRule(_localctx, 142, RULE_function_declaration);
		try {
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1819);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1820);
				non_void_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1821);
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
		enterRule(_localctx, 144, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			label();
			setState(1825);
			match(OPEN_PAREN);
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACE) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0)) {
				{
				setState(1826);
				function_declaration_parameters();
				}
			}

			setState(1829);
			match(CLOSE_PAREN);
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1830);
				match(WHITE_SPACE);
				}
			}

			setState(1833);
			match(OPEN_BRACKET);
			setState(1837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1834);
				match(WHITE_SPACE);
				}
				}
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1841); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1840);
				statements();
				}
				}
				setState(1843); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1845);
				match(WHITE_SPACE);
				}
				}
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1851);
			match(CLOSE_BRACKET);
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1852);
				match(NEWLINE);
				}
				}
				setState(1857);
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
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
		enterRule(_localctx, 146, RULE_function_declaration_parameters);
		int _la;
		try {
			setState(1884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1858);
				variable_type();
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1859);
					match(OPEN_BRACE);
					setState(1860);
					match(CLOSE_BRACE);
					}
				}

				setState(1863);
				match(WHITE_SPACE);
				setState(1864);
				label();
				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==WHITE_SPACE) {
					{
					setState(1865);
					function_declaration_parameters_body();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(1868);
					variable_type();
					}
					break;
				}
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1871);
					match(OPEN_BRACE);
					setState(1872);
					match(CLOSE_BRACE);
					}
				}

				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1875);
					match(WHITE_SPACE);
					}
				}

				setState(1878);
				label();
				setState(1880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==WHITE_SPACE) {
					{
					setState(1879);
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
		enterRule(_localctx, 148, RULE_function_declaration_parameters_body);
		int _la;
		try {
			int _alt;
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1886);
				match(COMMA);
				setState(1888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(1887);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1890);
				function_declaration_parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1891);
					match(COMMA);
					}
				}

				setState(1895); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1894);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1897); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1899);
				function_declaration_parameters();
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
		enterRule(_localctx, 150, RULE_void_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(FUNC);
			setState(1905);
			match(WHITE_SPACE);
			setState(1906);
			match(VOID);
			setState(1907);
			match(WHITE_SPACE);
			setState(1908);
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
		enterRule(_localctx, 152, RULE_non_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			match(FUNC);
			setState(1911);
			match(WHITE_SPACE);
			setState(1912);
			variable_type();
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1913);
				match(OPEN_BRACE);
				setState(1914);
				match(CLOSE_BRACE);
				}
			}

			setState(1917);
			match(WHITE_SPACE);
			setState(1918);
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
		enterRule(_localctx, 154, RULE_error_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			error_function_head();
			setState(1921);
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
		enterRule(_localctx, 156, RULE_error_function_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			match(FUNC);
			setState(1924);
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
		enterRule(_localctx, 158, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			match(OPEN_BRACKET);
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1928);
				match(WHITE_SPACE);
				}
				}
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1935); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1934);
				statements();
				}
				}
				setState(1937); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(1942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1939);
				match(WHITE_SPACE);
				}
				}
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1945);
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
		enterRule(_localctx, 160, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			main_head();
			setState(1948);
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
		enterRule(_localctx, 162, RULE_main_head);
		int _la;
		try {
			int _alt;
			setState(1973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				match(MAIN);
				setState(1951);
				match(OPEN_PAREN);
				setState(1952);
				match(CLOSE_PAREN);
				setState(1956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1953);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1958);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1959);
				match(MAIN);
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(1960);
					match(OPEN_PAREN);
					}
				}

				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1963);
					match(CLOSE_PAREN);
					}
				}

				setState(1969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1966);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1971);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
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
		enterRule(_localctx, 164, RULE_main_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			main_body_first();
			setState(1979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1976);
				match(WHITE_SPACE);
				}
				}
				setState(1981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1983); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1982);
				statements();
				}
				}
				setState(1985); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(1990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1987);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			setState(1993);
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
		enterRule(_localctx, 166, RULE_main_body_first);
		try {
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1995);
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
		enterRule(_localctx, 168, RULE_main_body_second);
		try {
			setState(2001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1999);
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
		case 41:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u07d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\5\2\u00af\n\2\7\2\u00b1\n\2\f\2\16\2\u00b4\13\2\3"+
		"\2\3\2\7\2\u00b8\n\2\f\2\16\2\u00bb\13\2\7\2\u00bd\n\2\f\2\16\2\u00c0"+
		"\13\2\3\2\7\2\u00c3\n\2\f\2\16\2\u00c6\13\2\3\2\3\2\7\2\u00ca\n\2\f\2"+
		"\16\2\u00cd\13\2\3\2\7\2\u00d0\n\2\f\2\16\2\u00d3\13\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\6\4\u00de\n\4\r\4\16\4\u00df\3\4\3\4\3\5\5\5\u00e5"+
		"\n\5\3\5\6\5\u00e8\n\5\r\5\16\5\u00e9\3\5\3\5\6\5\u00ee\n\5\r\5\16\5\u00ef"+
		"\3\5\5\5\u00f3\n\5\3\5\5\5\u00f6\n\5\3\5\6\5\u00f9\n\5\r\5\16\5\u00fa"+
		"\5\5\u00fd\n\5\3\6\7\6\u0100\n\6\f\6\16\6\u0103\13\6\3\6\6\6\u0106\n\6"+
		"\r\6\16\6\u0107\3\6\7\6\u010b\n\6\f\6\16\6\u010e\13\6\3\6\7\6\u0111\n"+
		"\6\f\6\16\6\u0114\13\6\3\6\7\6\u0117\n\6\f\6\16\6\u011a\13\6\3\6\7\6\u011d"+
		"\n\6\f\6\16\6\u0120\13\6\3\6\3\6\6\6\u0124\n\6\r\6\16\6\u0125\3\6\7\6"+
		"\u0129\n\6\f\6\16\6\u012c\13\6\3\6\7\6\u012f\n\6\f\6\16\6\u0132\13\6\3"+
		"\6\7\6\u0135\n\6\f\6\16\6\u0138\13\6\3\6\5\6\u013b\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0142\n\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u014a\n\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\5\r\u0152\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u015c\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\7\24\u016a\n\24\f\24\16\24\u016d\13\24\3\24\5\24\u0170\n\24\3\24\7\24"+
		"\u0173\n\24\f\24\16\24\u0176\13\24\3\24\7\24\u0179\n\24\f\24\16\24\u017c"+
		"\13\24\3\24\3\24\7\24\u0180\n\24\f\24\16\24\u0183\13\24\3\24\5\24\u0186"+
		"\n\24\3\24\7\24\u0189\n\24\f\24\16\24\u018c\13\24\3\24\7\24\u018f\n\24"+
		"\f\24\16\24\u0192\13\24\3\24\3\24\3\24\7\24\u0197\n\24\f\24\16\24\u019a"+
		"\13\24\3\24\5\24\u019d\n\24\3\24\7\24\u01a0\n\24\f\24\16\24\u01a3\13\24"+
		"\3\24\7\24\u01a6\n\24\f\24\16\24\u01a9\13\24\3\24\3\24\7\24\u01ad\n\24"+
		"\f\24\16\24\u01b0\13\24\3\24\5\24\u01b3\n\24\3\24\7\24\u01b6\n\24\f\24"+
		"\16\24\u01b9\13\24\3\24\7\24\u01bc\n\24\f\24\16\24\u01bf\13\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u01c6\n\24\f\24\16\24\u01c9\13\24\3\24\5\24\u01cc"+
		"\n\24\3\24\7\24\u01cf\n\24\f\24\16\24\u01d2\13\24\3\24\7\24\u01d5\n\24"+
		"\f\24\16\24\u01d8\13\24\3\24\3\24\7\24\u01dc\n\24\f\24\16\24\u01df\13"+
		"\24\3\24\5\24\u01e2\n\24\3\24\7\24\u01e5\n\24\f\24\16\24\u01e8\13\24\3"+
		"\24\7\24\u01eb\n\24\f\24\16\24\u01ee\13\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u01f5\n\24\f\24\16\24\u01f8\13\24\3\24\5\24\u01fb\n\24\3\24\7\24\u01fe"+
		"\n\24\f\24\16\24\u0201\13\24\3\24\7\24\u0204\n\24\f\24\16\24\u0207\13"+
		"\24\3\24\3\24\7\24\u020b\n\24\f\24\16\24\u020e\13\24\3\24\5\24\u0211\n"+
		"\24\3\24\7\24\u0214\n\24\f\24\16\24\u0217\13\24\3\24\7\24\u021a\n\24\f"+
		"\24\16\24\u021d\13\24\3\24\3\24\3\24\3\24\7\24\u0223\n\24\f\24\16\24\u0226"+
		"\13\24\3\24\5\24\u0229\n\24\3\24\7\24\u022c\n\24\f\24\16\24\u022f\13\24"+
		"\3\24\7\24\u0232\n\24\f\24\16\24\u0235\13\24\3\24\3\24\3\24\7\24\u023a"+
		"\n\24\f\24\16\24\u023d\13\24\3\24\5\24\u0240\n\24\3\24\7\24\u0243\n\24"+
		"\f\24\16\24\u0246\13\24\3\24\7\24\u0249\n\24\f\24\16\24\u024c\13\24\3"+
		"\24\3\24\7\24\u0250\n\24\f\24\16\24\u0253\13\24\3\24\5\24\u0256\n\24\3"+
		"\24\7\24\u0259\n\24\f\24\16\24\u025c\13\24\3\24\7\24\u025f\n\24\f\24\16"+
		"\24\u0262\13\24\3\24\3\24\3\24\3\24\7\24\u0268\n\24\f\24\16\24\u026b\13"+
		"\24\3\24\5\24\u026e\n\24\3\24\7\24\u0271\n\24\f\24\16\24\u0274\13\24\3"+
		"\24\7\24\u0277\n\24\f\24\16\24\u027a\13\24\3\24\3\24\3\24\7\24\u027f\n"+
		"\24\f\24\16\24\u0282\13\24\3\24\5\24\u0285\n\24\3\24\7\24\u0288\n\24\f"+
		"\24\16\24\u028b\13\24\3\24\7\24\u028e\n\24\f\24\16\24\u0291\13\24\3\24"+
		"\3\24\7\24\u0295\n\24\f\24\16\24\u0298\13\24\3\24\5\24\u029b\n\24\3\24"+
		"\7\24\u029e\n\24\f\24\16\24\u02a1\13\24\3\24\7\24\u02a4\n\24\f\24\16\24"+
		"\u02a7\13\24\3\24\3\24\3\24\5\24\u02ac\n\24\3\25\3\25\3\25\5\25\u02b1"+
		"\n\25\3\25\3\25\6\25\u02b5\n\25\r\25\16\25\u02b6\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u02c0\n\25\3\25\3\25\6\25\u02c4\n\25\r\25\16\25\u02c5"+
		"\3\25\3\25\3\25\3\25\5\25\u02cc\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u02d4\n\26\3\27\3\27\5\27\u02d8\n\27\3\27\3\27\5\27\u02dc\n\27\3\27\5"+
		"\27\u02df\n\27\3\27\3\27\5\27\u02e3\n\27\3\27\3\27\5\27\u02e7\n\27\3\27"+
		"\5\27\u02ea\n\27\3\27\3\27\3\27\3\27\5\27\u02f0\n\27\3\27\3\27\5\27\u02f4"+
		"\n\27\3\27\5\27\u02f7\n\27\3\27\3\27\5\27\u02fb\n\27\3\30\3\30\3\30\3"+
		"\30\5\30\u0301\n\30\3\30\3\30\5\30\u0305\n\30\3\30\7\30\u0308\n\30\f\30"+
		"\16\30\u030b\13\30\3\31\3\31\5\31\u030f\n\31\3\31\3\31\5\31\u0313\n\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0319\n\31\3\31\3\31\5\31\u031d\n\31\3\31\3"+
		"\31\3\31\5\31\u0322\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u032d\n\33\3\33\3\33\5\33\u0331\n\33\3\33\3\33\5\33\u0335\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0342\n\34"+
		"\3\34\3\34\5\34\u0346\n\34\3\34\3\34\5\34\u034a\n\34\3\35\5\35\u034d\n"+
		"\35\3\35\3\35\5\35\u0351\n\35\3\35\3\35\5\35\u0355\n\35\3\35\3\35\5\35"+
		"\u0359\n\35\3\35\3\35\3\35\3\35\5\35\u035f\n\35\3\35\3\35\5\35\u0363\n"+
		"\35\3\35\3\35\5\35\u0367\n\35\3\35\5\35\u036a\n\35\3\35\3\35\5\35\u036e"+
		"\n\35\3\35\3\35\5\35\u0372\n\35\3\35\3\35\5\35\u0376\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u037e\n\36\3\36\3\36\5\36\u0382\n\36\3\36\5\36"+
		"\u0385\n\36\3\36\3\36\3\36\5\36\u038a\n\36\3\36\3\36\5\36\u038e\n\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u039a\n \3 \3 \5 \u039e\n \3 \3"+
		" \5 \u03a2\n \3!\3!\3!\6!\u03a7\n!\r!\16!\u03a8\3!\3!\3!\3!\5!\u03af\n"+
		"!\3!\3!\5!\u03b3\n!\3!\3!\5!\u03b7\n!\7!\u03b9\n!\f!\16!\u03bc\13!\3!"+
		"\3!\5!\u03c0\n!\3!\3!\5!\u03c4\n!\3!\3!\5!\u03c8\n!\7!\u03ca\n!\f!\16"+
		"!\u03cd\13!\3!\6!\u03d0\n!\r!\16!\u03d1\3!\3!\5!\u03d6\n!\3\"\3\"\3\""+
		"\3\"\5\"\u03dc\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u03e5\n#\3#\3#\5#\u03e9\n#"+
		"\3#\3#\5#\u03ed\n#\3$\3$\5$\u03f1\n$\3$\3$\5$\u03f5\n$\3$\3$\3$\3$\5$"+
		"\u03fb\n$\3$\5$\u03fe\n$\3$\3$\3$\3$\5$\u0404\n$\3$\5$\u0407\n$\3$\5$"+
		"\u040a\n$\3$\3$\3$\5$\u040f\n$\3%\3%\3%\5%\u0414\n%\3%\7%\u0417\n%\f%"+
		"\16%\u041a\13%\3%\3%\5%\u041e\n%\3&\3&\3&\3&\6&\u0424\n&\r&\16&\u0425"+
		"\3\'\3\'\3\'\3\'\5\'\u042c\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\7)\u0439"+
		"\n)\f)\16)\u043c\13)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0447\n)\3*\3*\3*\3"+
		"*\3*\5*\u044e\n*\3+\3+\3+\3+\5+\u0454\n+\3+\3+\5+\u0458\n+\3+\3+\3+\6"+
		"+\u045d\n+\r+\16+\u045e\3+\5+\u0462\n+\3+\3+\5+\u0466\n+\3+\6+\u0469\n"+
		"+\r+\16+\u046a\3+\3+\5+\u046f\n+\3+\3+\5+\u0473\n+\3+\3+\5+\u0477\n+\3"+
		"+\3+\3+\3+\5+\u047d\n+\3+\3+\6+\u0481\n+\r+\16+\u0482\3+\5+\u0486\n+\3"+
		"+\3+\3+\7+\u048b\n+\f+\16+\u048e\13+\3,\3,\3,\3,\3,\3,\3,\5,\u0497\n,"+
		"\3,\3,\5,\u049b\n,\3,\3,\5,\u049f\n,\3-\3-\3-\3-\5-\u04a5\n-\3.\3.\5."+
		"\u04a9\n.\3.\3.\3/\3/\5/\u04af\n/\3\60\3\60\5\60\u04b3\n\60\3\60\3\60"+
		"\5\60\u04b7\n\60\3\60\3\60\3\60\3\60\5\60\u04bd\n\60\3\60\3\60\5\60\u04c1"+
		"\n\60\3\60\3\60\3\60\3\60\5\60\u04c7\n\60\3\60\3\60\5\60\u04cb\n\60\3"+
		"\60\6\60\u04ce\n\60\r\60\16\60\u04cf\3\60\3\60\3\60\3\60\5\60\u04d6\n"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u04de\n\60\6\60\u04e0\n\60\r\60"+
		"\16\60\u04e1\3\60\5\60\u04e5\n\60\3\60\3\60\3\60\5\60\u04ea\n\60\3\61"+
		"\3\61\5\61\u04ee\n\61\3\61\3\61\3\61\3\61\5\61\u04f4\n\61\3\61\3\61\3"+
		"\61\3\61\5\61\u04fa\n\61\6\61\u04fc\n\61\r\61\16\61\u04fd\3\61\3\61\3"+
		"\61\3\61\7\61\u0504\n\61\f\61\16\61\u0507\13\61\3\61\6\61\u050a\n\61\r"+
		"\61\16\61\u050b\3\61\5\61\u050f\n\61\3\61\3\61\3\61\3\61\5\61\u0515\n"+
		"\61\3\62\3\62\5\62\u0519\n\62\3\62\3\62\3\62\3\62\5\62\u051f\n\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0525\n\62\6\62\u0527\n\62\r\62\16\62\u0528\3\62"+
		"\3\62\3\62\3\62\7\62\u052f\n\62\f\62\16\62\u0532\13\62\3\62\6\62\u0535"+
		"\n\62\r\62\16\62\u0536\3\62\5\62\u053a\n\62\3\62\3\62\3\62\3\62\5\62\u0540"+
		"\n\62\3\63\3\63\3\63\5\63\u0545\n\63\3\64\3\64\3\64\3\64\5\64\u054b\n"+
		"\64\3\64\3\64\5\64\u054f\n\64\3\64\3\64\5\64\u0553\n\64\3\64\3\64\5\64"+
		"\u0557\n\64\3\64\3\64\5\64\u055b\n\64\3\64\3\64\5\64\u055f\n\64\3\64\3"+
		"\64\3\64\3\64\5\64\u0565\n\64\3\64\3\64\6\64\u0569\n\64\r\64\16\64\u056a"+
		"\3\64\5\64\u056e\n\64\3\64\3\64\3\64\7\64\u0573\n\64\f\64\16\64\u0576"+
		"\13\64\3\65\3\65\5\65\u057a\n\65\3\65\3\65\5\65\u057e\n\65\3\65\3\65\5"+
		"\65\u0582\n\65\3\65\3\65\5\65\u0586\n\65\3\65\3\65\5\65\u058a\n\65\3\65"+
		"\3\65\5\65\u058e\n\65\3\65\3\65\5\65\u0592\n\65\3\66\3\66\3\66\3\66\5"+
		"\66\u0598\n\66\3\67\3\67\5\67\u059c\n\67\3\67\3\67\5\67\u05a0\n\67\7\67"+
		"\u05a2\n\67\f\67\16\67\u05a5\13\67\3\67\3\67\7\67\u05a9\n\67\f\67\16\67"+
		"\u05ac\13\67\5\67\u05ae\n\67\38\38\38\39\59\u05b4\n9\39\39\59\u05b8\n"+
		"9\39\59\u05bb\n9\39\79\u05be\n9\f9\169\u05c1\139\39\59\u05c4\n9\39\59"+
		"\u05c7\n9\39\59\u05ca\n9\39\59\u05cd\n9\39\79\u05d0\n9\f9\169\u05d3\13"+
		"9\39\59\u05d6\n9\3:\3:\3:\3:\3:\3:\5:\u05de\n:\3:\3:\5:\u05e2\n:\3:\3"+
		":\3:\5:\u05e7\n:\3;\7;\u05ea\n;\f;\16;\u05ed\13;\3;\3;\7;\u05f1\n;\f;"+
		"\16;\u05f4\13;\3;\6;\u05f7\n;\r;\16;\u05f8\3;\7;\u05fc\n;\f;\16;\u05ff"+
		"\13;\3;\3;\3;\7;\u0604\n;\f;\16;\u0607\13;\3;\5;\u060a\n;\3;\7;\u060d"+
		"\n;\f;\16;\u0610\13;\3;\6;\u0613\n;\r;\16;\u0614\3;\7;\u0618\n;\f;\16"+
		";\u061b\13;\3;\5;\u061e\n;\3;\3;\5;\u0622\n;\3<\3<\3<\3=\3=\3=\3>\3>\5"+
		">\u062c\n>\3>\3>\5>\u0630\n>\3>\3>\3?\3?\5?\u0636\n?\3@\3@\3@\3@\3@\5"+
		"@\u063d\n@\3A\3A\5A\u0641\nA\3A\3A\5A\u0645\nA\3A\3A\7A\u0649\nA\fA\16"+
		"A\u064c\13A\3A\7A\u064f\nA\fA\16A\u0652\13A\3A\7A\u0655\nA\fA\16A\u0658"+
		"\13A\3A\3A\3A\3A\5A\u065e\nA\3A\3A\5A\u0662\nA\3A\3A\7A\u0666\nA\fA\16"+
		"A\u0669\13A\3A\7A\u066c\nA\fA\16A\u066f\13A\3A\7A\u0672\nA\fA\16A\u0675"+
		"\13A\3A\3A\3A\3A\5A\u067b\nA\3A\3A\5A\u067f\nA\3A\7A\u0682\nA\fA\16A\u0685"+
		"\13A\3A\7A\u0688\nA\fA\16A\u068b\13A\3A\7A\u068e\nA\fA\16A\u0691\13A\3"+
		"A\3A\3A\5A\u0696\nA\3B\3B\3B\5B\u069b\nB\3B\3B\5B\u069f\nB\3B\3B\5B\u06a3"+
		"\nB\3B\5B\u06a6\nB\3B\5B\u06a9\nB\3C\3C\3C\5C\u06ae\nC\3D\3D\5D\u06b2"+
		"\nD\3D\3D\5D\u06b6\nD\3D\3D\3E\3E\5E\u06bc\nE\3E\3E\5E\u06c0\nE\3E\3E"+
		"\3F\3F\3F\5F\u06c7\nF\3F\3F\3F\3F\3F\5F\u06ce\nF\3F\3F\3F\3F\5F\u06d4"+
		"\nF\3F\3F\3F\3F\3F\3F\5F\u06dc\nF\3F\3F\3F\5F\u06e1\nF\3F\3F\3F\5F\u06e6"+
		"\nF\3G\3G\5G\u06ea\nG\3G\3G\5G\u06ee\nG\3G\7G\u06f1\nG\fG\16G\u06f4\13"+
		"G\3G\3G\3G\7G\u06f9\nG\fG\16G\u06fc\13G\3G\3G\3G\3G\5G\u0702\nG\3G\3G"+
		"\6G\u0706\nG\rG\16G\u0707\3G\5G\u070b\nG\3G\7G\u070e\nG\fG\16G\u0711\13"+
		"G\3G\3G\5G\u0715\nG\3H\3H\3H\3H\3H\5H\u071c\nH\3I\3I\3I\5I\u0721\nI\3"+
		"J\3J\3J\5J\u0726\nJ\3J\3J\5J\u072a\nJ\3J\3J\7J\u072e\nJ\fJ\16J\u0731\13"+
		"J\3J\6J\u0734\nJ\rJ\16J\u0735\3J\7J\u0739\nJ\fJ\16J\u073c\13J\3J\3J\7"+
		"J\u0740\nJ\fJ\16J\u0743\13J\3K\3K\3K\5K\u0748\nK\3K\3K\3K\5K\u074d\nK"+
		"\3K\5K\u0750\nK\3K\3K\5K\u0754\nK\3K\5K\u0757\nK\3K\3K\5K\u075b\nK\3K"+
		"\3K\5K\u075f\nK\3L\3L\5L\u0763\nL\3L\3L\5L\u0767\nL\3L\6L\u076a\nL\rL"+
		"\16L\u076b\3L\3L\3L\5L\u0771\nL\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\5N\u077e"+
		"\nN\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\7Q\u078c\nQ\fQ\16Q\u078f\13Q\3"+
		"Q\6Q\u0792\nQ\rQ\16Q\u0793\3Q\7Q\u0797\nQ\fQ\16Q\u079a\13Q\3Q\3Q\3R\3"+
		"R\3R\3S\3S\3S\3S\7S\u07a5\nS\fS\16S\u07a8\13S\3S\3S\5S\u07ac\nS\3S\5S"+
		"\u07af\nS\3S\7S\u07b2\nS\fS\16S\u07b5\13S\3S\5S\u07b8\nS\3T\3T\7T\u07bc"+
		"\nT\fT\16T\u07bf\13T\3T\6T\u07c2\nT\rT\16T\u07c3\3T\7T\u07c7\nT\fT\16"+
		"T\u07ca\13T\3T\3T\3U\3U\5U\u07d0\nU\3V\3V\5V\u07d4\nV\3V\2\4TfW\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\2\16\3\2\25\30\5\2\4\4\62\62\64\65\3\2%\'\3\2#$\3\2()\3\2"+
		"\37\"\3\2\5\f\3\2\r\20\3\2\21\24\3\2*\63\3\2\31\36\4\2\67\6799\2\u091d"+
		"\2\u00b2\3\2\2\2\4\u00d6\3\2\2\2\6\u00d8\3\2\2\2\b\u00fc\3\2\2\2\n\u013a"+
		"\3\2\2\2\f\u0141\3\2\2\2\16\u0143\3\2\2\2\20\u0145\3\2\2\2\22\u0149\3"+
		"\2\2\2\24\u014b\3\2\2\2\26\u014d\3\2\2\2\30\u0151\3\2\2\2\32\u015b\3\2"+
		"\2\2\34\u015d\3\2\2\2\36\u015f\3\2\2\2 \u0161\3\2\2\2\"\u0163\3\2\2\2"+
		"$\u0165\3\2\2\2&\u02ab\3\2\2\2(\u02cb\3\2\2\2*\u02d3\3\2\2\2,\u02fa\3"+
		"\2\2\2.\u02fc\3\2\2\2\60\u0321\3\2\2\2\62\u0323\3\2\2\2\64\u0334\3\2\2"+
		"\2\66\u0349\3\2\2\28\u0375\3\2\2\2:\u038d\3\2\2\2<\u038f\3\2\2\2>\u03a1"+
		"\3\2\2\2@\u03d5\3\2\2\2B\u03db\3\2\2\2D\u03ec\3\2\2\2F\u040e\3\2\2\2H"+
		"\u041d\3\2\2\2J\u0423\3\2\2\2L\u042b\3\2\2\2N\u042d\3\2\2\2P\u0446\3\2"+
		"\2\2R\u044d\3\2\2\2T\u046e\3\2\2\2V\u049e\3\2\2\2X\u04a4\3\2\2\2Z\u04a6"+
		"\3\2\2\2\\\u04ae\3\2\2\2^\u04e9\3\2\2\2`\u0514\3\2\2\2b\u053f\3\2\2\2"+
		"d\u0544\3\2\2\2f\u0556\3\2\2\2h\u0591\3\2\2\2j\u0597\3\2\2\2l\u0599\3"+
		"\2\2\2n\u05af\3\2\2\2p\u05d5\3\2\2\2r\u05e6\3\2\2\2t\u0621\3\2\2\2v\u0623"+
		"\3\2\2\2x\u0626\3\2\2\2z\u0629\3\2\2\2|\u0635\3\2\2\2~\u063c\3\2\2\2\u0080"+
		"\u0695\3\2\2\2\u0082\u06a8\3\2\2\2\u0084\u06ad\3\2\2\2\u0086\u06af\3\2"+
		"\2\2\u0088\u06b9\3\2\2\2\u008a\u06e5\3\2\2\2\u008c\u0714\3\2\2\2\u008e"+
		"\u071b\3\2\2\2\u0090\u0720\3\2\2\2\u0092\u0722\3\2\2\2\u0094\u075e\3\2"+
		"\2\2\u0096\u0770\3\2\2\2\u0098\u0772\3\2\2\2\u009a\u0778\3\2\2\2\u009c"+
		"\u0782\3\2\2\2\u009e\u0785\3\2\2\2\u00a0\u0789\3\2\2\2\u00a2\u079d\3\2"+
		"\2\2\u00a4\u07b7\3\2\2\2\u00a6\u07b9\3\2\2\2\u00a8\u07cf\3\2\2\2\u00aa"+
		"\u07d3\3\2\2\2\u00ac\u00ae\78\2\2\u00ad\u00af\7\67\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00be\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b9\5\u0090I\2\u00b6\u00b8\79\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c4\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\79\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cb\5\u00a2R\2\u00c8\u00ca\7\67\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00d1\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\79\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\2\2\3\u00d5"+
		"\3\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\5\3\2\2\2\u00d8\u00dd\7\3\2\2\u00d9"+
		"\u00de\7\66\2\2\u00da\u00de\5\32\16\2\u00db\u00de\5\n\6\2\u00dc\u00de"+
		"\79\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\3\2\2\u00e2\7\3\2\2\2\u00e3\u00e5"+
		"\7$\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e8\7\66\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\7/\2\2\u00ec"+
		"\u00ee\7\66\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\7\4\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00fd\3\2\2\2\u00f4\u00f6\7$"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f9\7\66\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00e4\3\2\2\2\u00fc"+
		"\u00f5\3\2\2\2\u00fd\t\3\2\2\2\u00fe\u0100\5\f\7\2\u00ff\u00fe\3\2\2\2"+
		"\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\t\3\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c\3\2"+
		"\2\2\u0109\u010b\7\66\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0112\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0111\5\f\7\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0118\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0117\5\n\6\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u013b\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011d\5\f\7\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0123\7\66\2\2\u0122\u0124\t\3\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a\3\2"+
		"\2\2\u0127\u0129\7\66\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0130\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u012f\5\f\7\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0136\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0135\5\n\6\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u013b\b\6\1\2\u013a\u0101\3\2\2\2\u013a\u011e\3\2\2\2\u013b"+
		"\13\3\2\2\2\u013c\u0142\5\34\17\2\u013d\u0142\5\36\20\2\u013e\u0142\5"+
		" \21\2\u013f\u0142\5\4\3\2\u0140\u0142\5\"\22\2\u0141\u013c\3\2\2\2\u0141"+
		"\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2"+
		"\2\2\u0142\r\3\2\2\2\u0143\u0144\t\4\2\2\u0144\17\3\2\2\2\u0145\u0146"+
		"\t\5\2\2\u0146\21\3\2\2\2\u0147\u014a\5\16\b\2\u0148\u014a\5\20\t\2\u0149"+
		"\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\23\3\2\2\2\u014b\u014c\t\6\2"+
		"\2\u014c\25\3\2\2\2\u014d\u014e\t\7\2\2\u014e\27\3\2\2\2\u014f\u0152\5"+
		"\24\13\2\u0150\u0152\5\26\f\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2"+
		"\u0152\31\3\2\2\2\u0153\u015c\5\34\17\2\u0154\u015c\5\36\20\2\u0155\u015c"+
		"\5 \21\2\u0156\u015c\5\"\22\2\u0157\u015c\5$\23\2\u0158\u015c\5\30\r\2"+
		"\u0159\u015c\5\22\n\2\u015a\u015c\5\4\3\2\u015b\u0153\3\2\2\2\u015b\u0154"+
		"\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b"+
		"\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\33\3\2\2"+
		"\2\u015d\u015e\t\b\2\2\u015e\35\3\2\2\2\u015f\u0160\t\t\2\2\u0160\37\3"+
		"\2\2\2\u0161\u0162\t\n\2\2\u0162!\3\2\2\2\u0163\u0164\t\13\2\2\u0164#"+
		"\3\2\2\2\u0165\u0166\t\f\2\2\u0166%\3\2\2\2\u0167\u016b\5l\67\2\u0168"+
		"\u016a\79\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0170\78\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\3\2"+
		"\2\2\u0171\u0173\79\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u017a\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0179\7\67\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u02ac\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u0181\5|?\2\u017e\u0180\79\2\2\u017f\u017e\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0186\78\2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u018a\3\2\2\2\u0187\u0189\79\2\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0190\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u018f\7\67\2\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u02ac\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0193\u0194\5> \2\u0194\u0198\7\60\2\2\u0195"+
		"\u0197\79\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u019d\78\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a1\3\2"+
		"\2\2\u019e\u01a0\79\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a7\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a6\7\67\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u02ac\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01aa\u01ae\5> \2\u01ab\u01ad\79\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b3\78\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b7\3\2\2\2\u01b4\u01b6\79\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bd\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\7\67\2\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\b\24\1\2\u01c1\u02ac\3\2\2\2\u01c2"+
		"\u01c3\5D#\2\u01c3\u01c7\7\60\2\2\u01c4\u01c6\79\2\2\u01c5\u01c4\3\2\2"+
		"\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\78\2\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf\79\2\2\u01ce\u01cd\3\2"+
		"\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d6\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d5\7\67\2\2\u01d4\u01d3\3"+
		"\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u02ac\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01dd\5D#\2\u01da\u01dc\79\2"+
		"\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e2\78\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e6\3\2\2\2\u01e3\u01e5\79"+
		"\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01ec\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\7\67"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\b\24"+
		"\1\2\u01f0\u02ac\3\2\2\2\u01f1\u01f2\5P)\2\u01f2\u01f6\7\60\2\2\u01f3"+
		"\u01f5\79\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fb\78\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01ff\3\2"+
		"\2\2\u01fc\u01fe\79\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0205\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0202\u0204\7\67\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u02ac\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0208\u020c\5P)\2\u0209\u020b\79\2\2\u020a\u0209\3\2\2\2\u020b\u020e"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0210\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0211\78\2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0215\3\2\2\2\u0212\u0214\79\2\2\u0213\u0212\3\2\2\2\u0214"+
		"\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021b\3\2"+
		"\2\2\u0217\u0215\3\2\2\2\u0218\u021a\7\67\2\2\u0219\u0218\3\2\2\2\u021a"+
		"\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021e\u021f\b\24\1\2\u021f\u02ac\3\2\2\2\u0220"+
		"\u0224\5N(\2\u0221\u0223\79\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2"+
		"\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0227\u0229\78\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022d\3\2\2\2\u022a\u022c\79\2\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2"+
		"\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0233\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0232\7\67\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3"+
		"\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u02ac\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0236\u0237\5(\25\2\u0237\u023b\7\60\2\2\u0238\u023a\7"+
		"9\2\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0240\78"+
		"\2\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0244\3\2\2\2\u0241"+
		"\u0243\79\2\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u024a\3\2\2\2\u0246\u0244\3\2\2\2\u0247"+
		"\u0249\7\67\2\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3"+
		"\2\2\2\u024a\u024b\3\2\2\2\u024b\u02ac\3\2\2\2\u024c\u024a\3\2\2\2\u024d"+
		"\u0251\5(\25\2\u024e\u0250\79\2\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2"+
		"\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0256\78\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u025a\3\2\2\2\u0257\u0259\79\2\2\u0258\u0257\3\2\2\2\u0259"+
		"\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0260\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025d\u025f\7\67\2\2\u025e\u025d\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0263\u0264\b\24\1\2\u0264\u02ac\3\2\2\2\u0265"+
		"\u0269\5\u00a0Q\2\u0266\u0268\79\2\2\u0267\u0266\3\2\2\2\u0268\u026b\3"+
		"\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026e\78\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u0272\3\2\2\2\u026f\u0271\79\2\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0278\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0277\7\67\2\2\u0276\u0275\3\2\2\2\u0277"+
		"\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u02ac\3\2"+
		"\2\2\u027a\u0278\3\2\2\2\u027b\u027c\5\u008aF\2\u027c\u0280\7\60\2\2\u027d"+
		"\u027f\79\2\2\u027e\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0283"+
		"\u0285\78\2\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0289\3\2"+
		"\2\2\u0286\u0288\79\2\2\u0287\u0286\3\2\2\2\u0288\u028b\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028f\3\2\2\2\u028b\u0289\3\2"+
		"\2\2\u028c\u028e\7\67\2\2\u028d\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f"+
		"\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u02ac\3\2\2\2\u0291\u028f\3\2"+
		"\2\2\u0292\u0296\5\u008aF\2\u0293\u0295\79\2\2\u0294\u0293\3\2\2\2\u0295"+
		"\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0299\u029b\78\2\2\u029a\u0299\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029f\3\2\2\2\u029c\u029e\79\2\2\u029d\u029c\3\2"+
		"\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a5\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a4\7\67\2\2\u02a3\u02a2\3"+
		"\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\b\24\1\2\u02a9\u02ac\3"+
		"\2\2\2\u02aa\u02ac\78\2\2\u02ab\u0167\3\2\2\2\u02ab\u017d\3\2\2\2\u02ab"+
		"\u0193\3\2\2\2\u02ab\u01aa\3\2\2\2\u02ab\u01c2\3\2\2\2\u02ab\u01d9\3\2"+
		"\2\2\u02ab\u01f1\3\2\2\2\u02ab\u0208\3\2\2\2\u02ab\u0220\3\2\2\2\u02ab"+
		"\u0236\3\2\2\2\u02ab\u024d\3\2\2\2\u02ab\u0265\3\2\2\2\u02ab\u027b\3\2"+
		"\2\2\u02ab\u0292\3\2\2\2\u02ab\u02aa\3\2\2\2\u02ac\'\3\2\2\2\u02ad\u02cc"+
		"\5.\30\2\u02ae\u02b1\5\n\6\2\u02af\u02b1\5\4\3\2\u02b0\u02ae\3\2\2\2\u02b0"+
		"\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\79\2\2\u02b3\u02b5\3\2"+
		"\2\2\u02b4\u02b0\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\5.\30\2\u02b9\u02ba\b\25"+
		"\1\2\u02ba\u02cc\3\2\2\2\u02bb\u02cc\5\60\31\2\u02bc\u02cc\5:\36\2\u02bd"+
		"\u02c0\5\n\6\2\u02be\u02c0\5\4\3\2\u02bf\u02bd\3\2\2\2\u02bf\u02be\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\79\2\2\u02c2\u02c4\3\2\2\2\u02c3"+
		"\u02bf\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\5:\36\2\u02c8\u02c9\b\25\1\2\u02c9"+
		"\u02cc\3\2\2\2\u02ca\u02cc\5<\37\2\u02cb\u02ad\3\2\2\2\u02cb\u02b4\3\2"+
		"\2\2\u02cb\u02bb\3\2\2\2\u02cb\u02bc\3\2\2\2\u02cb\u02c3\3\2\2\2\u02cb"+
		"\u02ca\3\2\2\2\u02cc)\3\2\2\2\u02cd\u02d4\5\6\4\2\u02ce\u02d4\5\b\5\2"+
		"\u02cf\u02d4\5\n\6\2\u02d0\u02d4\5T+\2\u02d1\u02d4\5f\64\2\u02d2\u02d4"+
		"\5\u008aF\2\u02d3\u02cd\3\2\2\2\u02d3\u02ce\3\2\2\2\u02d3\u02cf\3\2\2"+
		"\2\u02d3\u02d0\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4+"+
		"\3\2\2\2\u02d5\u02de\5\n\6\2\u02d6\u02d8\79\2\2\u02d7\u02d6\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\7+\2\2\u02da\u02dc\79\2"+
		"\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df"+
		"\5*\26\2\u02de\u02d7\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02fb\3\2\2\2\u02e0"+
		"\u02e9\5\4\3\2\u02e1\u02e3\79\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\7+\2\2\u02e5\u02e7\79\2\2\u02e6\u02e5"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\5*\26\2\u02e9"+
		"\u02e2\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\b\27"+
		"\1\2\u02ec\u02fb\3\2\2\2\u02ed\u02f6\5\n\6\2\u02ee\u02f0\79\2\2\u02ef"+
		"\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\7,"+
		"\2\2\u02f2\u02f4\79\2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f7\5*\26\2\u02f6\u02ef\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\b\27\1\2\u02f9\u02fb\3\2\2\2\u02fa"+
		"\u02d5\3\2\2\2\u02fa\u02e0\3\2\2\2\u02fa\u02ed\3\2\2\2\u02fb-\3\2\2\2"+
		"\u02fc\u02fd\5\4\3\2\u02fd\u02fe\79\2\2\u02fe\u0309\5,\27\2\u02ff\u0301"+
		"\79\2\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0304\7\61\2\2\u0303\u0305\79\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u0308\5,\27\2\u0307\u0300\3\2\2\2\u0308"+
		"\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a/\3\2\2\2"+
		"\u030b\u0309\3\2\2\2\u030c\u030e\5\n\6\2\u030d\u030f\79\2\2\u030e\u030d"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312\7+\2\2\u0311"+
		"\u0313\79\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2"+
		"\2\2\u0314\u0315\5*\26\2\u0315\u0322\3\2\2\2\u0316\u0318\5\n\6\2\u0317"+
		"\u0319\79\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2"+
		"\2\2\u031a\u031c\7,\2\2\u031b\u031d\79\2\2\u031c\u031b\3\2\2\2\u031c\u031d"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\5*\26\2\u031f\u0320\b\31\1\2"+
		"\u0320\u0322\3\2\2\2\u0321\u030c\3\2\2\2\u0321\u0316\3\2\2\2\u0322\61"+
		"\3\2\2\2\u0323\u0324\5T+\2\u0324\63\3\2\2\2\u0325\u0326\5\n\6\2\u0326"+
		"\u0327\7\35\2\2\u0327\u0328\5\62\32\2\u0328\u0329\7\36\2\2\u0329\u0335"+
		"\3\2\2\2\u032a\u032c\5\n\6\2\u032b\u032d\7\35\2\2\u032c\u032b\3\2\2\2"+
		"\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\5\62\32\2\u032f\u0331"+
		"\7\36\2\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2\2"+
		"\u0332\u0333\b\33\1\2\u0333\u0335\3\2\2\2\u0334\u0325\3\2\2\2\u0334\u032a"+
		"\3\2\2\2\u0335\65\3\2\2\2\u0336\u0337\7\5\2\2\u0337\u0338\79\2\2\u0338"+
		"\u0339\5\4\3\2\u0339\u033a\7\35\2\2\u033a\u033b\5\62\32\2\u033b\u033c"+
		"\7\36\2\2\u033c\u034a\3\2\2\2\u033d\u033e\7\5\2\2\u033e\u033f\79\2\2\u033f"+
		"\u0341\5\4\3\2\u0340\u0342\7\35\2\2\u0341\u0340\3\2\2\2\u0341\u0342\3"+
		"\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\5\62\32\2\u0344\u0346\7\36\2\2"+
		"\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348"+
		"\b\34\1\2\u0348\u034a\3\2\2\2\u0349\u0336\3\2\2\2\u0349\u033d\3\2\2\2"+
		"\u034a\67\3\2\2\2\u034b\u034d\79\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3"+
		"\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350\7+\2\2\u034f\u0351\79\2\2\u0350"+
		"\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0376\5\66"+
		"\34\2\u0353\u0355\79\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0358\7,\2\2\u0357\u0359\79\2\2\u0358\u0357\3\2\2"+
		"\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\5\66\34\2\u035b"+
		"\u035c\b\35\1\2\u035c\u0376\3\2\2\2\u035d\u035f\79\2\2\u035e\u035d\3\2"+
		"\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\7+\2\2\u0361"+
		"\u0363\79\2\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0366\3\2"+
		"\2\2\u0364\u0367\5\64\33\2\u0365\u0367\5*\26\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0365\3\2\2\2\u0367\u0376\3\2\2\2\u0368\u036a\79\2\2\u0369\u0368\3\2"+
		"\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d\7,\2\2\u036c"+
		"\u036e\79\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0371\3\2"+
		"\2\2\u036f\u0372\5\64\33\2\u0370\u0372\5*\26\2\u0371\u036f\3\2\2\2\u0371"+
		"\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\b\35\1\2\u0374\u0376\3"+
		"\2\2\2\u0375\u034c\3\2\2\2\u0375\u0354\3\2\2\2\u0375\u035e\3\2\2\2\u0375"+
		"\u0369\3\2\2\2\u03769\3\2\2\2\u0377\u0378\5\4\3\2\u0378\u0379\7\35\2\2"+
		"\u0379\u037a\7\36\2\2\u037a\u037b\79\2\2\u037b\u037d\5\n\6\2\u037c\u037e"+
		"\58\35\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u038e\3\2\2\2\u037f"+
		"\u0381\5\4\3\2\u0380\u0382\7\35\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3"+
		"\2\2\2\u0382\u0384\3\2\2\2\u0383\u0385\7\36\2\2\u0384\u0383\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\79\2\2\u0387\u0389\5\n"+
		"\6\2\u0388\u038a\58\35\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038c\b\36\1\2\u038c\u038e\3\2\2\2\u038d\u0377\3"+
		"\2\2\2\u038d\u037f\3\2\2\2\u038e;\3\2\2\2\u038f\u0390\5\64\33\2\u0390"+
		"\u0391\58\35\2\u0391=\3\2\2\2\u0392\u0393\7\b\2\2\u0393\u0394\7\31\2\2"+
		"\u0394\u0395\5@!\2\u0395\u0396\7\32\2\2\u0396\u03a2\3\2\2\2\u0397\u0399"+
		"\7\b\2\2\u0398\u039a\7\31\2\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2"+
		"\u039a\u039b\3\2\2\2\u039b\u039d\5@!\2\u039c\u039e\7\32\2\2\u039d\u039c"+
		"\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\b \1\2\u03a0"+
		"\u03a2\3\2\2\2\u03a1\u0392\3\2\2\2\u03a1\u0397\3\2\2\2\u03a2?\3\2\2\2"+
		"\u03a3\u03a6\5\n\6\2\u03a4\u03a5\79\2\2\u03a5\u03a7\5\n\6\2\u03a6\u03a4"+
		"\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03aa\3\2\2\2\u03aa\u03ab\b!\1\2\u03ab\u03d6\3\2\2\2\u03ac\u03ba\5B\""+
		"\2\u03ad\u03af\79\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0"+
		"\3\2\2\2\u03b0\u03b2\7#\2\2\u03b1\u03b3\79\2\2\u03b2\u03b1\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\5B\"\2\u03b5\u03b7\79\2"+
		"\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03ae"+
		"\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb"+
		"\u03d6\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03cb\5B\"\2\u03be\u03c0\79\2"+
		"\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3"+
		"\7#\2\2\u03c2\u03c4\79\2\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03c7\5B\"\2\u03c6\u03c8\79\2\2\u03c7\u03c6\3\2\2"+
		"\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03bf\3\2\2\2\u03ca\u03cd"+
		"\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd"+
		"\u03cb\3\2\2\2\u03ce\u03d0\7#\2\2\u03cf\u03ce\3\2\2\2\u03d0\u03d1\3\2"+
		"\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03d4\b!\1\2\u03d4\u03d6\3\2\2\2\u03d5\u03a3\3\2\2\2\u03d5\u03ac\3\2"+
		"\2\2\u03d5\u03bd\3\2\2\2\u03d6A\3\2\2\2\u03d7\u03dc\5\6\4\2\u03d8\u03dc"+
		"\5\n\6\2\u03d9\u03dc\5T+\2\u03da\u03dc\5\u008aF\2\u03db\u03d7\3\2\2\2"+
		"\u03db\u03d8\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dcC\3"+
		"\2\2\2\u03dd\u03de\7\t\2\2\u03de\u03df\7\31\2\2\u03df\u03e0\5F$\2\u03e0"+
		"\u03e1\7\32\2\2\u03e1\u03ed\3\2\2\2\u03e2\u03e4\7\t\2\2\u03e3\u03e5\7"+
		"\31\2\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6"+
		"\u03e8\5F$\2\u03e7\u03e9\7\32\2\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2"+
		"\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\b#\1\2\u03eb\u03ed\3\2\2\2\u03ec"+
		"\u03dd\3\2\2\2\u03ec\u03e2\3\2\2\2\u03edE\3\2\2\2\u03ee\u03f0\5H%\2\u03ef"+
		"\u03f1\79\2\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2"+
		"\2\2\u03f2\u03f4\7\61\2\2\u03f3\u03f5\79\2\2\u03f4\u03f3\3\2\2\2\u03f4"+
		"\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\5L\'\2\u03f7\u040f\3\2"+
		"\2\2\u03f8\u03fa\5H%\2\u03f9\u03fb\79\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fe\7\61\2\2\u03fd\u03fc\3\2\2\2"+
		"\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\b$\1\2\u0400\u040f"+
		"\3\2\2\2\u0401\u0403\5H%\2\u0402\u0404\79\2\2\u0403\u0402\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0407\7\61\2\2\u0406\u0405\3"+
		"\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408\u040a\79\2\2\u0409"+
		"\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\5L"+
		"\'\2\u040c\u040d\b$\1\2\u040d\u040f\3\2\2\2\u040e\u03ee\3\2\2\2\u040e"+
		"\u03f8\3\2\2\2\u040e\u0401\3\2\2\2\u040fG\3\2\2\2\u0410\u041e\5\6\4\2"+
		"\u0411\u0414\5T+\2\u0412\u0414\5J&\2\u0413\u0411\3\2\2\2\u0413\u0412\3"+
		"\2\2\2\u0414\u0418\3\2\2\2\u0415\u0417\79\2\2\u0416\u0415\3\2\2\2\u0417"+
		"\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041b\3\2"+
		"\2\2\u041a\u0418\3\2\2\2\u041b\u041c\b%\1\2\u041c\u041e\3\2\2\2\u041d"+
		"\u0410\3\2\2\2\u041d\u0413\3\2\2\2\u041eI\3\2\2\2\u041f\u0424\7\66\2\2"+
		"\u0420\u0424\5\32\16\2\u0421\u0424\5\n\6\2\u0422\u0424\79\2\2\u0423\u041f"+
		"\3\2\2\2\u0423\u0420\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0422\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426K\3\2\2\2"+
		"\u0427\u042c\5\n\6\2\u0428\u0429\5\6\4\2\u0429\u042a\b\'\1\2\u042a\u042c"+
		"\3\2\2\2\u042b\u0427\3\2\2\2\u042b\u0428\3\2\2\2\u042cM\3\2\2\2\u042d"+
		"\u042e\7\6\2\2\u042e\u042f\79\2\2\u042f\u0430\5(\25\2\u0430O\3\2\2\2\u0431"+
		"\u0432\7\7\2\2\u0432\u0433\79\2\2\u0433\u0447\5R*\2\u0434\u0435\7\7\2"+
		"\2\u0435\u0436\79\2\2\u0436\u043a\5R*\2\u0437\u0439\79\2\2\u0438\u0437"+
		"\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e\7\31\2\2\u043e\u043f\7"+
		"\32\2\2\u043f\u0440\b)\1\2\u0440\u0447\3\2\2\2\u0441\u0442\7\7\2\2\u0442"+
		"\u0443\79\2\2\u0443\u0444\5\4\3\2\u0444\u0445\b)\1\2\u0445\u0447\3\2\2"+
		"\2\u0446\u0431\3\2\2\2\u0446\u0434\3\2\2\2\u0446\u0441\3\2\2\2\u0447Q"+
		"\3\2\2\2\u0448\u044e\5\6\4\2\u0449\u044e\5\b\5\2\u044a\u044e\5\n\6\2\u044b"+
		"\u044e\5T+\2\u044c\u044e\5\u008aF\2\u044d\u0448\3\2\2\2\u044d\u0449\3"+
		"\2\2\2\u044d\u044a\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044c\3\2\2\2\u044e"+
		"S\3\2\2\2\u044f\u0450\b+\1\2\u0450\u046f\5X-\2\u0451\u0453\7\31\2\2\u0452"+
		"\u0454\79\2\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2"+
		"\2\2\u0455\u0457\5T+\2\u0456\u0458\79\2\2\u0457\u0456\3\2\2\2\u0457\u0458"+
		"\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\7\32\2\2\u045a\u046f\3\2\2\2"+
		"\u045b\u045d\7\31\2\2\u045c\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045c"+
		"\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461\3\2\2\2\u0460\u0462\79\2\2\u0461"+
		"\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\5T"+
		"+\2\u0464\u0466\79\2\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468"+
		"\3\2\2\2\u0467\u0469\7\32\2\2\u0468\u0467\3\2\2\2\u0469\u046a\3\2\2\2"+
		"\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d"+
		"\b+\1\2\u046d\u046f\3\2\2\2\u046e\u044f\3\2\2\2\u046e\u0451\3\2\2\2\u046e"+
		"\u045c\3\2\2\2\u046f\u048c\3\2\2\2\u0470\u0472\f\6\2\2\u0471\u0473\79"+
		"\2\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0476\5\22\n\2\u0475\u0477\79\2\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2"+
		"\2\2\u0477\u0478\3\2\2\2\u0478\u0479\5T+\7\u0479\u048b\3\2\2\2\u047a\u047c"+
		"\f\5\2\2\u047b\u047d\79\2\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d"+
		"\u047e\3\2\2\2\u047e\u0480\5\22\n\2\u047f\u0481\5\22\n\2\u0480\u047f\3"+
		"\2\2\2\u0481\u0482\3\2\2\2\u0482\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0485\3\2\2\2\u0484\u0486\79\2\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2"+
		"\2\2\u0486\u0487\3\2\2\2\u0487\u0488\5T+\6\u0488\u0489\b+\1\2\u0489\u048b"+
		"\3\2\2\2\u048a\u0470\3\2\2\2\u048a\u047a\3\2\2\2\u048b\u048e\3\2\2\2\u048c"+
		"\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048dU\3\2\2\2\u048e\u048c\3\2\2\2"+
		"\u048f\u0490\5\n\6\2\u0490\u0491\7\35\2\2\u0491\u0492\5Z.\2\u0492\u0493"+
		"\7\36\2\2\u0493\u049f\3\2\2\2\u0494\u0496\5\n\6\2\u0495\u0497\7\35\2\2"+
		"\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a"+
		"\5Z.\2\u0499\u049b\7\36\2\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u049c\3\2\2\2\u049c\u049d\b,\1\2\u049d\u049f\3\2\2\2\u049e\u048f\3\2"+
		"\2\2\u049e\u0494\3\2\2\2\u049fW\3\2\2\2\u04a0\u04a5\5\b\5\2\u04a1\u04a5"+
		"\5\n\6\2\u04a2\u04a5\5\u008aF\2\u04a3\u04a5\5V,\2\u04a4\u04a0\3\2\2\2"+
		"\u04a4\u04a1\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a3\3\2\2\2\u04a5Y\3"+
		"\2\2\2\u04a6\u04a8\5^\60\2\u04a7\u04a9\79\2\2\u04a8\u04a7\3\2\2\2\u04a8"+
		"\u04a9\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\5\\/\2\u04ab[\3\2\2\2\u04ac"+
		"\u04af\5`\61\2\u04ad\u04af\5b\62\2\u04ae\u04ac\3\2\2\2\u04ae\u04ad\3\2"+
		"\2\2\u04af]\3\2\2\2\u04b0\u04b2\7\31\2\2\u04b1\u04b3\79\2\2\u04b2\u04b1"+
		"\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b6\5Z.\2\u04b5"+
		"\u04b7\79\2\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2"+
		"\2\2\u04b8\u04b9\7\32\2\2\u04b9\u04ea\3\2\2\2\u04ba\u04bc\7\31\2\2\u04bb"+
		"\u04bd\79\2\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2"+
		"\2\2\u04be\u04c0\5Z.\2\u04bf\u04c1\79\2\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\b\60\1\2\u04c3\u04ea\3\2\2\2"+
		"\u04c4\u04c6\7\31\2\2\u04c5\u04c7\79\2\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7"+
		"\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\5Z.\2\u04c9\u04cb\79\2\2\u04ca"+
		"\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04ce\7\32"+
		"\2\2\u04cd\u04cc\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf"+
		"\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\b\60\1\2\u04d2\u04ea\3"+
		"\2\2\2\u04d3\u04d5\5d\63\2\u04d4\u04d6\79\2\2\u04d5\u04d4\3\2\2\2\u04d5"+
		"\u04d6\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\5\\/\2\u04d8\u04ea\3\2"+
		"\2\2\u04d9\u04df\5d\63\2\u04da\u04dd\79\2\2\u04db\u04de\5d\63\2\u04dc"+
		"\u04de\5\6\4\2\u04dd\u04db\3\2\2\2\u04dd\u04dc\3\2\2\2\u04de\u04e0\3\2"+
		"\2\2\u04df\u04da\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1"+
		"\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04e5\79\2\2\u04e4\u04e3\3\2"+
		"\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\5\\/\2\u04e7"+
		"\u04e8\b\60\1\2\u04e8\u04ea\3\2\2\2\u04e9\u04b0\3\2\2\2\u04e9\u04ba\3"+
		"\2\2\2\u04e9\u04c4\3\2\2\2\u04e9\u04d3\3\2\2\2\u04e9\u04d9\3\2\2\2\u04ea"+
		"_\3\2\2\2\u04eb\u04ed\5\16\b\2\u04ec\u04ee\79\2\2\u04ed\u04ec\3\2\2\2"+
		"\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\5Z.\2\u04f0\u0515"+
		"\3\2\2\2\u04f1\u04f3\5\16\b\2\u04f2\u04f4\79\2\2\u04f3\u04f2\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04fb\5Z.\2\u04f6\u04f9\79\2"+
		"\2\u04f7\u04fa\5d\63\2\u04f8\u04fa\5\6\4\2\u04f9\u04f7\3\2\2\2\u04f9\u04f8"+
		"\3\2\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04f6\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\b\61"+
		"\1\2\u0500\u0515\3\2\2\2\u0501\u0509\5\16\b\2\u0502\u0504\79\2\2\u0503"+
		"\u0502\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2"+
		"\2\2\u0506\u0508\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u050a\5\22\n\2\u0509"+
		"\u0505\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2"+
		"\2\2\u050c\u050e\3\2\2\2\u050d\u050f\79\2\2\u050e\u050d\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\5Z.\2\u0511\u0512\b\61"+
		"\1\2\u0512\u0515\3\2\2\2\u0513\u0515\3\2\2\2\u0514\u04eb\3\2\2\2\u0514"+
		"\u04f1\3\2\2\2\u0514\u0501\3\2\2\2\u0514\u0513\3\2\2\2\u0515a\3\2\2\2"+
		"\u0516\u0518\5\20\t\2\u0517\u0519\79\2\2\u0518\u0517\3\2\2\2\u0518\u0519"+
		"\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\5Z.\2\u051b\u0540\3\2\2\2\u051c"+
		"\u051e\5\20\t\2\u051d\u051f\79\2\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2"+
		"\2\2\u051f\u0520\3\2\2\2\u0520\u0526\5Z.\2\u0521\u0524\79\2\2\u0522\u0525"+
		"\5d\63\2\u0523\u0525\5\6\4\2\u0524\u0522\3\2\2\2\u0524\u0523\3\2\2\2\u0525"+
		"\u0527\3\2\2\2\u0526\u0521\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0526\3\2"+
		"\2\2\u0528\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\b\62\1\2\u052b"+
		"\u0540\3\2\2\2\u052c\u0534\5\20\t\2\u052d\u052f\79\2\2\u052e\u052d\3\2"+
		"\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531"+
		"\u0533\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0535\5\22\n\2\u0534\u0530\3"+
		"\2\2\2\u0535\u0536\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537"+
		"\u0539\3\2\2\2\u0538\u053a\79\2\2\u0539\u0538\3\2\2\2\u0539\u053a\3\2"+
		"\2\2\u053a\u053b\3\2\2\2\u053b\u053c\5Z.\2\u053c\u053d\b\62\1\2\u053d"+
		"\u0540\3\2\2\2\u053e\u0540\3\2\2\2\u053f\u0516\3\2\2\2\u053f\u051c\3\2"+
		"\2\2\u053f\u052c\3\2\2\2\u053f\u053e\3\2\2\2\u0540c\3\2\2\2\u0541\u0545"+
		"\5\b\5\2\u0542\u0545\5\n\6\2\u0543\u0545\5\u008aF\2\u0544\u0541\3\2\2"+
		"\2\u0544\u0542\3\2\2\2\u0544\u0543\3\2\2\2\u0545e\3\2\2\2\u0546\u0547"+
		"\b\64\1\2\u0547\u0557\5j\66\2\u0548\u0557\5h\65\2\u0549\u054b\7*\2\2\u054a"+
		"\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054e\7\31"+
		"\2\2\u054d\u054f\79\2\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0550\3\2\2\2\u0550\u0552\5f\64\2\u0551\u0553\79\2\2\u0552\u0551\3\2"+
		"\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\7\32\2\2\u0555"+
		"\u0557\3\2\2\2\u0556\u0546\3\2\2\2\u0556\u0548\3\2\2\2\u0556\u054a\3\2"+
		"\2\2\u0557\u0574\3\2\2\2\u0558\u055a\f\5\2\2\u0559\u055b\79\2\2\u055a"+
		"\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055e\5\30"+
		"\r\2\u055d\u055f\79\2\2\u055e\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u0560\3\2\2\2\u0560\u0561\5f\64\6\u0561\u0573\3\2\2\2\u0562\u0564\f\4"+
		"\2\2\u0563\u0565\79\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565"+
		"\u0566\3\2\2\2\u0566\u0568\5\30\r\2\u0567\u0569\5\30\r\2\u0568\u0567\3"+
		"\2\2\2\u0569\u056a\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u056d\3\2\2\2\u056c\u056e\79\2\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2"+
		"\2\2\u056e\u056f\3\2\2\2\u056f\u0570\5f\64\5\u0570\u0571\b\64\1\2\u0571"+
		"\u0573\3\2\2\2\u0572\u0558\3\2\2\2\u0572\u0562\3\2\2\2\u0573\u0576\3\2"+
		"\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575g\3\2\2\2\u0576\u0574"+
		"\3\2\2\2\u0577\u0579\5\n\6\2\u0578\u057a\79\2\2\u0579\u0578\3\2\2\2\u0579"+
		"\u057a\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d\7,\2\2\u057c\u057e\79\2"+
		"\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u0582"+
		"\5j\66\2\u0580\u0582\5\6\4\2\u0581\u057f\3\2\2\2\u0581\u0580\3\2\2\2\u0582"+
		"\u0592\3\2\2\2\u0583\u0585\5\n\6\2\u0584\u0586\79\2\2\u0585\u0584\3\2"+
		"\2\2\u0585\u0586\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\7+\2\2\u0588"+
		"\u058a\79\2\2\u0589\u0588\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058d\3\2"+
		"\2\2\u058b\u058e\5j\66\2\u058c\u058e\5\6\4\2\u058d\u058b\3\2\2\2\u058d"+
		"\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\b\65\1\2\u0590\u0592\3"+
		"\2\2\2\u0591\u0577\3\2\2\2\u0591\u0583\3\2\2\2\u0592i\3\2\2\2\u0593\u0598"+
		"\5\n\6\2\u0594\u0598\5\b\5\2\u0595\u0598\5T+\2\u0596\u0598\5\6\4\2\u0597"+
		"\u0593\3\2\2\2\u0597\u0594\3\2\2\2\u0597\u0595\3\2\2\2\u0597\u0596\3\2"+
		"\2\2\u0598k\3\2\2\2\u0599\u059b\5v<\2\u059a\u059c\t\r\2\2\u059b\u059a"+
		"\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u05a3\3\2\2\2\u059d\u059f\5x=\2\u059e"+
		"\u05a0\t\r\2\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2"+
		"\2\2\u05a1\u059d\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3"+
		"\u05a4\3\2\2\2\u05a4\u05ad\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05aa\5z"+
		">\2\u05a7\u05a9\7\67\2\2\u05a8\u05a7\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa"+
		"\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2"+
		"\2\2\u05ad\u05a6\3\2\2\2\u05ad\u05ae\3\2\2\2\u05aem\3\2\2\2\u05af\u05b0"+
		"\5r:\2\u05b0\u05b1\5t;\2\u05b1o\3\2\2\2\u05b2\u05b4\79\2\2\u05b3\u05b2"+
		"\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7\7\20\2\2"+
		"\u05b6\u05b8\79\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba"+
		"\3\2\2\2\u05b9\u05bb\78\2\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb"+
		"\u05bf\3\2\2\2\u05bc\u05be\79\2\2\u05bd\u05bc\3\2\2\2\u05be\u05c1\3\2"+
		"\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05d6\3\2\2\2\u05c1"+
		"\u05bf\3\2\2\2\u05c2\u05c4\79\2\2\u05c3\u05c2\3\2\2\2\u05c3\u05c4\3\2"+
		"\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05c7\7\20\2\2\u05c6\u05c5\3\2\2\2\u05c6"+
		"\u05c7\3\2\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05ca\79\2\2\u05c9\u05c8\3\2"+
		"\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05cd\78\2\2\u05cc"+
		"\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05d1\3\2\2\2\u05ce\u05d0\79"+
		"\2\2\u05cf\u05ce\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1"+
		"\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4\u05d6\b9"+
		"\1\2\u05d5\u05b3\3\2\2\2\u05d5\u05c3\3\2\2\2\u05d6q\3\2\2\2\u05d7\u05d8"+
		"\7\31\2\2\u05d8\u05d9\5f\64\2\u05d9\u05da\7\32\2\2\u05da\u05db\5p9\2\u05db"+
		"\u05e7\3\2\2\2\u05dc\u05de\7\31\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3"+
		"\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e1\5f\64\2\u05e0\u05e2\7\32\2\2\u05e1"+
		"\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\5p"+
		"9\2\u05e4\u05e5\b:\1\2\u05e5\u05e7\3\2\2\2\u05e6\u05d7\3\2\2\2\u05e6\u05dd"+
		"\3\2\2\2\u05e7s\3\2\2\2\u05e8\u05ea\79\2\2\u05e9\u05e8\3\2\2\2\u05ea\u05ed"+
		"\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed"+
		"\u05eb\3\2\2\2\u05ee\u05f2\7\33\2\2\u05ef\u05f1\79\2\2\u05f0\u05ef\3\2"+
		"\2\2\u05f1\u05f4\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3"+
		"\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5\u05f7\5&\24\2\u05f6\u05f5\3\2"+
		"\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9"+
		"\u05fd\3\2\2\2\u05fa\u05fc\79\2\2\u05fb\u05fa\3\2\2\2\u05fc\u05ff\3\2"+
		"\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff"+
		"\u05fd\3\2\2\2\u0600\u0601\7\34\2\2\u0601\u0622\3\2\2\2\u0602\u0604\7"+
		"9\2\2\u0603\u0602\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605"+
		"\u0606\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u060a\7\33"+
		"\2\2\u0609\u0608\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060e\3\2\2\2\u060b"+
		"\u060d\79\2\2\u060c\u060b\3\2\2\2\u060d\u0610\3\2\2\2\u060e\u060c\3\2"+
		"\2\2\u060e\u060f\3\2\2\2\u060f\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0611"+
		"\u0613\5&\24\2\u0612\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0612\3\2"+
		"\2\2\u0614\u0615\3\2\2\2\u0615\u0619\3\2\2\2\u0616\u0618\79\2\2\u0617"+
		"\u0616\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2"+
		"\2\2\u061a\u061d\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u061e\7\34\2\2\u061d"+
		"\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\b;"+
		"\1\2\u0620\u0622\3\2\2\2\u0621\u05eb\3\2\2\2\u0621\u0605\3\2\2\2\u0622"+
		"u\3\2\2\2\u0623\u0624\7\r\2\2\u0624\u0625\5n8\2\u0625w\3\2\2\2\u0626\u0627"+
		"\7\17\2\2\u0627\u0628\5n8\2\u0628y\3\2\2\2\u0629\u062b\7\16\2\2\u062a"+
		"\u062c\79\2\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2"+
		"\2\2\u062d\u062f\7\20\2\2\u062e\u0630\79\2\2\u062f\u062e\3\2\2\2\u062f"+
		"\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\5t;\2\u0632{\3\2\2\2\u0633"+
		"\u0636\5\u0086D\2\u0634\u0636\5\u0088E\2\u0635\u0633\3\2\2\2\u0635\u0634"+
		"\3\2\2\2\u0636}\3\2\2\2\u0637\u063d\7\22\2\2\u0638\u063d\7\23\2\2\u0639"+
		"\u063a\5\n\6\2\u063a\u063b\b@\1\2\u063b\u063d\3\2\2\2\u063c\u0637\3\2"+
		"\2\2\u063c\u0638\3\2\2\2\u063c\u0639\3\2\2\2\u063d\177\3\2\2\2\u063e\u0640"+
		"\5~@\2\u063f\u0641\79\2\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
		"\u0642\3\2\2\2\u0642\u0644\5T+\2\u0643\u0645\79\2\2\u0644\u0643\3\2\2"+
		"\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u064a\7\33\2\2\u0647"+
		"\u0649\79\2\2\u0648\u0647\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u0648\3\2"+
		"\2\2\u064a\u064b\3\2\2\2\u064b\u0650\3\2\2\2\u064c\u064a\3\2\2\2\u064d"+
		"\u064f\5&\24\2\u064e\u064d\3\2\2\2\u064f\u0652\3\2\2\2\u0650\u064e\3\2"+
		"\2\2\u0650\u0651\3\2\2\2\u0651\u0656\3\2\2\2\u0652\u0650\3\2\2\2\u0653"+
		"\u0655\79\2\2\u0654\u0653\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654\3\2"+
		"\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658\u0656\3\2\2\2\u0659"+
		"\u065a\7\34\2\2\u065a\u0696\3\2\2\2\u065b\u065d\5~@\2\u065c\u065e\79\2"+
		"\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0661"+
		"\5T+\2\u0660\u0662\79\2\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0663\3\2\2\2\u0663\u0667\7\33\2\2\u0664\u0666\79\2\2\u0665\u0664\3\2"+
		"\2\2\u0666\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668"+
		"\u066d\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066c\5&\24\2\u066b\u066a\3\2"+
		"\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e"+
		"\u0673\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u0672\79\2\2\u0671\u0670\3\2"+
		"\2\2\u0672\u0675\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674"+
		"\u0676\3\2\2\2\u0675\u0673\3\2\2\2\u0676\u0677\bA\1\2\u0677\u0696\3\2"+
		"\2\2\u0678\u067a\5~@\2\u0679\u067b\79\2\2\u067a\u0679\3\2\2\2\u067a\u067b"+
		"\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\5T+\2\u067d\u067f\79\2\2\u067e"+
		"\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0683\3\2\2\2\u0680\u0682\79"+
		"\2\2\u0681\u0680\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0681\3\2\2\2\u0683"+
		"\u0684\3\2\2\2\u0684\u0689\3\2\2\2\u0685\u0683\3\2\2\2\u0686\u0688\5&"+
		"\24\2\u0687\u0686\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u0689"+
		"\u068a\3\2\2\2\u068a\u068f\3\2\2\2\u068b\u0689\3\2\2\2\u068c\u068e\79"+
		"\2\2\u068d\u068c\3\2\2\2\u068e\u0691\3\2\2\2\u068f\u068d\3\2\2\2\u068f"+
		"\u0690\3\2\2\2\u0690\u0692\3\2\2\2\u0691\u068f\3\2\2\2\u0692\u0693\7\34"+
		"\2\2\u0693\u0694\bA\1\2\u0694\u0696\3\2\2\2\u0695\u063e\3\2\2\2\u0695"+
		"\u065b\3\2\2\2\u0695\u0678\3\2\2\2\u0696\u0081\3\2\2\2\u0697\u0698\5\4"+
		"\3\2\u0698\u0699\79\2\2\u0699\u069b\3\2\2\2\u069a\u0697\3\2\2\2\u069a"+
		"\u069b\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\5\n\6\2\u069d\u069f\79"+
		"\2\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a5\3\2\2\2\u06a0"+
		"\u06a2\7+\2\2\u06a1\u06a3\79\2\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2"+
		"\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\5\u0084C\2\u06a5\u06a0\3\2\2\2\u06a5"+
		"\u06a6\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a9\5T+\2\u06a8\u069a\3\2\2"+
		"\2\u06a8\u06a7\3\2\2\2\u06a9\u0083\3\2\2\2\u06aa\u06ae\5\b\5\2\u06ab\u06ae"+
		"\5\n\6\2\u06ac\u06ae\5T+\2\u06ad\u06aa\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad"+
		"\u06ac\3\2\2\2\u06ae\u0085\3\2\2\2\u06af\u06b1\7\24\2\2\u06b0\u06b2\7"+
		"9\2\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3"+
		"\u06b5\5T+\2\u06b4\u06b6\79\2\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2"+
		"\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\5\u0080A\2\u06b8\u0087\3\2\2\2\u06b9"+
		"\u06bb\7\21\2\2\u06ba\u06bc\79\2\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2"+
		"\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06bf\5\u0082B\2\u06be\u06c0\79\2\2\u06bf"+
		"\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\5\u0080"+
		"A\2\u06c2\u0089\3\2\2\2\u06c3\u06c4\5\n\6\2\u06c4\u06c6\7\31\2\2\u06c5"+
		"\u06c7\5\u008cG\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c8"+
		"\3\2\2\2\u06c8\u06c9\7\32\2\2\u06c9\u06e6\3\2\2\2\u06ca\u06cb\5\n\6\2"+
		"\u06cb\u06cd\7\31\2\2\u06cc\u06ce\5\u008cG\2\u06cd\u06cc\3\2\2\2\u06cd"+
		"\u06ce\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d0\bF\1\2\u06d0\u06e6\3\2"+
		"\2\2\u06d1\u06d3\5\n\6\2\u06d2\u06d4\5\u008cG\2\u06d3\u06d2\3\2\2\2\u06d3"+
		"\u06d4\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\7\32\2\2\u06d6\u06d7\b"+
		"F\1\2\u06d7\u06e6\3\2\2\2\u06d8\u06d9\5\n\6\2\u06d9\u06db\7\31\2\2\u06da"+
		"\u06dc\5\u008cG\2\u06db\u06da\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd"+
		"\3\2\2\2\u06dd\u06de\7\32\2\2\u06de\u06e0\7\31\2\2\u06df\u06e1\5\u008c"+
		"G\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2"+
		"\u06e3\7\32\2\2\u06e3\u06e4\bF\1\2\u06e4\u06e6\3\2\2\2\u06e5\u06c3\3\2"+
		"\2\2\u06e5\u06ca\3\2\2\2\u06e5\u06d1\3\2\2\2\u06e5\u06d8\3\2\2\2\u06e6"+
		"\u008b\3\2\2\2\u06e7\u06f2\5\u008eH\2\u06e8\u06ea\79\2\2\u06e9\u06e8\3"+
		"\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\7\61\2\2\u06ec"+
		"\u06ee\79\2\2\u06ed\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06ef\3\2"+
		"\2\2\u06ef\u06f1\5\u008eH\2\u06f0\u06e9\3\2\2\2\u06f1\u06f4\3\2\2\2\u06f2"+
		"\u06f0\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u0715\3\2\2\2\u06f4\u06f2\3\2"+
		"\2\2\u06f5\u06fa\5\u008eH\2\u06f6\u06f7\79\2\2\u06f7\u06f9\5\u008eH\2"+
		"\u06f8\u06f6\3\2\2\2\u06f9\u06fc\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fa\u06fb"+
		"\3\2\2\2\u06fb\u06fd\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd\u06fe\bG\1\2\u06fe"+
		"\u0715\3\2\2\2\u06ff\u070f\5\u008eH\2\u0700\u0702\79\2\2\u0701\u0700\3"+
		"\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0705\7\61\2\2\u0704"+
		"\u0706\7\61\2\2\u0705\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0705\3"+
		"\2\2\2\u0707\u0708\3\2\2\2\u0708\u070a\3\2\2\2\u0709\u070b\79\2\2\u070a"+
		"\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070e\5\u008e"+
		"H\2\u070d\u0701\3\2\2\2\u070e\u0711\3\2\2\2\u070f\u070d\3\2\2\2\u070f"+
		"\u0710\3\2\2\2\u0710\u0712\3\2\2\2\u0711\u070f\3\2\2\2\u0712\u0713\bG"+
		"\1\2\u0713\u0715\3\2\2\2\u0714\u06e7\3\2\2\2\u0714\u06f5\3\2\2\2\u0714"+
		"\u06ff\3\2\2\2\u0715\u008d\3\2\2\2\u0716\u071c\5\n\6\2\u0717\u071c\5T"+
		"+\2\u0718\u071c\5\6\4\2\u0719\u071c\5\b\5\2\u071a\u071c\5\u008aF\2\u071b"+
		"\u0716\3\2\2\2\u071b\u0717\3\2\2\2\u071b\u0718\3\2\2\2\u071b\u0719\3\2"+
		"\2\2\u071b\u071a\3\2\2\2\u071c\u008f\3\2\2\2\u071d\u0721\5\u0098M\2\u071e"+
		"\u0721\5\u009aN\2\u071f\u0721\5\u009cO\2\u0720\u071d\3\2\2\2\u0720\u071e"+
		"\3\2\2\2\u0720\u071f\3\2\2\2\u0721\u0091\3\2\2\2\u0722\u0723\5\n\6\2\u0723"+
		"\u0725\7\31\2\2\u0724\u0726\5\u0094K\2\u0725\u0724\3\2\2\2\u0725\u0726"+
		"\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0729\7\32\2\2\u0728\u072a\79\2\2\u0729"+
		"\u0728\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072f\7\33"+
		"\2\2\u072c\u072e\79\2\2\u072d\u072c\3\2\2\2\u072e\u0731\3\2\2\2\u072f"+
		"\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0733\3\2\2\2\u0731\u072f\3\2"+
		"\2\2\u0732\u0734\5&\24\2\u0733\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u073a\3\2\2\2\u0737\u0739\79"+
		"\2\2\u0738\u0737\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u0738\3\2\2\2\u073a"+
		"\u073b\3\2\2\2\u073b\u073d\3\2\2\2\u073c\u073a\3\2\2\2\u073d\u0741\7\34"+
		"\2\2\u073e\u0740\7\67\2\2\u073f\u073e\3\2\2\2\u0740\u0743\3\2\2\2\u0741"+
		"\u073f\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0093\3\2\2\2\u0743\u0741\3\2"+
		"\2\2\u0744\u0747\5\4\3\2\u0745\u0746\7\35\2\2\u0746\u0748\7\36\2\2\u0747"+
		"\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074a\79"+
		"\2\2\u074a\u074c\5\n\6\2\u074b\u074d\5\u0096L\2\u074c\u074b\3\2\2\2\u074c"+
		"\u074d\3\2\2\2\u074d\u075f\3\2\2\2\u074e\u0750\5\4\3\2\u074f\u074e\3\2"+
		"\2\2\u074f\u0750\3\2\2\2\u0750\u0753\3\2\2\2\u0751\u0752\7\35\2\2\u0752"+
		"\u0754\7\36\2\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0756\3"+
		"\2\2\2\u0755\u0757\79\2\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757"+
		"\u0758\3\2\2\2\u0758\u075a\5\n\6\2\u0759\u075b\5\u0096L\2\u075a\u0759"+
		"\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075d\bK\1\2\u075d"+
		"\u075f\3\2\2\2\u075e\u0744\3\2\2\2\u075e\u074f\3\2\2\2\u075f\u0095\3\2"+
		"\2\2\u0760\u0762\7\61\2\2\u0761\u0763\79\2\2\u0762\u0761\3\2\2\2\u0762"+
		"\u0763\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0771\5\u0094K\2\u0765\u0767"+
		"\7\61\2\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0769\3\2\2\2"+
		"\u0768\u076a\79\2\2\u0769\u0768\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u0769"+
		"\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076e\5\u0094K"+
		"\2\u076e\u076f\bL\1\2\u076f\u0771\3\2\2\2\u0770\u0760\3\2\2\2\u0770\u0766"+
		"\3\2\2\2\u0771\u0097\3\2\2\2\u0772\u0773\7\13\2\2\u0773\u0774\79\2\2\u0774"+
		"\u0775\7\n\2\2\u0775\u0776\79\2\2\u0776\u0777\5\u0092J\2\u0777\u0099\3"+
		"\2\2\2\u0778\u0779\7\13\2\2\u0779\u077a\79\2\2\u077a\u077d\5\4\3\2\u077b"+
		"\u077c\7\35\2\2\u077c\u077e\7\36\2\2\u077d\u077b\3\2\2\2\u077d\u077e\3"+
		"\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\79\2\2\u0780\u0781\5\u0092J\2\u0781"+
		"\u009b\3\2\2\2\u0782\u0783\5\u009eP\2\u0783\u0784\5\u0092J\2\u0784\u009d"+
		"\3\2\2\2\u0785\u0786\7\13\2\2\u0786\u0787\79\2\2\u0787\u0788\bP\1\2\u0788"+
		"\u009f\3\2\2\2\u0789\u078d\7\33\2\2\u078a\u078c\79\2\2\u078b\u078a\3\2"+
		"\2\2\u078c\u078f\3\2\2\2\u078d\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e"+
		"\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u0790\u0792\5&\24\2\u0791\u0790\3\2"+
		"\2\2\u0792\u0793\3\2\2\2\u0793\u0791\3\2\2\2\u0793\u0794\3\2\2\2\u0794"+
		"\u0798\3\2\2\2\u0795\u0797\79\2\2\u0796\u0795\3\2\2\2\u0797\u079a\3\2"+
		"\2\2\u0798\u0796\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079b\3\2\2\2\u079a"+
		"\u0798\3\2\2\2\u079b\u079c\7\34\2\2\u079c\u00a1\3\2\2\2\u079d\u079e\5"+
		"\u00a4S\2\u079e\u079f\5\u00a6T\2\u079f\u00a3\3\2\2\2\u07a0\u07a1\7\f\2"+
		"\2\u07a1\u07a2\7\31\2\2\u07a2\u07a6\7\32\2\2\u07a3\u07a5\79\2\2\u07a4"+
		"\u07a3\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2"+
		"\2\2\u07a7\u07b8\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a9\u07ab\7\f\2\2\u07aa"+
		"\u07ac\7\31\2\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ae\3"+
		"\2\2\2\u07ad\u07af\7\32\2\2\u07ae\u07ad\3\2\2\2\u07ae\u07af\3\2\2\2\u07af"+
		"\u07b3\3\2\2\2\u07b0\u07b2\79\2\2\u07b1\u07b0\3\2\2\2\u07b2\u07b5\3\2"+
		"\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b6\3\2\2\2\u07b5"+
		"\u07b3\3\2\2\2\u07b6\u07b8\bS\1\2\u07b7\u07a0\3\2\2\2\u07b7\u07a9\3\2"+
		"\2\2\u07b8\u00a5\3\2\2\2\u07b9\u07bd\5\u00a8U\2\u07ba\u07bc\79\2\2\u07bb"+
		"\u07ba\3\2\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07be\3\2"+
		"\2\2\u07be\u07c1\3\2\2\2\u07bf\u07bd\3\2\2\2\u07c0\u07c2\5&\24\2\u07c1"+
		"\u07c0\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c3\u07c4\3\2"+
		"\2\2\u07c4\u07c8\3\2\2\2\u07c5\u07c7\79\2\2\u07c6\u07c5\3\2\2\2\u07c7"+
		"\u07ca\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2"+
		"\2\2\u07ca\u07c8\3\2\2\2\u07cb\u07cc\5\u00aaV\2\u07cc\u00a7\3\2\2\2\u07cd"+
		"\u07d0\7\33\2\2\u07ce\u07d0\bU\1\2\u07cf\u07cd\3\2\2\2\u07cf\u07ce\3\2"+
		"\2\2\u07d0\u00a9\3\2\2\2\u07d1\u07d4\7\34\2\2\u07d2\u07d4\bV\1\2\u07d3"+
		"\u07d1\3\2\2\2\u07d3\u07d2\3\2\2\2\u07d4\u00ab\3\2\2\2\u015a\u00ae\u00b2"+
		"\u00b9\u00be\u00c4\u00cb\u00d1\u00dd\u00df\u00e4\u00e9\u00ef\u00f2\u00f5"+
		"\u00fa\u00fc\u0101\u0107\u010c\u0112\u0118\u011e\u0125\u012a\u0130\u0136"+
		"\u013a\u0141\u0149\u0151\u015b\u016b\u016f\u0174\u017a\u0181\u0185\u018a"+
		"\u0190\u0198\u019c\u01a1\u01a7\u01ae\u01b2\u01b7\u01bd\u01c7\u01cb\u01d0"+
		"\u01d6\u01dd\u01e1\u01e6\u01ec\u01f6\u01fa\u01ff\u0205\u020c\u0210\u0215"+
		"\u021b\u0224\u0228\u022d\u0233\u023b\u023f\u0244\u024a\u0251\u0255\u025a"+
		"\u0260\u0269\u026d\u0272\u0278\u0280\u0284\u0289\u028f\u0296\u029a\u029f"+
		"\u02a5\u02ab\u02b0\u02b6\u02bf\u02c5\u02cb\u02d3\u02d7\u02db\u02de\u02e2"+
		"\u02e6\u02e9\u02ef\u02f3\u02f6\u02fa\u0300\u0304\u0309\u030e\u0312\u0318"+
		"\u031c\u0321\u032c\u0330\u0334\u0341\u0345\u0349\u034c\u0350\u0354\u0358"+
		"\u035e\u0362\u0366\u0369\u036d\u0371\u0375\u037d\u0381\u0384\u0389\u038d"+
		"\u0399\u039d\u03a1\u03a8\u03ae\u03b2\u03b6\u03ba\u03bf\u03c3\u03c7\u03cb"+
		"\u03d1\u03d5\u03db\u03e4\u03e8\u03ec\u03f0\u03f4\u03fa\u03fd\u0403\u0406"+
		"\u0409\u040e\u0413\u0418\u041d\u0423\u0425\u042b\u043a\u0446\u044d\u0453"+
		"\u0457\u045e\u0461\u0465\u046a\u046e\u0472\u0476\u047c\u0482\u0485\u048a"+
		"\u048c\u0496\u049a\u049e\u04a4\u04a8\u04ae\u04b2\u04b6\u04bc\u04c0\u04c6"+
		"\u04ca\u04cf\u04d5\u04dd\u04e1\u04e4\u04e9\u04ed\u04f3\u04f9\u04fd\u0505"+
		"\u050b\u050e\u0514\u0518\u051e\u0524\u0528\u0530\u0536\u0539\u053f\u0544"+
		"\u054a\u054e\u0552\u0556\u055a\u055e\u0564\u056a\u056d\u0572\u0574\u0579"+
		"\u057d\u0581\u0585\u0589\u058d\u0591\u0597\u059b\u059f\u05a3\u05aa\u05ad"+
		"\u05b3\u05b7\u05ba\u05bf\u05c3\u05c6\u05c9\u05cc\u05d1\u05d5\u05dd\u05e1"+
		"\u05e6\u05eb\u05f2\u05f8\u05fd\u0605\u0609\u060e\u0614\u0619\u061d\u0621"+
		"\u062b\u062f\u0635\u063c\u0640\u0644\u064a\u0650\u0656\u065d\u0661\u0667"+
		"\u066d\u0673\u067a\u067e\u0683\u0689\u068f\u0695\u069a\u069e\u06a2\u06a5"+
		"\u06a8\u06ad\u06b1\u06b5\u06bb\u06bf\u06c6\u06cd\u06d3\u06db\u06e0\u06e5"+
		"\u06e9\u06ed\u06f2\u06fa\u0701\u0707\u070a\u070f\u0714\u071b\u0720\u0725"+
		"\u0729\u072f\u0735\u073a\u0741\u0747\u074c\u074f\u0753\u0756\u075a\u075e"+
		"\u0762\u0766\u076b\u0770\u077d\u078d\u0793\u0798\u07a6\u07ab\u07ae\u07b3"+
		"\u07b7\u07bd\u07c3\u07c8\u07cf\u07d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}