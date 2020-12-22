grammar Main;	
// Starting Node	
start: any_declaration EOF;

variable_type: (INT_DEC | BOOLEAN_DEC | FLOAT_DEC | STRING_DEC) ;
string : '"' (DIGIT | simple_punctuations | label | white_space)+ '"' ;
number : '-'?DIGIT*('.'DIGIT+)'f'? | '-'?DIGIT+ ;
label : (LOWERCASE | UNDERSCORE | UPPERCASE | 'f')+ variable_type* ; // WEIRD YUN f and BAWAL same name sa variable types yun label
white_space : (' ' | '\r' | '\t' | '\n') ; 
first_operators : (MULTI | DIV | MOD) ;
second_operators : (PLUS | MINUS) ;
operators : (first_operators | second_operators) ;
simple_punctuations : (DOT | COMMA | NOT | QUESTION| COLON) ;

// Parsers
// Declarations Ex. int x = 0; int x; int[] x = create int[arr + 1]; newArr[arr_size + 1] = x; newArr[arr_size + 1] = arr[i];
any_declaration 
    : variable_declaration_vartype
    | variable_declaration_no_vartype
    | array_declaration_vartype
    | array_declaration_no_vartype
    ; 

assigned_expression
    : (string | number | label) 
    ;

variable_declaration_vartype
    : variable_type white_space label (white_space? ASSIGN white_space? assigned_expression)? SEMICOLON 
    ;

variable_declaration_no_vartype
    : label white_space? ASSIGN white_space? assigned_expression SEMICOLON 
    ;

array_size 
    : expression
    ;

array_variable 
    : label OPEN_BRACE array_size CLOSE_BRACE
    ;

array_assign
    : white_space? ASSIGN white_space? CREATE white_space? variable_type OPEN_BRACE array_size CLOSE_BRACE
    | white_space? ASSIGN white_space? array_variable
    ;

array_declaration_vartype
    : variable_type OPEN_BRACE CLOSE_BRACE white_space label array_assign? SEMICOLON 
    ;

array_declaration_no_vartype
    : array_variable white_space? ASSIGN white_space? CREATE? white_space? (assigned_expression | array_variable) SEMICOLON
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
    : SCAN OPEN_PAREN display_message_parameter white_space? COMMA white_space? value_parameter CLOSE_PAREN SEMICOLON
    ;

display_message_parameter 
    : string
    ;

value_parameter
    : expression
    ;

// constant declaration Ex. constant int MY_CONSTANT = 500;
constant_declaration 
    : CONSTANT white_space any_declaration
    ;

// return statement

// arithmetic statement Ex. 100*100+100+num, 100+(100*100), (100+100)*100
expression
    : sub_expression
    | expression white_space? (first_operators) white_space? sub_expression
    | OPEN_PAREN white_space? expression white_space? CLOSE_PAREN
    ;

sub_expression 
    : sub_expression white_space? (second_operators) white_space? expression
    | value_expression
    ;

value_expression
    : number
    | label
    ;

// comparison statement (i == 0)

// conditional statement (if else)

// loop statement = (for | while)

// function calling = (void | non void | print statement | scan statement)

// function declaration = (void | non void)

// main function 


// Lexers
CREATE : 'create' ;
CONSTANT : 'constant' ;
RETURN : 'return' ;
PRINT : 'print' ;
SCAN : 'scan' ;

IF : 'if' ;
ELSE : 'else' ;
ELSE_IF : 'else if' ;
THEN : 'then' ;

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
UNDERSCORE : '_' ;
    
LOWERCASE
    : [a-z]
    ;

UPPERCASE
    : [A-Z]
    ;

DIGIT
    :   [0-9]
    ;

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