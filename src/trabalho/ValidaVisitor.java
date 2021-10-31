package trabalho;

import trabalho.valida_forms.Valida_formsBaseVisitor;
import trabalho.valida_forms.Valida_formsParser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CancellationException;

public class ValidaVisitor extends Valida_formsBaseVisitor {
    private String t1= "";
    private String t2= "";
    private String t3= "";
    private String t4= "";
    private String st1= "";
    private String st2= "";
    private String st3= "";

    ArrayList<String> tipoAnomalias = new ArrayList<>(Arrays.asList("grave", "muitograve", "media", "leve"));
    ArrayList<String> tipoEquipamentos = new ArrayList<>(Arrays.asList("smartphone","telemovel", "VOIP", "switch", "router"));
    ArrayList<String> anexos = new ArrayList<>(Arrays.asList("","PDF","JPEG","JPG","DOC","DOCX"));
    ArrayList<String> produtos = new ArrayList<>(Arrays.asList("Banana","Leite","Pao","Agua","Cafe"));

    @Override
    public Object visitProg(Valida_formsParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitStart(Valida_formsParser.StartContext ctx) {
        visitChildren(ctx);
        if (this.t1.equals("") ){ }else {
            System.out.println("TITULO1: " + this.t1 );
            setT1("");
        }
        if (this.t2.equals("") ){ }else {
            System.out.println("TITULO2: " + this.t2 );
            setT2("");
        }
        if (this.t3.equals("") ){ }else {
            System.out.println("TITULO3: " + this.t3 );
            setT3("");
        }
        if (this.t4.equals("") ){ }else {
            System.out.println("TITULO4: " + this.t4 );
            setT4("");
        }
        return true;
    }

    @Override
    public Object visitTipo_de_reporte(Valida_formsParser.Tipo_de_reporteContext ctx) {
        visitChildren(ctx);
        if (this.st1.equals("") ){ }else {
            System.out.println("SUB-TITULO1: " + this.st1 );
            setSt1("");
        }
        if (this.st2.equals("") ){ }else {
            System.out.println("SUB-TITULO2: " + this.st2 );
            setSt2("");
        }
        if (this.st3.equals("") ){ }else {
            System.out.println("SUB-TITULO3: " + this.st3 );
            setSt3("");
        }
        return true;
    }

    @Override
    public Object visitValida_Form_Report1(Valida_formsParser.Valida_Form_Report1Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Report2(Valida_formsParser.Valida_Form_Report2Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Report3(Valida_formsParser.Valida_Form_Report3Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Ctdes1(Valida_formsParser.Valida_Form_Ctdes1Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Ctdes2(Valida_formsParser.Valida_Form_Ctdes2Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Altpess1(Valida_formsParser.Valida_Form_Altpess1Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Altpess2(Valida_formsParser.Valida_Form_Altpess2Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Altpess3(Valida_formsParser.Valida_Form_Altpess3Context ctx) {
        visitChildren(ctx);
        String op = ctx.op.getText();
        String input = ctx.var_estado_civil.getText();
        System.out.println("op: " + op + " | input: " + input);
        return true;
    }

    @Override
    public Object visitValida_Form_Altpess4(Valida_formsParser.Valida_Form_Altpess4Context ctx) {
        visitChildren(ctx);
        String op = ctx.op.getText();
        String input = ctx.var_hab_lit.getText();
        System.out.println("op: " + op + " | input: " + input);
        return true;
    }

    @Override
    public Object visitValida_Form_Ferjus1(Valida_formsParser.Valida_Form_Ferjus1Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Ferjus2(Valida_formsParser.Valida_Form_Ferjus2Context ctx) {
        visitChildren(ctx);
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
        return true;
    }

    @Override
    public Object visitValida_Form_Ferjus3(Valida_formsParser.Valida_Form_Ferjus3Context ctx) {
        visitChildren(ctx);
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
        return true;
    }


    @Override
    public Object visitAuto_Report1(Valida_formsParser.Auto_Report1Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: anomalia_comunicacao@isep.ipp.pt \n" +
                "subject: Reportar Anomalia de Comunicação  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_reporte1().getText();
        SendEmail.writeUsingFiles(email,"anomalia_comunicacao");
        return true;
    }

    @Override
    public Object visitAuto_Report2(Valida_formsParser.Auto_Report2Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: anomalia_equipamento@isep.ipp.pt \n" +
                "subject: Reportar Anomalia de equipamento  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_reporte2().getText();
        SendEmail.writeUsingFiles(email, "anomalia_equipamento");
        return true;
    }

    @Override
    public Object visitAuto_Report3(Valida_formsParser.Auto_Report3Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: anomalia_aplicacao@isep.ipp.pt \n" +
                "subject: Reportar Anomalia de aplicacao  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_reporte3().getText();
        SendEmail.writeUsingFiles(email, "anomalia_aplicacao");
        return true;
    }

    @Override
    public Object visitAuto_Cotacoes_Desc1(Valida_formsParser.Auto_Cotacoes_Desc1Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: cotacoes_descontos@isep.ipp.pt \n" +
                "subject: Requerer cotacao para venda por grosso  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_cotdes1().getText();
        SendEmail.writeUsingFiles(email, "cotacoes");
        return true;
    }

    @Override
    public Object visitAuto_Cotacoes_Desc2(Valida_formsParser.Auto_Cotacoes_Desc2Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: cotacoes_descontos@isep.ipp.pt \n" +
                "subject: Solicitar autorizacao para aplicacao de desconto financeiro  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_cotdes2().getText();
        SendEmail.writeUsingFiles(email, "desconto");
        return true;
    }

    @Override
    public Object visitAuto_dados_pessoais1(Valida_formsParser.Auto_dados_pessoais1Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: recursos_humanos@isep.ipp.pt \n" +
                "subject: Alteracao de NIB  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_altpess1().getText();
        SendEmail.writeUsingFiles(email, "NIB");
        return true;
    }

    @Override
    public Object visitAuto_dados_pessoais2(Valida_formsParser.Auto_dados_pessoais2Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: recursos_humanos@isep.ipp.pt \n" +
                "subject: Alteracao de residencia  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_altpess2().getText();
        SendEmail.writeUsingFiles(email, "residencia");
        return true;
    }

    @Override
    public Object visitAuto_dados_pessoais3(Valida_formsParser.Auto_dados_pessoais3Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: recursos_humanos@isep.ipp.pt \n" +
                "subject: Alteracao de estado civil para efeitos de IRS  \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_altpess3().getText();
        SendEmail.writeUsingFiles(email, "estado_civil");
        return true;
    }

    @Override
    public Object visitAuto_dados_pessoais4(Valida_formsParser.Auto_dados_pessoais4Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: recursos_humanos@isep.ipp.pt \n" +
                "subject: Atualizacao de habilitacoes literarias \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_altpess4().getText();
        SendEmail.writeUsingFiles(email, "hab_literarias");
        return true;
    }

    @Override
    public Object visitAuto_ferias_Just1(Valida_formsParser.Auto_ferias_Just1Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: coordenacao@isep.ipp.pt \n" +
                "subject: Marcar ferias \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_ferjus1().getText();
        SendEmail.writeUsingFiles(email, "ferias");
        return true;
    }

    @Override
    public Object visitAuto_ferias_Just2(Valida_formsParser.Auto_ferias_Just2Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: coordenacao@isep.ipp.pt \n" +
                "subject: Justificar falta ja ocorrida \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_ferjus2().getText();
        SendEmail.writeUsingFiles(email, "justificacao");
        return true;
    }

    @Override
    public Object visitAuto_ferias_Just3(Valida_formsParser.Auto_ferias_Just3Context ctx) {
        visitChildren(ctx);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String email =  "from: tarefas_auto@isep.ipp.pt \n" +
                "to: coordenacao@isep.ipp.pt \n" +
                "subject: Informar ausencia futura \n"
                +"Date_Time: " + LocalDateTime.now().format(formatters) + "\n"
                + ctx.form_ferjus3().getText();
        SendEmail.writeUsingFiles(email, "ausencias");
        return true;
    }

    @Override
    public Object visitSetTitulo1(Valida_formsParser.SetTitulo1Context ctx) {
        visitChildren(ctx);
        setT1(ctx.getText());
        return true;
    }

    @Override
    public Object visitSetTitulo2(Valida_formsParser.SetTitulo2Context ctx) {
        visitChildren(ctx);
        setT2(ctx.getText());
        return true;
    }

    @Override
    public Object visitSetTitulo3(Valida_formsParser.SetTitulo3Context ctx) {
        visitChildren(ctx);
        setT3(ctx.getText());
        return true;
    }

    @Override
    public Object visitSetTitulo4(Valida_formsParser.SetTitulo4Context ctx) {
        visitChildren(ctx);
        setT4(ctx.getText());
        return true;
    }

    @Override
    public Object visitSetSub_tipo_servico_op1(Valida_formsParser.SetSub_tipo_servico_op1Context ctx) {
        visitChildren(ctx);
        setSt1(ctx.getText());
        return true;
    }

    @Override
    public Object visitSetSub_tipo_servico_op2(Valida_formsParser.SetSub_tipo_servico_op2Context ctx) {
        visitChildren(ctx);
        setSt2(ctx.getText());
        return true;
    }
    @Override
    public Object visitSetSub_tipo_servico_op3(Valida_formsParser.SetSub_tipo_servico_op3Context ctx) {
        visitChildren(ctx);
        setSt3(ctx.getText());
        return true;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public void setT4(String t4) {
        this.t4 = t4;
    }

    public void setSt1(String st1) {
        this.st1 = st1;
    }

    public void setSt2(String st2) {
        this.st2 = st2;
    }

    public void setSt3(String st3) {
        this.st3 = st3;
    }


}

