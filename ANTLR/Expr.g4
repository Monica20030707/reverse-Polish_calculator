grammar Expr;

prog:   (expression NEWLINE)* ;
expression:   expression ('^') expression
    |   expression ('*'|'/') expression
    |   expression ('+'|'-') expression
    |   FUNCTION
    |   NUMBER
    |   '(' expression ')'
    ;
NEWLINE : [\r\n]+ ;
NUMBER : INTEGER | FLOAT | SCIENTIFIC;
INTEGER : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]*;
SCIENTIFIC : [0-9]+ ('e' | 'E') ('+'|'-')? [0-9]+;
FUNCTION : 'log' | 'ln' | 'sin' | 'cos' | 'tan' | 'asin' | 'acos' | 'atan' | 'sinh' | 'cosh' | 'tanh';
