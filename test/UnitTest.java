import ANTLR.ExprLexer;
import ANTLR.ExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnitTest {

    // Helper method to evaluate an expression using the ANTLR parser and visitor
    private double evaluateExpression(String expression) {
        // Remove the problematic Unicode character if present
        expression = expression.replace("\u2061", "");
        // Add newline for the grammar to correctly parse the end of the input
        CharStream input = CharStreams.fromString(expression + "\n");
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prog();

        EvalVisitor eval = new EvalVisitor();
        return eval.visit(tree);
    }

    @Test
    @DisplayName("Test basic addition")
    void testAddition() {
        assertEquals(5.0, evaluateExpression("2 + 3"), 0.0001);
    }

    @Test
    @DisplayName("Test basic subtraction")
    void testSubtraction() {
        assertEquals(-1.0, evaluateExpression("2 - 3"), 0.0001);
    }

    @Test
    @DisplayName("Test basic multiplication")
    void testMultiplication() {
        assertEquals(6.0, evaluateExpression("2 * 3"), 0.0001);
    }

    @Test
    @DisplayName("Test basic division")
    void testDivision() {
        assertEquals(2.5, evaluateExpression("5 / 2"), 0.0001);
    }

    @Test
    @DisplayName("Test power operation")
    void testPower() {
        assertEquals(8.0, evaluateExpression("2 ** 3"), 0.0001);
    }

    @Test
    @DisplayName("Test unary minus")
    void testUnaryMinus() {
        assertEquals(-5.0, evaluateExpression("-5"), 0.0001);
        assertEquals(-3.0, evaluateExpression("2 + -5"), 0.0001);
    }

    @Test
    @DisplayName("Test parentheses for order of operations")
    void testParentheses() {
        assertEquals(10.0, evaluateExpression("(2 + 3) * 2"), 0.0001);
        assertEquals(8.0, evaluateExpression("2 + (3 * 2)"), 0.0001);
    }

    @Test
    @DisplayName("Test factorial function")
    void testFactorial() {
        assertEquals(120.0, evaluateExpression("5!"), 0.0001);
        assertEquals(1.0, evaluateExpression("0!"), 0.0001);
    }

    @Test
    @DisplayName("Test constants PI and EULER")
    void testConstants() {
        assertEquals(Math.PI, evaluateExpression("pi"), 0.0001);
        assertEquals(Math.E, evaluateExpression("e"), 0.0001);
    }

    @Test
    @DisplayName("Test trigonometric functions (sin, cos, tan)")
    void testTrigonometricFunctions() {
        assertEquals(0.5, evaluateExpression("sin(pi / 6)"), 0.0001); // sin(30 degrees)
        assertEquals(1.0, evaluateExpression("cos(0)"), 0.0001);
        assertEquals(1.0, evaluateExpression("tan(pi / 4)"), 0.0001); // tan(45 degrees)
    }

    @Test
    @DisplayName("Test logarithmic functions (ln, log)")
    void testLogarithmicFunctions() {
        assertEquals(3.0, evaluateExpression("ln(e ** 3)"), 0.0001);
        assertEquals(2.0, evaluateExpression("log(100)"), 0.0001); // log base 10
    }

    @Test
    @DisplayName("Test scientific notation")
    void testScientificNotation() {
        assertEquals(100.0, evaluateExpression("1e2"), 0.0001);
        assertEquals(0.01, evaluateExpression("1e-2"), 0.0001);
        assertEquals(2500.0, evaluateExpression("2.5e3"), 0.0001);
    }

    @Test
    @DisplayName("Test complex expression 1")
    void testComplexExpression1() {
        // (5! / (3 - 4**2)) + sin(pi/2)
        // (120 / (3 - 16)) + 1
        // (120 / -13) + 1
        // -9.230769... + 1 = -8.230769...
        assertEquals(-8.23076923, evaluateExpression("5! / (3 - 4**2) + sin(pi/2)"), 0.0001);
    }

    @Test
    @DisplayName("Test complex expression 2")
    void testComplexExpression2() {
        // 2 * (ln(e) + cos(0)) - 10 / 5
        // 2 * (1 + 1) - 2
        // 2 * 2 - 2
        // 4 - 2 = 2
        assertEquals(2.0, evaluateExpression("2 * (ln(e) + cos(0)) - 10 / 5"), 0.0001);
    }

    @Test
    @DisplayName("Test division by zero (expecting an error)")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> evaluateExpression("10 / 0"));
    }
}
