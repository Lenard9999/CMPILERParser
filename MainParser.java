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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CREATE=7, CONSTANT=8, 
		RETURN=9, PRINT=10, SCAN=11, IF=12, ELSE=13, ELSE_IF=14, FOR=15, UP_TO=16, 
		DOWN_TO=17, WHILE=18, VOID=19, INT_DEC=20, BOOLEAN_DEC=21, FLOAT_DEC=22, 
		STRING_DEC=23, OPEN_PAREN=24, CLOSE_PAREN=25, OPEN_BRACKET=26, CLOSE_BRACKET=27, 
		OPEN_BRACE=28, CLOSE_BRACE=29, LESS=30, LESSQEUAL=31, GREATER=32, GREATEREQUAL=33, 
		PLUS=34, MINUS=35, MULTI=36, DIV=37, MOD=38, AND=39, OR=40, ANDAND=41, 
		OROR=42, NOT=43, ASSIGN=44, EQUAL=45, QUESTION=46, COLON=47, DOT=48, SEMICOLON=49, 
		COMMA=50, NONDIGIT=51, DIGIT=52, NEWLINE=53, BLOCKCOMMENT=54, LINECOMMENT=55;
	public static final int
		RULE_start = 0, RULE_variable_type = 1, RULE_string = 2, RULE_number = 3, 
		RULE_label = 4, RULE_white_space = 5, RULE_first_operators = 6, RULE_second_operators = 7, 
		RULE_operators = 8, RULE_simple_punctuations = 9, RULE_any_declaration = 10, 
		RULE_assigned_expression = 11, RULE_variable_declaration_vartype = 12, 
		RULE_variable_declaration_no_vartype = 13, RULE_array_size = 14, RULE_array_variable = 15, 
		RULE_array_declaration_vartype = 16, RULE_array_declaration_no_vartype = 17, 
		RULE_scan_statement = 18, RULE_display_message_parameter = 19, RULE_value_parameter = 20, 
		RULE_constant_declaration = 21, RULE_expression = 22, RULE_sub_expression = 23, 
		RULE_value_expression = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variable_type", "string", "number", "label", "white_space", 
			"first_operators", "second_operators", "operators", "simple_punctuations", 
			"any_declaration", "assigned_expression", "variable_declaration_vartype", 
			"variable_declaration_no_vartype", "array_size", "array_variable", "array_declaration_vartype", 
			"array_declaration_no_vartype", "scan_statement", "display_message_parameter", 
			"value_parameter", "constant_declaration", "expression", "sub_expression", 
			"value_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'f'", "' '", "'\r'", "'\t'", "'\n'", "'create'", "'constant'", 
			"'return'", "'print'", "'scan'", "'if'", "'else'", "'else if'", "'for'", 
			"'up to'", "'down to'", "'while'", "'void'", "'int'", "'bool'", "'float'", 
			"'string'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", 
			"'||'", "'!'", "'='", "'=='", "'?'", "':'", "'.'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CREATE", "CONSTANT", "RETURN", 
			"PRINT", "SCAN", "IF", "ELSE", "ELSE_IF", "FOR", "UP_TO", "DOWN_TO", 
			"WHILE", "VOID", "INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", 
			"CLOSE_BRACE", "LESS", "LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", 
			"MINUS", "MULTI", "DIV", "MOD", "AND", "OR", "ANDAND", "OROR", "NOT", 
			"ASSIGN", "EQUAL", "QUESTION", "COLON", "DOT", "SEMICOLON", "COMMA", 
			"NONDIGIT", "DIGIT", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT"
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
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
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
			setState(50);
			any_declaration();
			setState(51);
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
			setState(53);
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
		public List<TerminalNode> NONDIGIT() { return getTokens(MainParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(MainParser.NONDIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
		}
		public List<Simple_punctuationsContext> simple_punctuations() {
			return getRuleContexts(Simple_punctuationsContext.class);
		}
		public Simple_punctuationsContext simple_punctuations(int i) {
			return getRuleContext(Simple_punctuationsContext.class,i);
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
			setState(55);
			match(T__0);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << QUESTION) | (1L << DOT) | (1L << COMMA) | (1L << NONDIGIT) | (1L << DIGIT))) != 0)) {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONDIGIT:
					{
					setState(56);
					match(NONDIGIT);
					}
					break;
				case DIGIT:
					{
					setState(57);
					match(DIGIT);
					}
					break;
				case T__2:
				case T__3:
				case T__4:
				case T__5:
					{
					setState(58);
					white_space();
					}
					break;
				case NOT:
				case QUESTION:
				case DOT:
				case COMMA:
					{
					setState(59);
					simple_punctuations();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(67);
					match(MINUS);
					}
				}

				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(70);
					match(DIGIT);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(76);
				match(DOT);
				setState(78); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(77);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(80); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(82);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(85);
					match(MINUS);
					}
				}

				setState(89); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(91); 
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
		public List<TerminalNode> NONDIGIT() { return getTokens(MainParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(MainParser.NONDIGIT, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(95);
					match(NONDIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class White_spaceContext extends ParserRuleContext {
		public White_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_white_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterWhite_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitWhite_space(this);
		}
	}

	public final White_spaceContext white_space() throws RecognitionException {
		White_spaceContext _localctx = new White_spaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_white_space);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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
			setState(102);
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
			setState(104);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(106);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(107);
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

	public static class Simple_punctuationsContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MainParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public TerminalNode NOT() { return getToken(MainParser.NOT, 0); }
		public TerminalNode QUESTION() { return getToken(MainParser.QUESTION, 0); }
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
		enterRule(_localctx, 18, RULE_simple_punctuations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << QUESTION) | (1L << DOT) | (1L << COMMA))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_any_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			variable_declaration_vartype();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 22, RULE_assigned_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(114);
				string();
				}
				break;
			case MINUS:
			case DOT:
			case DIGIT:
				{
				setState(115);
				number();
				}
				break;
			case NONDIGIT:
				{
				setState(116);
				label();
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

	public static class Variable_declaration_vartypeContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
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
		enterRule(_localctx, 24, RULE_variable_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			variable_type();
			setState(120);
			white_space();
			setState(121);
			label();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ASSIGN))) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(122);
					white_space();
					}
				}

				setState(125);
				match(ASSIGN);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(126);
					white_space();
					}
				}

				setState(129);
				assigned_expression();
				}
			}

			setState(132);
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
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
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
		enterRule(_localctx, 26, RULE_variable_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			label();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(135);
				white_space();
				}
			}

			setState(138);
			match(ASSIGN);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(139);
				white_space();
				}
			}

			setState(142);
			assigned_expression();
			setState(143);
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
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 28, RULE_array_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << DOT) | (1L << DIGIT))) != 0)) {
					{
					{
					setState(145);
					number();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				{
				setState(151);
				label();
				setState(152);
				operators();
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONDIGIT:
					{
					setState(153);
					label();
					}
					break;
				case MINUS:
				case DOT:
				case DIGIT:
					{
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(154);
						number();
						}
						}
						setState(157); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << DOT) | (1L << DIGIT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(161);
				label();
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
		enterRule(_localctx, 30, RULE_array_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			label();
			setState(165);
			match(OPEN_BRACE);
			setState(166);
			array_size();
			setState(167);
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

	public static class Array_declaration_vartypeContext extends ParserRuleContext {
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(MainParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(MainParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(MainParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(MainParser.CLOSE_BRACE, i);
		}
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
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
		enterRule(_localctx, 32, RULE_array_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			variable_type();
			setState(170);
			match(OPEN_BRACE);
			setState(171);
			match(CLOSE_BRACE);
			setState(172);
			white_space();
			setState(173);
			label();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ASSIGN))) != 0)) {
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(174);
					white_space();
					}
				}

				setState(177);
				match(ASSIGN);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(178);
					white_space();
					}
				}

				setState(181);
				match(CREATE);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(182);
					white_space();
					}
				}

				setState(185);
				variable_type();
				setState(186);
				match(OPEN_BRACE);
				setState(187);
				array_size();
				setState(188);
				match(CLOSE_BRACE);
				}
			}

			setState(192);
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
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
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
		enterRule(_localctx, 34, RULE_array_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			array_variable();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(195);
				white_space();
				}
			}

			setState(198);
			match(ASSIGN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(199);
				white_space();
				}
			}

			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(202);
				assigned_expression();
				}
				break;
			case 2:
				{
				setState(203);
				array_variable();
				}
				break;
			}
			setState(206);
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

	public static class Scan_statementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(MainParser.SCAN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Display_message_parameterContext display_message_parameter() {
			return getRuleContext(Display_message_parameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 36, RULE_scan_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SCAN);
			setState(209);
			match(OPEN_PAREN);
			setState(210);
			display_message_parameter();
			setState(211);
			match(COMMA);
			setState(212);
			match(CLOSE_PAREN);
			setState(213);
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
		enterRule(_localctx, 38, RULE_display_message_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 40, RULE_value_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		public White_spaceContext white_space() {
			return getRuleContext(White_spaceContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(CONSTANT);
			setState(220);
			white_space();
			setState(221);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Sub_expressionContext sub_expression() {
			return getRuleContext(Sub_expressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public First_operatorsContext first_operators() {
			return getRuleContext(First_operatorsContext.class,0);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case DOT:
			case NONDIGIT:
			case DIGIT:
				{
				setState(224);
				sub_expression(0);
				}
				break;
			case OPEN_PAREN:
				{
				setState(225);
				match(OPEN_PAREN);
				setState(226);
				expression(0);
				setState(227);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(231);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(232);
					first_operators();
					}
					setState(233);
					sub_expression(0);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Sub_expressionContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Sub_expressionContext sub_expression() {
			return getRuleContext(Sub_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Second_operatorsContext second_operators() {
			return getRuleContext(Second_operatorsContext.class,0);
		}
		public Sub_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSub_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSub_expression(this);
		}
	}

	public final Sub_expressionContext sub_expression() throws RecognitionException {
		return sub_expression(0);
	}

	private Sub_expressionContext sub_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sub_expressionContext _localctx = new Sub_expressionContext(_ctx, _parentState);
		Sub_expressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_sub_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(241);
			value_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sub_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sub_expression);
					setState(243);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(244);
					second_operators();
					}
					setState(245);
					expression(0);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 48, RULE_value_expression);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case DOT:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				number();
				}
				break;
			case NONDIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 23:
			return sub_expression_sempred((Sub_expressionContext)_localctx, predIndex);
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
	private boolean sub_expression_sempred(Sub_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0103\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B"+
		"\13\4\3\4\3\4\3\5\5\5G\n\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\6\5Q\n"+
		"\5\r\5\16\5R\3\5\5\5V\n\5\3\5\5\5Y\n\5\3\5\6\5\\\n\5\r\5\16\5]\5\5`\n"+
		"\5\3\6\6\6c\n\6\r\6\16\6d\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\no\n\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\5\rx\n\r\3\16\3\16\3\16\3\16\5\16~\n\16\3\16"+
		"\3\16\5\16\u0082\n\16\3\16\5\16\u0085\n\16\3\16\3\16\3\17\3\17\5\17\u008b"+
		"\n\17\3\17\3\17\5\17\u008f\n\17\3\17\3\17\3\17\3\20\7\20\u0095\n\20\f"+
		"\20\16\20\u0098\13\20\3\20\3\20\3\20\3\20\6\20\u009e\n\20\r\20\16\20\u009f"+
		"\5\20\u00a2\n\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00b2\n\22\3\22\3\22\5\22\u00b6\n\22\3\22"+
		"\3\22\5\22\u00ba\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c1\n\22\3\22\3"+
		"\22\3\23\3\23\5\23\u00c7\n\23\3\23\3\23\5\23\u00cb\n\23\3\23\3\23\5\23"+
		"\u00cf\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e8\n\30"+
		"\3\30\3\30\3\30\3\30\7\30\u00ee\n\30\f\30\16\30\u00f1\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u00fa\n\31\f\31\16\31\u00fd\13\31\3\32"+
		"\3\32\5\32\u0101\n\32\3\32\2\4.\60\33\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\2\7\3\2\26\31\3\2\5\b\3\2&(\3\2$%\6\2--\60\60\62"+
		"\62\64\64\2\u010d\2\64\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b_\3\2\2\2\nb\3"+
		"\2\2\2\ff\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22n\3\2\2\2\24p\3\2\2\2\26r"+
		"\3\2\2\2\30w\3\2\2\2\32y\3\2\2\2\34\u0088\3\2\2\2\36\u00a4\3\2\2\2 \u00a6"+
		"\3\2\2\2\"\u00ab\3\2\2\2$\u00c4\3\2\2\2&\u00d2\3\2\2\2(\u00d9\3\2\2\2"+
		"*\u00db\3\2\2\2,\u00dd\3\2\2\2.\u00e7\3\2\2\2\60\u00f2\3\2\2\2\62\u0100"+
		"\3\2\2\2\64\65\5\26\f\2\65\66\7\2\2\3\66\3\3\2\2\2\678\t\2\2\28\5\3\2"+
		"\2\29@\7\3\2\2:?\7\65\2\2;?\7\66\2\2<?\5\f\7\2=?\5\24\13\2>:\3\2\2\2>"+
		";\3\2\2\2><\3\2\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2"+
		"B@\3\2\2\2CD\7\3\2\2D\7\3\2\2\2EG\7%\2\2FE\3\2\2\2FG\3\2\2\2GK\3\2\2\2"+
		"HJ\7\66\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2"+
		"\2NP\7\62\2\2OQ\7\66\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2"+
		"\2\2TV\7\4\2\2UT\3\2\2\2UV\3\2\2\2V`\3\2\2\2WY\7%\2\2XW\3\2\2\2XY\3\2"+
		"\2\2Y[\3\2\2\2Z\\\7\66\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`"+
		"\3\2\2\2_F\3\2\2\2_X\3\2\2\2`\t\3\2\2\2ac\7\65\2\2ba\3\2\2\2cd\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2e\13\3\2\2\2fg\t\3\2\2g\r\3\2\2\2hi\t\4\2\2i\17\3"+
		"\2\2\2jk\t\5\2\2k\21\3\2\2\2lo\5\16\b\2mo\5\20\t\2nl\3\2\2\2nm\3\2\2\2"+
		"o\23\3\2\2\2pq\t\6\2\2q\25\3\2\2\2rs\5\32\16\2s\27\3\2\2\2tx\5\6\4\2u"+
		"x\5\b\5\2vx\5\n\6\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\31\3\2\2\2yz\5\4\3"+
		"\2z{\5\f\7\2{\u0084\5\n\6\2|~\5\f\7\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2"+
		"\177\u0081\7.\2\2\u0080\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\5\30\r\2\u0084}\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\63\2\2\u0087\33\3\2\2"+
		"\2\u0088\u008a\5\n\6\2\u0089\u008b\5\f\7\2\u008a\u0089\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7.\2\2\u008d\u008f\5\f\7\2\u008e"+
		"\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5\30"+
		"\r\2\u0091\u0092\7\63\2\2\u0092\35\3\2\2\2\u0093\u0095\5\b\5\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u00a5\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\5\n\6\2\u009a\u00a1\5\22"+
		"\n\2\u009b\u00a2\5\n\6\2\u009c\u009e\5\b\5\2\u009d\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009b\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a5\5\n\6\2\u00a4\u0096\3\2\2\2\u00a4\u0099\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\5\n\6\2\u00a7\u00a8\7\36\2\2\u00a8\u00a9"+
		"\5\36\20\2\u00a9\u00aa\7\37\2\2\u00aa!\3\2\2\2\u00ab\u00ac\5\4\3\2\u00ac"+
		"\u00ad\7\36\2\2\u00ad\u00ae\7\37\2\2\u00ae\u00af\5\f\7\2\u00af\u00c0\5"+
		"\n\6\2\u00b0\u00b2\5\f\7\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\7.\2\2\u00b4\u00b6\5\f\7\2\u00b5\u00b4\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\7\t\2\2\u00b8"+
		"\u00ba\5\f\7\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7\36\2\2\u00bd\u00be\5\36\20\2\u00be"+
		"\u00bf\7\37\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b1\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\63\2\2\u00c3#\3\2\2\2\u00c4\u00c6"+
		"\5 \21\2\u00c5\u00c7\5\f\7\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\7.\2\2\u00c9\u00cb\5\f\7\2\u00ca\u00c9\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00cf\5\30\r\2\u00cd"+
		"\u00cf\5 \21\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\7\63\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4"+
		"\7\32\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d6\7\64\2\2\u00d6\u00d7\7\33\2"+
		"\2\u00d7\u00d8\7\63\2\2\u00d8\'\3\2\2\2\u00d9\u00da\5\6\4\2\u00da)\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00de\7\n\2\2\u00de\u00df"+
		"\5\f\7\2\u00df\u00e0\5\26\f\2\u00e0-\3\2\2\2\u00e1\u00e2\b\30\1\2\u00e2"+
		"\u00e8\5\60\31\2\u00e3\u00e4\7\32\2\2\u00e4\u00e5\5.\30\2\u00e5\u00e6"+
		"\7\33\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e3\3\2\2\2"+
		"\u00e8\u00ef\3\2\2\2\u00e9\u00ea\f\4\2\2\u00ea\u00eb\5\16\b\2\u00eb\u00ec"+
		"\5\60\31\2\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\u00f1\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0/\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f2\u00f3\b\31\1\2\u00f3\u00f4\5\62\32\2\u00f4\u00fb\3\2\2\2"+
		"\u00f5\u00f6\f\4\2\2\u00f6\u00f7\5\20\t\2\u00f7\u00f8\5.\30\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\61\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\5\b\5"+
		"\2\u00ff\u0101\5\n\6\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\63"+
		"\3\2\2\2\">@FKRUX]_dnw}\u0081\u0084\u008a\u008e\u0096\u009f\u00a1\u00a4"+
		"\u00b1\u00b5\u00b9\u00c0\u00c6\u00ca\u00ce\u00e7\u00ef\u00fb\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}