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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, Mayoht=14, Menhok=15, BEGIN=16, ONLIVE=17, 
		END=18, PRINT=19, SCAN=20, VAR=21, TEXTO=22, NUMERO=23, ENTERO=24, DECIMAL=25, 
		O=26, Y=27, WS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'PryxDrax'", "'Xynth'", "'Skorn'", "'Kryst'", "'asdf'", 
		"'YttrPlor'", "'Draxzirjyxskronzir'", "'Zyxblippryxplorskronglorkzirdrax('", 
		"'('", "')'", "'Synt'", "'Qwertzirvokpryxglork'", "'Thryp'", "Mayoht", 
		"Menhok", "'Xylok'", "'Onlik'", "'Zynd'", "'Plork'", "'Draxvokzirplor'", 
		"VAR", "TEXTO", "NUMERO", "ENTERO", "DECIMAL", "'o'", "'y'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_constantes = 1, RULE_desarrollo = 2, RULE_variables = 3, 
		RULE_texto = 4, RULE_entero = 5, RULE_decimal = 6, RULE_pasos = 7, RULE_operacion = 8, 
		RULE_multiplicacion = 9, RULE_division = 10, RULE_suma = 11, RULE_resta = 12, 
		RULE_mientras = 13, RULE_logica = 14, RULE_operadores = 15, RULE_leer = 16, 
		RULE_escribir = 17;
	public static final String[] ruleNames = {
		"program", "constantes", "desarrollo", "variables", "texto", "entero", 
		"decimal", "pasos", "operacion", "multiplicacion", "division", "suma", 
		"resta", "mientras", "logica", "operadores", "leer", "escribir"
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
		public DesarrolloContext desarrollo() {
			return getRuleContext(DesarrolloContext.class,0);
		}
		public TerminalNode ONLIVE() { return getToken(ParserTParser.ONLIVE, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(BEGIN);
			setState(37); constantes();
			setState(38); match(ONLIVE);
			setState(39); desarrollo();
			setState(40); match(END);
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

	public static class ConstantesContext extends ParserRuleContext {
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__7) | (1L << VAR))) != 0)) {
				{
				{
				setState(42); variables();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DesarrolloContext extends ParserRuleContext {
		public List<PasosContext> pasos() {
			return getRuleContexts(PasosContext.class);
		}
		public PasosContext pasos(int i) {
			return getRuleContext(PasosContext.class,i);
		}
		public DesarrolloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desarrollo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDesarrollo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDesarrollo(this);
		}
	}

	public final DesarrolloContext desarrollo() throws RecognitionException {
		DesarrolloContext _localctx = new DesarrolloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_desarrollo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << PRINT) | (1L << SCAN))) != 0)) {
				{
				{
				setState(48); pasos();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariablesContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(54); texto();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); entero();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(56); decimal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public TerminalNode TEXTO() { return getToken(ParserTParser.TEXTO, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(T__7);
			setState(60); match(VAR);
			setState(61); match(T__6);
			setState(62); match(TEXTO);
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(ParserTParser.ENTERO, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(T__12);
			setState(65); match(ENTERO);
			setState(66); match(T__8);
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(ParserTParser.DECIMAL, 0); }
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(VAR);
			setState(69); match(DECIMAL);
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

	public static class PasosContext extends ParserRuleContext {
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public PasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pasos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterPasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitPasos(this);
		}
	}

	public final PasosContext pasos() throws RecognitionException {
		PasosContext _localctx = new PasosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pasos);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); escribir();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); operacion();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); leer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperacionContext extends ParserRuleContext {
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacion);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); multiplicacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); division();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); suma();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79); resta();
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

	public static class MultiplicacionContext extends ParserRuleContext {
		public TerminalNode ENTERO(int i) {
			return getToken(ParserTParser.ENTERO, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(ParserTParser.ENTERO); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMultiplicacion(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(T__4);
			setState(83); match(ENTERO);
			setState(84); match(T__0);
			setState(85); match(ENTERO);
			setState(86); match(T__3);
			setState(87); match(T__2);
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

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode ENTERO(int i) {
			return getToken(ParserTParser.ENTERO, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(ParserTParser.ENTERO); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(T__4);
			setState(90); match(ENTERO);
			setState(91); match(T__11);
			setState(92); match(ENTERO);
			setState(93); match(T__3);
			setState(94); match(T__2);
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

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode ENTERO(int i) {
			return getToken(ParserTParser.ENTERO, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(ParserTParser.ENTERO); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(T__4);
			setState(97); match(ENTERO);
			setState(98); match(T__9);
			setState(99); match(ENTERO);
			setState(100); match(T__3);
			setState(101); match(T__2);
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

	public static class RestaContext extends ParserRuleContext {
		public TerminalNode ENTERO(int i) {
			return getToken(ParserTParser.ENTERO, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(ParserTParser.ENTERO); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitResta(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(T__4);
			setState(104); match(ENTERO);
			setState(105); match(T__10);
			setState(106); match(ENTERO);
			setState(107); match(T__3);
			setState(108); match(T__2);
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

	public static class MientrasContext extends ParserRuleContext {
		public DesarrolloContext desarrollo() {
			return getRuleContext(DesarrolloContext.class,0);
		}
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(T__5);
			setState(111); logica();
			setState(112); match(T__3);
			setState(113); desarrollo();
			setState(114); match(T__1);
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

	public static class LogicaContext extends ParserRuleContext {
		public TerminalNode O(int i) {
			return getToken(ParserTParser.O, i);
		}
		public List<TerminalNode> Y() { return getTokens(ParserTParser.Y); }
		public List<OperadoresContext> operadores() {
			return getRuleContexts(OperadoresContext.class);
		}
		public OperadoresContext operadores(int i) {
			return getRuleContext(OperadoresContext.class,i);
		}
		public List<TerminalNode> O() { return getTokens(ParserTParser.O); }
		public TerminalNode Y(int i) {
			return getToken(ParserTParser.Y, i);
		}
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitLogica(this);
		}
	}

	public final LogicaContext logica() throws RecognitionException {
		LogicaContext _localctx = new LogicaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); operadores();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O || _la==Y) {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==O || _la==Y) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(118); operadores();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OperadoresContext extends ParserRuleContext {
		public TerminalNode Mayoht() { return getToken(ParserTParser.Mayoht, 0); }
		public TerminalNode Menhok() { return getToken(ParserTParser.Menhok, 0); }
		public OperadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitOperadores(this);
		}
	}

	public final OperadoresContext operadores() throws RecognitionException {
		OperadoresContext _localctx = new OperadoresContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==Mayoht || _la==Menhok) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ParserTParser.SCAN, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitLeer(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(SCAN);
			setState(127); match(T__4);
			setState(128); match(T__3);
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

	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitEscribir(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(PRINT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\7"+
		"\4\64\n\4\f\4\16\4\67\13\4\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\5\tM\n\t\3\n\3\n\3\n\3\n\5\nS\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20z\n\20\f\20\16\20}\13\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$\2\4\3\2\34\35\3\2\20\21~\2&\3\2\2\2\4/\3\2\2\2\6\65"+
		"\3\2\2\2\b;\3\2\2\2\n=\3\2\2\2\fB\3\2\2\2\16F\3\2\2\2\20L\3\2\2\2\22R"+
		"\3\2\2\2\24T\3\2\2\2\26[\3\2\2\2\30b\3\2\2\2\32i\3\2\2\2\34p\3\2\2\2\36"+
		"v\3\2\2\2 ~\3\2\2\2\"\u0080\3\2\2\2$\u0084\3\2\2\2&\'\7\22\2\2\'(\5\4"+
		"\3\2()\7\23\2\2)*\5\6\4\2*+\7\24\2\2+\3\3\2\2\2,.\5\b\5\2-,\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62\64\5\20\t\2"+
		"\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2"+
		"\67\65\3\2\2\28<\5\n\6\29<\5\f\7\2:<\5\16\b\2;8\3\2\2\2;9\3\2\2\2;:\3"+
		"\2\2\2<\t\3\2\2\2=>\7\b\2\2>?\7\27\2\2?@\7\t\2\2@A\7\30\2\2A\13\3\2\2"+
		"\2BC\7\3\2\2CD\7\32\2\2DE\7\7\2\2E\r\3\2\2\2FG\7\27\2\2GH\7\33\2\2H\17"+
		"\3\2\2\2IM\5$\23\2JM\5\22\n\2KM\5\"\22\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2"+
		"M\21\3\2\2\2NS\5\24\13\2OS\5\26\f\2PS\5\30\r\2QS\5\32\16\2RN\3\2\2\2R"+
		"O\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\23\3\2\2\2TU\7\13\2\2UV\7\32\2\2VW\7\17"+
		"\2\2WX\7\32\2\2XY\7\f\2\2YZ\7\r\2\2Z\25\3\2\2\2[\\\7\13\2\2\\]\7\32\2"+
		"\2]^\7\4\2\2^_\7\32\2\2_`\7\f\2\2`a\7\r\2\2a\27\3\2\2\2bc\7\13\2\2cd\7"+
		"\32\2\2de\7\6\2\2ef\7\32\2\2fg\7\f\2\2gh\7\r\2\2h\31\3\2\2\2ij\7\13\2"+
		"\2jk\7\32\2\2kl\7\5\2\2lm\7\32\2\2mn\7\f\2\2no\7\r\2\2o\33\3\2\2\2pq\7"+
		"\n\2\2qr\5\36\20\2rs\7\f\2\2st\5\6\4\2tu\7\16\2\2u\35\3\2\2\2v{\5 \21"+
		"\2wx\t\2\2\2xz\5 \21\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\37\3\2"+
		"\2\2}{\3\2\2\2~\177\t\3\2\2\177!\3\2\2\2\u0080\u0081\7\26\2\2\u0081\u0082"+
		"\7\13\2\2\u0082\u0083\7\f\2\2\u0083#\3\2\2\2\u0084\u0085\7\25\2\2\u0085"+
		"%\3\2\2\2\b/\65;LR{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}