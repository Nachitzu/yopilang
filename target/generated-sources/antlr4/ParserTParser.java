// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, ECUACIONES=3, OPERACION=4, NUMERO=5, FLOAT=6, INT=7, DIGITO=8, 
		SUMA=9, RESTA=10, MULTIPLICACION=11, DIVISION=12, IGUAL=13, SENO=14, COSENO=15, 
		RAIZ_CUADRADA=16, INICIO=17, FIN=18, PRINT=19, A=20, B=21, C=22, D=23, 
		E=24, F=25, G=26, H=27, I=28, J=29, K=30, L=31, M=32, N=33, O=34, P=35, 
		Q=36, R=37, S=38, T=39, U=40, V=41, W=42, X=43, Y=44, Z=45, NUM_0=46, 
		NUM_1=47, NUM_2=48, NUM_3=49, NUM_4=50, NUM_5=51, NUM_6=52, NUM_7=53, 
		NUM_8=54, NUM_9=55, WS=56;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "ECUACIONES", "OPERACION", "NUMERO", "FLOAT", 
		"INT", "DIGITO", "'Kryst'", "'Skorn'", "'Thryp'", "'Xynth'", "'Synt'", 
		"'Xyrt'", "'Zynt'", "'Klaxyx'", "'Xylok'", "'Zynd'", "'Plork'", "'Zir'", 
		"'Kryt'", "'Vok'", "'Thun'", "'Pryx'", "'Glix'", "'Zolk'", "'Qwert'", 
		"'Blit'", "'Nyr'", "'Xyr'", "'Jyx'", "'Zyn'", "'Plor'", "'Flum'", "'Trax'", 
		"'Zyx'", "'Glork'", "'Drax'", "'Skron'", "'Yttr'", "'Zarg'", "'Plux'", 
		"'Mox'", "'Grat'", "'Krygn'", "'Zor'", "'Plip'", "'Blip'", "'Glip'", "'Flap'", 
		"'Klix'", "'Vip'", "'Zinx'", "'Drox'", "'Grax'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_print = 2;
	public static final String[] ruleNames = {
		"program", "statement", "print"
	};

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode INICIO() { return getToken(ParserTParser.INICIO, 0); }
		public TerminalNode FIN() { return getToken(ParserTParser.FIN, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); match(INICIO);
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(7); statement();
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINT );
			setState(12); match(FIN);
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

	public static class StatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); print();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode ECUACIONES() { return getToken(ParserTParser.ECUACIONES, 0); }
		public TerminalNode NUMERO() { return getToken(ParserTParser.NUMERO, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(PRINT);
			setState(17); match(T__1);
			setState(18);
			_la = _input.LA(1);
			if ( !(_la==ECUACIONES || _la==NUMERO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(19); match(T__0);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\30\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\2\2\5\2\4\6\2\3\4\2\5\5\7\7\25\2\b\3\2\2\2\4\20\3\2\2\2\6\22"+
		"\3\2\2\2\b\n\7\23\2\2\t\13\5\4\3\2\n\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2"+
		"\2\f\r\3\2\2\2\r\16\3\2\2\2\16\17\7\24\2\2\17\3\3\2\2\2\20\21\5\6\4\2"+
		"\21\5\3\2\2\2\22\23\7\25\2\2\23\24\7\3\2\2\24\25\t\2\2\2\25\26\7\4\2\2"+
		"\26\7\3\2\2\2\3\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}