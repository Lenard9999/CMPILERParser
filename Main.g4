grammar Main;		
start: EOF;

import_statement : IMPORT_WORD ;
other_white_space : ((comment)* WHITE_SPACE (comment)*)+ ;
white_space : (comment | MULTILINE_COMMENT | WHITE_SPACE)* ;
comment : (MULTILINE_COMMENT | LINE_COMMENT) ;

LOWERCASE : [a-z] ;
UPPERCASE : [A-z] ;
DIGIT : [0-9] ;
NEWLINE : ('\n' | '\r') ;
CLASS_WORD : 'class' ;
RETURN_WORD : 'return' ;
IMPORT_WORD : 'import' ; 

STRING : '"' (LOWERCASE | UPPERCASE | DIGIT)* '"' ;
NUMBER : '-'?[0-9]*('.'[0-9]+) | '-'?[0-9]+ ;
LABEL : (LOWERCASE | UPPERCASE | '_')+ ;
WHITE_SPACE : (' ' | '\r' | '\t' | '\n') ;

LINE_COMMENT : '//' (. | NEWLINE)*? NEWLINE ;
MULTILINE_COMMENT : '/*' .*? '*/' ;

OPEN_PAREN : '(' ;
CLOSE_PAREN : ')';
OPEN_BRACKET : '{' ;
CLOSE_BRACKET : '}' ;
SEMICOLON : ';' ;
COMMA : ',' ;
EQUAL : '=' ;