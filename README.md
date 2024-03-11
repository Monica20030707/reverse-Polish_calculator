# reverse-Polish_calculator
Generating ANTLR lexer and parser code from ANTLR grammar to implement Polish calculator.

The generating is builded with libraries from Maven, but also have the library online installed in Lib folder.

The code at the moment able to:
Having the Grammar generated in 'Expr.g4', able to generated Parser and Lexer from g4 file, and created Visitor and Listener to use Parser and Lexer.

The code has not able to, but the goal is:
The RevsPolishCalculator.java will read from ExprBaseVisitor.java and setting calculation function here. This is the most important java implementation for the calculation.

The RevsPolishCalculatorTest.java is for Unit Test.

Both of them didn't work.
