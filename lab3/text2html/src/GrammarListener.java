// Generated from ../grammar/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#eq1}.
	 * @param ctx the parse tree
	 */
	void enterEq1(GrammarParser.Eq1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#eq1}.
	 * @param ctx the parse tree
	 */
	void exitEq1(GrammarParser.Eq1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#eq2}.
	 * @param ctx the parse tree
	 */
	void enterEq2(GrammarParser.Eq2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#eq2}.
	 * @param ctx the parse tree
	 */
	void exitEq2(GrammarParser.Eq2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#math_command}.
	 * @param ctx the parse tree
	 */
	void enterMath_command(GrammarParser.Math_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#math_command}.
	 * @param ctx the parse tree
	 */
	void exitMath_command(GrammarParser.Math_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#text_command}.
	 * @param ctx the parse tree
	 */
	void enterText_command(GrammarParser.Text_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#text_command}.
	 * @param ctx the parse tree
	 */
	void exitText_command(GrammarParser.Text_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(GrammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(GrammarParser.TextContext ctx);
}