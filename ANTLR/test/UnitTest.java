package revspolishcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {

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

    @Test
    @DisplayName("Test basic arithmetic operations")
    void testBasicArithmetic() {
        assertEquals("5", RevsPolishCalculator.format(2 + 3));
        assertEquals("-1", RevsPolishCalculator.format(2 - 3));
        assertEquals("6", RevsPolishCalculator.format(2 * 3));
        assertEquals("2.5", RevsPolishCalculator.format(5 / 2));
        assertEquals("8", RevsPolishCalculator.format(Math.pow(2, 3)));
    }

    @Test
    @DisplayName("Test trigonometric and logarithmic functions")
    void testFunctions() {
        assertEquals("0.5", RevsPolishCalculator.format(Math.sin(Math.PI / 6)));
        assertEquals("3", RevsPolishCalculator.format(Math.log(Math.pow(Math.E, 3))));
    }

    @Test
    @DisplayName("Test factorial function")
    void testFactorial() {
        assertEquals("120", RevsPolishCalculator.format(factorial(5)));
    }

    @Test
    @DisplayName("Test complex expression from requirements")
    void testComplexExpression() {
        assertEquals("-0.46154", RevsPolishCalculator.format(factorial(1 + 2) / (3 - Math.pow(4, 2))));
    }
}