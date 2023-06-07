// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, BEGIN=15, ONLIVE=16, END=17, 
		PRINT=18, SCAN=19, VAR=20, TEXTO=21, ENTERO=22, DECIMAL=23, O=24, Y=25, 
		WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "BEGIN", "ONLIVE", "END", "PRINT", 
		"SCAN", "VAR", "TEXTO", "ENTERO", "DECIMAL", "O", "Y", "WS"
	};


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00f0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\6\25"+
		"\u00bc\n\25\r\25\16\25\u00bd\3\25\6\25\u00c1\n\25\r\25\16\25\u00c2\5\25"+
		"\u00c5\n\25\3\26\3\26\6\26\u00c9\n\26\r\26\16\26\u00ca\3\26\6\26\u00ce"+
		"\n\26\r\26\16\26\u00cf\5\26\u00d2\n\26\3\26\3\26\3\27\6\27\u00d7\n\27"+
		"\r\27\16\27\u00d8\3\30\6\30\u00dc\n\30\r\30\16\30\u00dd\3\30\3\30\6\30"+
		"\u00e2\n\30\r\30\16\30\u00e3\3\31\3\31\3\32\3\32\3\33\6\33\u00eb\n\33"+
		"\r\33\16\33\u00ec\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\3\2\6\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\u00f9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5@\3\2\2\2\7F\3"+
		"\2\2\2\tL\3\2\2\2\13R\3\2\2\2\rX\3\2\2\2\17^\3\2\2\2\21c\3\2\2\2\23l\3"+
		"\2\2\2\25r\3\2\2\2\27\u0085\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2\2"+
		"\35\u008e\3\2\2\2\37\u0094\3\2\2\2!\u009a\3\2\2\2#\u00a0\3\2\2\2%\u00a5"+
		"\3\2\2\2\'\u00ab\3\2\2\2)\u00c4\3\2\2\2+\u00c6\3\2\2\2-\u00d6\3\2\2\2"+
		"/\u00db\3\2\2\2\61\u00e5\3\2\2\2\63\u00e7\3\2\2\2\65\u00ea\3\2\2\2\67"+
		"8\7R\2\289\7t\2\29:\7{\2\2:;\7z\2\2;<\7F\2\2<=\7t\2\2=>\7c\2\2>?\7z\2"+
		"\2?\4\3\2\2\2@A\7V\2\2AB\7{\2\2BC\7p\2\2CD\7v\2\2DE\7*\2\2E\6\3\2\2\2"+
		"FG\7Z\2\2GH\7{\2\2HI\7p\2\2IJ\7v\2\2JK\7j\2\2K\b\3\2\2\2LM\7U\2\2MN\7"+
		"m\2\2NO\7q\2\2OP\7t\2\2PQ\7p\2\2Q\n\3\2\2\2RS\7M\2\2ST\7t\2\2TU\7{\2\2"+
		"UV\7u\2\2VW\7v\2\2W\f\3\2\2\2XY\7Z\2\2YZ\7{\2\2Z[\7t\2\2[\\\7v\2\2\\]"+
		"\7*\2\2]\16\3\2\2\2^_\7c\2\2_`\7u\2\2`a\7f\2\2ab\7h\2\2b\20\3\2\2\2cd"+
		"\7[\2\2de\7v\2\2ef\7v\2\2fg\7t\2\2gh\7R\2\2hi\7n\2\2ij\7q\2\2jk\7t\2\2"+
		"k\22\3\2\2\2lm\7\\\2\2mn\7{\2\2no\7p\2\2op\7v\2\2pq\7*\2\2q\24\3\2\2\2"+
		"rs\7F\2\2st\7t\2\2tu\7c\2\2uv\7z\2\2vw\7|\2\2wx\7k\2\2xy\7t\2\2yz\7l\2"+
		"\2z{\7{\2\2{|\7z\2\2|}\7u\2\2}~\7m\2\2~\177\7t\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7|\2\2\u0082\u0083\7k\2\2\u0083\u0084\7t\2\2"+
		"\u0084\26\3\2\2\2\u0085\u0086\7*\2\2\u0086\30\3\2\2\2\u0087\u0088\7+\2"+
		"\2\u0088\32\3\2\2\2\u0089\u008a\7U\2\2\u008a\u008b\7{\2\2\u008b\u008c"+
		"\7p\2\2\u008c\u008d\7v\2\2\u008d\34\3\2\2\2\u008e\u008f\7V\2\2\u008f\u0090"+
		"\7j\2\2\u0090\u0091\7t\2\2\u0091\u0092\7{\2\2\u0092\u0093\7r\2\2\u0093"+
		"\36\3\2\2\2\u0094\u0095\7Z\2\2\u0095\u0096\7{\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7q\2\2\u0098\u0099\7m\2\2\u0099 \3\2\2\2\u009a\u009b\7Q\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7n\2\2\u009d\u009e\7k\2\2\u009e\u009f\7m\2\2"+
		"\u009f\"\3\2\2\2\u00a0\u00a1\7\\\2\2\u00a1\u00a2\7{\2\2\u00a2\u00a3\7"+
		"p\2\2\u00a3\u00a4\7f\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7R\2\2\u00a6\u00a7"+
		"\7n\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7m\2\2\u00aa"+
		"&\3\2\2\2\u00ab\u00ac\7F\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7c\2\2\u00ae"+
		"\u00af\7z\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7m\2\2"+
		"\u00b2\u00b3\7|\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7r\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"(\3\2\2\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c5\3\2\2\2\u00bf\u00c1"+
		"\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00c0\3\2"+
		"\2\2\u00c5*\3\2\2\2\u00c6\u00d1\7$\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00d2\3\2\2\2\u00cc\u00ce\t\3\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00c8\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7$"+
		"\2\2\u00d4,\3\2\2\2\u00d5\u00d7\t\4\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9.\3\2\2\2\u00da"+
		"\u00dc\t\4\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7.\2\2\u00e0"+
		"\u00e2\t\4\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7q\2\2\u00e6\62"+
		"\3\2\2\2\u00e7\u00e8\7{\2\2\u00e8\64\3\2\2\2\u00e9\u00eb\t\5\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\33\2\2\u00ef\66\3\2\2\2\r\2\u00bd"+
		"\u00c2\u00c4\u00ca\u00cf\u00d1\u00d8\u00dd\u00e3\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}