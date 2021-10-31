grammar Especificar_Servico;
/* the grammar name and file name must match */


// Start Variable
prog: strat+ EOF ;

strat: cod_unico':' WS titulo':' WS desc_breve':' WS desc_completa':' WS
    ;

cod_unico: DG DG DG DG DG;
titulo: WORD;
desc_breve: WORD;
desc_completa:;
icon : ':' '-'? ')'
     | ':' '-'? '('
     | ';' '-'? 'P'
     ;
keywords:;

fragment DIGIT : [0-9] ;
NUMBER         : DIGIT+ ([.,] DIGIT+)? ;


DG : [0-9];
NUM : [0-9]+;
OP : NUM('.'NUM)+;

WORD :  [A-Za-zúçãéíõáàÚÇÃÉÍÕÁÀ]+;


NUM_NEG_POS : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
COMMENT : '--' ~[\r\n]* -> skip;
WS : [ \t\n]+ -> skip;