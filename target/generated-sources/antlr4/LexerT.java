// Generated from LexerT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, ONLIVE=2, END=3, PRINT=4, SCAN=5, VAR=6, TEXTO=7, NUMERO=8, ENTERO=9, 
		DECIMAL=10, O=11, Y=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"BEGIN", "ONLIVE", "END", "PRINT", "SCAN", "VAR", "TEXTO", "NUMERO", "ENTERO", 
		"DECIMAL", "O", "Y", "WS"
	};


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7E\n\7\r\7\16\7F\3\7"+
		"\6\7J\n\7\r\7\16\7K\5\7N\n\7\3\b\3\b\6\bR\n\b\r\b\16\bS\3\b\6\bW\n\b\r"+
		"\b\16\bX\5\b[\n\b\3\b\3\b\3\t\3\t\5\ta\n\t\3\n\6\nd\n\n\r\n\16\ne\3\13"+
		"\6\13i\n\13\r\13\16\13j\3\13\3\13\6\13o\n\13\r\13\16\13p\3\f\3\f\3\r\3"+
		"\r\3\16\6\16x\n\16\r\16\16\16y\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\6\3\2c|\3\2C\\\3\2\62;\5"+
		"\2\13\f\17\17\"\"\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5#\3\2\2"+
		"\2\7)\3\2\2\2\t.\3\2\2\2\13\64\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21`\3\2"+
		"\2\2\23c\3\2\2\2\25h\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33w\3\2\2\2\35\36"+
		"\7Z\2\2\36\37\7{\2\2\37 \7n\2\2 !\7q\2\2!\"\7m\2\2\"\4\3\2\2\2#$\7Q\2"+
		"\2$%\7p\2\2%&\7n\2\2&\'\7k\2\2\'(\7m\2\2(\6\3\2\2\2)*\7\\\2\2*+\7{\2\2"+
		"+,\7p\2\2,-\7f\2\2-\b\3\2\2\2./\7R\2\2/\60\7n\2\2\60\61\7q\2\2\61\62\7"+
		"t\2\2\62\63\7m\2\2\63\n\3\2\2\2\64\65\7F\2\2\65\66\7t\2\2\66\67\7c\2\2"+
		"\678\7z\2\289\7x\2\29:\7q\2\2:;\7m\2\2;<\7|\2\2<=\7k\2\2=>\7t\2\2>?\7"+
		"r\2\2?@\7n\2\2@A\7q\2\2AB\7t\2\2B\f\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2"+
		"\2\2FD\3\2\2\2FG\3\2\2\2GN\3\2\2\2HJ\t\3\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2LN\3\2\2\2MD\3\2\2\2MI\3\2\2\2N\16\3\2\2\2OZ\7$\2\2PR\t"+
		"\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T[\3\2\2\2UW\t\3\2\2VU\3"+
		"\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZQ\3\2\2\2ZV\3\2\2\2[\\"+
		"\3\2\2\2\\]\7$\2\2]\20\3\2\2\2^a\5\23\n\2_a\5\25\13\2`^\3\2\2\2`_\3\2"+
		"\2\2a\22\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\24"+
		"\3\2\2\2gi\t\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2l"+
		"n\7.\2\2mo\t\4\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\26\3\2\2\2"+
		"rs\7q\2\2s\30\3\2\2\2tu\7{\2\2u\32\3\2\2\2vx\t\5\2\2wv\3\2\2\2xy\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\16\2\2|\34\3\2\2\2\16\2FKMSXZ`ej"+
		"py\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}