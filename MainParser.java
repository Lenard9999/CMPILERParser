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
		IF=9, ELSE=10, ELSE_IF=11, THEN=12, FOR=13, UP_TO=14, DOWN_TO=15, WHILE=16, 
		INT_DEC=17, BOOLEAN_DEC=18, FLOAT_DEC=19, STRING_DEC=20, OPEN_PAREN=21, 
		CLOSE_PAREN=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, OPEN_BRACE=25, CLOSE_BRACE=26, 
		LESS=27, LESSQEUAL=28, GREATER=29, GREATEREQUAL=30, PLUS=31, MINUS=32, 
		MULTI=33, DIV=34, MOD=35, ANDAND=36, OROR=37, NOT=38, ASSIGN=39, EQUAL=40, 
		QUESTION=41, COLON=42, DOT=43, SEMICOLON=44, COMMA=45, UNDERSCORE=46, 
		SINGLE_QUOTE=47, LOWERCASE=48, UPPERCASE=49, DIGIT=50, NEWLINE=51, BLOCKCOMMENT=52, 
		LINECOMMENT=53, WHITE_SPACE=54;
	public static final int
		RULE_start = 0, RULE_variable_type = 1, RULE_string = 2, RULE_number = 3, 
		RULE_label = 4, RULE_first_operators = 5, RULE_second_operators = 6, RULE_operators = 7, 
		RULE_logical_operators = 8, RULE_relational_operators = 9, RULE_other_operators = 10, 
		RULE_lexer_predefined_words = 11, RULE_constant_words = 12, RULE_conditional_words = 13, 
		RULE_loop_words = 14, RULE_simple_punctuations = 15, RULE_symbol_words = 16, 
		RULE_any_declaration = 17, RULE_assigned_expression = 18, RULE_variable_declaration_vartype = 19, 
		RULE_variable_declaration_no_vartype = 20, RULE_array_size = 21, RULE_array_variable = 22, 
		RULE_array_assign = 23, RULE_array_declaration_vartype = 24, RULE_array_declaration_no_vartype = 25, 
		RULE_print_statement = 26, RULE_value_print = 27, RULE_extended_value_print = 28, 
		RULE_scan_statement = 29, RULE_display_message_parameter = 30, RULE_value_parameter = 31, 
		RULE_constant_declaration = 32, RULE_return_statement = 33, RULE_return_value = 34, 
		RULE_expression = 35, RULE_value_expression = 36, RULE_comparison_statement = 37, 
		RULE_assignment_statement = 38, RULE_value_comparison = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variable_type", "string", "number", "label", "first_operators", 
			"second_operators", "operators", "logical_operators", "relational_operators", 
			"other_operators", "lexer_predefined_words", "constant_words", "conditional_words", 
			"loop_words", "simple_punctuations", "symbol_words", "any_declaration", 
			"assigned_expression", "variable_declaration_vartype", "variable_declaration_no_vartype", 
			"array_size", "array_variable", "array_assign", "array_declaration_vartype", 
			"array_declaration_no_vartype", "print_statement", "value_print", "extended_value_print", 
			"scan_statement", "display_message_parameter", "value_parameter", "constant_declaration", 
			"return_statement", "return_value", "expression", "value_expression", 
			"comparison_statement", "assignment_statement", "value_comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'f'", "'create'", "'constant'", "'return'", "'print'", 
			"'scan'", "'void'", "'if'", "'else'", "'else if'", "'then'", "'for'", 
			"'up to'", "'down to'", "'while'", "'int'", "'bool'", "'float'", "'String'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'<='", "'>'", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'='", "'=='", 
			"'?'", "':'", "'.'", "';'", "','", "'_'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", 
			"IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", "WHILE", 
			"INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "LESS", 
			"LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", "COLON", 
			"DOT", "SEMICOLON", "COMMA", "UNDERSCORE", "SINGLE_QUOTE", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT", "WHITE_SPACE"
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
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
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
			setState(80);
			print_statement();
			setState(81);
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
			setState(83);
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
			setState(85);
			match(T__0);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(86);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(87);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(88);
					label();
					}
					break;
				case 4:
					{
					setState(89);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(94);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(96);
					match(MINUS);
					}
				}

				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(99);
					match(DIGIT);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(105);
				match(DOT);
				setState(107); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(106);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(109); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(111);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(114);
					match(MINUS);
					}
				}

				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(117);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
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
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
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
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				{
				setState(124);
				variable_type();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(130);
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
				setState(133); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					variable_type();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					label();
					}
					} 
				}
				setState(146);
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
		enterRule(_localctx, 10, RULE_first_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		enterRule(_localctx, 12, RULE_second_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 14, RULE_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(151);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(152);
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
		enterRule(_localctx, 16, RULE_logical_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 18, RULE_relational_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 20, RULE_other_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(159);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(160);
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
		enterRule(_localctx, 22, RULE_lexer_predefined_words);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
				{
				setState(163);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(164);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(165);
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
				setState(166);
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
				setState(167);
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
				setState(168);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(169);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(170);
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
		enterRule(_localctx, 24, RULE_constant_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_conditional_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		enterRule(_localctx, 28, RULE_loop_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 30, RULE_simple_punctuations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 32, RULE_symbol_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		enterRule(_localctx, 34, RULE_any_declaration);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
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
		enterRule(_localctx, 36, RULE_assigned_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(189);
				string();
				}
				break;
			case 2:
				{
				setState(190);
				number();
				}
				break;
			case 3:
				{
				setState(191);
				label();
				}
				break;
			case 4:
				{
				setState(192);
				expression(0);
				}
				break;
			case 5:
				{
				setState(193);
				comparison_statement(0);
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
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 38, RULE_variable_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			variable_type();
			setState(197);
			match(WHITE_SPACE);
			setState(198);
			label();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==WHITE_SPACE) {
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(199);
					match(WHITE_SPACE);
					}
				}

				setState(202);
				match(ASSIGN);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(203);
					match(WHITE_SPACE);
					}
				}

				setState(206);
				assigned_expression();
				}
			}

			setState(209);
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
		enterRule(_localctx, 40, RULE_variable_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			label();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(212);
				match(WHITE_SPACE);
				}
			}

			setState(215);
			match(ASSIGN);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(216);
				match(WHITE_SPACE);
				}
			}

			setState(219);
			assigned_expression();
			setState(220);
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
		enterRule(_localctx, 42, RULE_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 44, RULE_array_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			label();
			setState(225);
			match(OPEN_BRACE);
			setState(226);
			array_size();
			setState(227);
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
		public Array_variableContext array_variable() {
			return getRuleContext(Array_variableContext.class,0);
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
		enterRule(_localctx, 46, RULE_array_assign);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(229);
					match(WHITE_SPACE);
					}
				}

				setState(232);
				match(ASSIGN);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(233);
					match(WHITE_SPACE);
					}
				}

				setState(236);
				match(CREATE);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(237);
					match(WHITE_SPACE);
					}
				}

				setState(240);
				variable_type();
				setState(241);
				match(OPEN_BRACE);
				setState(242);
				array_size();
				setState(243);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(245);
					match(WHITE_SPACE);
					}
				}

				setState(248);
				match(ASSIGN);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(249);
					match(WHITE_SPACE);
					}
				}

				setState(252);
				array_variable();
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
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 48, RULE_array_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			variable_type();
			setState(256);
			match(OPEN_BRACE);
			setState(257);
			match(CLOSE_BRACE);
			setState(258);
			match(WHITE_SPACE);
			setState(259);
			label();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==WHITE_SPACE) {
				{
				setState(260);
				array_assign();
				}
			}

			setState(263);
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
		public List<Array_variableContext> array_variable() {
			return getRuleContexts(Array_variableContext.class);
		}
		public Array_variableContext array_variable(int i) {
			return getRuleContext(Array_variableContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
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
		enterRule(_localctx, 50, RULE_array_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			array_variable();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(266);
				match(WHITE_SPACE);
				}
			}

			setState(269);
			match(ASSIGN);
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(270);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(273);
				match(CREATE);
				}
			}

			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(276);
				match(WHITE_SPACE);
				}
			}

			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(279);
				assigned_expression();
				}
				break;
			case 2:
				{
				setState(280);
				array_variable();
				}
				break;
			}
			setState(283);
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
		enterRule(_localctx, 52, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(PRINT);
			setState(286);
			match(OPEN_PAREN);
			setState(287);
			value_print();
			setState(288);
			match(CLOSE_PAREN);
			setState(289);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MainParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MainParser.PLUS, i);
		}
		public List<Extended_value_printContext> extended_value_print() {
			return getRuleContexts(Extended_value_printContext.class);
		}
		public Extended_value_printContext extended_value_print(int i) {
			return getRuleContext(Extended_value_printContext.class,i);
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
		enterRule(_localctx, 54, RULE_value_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			string();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(292);
				match(WHITE_SPACE);
				}
			}

			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(295);
				match(PLUS);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(296);
					match(WHITE_SPACE);
					}
				}

				setState(299);
				extended_value_print();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(300);
					match(WHITE_SPACE);
					}
				}

				}
				}
				setState(307);
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
		enterRule(_localctx, 56, RULE_extended_value_print);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
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
		enterRule(_localctx, 58, RULE_scan_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(SCAN);
			setState(314);
			match(OPEN_PAREN);
			setState(315);
			display_message_parameter();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(316);
				match(WHITE_SPACE);
				}
			}

			setState(319);
			match(COMMA);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(320);
				match(WHITE_SPACE);
				}
			}

			setState(323);
			value_parameter();
			setState(324);
			match(CLOSE_PAREN);
			setState(325);
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
		enterRule(_localctx, 60, RULE_display_message_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 62, RULE_value_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 64, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(CONSTANT);
			setState(332);
			match(WHITE_SPACE);
			setState(333);
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
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 66, RULE_return_statement);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(RETURN);
				setState(336);
				match(WHITE_SPACE);
				setState(337);
				return_value();
				setState(338);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(RETURN);
				setState(341);
				match(WHITE_SPACE);
				setState(342);
				variable_type();
				setState(343);
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
		enterRule(_localctx, 68, RULE_return_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(348);
				string();
				}
				break;
			case 2:
				{
				setState(349);
				number();
				}
				break;
			case 3:
				{
				setState(350);
				label();
				}
				break;
			case 4:
				{
				setState(351);
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
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
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
				setState(355);
				value_expression();
				}
				break;
			case OPEN_PAREN:
				{
				setState(356);
				match(OPEN_PAREN);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(357);
					match(WHITE_SPACE);
					}
				}

				setState(360);
				expression(0);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(361);
					match(WHITE_SPACE);
					}
				}

				setState(364);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(368);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(369);
						match(WHITE_SPACE);
						}
					}

					{
					setState(372);
					operators();
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(373);
						match(WHITE_SPACE);
						}
					}

					setState(376);
					expression(3);
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 72, RULE_value_expression);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case DOT:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				number();
				}
				break;
			case T__1:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case UNDERSCORE:
			case LOWERCASE:
			case UPPERCASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				label();
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
		public Relational_operatorsContext relational_operators() {
			return getRuleContext(Relational_operatorsContext.class,0);
		}
		public Logical_operatorsContext logical_operators() {
			return getRuleContext(Logical_operatorsContext.class,0);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_comparison_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(388);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(389);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(390);
					match(NOT);
					}
				}

				setState(393);
				match(OPEN_PAREN);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(394);
					match(WHITE_SPACE);
					}
				}

				setState(397);
				comparison_statement(0);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(398);
					match(WHITE_SPACE);
					}
				}

				setState(401);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Comparison_statementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
					setState(405);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(406);
						match(WHITE_SPACE);
						}
					}

					setState(411);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS:
					case LESSQEUAL:
					case GREATER:
					case GREATEREQUAL:
						{
						setState(409);
						relational_operators();
						}
						break;
					case ANDAND:
					case OROR:
						{
						setState(410);
						logical_operators();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(413);
						match(WHITE_SPACE);
						}
					}

					setState(416);
					comparison_statement(3);
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode NOT() { return getToken(MainParser.NOT, 0); }
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
		enterRule(_localctx, 76, RULE_assignment_statement);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case UNDERSCORE:
			case LOWERCASE:
			case UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				label();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(424);
					match(WHITE_SPACE);
					}
				}

				setState(427);
				match(EQUAL);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(428);
					match(WHITE_SPACE);
					}
				}

				setState(433);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
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
					setState(431);
					value_comparison();
					}
					break;
				case T__0:
					{
					setState(432);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OPEN_PAREN:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(435);
					match(NOT);
					}
				}

				setState(438);
				match(OPEN_PAREN);
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
				assignment_statement();
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(443);
					match(WHITE_SPACE);
					}
				}

				setState(446);
				match(CLOSE_PAREN);
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

	public static class Value_comparisonContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
		enterRule(_localctx, 78, RULE_value_comparison);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case UNDERSCORE:
			case LOWERCASE:
			case UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				label();
				}
				break;
			case MINUS:
			case DOT:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				number();
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
		case 35:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 37:
			return comparison_statement_sempred((Comparison_statementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comparison_statement_sempred(Comparison_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4]\n\4\r\4\16\4^\3\4\3\4\3\5\5\5d\n\5\3\5"+
		"\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\6\5n\n\5\r\5\16\5o\3\5\5\5s\n\5\3\5\5"+
		"\5v\n\5\3\5\6\5y\n\5\r\5\16\5z\5\5}\n\5\3\6\7\6\u0080\n\6\f\6\16\6\u0083"+
		"\13\6\3\6\6\6\u0086\n\6\r\6\16\6\u0087\3\6\7\6\u008b\n\6\f\6\16\6\u008e"+
		"\13\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\7\3\7\3\b\3\b\3\t\3\t\5"+
		"\t\u009c\n\t\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\5\23\u00be\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00c5\n\24\3\25\3\25\3\25\3\25\5\25\u00cb\n\25\3\25\3\25\5\25\u00cf"+
		"\n\25\3\25\5\25\u00d2\n\25\3\25\3\25\3\26\3\26\5\26\u00d8\n\26\3\26\3"+
		"\26\5\26\u00dc\n\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\5\31\u00e9\n\31\3\31\3\31\5\31\u00ed\n\31\3\31\3\31\5\31\u00f1\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f9\n\31\3\31\3\31\5\31\u00fd"+
		"\n\31\3\31\5\31\u0100\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0108\n"+
		"\32\3\32\3\32\3\33\3\33\5\33\u010e\n\33\3\33\3\33\5\33\u0112\n\33\3\33"+
		"\5\33\u0115\n\33\3\33\5\33\u0118\n\33\3\33\3\33\5\33\u011c\n\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u0128\n\35\3\35\3\35"+
		"\5\35\u012c\n\35\3\35\3\35\5\35\u0130\n\35\7\35\u0132\n\35\f\35\16\35"+
		"\u0135\13\35\3\36\3\36\3\36\5\36\u013a\n\36\3\37\3\37\3\37\3\37\5\37\u0140"+
		"\n\37\3\37\3\37\5\37\u0144\n\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u015d\n#\3$\3$\3$\3$\5"+
		"$\u0163\n$\3%\3%\3%\3%\5%\u0169\n%\3%\3%\5%\u016d\n%\3%\3%\5%\u0171\n"+
		"%\3%\3%\5%\u0175\n%\3%\3%\5%\u0179\n%\3%\3%\7%\u017d\n%\f%\16%\u0180\13"+
		"%\3&\3&\5&\u0184\n&\3\'\3\'\3\'\3\'\5\'\u018a\n\'\3\'\3\'\5\'\u018e\n"+
		"\'\3\'\3\'\5\'\u0192\n\'\3\'\3\'\5\'\u0196\n\'\3\'\3\'\5\'\u019a\n\'\3"+
		"\'\3\'\5\'\u019e\n\'\3\'\5\'\u01a1\n\'\3\'\3\'\7\'\u01a5\n\'\f\'\16\'"+
		"\u01a8\13\'\3(\3(\5(\u01ac\n(\3(\3(\5(\u01b0\n(\3(\3(\5(\u01b4\n(\3(\5"+
		"(\u01b7\n(\3(\3(\5(\u01bb\n(\3(\3(\5(\u01bf\n(\3(\3(\5(\u01c3\n(\3)\3"+
		")\5)\u01c7\n)\3)\2\4HL*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNP\2\r\3\2\23\26\5\2\4\4\60\60\62\63\3\2#%\3"+
		"\2!\"\3\2&\'\3\2\35 \3\2\5\n\3\2\13\16\3\2\17\22\3\2(\61\3\2\27\34\2\u01f4"+
		"\2R\3\2\2\2\4U\3\2\2\2\6W\3\2\2\2\b|\3\2\2\2\n\u0081\3\2\2\2\f\u0095\3"+
		"\2\2\2\16\u0097\3\2\2\2\20\u009b\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2"+
		"\2\2\26\u00a3\3\2\2\2\30\u00ad\3\2\2\2\32\u00af\3\2\2\2\34\u00b1\3\2\2"+
		"\2\36\u00b3\3\2\2\2 \u00b5\3\2\2\2\"\u00b7\3\2\2\2$\u00bd\3\2\2\2&\u00c4"+
		"\3\2\2\2(\u00c6\3\2\2\2*\u00d5\3\2\2\2,\u00e0\3\2\2\2.\u00e2\3\2\2\2\60"+
		"\u00ff\3\2\2\2\62\u0101\3\2\2\2\64\u010b\3\2\2\2\66\u011f\3\2\2\28\u0125"+
		"\3\2\2\2:\u0139\3\2\2\2<\u013b\3\2\2\2>\u0149\3\2\2\2@\u014b\3\2\2\2B"+
		"\u014d\3\2\2\2D\u015c\3\2\2\2F\u0162\3\2\2\2H\u0170\3\2\2\2J\u0183\3\2"+
		"\2\2L\u0195\3\2\2\2N\u01c2\3\2\2\2P\u01c6\3\2\2\2RS\5\66\34\2ST\7\2\2"+
		"\3T\3\3\2\2\2UV\t\2\2\2V\5\3\2\2\2W\\\7\3\2\2X]\7\64\2\2Y]\5\30\r\2Z]"+
		"\5\n\6\2[]\78\2\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\3\2\2a\7\3\2\2\2bd\7\"\2\2cb\3\2"+
		"\2\2cd\3\2\2\2dh\3\2\2\2eg\7\64\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2km\7-\2\2ln\7\64\2\2ml\3\2\2\2no\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2pr\3\2\2\2qs\7\4\2\2rq\3\2\2\2rs\3\2\2\2s}\3\2\2\2tv\7"+
		"\"\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\7\64\2\2xw\3\2\2\2yz\3\2\2\2zx"+
		"\3\2\2\2z{\3\2\2\2{}\3\2\2\2|c\3\2\2\2|u\3\2\2\2}\t\3\2\2\2~\u0080\5\4"+
		"\3\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\t\3\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008c\3\2\2\2\u0089\u008b\5\4\3\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0092\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\n\6\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\13\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0095\u0096\t\4\2\2\u0096\r\3\2\2\2\u0097\u0098"+
		"\t\5\2\2\u0098\17\3\2\2\2\u0099\u009c\5\f\7\2\u009a\u009c\5\16\b\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\21\3\2\2\2\u009d\u009e\t\6\2"+
		"\2\u009e\23\3\2\2\2\u009f\u00a0\t\7\2\2\u00a0\25\3\2\2\2\u00a1\u00a4\5"+
		"\22\n\2\u00a2\u00a4\5\24\13\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\27\3\2\2\2\u00a5\u00ae\5\32\16\2\u00a6\u00ae\5\34\17\2\u00a7\u00ae"+
		"\5\36\20\2\u00a8\u00ae\5 \21\2\u00a9\u00ae\5\"\22\2\u00aa\u00ae\5\26\f"+
		"\2\u00ab\u00ae\5\20\t\2\u00ac\u00ae\5\4\3\2\u00ad\u00a5\3\2\2\2\u00ad"+
		"\u00a6\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2"+
		"\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\31\3\2\2\2\u00af\u00b0\t\b\2\2\u00b0\33\3\2\2\2\u00b1\u00b2\t\t\2\2\u00b2"+
		"\35\3\2\2\2\u00b3\u00b4\t\n\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\t\13\2\2"+
		"\u00b6!\3\2\2\2\u00b7\u00b8\t\f\2\2\u00b8#\3\2\2\2\u00b9\u00be\5(\25\2"+
		"\u00ba\u00be\5*\26\2\u00bb\u00be\5\62\32\2\u00bc\u00be\5\64\33\2\u00bd"+
		"\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be%\3\2\2\2\u00bf\u00c5\5\6\4\2\u00c0\u00c5\5\b\5\2\u00c1\u00c5"+
		"\5\n\6\2\u00c2\u00c5\5H%\2\u00c3\u00c5\5L\'\2\u00c4\u00bf\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\'\3\2\2\2\u00c6\u00c7\5\4\3\2\u00c7\u00c8\78\2\2\u00c8\u00d1"+
		"\5\n\6\2\u00c9\u00cb\78\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\7)\2\2\u00cd\u00cf\78\2\2\u00ce\u00cd\3\2\2"+
		"\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\5&\24\2\u00d1\u00ca"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7.\2\2\u00d4"+
		")\3\2\2\2\u00d5\u00d7\5\n\6\2\u00d6\u00d8\78\2\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7)\2\2\u00da\u00dc\78\2"+
		"\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\5&\24\2\u00de\u00df\7.\2\2\u00df+\3\2\2\2\u00e0\u00e1\5H%\2\u00e1-\3"+
		"\2\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e4\7\33\2\2\u00e4\u00e5\5,\27\2\u00e5"+
		"\u00e6\7\34\2\2\u00e6/\3\2\2\2\u00e7\u00e9\78\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\7)\2\2\u00eb\u00ed"+
		"\78\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\7\5\2\2\u00ef\u00f1\78\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5\4\3\2\u00f3\u00f4\7\33\2\2\u00f4"+
		"\u00f5\5,\27\2\u00f5\u00f6\7\34\2\2\u00f6\u0100\3\2\2\2\u00f7\u00f9\7"+
		"8\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\7)\2\2\u00fb\u00fd\78\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2"+
		"\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\5.\30\2\u00ff\u00e8\3\2\2\2\u00ff\u00f8"+
		"\3\2\2\2\u0100\61\3\2\2\2\u0101\u0102\5\4\3\2\u0102\u0103\7\33\2\2\u0103"+
		"\u0104\7\34\2\2\u0104\u0105\78\2\2\u0105\u0107\5\n\6\2\u0106\u0108\5\60"+
		"\31\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\7.\2\2\u010a\63\3\2\2\2\u010b\u010d\5.\30\2\u010c\u010e\78\2\2"+
		"\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\7)\2\2\u0110\u0112\78\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0115\7\5\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0117\3\2\2\2\u0116\u0118\78\2\2\u0117\u0116\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011c\5&\24\2\u011a\u011c\5."+
		"\30\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\7.\2\2\u011e\65\3\2\2\2\u011f\u0120\7\b\2\2\u0120\u0121\7\27\2"+
		"\2\u0121\u0122\58\35\2\u0122\u0123\7\30\2\2\u0123\u0124\7.\2\2\u0124\67"+
		"\3\2\2\2\u0125\u0127\5\6\4\2\u0126\u0128\78\2\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0133\3\2\2\2\u0129\u012b\7!\2\2\u012a\u012c\78\2"+
		"\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f"+
		"\5:\36\2\u012e\u0130\78\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u0129\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u01349\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u013a"+
		"\5\6\4\2\u0137\u013a\5\n\6\2\u0138\u013a\5H%\2\u0139\u0136\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a;\3\2\2\2\u013b\u013c\7\t\2\2"+
		"\u013c\u013d\7\27\2\2\u013d\u013f\5> \2\u013e\u0140\78\2\2\u013f\u013e"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\7/\2\2\u0142"+
		"\u0144\78\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0146\5@!\2\u0146\u0147\7\30\2\2\u0147\u0148\7.\2\2\u0148="+
		"\3\2\2\2\u0149\u014a\5\6\4\2\u014a?\3\2\2\2\u014b\u014c\5H%\2\u014cA\3"+
		"\2\2\2\u014d\u014e\7\6\2\2\u014e\u014f\78\2\2\u014f\u0150\5$\23\2\u0150"+
		"C\3\2\2\2\u0151\u0152\7\7\2\2\u0152\u0153\78\2\2\u0153\u0154\5F$\2\u0154"+
		"\u0155\7.\2\2\u0155\u015d\3\2\2\2\u0156\u0157\7\7\2\2\u0157\u0158\78\2"+
		"\2\u0158\u0159\5\4\3\2\u0159\u015a\7.\2\2\u015a\u015b\b#\1\2\u015b\u015d"+
		"\3\2\2\2\u015c\u0151\3\2\2\2\u015c\u0156\3\2\2\2\u015dE\3\2\2\2\u015e"+
		"\u0163\5\6\4\2\u015f\u0163\5\b\5\2\u0160\u0163\5\n\6\2\u0161\u0163\5H"+
		"%\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163G\3\2\2\2\u0164\u0165\b%\1\2\u0165\u0171\5J&\2\u0166"+
		"\u0168\7\27\2\2\u0167\u0169\78\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016c\5H%\2\u016b\u016d\78\2\2\u016c\u016b"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7\30\2\2"+
		"\u016f\u0171\3\2\2\2\u0170\u0164\3\2\2\2\u0170\u0166\3\2\2\2\u0171\u017e"+
		"\3\2\2\2\u0172\u0174\f\4\2\2\u0173\u0175\78\2\2\u0174\u0173\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\5\20\t\2\u0177\u0179\7"+
		"8\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\5H%\5\u017b\u017d\3\2\2\2\u017c\u0172\3\2\2\2\u017d\u0180\3\2\2"+
		"\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017fI\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0184\5\b\5\2\u0182\u0184\5\n\6\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0182\3\2\2\2\u0184K\3\2\2\2\u0185\u0186\b\'\1\2\u0186\u0196\5P)\2\u0187"+
		"\u0196\5N(\2\u0188\u018a\7(\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2"+
		"\2\u018a\u018b\3\2\2\2\u018b\u018d\7\27\2\2\u018c\u018e\78\2\2\u018d\u018c"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\5L\'\2\u0190"+
		"\u0192\78\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\7\30\2\2\u0194\u0196\3\2\2\2\u0195\u0185\3\2\2\2\u0195"+
		"\u0187\3\2\2\2\u0195\u0189\3\2\2\2\u0196\u01a6\3\2\2\2\u0197\u0199\f\4"+
		"\2\2\u0198\u019a\78\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u019e\5\24\13\2\u019c\u019e\5\22\n\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019c\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\78\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\5L"+
		"\'\5\u01a3\u01a5\3\2\2\2\u01a4\u0197\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7M\3\2\2\2\u01a8\u01a6\3\2\2\2"+
		"\u01a9\u01ab\5\n\6\2\u01aa\u01ac\78\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\7*\2\2\u01ae\u01b0\78\2\2\u01af"+
		"\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b4\5P"+
		")\2\u01b2\u01b4\5\6\4\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"\u01c3\3\2\2\2\u01b5\u01b7\7(\2\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\7\27\2\2\u01b9\u01bb\78\2\2\u01ba"+
		"\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\5N"+
		"(\2\u01bd\u01bf\78\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c1\7\30\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01a9\3\2\2\2"+
		"\u01c2\u01b6\3\2\2\2\u01c3O\3\2\2\2\u01c4\u01c7\5\n\6\2\u01c5\u01c7\5"+
		"\b\5\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7Q\3\2\2\2E\\^chor"+
		"uz|\u0081\u0087\u008c\u0092\u009b\u00a3\u00ad\u00bd\u00c4\u00ca\u00ce"+
		"\u00d1\u00d7\u00db\u00e8\u00ec\u00f0\u00f8\u00fc\u00ff\u0107\u010d\u0111"+
		"\u0114\u0117\u011b\u0127\u012b\u012f\u0133\u0139\u013f\u0143\u015c\u0162"+
		"\u0168\u016c\u0170\u0174\u0178\u017e\u0183\u0189\u018d\u0191\u0195\u0199"+
		"\u019d\u01a0\u01a6\u01ab\u01af\u01b3\u01b6\u01ba\u01be\u01c2\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}