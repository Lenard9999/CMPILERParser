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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CREATE=7, CONSTANT=8, 
		RETURN=9, PRINT=10, SCAN=11, IF=12, ELSE=13, ELSE_IF=14, THEN=15, FOR=16, 
		UP_TO=17, DOWN_TO=18, WHILE=19, VOID=20, INT_DEC=21, BOOLEAN_DEC=22, FLOAT_DEC=23, 
		STRING_DEC=24, OPEN_PAREN=25, CLOSE_PAREN=26, OPEN_BRACKET=27, CLOSE_BRACKET=28, 
		OPEN_BRACE=29, CLOSE_BRACE=30, LESS=31, LESSQEUAL=32, GREATER=33, GREATEREQUAL=34, 
		PLUS=35, MINUS=36, MULTI=37, DIV=38, MOD=39, AND=40, OR=41, ANDAND=42, 
		OROR=43, NOT=44, ASSIGN=45, EQUAL=46, QUESTION=47, COLON=48, DOT=49, SEMICOLON=50, 
		COMMA=51, NONDIGIT=52, DIGIT=53, NEWLINE=54, BLOCKCOMMENT=55, LINECOMMENT=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CREATE", "CONSTANT", 
			"RETURN", "PRINT", "SCAN", "IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", 
			"DOWN_TO", "WHILE", "VOID", "INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", 
			"CLOSE_BRACE", "LESS", "LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", 
			"MINUS", "MULTI", "DIV", "MOD", "AND", "OR", "ANDAND", "OROR", "NOT", 
			"ASSIGN", "EQUAL", "QUESTION", "COLON", "DOT", "SEMICOLON", "COMMA", 
			"NONDIGIT", "DIGIT", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'f'", "' '", "'\r'", "'\t'", "'\n'", "'create'", "'constant'", 
			"'return'", "'print'", "'scan'", "'if'", "'else'", "'else if'", "'then'", 
			"'for'", "'up to'", "'down to'", "'while'", "'void'", "'int'", "'bool'", 
			"'float'", "'string'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", 
			"'&&'", "'||'", "'!'", "'='", "'=='", "'?'", "':'", "'.'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CREATE", "CONSTANT", "RETURN", 
			"PRINT", "SCAN", "IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\5\67\u012b\n\67\3\67\5\67\u012e\n\67\3\67\3\67\38\38\38\38"+
		"\78\u0136\n8\f8\168\u0139\138\38\38\38\38\38\39\39\39\39\79\u0144\n9\f"+
		"9\169\u0147\139\39\39\3\u0137\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\5\5\2C\\aac|\3\2\62;\4\2\f\f\17"+
		"\17\2\u014d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty"+
		"\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\177\3\2\2\2\21\u0086\3\2\2\2\23\u008f"+
		"\3\2\2\2\25\u0096\3\2\2\2\27\u009c\3\2\2\2\31\u00a1\3\2\2\2\33\u00a4\3"+
		"\2\2\2\35\u00a9\3\2\2\2\37\u00b1\3\2\2\2!\u00b6\3\2\2\2#\u00ba\3\2\2\2"+
		"%\u00c0\3\2\2\2\'\u00c8\3\2\2\2)\u00ce\3\2\2\2+\u00d3\3\2\2\2-\u00d7\3"+
		"\2\2\2/\u00dc\3\2\2\2\61\u00e2\3\2\2\2\63\u00e9\3\2\2\2\65\u00eb\3\2\2"+
		"\2\67\u00ed\3\2\2\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f3\3\2\2\2?\u00f5"+
		"\3\2\2\2A\u00f7\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u00ff\3\2\2\2I"+
		"\u0101\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2\2\2O\u0107\3\2\2\2Q\u0109\3\2"+
		"\2\2S\u010b\3\2\2\2U\u010d\3\2\2\2W\u0110\3\2\2\2Y\u0113\3\2\2\2[\u0115"+
		"\3\2\2\2]\u0117\3\2\2\2_\u011a\3\2\2\2a\u011c\3\2\2\2c\u011e\3\2\2\2e"+
		"\u0120\3\2\2\2g\u0122\3\2\2\2i\u0124\3\2\2\2k\u0126\3\2\2\2m\u012d\3\2"+
		"\2\2o\u0131\3\2\2\2q\u013f\3\2\2\2st\7$\2\2t\4\3\2\2\2uv\7h\2\2v\6\3\2"+
		"\2\2wx\7\"\2\2x\b\3\2\2\2yz\7\17\2\2z\n\3\2\2\2{|\7\13\2\2|\f\3\2\2\2"+
		"}~\7\f\2\2~\16\3\2\2\2\177\u0080\7e\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084\u0085\7g\2\2\u0085"+
		"\20\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7v\2\2\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2"+
		"\u008d\u008e\7v\2\2\u008e\22\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7"+
		"g\2\2\u0091\u0092\7v\2\2\u0092\u0093\7w\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7p\2\2\u0095\24\3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b\26\3\2\2\2\u009c\u009d"+
		"\7u\2\2\u009d\u009e\7e\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\30\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7h\2\2\u00a3\32\3\2\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\34\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7"+
		"u\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7h\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7j\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7h\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00bc\7r\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7q\2"+
		"\2\u00bf$\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7"+
		"y\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7q\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7j\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd(\3\2\2\2\u00ce"+
		"\u00cf\7x\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7f\2\2"+
		"\u00d2*\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2"+
		"\2\u00d6,\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7"+
		"q\2\2\u00da\u00db\7n\2\2\u00db.\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7v\2\2\u00e1"+
		"\60\3\2\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7i\2\2\u00e8\62\3\2\2\2\u00e9"+
		"\u00ea\7*\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec\66\3\2\2\2\u00ed"+
		"\u00ee\7}\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7\177\2\2\u00f0:\3\2\2\2\u00f1"+
		"\u00f2\7]\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7_\2\2\u00f4>\3\2\2\2\u00f5\u00f6"+
		"\7>\2\2\u00f6@\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7?\2\2\u00f9B\3"+
		"\2\2\2\u00fa\u00fb\7@\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd\u00fe"+
		"\7?\2\2\u00feF\3\2\2\2\u00ff\u0100\7-\2\2\u0100H\3\2\2\2\u0101\u0102\7"+
		"/\2\2\u0102J\3\2\2\2\u0103\u0104\7,\2\2\u0104L\3\2\2\2\u0105\u0106\7\61"+
		"\2\2\u0106N\3\2\2\2\u0107\u0108\7\'\2\2\u0108P\3\2\2\2\u0109\u010a\7("+
		"\2\2\u010aR\3\2\2\2\u010b\u010c\7~\2\2\u010cT\3\2\2\2\u010d\u010e\7(\2"+
		"\2\u010e\u010f\7(\2\2\u010fV\3\2\2\2\u0110\u0111\7~\2\2\u0111\u0112\7"+
		"~\2\2\u0112X\3\2\2\2\u0113\u0114\7#\2\2\u0114Z\3\2\2\2\u0115\u0116\7?"+
		"\2\2\u0116\\\3\2\2\2\u0117\u0118\7?\2\2\u0118\u0119\7?\2\2\u0119^\3\2"+
		"\2\2\u011a\u011b\7A\2\2\u011b`\3\2\2\2\u011c\u011d\7<\2\2\u011db\3\2\2"+
		"\2\u011e\u011f\7\60\2\2\u011fd\3\2\2\2\u0120\u0121\7=\2\2\u0121f\3\2\2"+
		"\2\u0122\u0123\7.\2\2\u0123h\3\2\2\2\u0124\u0125\t\2\2\2\u0125j\3\2\2"+
		"\2\u0126\u0127\t\3\2\2\u0127l\3\2\2\2\u0128\u012a\7\17\2\2\u0129\u012b"+
		"\7\f\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012e\7\f\2\2\u012d\u0128\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\b\67\2\2\u0130n\3\2\2\2\u0131\u0132\7\61\2\2\u0132\u0133"+
		"\7,\2\2\u0133\u0137\3\2\2\2\u0134\u0136\13\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7,\2\2\u013b\u013c\7\61\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\b8\2\2\u013ep\3\2\2\2\u013f\u0140\7\61\2\2"+
		"\u0140\u0141\7\61\2\2\u0141\u0145\3\2\2\2\u0142\u0144\n\4\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\b9\2\2\u0149r\3\2\2\2\7"+
		"\2\u012a\u012d\u0137\u0145\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}