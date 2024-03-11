// Generated from Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(ExprParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(ExprParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(ExprParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ExprParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ExprParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(ExprParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ExprParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExprParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#func_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_(ExprParser.Func_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(ExprParser.FuncnameContext ctx);
}