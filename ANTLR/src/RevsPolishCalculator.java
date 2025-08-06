package revspolishcalculator;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class RevsPolishCalculator {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.print("Input expression: ");
        while ((line = reader.readLine()) != null) {
            ANTLRInputStream input = new ANTLRInputStream(line);
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            ParseTree tree = parser.prog();

            EvalVisitor eval = new EvalVisitor();
            double result = eval.visit(tree);

            System.out.println("Infix expression: " + line);
            System.out.println("Reverse Polish expression: " + eval.rpn.toString().trim());
            System.out.println("Result: " + format(result));
            System.out.print("Input expression: ");
        }
    }

    public static String format(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else {
            DecimalFormat df = new DecimalFormat("#.#####");
            return df.format(d);
        }
    }
}