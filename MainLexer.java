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
		FUNC=9, MAIN=10, IF=11, ELSE=12, ELSE_IF=13, THEN=14, FOR=15, UP_TO=16, 
		DOWN_TO=17, TO=18, WHILE=19, INT_DEC=20, BOOLEAN_DEC=21, FLOAT_DEC=22, 
		STRING_DEC=23, OPEN_PAREN=24, CLOSE_PAREN=25, OPEN_BRACKET=26, CLOSE_BRACKET=27, 
		OPEN_BRACE=28, CLOSE_BRACE=29, LESS=30, LESSQEUAL=31, GREATER=32, GREATEREQUAL=33, 
		PLUS=34, MINUS=35, MULTI=36, DIV=37, MOD=38, ANDAND=39, OROR=40, NOT=41, 
		ASSIGN=42, EQUAL=43, QUESTION=44, COLON=45, DOT=46, SEMICOLON=47, COMMA=48, 
		UNDERSCORE=49, SINGLE_QUOTE=50, LOWERCASE=51, UPPERCASE=52, DIGIT=53, 
		NEWLINE=54, LINECOMMENT=55, WHITE_SPACE=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", 
			"FUNC", "MAIN", "IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", 
			"TO", "WHILE", "INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", 
			"LESS", "LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", 
			"DIV", "MOD", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", 
			"COLON", "DOT", "SEMICOLON", "COMMA", "UNDERSCORE", "SINGLE_QUOTE", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "NEWLINE", "LINECOMMENT", "WHITE_SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\78\u0136\n8\f8\168\u0139"+
		"\138\38\58\u013c\n8\39\69\u013f\n9\r9\169\u0140\39\39\2\2:\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\7\3\2"+
		"c|\3\2C\\\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0146\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\t~\3\2\2\2\13\u0087\3\2\2"+
		"\2\r\u008e\3\2\2\2\17\u0094\3\2\2\2\21\u0099\3\2\2\2\23\u009e\3\2\2\2"+
		"\25\u00a3\3\2\2\2\27\u00a8\3\2\2\2\31\u00ab\3\2\2\2\33\u00b0\3\2\2\2\35"+
		"\u00b8\3\2\2\2\37\u00bd\3\2\2\2!\u00c1\3\2\2\2#\u00c7\3\2\2\2%\u00cf\3"+
		"\2\2\2\'\u00d2\3\2\2\2)\u00d8\3\2\2\2+\u00dc\3\2\2\2-\u00e1\3\2\2\2/\u00e7"+
		"\3\2\2\2\61\u00ee\3\2\2\2\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f4\3"+
		"\2\2\29\u00f6\3\2\2\2;\u00f8\3\2\2\2=\u00fa\3\2\2\2?\u00fc\3\2\2\2A\u00ff"+
		"\3\2\2\2C\u0101\3\2\2\2E\u0104\3\2\2\2G\u0106\3\2\2\2I\u0108\3\2\2\2K"+
		"\u010a\3\2\2\2M\u010c\3\2\2\2O\u010e\3\2\2\2Q\u0111\3\2\2\2S\u0114\3\2"+
		"\2\2U\u0116\3\2\2\2W\u0118\3\2\2\2Y\u011b\3\2\2\2[\u011d\3\2\2\2]\u011f"+
		"\3\2\2\2_\u0121\3\2\2\2a\u0123\3\2\2\2c\u0125\3\2\2\2e\u0127\3\2\2\2g"+
		"\u0129\3\2\2\2i\u012b\3\2\2\2k\u012d\3\2\2\2m\u012f\3\2\2\2o\u0131\3\2"+
		"\2\2q\u013e\3\2\2\2st\7$\2\2t\4\3\2\2\2uv\7h\2\2v\6\3\2\2\2wx\7e\2\2x"+
		"y\7t\2\2yz\7g\2\2z{\7c\2\2{|\7v\2\2|}\7g\2\2}\b\3\2\2\2~\177\7e\2\2\177"+
		"\u0080\7q\2\2\u0080\u0081\7p\2\2\u0081\u0082\7u\2\2\u0082\u0083\7v\2\2"+
		"\u0083\u0084\7c\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\n\3\2"+
		"\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7w\2\2\u008b\u008c\7t\2\2\u008c\u008d\7p\2\2\u008d\f\3\2\2\2\u008e\u008f"+
		"\7r\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7v\2\2\u0093\16\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096\7e\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7p\2\2\u0098\20\3\2\2\2\u0099\u009a\7x\2\2\u009a"+
		"\u009b\7q\2\2\u009b\u009c\7k\2\2\u009c\u009d\7f\2\2\u009d\22\3\2\2\2\u009e"+
		"\u009f\7h\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7e\2\2"+
		"\u00a2\24\3\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7"+
		"k\2\2\u00a6\u00a7\7p\2\2\u00a7\26\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa"+
		"\7h\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae"+
		"\7u\2\2\u00ae\u00af\7g\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7\"\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7h\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7j\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\36\3\2\2\2\u00bd"+
		"\u00be\7h\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7t\2\2\u00c0 \3\2\2\2\u00c1"+
		"\u00c2\7w\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7v\2"+
		"\2\u00c5\u00c6\7q\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7"+
		"q\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7\"\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7q\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7q\2\2\u00d1&\3\2\2\2\u00d2\u00d3\7y\2\2\u00d3\u00d4\7j\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2\u00d7(\3\2\2\2\u00d8"+
		"\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7v\2\2\u00db*\3\2\2\2\u00dc"+
		"\u00dd\7d\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7n\2\2"+
		"\u00e0,\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7q\2"+
		"\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7v\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7"+
		"U\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec"+
		"\7p\2\2\u00ec\u00ed\7i\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef\62"+
		"\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7}\2\2\u00f3"+
		"\66\3\2\2\2\u00f4\u00f5\7\177\2\2\u00f58\3\2\2\2\u00f6\u00f7\7]\2\2\u00f7"+
		":\3\2\2\2\u00f8\u00f9\7_\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb>"+
		"\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7?\2\2\u00fe@\3\2\2\2\u00ff\u0100"+
		"\7@\2\2\u0100B\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103\7?\2\2\u0103D\3"+
		"\2\2\2\u0104\u0105\7-\2\2\u0105F\3\2\2\2\u0106\u0107\7/\2\2\u0107H\3\2"+
		"\2\2\u0108\u0109\7,\2\2\u0109J\3\2\2\2\u010a\u010b\7\61\2\2\u010bL\3\2"+
		"\2\2\u010c\u010d\7\'\2\2\u010dN\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110"+
		"\7(\2\2\u0110P\3\2\2\2\u0111\u0112\7~\2\2\u0112\u0113\7~\2\2\u0113R\3"+
		"\2\2\2\u0114\u0115\7#\2\2\u0115T\3\2\2\2\u0116\u0117\7?\2\2\u0117V\3\2"+
		"\2\2\u0118\u0119\7?\2\2\u0119\u011a\7?\2\2\u011aX\3\2\2\2\u011b\u011c"+
		"\7A\2\2\u011cZ\3\2\2\2\u011d\u011e\7<\2\2\u011e\\\3\2\2\2\u011f\u0120"+
		"\7\60\2\2\u0120^\3\2\2\2\u0121\u0122\7=\2\2\u0122`\3\2\2\2\u0123\u0124"+
		"\7.\2\2\u0124b\3\2\2\2\u0125\u0126\7a\2\2\u0126d\3\2\2\2\u0127\u0128\7"+
		")\2\2\u0128f\3\2\2\2\u0129\u012a\t\2\2\2\u012ah\3\2\2\2\u012b\u012c\t"+
		"\3\2\2\u012cj\3\2\2\2\u012d\u012e\t\4\2\2\u012el\3\2\2\2\u012f\u0130\t"+
		"\5\2\2\u0130n\3\2\2\2\u0131\u0132\7\61\2\2\u0132\u0133\7\61\2\2\u0133"+
		"\u0137\3\2\2\2\u0134\u0136\n\5\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013c\5m\67\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013cp\3\2\2\2\u013d\u013f\t\6\2\2\u013e\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\b9\2\2\u0143r\3\2\2\2\6\2\u0137\u013b\u0140\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}