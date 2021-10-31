grammar Val_form;
/* the grammar name and file name must match */


// Start Variable
prog: /* vazio */
    | start NEWLINE?
    ;

start: TITULO1
     ;



/* Tokens */
TITULO1 : 'Reportar Erro';

NEWLINE:'\r'? '\n' ; // return newlines to parser (end
