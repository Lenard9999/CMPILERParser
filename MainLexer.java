// Generated from .\Main.g4 by ANTLR 4.9
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
		LOWERCASE=1, UPPERCASE=2, DIGIT=3, NEWLINE=4, CLASS_WORD=5, RETURN_WORD=6, 
		IMPORT_WORD=7, STRING=8, NUMBER=9, LABEL=10, WHITE_SPACE=11, LINE_COMMENT=12, 
		MULTILINE_COMMENT=13, OPEN_PAREN=14, CLOSE_PAREN=15, OPEN_BRACKET=16, 
		CLOSE_BRACKET=17, SEMICOLON=18, COMMA=19, EQUAL=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWERCASE", "UPPERCASE", "DIGIT", "NEWLINE", "CLASS_WORD", "RETURN_WORD", 
			"IMPORT_WORD", "STRING", "NUMBER", "LABEL", "WHITE_SPACE", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"SEMICOLON", "COMMA", "EQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'class'", "'return'", "'import'", null, 
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOWERCASE", "UPPERCASE", "DIGIT", "NEWLINE", "CLASS_WORD", "RETURN_WORD", 
			"IMPORT_WORD", "STRING", "NUMBER", "LABEL", "WHITE_SPACE", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"SEMICOLON", "COMMA", "EQUAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\t\3\t\3\n\5\nT\n\n"+
		"\3\n\7\nW\n\n\f\n\16\nZ\13\n\3\n\3\n\6\n^\n\n\r\n\16\n_\3\n\5\nc\n\n\3"+
		"\n\6\nf\n\n\r\n\16\ng\5\nj\n\n\3\13\3\13\3\13\6\13o\n\13\r\13\16\13p\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\4{\u0086"+
		"\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26\3\2\7\3\2c|\3\2C|\3\2\62;\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3"+
		"\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r9\3\2\2\2\17"+
		"@\3\2\2\2\21G\3\2\2\2\23i\3\2\2\2\25n\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2"+
		"\33\u0080\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2\2#\u0092"+
		"\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0098\3\2\2\2+,\t\2\2\2,\4\3"+
		"\2\2\2-.\t\3\2\2.\6\3\2\2\2/\60\t\4\2\2\60\b\3\2\2\2\61\62\t\5\2\2\62"+
		"\n\3\2\2\2\63\64\7e\2\2\64\65\7n\2\2\65\66\7c\2\2\66\67\7u\2\2\678\7u"+
		"\2\28\f\3\2\2\29:\7t\2\2:;\7g\2\2;<\7v\2\2<=\7w\2\2=>\7t\2\2>?\7p\2\2"+
		"?\16\3\2\2\2@A\7k\2\2AB\7o\2\2BC\7r\2\2CD\7q\2\2DE\7t\2\2EF\7v\2\2F\20"+
		"\3\2\2\2GM\7$\2\2HL\5\3\2\2IL\5\5\3\2JL\5\7\4\2KH\3\2\2\2KI\3\2\2\2KJ"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7$\2\2Q\22"+
		"\3\2\2\2RT\7/\2\2SR\3\2\2\2ST\3\2\2\2TX\3\2\2\2UW\t\4\2\2VU\3\2\2\2WZ"+
		"\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[]\7\60\2\2\\^\t\4\2\2"+
		"]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`j\3\2\2\2ac\7/\2\2ba\3\2\2\2"+
		"bc\3\2\2\2ce\3\2\2\2df\t\4\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2iS\3\2\2\2ib\3\2\2\2j\24\3\2\2\2ko\5\3\2\2lo\5\5\3\2mo\7a\2"+
		"\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\26\3\2"+
		"\2\2rs\t\6\2\2s\30\3\2\2\2tu\7\61\2\2uv\7\61\2\2v{\3\2\2\2wz\13\2\2\2"+
		"xz\5\t\5\2yw\3\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2\2"+
		"}{\3\2\2\2~\177\5\t\5\2\177\32\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082"+
		"\7,\2\2\u0082\u0086\3\2\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b"+
		"\34\3\2\2\2\u008c\u008d\7*\2\2\u008d\36\3\2\2\2\u008e\u008f\7+\2\2\u008f"+
		" \3\2\2\2\u0090\u0091\7}\2\2\u0091\"\3\2\2\2\u0092\u0093\7\177\2\2\u0093"+
		"$\3\2\2\2\u0094\u0095\7=\2\2\u0095&\3\2\2\2\u0096\u0097\7.\2\2\u0097("+
		"\3\2\2\2\u0098\u0099\7?\2\2\u0099*\3\2\2\2\20\2KMSX_bginpy{\u0086\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}