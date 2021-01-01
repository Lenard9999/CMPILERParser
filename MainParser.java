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
		RULE_assigned_expression = 20, RULE_variable_declaration_vartype = 21, 
		RULE_variable_declaration_no_vartype = 22, RULE_array_size = 23, RULE_array_variable = 24, 
		RULE_array_assign = 25, RULE_array_declaration_vartype = 26, RULE_array_declaration_no_vartype = 27, 
		RULE_print_statement = 28, RULE_value_print = 29, RULE_extended_value_print = 30, 
		RULE_scan_statement = 31, RULE_display_message_parameter = 32, RULE_value_parameter = 33, 
		RULE_constant_declaration = 34, RULE_return_statement = 35, RULE_return_value = 36, 
		RULE_expression = 37, RULE_value_expression = 38, RULE_comparison_statement = 39, 
		RULE_assignment_statement = 40, RULE_value_comparison = 41, RULE_conditional_statement = 42, 
		RULE_conditional_comparison_structure = 43, RULE_if_statement = 44, RULE_else_if_statement = 45, 
		RULE_else_statement = 46, RULE_loop_statement = 47, RULE_loop_structure = 48, 
		RULE_loop_variable_declaration = 49, RULE_loop_expression = 50, RULE_while_statement = 51, 
		RULE_for_statement = 52, RULE_function_calling = 53, RULE_function_calling_without_semicolon = 54, 
		RULE_function_parameters = 55, RULE_function_paremeters_value = 56, RULE_function_declaration = 57, 
		RULE_function_structure = 58, RULE_function_declaration_parameters = 59, 
		RULE_void_function = 60, RULE_non_void_function = 61, RULE_scoping_statement = 62, 
		RULE_main_function = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variable_type", "string", "number", "label", "label_words", 
			"first_operators", "second_operators", "operators", "logical_operators", 
			"relational_operators", "other_operators", "lexer_predefined_words", 
			"constant_words", "conditional_words", "loop_words", "simple_punctuations", 
			"symbol_words", "statements", "any_declaration", "assigned_expression", 
			"variable_declaration_vartype", "variable_declaration_no_vartype", "array_size", 
			"array_variable", "array_assign", "array_declaration_vartype", "array_declaration_no_vartype", 
			"print_statement", "value_print", "extended_value_print", "scan_statement", 
			"display_message_parameter", "value_parameter", "constant_declaration", 
			"return_statement", "return_value", "expression", "value_expression", 
			"comparison_statement", "assignment_statement", "value_comparison", "conditional_statement", 
			"conditional_comparison_structure", "if_statement", "else_if_statement", 
			"else_statement", "loop_statement", "loop_structure", "loop_variable_declaration", 
			"loop_expression", "while_statement", "for_statement", "function_calling", 
			"function_calling_without_semicolon", "function_parameters", "function_paremeters_value", 
			"function_declaration", "function_structure", "function_declaration_parameters", 
			"void_function", "non_void_function", "scoping_statement", "main_function"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(128);
				function_declaration();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			main_function();
			setState(135);
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
			setState(137);
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
			setState(139);
			match(T__0);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(140);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(141);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(142);
					label();
					}
					break;
				case 4:
					{
					setState(143);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(148);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(150);
					match(MINUS);
					}
				}

				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(153);
					match(DIGIT);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(159);
				match(DOT);
				setState(161); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(160);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(163); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(165);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(168);
					match(MINUS);
					}
				}

				setState(172); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(171);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(174); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(178);
				label_words();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(184);
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
				setState(187); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					label_words();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					label();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(206);
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
				setState(201);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(202);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(203);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(204);
				variable_type();
				}
				break;
			case DIGIT:
				{
				setState(205);
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
			setState(208);
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
			setState(210);
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(212);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(213);
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
			setState(216);
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
			setState(218);
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
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(220);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(221);
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
			setState(232);
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
				setState(224);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(225);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case TO:
			case WHILE:
				{
				setState(226);
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
				setState(227);
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
				setState(228);
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
				setState(229);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(230);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(231);
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
			setState(234);
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
			setState(236);
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
			setState(238);
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
			setState(240);
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
			setState(242);
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
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public TerminalNode LINECOMMENT() { return getToken(MainParser.LINECOMMENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
		}
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
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
		int _la;
		try {
			int _alt;
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				print_statement();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(245);
					match(LINECOMMENT);
					}
				}

				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						match(NEWLINE);
						}
						} 
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				scan_statement();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(255);
					match(LINECOMMENT);
					}
				}

				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						match(NEWLINE);
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				conditional_statement();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(265);
					match(LINECOMMENT);
					}
				}

				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(268);
						match(NEWLINE);
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				any_declaration();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(275);
					match(LINECOMMENT);
					}
				}

				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(278);
						match(NEWLINE);
						}
						} 
					}
					setState(283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				return_statement();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(285);
					match(LINECOMMENT);
					}
				}

				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(288);
						match(NEWLINE);
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				loop_statement();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(295);
					match(LINECOMMENT);
					}
				}

				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						match(NEWLINE);
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				scoping_statement();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(305);
					match(LINECOMMENT);
					}
				}

				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						match(NEWLINE);
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(314);
				function_calling();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(315);
					match(LINECOMMENT);
					}
				}

				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
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
		public Function_calling_without_semicolonContext function_calling_without_semicolon() {
			return getRuleContext(Function_calling_without_semicolonContext.class,0);
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
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(332);
				string();
				}
				break;
			case 2:
				{
				setState(333);
				number();
				}
				break;
			case 3:
				{
				setState(334);
				label();
				}
				break;
			case 4:
				{
				setState(335);
				expression(0);
				}
				break;
			case 5:
				{
				setState(336);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(337);
				function_calling_without_semicolon();
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

	public static class Variable_declaration_vartypeContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
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
		enterRule(_localctx, 42, RULE_variable_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			variable_type();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(341);
				match(WHITE_SPACE);
				}
			}

			setState(344);
			label();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==WHITE_SPACE) {
				{
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(345);
					match(WHITE_SPACE);
					}
				}

				setState(348);
				match(ASSIGN);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(349);
					match(WHITE_SPACE);
					}
				}

				setState(352);
				assigned_expression();
				}
			}

			setState(355);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
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
		enterRule(_localctx, 44, RULE_variable_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			label();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(358);
				match(WHITE_SPACE);
				}
			}

			setState(361);
			match(ASSIGN);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(362);
				match(WHITE_SPACE);
				}
			}

			setState(365);
			assigned_expression();
			setState(366);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		enterRule(_localctx, 48, RULE_array_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			label();
			setState(371);
			match(OPEN_BRACE);
			setState(372);
			array_size();
			setState(373);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
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
		enterRule(_localctx, 50, RULE_array_assign);
		int _la;
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(375);
					match(WHITE_SPACE);
					}
				}

				setState(378);
				match(ASSIGN);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(379);
					match(WHITE_SPACE);
					}
				}

				setState(382);
				match(CREATE);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(383);
					match(WHITE_SPACE);
					}
				}

				setState(386);
				variable_type();
				setState(387);
				match(OPEN_BRACE);
				setState(388);
				array_size();
				setState(389);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(391);
					match(WHITE_SPACE);
					}
				}

				setState(394);
				match(EQUAL);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(395);
					match(WHITE_SPACE);
					}
				}

				setState(398);
				match(CREATE);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(399);
					match(WHITE_SPACE);
					}
				}

				setState(402);
				variable_type();
				setState(403);
				match(OPEN_BRACE);
				setState(404);
				array_size();
				setState(405);
				match(CLOSE_BRACE);
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(408);
					match(WHITE_SPACE);
					}
				}

				setState(411);
				match(ASSIGN);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(412);
					match(WHITE_SPACE);
					}
				}

				setState(415);
				match(CREATE);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(416);
					match(WHITE_SPACE);
					}
				}

				setState(419);
				variable_type();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(420);
					match(OPEN_BRACE);
					}
				}

				setState(423);
				array_size();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(424);
					match(CLOSE_BRACE);
					}
				}

				notifyErrorListeners("Missing brace for array declaration");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(429);
					match(WHITE_SPACE);
					}
				}

				setState(432);
				match(ASSIGN);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(433);
					match(WHITE_SPACE);
					}
				}

				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(436);
					array_variable();
					}
					break;
				case 2:
					{
					setState(437);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(440);
					match(WHITE_SPACE);
					}
				}

				setState(443);
				match(EQUAL);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(444);
					match(WHITE_SPACE);
					}
				}

				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(447);
					array_variable();
					}
					break;
				case 2:
					{
					setState(448);
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
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
		enterRule(_localctx, 52, RULE_array_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			variable_type();
			setState(456);
			match(OPEN_BRACE);
			setState(457);
			match(CLOSE_BRACE);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(458);
				match(WHITE_SPACE);
				}
			}

			setState(461);
			label();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQUAL) | (1L << WHITE_SPACE))) != 0)) {
				{
				setState(462);
				array_assign();
				}
			}

			setState(465);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 54, RULE_array_declaration_no_vartype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			array_variable();
			setState(468);
			array_assign();
			setState(469);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 56, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(PRINT);
			setState(472);
			match(OPEN_PAREN);
			setState(473);
			value_print();
			setState(474);
			match(CLOSE_PAREN);
			setState(475);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_value_print);
		int _la;
		try {
			int _alt;
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				extended_value_print();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==WHITE_SPACE) {
					{
					{
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(478);
						match(WHITE_SPACE);
						}
					}

					setState(481);
					match(PLUS);
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(482);
						match(WHITE_SPACE);
						}
					}

					setState(485);
					extended_value_print();
					setState(487);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(486);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				extended_value_print();
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(496);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(495);
							match(WHITE_SPACE);
							}
						}

						setState(498);
						match(PLUS);
						setState(500);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(499);
							match(WHITE_SPACE);
							}
						}

						setState(502);
						extended_value_print();
						setState(504);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(503);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(510);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(511);
					match(PLUS);
					}
					}
					setState(514); 
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
		public Function_calling_without_semicolonContext function_calling_without_semicolon() {
			return getRuleContext(Function_calling_without_semicolonContext.class,0);
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
		enterRule(_localctx, 60, RULE_extended_value_print);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				function_calling_without_semicolon();
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
		public Display_message_parameterContext display_message_parameter() {
			return getRuleContext(Display_message_parameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public Value_parameterContext value_parameter() {
			return getRuleContext(Value_parameterContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
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
		enterRule(_localctx, 62, RULE_scan_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(SCAN);
			setState(527);
			match(OPEN_PAREN);
			setState(528);
			display_message_parameter();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(529);
				match(WHITE_SPACE);
				}
			}

			setState(532);
			match(COMMA);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(533);
				match(WHITE_SPACE);
				}
			}

			setState(536);
			value_parameter();
			setState(537);
			match(CLOSE_PAREN);
			setState(538);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_display_message_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			string();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_value_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(MainParser.CONSTANT, 0); }
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
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
		enterRule(_localctx, 68, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(CONSTANT);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(545);
				match(WHITE_SPACE);
				}
			}

			setState(548);
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
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
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
		enterRule(_localctx, 70, RULE_return_statement);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(RETURN);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(551);
					match(WHITE_SPACE);
					}
				}

				setState(554);
				return_value();
				setState(555);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(RETURN);
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(558);
					match(WHITE_SPACE);
					}
				}

				setState(561);
				variable_type();
				setState(562);
				match(SEMICOLON);
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
		public Function_calling_without_semicolonContext function_calling_without_semicolon() {
			return getRuleContext(Function_calling_without_semicolonContext.class,0);
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
		enterRule(_localctx, 72, RULE_return_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(567);
				string();
				}
				break;
			case 2:
				{
				setState(568);
				number();
				}
				break;
			case 3:
				{
				setState(569);
				label();
				}
				break;
			case 4:
				{
				setState(570);
				expression(0);
				}
				break;
			case 5:
				{
				setState(571);
				function_calling_without_semicolon();
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
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
				setState(575);
				value_expression();
				}
				break;
			case OPEN_PAREN:
				{
				setState(576);
				match(OPEN_PAREN);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(577);
					match(WHITE_SPACE);
					}
				}

				setState(580);
				expression(0);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(581);
					match(WHITE_SPACE);
					}
				}

				setState(584);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(614);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(588);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(590);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(589);
							match(WHITE_SPACE);
							}
						}

						{
						setState(592);
						operators();
						}
						setState(594);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(593);
							match(WHITE_SPACE);
							}
						}

						setState(596);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(598);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(600);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(599);
							match(WHITE_SPACE);
							}
						}

						{
						setState(602);
						operators();
						setState(604); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(603);
								operators();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(606); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						setState(609);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(608);
							match(WHITE_SPACE);
							}
						}

						setState(611);
						expression(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(618);
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
			unrollRecursionContexts(_parentctx);
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
		public Function_calling_without_semicolonContext function_calling_without_semicolon() {
			return getRuleContext(Function_calling_without_semicolonContext.class,0);
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
		enterRule(_localctx, 76, RULE_value_expression);
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				function_calling_without_semicolon();
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_comparison_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(625);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(626);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(627);
					match(NOT);
					}
				}

				setState(630);
				match(OPEN_PAREN);
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
				comparison_statement(0);
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
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(642);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(644);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(643);
							match(WHITE_SPACE);
							}
						}

						{
						setState(646);
						other_operators();
						}
						setState(648);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(647);
							match(WHITE_SPACE);
							}
						}

						setState(650);
						comparison_statement(4);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(652);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(654);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(653);
							match(WHITE_SPACE);
							}
						}

						{
						setState(656);
						other_operators();
						setState(658); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(657);
							other_operators();
							}
							}
							setState(660); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR))) != 0) );
						}
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
						comparison_statement(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		enterRule(_localctx, 80, RULE_assignment_statement);
		int _la;
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				label();
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
				match(EQUAL);
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(678);
					match(WHITE_SPACE);
					}
				}

				setState(683);
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
					setState(681);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(682);
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
				setState(685);
				label();
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
				match(ASSIGN);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(690);
					match(WHITE_SPACE);
					}
				}

				setState(695);
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
					setState(693);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(694);
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
		enterRule(_localctx, 82, RULE_value_comparison);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
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
		enterRule(_localctx, 84, RULE_conditional_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			if_statement();
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(707);
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
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(710);
					else_if_statement();
					setState(712);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(711);
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
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(719);
				else_statement();
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(720);
						match(NEWLINE);
						}
						} 
					}
					setState(725);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
		public TerminalNode NEWLINE() { return getToken(MainParser.NEWLINE, 0); }
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
		enterRule(_localctx, 86, RULE_conditional_comparison_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(OPEN_PAREN);
			setState(729);
			comparison_statement(0);
			setState(730);
			match(CLOSE_PAREN);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(731);
				match(WHITE_SPACE);
				}
			}

			setState(734);
			match(THEN);
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
			match(OPEN_BRACKET);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(739);
				match(NEWLINE);
				}
			}

			setState(743); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(742);
				statements();
				}
				}
				setState(745); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(747);
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
		enterRule(_localctx, 88, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(IF);
			setState(750);
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
		enterRule(_localctx, 90, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(ELSE_IF);
			setState(753);
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
		public TerminalNode NEWLINE() { return getToken(MainParser.NEWLINE, 0); }
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
		enterRule(_localctx, 92, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(ELSE);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(756);
				match(WHITE_SPACE);
				}
			}

			setState(759);
			match(THEN);
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
			match(OPEN_BRACKET);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(764);
				match(NEWLINE);
				}
			}

			setState(768); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(767);
				statements();
				}
				}
				setState(770); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(772);
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
		enterRule(_localctx, 94, RULE_loop_statement);
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
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
		public TerminalNode NEWLINE() { return getToken(MainParser.NEWLINE, 0); }
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
		enterRule(_localctx, 96, RULE_loop_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_TO) | (1L << DOWN_TO) | (1L << TO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			expression(0);
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
			match(OPEN_BRACKET);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(787);
				match(NEWLINE);
				}
			}

			setState(791); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(790);
				statements();
				}
				}
				setState(793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(795);
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
		enterRule(_localctx, 98, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(797);
					variable_type();
					setState(798);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(802);
				label();
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
				match(ASSIGN);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(807);
					match(WHITE_SPACE);
					}
				}

				setState(810);
				loop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				variable_type();
				setState(813);
				match(WHITE_SPACE);
				setState(814);
				label();
				notifyErrorListeners("Missing assignment operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
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
		enterRule(_localctx, 100, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(820);
				number();
				}
				break;
			case 2:
				{
				setState(821);
				label();
				}
				break;
			case 3:
				{
				setState(822);
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
		enterRule(_localctx, 102, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(WHILE);
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(826);
				match(WHITE_SPACE);
				}
			}

			setState(829);
			expression(0);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(830);
				match(WHITE_SPACE);
				}
			}

			setState(833);
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
		enterRule(_localctx, 104, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(FOR);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(836);
				match(WHITE_SPACE);
				}
			}

			setState(839);
			loop_variable_declaration();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(840);
				match(WHITE_SPACE);
				}
			}

			setState(843);
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
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
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
		enterRule(_localctx, 106, RULE_function_calling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			label();
			setState(846);
			match(OPEN_PAREN);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
				{
				setState(847);
				function_parameters();
				}
			}

			setState(850);
			match(CLOSE_PAREN);
			setState(851);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_calling_without_semicolonContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_calling_without_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_calling_without_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_calling_without_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_calling_without_semicolon(this);
		}
	}

	public final Function_calling_without_semicolonContext function_calling_without_semicolon() throws RecognitionException {
		Function_calling_without_semicolonContext _localctx = new Function_calling_without_semicolonContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_function_calling_without_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			label();
			setState(854);
			match(OPEN_PAREN);
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
				{
				setState(855);
				function_parameters();
				}
			}

			setState(858);
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
		enterRule(_localctx, 110, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			function_paremeters_value();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==WHITE_SPACE) {
				{
				{
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(861);
					match(WHITE_SPACE);
					}
				}

				setState(864);
				match(COMMA);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(865);
					match(WHITE_SPACE);
					}
				}

				setState(868);
				function_paremeters_value();
				}
				}
				setState(873);
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
		public Function_calling_without_semicolonContext function_calling_without_semicolon() {
			return getRuleContext(Function_calling_without_semicolonContext.class,0);
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
		enterRule(_localctx, 112, RULE_function_paremeters_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(874);
				function_calling_without_semicolon();
				}
				break;
			case 2:
				{
				setState(875);
				label();
				}
				break;
			case 3:
				{
				setState(876);
				expression(0);
				}
				break;
			case 4:
				{
				setState(877);
				string();
				}
				break;
			case 5:
				{
				setState(878);
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
		enterRule(_localctx, 114, RULE_function_declaration);
		try {
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
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
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
		enterRule(_localctx, 116, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			label();
			setState(886);
			match(OPEN_PAREN);
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(887);
				function_declaration_parameters();
				}
			}

			setState(890);
			match(CLOSE_PAREN);
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
			match(OPEN_BRACKET);
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(895);
				match(NEWLINE);
				}
			}

			setState(899); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(898);
				statements();
				}
				}
				setState(901); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(903);
			match(CLOSE_BRACKET);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(904);
				match(NEWLINE);
				}
				}
				setState(909);
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
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
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
		enterRule(_localctx, 118, RULE_function_declaration_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			variable_type();
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(911);
				match(OPEN_BRACE);
				setState(912);
				match(CLOSE_BRACE);
				}
			}

			setState(915);
			label();
			setState(923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(916);
					match(COMMA);
					setState(918);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(917);
						match(WHITE_SPACE);
						}
					}

					setState(920);
					function_declaration_parameters();
					}
					} 
				}
				setState(925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
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
		enterRule(_localctx, 120, RULE_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(FUNC);
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(927);
				match(WHITE_SPACE);
				}
			}

			setState(930);
			match(VOID);
			setState(931);
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
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
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
		enterRule(_localctx, 122, RULE_non_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(FUNC);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(934);
				match(WHITE_SPACE);
				}
			}

			setState(937);
			variable_type();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(938);
				match(OPEN_BRACE);
				setState(939);
				match(CLOSE_BRACE);
				}
			}

			setState(942);
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
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
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
		enterRule(_localctx, 124, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(OPEN_BRACKET);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(945);
				match(NEWLINE);
				}
			}

			setState(949); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(948);
				statements();
				}
				}
				setState(951); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(953);
				match(NEWLINE);
				}
			}

			setState(956);
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
		public TerminalNode MAIN() { return getToken(MainParser.MAIN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
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
		enterRule(_localctx, 126, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(MAIN);
			setState(959);
			match(OPEN_PAREN);
			setState(960);
			match(CLOSE_PAREN);
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(961);
				match(WHITE_SPACE);
				}
			}

			setState(964);
			match(OPEN_BRACKET);
			setState(966); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(965);
				statements();
				}
				}
				setState(968); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
			setState(970);
			match(CLOSE_BRACKET);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(971);
				match(NEWLINE);
				}
				}
				setState(976);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 39:
			return comparison_statement_sempred((Comparison_statementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u03d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4\u0093\n\4\r\4\16\4\u0094\3\4\3\4"+
		"\3\5\5\5\u009a\n\5\3\5\7\5\u009d\n\5\f\5\16\5\u00a0\13\5\3\5\3\5\6\5\u00a4"+
		"\n\5\r\5\16\5\u00a5\3\5\5\5\u00a9\n\5\3\5\5\5\u00ac\n\5\3\5\6\5\u00af"+
		"\n\5\r\5\16\5\u00b0\5\5\u00b3\n\5\3\6\7\6\u00b6\n\6\f\6\16\6\u00b9\13"+
		"\6\3\6\6\6\u00bc\n\6\r\6\16\6\u00bd\3\6\7\6\u00c1\n\6\f\6\16\6\u00c4\13"+
		"\6\3\6\7\6\u00c7\n\6\f\6\16\6\u00ca\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u00d1"+
		"\n\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u00d9\n\n\3\13\3\13\3\f\3\f\3\r\3\r\5"+
		"\r\u00e1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00eb\n\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00f9"+
		"\n\24\3\24\7\24\u00fc\n\24\f\24\16\24\u00ff\13\24\3\24\3\24\5\24\u0103"+
		"\n\24\3\24\7\24\u0106\n\24\f\24\16\24\u0109\13\24\3\24\3\24\5\24\u010d"+
		"\n\24\3\24\7\24\u0110\n\24\f\24\16\24\u0113\13\24\3\24\3\24\5\24\u0117"+
		"\n\24\3\24\7\24\u011a\n\24\f\24\16\24\u011d\13\24\3\24\3\24\5\24\u0121"+
		"\n\24\3\24\7\24\u0124\n\24\f\24\16\24\u0127\13\24\3\24\3\24\5\24\u012b"+
		"\n\24\3\24\7\24\u012e\n\24\f\24\16\24\u0131\13\24\3\24\3\24\5\24\u0135"+
		"\n\24\3\24\7\24\u0138\n\24\f\24\16\24\u013b\13\24\3\24\3\24\5\24\u013f"+
		"\n\24\3\24\7\24\u0142\n\24\f\24\16\24\u0145\13\24\5\24\u0147\n\24\3\25"+
		"\3\25\3\25\3\25\5\25\u014d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0155"+
		"\n\26\3\27\3\27\5\27\u0159\n\27\3\27\3\27\5\27\u015d\n\27\3\27\3\27\5"+
		"\27\u0161\n\27\3\27\5\27\u0164\n\27\3\27\3\27\3\30\3\30\5\30\u016a\n\30"+
		"\3\30\3\30\5\30\u016e\n\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\5\33\u017b\n\33\3\33\3\33\5\33\u017f\n\33\3\33\3\33\5\33\u0183"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018b\n\33\3\33\3\33\5\33\u018f"+
		"\n\33\3\33\3\33\5\33\u0193\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u019c\n\33\3\33\3\33\5\33\u01a0\n\33\3\33\3\33\5\33\u01a4\n\33\3\33\3"+
		"\33\5\33\u01a8\n\33\3\33\3\33\5\33\u01ac\n\33\3\33\3\33\3\33\5\33\u01b1"+
		"\n\33\3\33\3\33\5\33\u01b5\n\33\3\33\3\33\5\33\u01b9\n\33\3\33\5\33\u01bc"+
		"\n\33\3\33\3\33\5\33\u01c0\n\33\3\33\3\33\5\33\u01c4\n\33\3\33\3\33\5"+
		"\33\u01c8\n\33\3\34\3\34\3\34\3\34\5\34\u01ce\n\34\3\34\3\34\5\34\u01d2"+
		"\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\5\37\u01e2\n\37\3\37\3\37\5\37\u01e6\n\37\3\37\3\37\5\37\u01ea\n"+
		"\37\7\37\u01ec\n\37\f\37\16\37\u01ef\13\37\3\37\3\37\5\37\u01f3\n\37\3"+
		"\37\3\37\5\37\u01f7\n\37\3\37\3\37\5\37\u01fb\n\37\7\37\u01fd\n\37\f\37"+
		"\16\37\u0200\13\37\3\37\6\37\u0203\n\37\r\37\16\37\u0204\3\37\3\37\5\37"+
		"\u0209\n\37\3 \3 \3 \3 \5 \u020f\n \3!\3!\3!\3!\5!\u0215\n!\3!\3!\5!\u0219"+
		"\n!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\5$\u0225\n$\3$\3$\3%\3%\5%\u022b\n"+
		"%\3%\3%\3%\3%\3%\5%\u0232\n%\3%\3%\3%\3%\5%\u0238\n%\3&\3&\3&\3&\3&\5"+
		"&\u023f\n&\3\'\3\'\3\'\3\'\5\'\u0245\n\'\3\'\3\'\5\'\u0249\n\'\3\'\3\'"+
		"\5\'\u024d\n\'\3\'\3\'\5\'\u0251\n\'\3\'\3\'\5\'\u0255\n\'\3\'\3\'\3\'"+
		"\3\'\5\'\u025b\n\'\3\'\3\'\6\'\u025f\n\'\r\'\16\'\u0260\3\'\5\'\u0264"+
		"\n\'\3\'\3\'\3\'\7\'\u0269\n\'\f\'\16\'\u026c\13\'\3(\3(\3(\5(\u0271\n"+
		"(\3)\3)\3)\3)\5)\u0277\n)\3)\3)\5)\u027b\n)\3)\3)\5)\u027f\n)\3)\3)\5"+
		")\u0283\n)\3)\3)\5)\u0287\n)\3)\3)\5)\u028b\n)\3)\3)\3)\3)\5)\u0291\n"+
		")\3)\3)\6)\u0295\n)\r)\16)\u0296\3)\5)\u029a\n)\3)\3)\3)\7)\u029f\n)\f"+
		")\16)\u02a2\13)\3*\3*\5*\u02a6\n*\3*\3*\5*\u02aa\n*\3*\3*\5*\u02ae\n*"+
		"\3*\3*\5*\u02b2\n*\3*\3*\5*\u02b6\n*\3*\3*\5*\u02ba\n*\3*\3*\5*\u02be"+
		"\n*\3+\3+\3+\5+\u02c3\n+\3,\3,\5,\u02c7\n,\3,\3,\5,\u02cb\n,\7,\u02cd"+
		"\n,\f,\16,\u02d0\13,\3,\3,\7,\u02d4\n,\f,\16,\u02d7\13,\5,\u02d9\n,\3"+
		"-\3-\3-\3-\5-\u02df\n-\3-\3-\5-\u02e3\n-\3-\3-\5-\u02e7\n-\3-\6-\u02ea"+
		"\n-\r-\16-\u02eb\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\5\60\u02f8\n\60\3\60"+
		"\3\60\5\60\u02fc\n\60\3\60\3\60\5\60\u0300\n\60\3\60\6\60\u0303\n\60\r"+
		"\60\16\60\u0304\3\60\3\60\3\61\3\61\5\61\u030b\n\61\3\62\3\62\5\62\u030f"+
		"\n\62\3\62\3\62\5\62\u0313\n\62\3\62\3\62\5\62\u0317\n\62\3\62\6\62\u031a"+
		"\n\62\r\62\16\62\u031b\3\62\3\62\3\63\3\63\3\63\5\63\u0323\n\63\3\63\3"+
		"\63\5\63\u0327\n\63\3\63\3\63\5\63\u032b\n\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u0335\n\63\3\64\3\64\3\64\5\64\u033a\n\64\3\65\3"+
		"\65\5\65\u033e\n\65\3\65\3\65\5\65\u0342\n\65\3\65\3\65\3\66\3\66\5\66"+
		"\u0348\n\66\3\66\3\66\5\66\u034c\n\66\3\66\3\66\3\67\3\67\3\67\5\67\u0353"+
		"\n\67\3\67\3\67\3\67\38\38\38\58\u035b\n8\38\38\39\39\59\u0361\n9\39\3"+
		"9\59\u0365\n9\39\79\u0368\n9\f9\169\u036b\139\3:\3:\3:\3:\3:\5:\u0372"+
		"\n:\3;\3;\5;\u0376\n;\3<\3<\3<\5<\u037b\n<\3<\3<\5<\u037f\n<\3<\3<\5<"+
		"\u0383\n<\3<\6<\u0386\n<\r<\16<\u0387\3<\3<\7<\u038c\n<\f<\16<\u038f\13"+
		"<\3=\3=\3=\5=\u0394\n=\3=\3=\3=\5=\u0399\n=\3=\7=\u039c\n=\f=\16=\u039f"+
		"\13=\3>\3>\5>\u03a3\n>\3>\3>\3>\3?\3?\5?\u03aa\n?\3?\3?\3?\5?\u03af\n"+
		"?\3?\3?\3@\3@\5@\u03b5\n@\3@\6@\u03b8\n@\r@\16@\u03b9\3@\5@\u03bd\n@\3"+
		"@\3@\3A\3A\3A\3A\5A\u03c5\nA\3A\3A\6A\u03c9\nA\rA\16A\u03ca\3A\3A\7A\u03cf"+
		"\nA\fA\16A\u03d2\13A\3A\2\4LPB\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\17"+
		"\3\2\26\31\5\2\4\4\63\63\65\66\3\2&(\3\2$%\3\2)*\3\2 #\3\2\5\f\3\2\r\20"+
		"\3\2\21\25\3\2+\64\3\2\32\37\4\288::\3\2\22\24\2\u045c\2\u0085\3\2\2\2"+
		"\4\u008b\3\2\2\2\6\u008d\3\2\2\2\b\u00b2\3\2\2\2\n\u00b7\3\2\2\2\f\u00d0"+
		"\3\2\2\2\16\u00d2\3\2\2\2\20\u00d4\3\2\2\2\22\u00d8\3\2\2\2\24\u00da\3"+
		"\2\2\2\26\u00dc\3\2\2\2\30\u00e0\3\2\2\2\32\u00ea\3\2\2\2\34\u00ec\3\2"+
		"\2\2\36\u00ee\3\2\2\2 \u00f0\3\2\2\2\"\u00f2\3\2\2\2$\u00f4\3\2\2\2&\u0146"+
		"\3\2\2\2(\u014c\3\2\2\2*\u0154\3\2\2\2,\u0156\3\2\2\2.\u0167\3\2\2\2\60"+
		"\u0172\3\2\2\2\62\u0174\3\2\2\2\64\u01c7\3\2\2\2\66\u01c9\3\2\2\28\u01d5"+
		"\3\2\2\2:\u01d9\3\2\2\2<\u0208\3\2\2\2>\u020e\3\2\2\2@\u0210\3\2\2\2B"+
		"\u021e\3\2\2\2D\u0220\3\2\2\2F\u0222\3\2\2\2H\u0237\3\2\2\2J\u023e\3\2"+
		"\2\2L\u024c\3\2\2\2N\u0270\3\2\2\2P\u0282\3\2\2\2R\u02bd\3\2\2\2T\u02c2"+
		"\3\2\2\2V\u02c4\3\2\2\2X\u02da\3\2\2\2Z\u02ef\3\2\2\2\\\u02f2\3\2\2\2"+
		"^\u02f5\3\2\2\2`\u030a\3\2\2\2b\u030c\3\2\2\2d\u0334\3\2\2\2f\u0339\3"+
		"\2\2\2h\u033b\3\2\2\2j\u0345\3\2\2\2l\u034f\3\2\2\2n\u0357\3\2\2\2p\u035e"+
		"\3\2\2\2r\u0371\3\2\2\2t\u0375\3\2\2\2v\u0377\3\2\2\2x\u0390\3\2\2\2z"+
		"\u03a0\3\2\2\2|\u03a7\3\2\2\2~\u03b2\3\2\2\2\u0080\u03c0\3\2\2\2\u0082"+
		"\u0084\5t;\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089"+
		"\5\u0080A\2\u0089\u008a\7\2\2\3\u008a\3\3\2\2\2\u008b\u008c\t\2\2\2\u008c"+
		"\5\3\2\2\2\u008d\u0092\7\3\2\2\u008e\u0093\7\67\2\2\u008f\u0093\5\32\16"+
		"\2\u0090\u0093\5\n\6\2\u0091\u0093\7:\2\2\u0092\u008e\3\2\2\2\u0092\u008f"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\3"+
		"\2\2\u0097\7\3\2\2\2\u0098\u009a\7%\2\2\u0099\u0098\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009e\3\2\2\2\u009b\u009d\7\67\2\2\u009c\u009b\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7\60\2\2\u00a2\u00a4\7\67\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\7\4\2\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00b3\3\2\2\2\u00aa\u00ac\7%\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00af\7\67\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u0099\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b3"+
		"\t\3\2\2\2\u00b4\u00b6\5\f\7\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bc\t\3\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1\5\f"+
		"\7\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\5\n"+
		"\6\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\13\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d1\5\34\17"+
		"\2\u00cc\u00d1\5\36\20\2\u00cd\u00d1\5 \21\2\u00ce\u00d1\5\4\3\2\u00cf"+
		"\u00d1\7\67\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\r\3\2\2\2\u00d2\u00d3"+
		"\t\4\2\2\u00d3\17\3\2\2\2\u00d4\u00d5\t\5\2\2\u00d5\21\3\2\2\2\u00d6\u00d9"+
		"\5\16\b\2\u00d7\u00d9\5\20\t\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\23\3\2\2\2\u00da\u00db\t\6\2\2\u00db\25\3\2\2\2\u00dc\u00dd\t\7"+
		"\2\2\u00dd\27\3\2\2\2\u00de\u00e1\5\24\13\2\u00df\u00e1\5\26\f\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00eb\5\34\17"+
		"\2\u00e3\u00eb\5\36\20\2\u00e4\u00eb\5 \21\2\u00e5\u00eb\5\"\22\2\u00e6"+
		"\u00eb\5$\23\2\u00e7\u00eb\5\30\r\2\u00e8\u00eb\5\22\n\2\u00e9\u00eb\5"+
		"\4\3\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00e9\3\2\2\2\u00eb\33\3\2\2\2\u00ec\u00ed\t\b\2\2\u00ed\35"+
		"\3\2\2\2\u00ee\u00ef\t\t\2\2\u00ef\37\3\2\2\2\u00f0\u00f1\t\n\2\2\u00f1"+
		"!\3\2\2\2\u00f2\u00f3\t\13\2\2\u00f3#\3\2\2\2\u00f4\u00f5\t\f\2\2\u00f5"+
		"%\3\2\2\2\u00f6\u00f8\5:\36\2\u00f7\u00f9\79\2\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fd\3\2\2\2\u00fa\u00fc\78\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0147\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\5@!\2\u0101\u0103\79\2"+
		"\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0107\3\2\2\2\u0104\u0106"+
		"\78\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0147\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\5V"+
		",\2\u010b\u010d\79\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0111"+
		"\3\2\2\2\u010e\u0110\78\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0147\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0116\5(\25\2\u0115\u0117\79\2\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u011b\3\2\2\2\u0118\u011a\78\2\2\u0119\u0118\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u0147\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5H%\2\u011f\u0121\79\2"+
		"\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122\u0124"+
		"\78\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0147\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\5`"+
		"\61\2\u0129\u012b\79\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012f\3\2\2\2\u012c\u012e\78\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0147\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0134\5~@\2\u0133\u0135\79\2\2\u0134\u0133\3\2\2"+
		"\2\u0134\u0135\3\2\2\2\u0135\u0139\3\2\2\2\u0136\u0138\78\2\2\u0137\u0136"+
		"\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0147\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\5l\67\2\u013d\u013f\79"+
		"\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140"+
		"\u0142\78\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u00f6\3\2\2\2\u0146\u0100\3\2\2\2\u0146\u010a\3\2\2\2\u0146\u0114\3\2"+
		"\2\2\u0146\u011e\3\2\2\2\u0146\u0128\3\2\2\2\u0146\u0132\3\2\2\2\u0146"+
		"\u013c\3\2\2\2\u0147\'\3\2\2\2\u0148\u014d\5,\27\2\u0149\u014d\5.\30\2"+
		"\u014a\u014d\5\66\34\2\u014b\u014d\58\35\2\u014c\u0148\3\2\2\2\u014c\u0149"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d)\3\2\2\2\u014e"+
		"\u0155\5\6\4\2\u014f\u0155\5\b\5\2\u0150\u0155\5\n\6\2\u0151\u0155\5L"+
		"\'\2\u0152\u0155\5P)\2\u0153\u0155\5n8\2\u0154\u014e\3\2\2\2\u0154\u014f"+
		"\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155+\3\2\2\2\u0156\u0158\5\4\3\2\u0157\u0159\7:\2\2\u0158"+
		"\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0163\5\n"+
		"\6\2\u015b\u015d\7:\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\7,\2\2\u015f\u0161\7:\2\2\u0160\u015f\3\2\2"+
		"\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\5*\26\2\u0163\u015c"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\61\2\2"+
		"\u0166-\3\2\2\2\u0167\u0169\5\n\6\2\u0168\u016a\7:\2\2\u0169\u0168\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\7,\2\2\u016c"+
		"\u016e\7:\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0170\5*\26\2\u0170\u0171\7\61\2\2\u0171/\3\2\2\2\u0172\u0173"+
		"\5L\'\2\u0173\61\3\2\2\2\u0174\u0175\5\n\6\2\u0175\u0176\7\36\2\2\u0176"+
		"\u0177\5\60\31\2\u0177\u0178\7\37\2\2\u0178\63\3\2\2\2\u0179\u017b\7:"+
		"\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\7,\2\2\u017d\u017f\7:\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u0180\3\2\2\2\u0180\u0182\7\5\2\2\u0181\u0183\7:\2\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5\4\3\2\u0185"+
		"\u0186\7\36\2\2\u0186\u0187\5\60\31\2\u0187\u0188\7\37\2\2\u0188\u01c8"+
		"\3\2\2\2\u0189\u018b\7:\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\7-\2\2\u018d\u018f\7:\2\2\u018e\u018d\3\2\2"+
		"\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\7\5\2\2\u0191\u0193"+
		"\7:\2\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0195\5\4\3\2\u0195\u0196\7\36\2\2\u0196\u0197\5\60\31\2\u0197\u0198"+
		"\7\37\2\2\u0198\u0199\b\33\1\2\u0199\u01c8\3\2\2\2\u019a\u019c\7:\2\2"+
		"\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f"+
		"\7,\2\2\u019e\u01a0\7:\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a3\7\5\2\2\u01a2\u01a4\7:\2\2\u01a3\u01a2\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\5\4\3\2\u01a6"+
		"\u01a8\7\36\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3"+
		"\2\2\2\u01a9\u01ab\5\60\31\2\u01aa\u01ac\7\37\2\2\u01ab\u01aa\3\2\2\2"+
		"\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b\33\1\2\u01ae\u01c8"+
		"\3\2\2\2\u01af\u01b1\7:\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b4\7,\2\2\u01b3\u01b5\7:\2\2\u01b4\u01b3\3\2\2"+
		"\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b9\5\62\32\2\u01b7"+
		"\u01b9\5*\26\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01c8\3\2"+
		"\2\2\u01ba\u01bc\7:\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\7-\2\2\u01be\u01c0\7:\2\2\u01bf\u01be\3\2\2"+
		"\2\u01bf\u01c0\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01c4\5\62\32\2\u01c2"+
		"\u01c4\5*\26\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\b\33\1\2\u01c6\u01c8\3\2\2\2\u01c7\u017a\3\2\2\2\u01c7"+
		"\u018a\3\2\2\2\u01c7\u019b\3\2\2\2\u01c7\u01b0\3\2\2\2\u01c7\u01bb\3\2"+
		"\2\2\u01c8\65\3\2\2\2\u01c9\u01ca\5\4\3\2\u01ca\u01cb\7\36\2\2\u01cb\u01cd"+
		"\7\37\2\2\u01cc\u01ce\7:\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\5\n\6\2\u01d0\u01d2\5\64\33\2\u01d1\u01d0\3"+
		"\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\7\61\2\2\u01d4"+
		"\67\3\2\2\2\u01d5\u01d6\5\62\32\2\u01d6\u01d7\5\64\33\2\u01d7\u01d8\7"+
		"\61\2\2\u01d89\3\2\2\2\u01d9\u01da\7\b\2\2\u01da\u01db\7\32\2\2\u01db"+
		"\u01dc\5<\37\2\u01dc\u01dd\7\33\2\2\u01dd\u01de\7\61\2\2\u01de;\3\2\2"+
		"\2\u01df\u01ed\5> \2\u01e0\u01e2\7:\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\7$\2\2\u01e4\u01e6\7:\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\5>"+
		" \2\u01e8\u01ea\7:\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec"+
		"\3\2\2\2\u01eb\u01e1\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u0209\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01fe\5>"+
		" \2\u01f1\u01f3\7:\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f6\7$\2\2\u01f5\u01f7\7:\2\2\u01f6\u01f5\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\5> \2\u01f9\u01fb\7:\2"+
		"\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f2"+
		"\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0203\7$\2\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\b\37\1\2\u0207\u0209\3\2\2\2\u0208\u01df\3"+
		"\2\2\2\u0208\u01f0\3\2\2\2\u0209=\3\2\2\2\u020a\u020f\5\6\4\2\u020b\u020f"+
		"\5\n\6\2\u020c\u020f\5L\'\2\u020d\u020f\5n8\2\u020e\u020a\3\2\2\2\u020e"+
		"\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f?\3\2\2\2"+
		"\u0210\u0211\7\t\2\2\u0211\u0212\7\32\2\2\u0212\u0214\5B\"\2\u0213\u0215"+
		"\7:\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\7\62\2\2\u0217\u0219\7:\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u021b\5D#\2\u021b\u021c\7\33\2\2\u021c"+
		"\u021d\7\61\2\2\u021dA\3\2\2\2\u021e\u021f\5\6\4\2\u021fC\3\2\2\2\u0220"+
		"\u0221\5L\'\2\u0221E\3\2\2\2\u0222\u0224\7\6\2\2\u0223\u0225\7:\2\2\u0224"+
		"\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\5("+
		"\25\2\u0227G\3\2\2\2\u0228\u022a\7\7\2\2\u0229\u022b\7:\2\2\u022a\u0229"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\5J&\2\u022d"+
		"\u022e\7\61\2\2\u022e\u0238\3\2\2\2\u022f\u0231\7\7\2\2\u0230\u0232\7"+
		":\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0234\5\4\3\2\u0234\u0235\7\61\2\2\u0235\u0236\b%\1\2\u0236\u0238\3\2"+
		"\2\2\u0237\u0228\3\2\2\2\u0237\u022f\3\2\2\2\u0238I\3\2\2\2\u0239\u023f"+
		"\5\6\4\2\u023a\u023f\5\b\5\2\u023b\u023f\5\n\6\2\u023c\u023f\5L\'\2\u023d"+
		"\u023f\5n8\2\u023e\u0239\3\2\2\2\u023e\u023a\3\2\2\2\u023e\u023b\3\2\2"+
		"\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023fK\3\2\2\2\u0240\u0241"+
		"\b\'\1\2\u0241\u024d\5N(\2\u0242\u0244\7\32\2\2\u0243\u0245\7:\2\2\u0244"+
		"\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\5L"+
		"\'\2\u0247\u0249\7:\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\7\33\2\2\u024b\u024d\3\2\2\2\u024c\u0240\3"+
		"\2\2\2\u024c\u0242\3\2\2\2\u024d\u026a\3\2\2\2\u024e\u0250\f\5\2\2\u024f"+
		"\u0251\7:\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0254\5\22\n\2\u0253\u0255\7:\2\2\u0254\u0253\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\5L\'\6\u0257\u0269\3\2"+
		"\2\2\u0258\u025a\f\4\2\2\u0259\u025b\7:\2\2\u025a\u0259\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\5\22\n\2\u025d\u025f\5"+
		"\22\n\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0264\7:\2\2\u0263\u0262\3\2"+
		"\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\5L\'\5\u0266"+
		"\u0267\b\'\1\2\u0267\u0269\3\2\2\2\u0268\u024e\3\2\2\2\u0268\u0258\3\2"+
		"\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"M\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u0271\5\b\5\2\u026e\u0271\5\n\6\2"+
		"\u026f\u0271\5n8\2\u0270\u026d\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u026f"+
		"\3\2\2\2\u0271O\3\2\2\2\u0272\u0273\b)\1\2\u0273\u0283\5T+\2\u0274\u0283"+
		"\5R*\2\u0275\u0277\7+\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u027a\7\32\2\2\u0279\u027b\7:\2\2\u027a\u0279\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\5P)\2\u027d\u027f"+
		"\7:\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0281\7\33\2\2\u0281\u0283\3\2\2\2\u0282\u0272\3\2\2\2\u0282\u0274\3"+
		"\2\2\2\u0282\u0276\3\2\2\2\u0283\u02a0\3\2\2\2\u0284\u0286\f\5\2\2\u0285"+
		"\u0287\7:\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u028a\5\30\r\2\u0289\u028b\7:\2\2\u028a\u0289\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\5P)\6\u028d\u029f\3\2\2"+
		"\2\u028e\u0290\f\4\2\2\u028f\u0291\7:\2\2\u0290\u028f\3\2\2\2\u0290\u0291"+
		"\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\5\30\r\2\u0293\u0295\5\30\r\2"+
		"\u0294\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u029a\7:\2\2\u0299\u0298\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\5P)\5\u029c\u029d\b)\1"+
		"\2\u029d\u029f\3\2\2\2\u029e\u0284\3\2\2\2\u029e\u028e\3\2\2\2\u029f\u02a2"+
		"\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1Q\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3\u02a5\5\n\6\2\u02a4\u02a6\7:\2\2\u02a5\u02a4\3\2"+
		"\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\7-\2\2\u02a8"+
		"\u02aa\7:\2\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ad\3\2"+
		"\2\2\u02ab\u02ae\5T+\2\u02ac\u02ae\5\6\4\2\u02ad\u02ab\3\2\2\2\u02ad\u02ac"+
		"\3\2\2\2\u02ae\u02be\3\2\2\2\u02af\u02b1\5\n\6\2\u02b0\u02b2\7:\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\7,"+
		"\2\2\u02b4\u02b6\7:\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b9\3\2\2\2\u02b7\u02ba\5T+\2\u02b8\u02ba\5\6\4\2\u02b9\u02b7\3\2\2"+
		"\2\u02b9\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\b*\1\2\u02bc\u02be"+
		"\3\2\2\2\u02bd\u02a3\3\2\2\2\u02bd\u02af\3\2\2\2\u02beS\3\2\2\2\u02bf"+
		"\u02c3\5\n\6\2\u02c0\u02c3\5\b\5\2\u02c1\u02c3\5L\'\2\u02c2\u02bf\3\2"+
		"\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3U\3\2\2\2\u02c4\u02c6"+
		"\5Z.\2\u02c5\u02c7\t\r\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02ce\3\2\2\2\u02c8\u02ca\5\\/\2\u02c9\u02cb\t\r\2\2\u02ca\u02c9\3\2"+
		"\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d8\3\2"+
		"\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d5\5^\60\2\u02d2\u02d4\78\2\2\u02d3"+
		"\u02d2\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d1\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9W\3\2\2\2\u02da\u02db\7\32\2\2\u02db\u02dc\5P)\2\u02dc"+
		"\u02de\7\33\2\2\u02dd\u02df\7:\2\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\7\20\2\2\u02e1\u02e3\7:\2\2\u02e2"+
		"\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\7\34"+
		"\2\2\u02e5\u02e7\78\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e9\3\2\2\2\u02e8\u02ea\5&\24\2\u02e9\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"\u02ee\7\35\2\2\u02eeY\3\2\2\2\u02ef\u02f0\7\r\2\2\u02f0\u02f1\5X-\2\u02f1"+
		"[\3\2\2\2\u02f2\u02f3\7\17\2\2\u02f3\u02f4\5X-\2\u02f4]\3\2\2\2\u02f5"+
		"\u02f7\7\16\2\2\u02f6\u02f8\7:\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\7\20\2\2\u02fa\u02fc\7:\2\2\u02fb"+
		"\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7\34"+
		"\2\2\u02fe\u0300\78\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0302\3\2\2\2\u0301\u0303\5&\24\2\u0302\u0301\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0307\7\35\2\2\u0307_\3\2\2\2\u0308\u030b\5h\65\2\u0309\u030b\5j\66\2"+
		"\u030a\u0308\3\2\2\2\u030a\u0309\3\2\2\2\u030ba\3\2\2\2\u030c\u030e\t"+
		"\16\2\2\u030d\u030f\7:\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0312\5L\'\2\u0311\u0313\7:\2\2\u0312\u0311\3\2\2"+
		"\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\7\34\2\2\u0315"+
		"\u0317\78\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2"+
		"\2\2\u0318\u031a\5&\24\2\u0319\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\7\35"+
		"\2\2\u031ec\3\2\2\2\u031f\u0320\5\4\3\2\u0320\u0321\7:\2\2\u0321\u0323"+
		"\3\2\2\2\u0322\u031f\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0326\5\n\6\2\u0325\u0327\7:\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2"+
		"\2\2\u0327\u0328\3\2\2\2\u0328\u032a\7,\2\2\u0329\u032b\7:\2\2\u032a\u0329"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\5f\64\2\u032d"+
		"\u0335\3\2\2\2\u032e\u032f\5\4\3\2\u032f\u0330\7:\2\2\u0330\u0331\5\n"+
		"\6\2\u0331\u0332\b\63\1\2\u0332\u0335\3\2\2\2\u0333\u0335\5L\'\2\u0334"+
		"\u0322\3\2\2\2\u0334\u032e\3\2\2\2\u0334\u0333\3\2\2\2\u0335e\3\2\2\2"+
		"\u0336\u033a\5\b\5\2\u0337\u033a\5\n\6\2\u0338\u033a\5L\'\2\u0339\u0336"+
		"\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u0338\3\2\2\2\u033ag\3\2\2\2\u033b"+
		"\u033d\7\25\2\2\u033c\u033e\7:\2\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033e\u033f\3\2\2\2\u033f\u0341\5L\'\2\u0340\u0342\7:\2\2\u0341\u0340"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\5b\62\2\u0344"+
		"i\3\2\2\2\u0345\u0347\7\21\2\2\u0346\u0348\7:\2\2\u0347\u0346\3\2\2\2"+
		"\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\5d\63\2\u034a\u034c"+
		"\7:\2\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u034e\5b\62\2\u034ek\3\2\2\2\u034f\u0350\5\n\6\2\u0350\u0352\7\32\2\2"+
		"\u0351\u0353\5p9\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0355\7\33\2\2\u0355\u0356\7\61\2\2\u0356m\3\2\2\2\u0357"+
		"\u0358\5\n\6\2\u0358\u035a\7\32\2\2\u0359\u035b\5p9\2\u035a\u0359\3\2"+
		"\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\7\33\2\2\u035d"+
		"o\3\2\2\2\u035e\u0369\5r:\2\u035f\u0361\7:\2\2\u0360\u035f\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\7\62\2\2\u0363\u0365\7"+
		":\2\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0368\5r:\2\u0367\u0360\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2"+
		"\2\u0369\u036a\3\2\2\2\u036aq\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u0372"+
		"\5n8\2\u036d\u0372\5\n\6\2\u036e\u0372\5L\'\2\u036f\u0372\5\6\4\2\u0370"+
		"\u0372\5\b\5\2\u0371\u036c\3\2\2\2\u0371\u036d\3\2\2\2\u0371\u036e\3\2"+
		"\2\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2\2\2\u0372s\3\2\2\2\u0373\u0376"+
		"\5z>\2\u0374\u0376\5|?\2\u0375\u0373\3\2\2\2\u0375\u0374\3\2\2\2\u0376"+
		"u\3\2\2\2\u0377\u0378\5\n\6\2\u0378\u037a\7\32\2\2\u0379\u037b\5x=\2\u037a"+
		"\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\7\33"+
		"\2\2\u037d\u037f\7:\2\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u0382\7\34\2\2\u0381\u0383\78\2\2\u0382\u0381\3\2"+
		"\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0386\5&\24\2\u0385"+
		"\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2"+
		"\2\2\u0388\u0389\3\2\2\2\u0389\u038d\7\35\2\2\u038a\u038c\78\2\2\u038b"+
		"\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038ew\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0393\5\4\3\2\u0391\u0392"+
		"\7\36\2\2\u0392\u0394\7\37\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2"+
		"\u0394\u0395\3\2\2\2\u0395\u039d\5\n\6\2\u0396\u0398\7\62\2\2\u0397\u0399"+
		"\7:\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u039c\5x=\2\u039b\u0396\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2"+
		"\2\u039d\u039e\3\2\2\2\u039ey\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a2"+
		"\7\13\2\2\u03a1\u03a3\7:\2\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u03a5\7\n\2\2\u03a5\u03a6\5v<\2\u03a6{\3\2\2\2\u03a7"+
		"\u03a9\7\13\2\2\u03a8\u03aa\7:\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2"+
		"\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ae\5\4\3\2\u03ac\u03ad\7\36\2\2\u03ad"+
		"\u03af\7\37\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3"+
		"\2\2\2\u03b0\u03b1\5v<\2\u03b1}\3\2\2\2\u03b2\u03b4\7\34\2\2\u03b3\u03b5"+
		"\78\2\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6"+
		"\u03b8\5&\24\2\u03b7\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03bd\78\2\2\u03bc"+
		"\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\7\35"+
		"\2\2\u03bf\177\3\2\2\2\u03c0\u03c1\7\f\2\2\u03c1\u03c2\7\32\2\2\u03c2"+
		"\u03c4\7\33\2\2\u03c3\u03c5\7:\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2"+
		"\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\7\34\2\2\u03c7\u03c9\5&\24\2\u03c8"+
		"\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2"+
		"\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03d0\7\35\2\2\u03cd\u03cf\78\2\2\u03ce"+
		"\u03cd\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2"+
		"\2\2\u03d1\u0081\3\2\2\2\u03d2\u03d0\3\2\2\2\u00a4\u0085\u0092\u0094\u0099"+
		"\u009e\u00a5\u00a8\u00ab\u00b0\u00b2\u00b7\u00bd\u00c2\u00c8\u00d0\u00d8"+
		"\u00e0\u00ea\u00f8\u00fd\u0102\u0107\u010c\u0111\u0116\u011b\u0120\u0125"+
		"\u012a\u012f\u0134\u0139\u013e\u0143\u0146\u014c\u0154\u0158\u015c\u0160"+
		"\u0163\u0169\u016d\u017a\u017e\u0182\u018a\u018e\u0192\u019b\u019f\u01a3"+
		"\u01a7\u01ab\u01b0\u01b4\u01b8\u01bb\u01bf\u01c3\u01c7\u01cd\u01d1\u01e1"+
		"\u01e5\u01e9\u01ed\u01f2\u01f6\u01fa\u01fe\u0204\u0208\u020e\u0214\u0218"+
		"\u0224\u022a\u0231\u0237\u023e\u0244\u0248\u024c\u0250\u0254\u025a\u0260"+
		"\u0263\u0268\u026a\u0270\u0276\u027a\u027e\u0282\u0286\u028a\u0290\u0296"+
		"\u0299\u029e\u02a0\u02a5\u02a9\u02ad\u02b1\u02b5\u02b9\u02bd\u02c2\u02c6"+
		"\u02ca\u02ce\u02d5\u02d8\u02de\u02e2\u02e6\u02eb\u02f7\u02fb\u02ff\u0304"+
		"\u030a\u030e\u0312\u0316\u031b\u0322\u0326\u032a\u0334\u0339\u033d\u0341"+
		"\u0347\u034b\u0352\u035a\u0360\u0364\u0369\u0371\u0375\u037a\u037e\u0382"+
		"\u0387\u038d\u0393\u0398\u039d\u03a2\u03a9\u03ae\u03b4\u03b9\u03bc\u03c4"+
		"\u03ca\u03d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}