grammar Valida_forms;
/* the grammar name and file name must match */
// Start Variable
prog: /* vazio */
    | start prog NEWLINE? EOF
;

start: titulo1=titulo1_var NEWLINE tipo_de_reporte NEWLINE? start?
        | titulo2=titulo2_var NEWLINE cotacoes_descontos NEWLINE? start?
        | titulo3=titulo3_var NEWLINE alteracoes_pessoais NEWLINE? start?
        | titulo4=titulo4_var NEWLINE ferias_just NEWLINE? start?
;
titulo1_var: TITULO1 # SetTitulo1;
titulo2_var: TITULO2 # SetTitulo2;
titulo3_var: TITULO3 # SetTitulo3;
titulo4_var: TITULO4 # SetTitulo4;
TITULO1 : 'Reportar Erro';
TITULO2 : 'Cotacoes e Descontos';
TITULO3 : 'Alteracao Dados Pessoais';
TITULO4 : 'Ferias e Justificacoes';

tipo_de_reporte:  stsop1=stsop1_var NEWLINE fp1=form_reporte1 NEWLINE? tipo_de_reporte? #Auto_Report1
                | stsop2=stsop2_var NEWLINE fp2=form_reporte2 NEWLINE? tipo_de_reporte? #Auto_Report2
                | stsop3=stsop3_var NEWLINE fp3=form_reporte3 NEWLINE? tipo_de_reporte? #Auto_Report3
;
stsop1_var: SUB_TIPO_SERVICO_OP1 # SetSub_tipo_servico_op1;
stsop2_var: SUB_TIPO_SERVICO_OP2 # SetSub_tipo_servico_op2;
stsop3_var: SUB_TIPO_SERVICO_OP3 # SetSub_tipo_servico_op3;
SUB_TIPO_SERVICO_OP1 : '1 Reportar anomalia de comunicacao';
SUB_TIPO_SERVICO_OP2 : '2 Reportar anomalia em equipamento';
SUB_TIPO_SERVICO_OP3 : '3 Reportar anomalia em aplicacao';

cotacoes_descontos:   CT_OP1 NEWLINE form_cotdes1 NEWLINE? cotacoes_descontos? #Auto_Cotacoes_Desc1
                    | CT_OP2 NEWLINE form_cotdes2 NEWLINE? cotacoes_descontos? #Auto_Cotacoes_Desc2
;
CT_OP1 : '1 Requerer cotacao para venda por grosso';
CT_OP2 : '2 Solicitar autorizacao para aplicacao de desconto financeiro';

alteracoes_pessoais:  AP_NIB NEWLINE form_altpess1 NEWLINE? alteracoes_pessoais?            #Auto_dados_pessoais1
                    | AP_RESIDENCIA NEWLINE form_altpess2 NEWLINE? alteracoes_pessoais?     #Auto_dados_pessoais2
                    | AP_ESTADO_CIVIL NEWLINE form_altpess3 NEWLINE? alteracoes_pessoais?   #Auto_dados_pessoais3
                    | AP_HAB_LIT NEWLINE form_altpess4 NEWLINE? alteracoes_pessoais?        #Auto_dados_pessoais4
                    ;
AP_NIB: '1 Alteracao de NIB' ;
AP_RESIDENCIA: '2 Alteracao de residencia' ;
AP_ESTADO_CIVIL: '3 Alteracao de estado civil para efeitos de IRS' ;
AP_HAB_LIT: '4 Atualizacao de habilitacoes literarias' ;

ferias_just:  RH_FERIAS NEWLINE form_ferjus1 NEWLINE? ferias_just?      #Auto_ferias_Just1
            | RH_FALTAS NEWLINE form_ferjus2 NEWLINE? ferias_just?      #Auto_ferias_Just2
            | RH_AUSENCIAS NEWLINE form_ferjus3 NEWLINE? ferias_just?   #Auto_ferias_Just3
            ;
RH_FERIAS: '1 Marcar ferias' ;
RH_FALTAS: '2 Justificar falta ja ocorrida' ;
RH_AUSENCIAS: '3 Informar ausencia futura' ;

form_reporte1: op='1.1' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte1? #Valida_Form_Report1
             | op='1.2' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte1? #Valida_Form_Report1
             | op='1.3' (WS|WORD)* ':' var_imob=IMOB NEWLINE form_reporte1? #Valida_Form_Report1
             | op='1.4' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte1? #Valida_Form_Report1
             | op='1.5' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte1? #Valida_Form_Report1
            ;

form_reporte2: op='2.1' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte2? #Valida_Form_Report2
             | op='2.2' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte2? #Valida_Form_Report2
             | op='2.3' (WS|WORD)* ':' var_imob=IMOB NEWLINE form_reporte2? #Valida_Form_Report2
             | op='2.4' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte2? #Valida_Form_Report2
             | op='2.5' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte2? #Valida_Form_Report2
;

form_reporte3: op='3.1' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte3? #Valida_Form_Report3
             | op='3.2' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte3? #Valida_Form_Report3
             | op='3.3' (WS|WORD)* ':' var_imob=IMOB NEWLINE form_reporte3? #Valida_Form_Report3
             | op='3.4' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte3? #Valida_Form_Report3
             | op='3.5' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_reporte3? #Valida_Form_Report3
;

form_cotdes1: op='1.1' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_cotdes1? #Valida_Form_Ctdes1
            | op='1.2' (WS|WORD)* ':' var_int=INT NEWLINE form_cotdes1? #Valida_Form_Ctdes1
            | op='1.3' (WS|WORD)* ':' var_moeda=MOEDA NEWLINE form_cotdes1? #Valida_Form_Ctdes1
            | op='1.4' (WS|WORD)* ':' var_int=INT NEWLINE form_cotdes1? #Valida_Form_Ctdes1
;

form_cotdes2: op='2.1' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_cotdes2? #Valida_Form_Ctdes2
            | op='2.2' (WS|WORD)* ':' var_int=INT NEWLINE form_cotdes2? #Valida_Form_Ctdes2
            | op='2.3' (WS|WORD)* ':' var_moeda=MOEDA NEWLINE form_cotdes2? #Valida_Form_Ctdes2
            | op='2.4' (WS|WORD)* ':' var_int=INT NEWLINE form_cotdes2? #Valida_Form_Ctdes2
;

form_altpess1: op='1.1' (WS|WORD)* ':' var_iban=IBAN NEWLINE form_altpess1? #Valida_Form_Altpess1
             | op='1.2' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_altpess1? #Valida_Form_Altpess1
;

form_altpess2: op='2.1' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_altpess2? #Valida_Form_Altpess2
             | op='2.2' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_altpess2? #Valida_Form_Altpess2
;

form_altpess3: op='3.1' (WS|WORD)* ':' var_estado_civil=ESTADO_CIVIL NEWLINE form_altpess3? #Valida_Form_Altpess3;

form_altpess4: op='4.1' (WS|WORD)* ':' var_hab_lit=HAB_LITERARIAS NEWLINE form_altpess4? #Valida_Form_Altpess4;

form_ferjus1: op='1.1' (WS|WORD)* ':' var_data=date NEWLINE form_ferjus1? #Valida_Form_Ferjus1
            ;

form_ferjus2: op='2.1' (WS|WORD)* ':' var_data=date NEWLINE form_ferjus2? #Valida_Form_Ferjus2
            | op='2.2' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_ferjus2? #Valida_Form_Ferjus2
;

form_ferjus3: op='3.1' (WS|WORD)* ':' var_data=date NEWLINE form_ferjus3? #Valida_Form_Ferjus3
            | op='3.2' (WS|WORD)* ':' var=val_form_reporte_alfa NEWLINE form_ferjus3? #Valida_Form_Ferjus3
;

/* ANTLR resolves ambiguities in favor of the alternative given first. */

/* Tokens */
fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];



//DATENUM: '0' '1'..'9';
INT: '0'..'9'+;
date: INT '/' INT '/' INT;
// ou
//date: (INT | DATENUM) '/' (INT | DATENUM) ('/' (INT | DATENUM) )? ;
//date: day=INT '/' month=INT ( year='/' INT )? { year==null ? (/* First check /*) : (/* Second check */)};
DG : [0-9];
IBAN: 'PT50' [a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9]DG DG DG DG DG DG DG DG DG DG DG DG DG DG DG DG DG;
//ESTADO_CIVIL: ('Div'|'Cas');
ESTADO_CIVIL: (S O L T E I R O| C A S A D O| V I U V O | S E R A R A D O WS J U D I C I A L M E N T E | D I V O R C I A D O );
HAB_LITERARIAS: (E N S I N O WS S E C U N D  A R I O | B A C H A R E L A T O | L I C E N C I A T U R A | M E S T R A D O | D O U T O R A M E N T O );


//NUM : [0-9]+;
MOEDA: [0-9]+'.'[0-9]+;
//MOEDA: (INT+('.'INT+)?);

IMOB: 'ISEP-'DG DG DG'-' ('PRT'|'LX');

BARRA: '/';

//LETRA: [a-zA-Z];
WORD : [A-Za-z]+;
val_form_reporte_alfa: (WS|WORD|INT)* ;

error : . ;
NEWLINE:'\r'? '\n' ; // return newlines to parser (end
WS : [ \t]+ -> skip ; // toss out whitespace

