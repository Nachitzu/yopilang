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
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, Mayoht=16, Menhok=17, 
		BEGIN=18, ONLIVE=19, END=20, PRINT=21, SCAN=22, VAR=23, TEXTO=24, NUMERO=25, 
		ENTERO=26, DECIMAL=27, O=28, Y=29, WS=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'PryxDrax'", "'Xynth'", "'Skorn'", "'Kryst'", "'KrystKryst)'", 
		"'asdf'", "';'", "'YttrPlor'", "'Draxzirjyxskronzir'", "'Zyxblippryxplorskronglorkzirdrax('", 
		"'('", "')'", "'Synt'", "'Qwertzirvokpryxglork'", "'Thryp'", "Mayoht", 
		"Menhok", "'Xylok'", "'Onlik'", "'Zynd'", "'Plork'", "'Draxvokzirplor'", 
		"VAR", "TEXTO", "NUMERO", "ENTERO", "DECIMAL", "'o'", "'y'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_constantes = 1, RULE_desarrollo = 2, RULE_variables = 3, 
		RULE_texto = 4, RULE_entero = 5, RULE_decimal = 6, RULE_pasos = 7, RULE_operacion = 8, 
		RULE_multiplicacion = 9, RULE_division = 10, RULE_suma = 11, RULE_resta = 12, 
		RULE_para = 13, RULE_mientras = 14, RULE_logica = 15, RULE_operadores = 16, 
		RULE_leer = 17, RULE_escribir = 18;
	public static final String[] ruleNames = {
		"program", "constantes", "desarrollo", "variables", "texto", "entero", 
		"decimal", "pasos", "operacion", "multiplicacion", "division", "suma", 
		"resta", "para", "mientras", "logica", "operadores", "leer", "escribir"
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
			setState(38); match(BEGIN);
			setState(39); constantes();
			setState(40); match(ONLIVE);
			setState(41); desarrollo();
			setState(42); match(END);
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__7) | (1L << VAR))) != 0)) {
				{
				{
				setState(44); variables();
				}
				}
				setState(49);
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << PRINT) | (1L << SCAN))) != 0)) {
				{
				{
				setState(50); pasos();
				}
				}
				setState(55);
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
			setState(59);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); texto();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); entero();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); decimal();
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
			setState(61); match(T__7);
			setState(62); match(VAR);
			setState(63); match(T__6);
			setState(64); match(TEXTO);
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
			setState(66); match(T__14);
			setState(67); match(ENTERO);
			setState(68); match(T__9);
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
			setState(70); match(VAR);
			setState(71); match(DECIMAL);
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
			setState(76);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); escribir();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); operacion();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(75); leer();
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
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); multiplicacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); division();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); suma();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); resta();
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
			setState(84); match(T__4);
			setState(85); match(ENTERO);
			setState(86); match(T__0);
			setState(87); match(ENTERO);
			setState(88); match(T__3);
			setState(89); match(T__2);
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
			setState(91); match(T__4);
			setState(92); match(ENTERO);
			setState(93); match(T__13);
			setState(94); match(ENTERO);
			setState(95); match(T__3);
			setState(96); match(T__2);
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
			setState(98); match(T__4);
			setState(99); match(ENTERO);
			setState(100); match(T__11);
			setState(101); match(ENTERO);
			setState(102); match(T__3);
			setState(103); match(T__2);
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
			setState(105); match(T__4);
			setState(106); match(ENTERO);
			setState(107); match(T__12);
			setState(108); match(ENTERO);
			setState(109); match(T__3);
			setState(110); match(T__2);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode ENTERO(int i) {
			return getToken(ParserTParser.ENTERO, i);
		}
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public OperadoresContext operadores() {
			return getRuleContext(OperadoresContext.class,0);
		}
		public List<TerminalNode> ENTERO() { return getTokens(ParserTParser.ENTERO); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(T__4);
			setState(113); match(VAR);
			setState(114); match(T__2);
			setState(115); match(ENTERO);
			setState(116); match(T__8);
			setState(117); match(VAR);
			setState(118); operadores();
			setState(119); match(ENTERO);
			setState(120); match(T__8);
			setState(121); match(VAR);
			setState(122); match(T__10);
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
		enterRule(_localctx, 28, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(T__5);
			setState(125); logica();
			setState(126); match(T__3);
			setState(127); desarrollo();
			setState(128); match(T__1);
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
		enterRule(_localctx, 30, RULE_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); operadores();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O || _la==Y) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==O || _la==Y) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(132); operadores();
				}
				}
				setState(137);
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
		enterRule(_localctx, 32, RULE_operadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 34, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(SCAN);
			setState(141); match(T__4);
			setState(142); match(T__3);
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
		enterRule(_localctx, 36, RULE_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(PRINT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\4\7\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\3\n\3"+
		"\n\5\nU\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0088\n\21\f\21\16\21\u008b\13"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\36\37\3\2\22\23\u008b\2(\3\2\2\2"+
		"\4\61\3\2\2\2\6\67\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fD\3\2\2\2\16H\3\2\2"+
		"\2\20N\3\2\2\2\22T\3\2\2\2\24V\3\2\2\2\26]\3\2\2\2\30d\3\2\2\2\32k\3\2"+
		"\2\2\34r\3\2\2\2\36~\3\2\2\2 \u0084\3\2\2\2\"\u008c\3\2\2\2$\u008e\3\2"+
		"\2\2&\u0092\3\2\2\2()\7\24\2\2)*\5\4\3\2*+\7\25\2\2+,\5\6\4\2,-\7\26\2"+
		"\2-\3\3\2\2\2.\60\5\b\5\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64\66\5\20\t\2\65\64\3\2\2\2\669\3\2"+
		"\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67\3\2\2\2:>\5\n\6\2;>\5\f"+
		"\7\2<>\5\16\b\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?@\7\n\2\2@A\7"+
		"\31\2\2AB\7\13\2\2BC\7\32\2\2C\13\3\2\2\2DE\7\3\2\2EF\7\34\2\2FG\7\b\2"+
		"\2G\r\3\2\2\2HI\7\31\2\2IJ\7\35\2\2J\17\3\2\2\2KO\5&\24\2LO\5\22\n\2M"+
		"O\5$\23\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\21\3\2\2\2PU\5\24\13\2QU\5\26"+
		"\f\2RU\5\30\r\2SU\5\32\16\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\23"+
		"\3\2\2\2VW\7\r\2\2WX\7\34\2\2XY\7\21\2\2YZ\7\34\2\2Z[\7\16\2\2[\\\7\17"+
		"\2\2\\\25\3\2\2\2]^\7\r\2\2^_\7\34\2\2_`\7\4\2\2`a\7\34\2\2ab\7\16\2\2"+
		"bc\7\17\2\2c\27\3\2\2\2de\7\r\2\2ef\7\34\2\2fg\7\6\2\2gh\7\34\2\2hi\7"+
		"\16\2\2ij\7\17\2\2j\31\3\2\2\2kl\7\r\2\2lm\7\34\2\2mn\7\5\2\2no\7\34\2"+
		"\2op\7\16\2\2pq\7\17\2\2q\33\3\2\2\2rs\7\r\2\2st\7\31\2\2tu\7\17\2\2u"+
		"v\7\34\2\2vw\7\t\2\2wx\7\31\2\2xy\5\"\22\2yz\7\34\2\2z{\7\t\2\2{|\7\31"+
		"\2\2|}\7\7\2\2}\35\3\2\2\2~\177\7\f\2\2\177\u0080\5 \21\2\u0080\u0081"+
		"\7\16\2\2\u0081\u0082\5\6\4\2\u0082\u0083\7\20\2\2\u0083\37\3\2\2\2\u0084"+
		"\u0089\5\"\22\2\u0085\u0086\t\2\2\2\u0086\u0088\5\"\22\2\u0087\u0085\3"+
		"\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"!\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\t\3\2\2\u008d#\3\2\2\2\u008e"+
		"\u008f\7\30\2\2\u008f\u0090\7\r\2\2\u0090\u0091\7\16\2\2\u0091%\3\2\2"+
		"\2\u0092\u0093\7\27\2\2\u0093\'\3\2\2\2\b\61\67=NT\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}