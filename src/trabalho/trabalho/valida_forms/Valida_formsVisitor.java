// Generated from C:/Users/Hélder Azevedo/IdeaProjects/repository/src/trabalho/valida_forms\Valida_forms.g4 by ANTLR 4.9.1
package trabalho.valida_forms;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Valida_formsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Valida_formsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Valida_formsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Valida_formsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Valida_formsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Valida_formsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetTitulo1}
	 * labeled alternative in {@link Valida_formsParser#titulo1_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTitulo1(Valida_formsParser.SetTitulo1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SetTitulo2}
	 * labeled alternative in {@link Valida_formsParser#titulo2_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTitulo2(Valida_formsParser.SetTitulo2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SetTitulo3}
	 * labeled alternative in {@link Valida_formsParser#titulo3_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTitulo3(Valida_formsParser.SetTitulo3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SetTitulo4}
	 * labeled alternative in {@link Valida_formsParser#titulo4_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTitulo4(Valida_formsParser.SetTitulo4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_Report1}
	 * labeled alternative in {@link Valida_formsParser#tipo_de_reporte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_Report1(Valida_formsParser.Auto_Report1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_Report2}
	 * labeled alternative in {@link Valida_formsParser#tipo_de_reporte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_Report2(Valida_formsParser.Auto_Report2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_Report3}
	 * labeled alternative in {@link Valida_formsParser#tipo_de_reporte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_Report3(Valida_formsParser.Auto_Report3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SetSub_tipo_servico_op1}
	 * labeled alternative in {@link Valida_formsParser#stsop1_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSub_tipo_servico_op1(Valida_formsParser.SetSub_tipo_servico_op1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SetSub_tipo_servico_op2}
	 * labeled alternative in {@link Valida_formsParser#stsop2_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSub_tipo_servico_op2(Valida_formsParser.SetSub_tipo_servico_op2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SetSub_tipo_servico_op3}
	 * labeled alternative in {@link Valida_formsParser#stsop3_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSub_tipo_servico_op3(Valida_formsParser.SetSub_tipo_servico_op3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_Cotacoes_Desc1}
	 * labeled alternative in {@link Valida_formsParser#cotacoes_descontos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_Cotacoes_Desc1(Valida_formsParser.Auto_Cotacoes_Desc1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_Cotacoes_Desc2}
	 * labeled alternative in {@link Valida_formsParser#cotacoes_descontos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_Cotacoes_Desc2(Valida_formsParser.Auto_Cotacoes_Desc2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_dados_pessoais1}
	 * labeled alternative in {@link Valida_formsParser#alteracoes_pessoais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_dados_pessoais1(Valida_formsParser.Auto_dados_pessoais1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_dados_pessoais2}
	 * labeled alternative in {@link Valida_formsParser#alteracoes_pessoais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_dados_pessoais2(Valida_formsParser.Auto_dados_pessoais2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_dados_pessoais3}
	 * labeled alternative in {@link Valida_formsParser#alteracoes_pessoais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_dados_pessoais3(Valida_formsParser.Auto_dados_pessoais3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_dados_pessoais4}
	 * labeled alternative in {@link Valida_formsParser#alteracoes_pessoais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_dados_pessoais4(Valida_formsParser.Auto_dados_pessoais4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_ferias_Just1}
	 * labeled alternative in {@link Valida_formsParser#ferias_just}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_ferias_Just1(Valida_formsParser.Auto_ferias_Just1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_ferias_Just2}
	 * labeled alternative in {@link Valida_formsParser#ferias_just}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_ferias_Just2(Valida_formsParser.Auto_ferias_Just2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_ferias_Just3}
	 * labeled alternative in {@link Valida_formsParser#ferias_just}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_ferias_Just3(Valida_formsParser.Auto_ferias_Just3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Report1}
	 * labeled alternative in {@link Valida_formsParser#form_reporte1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Report1(Valida_formsParser.Valida_Form_Report1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Report2}
	 * labeled alternative in {@link Valida_formsParser#form_reporte2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Report2(Valida_formsParser.Valida_Form_Report2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Report3}
	 * labeled alternative in {@link Valida_formsParser#form_reporte3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Report3(Valida_formsParser.Valida_Form_Report3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Ctdes1}
	 * labeled alternative in {@link Valida_formsParser#form_cotdes1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Ctdes1(Valida_formsParser.Valida_Form_Ctdes1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Ctdes2}
	 * labeled alternative in {@link Valida_formsParser#form_cotdes2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Ctdes2(Valida_formsParser.Valida_Form_Ctdes2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Altpess1}
	 * labeled alternative in {@link Valida_formsParser#form_altpess1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Altpess1(Valida_formsParser.Valida_Form_Altpess1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Altpess2}
	 * labeled alternative in {@link Valida_formsParser#form_altpess2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Altpess2(Valida_formsParser.Valida_Form_Altpess2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Altpess3}
	 * labeled alternative in {@link Valida_formsParser#form_altpess3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Altpess3(Valida_formsParser.Valida_Form_Altpess3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Altpess4}
	 * labeled alternative in {@link Valida_formsParser#form_altpess4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Altpess4(Valida_formsParser.Valida_Form_Altpess4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Ferjus1}
	 * labeled alternative in {@link Valida_formsParser#form_ferjus1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Ferjus1(Valida_formsParser.Valida_Form_Ferjus1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Ferjus2}
	 * labeled alternative in {@link Valida_formsParser#form_ferjus2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Ferjus2(Valida_formsParser.Valida_Form_Ferjus2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Valida_Form_Ferjus3}
	 * labeled alternative in {@link Valida_formsParser#form_ferjus3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValida_Form_Ferjus3(Valida_formsParser.Valida_Form_Ferjus3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Valida_formsParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(Valida_formsParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Valida_formsParser#val_form_reporte_alfa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal_form_reporte_alfa(Valida_formsParser.Val_form_reporte_alfaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Valida_formsParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(Valida_formsParser.ErrorContext ctx);
}