// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(@NotNull ParserTParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(@NotNull ParserTParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(@NotNull ParserTParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(@NotNull ParserTParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterOperadores(@NotNull ParserTParser.OperadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitOperadores(@NotNull ParserTParser.OperadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(@NotNull ParserTParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(@NotNull ParserTParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(@NotNull ParserTParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(@NotNull ParserTParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(@NotNull ParserTParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(@NotNull ParserTParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(@NotNull ParserTParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(@NotNull ParserTParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(@NotNull ParserTParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(@NotNull ParserTParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#logica}.
	 * @param ctx the parse tree
	 */
	void enterLogica(@NotNull ParserTParser.LogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#logica}.
	 * @param ctx the parse tree
	 */
	void exitLogica(@NotNull ParserTParser.LogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(@NotNull ParserTParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(@NotNull ParserTParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#escribir}.
	 * @param ctx the parse tree
	 */
	void enterEscribir(@NotNull ParserTParser.EscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#escribir}.
	 * @param ctx the parse tree
	 */
	void exitEscribir(@NotNull ParserTParser.EscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#desarrollo}.
	 * @param ctx the parse tree
	 */
	void enterDesarrollo(@NotNull ParserTParser.DesarrolloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#desarrollo}.
	 * @param ctx the parse tree
	 */
	void exitDesarrollo(@NotNull ParserTParser.DesarrolloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(@NotNull ParserTParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(@NotNull ParserTParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(@NotNull ParserTParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(@NotNull ParserTParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(@NotNull ParserTParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(@NotNull ParserTParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#pasos}.
	 * @param ctx the parse tree
	 */
	void enterPasos(@NotNull ParserTParser.PasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#pasos}.
	 * @param ctx the parse tree
	 */
	void exitPasos(@NotNull ParserTParser.PasosContext ctx);
}