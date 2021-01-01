grammar Main;	
// Starting Node	
start: function_declaration* main_function EOF;
// start: loop_statement EOF;

variable_type: (INT_DEC | BOOLEAN_DEC | FLOAT_DEC | STRING_DEC) ;
string : '"' (DIGIT | lexer_predefined_words | label | WHITE_SPACE)+ '"' ;
number : '-'?DIGIT*('.'DIGIT+)'f'? | '-'?DIGIT+ ;
label : label_words* (LOWERCASE | UNDERSCORE | UPPERCASE | 'f')+ label_words* label*;
label_words : (constant_words | conditional_words | loop_words | variable_type | DIGIT) ;

// Operators
first_operators : (MULTI | DIV | MOD) ;
second_operators : (PLUS | MINUS) ;
operators : (first_operators | second_operators) ;
logical_operators: (ANDAND | OROR) ;
relational_operators: (LESS | LESSQEUAL | GREATER | GREATEREQUAL) ;
other_operators : (logical_operators | relational_operators) ;

// need for masama yun mga lexer predefined words
lexer_predefined_words : (constant_words | conditional_words | loop_words | simple_punctuations | symbol_words | other_operators | operators | variable_type) ;
constant_words : (CREATE | CONSTANT | RETURN | PRINT | SCAN | VOID| FUNC | MAIN) ;
conditional_words : (IF | ELSE | ELSE_IF | THEN) ;
loop_words : (FOR | UP_TO | DOWN_TO | TO | WHILE) ;
simple_punctuations : (ASSIGN | EQUAL | SEMICOLON | DOT | COMMA | NOT | QUESTION | COLON | UNDERSCORE | SINGLE_QUOTE) ;
symbol_words : (OPEN_PAREN | CLOSE_PAREN | OPEN_BRACKET | CLOSE_BRACKET | OPEN_BRACE | CLOSE_BRACE) ;

// Parsers
statements
    : print_statement LINECOMMENT? NEWLINE*
    | scan_statement LINECOMMENT? NEWLINE*
    | conditional_statement LINECOMMENT? NEWLINE*
    | any_declaration LINECOMMENT? NEWLINE*
    | return_statement LINECOMMENT? NEWLINE*
    | loop_statement LINECOMMENT? NEWLINE*
    | scoping_statement LINECOMMENT? NEWLINE*
    | function_calling LINECOMMENT? NEWLINE*
    ;

// Declarations Ex. int x = 0; int x; int[] x = create int[arr + 1]; newArr[arr_size + 1] = x; newArr[arr_size + 1] = arr[i];
any_declaration 
    : variable_declaration_vartype
    | variable_declaration_no_vartype
    | array_declaration_vartype
    | array_declaration_no_vartype
    ; 

assigned_expression
    : (string | number | label | expression | comparison_statement | function_calling_without_semicolon) 
    ;

variable_declaration_vartype
    : variable_type WHITE_SPACE? label (WHITE_SPACE? ASSIGN WHITE_SPACE? assigned_expression)? SEMICOLON 
    ;

variable_declaration_no_vartype
    : label WHITE_SPACE? ASSIGN WHITE_SPACE? assigned_expression SEMICOLON 
    ;

array_size 
    : expression
    ;

array_variable 
    : label OPEN_BRACE array_size CLOSE_BRACE
    ;

array_assign
    : WHITE_SPACE? ASSIGN WHITE_SPACE? CREATE WHITE_SPACE? variable_type OPEN_BRACE array_size CLOSE_BRACE
    | WHITE_SPACE? EQUAL WHITE_SPACE? CREATE WHITE_SPACE? variable_type OPEN_BRACE array_size CLOSE_BRACE {notifyErrorListeners("Invalid symbol '==' for declaration");}
    | WHITE_SPACE? ASSIGN WHITE_SPACE? CREATE WHITE_SPACE? variable_type OPEN_BRACE? array_size CLOSE_BRACE? {notifyErrorListeners("Missing brace for array declaration");}
    | WHITE_SPACE? ASSIGN WHITE_SPACE? (array_variable | assigned_expression)
    | WHITE_SPACE? EQUAL WHITE_SPACE? (array_variable | assigned_expression) {notifyErrorListeners("Invalid symbol '==' for declaration");}
    ;

array_declaration_vartype
    : variable_type OPEN_BRACE CLOSE_BRACE WHITE_SPACE? label array_assign? SEMICOLON
    ;

array_declaration_no_vartype
    : array_variable array_assign SEMICOLON
    ;
 
// print statement
/*
Ex. 
print("Your number is: " +i);
print("X is " +x+ " while Y is " +y);
print("Let's add them! Result is: " +(x + y));
print("Let's do something complicated! " +((x + y + z) * (x*y)/fX));
print("Thank you very much!");
*/
print_statement
    : PRINT OPEN_PAREN value_print CLOSE_PAREN SEMICOLON
    ;

value_print
    : extended_value_print (WHITE_SPACE? PLUS WHITE_SPACE? extended_value_print WHITE_SPACE?)*
    | extended_value_print (WHITE_SPACE? PLUS WHITE_SPACE? extended_value_print WHITE_SPACE?)* PLUS+ {notifyErrorListeners("additional ‘+’ sign at end of print");}
    ;

extended_value_print
    : string
    | label
    | expression
    | function_calling_without_semicolon
    ;

// scan statement Ex. scan("Give me a random number: ", i+1); 
scan_statement
    : SCAN OPEN_PAREN display_message_parameter WHITE_SPACE? COMMA WHITE_SPACE? value_parameter CLOSE_PAREN SEMICOLON
    ;

display_message_parameter 
    : string
    ;

value_parameter
    : expression
    ;

// constant declaration Ex. constant int MY_CONSTANT = 500;
constant_declaration 
    : CONSTANT WHITE_SPACE? any_declaration
    ;

// return statement Ex. return n * factorial(n - 1); return 1; return arr_type;
return_statement
    : RETURN WHITE_SPACE? return_value SEMICOLON
    | RETURN WHITE_SPACE? variable_type SEMICOLON  {notifyErrorListeners("Invalid return value");}
    ;

return_value
    : (string | number | label | expression | function_calling_without_semicolon)
    ;

// arithmetic statement Ex. 100*100+100+num, 100+(100*100), (100+100)*100, (x * 50) * (x * 15)
expression
    : value_expression
    | expression WHITE_SPACE? (operators) WHITE_SPACE? expression
    | expression WHITE_SPACE? (operators operators+) WHITE_SPACE? expression {notifyErrorListeners("Multiple operators");}
    | OPEN_PAREN WHITE_SPACE? expression WHITE_SPACE? CLOSE_PAREN
    ;

value_expression
    : number
    | label
    | function_calling_without_semicolon
    ;

// comparison statement Ex. i == 0, (5 + 4 > 4 && T) || (F && !(x==0))
comparison_statement
    : value_comparison
    | assignment_statement
    | comparison_statement WHITE_SPACE? (other_operators) WHITE_SPACE? comparison_statement
    | comparison_statement WHITE_SPACE? (other_operators other_operators+) WHITE_SPACE? comparison_statement {notifyErrorListeners("Multiple operators");}
    | NOT? OPEN_PAREN WHITE_SPACE? comparison_statement WHITE_SPACE? CLOSE_PAREN
    ;

assignment_statement
    : label WHITE_SPACE? EQUAL WHITE_SPACE? (value_comparison | string)
    | label WHITE_SPACE? ASSIGN WHITE_SPACE? (value_comparison | string) {notifyErrorListeners("Invalid comparison symbol '=', should be '=='");}
    ;

// add function calling Ex. factorial(n - 1)
value_comparison
    : label
    | number
    | expression
    ;

// conditional statement (if else-if else)
/* Ex.
    if(x == 0) then {
        print("Hello");
    } else if(x > 0) then {
        print("Hello2");
        
        if(y + z > ((x*y)/fX)) then {
            print("Yey!");
        } else then {
            print("Nay!");
            return n+1;
        }
    }
    else then {
        print("Hello3");
    }
*/
conditional_statement
    : if_statement (WHITE_SPACE | NEWLINE)? (else_if_statement (WHITE_SPACE | NEWLINE)?)* (else_statement NEWLINE*)? 
    ;

conditional_comparison_structure
    : OPEN_PAREN comparison_statement CLOSE_PAREN WHITE_SPACE? THEN WHITE_SPACE? OPEN_BRACKET NEWLINE? statements+ CLOSE_BRACKET
    ;

if_statement
    : IF conditional_comparison_structure
    ;

else_if_statement
    : ELSE_IF conditional_comparison_structure
    ;

else_statement
    : ELSE WHITE_SPACE? THEN WHITE_SPACE? OPEN_BRACKET NEWLINE? statements+ CLOSE_BRACKET
    ;

// loop statement = (for | while)
/* Ex.
    while i up to n - 1 {
        print("Yesh!");
    }

    while i down to n - 1 {
        print("Yesh!");
    }

    for int x = 1000 up to n {
        print("Hello!");
    }

    for int x = 1000 down to n {
        print("Hello!");
    }

    for i up to n {
        print("Hello!");
    }
*/
loop_statement
    : while_statement
    | for_statement
    ;

loop_structure
    : (UP_TO | DOWN_TO | TO) WHITE_SPACE? expression WHITE_SPACE? OPEN_BRACKET NEWLINE? statements+ CLOSE_BRACKET
    ;

loop_variable_declaration
    : (variable_type WHITE_SPACE)? label WHITE_SPACE? ASSIGN WHITE_SPACE? loop_expression 
    | variable_type WHITE_SPACE label {notifyErrorListeners("Missing assignment operator");}
    | expression
    ;

loop_expression
    : (number | label | expression)
    ;

while_statement
    : WHILE WHITE_SPACE? expression WHITE_SPACE? loop_structure
    ;

for_statement
    : FOR WHITE_SPACE? loop_variable_declaration WHITE_SPACE? loop_structure
    ;

// function calling = (void | non void)
// Ex. testOne(testOne(),x+1,"strfe",3,testOne(x+1));
function_calling
    : label OPEN_PAREN function_parameters? CLOSE_PAREN SEMICOLON
    ;

function_calling_without_semicolon
    : label OPEN_PAREN function_parameters? CLOSE_PAREN
    ;

function_parameters
    : function_paremeters_value (WHITE_SPACE? COMMA WHITE_SPACE? function_paremeters_value)*
    ;

function_paremeters_value
    : (function_calling_without_semicolon | label | expression | string | number)
    ;

// function declaration = (void | non void)
/* Ex.
    func int factorial(int n) {
        if(n == 1) then {
            return 1;
        }
        else then {
            return n * factorial(n - 1);
        }
    }
    func void callPrinter(String message) {
        print(message);
    }

    func int[] append(int[] arr, int arr_size, int x) {
        int[] newArr = create int[arr_size + 1];
        
        for i = 1 up to arr_size {
            newArr[i] = arr[i];
        }
        
        newArr[arr_size + 1] = x;
        return newArr;
    }
*/
function_declaration
    : void_function
    | non_void_function
    ;

function_structure
    : label OPEN_PAREN function_declaration_parameters? CLOSE_PAREN WHITE_SPACE? OPEN_BRACKET NEWLINE? statements+ CLOSE_BRACKET NEWLINE*
    ;

function_declaration_parameters
    : variable_type (OPEN_BRACE CLOSE_BRACE)? label (COMMA WHITE_SPACE? function_declaration_parameters)*
    ;

void_function
    : FUNC WHITE_SPACE? VOID function_structure
    ;

non_void_function
    : FUNC WHITE_SPACE? variable_type (OPEN_BRACE CLOSE_BRACE)? function_structure
    ;

// proper scoping
/* Ex.
	{
		print(a); //a can be accessed
		{
			int b = 0;
			print(b);
			
			{
				int c = 0;
				print(b + c); //c and b can be accessed.
				print(a + c); //even a can be accessed
			}
			
			print("Cannot access c here!");
		}
		
		print("Cannot access b here!");
		print("Cannot access c here!");
	}
*/
scoping_statement
    : OPEN_BRACKET NEWLINE? statements+ NEWLINE? CLOSE_BRACKET
    ;

// main function 
main_function
    : MAIN OPEN_PAREN CLOSE_PAREN WHITE_SPACE? OPEN_BRACKET statements+ CLOSE_BRACKET NEWLINE*
    ;

// Lexers
CREATE : 'create' ;
CONSTANT : 'constant' ;
RETURN : 'return' ;
PRINT : 'print' ;
SCAN : 'scan' ;
VOID : 'void' ;
FUNC : 'func' ;
MAIN : 'main' ;

IF : 'if' ;
ELSE : 'else' ;
ELSE_IF : 'else if' ;
THEN : 'then' ;

FOR : 'for' ;
UP_TO : 'up to' ;
DOWN_TO : 'down to' ;
TO : 'to' ;
WHILE : 'while' ;

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
SINGLE_QUOTE : '\'' ;
    
LOWERCASE
    : [a-z]
    ;

UPPERCASE
    : [A-Z]
    ;

DIGIT
    : [0-9]
    ;

NEWLINE
    : [\r\n]
    ;

LINECOMMENT
    : '//' ~[\r\n]* NEWLINE?
    ;

WHITE_SPACE 
    : [ \t\r\n]+
        -> skip
    ;