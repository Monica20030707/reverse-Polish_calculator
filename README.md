# Reverse Polish Calculator

This project implements a Reverse Polish Notation (RPN) calculator using ANTLR for parsing and evaluation. It takes infix expressions as input and converts them to RPN, then calculates the result.

## Project Structure

-   `ANTLR/Expr.g4`: The ANTLR grammar definition for the calculator.
-   `ANTLR/src/`: Contains the generated ANTLR lexer/parser files and the custom visitor (`EvalVisitor.java`) for expression evaluation, along with the main application (`RevsPolishCalculator.java`).
-   `ANTLR/test/`: Contains unit tests for the calculator.
-   `ANTLR/lib/`: Contains necessary ANTLR and JUnit JAR files.
-   `ANTLR/build/`: Contains compiled Java classes.

## How to Run the Application

To run the Reverse Polish Calculator, navigate to the project root directory and execute the following commands.

First, compile all necessary Java source files:
```bash
javac -cp "ANTLR/lib/antlr-4.13.1-complete.jar" ANTLR/src/RevsPolishCalculator.java ANTLR/src/EvalVisitor.java ANTLR/src/ANTLR/*.java -d ANTLR/build/
```

Then, run the main application:
```bash
java -cp "ANTLR/lib/antlr-4.13.1-complete.jar:ANTLR/build" revspolishcalculator.RevsPolishCalculator
```

After running the command, the application will prompt you to "Input expression:". You can type an infix mathematical expression (e.g., `1 + 2 * 3`) and press Enter to see the RPN conversion and the calculated result.

## How to Run Unit Tests

To run the unit tests, navigate to the project root directory and execute the following commands.

First, compile the unit test file:
```bash
javac -cp "ANTLR/lib/antlr-4.13.1-complete.jar:ANTLR/lib/junit-platform-console-standalone.jar:ANTLR/build" ANTLR/test/UnitTest.java -d ANTLR/build/
```

Then, run the tests using the JUnit console runner:
```bash
java -jar ANTLR/lib/junit-platform-console-standalone.jar --class-path ANTLR/build --scan-classpath
```

## Current Status

-   The ANTLR grammar (`Expr.g4`) is defined and used to generate the lexer and parser.
-   The `EvalVisitor.java` correctly traverses the parse tree and performs calculations.
-   The `RevsPolishCalculator.java` application successfully reads infix expressions, converts them to Reverse Polish Notation, and evaluates them.
-   Unit tests are available to verify the calculator's functionality.