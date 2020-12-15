// Generated from c:\Users\Lenard\Documents\CMPILERParser\Main.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOWERCASE=1, UPPERCASE=2, DIGIT=3, NEWLINE=4, BLOCKCOMMENT=5, LINECOMMENT=6, 
		STRING=7, NUMBER=8, LABEL=9, WHITE_SPACE=10, VARIABLE_TYPE=11, OPERATORS=12, 
		SIMPLE_PUNCTUATIONS=13, CREATE=14, CONSTANT=15, RETURN=16, PRINT=17, SCAN=18, 
		IF=19, ELSE=20, ELSE_IF=21, FOR=22, UP_TO=23, DOWN_TO=24, WHILE=25, VOID=26, 
		INT_DEC=27, BOOLEAN_DEC=28, FLOAT_DEC=29, STRING_DEC=30, OPEN_PAREN=31, 
		CLOSE_PAREN=32, OPEN_BRACKET=33, CLOSE_BRACKET=34, OPEN_BRACE=35, CLOSE_BRACE=36, 
		LESS=37, LESSQEUAL=38, GREATER=39, GREATEREQUAL=40, PLUS=41, MINUS=42, 
		MULTI=43, DIV=44, MOD=45, AND=46, OR=47, ANDAND=48, OROR=49, NOT=50, ASSIGN=51, 
		EQUAL=52, QUESTION=53, COLON=54, DOT=55, SEMICOLON=56, COMMA=57;
	public static final int
		RULE_start = 0, RULE_any_declaration = 1, RULE_assigned_expression = 2, 
		RULE_variable_declaration_vartype = 3, RULE_variable_declaration_no_vartype = 4, 
		RULE_array_size = 5, RULE_array_variable = 6, RULE_array_declaration_vartype = 7, 
		RULE_array_declaration_no_vartype = 8, RULE_scan_statement = 9, RULE_display_message_parameter = 10, 
		RULE_value_parameter = 11, RULE_constant_declaration = 12, RULE_expression = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "any_declaration", "assigned_expression", "variable_declaration_vartype", 
			"variable_declaration_no_vartype", "array_size", "array_variable", "array_declaration_vartype", 
			"array_declaration_no_vartype", "scan_statement", "display_message_parameter", 
			"value_parameter", "constant_declaration", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'create'", "'constant'", "'return'", "'print'", "'scan'", 
			"'if'", "'else'", "'else if'", "'for'", "'up to'", "'down to'", "'while'", 
			"'void'", "'int'", "'bool'", "'float'", "'String'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'!'", "'='", "'=='", "'?'", 
			"':'", "'.'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOWERCASE", "UPPERCASE", "DIGIT", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT", 
			"STRING", "NUMBER", "LABEL", "WHITE_SPACE", "VARIABLE_TYPE", "OPERATORS", 
			"SIMPLE_PUNCTUATIONS", "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", 
			"IF", "ELSE", "ELSE_IF", "FOR", "UP_TO", "DOWN_TO", "WHILE", "VOID", 
			"INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "LESS", 
			"LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "AND", "OR", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", 
			"COLON", "DOT", "SEMICOLON", "COMMA"
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
		public TerminalNode EOF() { return getToken(MainParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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
	}

	public final Any_declarationContext any_declaration() throws RecognitionException {
		Any_declarationContext _localctx = new Any_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_any_declaration);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
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
		public TerminalNode STRING() { return getToken(MainParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(MainParser.NUMBER, 0); }
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public Assigned_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigned_expression; }
	}

	public final Assigned_expressionContext assigned_expression() throws RecognitionException {
		Assigned_expressionContext _localctx = new Assigned_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assigned_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LABEL))) != 0)) ) {
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

	public static class Variable_declaration_vartypeContext extends ParserRuleContext {
		public TerminalNode VARIABLE_TYPE() { return getToken(MainParser.VARIABLE_TYPE, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public Variable_declaration_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_vartype; }
	}

	public final Variable_declaration_vartypeContext variable_declaration_vartype() throws RecognitionException {
		Variable_declaration_vartypeContext _localctx = new Variable_declaration_vartypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(VARIABLE_TYPE);
			setState(39);
			match(WHITE_SPACE);
			setState(40);
			match(LABEL);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE || _la==ASSIGN) {
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(41);
					match(WHITE_SPACE);
					}
				}

				setState(44);
				match(ASSIGN);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(45);
					match(WHITE_SPACE);
					}
				}

				setState(48);
				assigned_expression();
				}
			}

			setState(51);
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
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
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
	}

	public final Variable_declaration_no_vartypeContext variable_declaration_no_vartype() throws RecognitionException {
		Variable_declaration_no_vartypeContext _localctx = new Variable_declaration_no_vartypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LABEL);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(54);
				match(WHITE_SPACE);
				}
			}

			setState(57);
			match(ASSIGN);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(58);
				match(WHITE_SPACE);
				}
			}

			setState(61);
			assigned_expression();
			setState(62);
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
		public List<TerminalNode> LABEL() { return getTokens(MainParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(MainParser.LABEL, i);
		}
		public TerminalNode OPERATORS() { return getToken(MainParser.OPERATORS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(MainParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MainParser.NUMBER, i);
		}
		public Array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size; }
	}

	public final Array_sizeContext array_size() throws RecognitionException {
		Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER) {
					{
					{
					setState(64);
					match(NUMBER);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				{
				setState(70);
				match(LABEL);
				setState(71);
				match(OPERATORS);
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(72);
					match(LABEL);
					}
					break;
				case NUMBER:
					{
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(73);
						match(NUMBER);
						}
						}
						setState(76); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NUMBER );
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
				setState(80);
				match(LABEL);
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
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Array_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_variable; }
	}

	public final Array_variableContext array_variable() throws RecognitionException {
		Array_variableContext _localctx = new Array_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LABEL);
			setState(84);
			match(OPEN_BRACE);
			setState(85);
			array_size();
			setState(86);
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
		public List<TerminalNode> VARIABLE_TYPE() { return getTokens(MainParser.VARIABLE_TYPE); }
		public TerminalNode VARIABLE_TYPE(int i) {
			return getToken(MainParser.VARIABLE_TYPE, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(MainParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(MainParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(MainParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(MainParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
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
	}

	public final Array_declaration_vartypeContext array_declaration_vartype() throws RecognitionException {
		Array_declaration_vartypeContext _localctx = new Array_declaration_vartypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(VARIABLE_TYPE);
			setState(89);
			match(OPEN_BRACE);
			setState(90);
			match(CLOSE_BRACE);
			setState(91);
			match(WHITE_SPACE);
			setState(92);
			match(LABEL);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE || _la==ASSIGN) {
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(93);
					match(WHITE_SPACE);
					}
				}

				setState(96);
				match(ASSIGN);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(97);
					match(WHITE_SPACE);
					}
				}

				setState(100);
				match(CREATE);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(101);
					match(WHITE_SPACE);
					}
				}

				setState(104);
				match(VARIABLE_TYPE);
				setState(105);
				match(OPEN_BRACE);
				setState(106);
				array_size();
				setState(107);
				match(CLOSE_BRACE);
				}
			}

			setState(111);
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
		public Array_declaration_no_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration_no_vartype; }
	}

	public final Array_declaration_no_vartypeContext array_declaration_no_vartype() throws RecognitionException {
		Array_declaration_no_vartypeContext _localctx = new Array_declaration_no_vartypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			array_variable();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(114);
				match(WHITE_SPACE);
				}
			}

			setState(117);
			match(ASSIGN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(118);
				match(WHITE_SPACE);
				}
			}

			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(121);
				assigned_expression();
				}
				break;
			case 2:
				{
				setState(122);
				array_variable();
				}
				break;
			}
			setState(125);
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
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scan_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(SCAN);
			setState(128);
			match(OPEN_PAREN);
			setState(129);
			display_message_parameter();
			setState(130);
			match(COMMA);
			setState(131);
			match(CLOSE_PAREN);
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

	public static class Display_message_parameterContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MainParser.STRING, 0); }
		public Display_message_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_message_parameter; }
	}

	public final Display_message_parameterContext display_message_parameter() throws RecognitionException {
		Display_message_parameterContext _localctx = new Display_message_parameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_display_message_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Value_parameterContext value_parameter() throws RecognitionException {
		Value_parameterContext _localctx = new Value_parameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value_parameter);
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
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(CONSTANT);
			setState(139);
			match(WHITE_SPACE);
			setState(140);
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
		public TerminalNode NUMBER() { return getToken(MainParser.NUMBER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode OPERATORS() { return getToken(MainParser.OPERATORS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(143);
				match(NUMBER);
				}
				break;
			case OPEN_PAREN:
				{
				setState(144);
				match(OPEN_PAREN);
				setState(145);
				expression(0);
				setState(146);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(150);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					{
					setState(151);
					match(OPERATORS);
					}
					setState(152);
					expression(4);
					}
					} 
				}
				setState(157);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5-\n\5\3\5\3\5\5\5\61\n\5\3\5\5\5\64\n\5"+
		"\3\5\3\5\3\6\3\6\5\6:\n\6\3\6\3\6\5\6>\n\6\3\6\3\6\3\6\3\7\7\7D\n\7\f"+
		"\7\16\7G\13\7\3\7\3\7\3\7\3\7\6\7M\n\7\r\7\16\7N\5\7Q\n\7\3\7\5\7T\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\t\3\t\5\te\n\t"+
		"\3\t\3\t\5\ti\n\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\t\3\t\3\n\3\n\5\nv\n"+
		"\n\3\n\3\n\5\nz\n\n\3\n\3\n\5\n~\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0097\n\17\3\17\3\17\3\17\7\17\u009c\n\17\f\17\16\17\u009f"+
		"\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\t\13"+
		"\2\u00a8\2\36\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n\67\3\2\2\2\f"+
		"S\3\2\2\2\16U\3\2\2\2\20Z\3\2\2\2\22s\3\2\2\2\24\u0081\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u008a\3\2\2\2\32\u008c\3\2\2\2\34\u0096\3\2\2\2\36\37\7\2"+
		"\2\3\37\3\3\2\2\2 %\5\b\5\2!%\5\n\6\2\"%\5\20\t\2#%\5\22\n\2$ \3\2\2\2"+
		"$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\t\2\2\2\'\7\3\2\2\2()\7"+
		"\r\2\2)*\7\f\2\2*\63\7\13\2\2+-\7\f\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2"+
		".\60\7\65\2\2/\61\7\f\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\64"+
		"\5\6\4\2\63,\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7:\2\2\66\t\3\2"+
		"\2\2\679\7\13\2\28:\7\f\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\7\65\2\2<"+
		">\7\f\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\6\4\2@A\7:\2\2A\13\3\2\2\2"+
		"BD\7\n\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FT\3\2\2\2GE\3\2\2\2"+
		"HI\7\13\2\2IP\7\16\2\2JQ\7\13\2\2KM\7\n\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2"+
		"\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RT\7\13\2\2SE\3"+
		"\2\2\2SH\3\2\2\2SR\3\2\2\2T\r\3\2\2\2UV\7\13\2\2VW\7%\2\2WX\5\f\7\2XY"+
		"\7&\2\2Y\17\3\2\2\2Z[\7\r\2\2[\\\7%\2\2\\]\7&\2\2]^\7\f\2\2^o\7\13\2\2"+
		"_a\7\f\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\7\65\2\2ce\7\f\2\2dc\3\2\2"+
		"\2de\3\2\2\2ef\3\2\2\2fh\7\20\2\2gi\7\f\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2"+
		"\2\2jk\7\r\2\2kl\7%\2\2lm\5\f\7\2mn\7&\2\2np\3\2\2\2o`\3\2\2\2op\3\2\2"+
		"\2pq\3\2\2\2qr\7:\2\2r\21\3\2\2\2su\5\16\b\2tv\7\f\2\2ut\3\2\2\2uv\3\2"+
		"\2\2vw\3\2\2\2wy\7\65\2\2xz\7\f\2\2yx\3\2\2\2yz\3\2\2\2z}\3\2\2\2{~\5"+
		"\6\4\2|~\5\16\b\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177\u0080\7:\2\2\u0080"+
		"\23\3\2\2\2\u0081\u0082\7\24\2\2\u0082\u0083\7!\2\2\u0083\u0084\5\26\f"+
		"\2\u0084\u0085\7;\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7:\2\2\u0087\25"+
		"\3\2\2\2\u0088\u0089\7\t\2\2\u0089\27\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\31\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008e\7\f\2\2\u008e\u008f\5\4\3"+
		"\2\u008f\33\3\2\2\2\u0090\u0091\b\17\1\2\u0091\u0097\7\n\2\2\u0092\u0093"+
		"\7!\2\2\u0093\u0094\5\34\17\2\u0094\u0095\7\"\2\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0090\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009d\3\2\2\2\u0098\u0099"+
		"\f\5\2\2\u0099\u009a\7\16\2\2\u009a\u009c\5\34\17\6\u009b\u0098\3\2\2"+
		"\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\35"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\25$,\60\639=ENPS`dhouy}\u0096\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}