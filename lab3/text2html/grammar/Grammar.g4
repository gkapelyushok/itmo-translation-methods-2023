grammar Grammar ;
start : line+  ;

line : eq1 | eq2 | text+ | text_command ;
eq1 : DOLLAR math_command+ DOLLAR ;
eq2 : DOUBLE_DOLLAR math_command+ DOUBLE_DOLLAR ;
math_command : DIGIT+ | CHARACTER+ | PUNCTUATION+ | UNDERSCORE expr | CARET expr ;

expr : CHARACTER | DIGIT | LEFT_CURL math_command+ RIGHT_CURL ;

text_command : SLASH (ITALICS | BOLD | MONOSPACE) LEFT_CURL text* RIGHT_CURL ;
text : CHARACTER+ | DIGIT+ | PUNCTUATION+ ;

CARET       : '^' ;
UNDERSCORE  : '_' ;
LEFT_CURL   : '{' ;
RIGHT_CURL  : '}' ;
SLASH       : '\\' ;
DOLLAR      : '$' ;
DOUBLE_DOLLAR : '$$' ;
NEW_LINE    : [\r\n]+ -> skip ;
SPACE       : [ ]+ -> skip ;
DIGIT       : ('0' .. '9') ;
CHARACTER   : ('a'..'z'|'A'..'Z') ;
PUNCTUATION : [!"#'()*+,./:;<=>?@`|-];
ITALICS     : 'textit' ;
BOLD        : 'textbf' ;
MONOSPACE   : 'texttt' ;