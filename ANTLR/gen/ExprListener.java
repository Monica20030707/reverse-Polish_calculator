// Generated from Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(ExprParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(ExprParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(ExprParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(ExprParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(ExprParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(ExprParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ExprParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ExprParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExprParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExprParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(ExprParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(ExprParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ExprParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ExprParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExprParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#func_}.
	 * @param ctx the parse tree
	 */
	void enterFunc_(ExprParser.Func_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#func_}.
	 * @param ctx the parse tree
	 */
	void exitFunc_(ExprParser.Func_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(ExprParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(ExprParser.FuncnameContext ctx);
}