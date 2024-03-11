import java.util.Stack;

public class RevsPolishCalculator extends ExprBaseVisitor<Double> {
    private Stack<Double> stack = new Stack<>();

    @Override
    public Double visitEquation(ExprParser.EquationContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitExpression(ExprParser.ExpressionContext ctx) {
        for (ExprParser.MultiplyingExpressionContext multiplyingExpression : ctx.multiplyingExpression()) {
            visit(multiplyingExpression);
        }
        return stack.pop();
    }

    @Override
    public Double visitMultiplyingExpression(ExprParser.MultiplyingExpressionContext ctx) {
        for (ExprParser.PowExpressionContext powExpression : ctx.powExpression()) {
            visit(powExpression);
        }
        return stack.pop();
    }

    @Override
    public Double visitPowExpression(ExprParser.PowExpressionContext ctx) {
        for (ExprParser.UnaryExpressionContext unaryExpression : ctx.unaryExpression()) {
            visit(unaryExpression);
        }
        return stack.pop();
    }

    @Override
    public Double visitUnaryExpression(ExprParser.UnaryExpressionContext ctx) {
        if (ctx.atom() != null) {
            visit(ctx.atom());
        } else if (ctx.func_() != null) {
            visit(ctx.func_());
        }
        return stack.pop();
    }

    @Override
    public Double visitAtom(ExprParser.AtomContext ctx) {
        if (ctx.scientific() != null) {
            visit(ctx.scientific());
        } else if (ctx.variable() != null) {
            visit(ctx.variable());
        } else if (ctx.constant() != null) {
            visit(ctx.constant());
        } else if (ctx.expression() != null) {
            visit(ctx.expression());
        }
        return stack.pop();
    }

    // Similar methods for other rules...
}
