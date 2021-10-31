package trabalho;

import trabalho.valida_forms.Valida_formsBaseListener;
import trabalho.valida_forms.Valida_formsParser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CancellationException;

public class ValidaListener extends Valida_formsBaseListener {

    public static String op = "";
    public static String var = "";

    ArrayList<String> tipoAnomalias = new ArrayList<>(Arrays.asList("grave", "muitograve", "media", "leve"));
    ArrayList<String> tipoEquipamentos = new ArrayList<>(Arrays.asList("smartphone","telemovel", "VOIP", "switch", "router"));
    //    ArrayList<String> imobilizado = new ArrayList<>(Arrays.asList("ISEP001PRT", "ISEP001LX"));
    ArrayList<String> anexos = new ArrayList<>(Arrays.asList("","PDF","JPEG","JPG","DOC","DOCX"));
    ArrayList<String> produtos = new ArrayList<>(Arrays.asList("Banana","Leite","Pao","Agua","Cafe"));

    @Override
    public void enterProg(Valida_formsParser.ProgContext ctx) {
        op = "";
        var = "";
    }

    @Override
    public void enterStart(Valida_formsParser.StartContext ctx) {
//        System.out.println("Linha: " + ctx.getText());
    }

    @Override
    public void enterValida_Form_Report1(Valida_formsParser.Valida_Form_Report1Context ctx) {
        super.enterValida_Form_Report1(ctx);
        String op = ctx.op.getText();
        boolean b = false;

        switch (op) {
            case "1.1":
                String input = ctx.var.getText().trim();
                for (String str : tipoAnomalias) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Tipo de anomalia invalida \n");
                }
                break;
            case "1.2":
                input = ctx.var.getText().trim();
                for (String str : tipoEquipamentos) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Tipo de equipamento invalido \n");
                }
                break;
            case "1.3":
                input = ctx.var_imob.getText();
                System.out.println("op: " + op + " | input: " + input);
                break;
            case "1.4":
                input = ctx.var.getText().trim();
                if (255 < input.length()) {
                    throw new CancellationException("Descrição demasiado longa \n");
                }else {
                    System.out.println("op: " + op + " | input: " + input);
                }
                break;
            case "1.5":
                input = ctx.var.getText().trim();
                for (String str : anexos) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Anexo invalido \n");
                }
                break;
            default:
        }
    }

    @Override
    public void enterValida_Form_Report2(Valida_formsParser.Valida_Form_Report2Context ctx) {
        super.enterValida_Form_Report2(ctx);
        String op = ctx.op.getText();
        boolean b = false;

        switch (op) {
            case "2.1":
                String input = ctx.var.getText().trim();
                for (String str : tipoAnomalias) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Tipo de anomalia invalida \n");
                }
                break;
            case "2.2":
                input = ctx.var.getText().trim();
                for (String str : tipoEquipamentos) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Tipo de equipamento invalido \n");
                }
                break;
            case "2.3":
                input = ctx.var_imob.getText();
                System.out.println("op: " + op + " | input: " + input);
                break;
            case "2.4":
                input = ctx.var.getText().trim();

                if (Integer.compare(255, input.length()) < 0 ) {
                    throw new CancellationException("Descrição demasiado longa \n");
                }else {
                    System.out.println("op: " + op + " | input: " + input);
                }
                break;
            case "2.5":
                input = ctx.var.getText().trim();
                for (String str : anexos) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Anexo invalido \n");
                }
                break;
            default:
        }
    }

    @Override
    public void enterValida_Form_Report3(Valida_formsParser.Valida_Form_Report3Context ctx) {
        super.enterValida_Form_Report3(ctx);
        String op = ctx.op.getText();
        boolean b = false;

        switch (op) {
            case "3.1":
                String input = ctx.var.getText().trim();
                for (String str : tipoAnomalias) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Tipo de anomalia invalida \n");
                }
                break;
            case "3.2":
                input = ctx.var.getText().trim();
                for (String str : tipoEquipamentos) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Tipo de equipamento invalido \n");
                }
                break;
            case "3.3":
                input = ctx.var_imob.getText();
                System.out.println("op: " + op + " | input: " + input);
                break;
            case "3.4":
                input = ctx.var.getText();
                System.out.println("op: " + op + " | input: " + input);
                break;
            case "3.5":
                input = ctx.var.getText().trim();
                for (String str : anexos) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Anexo invalido \n");
                }
                break;
            default:
        }
    }

    @Override
    public void enterValida_Form_Ctdes1(Valida_formsParser.Valida_Form_Ctdes1Context ctx) {
        super.enterValida_Form_Ctdes1(ctx);
        String op = ctx.op.getText();
        boolean b = false;
        String input;
        int i;
        float f;

        switch (op) {
            case "1.1":
                input = ctx.var.getText().trim();
                for (String str : produtos) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Tipo de produto invalido \n");
                }
                break;
            case "1.2":
                i = Integer.parseInt(ctx.var_int.getText());
                System.out.println("op: " + op + " | quantidade: " + i);
                break;
            case "1.3":
                f = Float.parseFloat(ctx.var_moeda.getText());
                System.out.println("op: " + op + " | Preco: " + f);
                break;
            case "1.4":
                i = Integer.parseInt(ctx.var_int.getText());
                System.out.println("op: " + op + " | Iva: " + i);
                break;
            default:
        }
    }

    @Override
    public void enterValida_Form_Ctdes2(Valida_formsParser.Valida_Form_Ctdes2Context ctx) {
        super.enterValida_Form_Ctdes2(ctx);
        String op = ctx.op.getText();
        boolean b = false;

        switch (op) {
            case "2.1":
                String input = ctx.var.getText().trim();
                for (String str : produtos) {
                    if (str.equalsIgnoreCase(input)) {
                        b = true;
                        System.out.println("op: " + op + " | input: " + input);
                    }
                }
                if (!b) {
                    throw new CancellationException("Tipo de produto invalido \n");
                }
                break;
            case "2.2":
                int i = Integer.parseInt(ctx.var_int.getText());
                System.out.println("op: " + op + " | quantidade: " + i);
                break;
            case "2.3":
                float f = Float.parseFloat(ctx.var_moeda.getText());
                System.out.println("op: " + op + " | Preco: " + f);
                break;
            case "2.4":
                i = Integer.parseInt(ctx.var_int.getText());
                System.out.println("op: " + op + " | Desconto: " + i);
                break;
            default:
        }
    }

    @Override
    public void enterValida_Form_Altpess1(Valida_formsParser.Valida_Form_Altpess1Context ctx) {
        super.enterValida_Form_Altpess1(ctx);
        String op = ctx.op.getText();

        switch (op) {
            case "1.1":
                String input = ctx.var_iban.getText().trim();
                System.out.println("op: " + op + " | input: " + input);
                break;
            case "1.2":
                input = ctx.var.getText().trim();
                System.out.println("op: " + op + " | input: " + input);
                break;
            default:
        }
    }

    @Override
    public void enterValida_Form_Altpess2(Valida_formsParser.Valida_Form_Altpess2Context ctx) {
        super.enterValida_Form_Altpess2(ctx);
        String op = ctx.op.getText();

        switch (op) {
            case "1.1":
                String input = ctx.var.getText().trim();
                System.out.println("op: " + op + " | input: " + input);
                break;
            case "1.2":
                input = ctx.var.getText().trim();
                System.out.println("op: " + op + " | input: " + input);
                break;
            default:
        }
    }

    @Override
    public void enterValida_Form_Altpess3(Valida_formsParser.Valida_Form_Altpess3Context ctx) {
        super.enterValida_Form_Altpess3(ctx);
        String op = ctx.op.getText();
        String input = ctx.var_estado_civil.getText();
        System.out.println("op: " + op + " | input: " + input);
    }

    @Override
    public void enterValida_Form_Altpess4(Valida_formsParser.Valida_Form_Altpess4Context ctx) {
        super.enterValida_Form_Altpess4(ctx);
        String op = ctx.op.getText();
        String input = ctx.var_hab_lit.getText();
        System.out.println("op: " + op + " | input: " + input);
    }

    @Override
    public void enterValida_Form_Ferjus1(Valida_formsParser.Valida_Form_Ferjus1Context ctx) {
        super.enterValida_Form_Ferjus1(ctx);
        String op = ctx.op.getText();
        String olddate = ctx.var_data.getText();
        String[] s = olddate.split("/");

        if(s[0].length()<3 && s[0].length()>0 ){
//                System.out.println("Dia OK");
            if(s[1].length()<3 && s[1].length()>0 ){
//                    System.out.println("Mês OK");
                if(s[2].length()==4 || s[2].length()==2){
//                        System.out.println("ANO OK");
                    System.out.println("op: " + op + " | input: " + olddate);
                }else {
                    throw new CancellationException("Invalid data format, Erro no Ano \n");
                }
            }else {
                throw new CancellationException("Invalid data format, Erro no Mês \n");
            }
        }else {
            throw new CancellationException("Invalid data format, ERRO no dia \n");
        }
    }

    @Override
    public void enterValida_Form_Ferjus2(Valida_formsParser.Valida_Form_Ferjus2Context ctx) {
        super.enterValida_Form_Ferjus2(ctx);
        String op = ctx.op.getText();

        switch (op) {
            case "2.1":
                String olddate = ctx.var_data.getText();
                String[] s = olddate.split("/");

                if(s[0].length()<3 && s[0].length()>0 ){
                    if(s[1].length()<3 && s[1].length()>0 ){
                        if(s[2].length()==4 || s[2].length()==2){
                            System.out.println("op: " + op + " | input: " + olddate);
                        }else {
                            throw new CancellationException("Invalid data format, Erro no Ano \n");
                        }
                    }else {
                        throw new CancellationException("Invalid data format, Erro no Mês \n");
                    }
                }else {
                    throw new CancellationException("Invalid data format, ERRO no dia \n");
                }
                break;
            case "2.2":
                String input = ctx.var.getText().trim();
                System.out.println("op: " + op + " | input: " + input);
                break;
            default:
        }


    }

    @Override
    public void enterValida_Form_Ferjus3(Valida_formsParser.Valida_Form_Ferjus3Context ctx) {
        super.enterValida_Form_Ferjus3(ctx);
        String op = ctx.op.getText();

        switch (op) {
            case "3.1":
                String olddate = ctx.var_data.getText();
                String[] s = olddate.split("/");

                if(s[0].length()<3 && s[0].length()>0 ){
                    if(s[1].length()<3 && s[1].length()>0 ){
                        if(s[2].length()==4 || s[2].length()==2){
                            System.out.println("op: " + op + " | input: " + olddate);
                        }else {
                            throw new CancellationException("Invalid data format, Erro no Ano \n");
                        }
                    }else {
                        throw new CancellationException("Invalid data format, Erro no Mês \n");
                    }
                }else {
                    throw new CancellationException("Invalid data format, ERRO no dia \n");
                }
                break;
            case "3.2":
                String input = ctx.var.getText().trim();
                System.out.println("op: " + op + " | input: " + input);
                break;
            default:
        }
    }

    @Override
    public void enterError(Valida_formsParser.ErrorContext ctx) {
        super.enterError(ctx);
        System.out.println("Erro: " + ctx.getText());
        throw new CancellationException();
    }

    @Override
    public void enterAuto_Report1(Valida_formsParser.Auto_Report1Context ctx) {
        super.enterAuto_Report1(ctx);
//        System.out.println(ctx.form_reporte1().getText());

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: anomalia_comunicacao@isep.ipp.pt \n" +
                "subject: Reportar Anomalia de Comunicação  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_reporte1().getText();
        SendEmail.writeUsingFiles(email,"anomalia_comunicacao");
    }

    @Override
    public void enterAuto_Report2(Valida_formsParser.Auto_Report2Context ctx) {
        super.enterAuto_Report2(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: anomalia_equipamento@isep.ipp.pt \n" +
                "subject: Reportar Anomalia de equipamento  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_reporte2().getText();
        SendEmail.writeUsingFiles(email, "anomalia_equipamento");
    }

    @Override
    public void enterAuto_Report3(Valida_formsParser.Auto_Report3Context ctx) {
        super.enterAuto_Report3(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: anomalia_aplicacao@isep.ipp.pt \n" +
                "subject: Reportar Anomalia de aplicacao  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_reporte3().getText();
        SendEmail.writeUsingFiles(email, "anomalia_aplicacao");
    }

    @Override
    public void enterAuto_Cotacoes_Desc1(Valida_formsParser.Auto_Cotacoes_Desc1Context ctx) {
        super.enterAuto_Cotacoes_Desc1(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: cotacoes_descontos@isep.ipp.pt \n" +
                "subject: Requerer cotacao para venda por grosso  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_cotdes1().getText();
        SendEmail.writeUsingFiles(email, "cotacoes");
    }

    @Override
    public void enterAuto_Cotacoes_Desc2(Valida_formsParser.Auto_Cotacoes_Desc2Context ctx) {
        super.enterAuto_Cotacoes_Desc2(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: cotacoes_descontos@isep.ipp.pt \n" +
                "subject: Solicitar autorizacao para aplicacao de desconto financeiro  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_cotdes2().getText();
        SendEmail.writeUsingFiles(email, "desconto");
    }

    @Override
    public void enterAuto_dados_pessoais1(Valida_formsParser.Auto_dados_pessoais1Context ctx) {
        super.enterAuto_dados_pessoais1(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: recursos_humanos@isep.ipp.pt \n" +
                "subject: Alteracao de NIB  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_altpess1().getText();
        SendEmail.writeUsingFiles(email, "NIB");
    }

    @Override
    public void enterAuto_dados_pessoais2(Valida_formsParser.Auto_dados_pessoais2Context ctx) {
        super.enterAuto_dados_pessoais2(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: recursos_humanos@isep.ipp.pt \n" +
                "subject: Alteracao de residencia  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_altpess2().getText();
        SendEmail.writeUsingFiles(email, "residencia");
    }

    @Override
    public void enterAuto_dados_pessoais3(Valida_formsParser.Auto_dados_pessoais3Context ctx) {
        super.enterAuto_dados_pessoais3(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: recursos_humanos@isep.ipp.pt \n" +
                "subject: Alteracao de estado civil para efeitos de IRS  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_altpess3().getText();
        SendEmail.writeUsingFiles(email, "estado_civil");
    }

    @Override
    public void enterAuto_dados_pessoais4(Valida_formsParser.Auto_dados_pessoais4Context ctx) {
        super.enterAuto_dados_pessoais4(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: recursos_humanos@isep.ipp.pt \n" +
                "subject: Atualizacao de habilitacoes literarias \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_altpess4().getText();
        SendEmail.writeUsingFiles(email, "hab_literarias");
    }

    @Override
    public void enterAuto_ferias_Just1(Valida_formsParser.Auto_ferias_Just1Context ctx) {
        super.enterAuto_ferias_Just1(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: coordenacao@isep.ipp.pt \n" +
                "subject: Marcar ferias \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_ferjus1().getText();
        SendEmail.writeUsingFiles(email, "ferias");
    }

    @Override
    public void enterAuto_ferias_Just2(Valida_formsParser.Auto_ferias_Just2Context ctx) {
        super.enterAuto_ferias_Just2(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: coordenacao@isep.ipp.pt \n" +
                "subject: Justificar falta ja ocorrida \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_ferjus2().getText();
        SendEmail.writeUsingFiles(email, "justificacao");
    }

    @Override
    public void enterAuto_ferias_Just3(Valida_formsParser.Auto_ferias_Just3Context ctx) {
        super.enterAuto_ferias_Just3(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: coordenacao@isep.ipp.pt \n" +
                "subject: Informar ausencia futura \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_ferjus3().getText();
        SendEmail.writeUsingFiles(email, "ausencias");
    }
}

