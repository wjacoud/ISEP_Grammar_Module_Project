grammar Valida_forms;
/* the grammar name and file name must match */


// Start Variable
prog: /* vazio */
    | start prog NEWLINE?
    ;

start: TITULO1 NEWLINE tipo_de_reporte
    | TITULO2 NEWLINE cotacoes_descontos
    | TITULO3 NEWLINE alteracoes_pessoais
    | TITULO4 NEWLINE ferias_just

    ;




tipo_de_reporte: SUB_TIPO_SERVICO_OP1_1 NEWLINE form_reporte1 #TarefaAutomaticaReporteanomaliaComunicacao
                | SUB_TIPO_SERVICO_OP1_2 NEWLINE form_reporte2 #TarefaAutomaticaReporteanomaliaEquipamento
                | SUB_TIPO_SERVICO_OP1_3 NEWLINE form_reporte3 #TarefaAutomaticaReporteanomaliaAplicacao
                ;
cotacoes_descontos: CT_OP1 NEWLINE form_cotdes1
                    | CT_OP2 NEWLINE form_cotdes2
                    ;
alteracoes_pessoais:  AP_NIB NEWLINE form_altpess1
                    | AP_RESIDENCIA NEWLINE form_altpess2
                    | AP_ESTADO_CIVIL NEWLINE form_altpess3
                    | AP_HAB_LIT NEWLINE form_altpess4
                    ;
ferias_just: RH_FERIAS NEWLINE form_ferjus1
            | RH_FALTAS NEWLINE form_ferjus2
            | RH_AUSENCIAS NEWLINE form_ferjus3
            ;

form_reporte1 : op='1.1' (WS|WORD)* ':' WS? var=val_form_reporte_alfa #Valida_Form_Report1
              | op='1.2' (WS|WORD)* ':' var=val_form_reporte_alfa #Valida_Form_Report1
              | op='1.3' (WS|WORD)* ':' var=val_form_reporte_alfa #Valida_Form_Report1
              | op='1.4' (WS|WORD)* ':' var=val_form_reporte_alfa #Valida_Form_Report1
              | op='1.5' (WS|WORD)* ':' var=val_form_reporte_alfa #Valida_Form_Report1
    ;
form_reporte2: op='2.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report2
             | op='2.2' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report2
             | op='2.3' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report2
             | op='2.4' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report2
             | op='2.5' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report2
    ;
form_reporte3: op='3.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report3
             | op='3.2' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report3
             | op='3.3' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report3
             | op='3.4' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report3
             | op='3.5' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Report3
    ;

form_cotdes1: op='1.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Ctdes1 ;
form_cotdes2: op='2.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Ctdes2 ;

form_altpess1: op='1.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Altpess1
             | op='1.2' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Altpess1
    ;
form_altpess2: op='2.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Altpess2 ;
form_altpess3: op='3.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Altpess3 ;
form_altpess4: op='4.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Altpess4 ;

form_ferjus1: op='1.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Ferjus1 ;
form_ferjus2: op='2.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Ferjus2 ;
form_ferjus3: op='3.1' (WS|WORD)* ':' var=val_form_reporte_alfa # Valida_Form_Ferjus3 ;


val_form_reporte_alfa: (WS|WORD)* ;
val_form_reporte_int: (NUM)* ;

val_form_reporte_alfa_num: WS* (WS|NUM|WORD)* WS*;

error : .;




/* ANTLR resolves ambiguities in favor of the alternative given first. */

/* Tokens */
TITULO1 : 'Reportar Erro';
TITULO2 : 'Cotacoes e Descontos';
TITULO3 : 'Alteracao Dados Pessoais';
TITULO4 : 'Ferias e Justificacoes';

SUB_TIPO_SERVICO_OP1_1 : '1 Reportar anomalia de comunicacao';
SUB_TIPO_SERVICO_OP1_2 : '2 Reportar anomalia em equipamento';
SUB_TIPO_SERVICO_OP1_3 : '3 Reportar anomalia em aplicacao';

CT_OP1 : '1 Requerer cotacao para venda por grosso';
CT_OP2 : '2 Solicitar autorizacao para aplicacao de desconto financeiro';

AP_NIB: '1 Alteração de NIB' ;
AP_RESIDENCIA: '2 Alteracao de residencia' ;
AP_ESTADO_CIVIL: '3 Alteracao de estado civil para efeitos de IRS' ;
AP_HAB_LIT: '4 Atualizacao de habilitacoes literarias' ;

RH_FERIAS: '1 Marcar ferias' ;
RH_FALTAS: '2 Justificar falta ja ocorrida' ;
RH_AUSENCIAS: '3 Informar ausencia futura' ;



ERRO1    : 'comunicacao' ;
ERRO2    : 'equipamento' ;
ERRO3    : 'aplicacao' ;


DG : [0-9];
NUM : [0-9]+;
OP : NUM('.'NUM)+;

WORD :  [A-Za-z]+;


NUM_NEG_POS : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';


NEWLINE:'\r'? '\n' ; // return newlines to parser (end


WS : [ \t\n]+ -> skip;