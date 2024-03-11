import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class RevrPolishReader {
    public static void main(String[] args) {
        String expression = "(5+2)*3";

        // Create a CharStream that reads from the input string
        CharStream input = CharStreams.fromString(expression);

        // Create a lexer that feeds off of the input CharStream
        ExprLexer lexer = new ExprLexer(input);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        ExprParser parser = new ExprParser(tokens);

        // Begin parsing at the expression rule
        ParseTree tree = parser.equation();

        // Create a listener
        MyListener listener = new MyListener();

        // Walk the parse tree with the listener
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        // Get the RPN expression
        String rpn = listener.getReversePolishNotation();
        System.out.println("Reverse Polish Notation: " + rpn);
    }
}

class MyListener extends ExprBaseListener {
    private Stack<String> stack = new Stack<>();
    private StringBuilder output = new StringBuilder();

    @Override
    public void exitEquation(ExprParser.EquationContext ctx) {
        // Append all elements from the stack to the output
        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }
    }

    @Override
    public void exitExpression(ExprParser.ExpressionContext ctx) {
        // Append all elements from the stack to the output
        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }
    }

    @Override
    public void exitMultiplyingExpression(ExprParser.MultiplyingExpressionContext ctx) {
        // Append all elements from the stack to the output
        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }
    }

    @Override
    public void exitPowExpression(ExprParser.PowExpressionContext ctx) {
        // Append all elements from the stack to the output
        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }
    }

    @Override
    public void exitUnaryExpression(ExprParser.UnaryExpressionContext ctx) {
        // If the context contains a number, add it to the output
        if (ctx.SCIENTIFIC_NUMBER() != null) {
            output.append(ctx.SCIENTIFIC_NUMBER().getText()).append(" ");
        } else if (ctx.expression() != null) { // If the context contains an expression
            output.append(ctx.getChild(0).getText()).append(" "); // Add the unary operator
        }
    }

    public String getReversePolishNotation() {
        return output.toString().trim();
    }
}