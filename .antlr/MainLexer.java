// Generated from c:\Users\Lenard\Documents\CMPILERParser\Main.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWERCASE", "UPPERCASE", "DIGIT", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT", 
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


	public MainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0182\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\5\5~\n\5\3\5\5\5\u0081\n\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6"+
		"\u0089\n\6\f\6\16\6\u008c\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7"+
		"\u0097\n\7\f\7\16\7\u009a\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a4"+
		"\n\b\f\b\16\b\u00a7\13\b\3\b\3\b\3\t\5\t\u00ac\n\t\3\t\7\t\u00af\n\t\f"+
		"\t\16\t\u00b2\13\t\3\t\3\t\6\t\u00b6\n\t\r\t\16\t\u00b7\3\t\5\t\u00bb"+
		"\n\t\3\t\5\t\u00be\n\t\3\t\6\t\u00c1\n\t\r\t\16\t\u00c2\5\t\u00c5\n\t"+
		"\3\n\3\n\3\n\6\n\u00ca\n\n\r\n\16\n\u00cb\3\13\3\13\3\f\3\f\3\f\3\f\5"+
		"\f\u00d4\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00db\n\r\3\16\3\16\3\16\3\16\5\16"+
		"\u00e1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3\u008a\2;\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2\7\3\2c|\3\2"+
		"C|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u019e\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t\u0080\3\2\2\2\13"+
		"\u0084\3\2\2\2\r\u0092\3\2\2\2\17\u009d\3\2\2\2\21\u00c4\3\2\2\2\23\u00c9"+
		"\3\2\2\2\25\u00cd\3\2\2\2\27\u00d3\3\2\2\2\31\u00da\3\2\2\2\33\u00e0\3"+
		"\2\2\2\35\u00e2\3\2\2\2\37\u00e9\3\2\2\2!\u00f2\3\2\2\2#\u00f9\3\2\2\2"+
		"%\u00ff\3\2\2\2\'\u0104\3\2\2\2)\u0107\3\2\2\2+\u010c\3\2\2\2-\u0114\3"+
		"\2\2\2/\u0118\3\2\2\2\61\u011e\3\2\2\2\63\u0126\3\2\2\2\65\u012c\3\2\2"+
		"\2\67\u0131\3\2\2\29\u0135\3\2\2\2;\u013a\3\2\2\2=\u0140\3\2\2\2?\u0147"+
		"\3\2\2\2A\u0149\3\2\2\2C\u014b\3\2\2\2E\u014d\3\2\2\2G\u014f\3\2\2\2I"+
		"\u0151\3\2\2\2K\u0153\3\2\2\2M\u0155\3\2\2\2O\u0158\3\2\2\2Q\u015a\3\2"+
		"\2\2S\u015d\3\2\2\2U\u015f\3\2\2\2W\u0161\3\2\2\2Y\u0163\3\2\2\2[\u0165"+
		"\3\2\2\2]\u0167\3\2\2\2_\u0169\3\2\2\2a\u016b\3\2\2\2c\u016e\3\2\2\2e"+
		"\u0171\3\2\2\2g\u0173\3\2\2\2i\u0175\3\2\2\2k\u0178\3\2\2\2m\u017a\3\2"+
		"\2\2o\u017c\3\2\2\2q\u017e\3\2\2\2s\u0180\3\2\2\2uv\t\2\2\2v\4\3\2\2\2"+
		"wx\t\3\2\2x\6\3\2\2\2yz\t\4\2\2z\b\3\2\2\2{}\7\17\2\2|~\7\f\2\2}|\3\2"+
		"\2\2}~\3\2\2\2~\u0081\3\2\2\2\177\u0081\7\f\2\2\u0080{\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\5\2\2\u0083\n\3\2\2\2\u0084"+
		"\u0085\7\61\2\2\u0085\u0086\7,\2\2\u0086\u008a\3\2\2\2\u0087\u0089\13"+
		"\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7,"+
		"\2\2\u008e\u008f\7\61\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\6\2\2\u0091"+
		"\f\3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7\61\2\2\u0094\u0098\3\2\2"+
		"\2\u0095\u0097\n\5\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\b\7\2\2\u009c\16\3\2\2\2\u009d\u00a5\7$\2\2\u009e\u00a4\5\3\2\2"+
		"\u009f\u00a4\5\5\3\2\u00a0\u00a4\5\7\4\2\u00a1\u00a4\5\25\13\2\u00a2\u00a4"+
		"\5\33\16\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7$\2\2\u00a9\20\3\2\2\2\u00aa\u00ac\7/\2\2\u00ab\u00aa\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00af\t\4\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7\60\2\2\u00b4\u00b6\t"+
		"\4\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\7h\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c5\3\2\2\2\u00bc\u00be\7/\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\t\4"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00ab\3\2\2\2\u00c4\u00bd\3\2"+
		"\2\2\u00c5\22\3\2\2\2\u00c6\u00ca\5\3\2\2\u00c7\u00ca\5\5\3\2\u00c8\u00ca"+
		"\7a\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\24\3\2\2"+
		"\2\u00cd\u00ce\t\6\2\2\u00ce\26\3\2\2\2\u00cf\u00d4\5\67\34\2\u00d0\u00d4"+
		"\59\35\2\u00d1\u00d4\5;\36\2\u00d2\u00d4\5=\37\2\u00d3\u00cf\3\2\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\30\3\2\2"+
		"\2\u00d5\u00db\5S*\2\u00d6\u00db\5U+\2\u00d7\u00db\5W,\2\u00d8\u00db\5"+
		"Y-\2\u00d9\u00db\5[.\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\32\3\2\2\2\u00dc"+
		"\u00e1\5o8\2\u00dd\u00e1\5s:\2\u00de\u00e1\5e\63\2\u00df\u00e1\5k\66\2"+
		"\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\36\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7"+
		"p\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0\u00f1\7v\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"\u00f8\7p\2\2\u00f8\"\3\2\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7t\2\2\u00fb"+
		"\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe$\3\2\2\2\u00ff"+
		"\u0100\7u\2\2\u0100\u0101\7e\2\2\u0101\u0102\7c\2\2\u0102\u0103\7p\2\2"+
		"\u0103&\3\2\2\2\u0104\u0105\7k\2\2\u0105\u0106\7h\2\2\u0106(\3\2\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7n\2\2\u0109\u010a\7u\2\2\u010a\u010b\7g\2\2"+
		"\u010b*\3\2\2\2\u010c\u010d\7g\2\2\u010d\u010e\7n\2\2\u010e\u010f\7u\2"+
		"\2\u010f\u0110\7g\2\2\u0110\u0111\7\"\2\2\u0111\u0112\7k\2\2\u0112\u0113"+
		"\7h\2\2\u0113,\3\2\2\2\u0114\u0115\7h\2\2\u0115\u0116\7q\2\2\u0116\u0117"+
		"\7t\2\2\u0117.\3\2\2\2\u0118\u0119\7w\2\2\u0119\u011a\7r\2\2\u011a\u011b"+
		"\7\"\2\2\u011b\u011c\7v\2\2\u011c\u011d\7q\2\2\u011d\60\3\2\2\2\u011e"+
		"\u011f\7f\2\2\u011f\u0120\7q\2\2\u0120\u0121\7y\2\2\u0121\u0122\7p\2\2"+
		"\u0122\u0123\7\"\2\2\u0123\u0124\7v\2\2\u0124\u0125\7q\2\2\u0125\62\3"+
		"\2\2\2\u0126\u0127\7y\2\2\u0127\u0128\7j\2\2\u0128\u0129\7k\2\2\u0129"+
		"\u012a\7n\2\2\u012a\u012b\7g\2\2\u012b\64\3\2\2\2\u012c\u012d\7x\2\2\u012d"+
		"\u012e\7q\2\2\u012e\u012f\7k\2\2\u012f\u0130\7f\2\2\u0130\66\3\2\2\2\u0131"+
		"\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134\7v\2\2\u01348\3\2\2\2\u0135"+
		"\u0136\7d\2\2\u0136\u0137\7q\2\2\u0137\u0138\7q\2\2\u0138\u0139\7n\2\2"+
		"\u0139:\3\2\2\2\u013a\u013b\7h\2\2\u013b\u013c\7n\2\2\u013c\u013d\7q\2"+
		"\2\u013d\u013e\7c\2\2\u013e\u013f\7v\2\2\u013f<\3\2\2\2\u0140\u0141\7"+
		"U\2\2\u0141\u0142\7v\2\2\u0142\u0143\7t\2\2\u0143\u0144\7k\2\2\u0144\u0145"+
		"\7p\2\2\u0145\u0146\7i\2\2\u0146>\3\2\2\2\u0147\u0148\7*\2\2\u0148@\3"+
		"\2\2\2\u0149\u014a\7+\2\2\u014aB\3\2\2\2\u014b\u014c\7}\2\2\u014cD\3\2"+
		"\2\2\u014d\u014e\7\177\2\2\u014eF\3\2\2\2\u014f\u0150\7]\2\2\u0150H\3"+
		"\2\2\2\u0151\u0152\7_\2\2\u0152J\3\2\2\2\u0153\u0154\7>\2\2\u0154L\3\2"+
		"\2\2\u0155\u0156\7>\2\2\u0156\u0157\7?\2\2\u0157N\3\2\2\2\u0158\u0159"+
		"\7@\2\2\u0159P\3\2\2\2\u015a\u015b\7@\2\2\u015b\u015c\7?\2\2\u015cR\3"+
		"\2\2\2\u015d\u015e\7-\2\2\u015eT\3\2\2\2\u015f\u0160\7/\2\2\u0160V\3\2"+
		"\2\2\u0161\u0162\7,\2\2\u0162X\3\2\2\2\u0163\u0164\7\61\2\2\u0164Z\3\2"+
		"\2\2\u0165\u0166\7\'\2\2\u0166\\\3\2\2\2\u0167\u0168\7(\2\2\u0168^\3\2"+
		"\2\2\u0169\u016a\7~\2\2\u016a`\3\2\2\2\u016b\u016c\7(\2\2\u016c\u016d"+
		"\7(\2\2\u016db\3\2\2\2\u016e\u016f\7~\2\2\u016f\u0170\7~\2\2\u0170d\3"+
		"\2\2\2\u0171\u0172\7#\2\2\u0172f\3\2\2\2\u0173\u0174\7?\2\2\u0174h\3\2"+
		"\2\2\u0175\u0176\7?\2\2\u0176\u0177\7?\2\2\u0177j\3\2\2\2\u0178\u0179"+
		"\7A\2\2\u0179l\3\2\2\2\u017a\u017b\7<\2\2\u017bn\3\2\2\2\u017c\u017d\7"+
		"\60\2\2\u017dp\3\2\2\2\u017e\u017f\7=\2\2\u017fr\3\2\2\2\u0180\u0181\7"+
		".\2\2\u0181t\3\2\2\2\25\2}\u0080\u008a\u0098\u00a3\u00a5\u00ab\u00b0\u00b7"+
		"\u00ba\u00bd\u00c2\u00c4\u00c9\u00cb\u00d3\u00da\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}