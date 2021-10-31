grammar Taref_Auto;
/* the grammar name and file name must match */


// Start Variable
prog: strat+ EOF ;

strat: TITULO1 consulta_obtencao? | TITULO2 calculos_matematicos+ | TITULO3 envio_email+ | TITULO4 integracao?
    ;

consulta_obtencao: CONS_OBT01 (WS)? ':' DG DG DG DG  | CONS_OBT02 (WS)? ':' WORD
    ;

calculos_matematicos: a=INT op=('<'|'<='|'>='|'>'|'<>'|'='|'*'|'/'|'+'|'-'|'%'|'('|')') b=INT  # Compara_Opera
    ;

envio_email: EMAIL WS WORD # Valida_Email
    ;

integracao:
    ;


/* Tokens */
TITULO1 : '1 Consulta/Obtenção';
TITULO2 : '2 Cálculos Matemáticos';
TITULO3 : '3 Envio de emails';
TITULO4 : '4 Integração';

CONS_OBT01 : 'Número de cliente';
CONS_OBT02 : 'identificador do produto';



EMAIL: (WORD|INT|'_'|'-'|'.')+(WORD|INT|'_'|'-')?'@'(WORD|INT|'_'|'-')+('.')(CHAR CHAR|CHAR CHAR CHAR| CHAR CHAR CHAR CHAR);

VALOR_TOTAL: 'Valor Total: {{$vt}}€';

CHAR: [A-Za-z];
WORD: [A-Za-z]+;
WORD1 :  [A-Za-zúçãéíõáàÚÇÃÉÍÕÁÀ]+;


DG : [0-9];
INT:[0-9]+;
ID:[a-z]+;
NUM_NEG_POS : '0' | '-'?[1-9][0-9]*;
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ATR : '=' ;
LPR : '(' ;
RPR : ')' ;
MOD : '%' ;
MenorIgual :   '<=' ; // assigns token name to '<=' used above in grammar
Menor :   '<' ;
MaiorIgual :   '>=' ;
Maior :   '>' ;
Dif :   '<>' ;

NEWLINE : [\r\n]+ ;
COMMENT : '--' ~[\r\n]* -> skip;
WS : [ \t\n]+ -> skip;
