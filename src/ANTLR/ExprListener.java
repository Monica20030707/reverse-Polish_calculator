// Generated from Expr.g4 by ANTLR 4.13.1
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorial}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFactorial(ExprParser.FactorialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorial}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFactorial(ExprParser.FactorialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(ExprParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(ExprParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(ExprParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(ExprParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anAtom}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnAtom(ExprParser.AnAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anAtom}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnAtom(ExprParser.AnAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scientificAtom}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterScientificAtom(ExprParser.ScientificAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scientificAtom}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitScientificAtom(ExprParser.ScientificAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantAtom}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantAtom(ExprParser.ConstantAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantAtom}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantAtom(ExprParser.ConstantAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ExprParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ExprParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParens(ExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParens(ExprParser.ParensContext ctx);
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