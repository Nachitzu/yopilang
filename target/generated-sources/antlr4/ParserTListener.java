// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ParserTParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ParserTParser.PrintContext ctx);
}