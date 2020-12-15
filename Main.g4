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
    : VARIABLE_TYPE WHITE_SPACE LABEL (WHITE_SPACE EQUAL WHITE_SPACE assigned_expression)? SEMICOLON 
    ;

variable_declaration_no_vartype
    : LABEL WHITE_SPACE EQUAL WHITE_SPACE assigned_expression SEMICOLON 
    ;

array_size 
    : (NUMBER* | (LABEL OPERATORS (LABEL | NUMBER+)) | LABEL) 
    ;

array_variable 
    : LABEL OPEN_BRACE array_size CLOSE_BRACE
    ;

array_declaration_vartype
    : VARIABLE_TYPE OPEN_BRACE CLOSE_BRACE WHITE_SPACE LABEL (WHITE_SPACE CREATE_WORD WHITE_SPACE VARIABLE_TYPE OPEN_BRACE array_size CLOSE_BRACE)? SEMICOLON 
    ;

array_declaration_no_vartype
    : array_variable WHITE_SPACE EQUAL WHITE_SPACE (assigned_expression | array_variable) SEMICOLON 
    ;
 
// print statement

// scan statement

// constant declaration [constant int MY_CONSTANT = 500;]

// return statement

// arithmetic statement

// comparison statement (i == 0)

// conditional statement (if else)

// loop statement = (for | while | do while)

// function declaration = (void | non void)

// function calling = (void | non void | print statement | scan statement)

// main function 


// Lexers
LOWERCASE : [a-z] ;
UPPERCASE : [A-z] ;
DIGIT : [0-9] ;
NEWLINE : ('\n' | '\r') ;

CREATE_WORD : 'create' ;
RETURN_WORD : 'return' ;
INT_DEC : 'int' ; 
BOOLEAN_DEC : 'bool' ;
FLOAT_DEC : 'float';
STRING_DEC : 'String' ;

STRING : '"' (LOWERCASE | UPPERCASE | DIGIT)* '"' ;
NUMBER : '-'?[0-9]*('.'[0-9]+)'f' | '-'?[0-9]+ ;
LABEL : (LOWERCASE | UPPERCASE | '_')+ ;
WHITE_SPACE : (' ' | '\r' | '\t' | '\n') ; 
VARIABLE_TYPE: (INT_DEC | BOOLEAN_DEC | FLOAT_DEC | STRING_DEC) ;
OPERATORS : ('+' | '-' | '*' | '/') ;

OPEN_PAREN : '(' ;
CLOSE_PAREN : ')';
OPEN_BRACKET : '{' ;
CLOSE_BRACKET : '}' ;
OPEN_BRACE : '[' ;
CLOSE_BRACE : ']' ;
SEMICOLON : ';' ;
COMMA : ',' ;
EQUAL : '=' ;
DOUBLEEQUAL : '==' ;