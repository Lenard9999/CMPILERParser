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
		RULE_array_label = 46, RULE_value_expression = 47, RULE_alt_expression = 48, 
		RULE_alt_operator_expression = 49, RULE_alt_parenthesis_expression = 50, 
		RULE_alt_first_expression_operator = 51, RULE_alt_second_expression_operator = 52, 
		RULE_alt_value_expression = 53, RULE_comparison_statement = 54, RULE_assignment_statement = 55, 
		RULE_value_comparison = 56, RULE_conditional_statement = 57, RULE_conditional_comparison_structure = 58, 
		RULE_with_then = 59, RULE_with_comparison = 60, RULE_conditional_body = 61, 
		RULE_if_statement = 62, RULE_else_if_statement = 63, RULE_else_statement = 64, 
		RULE_loop_statement = 65, RULE_loop_structure = 66, RULE_loop_variable_declaration = 67, 
		RULE_loop_expression = 68, RULE_while_statement = 69, RULE_for_statement = 70, 
		RULE_function_calling = 71, RULE_function_parameters = 72, RULE_function_paremeters_value = 73, 
		RULE_function_declaration = 74, RULE_function_structure = 75, RULE_function_declaration_parameters = 76, 
		RULE_void_function = 77, RULE_non_void_function = 78, RULE_error_function = 79, 
		RULE_scoping_statement = 80, RULE_main_function = 81, RULE_main_head = 82, 
		RULE_main_body = 83, RULE_main_body_first = 84, RULE_main_body_second = 85;
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
			"array_label", "value_expression", "alt_expression", "alt_operator_expression", 
			"alt_parenthesis_expression", "alt_first_expression_operator", "alt_second_expression_operator", 
			"alt_value_expression", "comparison_statement", "assignment_statement", 
			"value_comparison", "conditional_statement", "conditional_comparison_structure", 
			"with_then", "with_comparison", "conditional_body", "if_statement", "else_if_statement", 
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
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(172);
				function_declaration();
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(173);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(184);
				match(WHITE_SPACE);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			main_function();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(191);
				match(NEWLINE);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(197);
				match(WHITE_SPACE);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
			setState(205);
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
			setState(207);
			match(T__0);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(208);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(209);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(210);
					label();
					}
					break;
				case 4:
					{
					setState(211);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(216);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(218);
					match(MINUS);
					}
				}

				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					match(DIGIT);
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				{
				setState(226);
				match(DOT);
				setState(228); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(227);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(230); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(232);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(235);
					match(MINUS);
					}
				}

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
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				{
				setState(245);
				label_words();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(251);
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
				setState(254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					match(DIGIT);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					label_words();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268);
					label();
					}
					} 
				}
				setState(273);
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
				setState(274);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(275);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(276);
				loop_words();
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
			setState(280);
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
			setState(282);
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
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(284);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(285);
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
			setState(288);
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
			setState(290);
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
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(292);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(293);
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
			setState(304);
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
				setState(296);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(297);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(298);
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
				setState(299);
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
				setState(300);
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
				setState(301);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(302);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(303);
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
			setState(306);
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
			setState(308);
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
			setState(310);
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
			setState(312);
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
			setState(314);
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
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				conditional_statement();
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(323);
					match(LINECOMMENT);
					}
					break;
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						match(NEWLINE);
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				loop_statement();
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(339);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(345);
					match(LINECOMMENT);
					}
					break;
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(354);
						match(NEWLINE);
						}
						} 
					}
					setState(359);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				print_statement();
				setState(361);
				match(SEMICOLON);
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(368);
					match(LINECOMMENT);
					}
					break;
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(371);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(377);
						match(NEWLINE);
						}
						} 
					}
					setState(382);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				print_statement();
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(390);
					match(LINECOMMENT);
					}
					break;
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				scan_statement();
				setState(408);
				match(SEMICOLON);
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(409);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(415);
					match(LINECOMMENT);
					}
					break;
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(418);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(423);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(424);
						match(NEWLINE);
						}
						} 
					}
					setState(429);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				scan_statement();
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(437);
					match(LINECOMMENT);
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(454);
				return_statement();
				setState(455);
				match(SEMICOLON);
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(456);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(462);
					match(LINECOMMENT);
					}
					break;
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(465);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471);
						match(NEWLINE);
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(477);
				return_statement();
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(478);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(483);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(484);
					match(LINECOMMENT);
					}
					break;
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(493);
						match(NEWLINE);
						}
						} 
					}
					setState(498);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(501);
				constant_declaration();
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(502);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(507);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(508);
					match(LINECOMMENT);
					}
					break;
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(517);
						match(NEWLINE);
						}
						} 
					}
					setState(522);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(523);
				any_declaration();
				setState(524);
				match(SEMICOLON);
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(525);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(531);
					match(LINECOMMENT);
					}
					break;
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(534);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(540);
						match(NEWLINE);
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(546);
				any_declaration();
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(553);
					match(LINECOMMENT);
					}
					break;
				}
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(556);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(561);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(562);
						match(NEWLINE);
						}
						} 
					}
					setState(567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(570);
				scoping_statement();
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(571);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(577);
					match(LINECOMMENT);
					}
					break;
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(586);
						match(NEWLINE);
						}
						} 
					}
					setState(591);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(592);
				function_calling();
				setState(593);
				match(SEMICOLON);
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(594);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(599);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(600);
					match(LINECOMMENT);
					}
					break;
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(603);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(609);
						match(NEWLINE);
						}
						} 
					}
					setState(614);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(615);
				function_calling();
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(616);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(621);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(622);
					match(LINECOMMENT);
					}
					break;
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(625);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(631);
						match(NEWLINE);
						}
						} 
					}
					setState(636);
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
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(644);
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
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(647);
				string();
				}
				break;
			case 2:
				{
				setState(648);
				number();
				}
				break;
			case 3:
				{
				setState(649);
				label();
				}
				break;
			case 4:
				{
				setState(650);
				expression();
				}
				break;
			case 5:
				{
				setState(651);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(652);
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
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				label();
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(656);
						match(WHITE_SPACE);
						}
					}

					setState(659);
					match(ASSIGN);
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(660);
						match(WHITE_SPACE);
						}
					}

					setState(663);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				label();
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(667);
						match(WHITE_SPACE);
						}
					}

					setState(670);
					match(EQUAL);
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(671);
						match(WHITE_SPACE);
						}
					}

					setState(674);
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
			setState(681);
			variable_type();
			setState(682);
			match(WHITE_SPACE);
			setState(683);
			multiple_declaration();
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					match(COMMA);
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
					multiple_declaration();
					}
					} 
				}
				setState(696);
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
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				label();
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
				match(ASSIGN);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(702);
					match(WHITE_SPACE);
					}
				}

				setState(705);
				assigned_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				label();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(708);
					match(WHITE_SPACE);
					}
				}

				setState(711);
				match(EQUAL);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(712);
					match(WHITE_SPACE);
					}
				}

				setState(715);
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
			setState(720);
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
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				label();
				setState(723);
				match(OPEN_BRACE);
				setState(724);
				array_size();
				setState(725);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				label();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(728);
					match(OPEN_BRACE);
					}
				}

				setState(731);
				array_size();
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(732);
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
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(CREATE);
				setState(740);
				match(WHITE_SPACE);
				setState(741);
				variable_type();
				setState(742);
				match(OPEN_BRACE);
				setState(743);
				array_size();
				setState(744);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(CREATE);
				setState(747);
				match(WHITE_SPACE);
				setState(748);
				variable_type();
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(749);
					match(OPEN_BRACE);
					}
				}

				setState(752);
				array_size();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(753);
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
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(760);
					match(WHITE_SPACE);
					}
				}

				setState(763);
				match(ASSIGN);
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
				array_assign_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(768);
					match(WHITE_SPACE);
					}
				}

				setState(771);
				match(EQUAL);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(772);
					match(WHITE_SPACE);
					}
				}

				setState(775);
				array_assign_body();
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(778);
					match(WHITE_SPACE);
					}
				}

				setState(781);
				match(ASSIGN);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(782);
					match(WHITE_SPACE);
					}
				}

				setState(787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(785);
					array_variable();
					}
					break;
				case 2:
					{
					setState(786);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(796);
					array_variable();
					}
					break;
				case 2:
					{
					setState(797);
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
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				variable_type();
				setState(805);
				match(OPEN_BRACE);
				setState(806);
				match(CLOSE_BRACE);
				setState(807);
				match(WHITE_SPACE);
				setState(808);
				label();
				setState(810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(809);
					array_assign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				variable_type();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(813);
					match(OPEN_BRACE);
					}
				}

				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(816);
					match(CLOSE_BRACE);
					}
				}

				setState(819);
				match(WHITE_SPACE);
				setState(820);
				label();
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(821);
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
			setState(828);
			array_variable();
			setState(829);
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
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				match(PRINT);
				setState(832);
				match(OPEN_PAREN);
				setState(833);
				value_print();
				setState(834);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				match(PRINT);
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(837);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(840);
				value_print();
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(841);
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
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				extended_value_print();
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
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
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				label();
				setState(868); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(866);
						match(WHITE_SPACE);
						setState(867);
						label();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(870); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("No double quotes");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(874);
				extended_value_print();
				setState(888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(876);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(875);
							match(WHITE_SPACE);
							}
						}

						setState(878);
						match(PLUS);
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(879);
							match(WHITE_SPACE);
							}
						}

						setState(882);
						extended_value_print();
						setState(884);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
						case 1:
							{
							setState(883);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(890);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				setState(892); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(891);
					match(PLUS);
					}
					}
					setState(894); 
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
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(902);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(903);
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
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(SCAN);
				setState(907);
				match(OPEN_PAREN);
				setState(908);
				scan_body();
				setState(909);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				match(SCAN);
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(912);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(915);
				scan_body();
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(916);
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
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				display_message_parameter();
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(924);
					match(WHITE_SPACE);
					}
				}

				setState(927);
				match(COMMA);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(928);
					match(WHITE_SPACE);
					}
				}

				setState(931);
				value_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				display_message_parameter();
				setState(935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(934);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(937);
					match(COMMA);
					}
				}

				notifyErrorListeners("Missing 2nd scan parameter");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				display_message_parameter();
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(943);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(946);
					match(COMMA);
					}
				}

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
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
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
				setState(960);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(958);
					expression();
					}
					break;
				case 2:
					{
					setState(959);
					scan_label();
					}
					break;
				}
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(962);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(967);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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
			setState(976); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(976);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						setState(972);
						match(DIGIT);
						}
						break;
					case 2:
						{
						setState(973);
						lexer_predefined_words();
						}
						break;
					case 3:
						{
						setState(974);
						label();
						}
						break;
					case 4:
						{
						setState(975);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(978); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
			setState(984);
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
				setState(980);
				label();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
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
			setState(986);
			match(CONSTANT);
			setState(987);
			match(WHITE_SPACE);
			setState(988);
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
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				match(RETURN);
				setState(991);
				match(WHITE_SPACE);
				setState(992);
				return_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				match(RETURN);
				setState(994);
				match(WHITE_SPACE);
				setState(995);
				return_value();
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(996);
					match(WHITE_SPACE);
					}
					}
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1002);
				match(OPEN_PAREN);
				setState(1003);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1006);
				match(RETURN);
				setState(1007);
				match(WHITE_SPACE);
				setState(1008);
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
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1013);
				string();
				}
				break;
			case 2:
				{
				setState(1014);
				number();
				}
				break;
			case 3:
				{
				setState(1015);
				label();
				}
				break;
			case 4:
				{
				setState(1016);
				expression();
				}
				break;
			case 5:
				{
				setState(1017);
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
			setState(1020);
			parenthesis_expression();
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1021);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1024);
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
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				first_expression_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
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
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				match(OPEN_PAREN);
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1031);
					match(WHITE_SPACE);
					}
				}

				setState(1034);
				expression();
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1035);
					match(WHITE_SPACE);
					}
				}

				setState(1038);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				match(OPEN_PAREN);
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1041);
					match(WHITE_SPACE);
					}
				}

				setState(1044);
				expression();
				setState(1046);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1045);
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
				setState(1050);
				match(OPEN_PAREN);
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1051);
					match(WHITE_SPACE);
					}
				}

				setState(1054);
				expression();
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1055);
					match(WHITE_SPACE);
					}
				}

				setState(1059); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1058);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1061); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Uneven parenthesis, duplicate ')'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1065);
				value_expression();
				setState(1067);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1066);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1069);
				operator_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1071);
				value_expression();
				setState(1077); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1072);
						match(WHITE_SPACE);
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
							setState(1073);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1074);
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
					setState(1079); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1081);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1084);
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
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				first_operators();
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				first_operators();
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1096);
					match(WHITE_SPACE);
					}
				}

				setState(1099);
				expression();
				setState(1105); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1100);
						match(WHITE_SPACE);
						setState(1103);
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
							setState(1101);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1102);
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
					setState(1107); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
				first_operators();
				setState(1119); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1115);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1112);
							match(WHITE_SPACE);
							}
							}
							setState(1117);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1118);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1121); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1123);
					match(WHITE_SPACE);
					}
				}

				setState(1126);
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
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				second_operators();
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1133);
					match(WHITE_SPACE);
					}
				}

				setState(1136);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				second_operators();
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
				expression();
				setState(1148); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1143);
						match(WHITE_SPACE);
						setState(1146);
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
							setState(1144);
							value_expression();
							}
							break;
						case T__0:
							{
							setState(1145);
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
					setState(1150); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				second_operators();
				setState(1162); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1158);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1155);
							match(WHITE_SPACE);
							}
							}
							setState(1160);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1161);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1164); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1166);
					match(WHITE_SPACE);
					}
				}

				setState(1169);
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
		enterRule(_localctx, 92, RULE_array_label);
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
		enterRule(_localctx, 94, RULE_value_expression);
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
		enterRule(_localctx, 96, RULE_alt_expression);
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
		enterRule(_localctx, 98, RULE_alt_operator_expression);
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
		enterRule(_localctx, 100, RULE_alt_parenthesis_expression);
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
		enterRule(_localctx, 102, RULE_alt_first_expression_operator);
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
		enterRule(_localctx, 104, RULE_alt_second_expression_operator);
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
		enterRule(_localctx, 106, RULE_alt_value_expression);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_comparison_statement, _p);
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
		enterRule(_localctx, 110, RULE_assignment_statement);
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
		enterRule(_localctx, 112, RULE_value_comparison);
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
				expression();
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
		enterRule(_localctx, 114, RULE_conditional_statement);
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
		enterRule(_localctx, 116, RULE_conditional_comparison_structure);
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
		enterRule(_localctx, 118, RULE_with_then);
		int _la;
		try {
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1473);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1476);
					match(THEN);
					}
					break;
				}
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1479);
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
		enterRule(_localctx, 120, RULE_with_comparison);
		int _la;
		try {
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				match(OPEN_PAREN);
				setState(1486);
				comparison_statement(0);
				setState(1487);
				match(CLOSE_PAREN);
				setState(1488);
				with_then();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1490);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(1493);
				comparison_statement(0);
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1494);
					match(CLOSE_PAREN);
					}
				}

				setState(1497);
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
		enterRule(_localctx, 122, RULE_conditional_body);
		int _la;
		try {
			int _alt;
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				match(OPEN_BRACKET);
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1503);
					match(WHITE_SPACE);
					}
					}
					setState(1508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1509);
					statements();
					}
					}
					setState(1512); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1514);
					match(WHITE_SPACE);
					}
					}
					setState(1519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1520);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1522);
					match(OPEN_BRACKET);
					}
					break;
				}
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1525);
					match(WHITE_SPACE);
					}
					}
					setState(1530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1532); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1531);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1534); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
				}
				setState(1543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1542);
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
		enterRule(_localctx, 124, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(IF);
			setState(1550);
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
		enterRule(_localctx, 126, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(ELSE_IF);
			setState(1553);
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
		enterRule(_localctx, 128, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(ELSE);
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1556);
				match(WHITE_SPACE);
				}
			}

			setState(1559);
			match(THEN);
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(1560);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1563);
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
		enterRule(_localctx, 130, RULE_loop_statement);
		try {
			setState(1567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1565);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
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
		enterRule(_localctx, 132, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1570);
					match(WHITE_SPACE);
					}
				}

				setState(1573);
				expression();
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1574);
					match(WHITE_SPACE);
					}
				}

				setState(1577);
				match(OPEN_BRACKET);
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1578);
					match(WHITE_SPACE);
					}
					}
					setState(1583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1585); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1584);
					statements();
					}
					}
					setState(1587); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1589);
					match(WHITE_SPACE);
					}
					}
					setState(1594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1595);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1598);
					match(WHITE_SPACE);
					}
				}

				setState(1601);
				expression();
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1602);
					match(WHITE_SPACE);
					}
				}

				setState(1605);
				match(OPEN_BRACKET);
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1606);
					match(WHITE_SPACE);
					}
					}
					setState(1611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1613); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1612);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1615); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1617);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1622);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
				}
				notifyErrorListeners("Missing closing curly brackets");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1625);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				expression();
				setState(1631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(1630);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1633);
					match(WHITE_SPACE);
					}
					}
					setState(1638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1640); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1639);
					statements();
					}
					}
					setState(1642); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1644);
					match(WHITE_SPACE);
					}
					}
					setState(1649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1650);
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
		enterRule(_localctx, 134, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(1676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(1655);
					variable_type();
					setState(1656);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1660);
				label();
				setState(1662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1661);
					match(WHITE_SPACE);
					}
				}

				setState(1664);
				match(ASSIGN);
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
				loop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				variable_type();
				setState(1671);
				match(WHITE_SPACE);
				setState(1672);
				label();
				notifyErrorListeners("Missing assignment operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1675);
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
		enterRule(_localctx, 136, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(1678);
				number();
				}
				break;
			case 2:
				{
				setState(1679);
				label();
				}
				break;
			case 3:
				{
				setState(1680);
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
		enterRule(_localctx, 138, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(WHILE);
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1684);
				match(WHITE_SPACE);
				}
			}

			setState(1687);
			expression();
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1688);
				match(WHITE_SPACE);
				}
			}

			setState(1691);
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
		enterRule(_localctx, 140, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(FOR);
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1694);
				match(WHITE_SPACE);
				}
			}

			setState(1697);
			loop_variable_declaration();
			setState(1699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1698);
				match(WHITE_SPACE);
				}
			}

			setState(1701);
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
		enterRule(_localctx, 142, RULE_function_calling);
		int _la;
		try {
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1703);
				label();
				setState(1704);
				match(OPEN_PAREN);
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1705);
					function_parameters();
					}
				}

				setState(1708);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1710);
				label();
				setState(1711);
				match(OPEN_PAREN);
				setState(1713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1712);
					function_parameters();
					}
				}

				setState(1715);
				match(CLOSE_PAREN);
				setState(1716);
				match(OPEN_PAREN);
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1717);
					function_parameters();
					}
				}

				setState(1720);
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
		enterRule(_localctx, 144, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			function_paremeters_value();
			setState(1736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==WHITE_SPACE) {
				{
				{
				setState(1727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1726);
					match(WHITE_SPACE);
					}
				}

				setState(1729);
				match(COMMA);
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
				function_paremeters_value();
				}
				}
				setState(1738);
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
		enterRule(_localctx, 146, RULE_function_paremeters_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(1739);
				function_calling();
				}
				break;
			case 2:
				{
				setState(1740);
				label();
				}
				break;
			case 3:
				{
				setState(1741);
				expression();
				}
				break;
			case 4:
				{
				setState(1742);
				string();
				}
				break;
			case 5:
				{
				setState(1743);
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
		enterRule(_localctx, 148, RULE_function_declaration);
		try {
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1747);
				non_void_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1748);
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
		enterRule(_localctx, 150, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			label();
			setState(1752);
			match(OPEN_PAREN);
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(1753);
				function_declaration_parameters();
				}
			}

			setState(1756);
			match(CLOSE_PAREN);
			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1757);
				match(WHITE_SPACE);
				}
			}

			setState(1760);
			match(OPEN_BRACKET);
			setState(1764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1761);
				match(WHITE_SPACE);
				}
				}
				setState(1766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1768); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1767);
				statements();
				}
				}
				setState(1770); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1772);
				match(WHITE_SPACE);
				}
				}
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1778);
			match(CLOSE_BRACKET);
			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1779);
				match(NEWLINE);
				}
				}
				setState(1784);
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
		enterRule(_localctx, 152, RULE_function_declaration_parameters);
		int _la;
		try {
			setState(1819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1785);
				variable_type();
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1786);
					match(OPEN_BRACE);
					setState(1787);
					match(CLOSE_BRACE);
					}
				}

				setState(1790);
				match(WHITE_SPACE);
				setState(1791);
				label();
				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1792);
					match(COMMA);
					setState(1794);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(1793);
						match(WHITE_SPACE);
						}
					}

					setState(1796);
					function_declaration_parameters();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
				variable_type();
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1800);
					match(OPEN_BRACE);
					setState(1801);
					match(CLOSE_BRACE);
					}
				}

				setState(1804);
				match(WHITE_SPACE);
				setState(1805);
				label();
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==WHITE_SPACE) {
					{
					setState(1807);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1806);
						match(COMMA);
						}
					}

					setState(1810); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1809);
						match(WHITE_SPACE);
						}
						}
						setState(1812); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WHITE_SPACE );
					setState(1814);
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
		enterRule(_localctx, 154, RULE_void_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			match(FUNC);
			setState(1822);
			match(WHITE_SPACE);
			setState(1823);
			match(VOID);
			setState(1824);
			match(WHITE_SPACE);
			setState(1825);
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
			setState(1827);
			match(FUNC);
			setState(1828);
			match(WHITE_SPACE);
			setState(1829);
			variable_type();
			setState(1832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1830);
				match(OPEN_BRACE);
				setState(1831);
				match(CLOSE_BRACE);
				}
			}

			setState(1834);
			match(WHITE_SPACE);
			setState(1835);
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
		enterRule(_localctx, 158, RULE_error_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			match(FUNC);
			setState(1838);
			match(WHITE_SPACE);
			setState(1839);
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
		enterRule(_localctx, 160, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			match(OPEN_BRACKET);
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1843);
				match(WHITE_SPACE);
				}
				}
				setState(1848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1850); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1849);
				statements();
				}
				}
				setState(1852); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(1857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1854);
				match(WHITE_SPACE);
				}
				}
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1860);
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
		enterRule(_localctx, 162, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			main_head();
			setState(1863);
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
		enterRule(_localctx, 164, RULE_main_head);
		int _la;
		try {
			int _alt;
			setState(1888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1865);
				match(MAIN);
				setState(1866);
				match(OPEN_PAREN);
				setState(1867);
				match(CLOSE_PAREN);
				setState(1871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1868);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1873);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874);
				match(MAIN);
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(1875);
					match(OPEN_PAREN);
					}
				}

				setState(1879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1878);
					match(CLOSE_PAREN);
					}
				}

				setState(1884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1881);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1886);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
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
		enterRule(_localctx, 166, RULE_main_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			main_body_first();
			setState(1894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1891);
				match(WHITE_SPACE);
				}
				}
				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1898); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1897);
				statements();
				}
				}
				setState(1900); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(1905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1902);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			}
			setState(1908);
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
		enterRule(_localctx, 168, RULE_main_body_first);
		try {
			setState(1912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1910);
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
		enterRule(_localctx, 170, RULE_main_body_second);
		try {
			setState(1916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914);
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
		case 54:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0781\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\7\2\u00b1\n\2\f\2\16\2\u00b4\13\2\7\2\u00b6"+
		"\n\2\f\2\16\2\u00b9\13\2\3\2\7\2\u00bc\n\2\f\2\16\2\u00bf\13\2\3\2\3\2"+
		"\7\2\u00c3\n\2\f\2\16\2\u00c6\13\2\3\2\7\2\u00c9\n\2\f\2\16\2\u00cc\13"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4\u00d7\n\4\r\4\16\4\u00d8\3"+
		"\4\3\4\3\5\5\5\u00de\n\5\3\5\6\5\u00e1\n\5\r\5\16\5\u00e2\3\5\3\5\6\5"+
		"\u00e7\n\5\r\5\16\5\u00e8\3\5\5\5\u00ec\n\5\3\5\5\5\u00ef\n\5\3\5\6\5"+
		"\u00f2\n\5\r\5\16\5\u00f3\5\5\u00f6\n\5\3\6\7\6\u00f9\n\6\f\6\16\6\u00fc"+
		"\13\6\3\6\6\6\u00ff\n\6\r\6\16\6\u0100\3\6\7\6\u0104\n\6\f\6\16\6\u0107"+
		"\13\6\3\6\7\6\u010a\n\6\f\6\16\6\u010d\13\6\3\6\7\6\u0110\n\6\f\6\16\6"+
		"\u0113\13\6\3\7\3\7\3\7\3\7\5\7\u0119\n\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n"+
		"\u0121\n\n\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u0129\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0133\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\7\24\u0141\n\24\f\24\16\24\u0144\13\24\3\24"+
		"\5\24\u0147\n\24\3\24\7\24\u014a\n\24\f\24\16\24\u014d\13\24\3\24\7\24"+
		"\u0150\n\24\f\24\16\24\u0153\13\24\3\24\3\24\7\24\u0157\n\24\f\24\16\24"+
		"\u015a\13\24\3\24\5\24\u015d\n\24\3\24\7\24\u0160\n\24\f\24\16\24\u0163"+
		"\13\24\3\24\7\24\u0166\n\24\f\24\16\24\u0169\13\24\3\24\3\24\3\24\7\24"+
		"\u016e\n\24\f\24\16\24\u0171\13\24\3\24\5\24\u0174\n\24\3\24\7\24\u0177"+
		"\n\24\f\24\16\24\u017a\13\24\3\24\7\24\u017d\n\24\f\24\16\24\u0180\13"+
		"\24\3\24\3\24\7\24\u0184\n\24\f\24\16\24\u0187\13\24\3\24\5\24\u018a\n"+
		"\24\3\24\7\24\u018d\n\24\f\24\16\24\u0190\13\24\3\24\7\24\u0193\n\24\f"+
		"\24\16\24\u0196\13\24\3\24\3\24\3\24\3\24\3\24\7\24\u019d\n\24\f\24\16"+
		"\24\u01a0\13\24\3\24\5\24\u01a3\n\24\3\24\7\24\u01a6\n\24\f\24\16\24\u01a9"+
		"\13\24\3\24\7\24\u01ac\n\24\f\24\16\24\u01af\13\24\3\24\3\24\7\24\u01b3"+
		"\n\24\f\24\16\24\u01b6\13\24\3\24\5\24\u01b9\n\24\3\24\7\24\u01bc\n\24"+
		"\f\24\16\24\u01bf\13\24\3\24\7\24\u01c2\n\24\f\24\16\24\u01c5\13\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u01cc\n\24\f\24\16\24\u01cf\13\24\3\24\5"+
		"\24\u01d2\n\24\3\24\7\24\u01d5\n\24\f\24\16\24\u01d8\13\24\3\24\7\24\u01db"+
		"\n\24\f\24\16\24\u01de\13\24\3\24\3\24\7\24\u01e2\n\24\f\24\16\24\u01e5"+
		"\13\24\3\24\5\24\u01e8\n\24\3\24\7\24\u01eb\n\24\f\24\16\24\u01ee\13\24"+
		"\3\24\7\24\u01f1\n\24\f\24\16\24\u01f4\13\24\3\24\3\24\3\24\3\24\7\24"+
		"\u01fa\n\24\f\24\16\24\u01fd\13\24\3\24\5\24\u0200\n\24\3\24\7\24\u0203"+
		"\n\24\f\24\16\24\u0206\13\24\3\24\7\24\u0209\n\24\f\24\16\24\u020c\13"+
		"\24\3\24\3\24\3\24\7\24\u0211\n\24\f\24\16\24\u0214\13\24\3\24\5\24\u0217"+
		"\n\24\3\24\7\24\u021a\n\24\f\24\16\24\u021d\13\24\3\24\7\24\u0220\n\24"+
		"\f\24\16\24\u0223\13\24\3\24\3\24\7\24\u0227\n\24\f\24\16\24\u022a\13"+
		"\24\3\24\5\24\u022d\n\24\3\24\7\24\u0230\n\24\f\24\16\24\u0233\13\24\3"+
		"\24\7\24\u0236\n\24\f\24\16\24\u0239\13\24\3\24\3\24\3\24\3\24\7\24\u023f"+
		"\n\24\f\24\16\24\u0242\13\24\3\24\5\24\u0245\n\24\3\24\7\24\u0248\n\24"+
		"\f\24\16\24\u024b\13\24\3\24\7\24\u024e\n\24\f\24\16\24\u0251\13\24\3"+
		"\24\3\24\3\24\7\24\u0256\n\24\f\24\16\24\u0259\13\24\3\24\5\24\u025c\n"+
		"\24\3\24\7\24\u025f\n\24\f\24\16\24\u0262\13\24\3\24\7\24\u0265\n\24\f"+
		"\24\16\24\u0268\13\24\3\24\3\24\7\24\u026c\n\24\f\24\16\24\u026f\13\24"+
		"\3\24\5\24\u0272\n\24\3\24\7\24\u0275\n\24\f\24\16\24\u0278\13\24\3\24"+
		"\7\24\u027b\n\24\f\24\16\24\u027e\13\24\3\24\3\24\5\24\u0282\n\24\3\25"+
		"\3\25\3\25\3\25\5\25\u0288\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0290"+
		"\n\26\3\27\3\27\5\27\u0294\n\27\3\27\3\27\5\27\u0298\n\27\3\27\5\27\u029b"+
		"\n\27\3\27\3\27\5\27\u029f\n\27\3\27\3\27\5\27\u02a3\n\27\3\27\5\27\u02a6"+
		"\n\27\3\27\3\27\5\27\u02aa\n\27\3\30\3\30\3\30\3\30\5\30\u02b0\n\30\3"+
		"\30\3\30\5\30\u02b4\n\30\3\30\7\30\u02b7\n\30\f\30\16\30\u02ba\13\30\3"+
		"\31\3\31\5\31\u02be\n\31\3\31\3\31\5\31\u02c2\n\31\3\31\3\31\3\31\3\31"+
		"\5\31\u02c8\n\31\3\31\3\31\5\31\u02cc\n\31\3\31\3\31\3\31\5\31\u02d1\n"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02dc\n\33\3\33"+
		"\3\33\5\33\u02e0\n\33\3\33\3\33\5\33\u02e4\n\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u02f1\n\34\3\34\3\34\5\34\u02f5"+
		"\n\34\3\34\3\34\5\34\u02f9\n\34\3\35\5\35\u02fc\n\35\3\35\3\35\5\35\u0300"+
		"\n\35\3\35\3\35\5\35\u0304\n\35\3\35\3\35\5\35\u0308\n\35\3\35\3\35\3"+
		"\35\3\35\5\35\u030e\n\35\3\35\3\35\5\35\u0312\n\35\3\35\3\35\5\35\u0316"+
		"\n\35\3\35\5\35\u0319\n\35\3\35\3\35\5\35\u031d\n\35\3\35\3\35\5\35\u0321"+
		"\n\35\3\35\3\35\5\35\u0325\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u032d"+
		"\n\36\3\36\3\36\5\36\u0331\n\36\3\36\5\36\u0334\n\36\3\36\3\36\3\36\5"+
		"\36\u0339\n\36\3\36\3\36\5\36\u033d\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \5 \u0349\n \3 \3 \5 \u034d\n \3 \3 \5 \u0351\n \3!\3!\5!\u0355"+
		"\n!\3!\3!\5!\u0359\n!\3!\3!\5!\u035d\n!\7!\u035f\n!\f!\16!\u0362\13!\3"+
		"!\3!\3!\6!\u0367\n!\r!\16!\u0368\3!\3!\3!\3!\5!\u036f\n!\3!\3!\5!\u0373"+
		"\n!\3!\3!\5!\u0377\n!\7!\u0379\n!\f!\16!\u037c\13!\3!\6!\u037f\n!\r!\16"+
		"!\u0380\3!\3!\5!\u0385\n!\3\"\3\"\3\"\3\"\5\"\u038b\n\"\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u0394\n#\3#\3#\5#\u0398\n#\3#\3#\5#\u039c\n#\3$\3$\5$\u03a0"+
		"\n$\3$\3$\5$\u03a4\n$\3$\3$\3$\3$\5$\u03aa\n$\3$\5$\u03ad\n$\3$\3$\3$"+
		"\3$\5$\u03b3\n$\3$\5$\u03b6\n$\3$\5$\u03b9\n$\3$\3$\3$\5$\u03be\n$\3%"+
		"\3%\3%\5%\u03c3\n%\3%\7%\u03c6\n%\f%\16%\u03c9\13%\3%\3%\5%\u03cd\n%\3"+
		"&\3&\3&\3&\6&\u03d3\n&\r&\16&\u03d4\3\'\3\'\3\'\3\'\5\'\u03db\n\'\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\7)\u03e8\n)\f)\16)\u03eb\13)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\5)\u03f6\n)\3*\3*\3*\3*\3*\5*\u03fd\n*\3+\3+\5+\u0401"+
		"\n+\3+\3+\3,\3,\5,\u0407\n,\3-\3-\5-\u040b\n-\3-\3-\5-\u040f\n-\3-\3-"+
		"\3-\3-\5-\u0415\n-\3-\3-\5-\u0419\n-\3-\3-\3-\3-\5-\u041f\n-\3-\3-\5-"+
		"\u0423\n-\3-\6-\u0426\n-\r-\16-\u0427\3-\3-\3-\3-\5-\u042e\n-\3-\3-\3"+
		"-\3-\3-\3-\5-\u0436\n-\6-\u0438\n-\r-\16-\u0439\3-\5-\u043d\n-\3-\3-\3"+
		"-\5-\u0442\n-\3.\3.\5.\u0446\n.\3.\3.\3.\3.\5.\u044c\n.\3.\3.\3.\3.\5"+
		".\u0452\n.\6.\u0454\n.\r.\16.\u0455\3.\3.\3.\3.\7.\u045c\n.\f.\16.\u045f"+
		"\13.\3.\6.\u0462\n.\r.\16.\u0463\3.\5.\u0467\n.\3.\3.\3.\3.\5.\u046d\n"+
		".\3/\3/\5/\u0471\n/\3/\3/\3/\3/\5/\u0477\n/\3/\3/\3/\3/\5/\u047d\n/\6"+
		"/\u047f\n/\r/\16/\u0480\3/\3/\3/\3/\7/\u0487\n/\f/\16/\u048a\13/\3/\6"+
		"/\u048d\n/\r/\16/\u048e\3/\5/\u0492\n/\3/\3/\3/\3/\5/\u0498\n/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u04a1\n\60\3\60\3\60\5\60\u04a5\n\60"+
		"\3\60\3\60\5\60\u04a9\n\60\3\61\3\61\3\61\3\61\5\61\u04af\n\61\3\62\3"+
		"\62\5\62\u04b3\n\62\3\62\3\62\3\63\3\63\5\63\u04b9\n\63\3\64\3\64\5\64"+
		"\u04bd\n\64\3\64\3\64\5\64\u04c1\n\64\3\64\3\64\3\64\3\64\5\64\u04c7\n"+
		"\64\3\64\3\64\5\64\u04cb\n\64\3\64\3\64\3\64\3\64\5\64\u04d1\n\64\3\64"+
		"\3\64\5\64\u04d5\n\64\3\64\6\64\u04d8\n\64\r\64\16\64\u04d9\3\64\3\64"+
		"\3\64\3\64\5\64\u04e0\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u04e8\n"+
		"\64\6\64\u04ea\n\64\r\64\16\64\u04eb\3\64\5\64\u04ef\n\64\3\64\3\64\3"+
		"\64\5\64\u04f4\n\64\3\65\3\65\5\65\u04f8\n\65\3\65\3\65\3\65\3\65\5\65"+
		"\u04fe\n\65\3\65\3\65\3\65\3\65\5\65\u0504\n\65\6\65\u0506\n\65\r\65\16"+
		"\65\u0507\3\65\3\65\3\65\3\65\7\65\u050e\n\65\f\65\16\65\u0511\13\65\3"+
		"\65\6\65\u0514\n\65\r\65\16\65\u0515\3\65\5\65\u0519\n\65\3\65\3\65\3"+
		"\65\3\65\5\65\u051f\n\65\3\66\3\66\5\66\u0523\n\66\3\66\3\66\3\66\3\66"+
		"\5\66\u0529\n\66\3\66\3\66\3\66\3\66\5\66\u052f\n\66\6\66\u0531\n\66\r"+
		"\66\16\66\u0532\3\66\3\66\3\66\3\66\7\66\u0539\n\66\f\66\16\66\u053c\13"+
		"\66\3\66\6\66\u053f\n\66\r\66\16\66\u0540\3\66\5\66\u0544\n\66\3\66\3"+
		"\66\3\66\3\66\5\66\u054a\n\66\3\67\3\67\3\67\5\67\u054f\n\67\38\38\38"+
		"\38\58\u0555\n8\38\38\58\u0559\n8\38\38\58\u055d\n8\38\38\58\u0561\n8"+
		"\38\38\58\u0565\n8\38\38\58\u0569\n8\38\38\38\38\58\u056f\n8\38\38\68"+
		"\u0573\n8\r8\168\u0574\38\58\u0578\n8\38\38\38\78\u057d\n8\f8\168\u0580"+
		"\138\39\39\59\u0584\n9\39\39\59\u0588\n9\39\39\59\u058c\n9\39\39\59\u0590"+
		"\n9\39\39\59\u0594\n9\39\39\59\u0598\n9\39\39\59\u059c\n9\3:\3:\3:\3:"+
		"\5:\u05a2\n:\3;\3;\5;\u05a6\n;\3;\3;\5;\u05aa\n;\7;\u05ac\n;\f;\16;\u05af"+
		"\13;\3;\3;\7;\u05b3\n;\f;\16;\u05b6\13;\5;\u05b8\n;\3<\3<\3<\3=\5=\u05be"+
		"\n=\3=\3=\5=\u05c2\n=\3=\5=\u05c5\n=\3=\5=\u05c8\n=\3=\5=\u05cb\n=\3="+
		"\5=\u05ce\n=\3>\3>\3>\3>\3>\3>\5>\u05d6\n>\3>\3>\5>\u05da\n>\3>\3>\3>"+
		"\5>\u05df\n>\3?\3?\7?\u05e3\n?\f?\16?\u05e6\13?\3?\6?\u05e9\n?\r?\16?"+
		"\u05ea\3?\7?\u05ee\n?\f?\16?\u05f1\13?\3?\3?\3?\5?\u05f6\n?\3?\7?\u05f9"+
		"\n?\f?\16?\u05fc\13?\3?\6?\u05ff\n?\r?\16?\u0600\3?\7?\u0604\n?\f?\16"+
		"?\u0607\13?\3?\5?\u060a\n?\3?\3?\5?\u060e\n?\3@\3@\3@\3A\3A\3A\3B\3B\5"+
		"B\u0618\nB\3B\3B\5B\u061c\nB\3B\3B\3C\3C\5C\u0622\nC\3D\3D\5D\u0626\n"+
		"D\3D\3D\5D\u062a\nD\3D\3D\7D\u062e\nD\fD\16D\u0631\13D\3D\6D\u0634\nD"+
		"\rD\16D\u0635\3D\7D\u0639\nD\fD\16D\u063c\13D\3D\3D\3D\3D\5D\u0642\nD"+
		"\3D\3D\5D\u0646\nD\3D\3D\7D\u064a\nD\fD\16D\u064d\13D\3D\6D\u0650\nD\r"+
		"D\16D\u0651\3D\7D\u0655\nD\fD\16D\u0658\13D\3D\3D\3D\3D\5D\u065e\nD\3"+
		"D\3D\5D\u0662\nD\3D\7D\u0665\nD\fD\16D\u0668\13D\3D\6D\u066b\nD\rD\16"+
		"D\u066c\3D\7D\u0670\nD\fD\16D\u0673\13D\3D\3D\3D\5D\u0678\nD\3E\3E\3E"+
		"\5E\u067d\nE\3E\3E\5E\u0681\nE\3E\3E\5E\u0685\nE\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\5E\u068f\nE\3F\3F\3F\5F\u0694\nF\3G\3G\5G\u0698\nG\3G\3G\5G\u069c"+
		"\nG\3G\3G\3H\3H\5H\u06a2\nH\3H\3H\5H\u06a6\nH\3H\3H\3I\3I\3I\5I\u06ad"+
		"\nI\3I\3I\3I\3I\3I\5I\u06b4\nI\3I\3I\3I\5I\u06b9\nI\3I\3I\3I\5I\u06be"+
		"\nI\3J\3J\5J\u06c2\nJ\3J\3J\5J\u06c6\nJ\3J\7J\u06c9\nJ\fJ\16J\u06cc\13"+
		"J\3K\3K\3K\3K\3K\5K\u06d3\nK\3L\3L\3L\5L\u06d8\nL\3M\3M\3M\5M\u06dd\n"+
		"M\3M\3M\5M\u06e1\nM\3M\3M\7M\u06e5\nM\fM\16M\u06e8\13M\3M\6M\u06eb\nM"+
		"\rM\16M\u06ec\3M\7M\u06f0\nM\fM\16M\u06f3\13M\3M\3M\7M\u06f7\nM\fM\16"+
		"M\u06fa\13M\3N\3N\3N\5N\u06ff\nN\3N\3N\3N\3N\5N\u0705\nN\3N\5N\u0708\n"+
		"N\3N\3N\3N\5N\u070d\nN\3N\3N\3N\5N\u0712\nN\3N\6N\u0715\nN\rN\16N\u0716"+
		"\3N\5N\u071a\nN\3N\3N\5N\u071e\nN\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\5P"+
		"\u072b\nP\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\7R\u0737\nR\fR\16R\u073a\13R\3"+
		"R\6R\u073d\nR\rR\16R\u073e\3R\7R\u0742\nR\fR\16R\u0745\13R\3R\3R\3S\3"+
		"S\3S\3T\3T\3T\3T\7T\u0750\nT\fT\16T\u0753\13T\3T\3T\5T\u0757\nT\3T\5T"+
		"\u075a\nT\3T\7T\u075d\nT\fT\16T\u0760\13T\3T\5T\u0763\nT\3U\3U\7U\u0767"+
		"\nU\fU\16U\u076a\13U\3U\6U\u076d\nU\rU\16U\u076e\3U\7U\u0772\nU\fU\16"+
		"U\u0775\13U\3U\3U\3V\3V\5V\u077b\nV\3W\3W\5W\u077f\nW\3W\2\3nX\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\2\17\3\2\26\31\5\2\4\4\63\63\65\66\3\2&(\3\2$%\3\2)*\3\2"+
		" #\3\2\5\f\3\2\r\20\3\2\21\25\3\2+\64\3\2\32\37\4\288::\3\2\22\24\2\u08b3"+
		"\2\u00b7\3\2\2\2\4\u00cf\3\2\2\2\6\u00d1\3\2\2\2\b\u00f5\3\2\2\2\n\u00fa"+
		"\3\2\2\2\f\u0118\3\2\2\2\16\u011a\3\2\2\2\20\u011c\3\2\2\2\22\u0120\3"+
		"\2\2\2\24\u0122\3\2\2\2\26\u0124\3\2\2\2\30\u0128\3\2\2\2\32\u0132\3\2"+
		"\2\2\34\u0134\3\2\2\2\36\u0136\3\2\2\2 \u0138\3\2\2\2\"\u013a\3\2\2\2"+
		"$\u013c\3\2\2\2&\u0281\3\2\2\2(\u0287\3\2\2\2*\u028f\3\2\2\2,\u02a9\3"+
		"\2\2\2.\u02ab\3\2\2\2\60\u02d0\3\2\2\2\62\u02d2\3\2\2\2\64\u02e3\3\2\2"+
		"\2\66\u02f8\3\2\2\28\u0324\3\2\2\2:\u033c\3\2\2\2<\u033e\3\2\2\2>\u0350"+
		"\3\2\2\2@\u0384\3\2\2\2B\u038a\3\2\2\2D\u039b\3\2\2\2F\u03bd\3\2\2\2H"+
		"\u03cc\3\2\2\2J\u03d2\3\2\2\2L\u03da\3\2\2\2N\u03dc\3\2\2\2P\u03f5\3\2"+
		"\2\2R\u03fc\3\2\2\2T\u03fe\3\2\2\2V\u0406\3\2\2\2X\u0441\3\2\2\2Z\u046c"+
		"\3\2\2\2\\\u0497\3\2\2\2^\u04a8\3\2\2\2`\u04ae\3\2\2\2b\u04b0\3\2\2\2"+
		"d\u04b8\3\2\2\2f\u04f3\3\2\2\2h\u051e\3\2\2\2j\u0549\3\2\2\2l\u054e\3"+
		"\2\2\2n\u0560\3\2\2\2p\u059b\3\2\2\2r\u05a1\3\2\2\2t\u05a3\3\2\2\2v\u05b9"+
		"\3\2\2\2x\u05cd\3\2\2\2z\u05de\3\2\2\2|\u060d\3\2\2\2~\u060f\3\2\2\2\u0080"+
		"\u0612\3\2\2\2\u0082\u0615\3\2\2\2\u0084\u0621\3\2\2\2\u0086\u0677\3\2"+
		"\2\2\u0088\u068e\3\2\2\2\u008a\u0693\3\2\2\2\u008c\u0695\3\2\2\2\u008e"+
		"\u069f\3\2\2\2\u0090\u06bd\3\2\2\2\u0092\u06bf\3\2\2\2\u0094\u06d2\3\2"+
		"\2\2\u0096\u06d7\3\2\2\2\u0098\u06d9\3\2\2\2\u009a\u071d\3\2\2\2\u009c"+
		"\u071f\3\2\2\2\u009e\u0725\3\2\2\2\u00a0\u072f\3\2\2\2\u00a2\u0734\3\2"+
		"\2\2\u00a4\u0748\3\2\2\2\u00a6\u0762\3\2\2\2\u00a8\u0764\3\2\2\2\u00aa"+
		"\u077a\3\2\2\2\u00ac\u077e\3\2\2\2\u00ae\u00b2\5\u0096L\2\u00af\u00b1"+
		"\7:\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ae\3\2"+
		"\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bd\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\7:\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c4\5\u00a4S\2\u00c1\u00c3"+
		"\78\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7:"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\2"+
		"\2\3\u00ce\3\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0\5\3\2\2\2\u00d1\u00d6\7"+
		"\3\2\2\u00d2\u00d7\7\67\2\2\u00d3\u00d7\5\32\16\2\u00d4\u00d7\5\n\6\2"+
		"\u00d5\u00d7\7:\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\3\2\2\u00db\7\3\2\2\2"+
		"\u00dc\u00de\7%\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00e1\7\67\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6"+
		"\7\60\2\2\u00e5\u00e7\7\67\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec"+
		"\7\4\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f6\3\2\2\2\u00ed"+
		"\u00ef\7%\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2"+
		"\2\2\u00f0\u00f2\7\67\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00dd\3\2"+
		"\2\2\u00f5\u00ee\3\2\2\2\u00f6\t\3\2\2\2\u00f7\u00f9\5\f\7\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\t\3\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0105\3\2\2\2\u0102\u0104\7\67\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010b\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\5\f\7\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0111\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\5\n\6\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\13\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0119\5\34\17\2\u0115\u0119\5\36\20\2\u0116\u0119\5 \21"+
		"\2\u0117\u0119\5\4\3\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119\r\3\2\2\2\u011a\u011b\t\4\2\2\u011b"+
		"\17\3\2\2\2\u011c\u011d\t\5\2\2\u011d\21\3\2\2\2\u011e\u0121\5\16\b\2"+
		"\u011f\u0121\5\20\t\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\23"+
		"\3\2\2\2\u0122\u0123\t\6\2\2\u0123\25\3\2\2\2\u0124\u0125\t\7\2\2\u0125"+
		"\27\3\2\2\2\u0126\u0129\5\24\13\2\u0127\u0129\5\26\f\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0127\3\2\2\2\u0129\31\3\2\2\2\u012a\u0133\5\34\17\2\u012b"+
		"\u0133\5\36\20\2\u012c\u0133\5 \21\2\u012d\u0133\5\"\22\2\u012e\u0133"+
		"\5$\23\2\u012f\u0133\5\30\r\2\u0130\u0133\5\22\n\2\u0131\u0133\5\4\3\2"+
		"\u0132\u012a\3\2\2\2\u0132\u012b\3\2\2\2\u0132\u012c\3\2\2\2\u0132\u012d"+
		"\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\33\3\2\2\2\u0134\u0135\t\b\2\2\u0135\35\3\2\2\2\u0136"+
		"\u0137\t\t\2\2\u0137\37\3\2\2\2\u0138\u0139\t\n\2\2\u0139!\3\2\2\2\u013a"+
		"\u013b\t\13\2\2\u013b#\3\2\2\2\u013c\u013d\t\f\2\2\u013d%\3\2\2\2\u013e"+
		"\u0142\5t;\2\u013f\u0141\7:\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2"+
		"\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0147\79\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u014b\3\2\2\2\u0148\u014a\7:\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0151\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0150\78\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0282\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0158\5\u0084C\2\u0155\u0157\7:\2\2\u0156\u0155\3"+
		"\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\79\2\2\u015c\u015b\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u0161\3\2\2\2\u015e\u0160\7:\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0167\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\78\2\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0282\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\5> \2\u016b\u016f"+
		"\7\61\2\2\u016c\u016e\7:\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0172\u0174\79\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0178\3\2\2\2\u0175\u0177\7:\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017e\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017d\78\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0282\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0185\5> \2\u0182\u0184\7:\2\2\u0183\u0182\3\2\2"+
		"\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0189"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\79\2\2\u0189\u0188\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018d\7:\2\2\u018c\u018b\3\2"+
		"\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0194\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\78\2\2\u0192\u0191\3\2"+
		"\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\b\24\1\2\u0198\u0282\3"+
		"\2\2\2\u0199\u019a\5D#\2\u019a\u019e\7\61\2\2\u019b\u019d\7:\2\2\u019c"+
		"\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\79\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a7\3\2\2\2\u01a4\u01a6\7:"+
		"\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01ad\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\78"+
		"\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u0282\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b4\5D"+
		"#\2\u01b1\u01b3\7:\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b9\79\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bd\3\2"+
		"\2\2\u01ba\u01bc\7:\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c3\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01c0\u01c2\78\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01c7\b\24\1\2\u01c7\u0282\3\2\2\2\u01c8\u01c9\5P)\2\u01c9"+
		"\u01cd\7\61\2\2\u01ca\u01cc\7:\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d2\79\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d6\3\2\2\2\u01d3\u01d5\7:\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01dc\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01db\78\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u0282\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01df\u01e3\5P)\2\u01e0\u01e2\7:\2\2\u01e1\u01e0"+
		"\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\79\2\2\u01e7\u01e6\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ec\3\2\2\2\u01e9\u01eb\7:\2\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01f2\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\78\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\b\24\1\2\u01f6"+
		"\u0282\3\2\2\2\u01f7\u01fb\5N(\2\u01f8\u01fa\7:\2\2\u01f9\u01f8\3\2\2"+
		"\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01ff"+
		"\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\79\2\2\u01ff\u01fe\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0204\3\2\2\2\u0201\u0203\7:\2\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u020a\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\78\2\2\u0208\u0207\3\2"+
		"\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u0282\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\5(\25\2\u020e\u0212\7\61"+
		"\2\2\u020f\u0211\7:\2\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0215\u0217\79\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u021b\3\2\2\2\u0218\u021a\7:\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0221\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021e\u0220\78\2\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2"+
		"\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0282\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0224\u0228\5(\25\2\u0225\u0227\7:\2\2\u0226\u0225\3\2"+
		"\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\79\2\2\u022c\u022b\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u0231\3\2\2\2\u022e\u0230\7:\2\2\u022f"+
		"\u022e\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0237\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0236\78\2\2\u0235"+
		"\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\b\24\1\2\u023b"+
		"\u0282\3\2\2\2\u023c\u0240\5\u00a2R\2\u023d\u023f\7:\2\2\u023e\u023d\3"+
		"\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0245\79\2\2\u0244\u0243\3\2"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u0249\3\2\2\2\u0246\u0248\7:\2\2\u0247"+
		"\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024f\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024e\78\2\2\u024d"+
		"\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0282\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\5\u0090I\2\u0253"+
		"\u0257\7\61\2\2\u0254\u0256\7:\2\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u025a\u025c\79\2\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u0260\3\2\2\2\u025d\u025f\7:\2\2\u025e\u025d\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0266\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0263\u0265\78\2\2\u0264\u0263\3\2\2\2\u0265"+
		"\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0282\3\2"+
		"\2\2\u0268\u0266\3\2\2\2\u0269\u026d\5\u0090I\2\u026a\u026c\7:\2\2\u026b"+
		"\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0272\79\2\2\u0271"+
		"\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0276\3\2\2\2\u0273\u0275\7:"+
		"\2\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u027c\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\78"+
		"\2\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\b\24"+
		"\1\2\u0280\u0282\3\2\2\2\u0281\u013e\3\2\2\2\u0281\u0154\3\2\2\2\u0281"+
		"\u016a\3\2\2\2\u0281\u0181\3\2\2\2\u0281\u0199\3\2\2\2\u0281\u01b0\3\2"+
		"\2\2\u0281\u01c8\3\2\2\2\u0281\u01df\3\2\2\2\u0281\u01f7\3\2\2\2\u0281"+
		"\u020d\3\2\2\2\u0281\u0224\3\2\2\2\u0281\u023c\3\2\2\2\u0281\u0252\3\2"+
		"\2\2\u0281\u0269\3\2\2\2\u0282\'\3\2\2\2\u0283\u0288\5.\30\2\u0284\u0288"+
		"\5\60\31\2\u0285\u0288\5:\36\2\u0286\u0288\5<\37\2\u0287\u0283\3\2\2\2"+
		"\u0287\u0284\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288)\3"+
		"\2\2\2\u0289\u0290\5\6\4\2\u028a\u0290\5\b\5\2\u028b\u0290\5\n\6\2\u028c"+
		"\u0290\5T+\2\u028d\u0290\5n8\2\u028e\u0290\5\u0090I\2\u028f\u0289\3\2"+
		"\2\2\u028f\u028a\3\2\2\2\u028f\u028b\3\2\2\2\u028f\u028c\3\2\2\2\u028f"+
		"\u028d\3\2\2\2\u028f\u028e\3\2\2\2\u0290+\3\2\2\2\u0291\u029a\5\n\6\2"+
		"\u0292\u0294\7:\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0297\7,\2\2\u0296\u0298\7:\2\2\u0297\u0296\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\5*\26\2\u029a\u0293\3\2"+
		"\2\2\u029a\u029b\3\2\2\2\u029b\u02aa\3\2\2\2\u029c\u02a5\5\n\6\2\u029d"+
		"\u029f\7:\2\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2"+
		"\2\2\u02a0\u02a2\7-\2\2\u02a1\u02a3\7:\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3"+
		"\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\5*\26\2\u02a5\u029e\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\b\27\1\2\u02a8\u02aa\3"+
		"\2\2\2\u02a9\u0291\3\2\2\2\u02a9\u029c\3\2\2\2\u02aa-\3\2\2\2\u02ab\u02ac"+
		"\5\4\3\2\u02ac\u02ad\7:\2\2\u02ad\u02b8\5,\27\2\u02ae\u02b0\7:\2\2\u02af"+
		"\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\7\62"+
		"\2\2\u02b2\u02b4\7:\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b7\5,\27\2\u02b6\u02af\3\2\2\2\u02b7\u02ba\3\2"+
		"\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9/\3\2\2\2\u02ba\u02b8"+
		"\3\2\2\2\u02bb\u02bd\5\n\6\2\u02bc\u02be\7:\2\2\u02bd\u02bc\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\7,\2\2\u02c0\u02c2\7:\2"+
		"\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4"+
		"\5*\26\2\u02c4\u02d1\3\2\2\2\u02c5\u02c7\5\n\6\2\u02c6\u02c8\7:\2\2\u02c7"+
		"\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\7-"+
		"\2\2\u02ca\u02cc\7:\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02ce\5*\26\2\u02ce\u02cf\b\31\1\2\u02cf\u02d1\3"+
		"\2\2\2\u02d0\u02bb\3\2\2\2\u02d0\u02c5\3\2\2\2\u02d1\61\3\2\2\2\u02d2"+
		"\u02d3\5T+\2\u02d3\63\3\2\2\2\u02d4\u02d5\5\n\6\2\u02d5\u02d6\7\36\2\2"+
		"\u02d6\u02d7\5\62\32\2\u02d7\u02d8\7\37\2\2\u02d8\u02e4\3\2\2\2\u02d9"+
		"\u02db\5\n\6\2\u02da\u02dc\7\36\2\2\u02db\u02da\3\2\2\2\u02db\u02dc\3"+
		"\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\5\62\32\2\u02de\u02e0\7\37\2\2"+
		"\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2"+
		"\b\33\1\2\u02e2\u02e4\3\2\2\2\u02e3\u02d4\3\2\2\2\u02e3\u02d9\3\2\2\2"+
		"\u02e4\65\3\2\2\2\u02e5\u02e6\7\5\2\2\u02e6\u02e7\7:\2\2\u02e7\u02e8\5"+
		"\4\3\2\u02e8\u02e9\7\36\2\2\u02e9\u02ea\5\62\32\2\u02ea\u02eb\7\37\2\2"+
		"\u02eb\u02f9\3\2\2\2\u02ec\u02ed\7\5\2\2\u02ed\u02ee\7:\2\2\u02ee\u02f0"+
		"\5\4\3\2\u02ef\u02f1\7\36\2\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2"+
		"\u02f1\u02f2\3\2\2\2\u02f2\u02f4\5\62\32\2\u02f3\u02f5\7\37\2\2\u02f4"+
		"\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\b\34"+
		"\1\2\u02f7\u02f9\3\2\2\2\u02f8\u02e5\3\2\2\2\u02f8\u02ec\3\2\2\2\u02f9"+
		"\67\3\2\2\2\u02fa\u02fc\7:\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2"+
		"\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7,\2\2\u02fe\u0300\7:\2\2\u02ff\u02fe"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0325\5\66\34\2"+
		"\u0302\u0304\7:\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305"+
		"\3\2\2\2\u0305\u0307\7-\2\2\u0306\u0308\7:\2\2\u0307\u0306\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\5\66\34\2\u030a\u030b\b"+
		"\35\1\2\u030b\u0325\3\2\2\2\u030c\u030e\7:\2\2\u030d\u030c\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\7,\2\2\u0310\u0312\7:\2"+
		"\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0316"+
		"\5\64\33\2\u0314\u0316\5*\26\2\u0315\u0313\3\2\2\2\u0315\u0314\3\2\2\2"+
		"\u0316\u0325\3\2\2\2\u0317\u0319\7:\2\2\u0318\u0317\3\2\2\2\u0318\u0319"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031c\7-\2\2\u031b\u031d\7:\2\2\u031c"+
		"\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u0321\5\64"+
		"\33\2\u031f\u0321\5*\26\2\u0320\u031e\3\2\2\2\u0320\u031f\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0323\b\35\1\2\u0323\u0325\3\2\2\2\u0324\u02fb\3"+
		"\2\2\2\u0324\u0303\3\2\2\2\u0324\u030d\3\2\2\2\u0324\u0318\3\2\2\2\u0325"+
		"9\3\2\2\2\u0326\u0327\5\4\3\2\u0327\u0328\7\36\2\2\u0328\u0329\7\37\2"+
		"\2\u0329\u032a\7:\2\2\u032a\u032c\5\n\6\2\u032b\u032d\58\35\2\u032c\u032b"+
		"\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u033d\3\2\2\2\u032e\u0330\5\4\3\2\u032f"+
		"\u0331\7\36\2\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333\3"+
		"\2\2\2\u0332\u0334\7\37\2\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0336\7:\2\2\u0336\u0338\5\n\6\2\u0337\u0339\58\35"+
		"\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b"+
		"\b\36\1\2\u033b\u033d\3\2\2\2\u033c\u0326\3\2\2\2\u033c\u032e\3\2\2\2"+
		"\u033d;\3\2\2\2\u033e\u033f\5\64\33\2\u033f\u0340\58\35\2\u0340=\3\2\2"+
		"\2\u0341\u0342\7\b\2\2\u0342\u0343\7\32\2\2\u0343\u0344\5@!\2\u0344\u0345"+
		"\7\33\2\2\u0345\u0351\3\2\2\2\u0346\u0348\7\b\2\2\u0347\u0349\7\32\2\2"+
		"\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c"+
		"\5@!\2\u034b\u034d\7\33\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\b \1\2\u034f\u0351\3\2\2\2\u0350\u0341\3\2"+
		"\2\2\u0350\u0346\3\2\2\2\u0351?\3\2\2\2\u0352\u0360\5B\"\2\u0353\u0355"+
		"\7:\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0358\7$\2\2\u0357\u0359\7:\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2"+
		"\2\u0359\u035a\3\2\2\2\u035a\u035c\5B\"\2\u035b\u035d\7:\2\2\u035c\u035b"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0354\3\2\2\2\u035f"+
		"\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0385\3\2"+
		"\2\2\u0362\u0360\3\2\2\2\u0363\u0366\5\n\6\2\u0364\u0365\7:\2\2\u0365"+
		"\u0367\5\n\6\2\u0366\u0364\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2"+
		"\2\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\b!\1\2\u036b"+
		"\u0385\3\2\2\2\u036c\u037a\5B\"\2\u036d\u036f\7:\2\2\u036e\u036d\3\2\2"+
		"\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\7$\2\2\u0371\u0373"+
		"\7:\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0376\5B\"\2\u0375\u0377\7:\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2"+
		"\2\u0377\u0379\3\2\2\2\u0378\u036e\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378"+
		"\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037d"+
		"\u037f\7$\2\2\u037e\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u037e\3\2"+
		"\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\b!\1\2\u0383"+
		"\u0385\3\2\2\2\u0384\u0352\3\2\2\2\u0384\u0363\3\2\2\2\u0384\u036c\3\2"+
		"\2\2\u0385A\3\2\2\2\u0386\u038b\5\6\4\2\u0387\u038b\5\n\6\2\u0388\u038b"+
		"\5T+\2\u0389\u038b\5\u0090I\2\u038a\u0386\3\2\2\2\u038a\u0387\3\2\2\2"+
		"\u038a\u0388\3\2\2\2\u038a\u0389\3\2\2\2\u038bC\3\2\2\2\u038c\u038d\7"+
		"\t\2\2\u038d\u038e\7\32\2\2\u038e\u038f\5F$\2\u038f\u0390\7\33\2\2\u0390"+
		"\u039c\3\2\2\2\u0391\u0393\7\t\2\2\u0392\u0394\7\32\2\2\u0393\u0392\3"+
		"\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0397\5F$\2\u0396"+
		"\u0398\7\33\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3"+
		"\2\2\2\u0399\u039a\b#\1\2\u039a\u039c\3\2\2\2\u039b\u038c\3\2\2\2\u039b"+
		"\u0391\3\2\2\2\u039cE\3\2\2\2\u039d\u039f\5H%\2\u039e\u03a0\7:\2\2\u039f"+
		"\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\7\62"+
		"\2\2\u03a2\u03a4\7:\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u03a6\5L\'\2\u03a6\u03be\3\2\2\2\u03a7\u03a9\5H%"+
		"\2\u03a8\u03aa\7:\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac"+
		"\3\2\2\2\u03ab\u03ad\7\62\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2"+
		"\u03ad\u03ae\3\2\2\2\u03ae\u03af\b$\1\2\u03af\u03be\3\2\2\2\u03b0\u03b2"+
		"\5H%\2\u03b1\u03b3\7:\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03b5\3\2\2\2\u03b4\u03b6\7\62\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3"+
		"\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b9\7:\2\2\u03b8\u03b7\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\5L\'\2\u03bb\u03bc\b$\1"+
		"\2\u03bc\u03be\3\2\2\2\u03bd\u039d\3\2\2\2\u03bd\u03a7\3\2\2\2\u03bd\u03b0"+
		"\3\2\2\2\u03beG\3\2\2\2\u03bf\u03cd\5\6\4\2\u03c0\u03c3\5T+\2\u03c1\u03c3"+
		"\5J&\2\u03c2\u03c0\3\2\2\2\u03c2\u03c1\3\2\2\2\u03c3\u03c7\3\2\2\2\u03c4"+
		"\u03c6\7:\2\2\u03c5\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2"+
		"\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca"+
		"\u03cb\b%\1\2\u03cb\u03cd\3\2\2\2\u03cc\u03bf\3\2\2\2\u03cc\u03c2\3\2"+
		"\2\2\u03cdI\3\2\2\2\u03ce\u03d3\7\67\2\2\u03cf\u03d3\5\32\16\2\u03d0\u03d3"+
		"\5\n\6\2\u03d1\u03d3\7:\2\2\u03d2\u03ce\3\2\2\2\u03d2\u03cf\3\2\2\2\u03d2"+
		"\u03d0\3\2\2\2\u03d2\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d2\3\2"+
		"\2\2\u03d4\u03d5\3\2\2\2\u03d5K\3\2\2\2\u03d6\u03db\5\n\6\2\u03d7\u03d8"+
		"\5\6\4\2\u03d8\u03d9\b\'\1\2\u03d9\u03db\3\2\2\2\u03da\u03d6\3\2\2\2\u03da"+
		"\u03d7\3\2\2\2\u03dbM\3\2\2\2\u03dc\u03dd\7\6\2\2\u03dd\u03de\7:\2\2\u03de"+
		"\u03df\5(\25\2\u03dfO\3\2\2\2\u03e0\u03e1\7\7\2\2\u03e1\u03e2\7:\2\2\u03e2"+
		"\u03f6\5R*\2\u03e3\u03e4\7\7\2\2\u03e4\u03e5\7:\2\2\u03e5\u03e9\5R*\2"+
		"\u03e6\u03e8\7:\2\2\u03e7\u03e6\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec"+
		"\u03ed\7\32\2\2\u03ed\u03ee\7\33\2\2\u03ee\u03ef\b)\1\2\u03ef\u03f6\3"+
		"\2\2\2\u03f0\u03f1\7\7\2\2\u03f1\u03f2\7:\2\2\u03f2\u03f3\5\4\3\2\u03f3"+
		"\u03f4\b)\1\2\u03f4\u03f6\3\2\2\2\u03f5\u03e0\3\2\2\2\u03f5\u03e3\3\2"+
		"\2\2\u03f5\u03f0\3\2\2\2\u03f6Q\3\2\2\2\u03f7\u03fd\5\6\4\2\u03f8\u03fd"+
		"\5\b\5\2\u03f9\u03fd\5\n\6\2\u03fa\u03fd\5T+\2\u03fb\u03fd\5\u0090I\2"+
		"\u03fc\u03f7\3\2\2\2\u03fc\u03f8\3\2\2\2\u03fc\u03f9\3\2\2\2\u03fc\u03fa"+
		"\3\2\2\2\u03fc\u03fb\3\2\2\2\u03fdS\3\2\2\2\u03fe\u0400\5X-\2\u03ff\u0401"+
		"\7:\2\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u0403\5V,\2\u0403U\3\2\2\2\u0404\u0407\5Z.\2\u0405\u0407\5\\/\2\u0406"+
		"\u0404\3\2\2\2\u0406\u0405\3\2\2\2\u0407W\3\2\2\2\u0408\u040a\7\32\2\2"+
		"\u0409\u040b\7:\2\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u040e\5T+\2\u040d\u040f\7:\2\2\u040e\u040d\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7\33\2\2\u0411\u0442\3"+
		"\2\2\2\u0412\u0414\7\32\2\2\u0413\u0415\7:\2\2\u0414\u0413\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\5T+\2\u0417\u0419\7:\2"+
		"\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b"+
		"\b-\1\2\u041b\u0442\3\2\2\2\u041c\u041e\7\32\2\2\u041d\u041f\7:\2\2\u041e"+
		"\u041d\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0422\5T"+
		"+\2\u0421\u0423\7:\2\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0425"+
		"\3\2\2\2\u0424\u0426\7\33\2\2\u0425\u0424\3\2\2\2\u0426\u0427\3\2\2\2"+
		"\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a"+
		"\b-\1\2\u042a\u0442\3\2\2\2\u042b\u042d\5`\61\2\u042c\u042e\7:\2\2\u042d"+
		"\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\5V"+
		",\2\u0430\u0442\3\2\2\2\u0431\u0437\5`\61\2\u0432\u0435\7:\2\2\u0433\u0436"+
		"\5`\61\2\u0434\u0436\5\6\4\2\u0435\u0433\3\2\2\2\u0435\u0434\3\2\2\2\u0436"+
		"\u0438\3\2\2\2\u0437\u0432\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u0437\3\2"+
		"\2\2\u0439\u043a\3\2\2\2\u043a\u043c\3\2\2\2\u043b\u043d\7:\2\2\u043c"+
		"\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\5V"+
		",\2\u043f\u0440\b-\1\2\u0440\u0442\3\2\2\2\u0441\u0408\3\2\2\2\u0441\u0412"+
		"\3\2\2\2\u0441\u041c\3\2\2\2\u0441\u042b\3\2\2\2\u0441\u0431\3\2\2\2\u0442"+
		"Y\3\2\2\2\u0443\u0445\5\16\b\2\u0444\u0446\7:\2\2\u0445\u0444\3\2\2\2"+
		"\u0445\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\5T+\2\u0448\u046d"+
		"\3\2\2\2\u0449\u044b\5\16\b\2\u044a\u044c\7:\2\2\u044b\u044a\3\2\2\2\u044b"+
		"\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0453\5T+\2\u044e\u0451\7:\2"+
		"\2\u044f\u0452\5`\61\2\u0450\u0452\5\6\4\2\u0451\u044f\3\2\2\2\u0451\u0450"+
		"\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u044e\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\b."+
		"\1\2\u0458\u046d\3\2\2\2\u0459\u0461\5\16\b\2\u045a\u045c\7:\2\2\u045b"+
		"\u045a\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2"+
		"\2\2\u045e\u0460\3\2\2\2\u045f\u045d\3\2\2\2\u0460\u0462\5\22\n\2\u0461"+
		"\u045d\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2"+
		"\2\2\u0464\u0466\3\2\2\2\u0465\u0467\7:\2\2\u0466\u0465\3\2\2\2\u0466"+
		"\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\5T+\2\u0469\u046a\b.\1"+
		"\2\u046a\u046d\3\2\2\2\u046b\u046d\3\2\2\2\u046c\u0443\3\2\2\2\u046c\u0449"+
		"\3\2\2\2\u046c\u0459\3\2\2\2\u046c\u046b\3\2\2\2\u046d[\3\2\2\2\u046e"+
		"\u0470\5\20\t\2\u046f\u0471\7:\2\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2"+
		"\2\2\u0471\u0472\3\2\2\2\u0472\u0473\5T+\2\u0473\u0498\3\2\2\2\u0474\u0476"+
		"\5\20\t\2\u0475\u0477\7:\2\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u0478\3\2\2\2\u0478\u047e\5T+\2\u0479\u047c\7:\2\2\u047a\u047d\5`\61"+
		"\2\u047b\u047d\5\6\4\2\u047c\u047a\3\2\2\2\u047c\u047b\3\2\2\2\u047d\u047f"+
		"\3\2\2\2\u047e\u0479\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u047e\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\b/\1\2\u0483\u0498\3\2"+
		"\2\2\u0484\u048c\5\20\t\2\u0485\u0487\7:\2\2\u0486\u0485\3\2\2\2\u0487"+
		"\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2"+
		"\2\2\u048a\u0488\3\2\2\2\u048b\u048d\5\22\n\2\u048c\u0488\3\2\2\2\u048d"+
		"\u048e\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2"+
		"\2\2\u0490\u0492\7:\2\2\u0491\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492"+
		"\u0493\3\2\2\2\u0493\u0494\5T+\2\u0494\u0495\b/\1\2\u0495\u0498\3\2\2"+
		"\2\u0496\u0498\3\2\2\2\u0497\u046e\3\2\2\2\u0497\u0474\3\2\2\2\u0497\u0484"+
		"\3\2\2\2\u0497\u0496\3\2\2\2\u0498]\3\2\2\2\u0499\u049a\5\n\6\2\u049a"+
		"\u049b\7\36\2\2\u049b\u049c\5b\62\2\u049c\u049d\7\37\2\2\u049d\u04a9\3"+
		"\2\2\2\u049e\u04a0\5\n\6\2\u049f\u04a1\7\36\2\2\u04a0\u049f\3\2\2\2\u04a0"+
		"\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a4\5b\62\2\u04a3\u04a5\7\37"+
		"\2\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u04a7\b\60\1\2\u04a7\u04a9\3\2\2\2\u04a8\u0499\3\2\2\2\u04a8\u049e\3"+
		"\2\2\2\u04a9_\3\2\2\2\u04aa\u04af\5\b\5\2\u04ab\u04af\5\n\6\2\u04ac\u04af"+
		"\5\u0090I\2\u04ad\u04af\5^\60\2\u04ae\u04aa\3\2\2\2\u04ae\u04ab\3\2\2"+
		"\2\u04ae\u04ac\3\2\2\2\u04ae\u04ad\3\2\2\2\u04afa\3\2\2\2\u04b0\u04b2"+
		"\5f\64\2\u04b1\u04b3\7:\2\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b4\3\2\2\2\u04b4\u04b5\5d\63\2\u04b5c\3\2\2\2\u04b6\u04b9\5h\65\2"+
		"\u04b7\u04b9\5j\66\2\u04b8\u04b6\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9e\3"+
		"\2\2\2\u04ba\u04bc\7\32\2\2\u04bb\u04bd\7:\2\2\u04bc\u04bb\3\2\2\2\u04bc"+
		"\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\5b\62\2\u04bf\u04c1\7:"+
		"\2\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2"+
		"\u04c3\7\33\2\2\u04c3\u04f4\3\2\2\2\u04c4\u04c6\7\32\2\2\u04c5\u04c7\7"+
		":\2\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"\u04ca\5b\62\2\u04c9\u04cb\7:\2\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2"+
		"\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\b\64\1\2\u04cd\u04f4\3\2\2\2\u04ce"+
		"\u04d0\7\32\2\2\u04cf\u04d1\7:\2\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2"+
		"\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\5b\62\2\u04d3\u04d5\7:\2\2\u04d4"+
		"\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d8\7\33"+
		"\2\2\u04d7\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\b\64\1\2\u04dc\u04f4\3"+
		"\2\2\2\u04dd\u04df\5l\67\2\u04de\u04e0\7:\2\2\u04df\u04de\3\2\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\5d\63\2\u04e2\u04f4\3\2"+
		"\2\2\u04e3\u04e9\5l\67\2\u04e4\u04e7\7:\2\2\u04e5\u04e8\5l\67\2\u04e6"+
		"\u04e8\5\6\4\2\u04e7\u04e5\3\2\2\2\u04e7\u04e6\3\2\2\2\u04e8\u04ea\3\2"+
		"\2\2\u04e9\u04e4\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb"+
		"\u04ec\3\2\2\2\u04ec\u04ee\3\2\2\2\u04ed\u04ef\7:\2\2\u04ee\u04ed\3\2"+
		"\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\5d\63\2\u04f1"+
		"\u04f2\b\64\1\2\u04f2\u04f4\3\2\2\2\u04f3\u04ba\3\2\2\2\u04f3\u04c4\3"+
		"\2\2\2\u04f3\u04ce\3\2\2\2\u04f3\u04dd\3\2\2\2\u04f3\u04e3\3\2\2\2\u04f4"+
		"g\3\2\2\2\u04f5\u04f7\5\16\b\2\u04f6\u04f8\7:\2\2\u04f7\u04f6\3\2\2\2"+
		"\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\5b\62\2\u04fa\u051f"+
		"\3\2\2\2\u04fb\u04fd\5\16\b\2\u04fc\u04fe\7:\2\2\u04fd\u04fc\3\2\2\2\u04fd"+
		"\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0505\5b\62\2\u0500\u0503\7:"+
		"\2\2\u0501\u0504\5l\67\2\u0502\u0504\5\6\4\2\u0503\u0501\3\2\2\2\u0503"+
		"\u0502\3\2\2\2\u0504\u0506\3\2\2\2\u0505\u0500\3\2\2\2\u0506\u0507\3\2"+
		"\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050a\b\65\1\2\u050a\u051f\3\2\2\2\u050b\u0513\5\16\b\2\u050c\u050e\7"+
		":\2\2\u050d\u050c\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u050f\3\2\2\2\u0512\u0514\5\22"+
		"\n\2\u0513\u050f\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0513\3\2\2\2\u0515"+
		"\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u0519\7:\2\2\u0518\u0517\3\2"+
		"\2\2\u0518\u0519\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\5b\62\2\u051b"+
		"\u051c\b\65\1\2\u051c\u051f\3\2\2\2\u051d\u051f\3\2\2\2\u051e\u04f5\3"+
		"\2\2\2\u051e\u04fb\3\2\2\2\u051e\u050b\3\2\2\2\u051e\u051d\3\2\2\2\u051f"+
		"i\3\2\2\2\u0520\u0522\5\20\t\2\u0521\u0523\7:\2\2\u0522\u0521\3\2\2\2"+
		"\u0522\u0523\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\5b\62\2\u0525\u054a"+
		"\3\2\2\2\u0526\u0528\5\20\t\2\u0527\u0529\7:\2\2\u0528\u0527\3\2\2\2\u0528"+
		"\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u0530\5b\62\2\u052b\u052e\7:"+
		"\2\2\u052c\u052f\5l\67\2\u052d\u052f\5\6\4\2\u052e\u052c\3\2\2\2\u052e"+
		"\u052d\3\2\2\2\u052f\u0531\3\2\2\2\u0530\u052b\3\2\2\2\u0531\u0532\3\2"+
		"\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2\2\u0534"+
		"\u0535\b\66\1\2\u0535\u054a\3\2\2\2\u0536\u053e\5\20\t\2\u0537\u0539\7"+
		":\2\2\u0538\u0537\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a"+
		"\u053b\3\2\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u053f\5\22"+
		"\n\2\u053e\u053a\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u053e\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0544\7:\2\2\u0543\u0542\3\2"+
		"\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\5b\62\2\u0546"+
		"\u0547\b\66\1\2\u0547\u054a\3\2\2\2\u0548\u054a\3\2\2\2\u0549\u0520\3"+
		"\2\2\2\u0549\u0526\3\2\2\2\u0549\u0536\3\2\2\2\u0549\u0548\3\2\2\2\u054a"+
		"k\3\2\2\2\u054b\u054f\5\b\5\2\u054c\u054f\5\n\6\2\u054d\u054f\5\u0090"+
		"I\2\u054e\u054b\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054d\3\2\2\2\u054f"+
		"m\3\2\2\2\u0550\u0551\b8\1\2\u0551\u0561\5r:\2\u0552\u0561\5p9\2\u0553"+
		"\u0555\7+\2\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u0558\7\32\2\2\u0557\u0559\7:\2\2\u0558\u0557\3\2\2\2\u0558"+
		"\u0559\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055c\5n8\2\u055b\u055d\7:\2"+
		"\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f"+
		"\7\33\2\2\u055f\u0561\3\2\2\2\u0560\u0550\3\2\2\2\u0560\u0552\3\2\2\2"+
		"\u0560\u0554\3\2\2\2\u0561\u057e\3\2\2\2\u0562\u0564\f\5\2\2\u0563\u0565"+
		"\7:\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2\2\u0566"+
		"\u0568\5\30\r\2\u0567\u0569\7:\2\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2"+
		"\2\2\u0569\u056a\3\2\2\2\u056a\u056b\5n8\6\u056b\u057d\3\2\2\2\u056c\u056e"+
		"\f\4\2\2\u056d\u056f\7:\2\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u0572\5\30\r\2\u0571\u0573\5\30\r\2\u0572\u0571\3"+
		"\2\2\2\u0573\u0574\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0577\3\2\2\2\u0576\u0578\7:\2\2\u0577\u0576\3\2\2\2\u0577\u0578\3\2"+
		"\2\2\u0578\u0579\3\2\2\2\u0579\u057a\5n8\5\u057a\u057b\b8\1\2\u057b\u057d"+
		"\3\2\2\2\u057c\u0562\3\2\2\2\u057c\u056c\3\2\2\2\u057d\u0580\3\2\2\2\u057e"+
		"\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057fo\3\2\2\2\u0580\u057e\3\2\2\2"+
		"\u0581\u0583\5\n\6\2\u0582\u0584\7:\2\2\u0583\u0582\3\2\2\2\u0583\u0584"+
		"\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\7-\2\2\u0586\u0588\7:\2\2\u0587"+
		"\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u058c\5r"+
		":\2\u058a\u058c\5\6\4\2\u058b\u0589\3\2\2\2\u058b\u058a\3\2\2\2\u058c"+
		"\u059c\3\2\2\2\u058d\u058f\5\n\6\2\u058e\u0590\7:\2\2\u058f\u058e\3\2"+
		"\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\7,\2\2\u0592"+
		"\u0594\7:\2\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0597\3\2"+
		"\2\2\u0595\u0598\5r:\2\u0596\u0598\5\6\4\2\u0597\u0595\3\2\2\2\u0597\u0596"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\b9\1\2\u059a\u059c\3\2\2\2\u059b"+
		"\u0581\3\2\2\2\u059b\u058d\3\2\2\2\u059cq\3\2\2\2\u059d\u05a2\5\n\6\2"+
		"\u059e\u05a2\5\b\5\2\u059f\u05a2\5T+\2\u05a0\u05a2\5\6\4\2\u05a1\u059d"+
		"\3\2\2\2\u05a1\u059e\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a0\3\2\2\2\u05a2"+
		"s\3\2\2\2\u05a3\u05a5\5~@\2\u05a4\u05a6\t\r\2\2\u05a5\u05a4\3\2\2\2\u05a5"+
		"\u05a6\3\2\2\2\u05a6\u05ad\3\2\2\2\u05a7\u05a9\5\u0080A\2\u05a8\u05aa"+
		"\t\r\2\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab"+
		"\u05a7\3\2\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ae\3\2"+
		"\2\2\u05ae\u05b7\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0\u05b4\5\u0082B\2\u05b1"+
		"\u05b3\78\2\2\u05b2\u05b1\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2"+
		"\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7"+
		"\u05b0\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8u\3\2\2\2\u05b9\u05ba\5z>\2\u05ba"+
		"\u05bb\5|?\2\u05bbw\3\2\2\2\u05bc\u05be\7:\2\2\u05bd\u05bc\3\2\2\2\u05bd"+
		"\u05be\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\7\20\2\2\u05c0\u05c2\7"+
		":\2\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05ce\3\2\2\2\u05c3"+
		"\u05c5\7:\2\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2"+
		"\2\2\u05c6\u05c8\7\20\2\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8"+
		"\u05ca\3\2\2\2\u05c9\u05cb\7:\2\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2"+
		"\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\b=\1\2\u05cd\u05bd\3\2\2\2\u05cd"+
		"\u05c4\3\2\2\2\u05cey\3\2\2\2\u05cf\u05d0\7\32\2\2\u05d0\u05d1\5n8\2\u05d1"+
		"\u05d2\7\33\2\2\u05d2\u05d3\5x=\2\u05d3\u05df\3\2\2\2\u05d4\u05d6\7\32"+
		"\2\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7"+
		"\u05d9\5n8\2\u05d8\u05da\7\33\2\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2"+
		"\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\5x=\2\u05dc\u05dd\b>\1\2\u05dd\u05df"+
		"\3\2\2\2\u05de\u05cf\3\2\2\2\u05de\u05d5\3\2\2\2\u05df{\3\2\2\2\u05e0"+
		"\u05e4\7\34\2\2\u05e1\u05e3\7:\2\2\u05e2\u05e1\3\2\2\2\u05e3\u05e6\3\2"+
		"\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6"+
		"\u05e4\3\2\2\2\u05e7\u05e9\5&\24\2\u05e8\u05e7\3\2\2\2\u05e9\u05ea\3\2"+
		"\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ef\3\2\2\2\u05ec"+
		"\u05ee\7:\2\2\u05ed\u05ec\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed\3\2"+
		"\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f2\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f2"+
		"\u05f3\7\35\2\2\u05f3\u060e\3\2\2\2\u05f4\u05f6\7\34\2\2\u05f5\u05f4\3"+
		"\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05fa\3\2\2\2\u05f7\u05f9\7:\2\2\u05f8"+
		"\u05f7\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2"+
		"\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05ff\5&\24\2\u05fe"+
		"\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2"+
		"\2\2\u0601\u0605\3\2\2\2\u0602\u0604\7:\2\2\u0603\u0602\3\2\2\2\u0604"+
		"\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0609\3\2"+
		"\2\2\u0607\u0605\3\2\2\2\u0608\u060a\7\35\2\2\u0609\u0608\3\2\2\2\u0609"+
		"\u060a\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\b?\1\2\u060c\u060e\3\2"+
		"\2\2\u060d\u05e0\3\2\2\2\u060d\u05f5\3\2\2\2\u060e}\3\2\2\2\u060f\u0610"+
		"\7\r\2\2\u0610\u0611\5v<\2\u0611\177\3\2\2\2\u0612\u0613\7\17\2\2\u0613"+
		"\u0614\5v<\2\u0614\u0081\3\2\2\2\u0615\u0617\7\16\2\2\u0616\u0618\7:\2"+
		"\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061b"+
		"\7\20\2\2\u061a\u061c\7:\2\2\u061b\u061a\3\2\2\2\u061b\u061c\3\2\2\2\u061c"+
		"\u061d\3\2\2\2\u061d\u061e\5|?\2\u061e\u0083\3\2\2\2\u061f\u0622\5\u008c"+
		"G\2\u0620\u0622\5\u008eH\2\u0621\u061f\3\2\2\2\u0621\u0620\3\2\2\2\u0622"+
		"\u0085\3\2\2\2\u0623\u0625\t\16\2\2\u0624\u0626\7:\2\2\u0625\u0624\3\2"+
		"\2\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0629\5T+\2\u0628\u062a"+
		"\7:\2\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b\3\2\2\2\u062b"+
		"\u062f\7\34\2\2\u062c\u062e\7:\2\2\u062d\u062c\3\2\2\2\u062e\u0631\3\2"+
		"\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0633\3\2\2\2\u0631"+
		"\u062f\3\2\2\2\u0632\u0634\5&\24\2\u0633\u0632\3\2\2\2\u0634\u0635\3\2"+
		"\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u063a\3\2\2\2\u0637"+
		"\u0639\7:\2\2\u0638\u0637\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2"+
		"\2\2\u063a\u063b\3\2\2\2\u063b\u063d\3\2\2\2\u063c\u063a\3\2\2\2\u063d"+
		"\u063e\7\35\2\2\u063e\u0678\3\2\2\2\u063f\u0641\t\16\2\2\u0640\u0642\7"+
		":\2\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\3\2\2\2\u0643"+
		"\u0645\5T+\2\u0644\u0646\7:\2\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2"+
		"\2\u0646\u0647\3\2\2\2\u0647\u064b\7\34\2\2\u0648\u064a\7:\2\2\u0649\u0648"+
		"\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064c"+
		"\u064f\3\2\2\2\u064d\u064b\3\2\2\2\u064e\u0650\5&\24\2\u064f\u064e\3\2"+
		"\2\2\u0650\u0651\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0656\3\2\2\2\u0653\u0655\7:\2\2\u0654\u0653\3\2\2\2\u0655\u0658\3\2"+
		"\2\2\u0656\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658"+
		"\u0656\3\2\2\2\u0659\u065a\bD\1\2\u065a\u0678\3\2\2\2\u065b\u065d\t\16"+
		"\2\2\u065c\u065e\7:\2\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e"+
		"\u065f\3\2\2\2\u065f\u0661\5T+\2\u0660\u0662\7:\2\2\u0661\u0660\3\2\2"+
		"\2\u0661\u0662\3\2\2\2\u0662\u0666\3\2\2\2\u0663\u0665\7:\2\2\u0664\u0663"+
		"\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u066b\5&\24\2\u066a\u0669\3\2"+
		"\2\2\u066b\u066c\3\2\2\2\u066c\u066a\3\2\2\2\u066c\u066d\3\2\2\2\u066d"+
		"\u0671\3\2\2\2\u066e\u0670\7:\2\2\u066f\u066e\3\2\2\2\u0670\u0673\3\2"+
		"\2\2\u0671\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0674\3\2\2\2\u0673"+
		"\u0671\3\2\2\2\u0674\u0675\7\35\2\2\u0675\u0676\bD\1\2\u0676\u0678\3\2"+
		"\2\2\u0677\u0623\3\2\2\2\u0677\u063f\3\2\2\2\u0677\u065b\3\2\2\2\u0678"+
		"\u0087\3\2\2\2\u0679\u067a\5\4\3\2\u067a\u067b\7:\2\2\u067b\u067d\3\2"+
		"\2\2\u067c\u0679\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2\u067e"+
		"\u0680\5\n\6\2\u067f\u0681\7:\2\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2"+
		"\2\2\u0681\u0682\3\2\2\2\u0682\u0684\7,\2\2\u0683\u0685\7:\2\2\u0684\u0683"+
		"\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\5\u008aF"+
		"\2\u0687\u068f\3\2\2\2\u0688\u0689\5\4\3\2\u0689\u068a\7:\2\2\u068a\u068b"+
		"\5\n\6\2\u068b\u068c\bE\1\2\u068c\u068f\3\2\2\2\u068d\u068f\5T+\2\u068e"+
		"\u067c\3\2\2\2\u068e\u0688\3\2\2\2\u068e\u068d\3\2\2\2\u068f\u0089\3\2"+
		"\2\2\u0690\u0694\5\b\5\2\u0691\u0694\5\n\6\2\u0692\u0694\5T+\2\u0693\u0690"+
		"\3\2\2\2\u0693\u0691\3\2\2\2\u0693\u0692\3\2\2\2\u0694\u008b\3\2\2\2\u0695"+
		"\u0697\7\25\2\2\u0696\u0698\7:\2\2\u0697\u0696\3\2\2\2\u0697\u0698\3\2"+
		"\2\2\u0698\u0699\3\2\2\2\u0699\u069b\5T+\2\u069a\u069c\7:\2\2\u069b\u069a"+
		"\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\5\u0086D"+
		"\2\u069e\u008d\3\2\2\2\u069f\u06a1\7\21\2\2\u06a0\u06a2\7:\2\2\u06a1\u06a0"+
		"\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\5\u0088E"+
		"\2\u06a4\u06a6\7:\2\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7"+
		"\3\2\2\2\u06a7\u06a8\5\u0086D\2\u06a8\u008f\3\2\2\2\u06a9\u06aa\5\n\6"+
		"\2\u06aa\u06ac\7\32\2\2\u06ab\u06ad\5\u0092J\2\u06ac\u06ab\3\2\2\2\u06ac"+
		"\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\7\33\2\2\u06af\u06be\3"+
		"\2\2\2\u06b0\u06b1\5\n\6\2\u06b1\u06b3\7\32\2\2\u06b2\u06b4\5\u0092J\2"+
		"\u06b3\u06b2\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6"+
		"\7\33\2\2\u06b6\u06b8\7\32\2\2\u06b7\u06b9\5\u0092J\2\u06b8\u06b7\3\2"+
		"\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\7\33\2\2\u06bb"+
		"\u06bc\bI\1\2\u06bc\u06be\3\2\2\2\u06bd\u06a9\3\2\2\2\u06bd\u06b0\3\2"+
		"\2\2\u06be\u0091\3\2\2\2\u06bf\u06ca\5\u0094K\2\u06c0\u06c2\7:\2\2\u06c1"+
		"\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\7\62"+
		"\2\2\u06c4\u06c6\7:\2\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6"+
		"\u06c7\3\2\2\2\u06c7\u06c9\5\u0094K\2\u06c8\u06c1\3\2\2\2\u06c9\u06cc"+
		"\3\2\2\2\u06ca\u06c8\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u0093\3\2\2\2\u06cc"+
		"\u06ca\3\2\2\2\u06cd\u06d3\5\u0090I\2\u06ce\u06d3\5\n\6\2\u06cf\u06d3"+
		"\5T+\2\u06d0\u06d3\5\6\4\2\u06d1\u06d3\5\b\5\2\u06d2\u06cd\3\2\2\2\u06d2"+
		"\u06ce\3\2\2\2\u06d2\u06cf\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d1\3\2"+
		"\2\2\u06d3\u0095\3\2\2\2\u06d4\u06d8\5\u009cO\2\u06d5\u06d8\5\u009eP\2"+
		"\u06d6\u06d8\5\u00a0Q\2\u06d7\u06d4\3\2\2\2\u06d7\u06d5\3\2\2\2\u06d7"+
		"\u06d6\3\2\2\2\u06d8\u0097\3\2\2\2\u06d9\u06da\5\n\6\2\u06da\u06dc\7\32"+
		"\2\2\u06db\u06dd\5\u009aN\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u06e0\7\33\2\2\u06df\u06e1\7:\2\2\u06e0\u06df\3\2"+
		"\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e6\7\34\2\2\u06e3"+
		"\u06e5\7:\2\2\u06e4\u06e3\3\2\2\2\u06e5\u06e8\3\2\2\2\u06e6\u06e4\3\2"+
		"\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06ea\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e9"+
		"\u06eb\5&\24\2\u06ea\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ea\3\2"+
		"\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06f1\3\2\2\2\u06ee\u06f0\7:\2\2\u06ef"+
		"\u06ee\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2\3\2"+
		"\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06f8\7\35\2\2\u06f5"+
		"\u06f7\78\2\2\u06f6\u06f5\3\2\2\2\u06f7\u06fa\3\2\2\2\u06f8\u06f6\3\2"+
		"\2\2\u06f8\u06f9\3\2\2\2\u06f9\u0099\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fb"+
		"\u06fe\5\4\3\2\u06fc\u06fd\7\36\2\2\u06fd\u06ff\7\37\2\2\u06fe\u06fc\3"+
		"\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0701\7:\2\2\u0701"+
		"\u0707\5\n\6\2\u0702\u0704\7\62\2\2\u0703\u0705\7:\2\2\u0704\u0703\3\2"+
		"\2\2\u0704\u0705\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0708\5\u009aN\2\u0707"+
		"\u0702\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u071e\3\2\2\2\u0709\u070c\5\4"+
		"\3\2\u070a\u070b\7\36\2\2\u070b\u070d\7\37\2\2\u070c\u070a\3\2\2\2\u070c"+
		"\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\7:\2\2\u070f\u0719\5\n"+
		"\6\2\u0710\u0712\7\62\2\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712"+
		"\u0714\3\2\2\2\u0713\u0715\7:\2\2\u0714\u0713\3\2\2\2\u0715\u0716\3\2"+
		"\2\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0718\3\2\2\2\u0718"+
		"\u071a\5\u009aN\2\u0719\u0711\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b"+
		"\3\2\2\2\u071b\u071c\bN\1\2\u071c\u071e\3\2\2\2\u071d\u06fb\3\2\2\2\u071d"+
		"\u0709\3\2\2\2\u071e\u009b\3\2\2\2\u071f\u0720\7\13\2\2\u0720\u0721\7"+
		":\2\2\u0721\u0722\7\n\2\2\u0722\u0723\7:\2\2\u0723\u0724\5\u0098M\2\u0724"+
		"\u009d\3\2\2\2\u0725\u0726\7\13\2\2\u0726\u0727\7:\2\2\u0727\u072a\5\4"+
		"\3\2\u0728\u0729\7\36\2\2\u0729\u072b\7\37\2\2\u072a\u0728\3\2\2\2\u072a"+
		"\u072b\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\7:\2\2\u072d\u072e\5\u0098"+
		"M\2\u072e\u009f\3\2\2\2\u072f\u0730\7\13\2\2\u0730\u0731\7:\2\2\u0731"+
		"\u0732\5\u0098M\2\u0732\u0733\bQ\1\2\u0733\u00a1\3\2\2\2\u0734\u0738\7"+
		"\34\2\2\u0735\u0737\7:\2\2\u0736\u0735\3\2\2\2\u0737\u073a\3\2\2\2\u0738"+
		"\u0736\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u0738\3\2"+
		"\2\2\u073b\u073d\5&\24\2\u073c\u073b\3\2\2\2\u073d\u073e\3\2\2\2\u073e"+
		"\u073c\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0743\3\2\2\2\u0740\u0742\7:"+
		"\2\2\u0741\u0740\3\2\2\2\u0742\u0745\3\2\2\2\u0743\u0741\3\2\2\2\u0743"+
		"\u0744\3\2\2\2\u0744\u0746\3\2\2\2\u0745\u0743\3\2\2\2\u0746\u0747\7\35"+
		"\2\2\u0747\u00a3\3\2\2\2\u0748\u0749\5\u00a6T\2\u0749\u074a\5\u00a8U\2"+
		"\u074a\u00a5\3\2\2\2\u074b\u074c\7\f\2\2\u074c\u074d\7\32\2\2\u074d\u0751"+
		"\7\33\2\2\u074e\u0750\7:\2\2\u074f\u074e\3\2\2\2\u0750\u0753\3\2\2\2\u0751"+
		"\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0763\3\2\2\2\u0753\u0751\3\2"+
		"\2\2\u0754\u0756\7\f\2\2\u0755\u0757\7\32\2\2\u0756\u0755\3\2\2\2\u0756"+
		"\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758\u075a\7\33\2\2\u0759\u0758\3"+
		"\2\2\2\u0759\u075a\3\2\2\2\u075a\u075e\3\2\2\2\u075b\u075d\7:\2\2\u075c"+
		"\u075b\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2\2\2\u075e\u075f\3\2"+
		"\2\2\u075f\u0761\3\2\2\2\u0760\u075e\3\2\2\2\u0761\u0763\bT\1\2\u0762"+
		"\u074b\3\2\2\2\u0762\u0754\3\2\2\2\u0763\u00a7\3\2\2\2\u0764\u0768\5\u00aa"+
		"V\2\u0765\u0767\7:\2\2\u0766\u0765\3\2\2\2\u0767\u076a\3\2\2\2\u0768\u0766"+
		"\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076b"+
		"\u076d\5&\24\2\u076c\u076b\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076c\3\2"+
		"\2\2\u076e\u076f\3\2\2\2\u076f\u0773\3\2\2\2\u0770\u0772\7:\2\2\u0771"+
		"\u0770\3\2\2\2\u0772\u0775\3\2\2\2\u0773\u0771\3\2\2\2\u0773\u0774\3\2"+
		"\2\2\u0774\u0776\3\2\2\2\u0775\u0773\3\2\2\2\u0776\u0777\5\u00acW\2\u0777"+
		"\u00a9\3\2\2\2\u0778\u077b\7\34\2\2\u0779\u077b\bV\1\2\u077a\u0778\3\2"+
		"\2\2\u077a\u0779\3\2\2\2\u077b\u00ab\3\2\2\2\u077c\u077f\7\35\2\2\u077d"+
		"\u077f\bW\1\2\u077e\u077c\3\2\2\2\u077e\u077d\3\2\2\2\u077f\u00ad\3\2"+
		"\2\2\u0148\u00b2\u00b7\u00bd\u00c4\u00ca\u00d6\u00d8\u00dd\u00e2\u00e8"+
		"\u00eb\u00ee\u00f3\u00f5\u00fa\u0100\u0105\u010b\u0111\u0118\u0120\u0128"+
		"\u0132\u0142\u0146\u014b\u0151\u0158\u015c\u0161\u0167\u016f\u0173\u0178"+
		"\u017e\u0185\u0189\u018e\u0194\u019e\u01a2\u01a7\u01ad\u01b4\u01b8\u01bd"+
		"\u01c3\u01cd\u01d1\u01d6\u01dc\u01e3\u01e7\u01ec\u01f2\u01fb\u01ff\u0204"+
		"\u020a\u0212\u0216\u021b\u0221\u0228\u022c\u0231\u0237\u0240\u0244\u0249"+
		"\u024f\u0257\u025b\u0260\u0266\u026d\u0271\u0276\u027c\u0281\u0287\u028f"+
		"\u0293\u0297\u029a\u029e\u02a2\u02a5\u02a9\u02af\u02b3\u02b8\u02bd\u02c1"+
		"\u02c7\u02cb\u02d0\u02db\u02df\u02e3\u02f0\u02f4\u02f8\u02fb\u02ff\u0303"+
		"\u0307\u030d\u0311\u0315\u0318\u031c\u0320\u0324\u032c\u0330\u0333\u0338"+
		"\u033c\u0348\u034c\u0350\u0354\u0358\u035c\u0360\u0368\u036e\u0372\u0376"+
		"\u037a\u0380\u0384\u038a\u0393\u0397\u039b\u039f\u03a3\u03a9\u03ac\u03b2"+
		"\u03b5\u03b8\u03bd\u03c2\u03c7\u03cc\u03d2\u03d4\u03da\u03e9\u03f5\u03fc"+
		"\u0400\u0406\u040a\u040e\u0414\u0418\u041e\u0422\u0427\u042d\u0435\u0439"+
		"\u043c\u0441\u0445\u044b\u0451\u0455\u045d\u0463\u0466\u046c\u0470\u0476"+
		"\u047c\u0480\u0488\u048e\u0491\u0497\u04a0\u04a4\u04a8\u04ae\u04b2\u04b8"+
		"\u04bc\u04c0\u04c6\u04ca\u04d0\u04d4\u04d9\u04df\u04e7\u04eb\u04ee\u04f3"+
		"\u04f7\u04fd\u0503\u0507\u050f\u0515\u0518\u051e\u0522\u0528\u052e\u0532"+
		"\u053a\u0540\u0543\u0549\u054e\u0554\u0558\u055c\u0560\u0564\u0568\u056e"+
		"\u0574\u0577\u057c\u057e\u0583\u0587\u058b\u058f\u0593\u0597\u059b\u05a1"+
		"\u05a5\u05a9\u05ad\u05b4\u05b7\u05bd\u05c1\u05c4\u05c7\u05ca\u05cd\u05d5"+
		"\u05d9\u05de\u05e4\u05ea\u05ef\u05f5\u05fa\u0600\u0605\u0609\u060d\u0617"+
		"\u061b\u0621\u0625\u0629\u062f\u0635\u063a\u0641\u0645\u064b\u0651\u0656"+
		"\u065d\u0661\u0666\u066c\u0671\u0677\u067c\u0680\u0684\u068e\u0693\u0697"+
		"\u069b\u06a1\u06a5\u06ac\u06b3\u06b8\u06bd\u06c1\u06c5\u06ca\u06d2\u06d7"+
		"\u06dc\u06e0\u06e6\u06ec\u06f1\u06f8\u06fe\u0704\u0707\u070c\u0711\u0716"+
		"\u0719\u071d\u072a\u0738\u073e\u0743\u0751\u0756\u0759\u075e\u0762\u0768"+
		"\u076e\u0773\u077a\u077e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}