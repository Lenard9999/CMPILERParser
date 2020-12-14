grammar Main;		
start: EOF;

import_statement : IMPORT_WORD ;
other_white_space : ((comment)* WHITE_SPACE (comment)*)+ ;
white_space : (comment | MULTILINE_COMMENT | WHITE_SPACE)* ;
comment : (MULTILINE_COMMENT | LINE_COMMENT) ;
variable_declaration: (VARIABLE_TYPE STRING); //add variable declaration with assignment
array_declaration: variable_declaration OPEN_BRACE NUMBER* CLOSE_BRACE;

LOWERCASE : [a-z] ;
UPPERCASE : [A-z] ;
DIGIT : [0-9] ;
NEWLINE : ('\n' | '\r') ;
CLASS_WORD : 'class' ;
RETURN_WORD : 'return' ;
IMPORT_WORD : 'import' ; 
INT_DEC : 'int' ; 
BOOLEAN_DEC : 'boolean';
FLOAT_DEC : 'float';
STRING_DEC : 'String' ;

STRING : '"' (LOWERCASE | UPPERCASE | DIGIT)* '"' ;
NUMBER : '-'?[0-9]*('.'[0-9]+) | '-'?[0-9]+ ;
LABEL : (LOWERCASE | UPPERCASE | '_')+ ;
WHITE_SPACE : (' ' | '\r' | '\t' | '\n') ; 
VARIABLE_TYPE: (INT_DEC | BOOLEAN_DEC | FLOAT_DEC | STRING_DEC)

LINE_COMMENT : '//' (. | NEWLINE)*? NEWLINE ;
MULTILINE_COMMENT : '/*' .*? '*/' ;

OPEN_PAREN : '(' ;
CLOSE_PAREN : ')';
OPEN_BRACKET : '{' ;
CLOSE_BRACKET : '}' ;
OPEN_BRACE : '[' ;
CLOSE_BRACE : ']'
SEMICOLON : ';' ;
COMMA : ',' ;
EQUAL : '=' ;