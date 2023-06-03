// Generated from ParserT.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, A=3, B=4, C=5, D=6, E=7, F=8, G=9, H=10, I=11, J=12, K=13, 
		L=14, M=15, N=16, O=17, P=18, Q=19, R=20, S=21, T=22, U=23, V=24, W=25, 
		X=26, Y=27, Z=28, NUM_0=29, NUM_1=30, NUM_2=31, NUM_3=32, NUM_4=33, NUM_5=34, 
		NUM_6=35, NUM_7=36, NUM_8=37, NUM_9=38, DIGITO=39, INT=40, FLOAT=41, NUMERO=42, 
		SUMA=43, RESTA=44, MULTIPLICACION=45, DIVISION=46, IGUAL=47, SENO=48, 
		COSENO=49, RAIZ_CUADRADA=50, INICIO=51, FIN=52, PRINT=53, WS=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "NUM_0", "NUM_1", "NUM_2", "NUM_3", "NUM_4", "NUM_5", "NUM_6", "NUM_7", 
		"NUM_8", "NUM_9", "DIGITO", "INT", "FLOAT", "NUMERO", "SUMA", "RESTA", 
		"MULTIPLICACION", "DIVISION", "IGUAL", "SENO", "COSENO", "RAIZ_CUADRADA", 
		"INICIO", "FIN", "PRINT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'Zir'", "'Kryt'", "'Vok'", "'Thun'", "'Pryx'", "'Glix'", 
		"'Zolk'", "'Qwert'", "'Blit'", "'Nyr'", "'Xyr'", "'Jyx'", "'Zyn'", "'Plor'", 
		"'Flum'", "'Trax'", "'Zyx'", "'Glork'", "'Drax'", "'Skron'", "'Yttr'", 
		"'Zarg'", "'Plux'", "'Mox'", "'Grat'", "'Krygn'", "'Zor'", "'Plip'", "'Blip'", 
		"'Glip'", "'Flap'", "'Klix'", "'Vip'", "'Zinx'", "'Drox'", "'Grax'", null, 
		null, null, null, "'Kryst'", "'Skorn'", "'Thryp'", "'Xynth'", "'Synt'", 
		"'Xyrt'", "'Zynt'", "'Klaxyx'", "'Xylok'", "'Zynd'", "'Plork'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "NUM_0", "NUM_1", "NUM_2", "NUM_3", "NUM_4", "NUM_5", "NUM_6", "NUM_7", 
		"NUM_8", "NUM_9", "DIGITO", "INT", "FLOAT", "NUMERO", "SUMA", "RESTA", 
		"MULTIPLICACION", "DIVISION", "IGUAL", "SENO", "COSENO", "RAIZ_CUADRADA", 
		"INICIO", "FIN", "PRINT", "WS"
	};
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0189\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u012c\n(\3)\6)\u012f\n)\r)\16)\u0130\3*\6*\u0134\n*\r*\16*\u0135"+
		"\3*\6*\u0139\n*\r*\16*\u013a\3*\6*\u013e\n*\r*\16*\u013f\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\6\67\u0184\n\67"+
		"\r\67\16\67\u0185\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8\3\2\3\5\2\13\f\17\17\"\"\2\u0196\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o"+
		"\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tw\3\2\2\2\13|\3\2\2\2\r\u0080\3\2\2\2"+
		"\17\u0085\3\2\2\2\21\u008a\3\2\2\2\23\u008f\3\2\2\2\25\u0094\3\2\2\2\27"+
		"\u009a\3\2\2\2\31\u009f\3\2\2\2\33\u00a3\3\2\2\2\35\u00a7\3\2\2\2\37\u00ab"+
		"\3\2\2\2!\u00af\3\2\2\2#\u00b4\3\2\2\2%\u00b9\3\2\2\2\'\u00be\3\2\2\2"+
		")\u00c2\3\2\2\2+\u00c8\3\2\2\2-\u00cd\3\2\2\2/\u00d3\3\2\2\2\61\u00d8"+
		"\3\2\2\2\63\u00dd\3\2\2\2\65\u00e2\3\2\2\2\67\u00e6\3\2\2\29\u00eb\3\2"+
		"\2\2;\u00f1\3\2\2\2=\u00f5\3\2\2\2?\u00fa\3\2\2\2A\u00ff\3\2\2\2C\u0104"+
		"\3\2\2\2E\u0109\3\2\2\2G\u010e\3\2\2\2I\u0112\3\2\2\2K\u0117\3\2\2\2M"+
		"\u011c\3\2\2\2O\u012b\3\2\2\2Q\u012e\3\2\2\2S\u0133\3\2\2\2U\u0141\3\2"+
		"\2\2W\u0143\3\2\2\2Y\u0149\3\2\2\2[\u014f\3\2\2\2]\u0155\3\2\2\2_\u015b"+
		"\3\2\2\2a\u0160\3\2\2\2c\u0165\3\2\2\2e\u016a\3\2\2\2g\u0171\3\2\2\2i"+
		"\u0177\3\2\2\2k\u017c\3\2\2\2m\u0183\3\2\2\2op\7*\2\2p\4\3\2\2\2qr\7+"+
		"\2\2r\6\3\2\2\2st\7\\\2\2tu\7k\2\2uv\7t\2\2v\b\3\2\2\2wx\7M\2\2xy\7t\2"+
		"\2yz\7{\2\2z{\7v\2\2{\n\3\2\2\2|}\7X\2\2}~\7q\2\2~\177\7m\2\2\177\f\3"+
		"\2\2\2\u0080\u0081\7V\2\2\u0081\u0082\7j\2\2\u0082\u0083\7w\2\2\u0083"+
		"\u0084\7p\2\2\u0084\16\3\2\2\2\u0085\u0086\7R\2\2\u0086\u0087\7t\2\2\u0087"+
		"\u0088\7{\2\2\u0088\u0089\7z\2\2\u0089\20\3\2\2\2\u008a\u008b\7I\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7k\2\2\u008d\u008e\7z\2\2\u008e\22\3\2\2\2\u008f"+
		"\u0090\7\\\2\2\u0090\u0091\7q\2\2\u0091\u0092\7n\2\2\u0092\u0093\7m\2"+
		"\2\u0093\24\3\2\2\2\u0094\u0095\7S\2\2\u0095\u0096\7y\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7t\2\2\u0098\u0099\7v\2\2\u0099\26\3\2\2\2\u009a\u009b"+
		"\7D\2\2\u009b\u009c\7n\2\2\u009c\u009d\7k\2\2\u009d\u009e\7v\2\2\u009e"+
		"\30\3\2\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7{\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"\32\3\2\2\2\u00a3\u00a4\7Z\2\2\u00a4\u00a5\7{\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\34\3\2\2\2\u00a7\u00a8\7L\2\2\u00a8\u00a9\7{\2\2\u00a9\u00aa\7z\2\2\u00aa"+
		"\36\3\2\2\2\u00ab\u00ac\7\\\2\2\u00ac\u00ad\7{\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae \3\2\2\2\u00af\u00b0\7R\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7q\2"+
		"\2\u00b2\u00b3\7t\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\7H\2\2\u00b5\u00b6\7"+
		"n\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7o\2\2\u00b8$\3\2\2\2\u00b9\u00ba"+
		"\7V\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7z\2\2\u00bd"+
		"&\3\2\2\2\u00be\u00bf\7\\\2\2\u00bf\u00c0\7{\2\2\u00c0\u00c1\7z\2\2\u00c1"+
		"(\3\2\2\2\u00c2\u00c3\7I\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7m\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7F\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7z\2\2\u00cc,\3\2\2\2\u00cd"+
		"\u00ce\7U\2\2\u00ce\u00cf\7m\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7q\2\2"+
		"\u00d1\u00d2\7p\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7[\2\2\u00d4\u00d5\7v\2"+
		"\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\60\3\2\2\2\u00d8\u00d9"+
		"\7\\\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7i\2\2\u00dc"+
		"\62\3\2\2\2\u00dd\u00de\7R\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7z\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7O\2\2\u00e3\u00e4\7q\2\2\u00e4"+
		"\u00e5\7z\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7I\2\2\u00e7\u00e8\7t\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7v\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7M\2\2\u00ec"+
		"\u00ed\7t\2\2\u00ed\u00ee\7{\2\2\u00ee\u00ef\7i\2\2\u00ef\u00f0\7p\2\2"+
		"\u00f0:\3\2\2\2\u00f1\u00f2\7\\\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t"+
		"\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7R\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8"+
		"\7k\2\2\u00f8\u00f9\7r\2\2\u00f9>\3\2\2\2\u00fa\u00fb\7D\2\2\u00fb\u00fc"+
		"\7n\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7r\2\2\u00fe@\3\2\2\2\u00ff\u0100"+
		"\7I\2\2\u0100\u0101\7n\2\2\u0101\u0102\7k\2\2\u0102\u0103\7r\2\2\u0103"+
		"B\3\2\2\2\u0104\u0105\7H\2\2\u0105\u0106\7n\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7r\2\2\u0108D\3\2\2\2\u0109\u010a\7M\2\2\u010a\u010b\7n\2\2\u010b"+
		"\u010c\7k\2\2\u010c\u010d\7z\2\2\u010dF\3\2\2\2\u010e\u010f\7X\2\2\u010f"+
		"\u0110\7k\2\2\u0110\u0111\7r\2\2\u0111H\3\2\2\2\u0112\u0113\7\\\2\2\u0113"+
		"\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115\u0116\7z\2\2\u0116J\3\2\2\2\u0117"+
		"\u0118\7F\2\2\u0118\u0119\7t\2\2\u0119\u011a\7q\2\2\u011a\u011b\7z\2\2"+
		"\u011bL\3\2\2\2\u011c\u011d\7I\2\2\u011d\u011e\7t\2\2\u011e\u011f\7c\2"+
		"\2\u011f\u0120\7z\2\2\u0120N\3\2\2\2\u0121\u012c\5;\36\2\u0122\u012c\5"+
		"=\37\2\u0123\u012c\5? \2\u0124\u012c\5A!\2\u0125\u012c\5C\"\2\u0126\u012c"+
		"\5E#\2\u0127\u012c\5G$\2\u0128\u012c\5I%\2\u0129\u012c\5K&\2\u012a\u012c"+
		"\5M\'\2\u012b\u0121\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0123\3\2\2\2\u012b"+
		"\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2"+
		"\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"P\3\2\2\2\u012d\u012f\5O(\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131R\3\2\2\2\u0132\u0134\5O(\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0139\7.\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013e\5O(\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140T\3\2\2\2\u0141\u0142\5Q)\2\u0142V\3"+
		"\2\2\2\u0143\u0144\7M\2\2\u0144\u0145\7t\2\2\u0145\u0146\7{\2\2\u0146"+
		"\u0147\7u\2\2\u0147\u0148\7v\2\2\u0148X\3\2\2\2\u0149\u014a\7U\2\2\u014a"+
		"\u014b\7m\2\2\u014b\u014c\7q\2\2\u014c\u014d\7t\2\2\u014d\u014e\7p\2\2"+
		"\u014eZ\3\2\2\2\u014f\u0150\7V\2\2\u0150\u0151\7j\2\2\u0151\u0152\7t\2"+
		"\2\u0152\u0153\7{\2\2\u0153\u0154\7r\2\2\u0154\\\3\2\2\2\u0155\u0156\7"+
		"Z\2\2\u0156\u0157\7{\2\2\u0157\u0158\7p\2\2\u0158\u0159\7v\2\2\u0159\u015a"+
		"\7j\2\2\u015a^\3\2\2\2\u015b\u015c\7U\2\2\u015c\u015d\7{\2\2\u015d\u015e"+
		"\7p\2\2\u015e\u015f\7v\2\2\u015f`\3\2\2\2\u0160\u0161\7Z\2\2\u0161\u0162"+
		"\7{\2\2\u0162\u0163\7t\2\2\u0163\u0164\7v\2\2\u0164b\3\2\2\2\u0165\u0166"+
		"\7\\\2\2\u0166\u0167\7{\2\2\u0167\u0168\7p\2\2\u0168\u0169\7v\2\2\u0169"+
		"d\3\2\2\2\u016a\u016b\7M\2\2\u016b\u016c\7n\2\2\u016c\u016d\7c\2\2\u016d"+
		"\u016e\7z\2\2\u016e\u016f\7{\2\2\u016f\u0170\7z\2\2\u0170f\3\2\2\2\u0171"+
		"\u0172\7Z\2\2\u0172\u0173\7{\2\2\u0173\u0174\7n\2\2\u0174\u0175\7q\2\2"+
		"\u0175\u0176\7m\2\2\u0176h\3\2\2\2\u0177\u0178\7\\\2\2\u0178\u0179\7{"+
		"\2\2\u0179\u017a\7p\2\2\u017a\u017b\7f\2\2\u017bj\3\2\2\2\u017c\u017d"+
		"\7R\2\2\u017d\u017e\7n\2\2\u017e\u017f\7q\2\2\u017f\u0180\7t\2\2\u0180"+
		"\u0181\7m\2\2\u0181l\3\2\2\2\u0182\u0184\t\2\2\2\u0183\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0188\b\67\2\2\u0188n\3\2\2\2\t\2\u012b\u0130\u0135\u013a\u013f"+
		"\u0185\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}