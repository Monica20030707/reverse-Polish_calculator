import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class RevsPolishCalculatorTest {
    public static void main(String[] args) {
        // Parse the expression
        ExprLexer lexer = new ExprLexer(CharStreams.fromString("(1+2)!÷(3-4**2)"));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.equation();

        // Visit the parse tree
        RevsPolishCalculator calculator = new RevsPolishCalculator();
        double result = calculator.visit(tree);

        System.out.println("Result: " + result);
    }
}
