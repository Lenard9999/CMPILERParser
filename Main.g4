grammar Main;	
// Starting Node	
start: EOF;


// Parsers
// Declarations Ex. int x = 0; int x; int[] x = create int[arr + 1]; newArr[arr_size + 1] = x; newArr[arr_size + 1] = arr[i];
any_declaration 
    : variable_declaration_vartype
    | variable_declaration_no_vartype
    | array_declaration_vartype
    | array_declaration_no_vartype
    ; 

assigned_expression
    : (STRING | NUMBER | LABEL) 
    ;

variable_declaration_vartype
    : VARIABLE_TYPE WHITE_SPACE LABEL (WHITE_SPACE? ASSIGN WHITE_SPACE? assigned_expression)? SEMICOLON 
    ;

variable_declaration_no_vartype
    : LABEL WHITE_SPACE? ASSIGN WHITE_SPACE? assigned_expression SEMICOLON 
    ;

array_size 
    : (NUMBER* | (LABEL OPERATORS (LABEL | NUMBER+)) | LABEL) 
    ;

array_variable 
    : LABEL OPEN_BRACE array_size CLOSE_BRACE
    ;

array_declaration_vartype
    : VARIABLE_TYPE OPEN_BRACE CLOSE_BRACE WHITE_SPACE LABEL (WHITE_SPACE? ASSIGN WHITE_SPACE? CREATE WHITE_SPACE? VARIABLE_TYPE OPEN_BRACE array_size CLOSE_BRACE)? SEMICOLON 
    ;

array_declaration_no_vartype
    : array_variable WHITE_SPACE? ASSIGN WHITE_SPACE? (assigned_expression | array_variable) SEMICOLON 
    ;
 
// print statement
/*
Ex. 
print("Your number is: " +i);
print("X is " +x+ " while Y is " +y);
print("Let's add them! Result is: " +(x + y));
print("Let's do something complicated! " +((x + y + z) * (x*y)/fX);
print("Thank you very much!");
*/



// scan statement Ex. scan("Give me a random number: ", i+1); 
scan_statement
    : SCAN OPEN_PAREN display_message_parameter COMMA  CLOSE_PAREN SEMICOLON
    ;

display_message_parameter 
    : STRING
    ;

value_parameter
    : 
    ;

// constant declaration Ex. [constant int MY_CONSTANT = 500;]
constant_declaration 
    : CONSTANT WHITE_SPACE any_declaration
    ;

// return statement

// arithmetic statement
expression
    :	expression (OPERATORS) expression
    |	NUMBER
    |	OPEN_PAREN expression CLOSE_PAREN
    ;

// comparison statement (i == 0)

// conditional statement (if else)

// loop statement = (for | while)

// function calling = (void | non void | print statement | scan statement)

// function declaration = (void | non void)

// main function 



// Lexers
LOWERCASE : [a-z] ;
UPPERCASE : [A-z] ;
DIGIT : [0-9] ;
NEWLINE
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BLOCKCOMMENT
    :   '/*' .*? '*/'
        -> skip
    ;

LINECOMMENT
    :   '//' ~[\r\n]*
        -> skip
    ;


STRING : '"' (LOWERCASE | UPPERCASE | DIGIT | WHITE_SPACE | SIMPLE_PUNCTUATIONS)* '"' ;
NUMBER : '-'?[0-9]*('.'[0-9]+)'f'? | '-'?[0-9]+ ;
LABEL : (LOWERCASE | UPPERCASE | '_')+ ;
WHITE_SPACE : (' ' | '\r' | '\t' | '\n') ; 
VARIABLE_TYPE: (INT_DEC | BOOLEAN_DEC | FLOAT_DEC | STRING_DEC) ;
OPERATORS : (PLUS | MINUS | MULTI | DIV | MOD) ;
SIMPLE_PUNCTUATIONS : (DOT | COMMA | NOT | QUESTION) ;

CREATE : 'create' ;
CONSTANT : 'constant' ;
RETURN : 'return' ;
PRINT : 'print' ;
SCAN : 'scan' ;

IF : 'if' ;
ELSE : 'else' ;
ELSE_IF : 'else if' ;

FOR : 'for' ;
UP_TO : 'up to' ;
DOWN_TO : 'down to' ;
WHILE : 'while' ;

VOID : 'void' ;
INT_DEC : 'int' ; 
BOOLEAN_DEC : 'bool' ;
FLOAT_DEC : 'float';
STRING_DEC : 'String' ;

OPEN_PAREN : '(' ;
CLOSE_PAREN : ')';
OPEN_BRACKET : '{' ;
CLOSE_BRACKET : '}' ;
OPEN_BRACE : '[' ;
CLOSE_BRACE : ']' ;

LESS : '<';
LESSQEUAL : '<=';
GREATER : '>';
GREATEREQUAL : '>=';

PLUS : '+';
MINUS : '-';
MULTI : '*';
DIV : '/';
MOD : '%';

AND : '&';
OR : '|';
ANDAND : '&&';
OROR : '||';
NOT : '!';

ASSIGN : '=' ;
EQUAL : '==' ;
QUESTION : '?';
COLON : ':';
DOT : '.';
SEMICOLON : ';' ;
COMMA : ',' ;