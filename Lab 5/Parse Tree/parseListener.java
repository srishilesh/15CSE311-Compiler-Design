// Generated from parse.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parseParser}.
 */
public interface parseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parseParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(parseParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(parseParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(parseParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(parseParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(parseParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link parseParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(parseParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link parseParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(parseParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(parseParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseParser#term1}.
	 * @param ctx the parse tree
	 */
	void enterTerm1(parseParser.Term1Context ctx);
	/**
	 * Exit a parse tree produced by {@link parseParser#term1}.
	 * @param ctx the parse tree
	 */
	void exitTerm1(parseParser.Term1Context ctx);
	/**
	 * Enter a parse tree produced by {@link parseParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(parseParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(parseParser.FactorContext ctx);
}