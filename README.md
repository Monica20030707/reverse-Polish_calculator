# Reverse Polish Calculator

This project implements a Reverse Polish Notation (RPN) calculator using ANTLR for parsing and evaluation. It takes infix expressions as input and converts them to RPN, then calculates the result.

## Project Structure

-   `Expr.g4`: The ANTLR grammar definition for the calculator.
-   `src/`: Contains the source files.
    -   `RevsPolishCalculator.java`: The main application class.
    -   `EvalVisitor.java`: The custom visitor for expression evaluation.
    -   `ANTLR/`: Contains the generated ANTLR lexer and parser files.
-   `test/`: Contains unit tests for the calculator.
-   `lib/`: Contains necessary ANTLR and JUnit JAR files.
-   `build/`: Contains compiled Java classes.

## How to Build and Run the Application

To build and run the Reverse Polish Calculator, navigate to the project root directory and execute the following commands.

**1. Generate ANTLR Parser and Lexer:**
```bash
java -jar lib/antlr-4.13.1-complete.jar -o src/ANTLR -visitor -package ANTLR Expr.g4
```

**2. Compile the Source Code:**
```bash
javac -d build -cp src:lib/antlr-4.13.1-complete.jar src/*.java src/ANTLR/*.java
```

**3. Run the Application:**
```bash
java -cp build:lib/antlr-4.13.1-complete.jar RevsPolishCalculator
```
After running the command, the application will prompt you to "Input expression:". You can type an infix mathematical expression (e.g., `1 + 2 * 3`) and press Enter to see the RPN conversion and the calculated result.

## How to Run Unit Tests

To run the unit tests, navigate to the project root directory and execute the following commands.

**1. Compile the Test Files:**
```bash
javac -d build -cp build:lib/junit-platform-console-standalone.jar:lib/antlr-4.13.1-complete.jar test/UnitTest.java
```

**2. Run the Tests:**
```bash
java -jar lib/junit-platform-console-standalone.jar --classpath build:lib/antlr-4.13.1-complete.jar --select-class UnitTest
```
