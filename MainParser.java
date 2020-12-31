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
		FUNC=9, IF=10, ELSE=11, ELSE_IF=12, THEN=13, FOR=14, UP_TO=15, DOWN_TO=16, 
		WHILE=17, INT_DEC=18, BOOLEAN_DEC=19, FLOAT_DEC=20, STRING_DEC=21, OPEN_PAREN=22, 
		CLOSE_PAREN=23, OPEN_BRACKET=24, CLOSE_BRACKET=25, OPEN_BRACE=26, CLOSE_BRACE=27, 
		LESS=28, LESSQEUAL=29, GREATER=30, GREATEREQUAL=31, PLUS=32, MINUS=33, 
		MULTI=34, DIV=35, MOD=36, ANDAND=37, OROR=38, NOT=39, ASSIGN=40, EQUAL=41, 
		QUESTION=42, COLON=43, DOT=44, SEMICOLON=45, COMMA=46, UNDERSCORE=47, 
		SINGLE_QUOTE=48, LOWERCASE=49, UPPERCASE=50, DIGIT=51, NEWLINE=52, LINECOMMENT=53, 
		WHITE_SPACE=54;
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
		RULE_void_function = 60, RULE_non_void_function = 61, RULE_scoping_statement = 62;
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
			"void_function", "non_void_function", "scoping_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'f'", "'create'", "'constant'", "'return'", "'print'", 
			"'scan'", "'void'", "'func'", "'if'", "'else'", "'else if'", "'then'", 
			"'for'", "'up to'", "'down to'", "'while'", "'int'", "'bool'", "'float'", 
			"'String'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", 
			"'='", "'=='", "'?'", "':'", "'.'", "';'", "','", "'_'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", 
			"FUNC", "IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", "WHILE", 
			"INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "LESS", 
			"LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", "COLON", 
			"DOT", "SEMICOLON", "COMMA", "UNDERSCORE", "SINGLE_QUOTE", "LOWERCASE", 
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
		public Scoping_statementContext scoping_statement() {
			return getRuleContext(Scoping_statementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MainParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			scoping_statement();
			setState(127);
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
			setState(129);
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
			setState(131);
			match(T__0);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(132);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(133);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(134);
					label();
					}
					break;
				case 4:
					{
					setState(135);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(140);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(142);
					match(MINUS);
					}
				}

				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(145);
					match(DIGIT);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(151);
				match(DOT);
				setState(153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(155); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(157);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(160);
					match(MINUS);
					}
				}

				setState(164); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(163);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(166); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				{
				setState(170);
				label_words();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(176);
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
				setState(179); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					label_words();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					label();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
				{
				setState(193);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(194);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(195);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(196);
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
			setState(199);
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
			setState(201);
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
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(203);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(204);
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
			setState(207);
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
			setState(209);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(211);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(212);
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
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
				{
				setState(215);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(216);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(217);
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
				setState(218);
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
				setState(219);
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
				setState(220);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(221);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(222);
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
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC))) != 0)) ) {
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
			setState(227);
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
			setState(229);
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
			setState(231);
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
			setState(233);
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
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				print_statement();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(236);
					match(LINECOMMENT);
					}
				}

				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(239);
						match(NEWLINE);
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				scan_statement();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(246);
					match(LINECOMMENT);
					}
				}

				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						match(NEWLINE);
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				conditional_statement();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(256);
					match(LINECOMMENT);
					}
				}

				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(259);
						match(NEWLINE);
						}
						} 
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				any_declaration();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(266);
					match(LINECOMMENT);
					}
				}

				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						match(NEWLINE);
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				return_statement();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(276);
					match(LINECOMMENT);
					}
				}

				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(279);
						match(NEWLINE);
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				loop_statement();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(286);
					match(LINECOMMENT);
					}
				}

				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						match(NEWLINE);
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
				scoping_statement();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINECOMMENT) {
					{
					setState(296);
					match(LINECOMMENT);
					}
				}

				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						match(NEWLINE);
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
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
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(313);
				string();
				}
				break;
			case 2:
				{
				setState(314);
				number();
				}
				break;
			case 3:
				{
				setState(315);
				label();
				}
				break;
			case 4:
				{
				setState(316);
				expression(0);
				}
				break;
			case 5:
				{
				setState(317);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(318);
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
			setState(321);
			variable_type();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(322);
				match(WHITE_SPACE);
				}
			}

			setState(325);
			label();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==WHITE_SPACE) {
				{
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(326);
					match(WHITE_SPACE);
					}
				}

				setState(329);
				match(ASSIGN);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(330);
					match(WHITE_SPACE);
					}
				}

				setState(333);
				assigned_expression();
				}
			}

			setState(336);
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
			setState(338);
			label();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(339);
				match(WHITE_SPACE);
				}
			}

			setState(342);
			match(ASSIGN);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(343);
				match(WHITE_SPACE);
				}
			}

			setState(346);
			assigned_expression();
			setState(347);
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
			setState(349);
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
			setState(351);
			label();
			setState(352);
			match(OPEN_BRACE);
			setState(353);
			array_size();
			setState(354);
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
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(356);
					match(WHITE_SPACE);
					}
				}

				setState(359);
				match(ASSIGN);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(360);
					match(WHITE_SPACE);
					}
				}

				setState(363);
				match(CREATE);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(364);
					match(WHITE_SPACE);
					}
				}

				setState(367);
				variable_type();
				setState(368);
				match(OPEN_BRACE);
				setState(369);
				array_size();
				setState(370);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(372);
					match(WHITE_SPACE);
					}
				}

				setState(375);
				match(EQUAL);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(376);
					match(WHITE_SPACE);
					}
				}

				setState(379);
				match(CREATE);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(380);
					match(WHITE_SPACE);
					}
				}

				setState(383);
				variable_type();
				setState(384);
				match(OPEN_BRACE);
				setState(385);
				array_size();
				setState(386);
				match(CLOSE_BRACE);
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(389);
					match(WHITE_SPACE);
					}
				}

				setState(392);
				match(ASSIGN);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(393);
					match(WHITE_SPACE);
					}
				}

				setState(396);
				match(CREATE);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(397);
					match(WHITE_SPACE);
					}
				}

				setState(400);
				variable_type();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(401);
					match(OPEN_BRACE);
					}
				}

				setState(404);
				array_size();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(405);
					match(CLOSE_BRACE);
					}
				}

				notifyErrorListeners("Missing brace for array declaration");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(410);
					match(WHITE_SPACE);
					}
				}

				setState(413);
				match(ASSIGN);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(414);
					match(WHITE_SPACE);
					}
				}

				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(417);
					array_variable();
					}
					break;
				case 2:
					{
					setState(418);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(421);
					match(WHITE_SPACE);
					}
				}

				setState(424);
				match(EQUAL);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(425);
					match(WHITE_SPACE);
					}
				}

				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(428);
					array_variable();
					}
					break;
				case 2:
					{
					setState(429);
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
			setState(436);
			variable_type();
			setState(437);
			match(OPEN_BRACE);
			setState(438);
			match(CLOSE_BRACE);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(439);
				match(WHITE_SPACE);
				}
			}

			setState(442);
			label();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQUAL) | (1L << WHITE_SPACE))) != 0)) {
				{
				setState(443);
				array_assign();
				}
			}

			setState(446);
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
			setState(448);
			array_variable();
			setState(449);
			array_assign();
			setState(450);
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
			setState(452);
			match(PRINT);
			setState(453);
			match(OPEN_PAREN);
			setState(454);
			value_print();
			setState(455);
			match(CLOSE_PAREN);
			setState(456);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			extended_value_print();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==WHITE_SPACE) {
				{
				{
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(459);
					match(WHITE_SPACE);
					}
				}

				setState(462);
				match(PLUS);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(463);
					match(WHITE_SPACE);
					}
				}

				setState(466);
				extended_value_print();
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(467);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				}
				setState(474);
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
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
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
			setState(481);
			match(SCAN);
			setState(482);
			match(OPEN_PAREN);
			setState(483);
			display_message_parameter();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(484);
				match(WHITE_SPACE);
				}
			}

			setState(487);
			match(COMMA);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(488);
				match(WHITE_SPACE);
				}
			}

			setState(491);
			value_parameter();
			setState(492);
			match(CLOSE_PAREN);
			setState(493);
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
			setState(495);
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
			setState(497);
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
			setState(499);
			match(CONSTANT);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(500);
				match(WHITE_SPACE);
				}
			}

			setState(503);
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
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(RETURN);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(506);
					match(WHITE_SPACE);
					}
				}

				setState(509);
				return_value();
				setState(510);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(RETURN);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(513);
					match(WHITE_SPACE);
					}
				}

				setState(516);
				variable_type();
				setState(517);
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
		enterRule(_localctx, 72, RULE_return_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(522);
				string();
				}
				break;
			case 2:
				{
				setState(523);
				number();
				}
				break;
			case 3:
				{
				setState(524);
				label();
				}
				break;
			case 4:
				{
				setState(525);
				expression(0);
				}
				break;
			case 5:
				{
				setState(526);
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
			setState(541);
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
			case DOT:
			case UNDERSCORE:
			case LOWERCASE:
			case UPPERCASE:
			case DIGIT:
				{
				setState(530);
				value_expression();
				}
				break;
			case OPEN_PAREN:
				{
				setState(531);
				match(OPEN_PAREN);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(532);
					match(WHITE_SPACE);
					}
				}

				setState(535);
				expression(0);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(536);
					match(WHITE_SPACE);
					}
				}

				setState(539);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(569);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(543);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(545);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(544);
							match(WHITE_SPACE);
							}
						}

						{
						setState(547);
						operators();
						}
						setState(549);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(548);
							match(WHITE_SPACE);
							}
						}

						setState(551);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(553);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(555);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(554);
							match(WHITE_SPACE);
							}
						}

						{
						setState(557);
						operators();
						setState(559); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(558);
								operators();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(561); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						setState(564);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(563);
							match(WHITE_SPACE);
							}
						}

						setState(566);
						expression(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
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
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(580);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(581);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(582);
					match(NOT);
					}
				}

				setState(585);
				match(OPEN_PAREN);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(586);
					match(WHITE_SPACE);
					}
				}

				setState(589);
				comparison_statement(0);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(590);
					match(WHITE_SPACE);
					}
				}

				setState(593);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(623);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(597);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(599);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(598);
							match(WHITE_SPACE);
							}
						}

						{
						setState(601);
						other_operators();
						}
						setState(603);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(602);
							match(WHITE_SPACE);
							}
						}

						setState(605);
						comparison_statement(4);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(607);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(609);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(608);
							match(WHITE_SPACE);
							}
						}

						{
						setState(611);
						other_operators();
						setState(613); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(612);
							other_operators();
							}
							}
							setState(615); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR))) != 0) );
						}
						setState(618);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(617);
							match(WHITE_SPACE);
							}
						}

						setState(620);
						comparison_statement(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				label();
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(629);
					match(WHITE_SPACE);
					}
				}

				setState(632);
				match(EQUAL);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(633);
					match(WHITE_SPACE);
					}
				}

				setState(638);
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
				case MINUS:
				case DOT:
				case UNDERSCORE:
				case LOWERCASE:
				case UPPERCASE:
				case DIGIT:
					{
					setState(636);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(637);
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
				setState(640);
				label();
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
				match(ASSIGN);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(645);
					match(WHITE_SPACE);
					}
				}

				setState(650);
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
				case MINUS:
				case DOT:
				case UNDERSCORE:
				case LOWERCASE:
				case UPPERCASE:
				case DIGIT:
					{
					setState(648);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(649);
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
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
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
			setState(661);
			if_statement();
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(662);
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
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(665);
					else_if_statement();
					setState(667);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(666);
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
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(674);
				else_statement();
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(675);
						match(NEWLINE);
						}
						} 
					}
					setState(680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
			setState(683);
			match(OPEN_PAREN);
			setState(684);
			comparison_statement(0);
			setState(685);
			match(CLOSE_PAREN);
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
			match(THEN);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(690);
				match(WHITE_SPACE);
				}
			}

			setState(693);
			match(OPEN_BRACKET);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(694);
				match(NEWLINE);
				}
			}

			setState(698); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(697);
				statements();
				}
				}
				setState(700); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(702);
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
			setState(704);
			match(IF);
			setState(705);
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
			setState(707);
			match(ELSE_IF);
			setState(708);
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
			setState(710);
			match(ELSE);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(711);
				match(WHITE_SPACE);
				}
			}

			setState(714);
			match(THEN);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(715);
				match(WHITE_SPACE);
				}
			}

			setState(718);
			match(OPEN_BRACKET);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(719);
				match(NEWLINE);
				}
			}

			setState(723); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(722);
				statements();
				}
				}
				setState(725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(727);
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
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
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
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				while_statement();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public TerminalNode UP_TO() { return getToken(MainParser.UP_TO, 0); }
		public TerminalNode DOWN_TO() { return getToken(MainParser.DOWN_TO, 0); }
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
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
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				_la = _input.LA(1);
				if ( !(_la==UP_TO || _la==DOWN_TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				expression(0);
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
				match(OPEN_BRACKET);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(742);
					match(NEWLINE);
					}
				}

				setState(746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(745);
					statements();
					}
					}
					setState(748); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
				setState(750);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				label();
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
				expression(0);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(757);
					match(WHITE_SPACE);
					}
				}

				setState(760);
				match(OPEN_BRACKET);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(761);
					match(NEWLINE);
					}
				}

				setState(765); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(764);
					statements();
					}
					}
					setState(767); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
				setState(769);
				match(CLOSE_BRACKET);
				notifyErrorListeners("Missing assignment operator");
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
		enterRule(_localctx, 98, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(774);
					variable_type();
					setState(775);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(779);
				label();
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(780);
					match(WHITE_SPACE);
					}
				}

				setState(783);
				match(ASSIGN);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(784);
					match(WHITE_SPACE);
					}
				}

				setState(787);
				loop_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
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
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(792);
				number();
				}
				break;
			case 2:
				{
				setState(793);
				label();
				}
				break;
			case 3:
				{
				setState(794);
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
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				match(WHILE);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(798);
					match(WHITE_SPACE);
					}
				}

				setState(801);
				expression(0);
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(802);
					match(WHITE_SPACE);
					}
				}

				setState(805);
				loop_structure();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
				expression(0);
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
				loop_structure();
				notifyErrorListeners("Missing While or For word");
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
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(FOR);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(820);
					match(WHITE_SPACE);
					}
				}

				setState(823);
				loop_variable_declaration();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(824);
					match(WHITE_SPACE);
					}
				}

				setState(827);
				loop_structure();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(829);
					match(WHITE_SPACE);
					}
				}

				setState(832);
				loop_variable_declaration();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(833);
					match(WHITE_SPACE);
					}
				}

				setState(836);
				loop_structure();
				notifyErrorListeners("Missing While or For word");
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
			setState(841);
			label();
			setState(842);
			match(OPEN_PAREN);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
				{
				setState(843);
				function_parameters();
				}
			}

			setState(846);
			match(CLOSE_PAREN);
			setState(847);
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
			setState(849);
			label();
			setState(850);
			match(OPEN_PAREN);
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
				{
				setState(851);
				function_parameters();
				}
			}

			setState(854);
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
			setState(856);
			function_paremeters_value();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==WHITE_SPACE) {
				{
				{
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(857);
					match(WHITE_SPACE);
					}
				}

				setState(860);
				match(COMMA);
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
				function_paremeters_value();
				}
				}
				setState(869);
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
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(870);
				function_calling_without_semicolon();
				}
				break;
			case 2:
				{
				setState(871);
				label();
				}
				break;
			case 3:
				{
				setState(872);
				expression(0);
				}
				break;
			case 4:
				{
				setState(873);
				string();
				}
				break;
			case 5:
				{
				setState(874);
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
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
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
		public TerminalNode NEWLINE() { return getToken(MainParser.NEWLINE, 0); }
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
			setState(881);
			label();
			setState(882);
			match(OPEN_PAREN);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(883);
				function_declaration_parameters();
				}
			}

			setState(886);
			match(CLOSE_PAREN);
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
			match(OPEN_BRACKET);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(891);
				match(NEWLINE);
				}
			}

			setState(895); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(894);
				statements();
				}
				}
				setState(897); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(899);
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
			setState(901);
			variable_type();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(902);
				match(OPEN_BRACE);
				setState(903);
				match(CLOSE_BRACE);
				}
			}

			setState(906);
			label();
			setState(914);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(907);
					match(COMMA);
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(908);
						match(WHITE_SPACE);
						}
					}

					setState(911);
					function_declaration_parameters();
					}
					} 
				}
				setState(916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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
			setState(917);
			match(FUNC);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(918);
				match(WHITE_SPACE);
				}
			}

			setState(921);
			match(VOID);
			setState(922);
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
			setState(924);
			match(FUNC);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(925);
				match(WHITE_SPACE);
				}
			}

			setState(928);
			variable_type();
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(929);
				match(OPEN_BRACE);
				setState(930);
				match(CLOSE_BRACE);
				}
			}

			setState(933);
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
			setState(935);
			match(OPEN_BRACKET);
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(936);
				match(NEWLINE);
				}
			}

			setState(940); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(939);
				statements();
				}
				}
				setState(942); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << MINUS) | (1L << DOT) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(944);
				match(NEWLINE);
				}
			}

			setState(947);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u03b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4\u008b\n"+
		"\4\r\4\16\4\u008c\3\4\3\4\3\5\5\5\u0092\n\5\3\5\7\5\u0095\n\5\f\5\16\5"+
		"\u0098\13\5\3\5\3\5\6\5\u009c\n\5\r\5\16\5\u009d\3\5\5\5\u00a1\n\5\3\5"+
		"\5\5\u00a4\n\5\3\5\6\5\u00a7\n\5\r\5\16\5\u00a8\5\5\u00ab\n\5\3\6\7\6"+
		"\u00ae\n\6\f\6\16\6\u00b1\13\6\3\6\6\6\u00b4\n\6\r\6\16\6\u00b5\3\6\7"+
		"\6\u00b9\n\6\f\6\16\6\u00bc\13\6\3\6\7\6\u00bf\n\6\f\6\16\6\u00c2\13\6"+
		"\3\7\3\7\3\7\3\7\5\7\u00c8\n\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u00d0\n\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\5\r\u00d8\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00e2\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\5\24\u00f0\n\24\3\24\7\24\u00f3\n\24\f\24\16\24\u00f6"+
		"\13\24\3\24\3\24\5\24\u00fa\n\24\3\24\7\24\u00fd\n\24\f\24\16\24\u0100"+
		"\13\24\3\24\3\24\5\24\u0104\n\24\3\24\7\24\u0107\n\24\f\24\16\24\u010a"+
		"\13\24\3\24\3\24\5\24\u010e\n\24\3\24\7\24\u0111\n\24\f\24\16\24\u0114"+
		"\13\24\3\24\3\24\5\24\u0118\n\24\3\24\7\24\u011b\n\24\f\24\16\24\u011e"+
		"\13\24\3\24\3\24\5\24\u0122\n\24\3\24\7\24\u0125\n\24\f\24\16\24\u0128"+
		"\13\24\3\24\3\24\5\24\u012c\n\24\3\24\7\24\u012f\n\24\f\24\16\24\u0132"+
		"\13\24\5\24\u0134\n\24\3\25\3\25\3\25\3\25\5\25\u013a\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0142\n\26\3\27\3\27\5\27\u0146\n\27\3\27\3\27"+
		"\5\27\u014a\n\27\3\27\3\27\5\27\u014e\n\27\3\27\5\27\u0151\n\27\3\27\3"+
		"\27\3\30\3\30\5\30\u0157\n\30\3\30\3\30\5\30\u015b\n\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\5\33\u0168\n\33\3\33\3\33\5\33"+
		"\u016c\n\33\3\33\3\33\5\33\u0170\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0178\n\33\3\33\3\33\5\33\u017c\n\33\3\33\3\33\5\33\u0180\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0189\n\33\3\33\3\33\5\33\u018d\n"+
		"\33\3\33\3\33\5\33\u0191\n\33\3\33\3\33\5\33\u0195\n\33\3\33\3\33\5\33"+
		"\u0199\n\33\3\33\3\33\3\33\5\33\u019e\n\33\3\33\3\33\5\33\u01a2\n\33\3"+
		"\33\3\33\5\33\u01a6\n\33\3\33\5\33\u01a9\n\33\3\33\3\33\5\33\u01ad\n\33"+
		"\3\33\3\33\5\33\u01b1\n\33\3\33\3\33\5\33\u01b5\n\33\3\34\3\34\3\34\3"+
		"\34\5\34\u01bb\n\34\3\34\3\34\5\34\u01bf\n\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u01cf\n\37\3\37\3\37"+
		"\5\37\u01d3\n\37\3\37\3\37\5\37\u01d7\n\37\7\37\u01d9\n\37\f\37\16\37"+
		"\u01dc\13\37\3 \3 \3 \3 \5 \u01e2\n \3!\3!\3!\3!\5!\u01e8\n!\3!\3!\5!"+
		"\u01ec\n!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\5$\u01f8\n$\3$\3$\3%\3%\5%\u01fe"+
		"\n%\3%\3%\3%\3%\3%\5%\u0205\n%\3%\3%\3%\3%\5%\u020b\n%\3&\3&\3&\3&\3&"+
		"\5&\u0212\n&\3\'\3\'\3\'\3\'\5\'\u0218\n\'\3\'\3\'\5\'\u021c\n\'\3\'\3"+
		"\'\5\'\u0220\n\'\3\'\3\'\5\'\u0224\n\'\3\'\3\'\5\'\u0228\n\'\3\'\3\'\3"+
		"\'\3\'\5\'\u022e\n\'\3\'\3\'\6\'\u0232\n\'\r\'\16\'\u0233\3\'\5\'\u0237"+
		"\n\'\3\'\3\'\3\'\7\'\u023c\n\'\f\'\16\'\u023f\13\'\3(\3(\3(\5(\u0244\n"+
		"(\3)\3)\3)\3)\5)\u024a\n)\3)\3)\5)\u024e\n)\3)\3)\5)\u0252\n)\3)\3)\5"+
		")\u0256\n)\3)\3)\5)\u025a\n)\3)\3)\5)\u025e\n)\3)\3)\3)\3)\5)\u0264\n"+
		")\3)\3)\6)\u0268\n)\r)\16)\u0269\3)\5)\u026d\n)\3)\3)\3)\7)\u0272\n)\f"+
		")\16)\u0275\13)\3*\3*\5*\u0279\n*\3*\3*\5*\u027d\n*\3*\3*\5*\u0281\n*"+
		"\3*\3*\5*\u0285\n*\3*\3*\5*\u0289\n*\3*\3*\5*\u028d\n*\3*\3*\5*\u0291"+
		"\n*\3+\3+\3+\5+\u0296\n+\3,\3,\5,\u029a\n,\3,\3,\5,\u029e\n,\7,\u02a0"+
		"\n,\f,\16,\u02a3\13,\3,\3,\7,\u02a7\n,\f,\16,\u02aa\13,\5,\u02ac\n,\3"+
		"-\3-\3-\3-\5-\u02b2\n-\3-\3-\5-\u02b6\n-\3-\3-\5-\u02ba\n-\3-\6-\u02bd"+
		"\n-\r-\16-\u02be\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\5\60\u02cb\n\60\3\60"+
		"\3\60\5\60\u02cf\n\60\3\60\3\60\5\60\u02d3\n\60\3\60\6\60\u02d6\n\60\r"+
		"\60\16\60\u02d7\3\60\3\60\3\61\3\61\5\61\u02de\n\61\3\62\3\62\5\62\u02e2"+
		"\n\62\3\62\3\62\5\62\u02e6\n\62\3\62\3\62\5\62\u02ea\n\62\3\62\6\62\u02ed"+
		"\n\62\r\62\16\62\u02ee\3\62\3\62\3\62\3\62\5\62\u02f5\n\62\3\62\3\62\5"+
		"\62\u02f9\n\62\3\62\3\62\5\62\u02fd\n\62\3\62\6\62\u0300\n\62\r\62\16"+
		"\62\u0301\3\62\3\62\3\62\5\62\u0307\n\62\3\63\3\63\3\63\5\63\u030c\n\63"+
		"\3\63\3\63\5\63\u0310\n\63\3\63\3\63\5\63\u0314\n\63\3\63\3\63\3\63\5"+
		"\63\u0319\n\63\3\64\3\64\3\64\5\64\u031e\n\64\3\65\3\65\5\65\u0322\n\65"+
		"\3\65\3\65\5\65\u0326\n\65\3\65\3\65\3\65\5\65\u032b\n\65\3\65\3\65\5"+
		"\65\u032f\n\65\3\65\3\65\3\65\5\65\u0334\n\65\3\66\3\66\5\66\u0338\n\66"+
		"\3\66\3\66\5\66\u033c\n\66\3\66\3\66\3\66\5\66\u0341\n\66\3\66\3\66\5"+
		"\66\u0345\n\66\3\66\3\66\3\66\5\66\u034a\n\66\3\67\3\67\3\67\5\67\u034f"+
		"\n\67\3\67\3\67\3\67\38\38\38\58\u0357\n8\38\38\39\39\59\u035d\n9\39\3"+
		"9\59\u0361\n9\39\79\u0364\n9\f9\169\u0367\139\3:\3:\3:\3:\3:\5:\u036e"+
		"\n:\3;\3;\5;\u0372\n;\3<\3<\3<\5<\u0377\n<\3<\3<\5<\u037b\n<\3<\3<\5<"+
		"\u037f\n<\3<\6<\u0382\n<\r<\16<\u0383\3<\3<\3=\3=\3=\5=\u038b\n=\3=\3"+
		"=\3=\5=\u0390\n=\3=\7=\u0393\n=\f=\16=\u0396\13=\3>\3>\5>\u039a\n>\3>"+
		"\3>\3>\3?\3?\5?\u03a1\n?\3?\3?\3?\5?\u03a6\n?\3?\3?\3@\3@\5@\u03ac\n@"+
		"\3@\6@\u03af\n@\r@\16@\u03b0\3@\5@\u03b4\n@\3@\3@\3@\2\4LPA\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\2\17\3\2\24\27\5\2\4\4\61\61\63\64\3\2$&\3\2\"#\3\2"+
		"\'(\3\2\36!\3\2\5\13\3\2\f\17\3\2\20\23\3\2)\62\3\2\30\35\4\2\66\6688"+
		"\3\2\21\22\2\u043c\2\u0080\3\2\2\2\4\u0083\3\2\2\2\6\u0085\3\2\2\2\b\u00aa"+
		"\3\2\2\2\n\u00af\3\2\2\2\f\u00c7\3\2\2\2\16\u00c9\3\2\2\2\20\u00cb\3\2"+
		"\2\2\22\u00cf\3\2\2\2\24\u00d1\3\2\2\2\26\u00d3\3\2\2\2\30\u00d7\3\2\2"+
		"\2\32\u00e1\3\2\2\2\34\u00e3\3\2\2\2\36\u00e5\3\2\2\2 \u00e7\3\2\2\2\""+
		"\u00e9\3\2\2\2$\u00eb\3\2\2\2&\u0133\3\2\2\2(\u0139\3\2\2\2*\u0141\3\2"+
		"\2\2,\u0143\3\2\2\2.\u0154\3\2\2\2\60\u015f\3\2\2\2\62\u0161\3\2\2\2\64"+
		"\u01b4\3\2\2\2\66\u01b6\3\2\2\28\u01c2\3\2\2\2:\u01c6\3\2\2\2<\u01cc\3"+
		"\2\2\2>\u01e1\3\2\2\2@\u01e3\3\2\2\2B\u01f1\3\2\2\2D\u01f3\3\2\2\2F\u01f5"+
		"\3\2\2\2H\u020a\3\2\2\2J\u0211\3\2\2\2L\u021f\3\2\2\2N\u0243\3\2\2\2P"+
		"\u0255\3\2\2\2R\u0290\3\2\2\2T\u0295\3\2\2\2V\u0297\3\2\2\2X\u02ad\3\2"+
		"\2\2Z\u02c2\3\2\2\2\\\u02c5\3\2\2\2^\u02c8\3\2\2\2`\u02dd\3\2\2\2b\u0306"+
		"\3\2\2\2d\u0318\3\2\2\2f\u031d\3\2\2\2h\u0333\3\2\2\2j\u0349\3\2\2\2l"+
		"\u034b\3\2\2\2n\u0353\3\2\2\2p\u035a\3\2\2\2r\u036d\3\2\2\2t\u0371\3\2"+
		"\2\2v\u0373\3\2\2\2x\u0387\3\2\2\2z\u0397\3\2\2\2|\u039e\3\2\2\2~\u03a9"+
		"\3\2\2\2\u0080\u0081\5~@\2\u0081\u0082\7\2\2\3\u0082\3\3\2\2\2\u0083\u0084"+
		"\t\2\2\2\u0084\5\3\2\2\2\u0085\u008a\7\3\2\2\u0086\u008b\7\65\2\2\u0087"+
		"\u008b\5\32\16\2\u0088\u008b\5\n\6\2\u0089\u008b\78\2\2\u008a\u0086\3"+
		"\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\7\3\2\2\u008f\7\3\2\2\2\u0090\u0092\7#\2\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0095\7\65\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7.\2\2\u009a"+
		"\u009c\7\65\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\7\4\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ab\3\2\2\2\u00a2\u00a4\7#"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a7\7\65\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u0091\3\2\2\2\u00aa"+
		"\u00a3\3\2\2\2\u00ab\t\3\2\2\2\u00ac\u00ae\5\f\7\2\u00ad\u00ac\3\2\2\2"+
		"\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\3\2"+
		"\2\2\u00b7\u00b9\5\f\7\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00bf\5\n\6\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\13\3\2\2\2\u00c2\u00c0\3\2\2"+
		"\2\u00c3\u00c8\5\34\17\2\u00c4\u00c8\5\36\20\2\u00c5\u00c8\5 \21\2\u00c6"+
		"\u00c8\5\4\3\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\r\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca\17"+
		"\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc\21\3\2\2\2\u00cd\u00d0\5\16\b\2\u00ce"+
		"\u00d0\5\20\t\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\23\3\2\2"+
		"\2\u00d1\u00d2\t\6\2\2\u00d2\25\3\2\2\2\u00d3\u00d4\t\7\2\2\u00d4\27\3"+
		"\2\2\2\u00d5\u00d8\5\24\13\2\u00d6\u00d8\5\26\f\2\u00d7\u00d5\3\2\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\31\3\2\2\2\u00d9\u00e2\5\34\17\2\u00da\u00e2"+
		"\5\36\20\2\u00db\u00e2\5 \21\2\u00dc\u00e2\5\"\22\2\u00dd\u00e2\5$\23"+
		"\2\u00de\u00e2\5\30\r\2\u00df\u00e2\5\22\n\2\u00e0\u00e2\5\4\3\2\u00e1"+
		"\u00d9\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2"+
		"\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\33\3\2\2\2\u00e3\u00e4\t\b\2\2\u00e4\35\3\2\2\2\u00e5"+
		"\u00e6\t\t\2\2\u00e6\37\3\2\2\2\u00e7\u00e8\t\n\2\2\u00e8!\3\2\2\2\u00e9"+
		"\u00ea\t\13\2\2\u00ea#\3\2\2\2\u00eb\u00ec\t\f\2\2\u00ec%\3\2\2\2\u00ed"+
		"\u00ef\5:\36\2\u00ee\u00f0\7\67\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\7\66\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0134\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\5@!\2\u00f8\u00fa\7\67\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd\7\66"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0134\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5V"+
		",\2\u0102\u0104\7\67\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0108\3\2\2\2\u0105\u0107\7\66\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0134\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010d\5(\25\2\u010c\u010e\7\67\2\2\u010d\u010c\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u0112\3\2\2\2\u010f\u0111\7\66\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0134\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\5H%\2\u0116\u0118"+
		"\7\67\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\3\2\2\2"+
		"\u0119\u011b\7\66\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0134\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0121\5`\61\2\u0120\u0122\7\67\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3"+
		"\2\2\2\u0122\u0126\3\2\2\2\u0123\u0125\7\66\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0134\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0129\u012b\5~@\2\u012a\u012c\7\67\2\2\u012b"+
		"\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0130\3\2\2\2\u012d\u012f\7\66"+
		"\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u00ed\3\2"+
		"\2\2\u0133\u00f7\3\2\2\2\u0133\u0101\3\2\2\2\u0133\u010b\3\2\2\2\u0133"+
		"\u0115\3\2\2\2\u0133\u011f\3\2\2\2\u0133\u0129\3\2\2\2\u0134\'\3\2\2\2"+
		"\u0135\u013a\5,\27\2\u0136\u013a\5.\30\2\u0137\u013a\5\66\34\2\u0138\u013a"+
		"\58\35\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a)\3\2\2\2\u013b\u0142\5\6\4\2\u013c\u0142\5\b\5\2"+
		"\u013d\u0142\5\n\6\2\u013e\u0142\5L\'\2\u013f\u0142\5P)\2\u0140\u0142"+
		"\5n8\2\u0141\u013b\3\2\2\2\u0141\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u0141"+
		"\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142+\3\2\2\2"+
		"\u0143\u0145\5\4\3\2\u0144\u0146\78\2\2\u0145\u0144\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0150\5\n\6\2\u0148\u014a\78\2\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\7*"+
		"\2\2\u014c\u014e\78\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\5*\26\2\u0150\u0149\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7/\2\2\u0153-\3\2\2\2\u0154\u0156"+
		"\5\n\6\2\u0155\u0157\78\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\7*\2\2\u0159\u015b\78\2\2\u015a\u0159\3\2\2"+
		"\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\5*\26\2\u015d\u015e"+
		"\7/\2\2\u015e/\3\2\2\2\u015f\u0160\5L\'\2\u0160\61\3\2\2\2\u0161\u0162"+
		"\5\n\6\2\u0162\u0163\7\34\2\2\u0163\u0164\5\60\31\2\u0164\u0165\7\35\2"+
		"\2\u0165\63\3\2\2\2\u0166\u0168\78\2\2\u0167\u0166\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\7*\2\2\u016a\u016c\78\2\2\u016b"+
		"\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\7\5"+
		"\2\2\u016e\u0170\78\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\5\4\3\2\u0172\u0173\7\34\2\2\u0173\u0174\5"+
		"\60\31\2\u0174\u0175\7\35\2\2\u0175\u01b5\3\2\2\2\u0176\u0178\78\2\2\u0177"+
		"\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\7+"+
		"\2\2\u017a\u017c\78\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\7\5\2\2\u017e\u0180\78\2\2\u017f\u017e\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\5\4\3\2\u0182"+
		"\u0183\7\34\2\2\u0183\u0184\5\60\31\2\u0184\u0185\7\35\2\2\u0185\u0186"+
		"\b\33\1\2\u0186\u01b5\3\2\2\2\u0187\u0189\78\2\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\7*\2\2\u018b\u018d\78\2"+
		"\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190"+
		"\7\5\2\2\u018f\u0191\78\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0194\5\4\3\2\u0193\u0195\7\34\2\2\u0194\u0193\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\5\60\31\2\u0197"+
		"\u0199\7\35\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3"+
		"\2\2\2\u019a\u019b\b\33\1\2\u019b\u01b5\3\2\2\2\u019c\u019e\78\2\2\u019d"+
		"\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\7*"+
		"\2\2\u01a0\u01a2\78\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a6\5\62\32\2\u01a4\u01a6\5*\26\2\u01a5\u01a3\3"+
		"\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01b5\3\2\2\2\u01a7\u01a9\78\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\7+"+
		"\2\2\u01ab\u01ad\78\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01b1\5\62\32\2\u01af\u01b1\5*\26\2\u01b0\u01ae\3"+
		"\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b\33\1\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u0167\3\2\2\2\u01b4\u0177\3\2\2\2\u01b4\u0188\3\2"+
		"\2\2\u01b4\u019d\3\2\2\2\u01b4\u01a8\3\2\2\2\u01b5\65\3\2\2\2\u01b6\u01b7"+
		"\5\4\3\2\u01b7\u01b8\7\34\2\2\u01b8\u01ba\7\35\2\2\u01b9\u01bb\78\2\2"+
		"\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be"+
		"\5\n\6\2\u01bd\u01bf\5\64\33\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2"+
		"\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7/\2\2\u01c1\67\3\2\2\2\u01c2\u01c3\5"+
		"\62\32\2\u01c3\u01c4\5\64\33\2\u01c4\u01c5\7/\2\2\u01c59\3\2\2\2\u01c6"+
		"\u01c7\7\b\2\2\u01c7\u01c8\7\30\2\2\u01c8\u01c9\5<\37\2\u01c9\u01ca\7"+
		"\31\2\2\u01ca\u01cb\7/\2\2\u01cb;\3\2\2\2\u01cc\u01da\5> \2\u01cd\u01cf"+
		"\78\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d2\7\"\2\2\u01d1\u01d3\78\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\5> \2\u01d5\u01d7\78\2\2\u01d6\u01d5"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01ce\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db=\3\2\2\2"+
		"\u01dc\u01da\3\2\2\2\u01dd\u01e2\5\6\4\2\u01de\u01e2\5\n\6\2\u01df\u01e2"+
		"\5L\'\2\u01e0\u01e2\5n8\2\u01e1\u01dd\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2?\3\2\2\2\u01e3\u01e4\7\t\2\2"+
		"\u01e4\u01e5\7\30\2\2\u01e5\u01e7\5B\"\2\u01e6\u01e8\78\2\2\u01e7\u01e6"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\7\60\2\2"+
		"\u01ea\u01ec\78\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01ee\5D#\2\u01ee\u01ef\7\31\2\2\u01ef\u01f0\7/\2\2\u01f0"+
		"A\3\2\2\2\u01f1\u01f2\5\6\4\2\u01f2C\3\2\2\2\u01f3\u01f4\5L\'\2\u01f4"+
		"E\3\2\2\2\u01f5\u01f7\7\6\2\2\u01f6\u01f8\78\2\2\u01f7\u01f6\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\5(\25\2\u01faG\3\2\2\2"+
		"\u01fb\u01fd\7\7\2\2\u01fc\u01fe\78\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\5J&\2\u0200\u0201\7/\2\2\u0201"+
		"\u020b\3\2\2\2\u0202\u0204\7\7\2\2\u0203\u0205\78\2\2\u0204\u0203\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\5\4\3\2\u0207"+
		"\u0208\7/\2\2\u0208\u0209\b%\1\2\u0209\u020b\3\2\2\2\u020a\u01fb\3\2\2"+
		"\2\u020a\u0202\3\2\2\2\u020bI\3\2\2\2\u020c\u0212\5\6\4\2\u020d\u0212"+
		"\5\b\5\2\u020e\u0212\5\n\6\2\u020f\u0212\5L\'\2\u0210\u0212\5l\67\2\u0211"+
		"\u020c\3\2\2\2\u0211\u020d\3\2\2\2\u0211\u020e\3\2\2\2\u0211\u020f\3\2"+
		"\2\2\u0211\u0210\3\2\2\2\u0212K\3\2\2\2\u0213\u0214\b\'\1\2\u0214\u0220"+
		"\5N(\2\u0215\u0217\7\30\2\2\u0216\u0218\78\2\2\u0217\u0216\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\5L\'\2\u021a\u021c\78\2"+
		"\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e"+
		"\7\31\2\2\u021e\u0220\3\2\2\2\u021f\u0213\3\2\2\2\u021f\u0215\3\2\2\2"+
		"\u0220\u023d\3\2\2\2\u0221\u0223\f\5\2\2\u0222\u0224\78\2\2\u0223\u0222"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\5\22\n\2"+
		"\u0226\u0228\78\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022a\5L\'\6\u022a\u023c\3\2\2\2\u022b\u022d\f\4\2\2\u022c"+
		"\u022e\78\2\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2"+
		"\2\2\u022f\u0231\5\22\n\2\u0230\u0232\5\22\n\2\u0231\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2"+
		"\2\2\u0235\u0237\78\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\5L\'\5\u0239\u023a\b\'\1\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0221\3\2\2\2\u023b\u022b\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023eM\3\2\2\2\u023f\u023d\3\2\2\2"+
		"\u0240\u0244\5\b\5\2\u0241\u0244\5\n\6\2\u0242\u0244\5n8\2\u0243\u0240"+
		"\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244O\3\2\2\2\u0245"+
		"\u0246\b)\1\2\u0246\u0256\5T+\2\u0247\u0256\5R*\2\u0248\u024a\7)\2\2\u0249"+
		"\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\7\30"+
		"\2\2\u024c\u024e\78\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0251\5P)\2\u0250\u0252\78\2\2\u0251\u0250\3\2\2"+
		"\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\7\31\2\2\u0254"+
		"\u0256\3\2\2\2\u0255\u0245\3\2\2\2\u0255\u0247\3\2\2\2\u0255\u0249\3\2"+
		"\2\2\u0256\u0273\3\2\2\2\u0257\u0259\f\5\2\2\u0258\u025a\78\2\2\u0259"+
		"\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\5\30"+
		"\r\2\u025c\u025e\78\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0260\5P)\6\u0260\u0272\3\2\2\2\u0261\u0263\f\4\2"+
		"\2\u0262\u0264\78\2\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265\u0267\5\30\r\2\u0266\u0268\5\30\r\2\u0267\u0266\3\2\2\2"+
		"\u0268\u0269\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c"+
		"\3\2\2\2\u026b\u026d\78\2\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026f\5P)\5\u026f\u0270\b)\1\2\u0270\u0272\3\2\2"+
		"\2\u0271\u0257\3\2\2\2\u0271\u0261\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274Q\3\2\2\2\u0275\u0273\3\2\2\2\u0276"+
		"\u0278\5\n\6\2\u0277\u0279\78\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a\u027c\7+\2\2\u027b\u027d\78\2\2\u027c\u027b"+
		"\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u0281\5T+\2\u027f"+
		"\u0281\5\6\4\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2\2\2\u0281\u0291\3\2"+
		"\2\2\u0282\u0284\5\n\6\2\u0283\u0285\78\2\2\u0284\u0283\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\7*\2\2\u0287\u0289\78\2"+
		"\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u028d"+
		"\5T+\2\u028b\u028d\5\6\4\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\b*\1\2\u028f\u0291\3\2\2\2\u0290\u0276\3\2"+
		"\2\2\u0290\u0282\3\2\2\2\u0291S\3\2\2\2\u0292\u0296\5\n\6\2\u0293\u0296"+
		"\5\b\5\2\u0294\u0296\5L\'\2\u0295\u0292\3\2\2\2\u0295\u0293\3\2\2\2\u0295"+
		"\u0294\3\2\2\2\u0296U\3\2\2\2\u0297\u0299\5Z.\2\u0298\u029a\t\r\2\2\u0299"+
		"\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u02a1\3\2\2\2\u029b\u029d\5\\"+
		"/\2\u029c\u029e\t\r\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u029b\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2"+
		"\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02ab\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4"+
		"\u02a8\5^\60\2\u02a5\u02a7\7\66\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3"+
		"\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02ab\u02a4\3\2\2\2\u02ab\u02ac\3\2\2\2\u02acW\3\2\2\2"+
		"\u02ad\u02ae\7\30\2\2\u02ae\u02af\5P)\2\u02af\u02b1\7\31\2\2\u02b0\u02b2"+
		"\78\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b5\7\17\2\2\u02b4\u02b6\78\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\7\32\2\2\u02b8\u02ba\7\66\2\2\u02b9"+
		"\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02bd\5&"+
		"\24\2\u02bc\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\7\33\2\2\u02c1Y\3\2\2\2"+
		"\u02c2\u02c3\7\f\2\2\u02c3\u02c4\5X-\2\u02c4[\3\2\2\2\u02c5\u02c6\7\16"+
		"\2\2\u02c6\u02c7\5X-\2\u02c7]\3\2\2\2\u02c8\u02ca\7\r\2\2\u02c9\u02cb"+
		"\78\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02ce\7\17\2\2\u02cd\u02cf\78\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\7\32\2\2\u02d1\u02d3\7\66\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d6\5&"+
		"\24\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\7\33\2\2\u02da_\3\2\2\2"+
		"\u02db\u02de\5j\66\2\u02dc\u02de\5h\65\2\u02dd\u02db\3\2\2\2\u02dd\u02dc"+
		"\3\2\2\2\u02dea\3\2\2\2\u02df\u02e1\t\16\2\2\u02e0\u02e2\78\2\2\u02e1"+
		"\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\5L"+
		"\'\2\u02e4\u02e6\78\2\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e9\7\32\2\2\u02e8\u02ea\7\66\2\2\u02e9\u02e8\3"+
		"\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02ed\5&\24\2\u02ec"+
		"\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\7\33\2\2\u02f1\u0307\3\2\2\2\u02f2"+
		"\u02f4\5\n\6\2\u02f3\u02f5\78\2\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\5L\'\2\u02f7\u02f9\78\2\2\u02f8\u02f7"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\7\32\2\2"+
		"\u02fb\u02fd\7\66\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff"+
		"\3\2\2\2\u02fe\u0300\5&\24\2\u02ff\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7\33"+
		"\2\2\u0304\u0305\b\62\1\2\u0305\u0307\3\2\2\2\u0306\u02df\3\2\2\2\u0306"+
		"\u02f2\3\2\2\2\u0307c\3\2\2\2\u0308\u0309\5\4\3\2\u0309\u030a\78\2\2\u030a"+
		"\u030c\3\2\2\2\u030b\u0308\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u030f\5\n\6\2\u030e\u0310\78\2\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\7*\2\2\u0312\u0314\78\2"+
		"\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316"+
		"\5f\64\2\u0316\u0319\3\2\2\2\u0317\u0319\5L\'\2\u0318\u030b\3\2\2\2\u0318"+
		"\u0317\3\2\2\2\u0319e\3\2\2\2\u031a\u031e\5\b\5\2\u031b\u031e\5\n\6\2"+
		"\u031c\u031e\5L\'\2\u031d\u031a\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031c"+
		"\3\2\2\2\u031eg\3\2\2\2\u031f\u0321\7\23\2\2\u0320\u0322\78\2\2\u0321"+
		"\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\5L"+
		"\'\2\u0324\u0326\78\2\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327\u0328\5b\62\2\u0328\u0334\3\2\2\2\u0329\u032b\78"+
		"\2\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032e\5L\'\2\u032d\u032f\78\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2"+
		"\2\u032f\u0330\3\2\2\2\u0330\u0331\5b\62\2\u0331\u0332\b\65\1\2\u0332"+
		"\u0334\3\2\2\2\u0333\u031f\3\2\2\2\u0333\u032a\3\2\2\2\u0334i\3\2\2\2"+
		"\u0335\u0337\7\20\2\2\u0336\u0338\78\2\2\u0337\u0336\3\2\2\2\u0337\u0338"+
		"\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\5d\63\2\u033a\u033c\78\2\2\u033b"+
		"\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\5b"+
		"\62\2\u033e\u034a\3\2\2\2\u033f\u0341\78\2\2\u0340\u033f\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\5d\63\2\u0343\u0345\78"+
		"\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u0347\5b\62\2\u0347\u0348\b\66\1\2\u0348\u034a\3\2\2\2\u0349\u0335\3"+
		"\2\2\2\u0349\u0340\3\2\2\2\u034ak\3\2\2\2\u034b\u034c\5\n\6\2\u034c\u034e"+
		"\7\30\2\2\u034d\u034f\5p9\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u0351\7\31\2\2\u0351\u0352\7/\2\2\u0352m\3\2\2\2"+
		"\u0353\u0354\5\n\6\2\u0354\u0356\7\30\2\2\u0355\u0357\5p9\2\u0356\u0355"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\7\31\2\2"+
		"\u0359o\3\2\2\2\u035a\u0365\5r:\2\u035b\u035d\78\2\2\u035c\u035b\3\2\2"+
		"\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\7\60\2\2\u035f"+
		"\u0361\78\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2"+
		"\2\2\u0362\u0364\5r:\2\u0363\u035c\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363"+
		"\3\2\2\2\u0365\u0366\3\2\2\2\u0366q\3\2\2\2\u0367\u0365\3\2\2\2\u0368"+
		"\u036e\5n8\2\u0369\u036e\5\n\6\2\u036a\u036e\5L\'\2\u036b\u036e\5\6\4"+
		"\2\u036c\u036e\5\b\5\2\u036d\u0368\3\2\2\2\u036d\u0369\3\2\2\2\u036d\u036a"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036c\3\2\2\2\u036es\3\2\2\2\u036f"+
		"\u0372\5z>\2\u0370\u0372\5|?\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2\2\2"+
		"\u0372u\3\2\2\2\u0373\u0374\5\n\6\2\u0374\u0376\7\30\2\2\u0375\u0377\5"+
		"x=\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u037a\7\31\2\2\u0379\u037b\78\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2"+
		"\2\2\u037b\u037c\3\2\2\2\u037c\u037e\7\32\2\2\u037d\u037f\7\66\2\2\u037e"+
		"\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u0382\5&"+
		"\24\2\u0381\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0381\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\7\33\2\2\u0386w\3\2\2\2"+
		"\u0387\u038a\5\4\3\2\u0388\u0389\7\34\2\2\u0389\u038b\7\35\2\2\u038a\u0388"+
		"\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u0394\5\n\6\2\u038d"+
		"\u038f\7\60\2\2\u038e\u0390\78\2\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2"+
		"\2\2\u0390\u0391\3\2\2\2\u0391\u0393\5x=\2\u0392\u038d\3\2\2\2\u0393\u0396"+
		"\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395y\3\2\2\2\u0396"+
		"\u0394\3\2\2\2\u0397\u0399\7\13\2\2\u0398\u039a\78\2\2\u0399\u0398\3\2"+
		"\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\7\n\2\2\u039c"+
		"\u039d\5v<\2\u039d{\3\2\2\2\u039e\u03a0\7\13\2\2\u039f\u03a1\78\2\2\u03a0"+
		"\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a5\5\4"+
		"\3\2\u03a3\u03a4\7\34\2\2\u03a4\u03a6\7\35\2\2\u03a5\u03a3\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\5v<\2\u03a8}\3\2\2\2\u03a9"+
		"\u03ab\7\32\2\2\u03aa\u03ac\7\66\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3"+
		"\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03af\5&\24\2\u03ae\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\3\2"+
		"\2\2\u03b2\u03b4\7\66\2\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b6\7\33\2\2\u03b6\177\3\2\2\2\u00a2\u008a\u008c"+
		"\u0091\u0096\u009d\u00a0\u00a3\u00a8\u00aa\u00af\u00b5\u00ba\u00c0\u00c7"+
		"\u00cf\u00d7\u00e1\u00ef\u00f4\u00f9\u00fe\u0103\u0108\u010d\u0112\u0117"+
		"\u011c\u0121\u0126\u012b\u0130\u0133\u0139\u0141\u0145\u0149\u014d\u0150"+
		"\u0156\u015a\u0167\u016b\u016f\u0177\u017b\u017f\u0188\u018c\u0190\u0194"+
		"\u0198\u019d\u01a1\u01a5\u01a8\u01ac\u01b0\u01b4\u01ba\u01be\u01ce\u01d2"+
		"\u01d6\u01da\u01e1\u01e7\u01eb\u01f7\u01fd\u0204\u020a\u0211\u0217\u021b"+
		"\u021f\u0223\u0227\u022d\u0233\u0236\u023b\u023d\u0243\u0249\u024d\u0251"+
		"\u0255\u0259\u025d\u0263\u0269\u026c\u0271\u0273\u0278\u027c\u0280\u0284"+
		"\u0288\u028c\u0290\u0295\u0299\u029d\u02a1\u02a8\u02ab\u02b1\u02b5\u02b9"+
		"\u02be\u02ca\u02ce\u02d2\u02d7\u02dd\u02e1\u02e5\u02e9\u02ee\u02f4\u02f8"+
		"\u02fc\u0301\u0306\u030b\u030f\u0313\u0318\u031d\u0321\u0325\u032a\u032e"+
		"\u0333\u0337\u033b\u0340\u0344\u0349\u034e\u0356\u035c\u0360\u0365\u036d"+
		"\u0371\u0376\u037a\u037e\u0383\u038a\u038f\u0394\u0399\u03a0\u03a5\u03ab"+
		"\u03b0\u03b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}