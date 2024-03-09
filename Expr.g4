grammar Expr;

equation
    : expression EOF
    ;

expression
    : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*
    ;

multiplyingExpression
    : powExpression ((TIMES | DIV) powExpression)*
    ;

powExpression
    : unaryExpression (POW unaryExpression)*
    ;

unaryExpression
    : PLUS unaryExpression
    | MINUS unaryExpression
    | func_
    | atom
    | FACTORIAL
    ;

atom
    : scientific
    | variable
    | constant
    | LPAREN expression RPAREN
    ;

scientific
    : SCIENTIFIC_NUMBER
    ;

constant
    : PI
    | EULER
    ;

variable
    : VARIABLE
    ;

func_
    : funcname LPAREN expression (COMMA expression)* RPAREN
    ;

funcname
    : COS
    | TAN
    | SIN
    | ACOS
    | ATAN
    | ASIN
    | LOG
    | LN
    | SINH
    | COSH
    | TANH
    ;

COS
    : 'cos'
    ;

SIN
    : 'sin'
    ;

TAN
    : 'tan'
    ;

ACOS
    : 'acos'
    ;

ASIN
    : 'asin'
    ;

ATAN
    : 'atan'
    ;

LN
    : 'ln'
    ;

LOG
    : 'log'
    ;

SINH
    : 'sinh'
    ;

COSH
    : 'cosh'
    ;

TANH
    : 'tanh'
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

TIMES
    : '*'
    ;

DIV
    : '/'
    ;

POW
    : '^'
    ;

FACTORIAL
    : '!'
    ;

PI
    : 'pi'
    ;

EULER
    : 'e'
    ;
COMMA
    : ','
    ;
    
VARIABLE
    : VALID_ID_START VALID_ID_CHAR*
    ;

fragment VALID_ID_START
    : 'a' .. 'z'
    | 'A' .. 'Z'
    | '_'
    ;

fragment VALID_ID_CHAR
    : VALID_ID_START
    | '0' .. '9'
    ;

SCIENTIFIC_NUMBER
    : NUMBER ((E1 | E2) SIGN? NUMBER)?
    ;

fragment NUMBER
    : '0' ..'9'+ ('.' '0' ..'9'+)?
    ;

fragment E1
    : 'E'
    ;

fragment E2
    : 'e'
    ;

fragment SIGN
    : '+'
    | '-'
    ;

WS
    : [ \r\n\t]+ -> skip
    ;
