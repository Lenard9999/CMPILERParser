// Generated from Main.g4 by ANTLR 4.9
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", 
			"IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", "WHILE", 
			"INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "LESS", 
			"LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", "COLON", 
			"DOT", "SEMICOLON", "COMMA", "UNDERSCORE", "SINGLE_QUOTE", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT", "WHITE_SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u013d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\5\64\u0121\n\64\3\64\5\64\u0124\n\64\3\64\3"+
		"\64\3\65\3\65\5\65\u012a\n\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\6\67\u0138\n\67\r\67\16\67\u0139\3\67\3\67\2\28\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3"+
		"\2\7\3\2c|\3\2C\\\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0140\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3"+
		"o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tz\3\2\2\2\13\u0083\3\2\2\2\r\u008a\3"+
		"\2\2\2\17\u0090\3\2\2\2\21\u0095\3\2\2\2\23\u009a\3\2\2\2\25\u009d\3\2"+
		"\2\2\27\u00a2\3\2\2\2\31\u00aa\3\2\2\2\33\u00af\3\2\2\2\35\u00b3\3\2\2"+
		"\2\37\u00b9\3\2\2\2!\u00c1\3\2\2\2#\u00c7\3\2\2\2%\u00cb\3\2\2\2\'\u00d0"+
		"\3\2\2\2)\u00d6\3\2\2\2+\u00dd\3\2\2\2-\u00df\3\2\2\2/\u00e1\3\2\2\2\61"+
		"\u00e3\3\2\2\2\63\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67\u00e9\3\2\2\29\u00eb"+
		"\3\2\2\2;\u00ee\3\2\2\2=\u00f0\3\2\2\2?\u00f3\3\2\2\2A\u00f5\3\2\2\2C"+
		"\u00f7\3\2\2\2E\u00f9\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K\u0100\3\2"+
		"\2\2M\u0103\3\2\2\2O\u0105\3\2\2\2Q\u0107\3\2\2\2S\u010a\3\2\2\2U\u010c"+
		"\3\2\2\2W\u010e\3\2\2\2Y\u0110\3\2\2\2[\u0112\3\2\2\2]\u0114\3\2\2\2_"+
		"\u0116\3\2\2\2a\u0118\3\2\2\2c\u011a\3\2\2\2e\u011c\3\2\2\2g\u0123\3\2"+
		"\2\2i\u0127\3\2\2\2k\u012f\3\2\2\2m\u0137\3\2\2\2op\7$\2\2p\4\3\2\2\2"+
		"qr\7h\2\2r\6\3\2\2\2st\7e\2\2tu\7t\2\2uv\7g\2\2vw\7c\2\2wx\7v\2\2xy\7"+
		"g\2\2y\b\3\2\2\2z{\7e\2\2{|\7q\2\2|}\7p\2\2}~\7u\2\2~\177\7v\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082\n\3\2\2\2\u0083\u0084"+
		"\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7v\2\2\u0086\u0087\7w\2\2\u0087"+
		"\u0088\7t\2\2\u0088\u0089\7p\2\2\u0089\f\3\2\2\2\u008a\u008b\7r\2\2\u008b"+
		"\u008c\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2"+
		"\u008f\16\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092\7e\2\2\u0092\u0093\7"+
		"c\2\2\u0093\u0094\7p\2\2\u0094\20\3\2\2\2\u0095\u0096\7x\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u0098\7k\2\2\u0098\u0099\7f\2\2\u0099\22\3\2\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7h\2\2\u009c\24\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f"+
		"\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\26\3\2\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7\"\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7h\2\2\u00a9\30\3\2\2\2"+
		"\u00aa\u00ab\7v\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae"+
		"\7p\2\2\u00ae\32\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2\34\3\2\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6"+
		"\7\"\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7q\2\2\u00b8\36\3\2\2\2\u00b9"+
		"\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7y\2\2\u00bc\u00bd\7p\2\2"+
		"\u00bd\u00be\7\"\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0 \3\2"+
		"\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7g\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9"+
		"\7p\2\2\u00c9\u00ca\7v\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7d\2\2\u00cc\u00cd"+
		"\7q\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7n\2\2\u00cf&\3\2\2\2\u00d0\u00d1"+
		"\7h\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7t\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7i\2\2"+
		"\u00dc*\3\2\2\2\u00dd\u00de\7*\2\2\u00de,\3\2\2\2\u00df\u00e0\7+\2\2\u00e0"+
		".\3\2\2\2\u00e1\u00e2\7}\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7\177\2\2\u00e4"+
		"\62\3\2\2\2\u00e5\u00e6\7]\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8"+
		"\66\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7>\2\2\u00ec"+
		"\u00ed\7?\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef<\3\2\2\2\u00f0\u00f1"+
		"\7@\2\2\u00f1\u00f2\7?\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4@\3"+
		"\2\2\2\u00f5\u00f6\7/\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8D\3\2"+
		"\2\2\u00f9\u00fa\7\61\2\2\u00faF\3\2\2\2\u00fb\u00fc\7\'\2\2\u00fcH\3"+
		"\2\2\2\u00fd\u00fe\7(\2\2\u00fe\u00ff\7(\2\2\u00ffJ\3\2\2\2\u0100\u0101"+
		"\7~\2\2\u0101\u0102\7~\2\2\u0102L\3\2\2\2\u0103\u0104\7#\2\2\u0104N\3"+
		"\2\2\2\u0105\u0106\7?\2\2\u0106P\3\2\2\2\u0107\u0108\7?\2\2\u0108\u0109"+
		"\7?\2\2\u0109R\3\2\2\2\u010a\u010b\7A\2\2\u010bT\3\2\2\2\u010c\u010d\7"+
		"<\2\2\u010dV\3\2\2\2\u010e\u010f\7\60\2\2\u010fX\3\2\2\2\u0110\u0111\7"+
		"=\2\2\u0111Z\3\2\2\2\u0112\u0113\7.\2\2\u0113\\\3\2\2\2\u0114\u0115\7"+
		"a\2\2\u0115^\3\2\2\2\u0116\u0117\7)\2\2\u0117`\3\2\2\2\u0118\u0119\t\2"+
		"\2\2\u0119b\3\2\2\2\u011a\u011b\t\3\2\2\u011bd\3\2\2\2\u011c\u011d\t\4"+
		"\2\2\u011df\3\2\2\2\u011e\u0120\7\17\2\2\u011f\u0121\7\f\2\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0124\7\f\2\2\u0123"+
		"\u011e\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b\64"+
		"\2\2\u0126h\3\2\2\2\u0127\u0129\7\61\2\2\u0128\u012a\13\2\2\2\u0129\u0128"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\61\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012e\b\65\2\2\u012ej\3\2\2\2\u012f\u0130\7"+
		"\61\2\2\u0130\u0131\7\61\2\2\u0131\u0132\3\2\2\2\u0132\u0133\n\5\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\b\66\2\2\u0135l\3\2\2\2\u0136\u0138\t\6\2\2"+
		"\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b\67\2\2\u013cn\3\2\2\2\7\2\u0120"+
		"\u0123\u0129\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}