grammar Expr;

prog: stat+;

stat: expr NEWLINE;

expr:
    <assoc=right> expr POW expr                     # power
    | MINUS expr                                    # unaryMinus
    | expr FACTORIAL                                # factorial
    | expr (TIMES | DIV) expr                       # mulDiv
    | expr (PLUS | MINUS) expr                      # addSub
    | atom                                          # anAtom
    ;

atom:
    scientific                                      # scientificAtom
    | constant                                      # constantAtom
    | func_                                         # function
    | LPAREN expr RPAREN                            # parens
    ;

scientific:
    SCIENTIFIC_NUMBER;

constant:
    PI
    | EULER
    ;

func_:
    funcname LPAREN expr (COMMA expr)* RPAREN;

funcname:
    COS | TAN | SIN | ACOS | ATAN | ASIN | LOG | LN | SINH | COSH | TANH
    ;

COS: 'cos';
SIN: 'sin';
TAN: 'tan';
ACOS: 'acos';
ASIN: 'asin';
ATAN: 'atan';
LN: 'ln';
LOG: 'log';
SINH: 'sinh';
COSH: 'cosh';
TANH: 'tanh';

LPAREN: '(';
RPAREN: ')';
PLUS: '+';
MINUS: '-';
TIMES: '*' | '×';
DIV: '/' | '÷';
POW: '**';
FACTORIAL: '!';
PI: 'pi' | 'π';
EULER: 'e';
COMMA: ',';

SCIENTIFIC_NUMBER
    : [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?
    ;

NEWLINE:'\r'? '\n' | EOF;

WS: [ 	]+ -> skip;