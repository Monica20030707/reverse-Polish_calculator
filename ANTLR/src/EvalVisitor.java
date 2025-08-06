package revspolishcalculator;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends ExprBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<String, Double>();
    public StringBuilder rpn = new StringBuilder();

    @Override
    public Double visitProg(ExprParser.ProgContext ctx) {
        return visit(ctx.stat(0));
    }

    @Override
    public Double visitStat(ExprParser.StatContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitParens(ExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitPower(ExprParser.PowerContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        rpn.append("** ");
        return Math.pow(left, right);
    }

    @Override
    public Double visitMulDiv(ExprParser.MulDivContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if (ctx.TIMES() != null) {
            rpn.append("* ");
            return left * right;
        }
        rpn.append("/ ");
        return left / right;
    }

    @Override
    public Double visitAddSub(ExprParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if (ctx.PLUS() != null) {
            rpn.append("+ ");
            return left + right;
        }
        rpn.append("- ");
        return left - right;
    }

    @Override
    public Double visitUnaryMinus(ExprParser.UnaryMinusContext ctx) {
        double value = visit(ctx.expr());
        rpn.append("- ");
        return -value;
    }

    @Override
    public Double visitScientificAtom(ExprParser.ScientificAtomContext ctx) {
        rpn.append(ctx.getText()).append(" ");
        return Double.valueOf(ctx.getText());
    }

    @Override
    public Double visitConstantAtom(ExprParser.ConstantAtomContext ctx) {
        rpn.append(ctx.getText()).append(" ");
        if (ctx.constant().PI() != null) {
            return Math.PI;
        }
        return Math.E;
    }

    @Override
    public Double visitFunction(ExprParser.FunctionContext ctx) {
        double value = visit(ctx.func_().expr(0));
        String funcName = ctx.func_().funcname().getText();
        rpn.append(funcName).append(" ");
        switch (funcName) {
            case "cos": return Math.cos(value);
            case "sin": return Math.sin(value);
            case "tan": return Math.tan(value);
            case "acos": return Math.acos(value);
            case "asin": return Math.asin(value);
            case "atan": return Math.atan(value);
            case "log": return Math.log10(value);
            case "ln": return Math.log(value);
            case "sinh": return Math.sinh(value);
            case "cosh": return Math.cosh(value);
            case "tanh": return Math.tanh(value);
            default: throw new RuntimeException("Unknown function: " + funcName);
        }
    }

    @Override
    public Double visitFactorial(ExprParser.FactorialContext ctx) {
        double value = visit(ctx.expr());
        rpn.append("! ");
        return factorial(value);
    }

    private double factorial(double n) {
        if (n < 0) {
            throw new RuntimeException("Factorial of negative number is not defined.");
        }
        if (n == 0) {
            return 1;
        }
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
