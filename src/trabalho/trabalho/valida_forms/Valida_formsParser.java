// Generated from C:/Users/Hélder Azevedo/IdeaProjects/repository/src/trabalho/valida_forms\Valida_forms.g4 by ANTLR 4.9.1
package trabalho.valida_forms;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Valida_formsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		TITULO1=18, TITULO2=19, TITULO3=20, TITULO4=21, SUB_TIPO_SERVICO_OP1=22, 
		SUB_TIPO_SERVICO_OP2=23, SUB_TIPO_SERVICO_OP3=24, CT_OP1=25, CT_OP2=26, 
		AP_NIB=27, AP_RESIDENCIA=28, AP_ESTADO_CIVIL=29, AP_HAB_LIT=30, RH_FERIAS=31, 
		RH_FALTAS=32, RH_AUSENCIAS=33, INT=34, DG=35, IBAN=36, ESTADO_CIVIL=37, 
		HAB_LITERARIAS=38, MOEDA=39, IMOB=40, BARRA=41, WORD=42, NEWLINE=43, WS=44;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_titulo1_var = 2, RULE_titulo2_var = 3, 
		RULE_titulo3_var = 4, RULE_titulo4_var = 5, RULE_tipo_de_reporte = 6, 
		RULE_stsop1_var = 7, RULE_stsop2_var = 8, RULE_stsop3_var = 9, RULE_cotacoes_descontos = 10, 
		RULE_alteracoes_pessoais = 11, RULE_ferias_just = 12, RULE_form_reporte1 = 13, 
		RULE_form_reporte2 = 14, RULE_form_reporte3 = 15, RULE_form_cotdes1 = 16, 
		RULE_form_cotdes2 = 17, RULE_form_altpess1 = 18, RULE_form_altpess2 = 19, 
		RULE_form_altpess3 = 20, RULE_form_altpess4 = 21, RULE_form_ferjus1 = 22, 
		RULE_form_ferjus2 = 23, RULE_form_ferjus3 = 24, RULE_date = 25, RULE_val_form_reporte_alfa = 26, 
		RULE_error = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "start", "titulo1_var", "titulo2_var", "titulo3_var", "titulo4_var", 
			"tipo_de_reporte", "stsop1_var", "stsop2_var", "stsop3_var", "cotacoes_descontos", 
			"alteracoes_pessoais", "ferias_just", "form_reporte1", "form_reporte2", 
			"form_reporte3", "form_cotdes1", "form_cotdes2", "form_altpess1", "form_altpess2", 
			"form_altpess3", "form_altpess4", "form_ferjus1", "form_ferjus2", "form_ferjus3", 
			"date", "val_form_reporte_alfa", "error"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'1.1'", "':'", "'1.2'", "'1.3'", "'1.4'", "'1.5'", "'2.1'", "'2.2'", 
			"'2.3'", "'2.4'", "'2.5'", "'3.1'", "'3.2'", "'3.3'", "'3.4'", "'3.5'", 
			"'4.1'", "'Reportar Erro'", "'Cotacoes e Descontos'", "'Alteracao Dados Pessoais'", 
			"'Ferias e Justificacoes'", "'1 Reportar anomalia de comunicacao'", "'2 Reportar anomalia em equipamento'", 
			"'3 Reportar anomalia em aplicacao'", "'1 Requerer cotacao para venda por grosso'", 
			"'2 Solicitar autorizacao para aplicacao de desconto financeiro'", "'1 Alteracao de NIB'", 
			"'2 Alteracao de residencia'", "'3 Alteracao de estado civil para efeitos de IRS'", 
			"'4 Atualizacao de habilitacoes literarias'", "'1 Marcar ferias'", "'2 Justificar falta ja ocorrida'", 
			"'3 Informar ausencia futura'", null, null, null, null, null, null, null, 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TITULO1", "TITULO2", "TITULO3", 
			"TITULO4", "SUB_TIPO_SERVICO_OP1", "SUB_TIPO_SERVICO_OP2", "SUB_TIPO_SERVICO_OP3", 
			"CT_OP1", "CT_OP2", "AP_NIB", "AP_RESIDENCIA", "AP_ESTADO_CIVIL", "AP_HAB_LIT", 
			"RH_FERIAS", "RH_FALTAS", "RH_AUSENCIAS", "INT", "DG", "IBAN", "ESTADO_CIVIL", 
			"HAB_LITERARIAS", "MOEDA", "IMOB", "BARRA", "WORD", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Valida_forms.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Valida_formsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Valida_formsParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TITULO1:
			case TITULO2:
			case TITULO3:
			case TITULO4:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				start();
				setState(58);
				prog();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(59);
					match(NEWLINE);
					}
				}

				setState(62);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public Titulo1_varContext titulo1;
		public Titulo2_varContext titulo2;
		public Titulo3_varContext titulo3;
		public Titulo4_varContext titulo4;
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Tipo_de_reporteContext tipo_de_reporte() {
			return getRuleContext(Tipo_de_reporteContext.class,0);
		}
		public Titulo1_varContext titulo1_var() {
			return getRuleContext(Titulo1_varContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Cotacoes_descontosContext cotacoes_descontos() {
			return getRuleContext(Cotacoes_descontosContext.class,0);
		}
		public Titulo2_varContext titulo2_var() {
			return getRuleContext(Titulo2_varContext.class,0);
		}
		public Alteracoes_pessoaisContext alteracoes_pessoais() {
			return getRuleContext(Alteracoes_pessoaisContext.class,0);
		}
		public Titulo3_varContext titulo3_var() {
			return getRuleContext(Titulo3_varContext.class,0);
		}
		public Ferias_justContext ferias_just() {
			return getRuleContext(Ferias_justContext.class,0);
		}
		public Titulo4_varContext titulo4_var() {
			return getRuleContext(Titulo4_varContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITULO1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				((StartContext)_localctx).titulo1 = titulo1_var();
				setState(67);
				match(NEWLINE);
				setState(68);
				tipo_de_reporte();
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(69);
					match(NEWLINE);
					}
					break;
				}
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(72);
					start();
					}
					break;
				}
				}
				break;
			case TITULO2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((StartContext)_localctx).titulo2 = titulo2_var();
				setState(76);
				match(NEWLINE);
				setState(77);
				cotacoes_descontos();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(78);
					match(NEWLINE);
					}
					break;
				}
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(81);
					start();
					}
					break;
				}
				}
				break;
			case TITULO3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				((StartContext)_localctx).titulo3 = titulo3_var();
				setState(85);
				match(NEWLINE);
				setState(86);
				alteracoes_pessoais();
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(87);
					match(NEWLINE);
					}
					break;
				}
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(90);
					start();
					}
					break;
				}
				}
				break;
			case TITULO4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				((StartContext)_localctx).titulo4 = titulo4_var();
				setState(94);
				match(NEWLINE);
				setState(95);
				ferias_just();
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(96);
					match(NEWLINE);
					}
					break;
				}
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(99);
					start();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Titulo1_varContext extends ParserRuleContext {
		public Titulo1_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo1_var; }
	 
		public Titulo1_varContext() { }
		public void copyFrom(Titulo1_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetTitulo1Context extends Titulo1_varContext {
		public TerminalNode TITULO1() { return getToken(Valida_formsParser.TITULO1, 0); }
		public SetTitulo1Context(Titulo1_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterSetTitulo1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitSetTitulo1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitSetTitulo1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Titulo1_varContext titulo1_var() throws RecognitionException {
		Titulo1_varContext _localctx = new Titulo1_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_titulo1_var);
		try {
			_localctx = new SetTitulo1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(TITULO1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Titulo2_varContext extends ParserRuleContext {
		public Titulo2_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo2_var; }
	 
		public Titulo2_varContext() { }
		public void copyFrom(Titulo2_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetTitulo2Context extends Titulo2_varContext {
		public TerminalNode TITULO2() { return getToken(Valida_formsParser.TITULO2, 0); }
		public SetTitulo2Context(Titulo2_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterSetTitulo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitSetTitulo2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitSetTitulo2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Titulo2_varContext titulo2_var() throws RecognitionException {
		Titulo2_varContext _localctx = new Titulo2_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_titulo2_var);
		try {
			_localctx = new SetTitulo2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(TITULO2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Titulo3_varContext extends ParserRuleContext {
		public Titulo3_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo3_var; }
	 
		public Titulo3_varContext() { }
		public void copyFrom(Titulo3_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetTitulo3Context extends Titulo3_varContext {
		public TerminalNode TITULO3() { return getToken(Valida_formsParser.TITULO3, 0); }
		public SetTitulo3Context(Titulo3_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterSetTitulo3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitSetTitulo3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitSetTitulo3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Titulo3_varContext titulo3_var() throws RecognitionException {
		Titulo3_varContext _localctx = new Titulo3_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_titulo3_var);
		try {
			_localctx = new SetTitulo3Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(TITULO3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Titulo4_varContext extends ParserRuleContext {
		public Titulo4_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo4_var; }
	 
		public Titulo4_varContext() { }
		public void copyFrom(Titulo4_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetTitulo4Context extends Titulo4_varContext {
		public TerminalNode TITULO4() { return getToken(Valida_formsParser.TITULO4, 0); }
		public SetTitulo4Context(Titulo4_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterSetTitulo4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitSetTitulo4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitSetTitulo4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Titulo4_varContext titulo4_var() throws RecognitionException {
		Titulo4_varContext _localctx = new Titulo4_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_titulo4_var);
		try {
			_localctx = new SetTitulo4Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(TITULO4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_de_reporteContext extends ParserRuleContext {
		public Tipo_de_reporteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_reporte; }
	 
		public Tipo_de_reporteContext() { }
		public void copyFrom(Tipo_de_reporteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Auto_Report2Context extends Tipo_de_reporteContext {
		public Stsop2_varContext stsop2;
		public Form_reporte2Context fp2;
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Stsop2_varContext stsop2_var() {
			return getRuleContext(Stsop2_varContext.class,0);
		}
		public Form_reporte2Context form_reporte2() {
			return getRuleContext(Form_reporte2Context.class,0);
		}
		public Tipo_de_reporteContext tipo_de_reporte() {
			return getRuleContext(Tipo_de_reporteContext.class,0);
		}
		public Auto_Report2Context(Tipo_de_reporteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_Report2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_Report2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_Report2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Auto_Report3Context extends Tipo_de_reporteContext {
		public Stsop3_varContext stsop3;
		public Form_reporte3Context fp3;
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Stsop3_varContext stsop3_var() {
			return getRuleContext(Stsop3_varContext.class,0);
		}
		public Form_reporte3Context form_reporte3() {
			return getRuleContext(Form_reporte3Context.class,0);
		}
		public Tipo_de_reporteContext tipo_de_reporte() {
			return getRuleContext(Tipo_de_reporteContext.class,0);
		}
		public Auto_Report3Context(Tipo_de_reporteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_Report3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_Report3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_Report3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Auto_Report1Context extends Tipo_de_reporteContext {
		public Stsop1_varContext stsop1;
		public Form_reporte1Context fp1;
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Stsop1_varContext stsop1_var() {
			return getRuleContext(Stsop1_varContext.class,0);
		}
		public Form_reporte1Context form_reporte1() {
			return getRuleContext(Form_reporte1Context.class,0);
		}
		public Tipo_de_reporteContext tipo_de_reporte() {
			return getRuleContext(Tipo_de_reporteContext.class,0);
		}
		public Auto_Report1Context(Tipo_de_reporteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_Report1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_Report1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_Report1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_de_reporteContext tipo_de_reporte() throws RecognitionException {
		Tipo_de_reporteContext _localctx = new Tipo_de_reporteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_de_reporte);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB_TIPO_SERVICO_OP1:
				_localctx = new Auto_Report1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((Auto_Report1Context)_localctx).stsop1 = stsop1_var();
				setState(113);
				match(NEWLINE);
				setState(114);
				((Auto_Report1Context)_localctx).fp1 = form_reporte1();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(115);
					match(NEWLINE);
					}
					break;
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB_TIPO_SERVICO_OP1) | (1L << SUB_TIPO_SERVICO_OP2) | (1L << SUB_TIPO_SERVICO_OP3))) != 0)) {
					{
					setState(118);
					tipo_de_reporte();
					}
				}

				}
				break;
			case SUB_TIPO_SERVICO_OP2:
				_localctx = new Auto_Report2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((Auto_Report2Context)_localctx).stsop2 = stsop2_var();
				setState(122);
				match(NEWLINE);
				setState(123);
				((Auto_Report2Context)_localctx).fp2 = form_reporte2();
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(124);
					match(NEWLINE);
					}
					break;
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB_TIPO_SERVICO_OP1) | (1L << SUB_TIPO_SERVICO_OP2) | (1L << SUB_TIPO_SERVICO_OP3))) != 0)) {
					{
					setState(127);
					tipo_de_reporte();
					}
				}

				}
				break;
			case SUB_TIPO_SERVICO_OP3:
				_localctx = new Auto_Report3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				((Auto_Report3Context)_localctx).stsop3 = stsop3_var();
				setState(131);
				match(NEWLINE);
				setState(132);
				((Auto_Report3Context)_localctx).fp3 = form_reporte3();
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(133);
					match(NEWLINE);
					}
					break;
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB_TIPO_SERVICO_OP1) | (1L << SUB_TIPO_SERVICO_OP2) | (1L << SUB_TIPO_SERVICO_OP3))) != 0)) {
					{
					setState(136);
					tipo_de_reporte();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stsop1_varContext extends ParserRuleContext {
		public Stsop1_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stsop1_var; }
	 
		public Stsop1_varContext() { }
		public void copyFrom(Stsop1_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetSub_tipo_servico_op1Context extends Stsop1_varContext {
		public TerminalNode SUB_TIPO_SERVICO_OP1() { return getToken(Valida_formsParser.SUB_TIPO_SERVICO_OP1, 0); }
		public SetSub_tipo_servico_op1Context(Stsop1_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterSetSub_tipo_servico_op1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitSetSub_tipo_servico_op1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitSetSub_tipo_servico_op1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stsop1_varContext stsop1_var() throws RecognitionException {
		Stsop1_varContext _localctx = new Stsop1_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stsop1_var);
		try {
			_localctx = new SetSub_tipo_servico_op1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(SUB_TIPO_SERVICO_OP1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stsop2_varContext extends ParserRuleContext {
		public Stsop2_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stsop2_var; }
	 
		public Stsop2_varContext() { }
		public void copyFrom(Stsop2_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetSub_tipo_servico_op2Context extends Stsop2_varContext {
		public TerminalNode SUB_TIPO_SERVICO_OP2() { return getToken(Valida_formsParser.SUB_TIPO_SERVICO_OP2, 0); }
		public SetSub_tipo_servico_op2Context(Stsop2_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterSetSub_tipo_servico_op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitSetSub_tipo_servico_op2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitSetSub_tipo_servico_op2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stsop2_varContext stsop2_var() throws RecognitionException {
		Stsop2_varContext _localctx = new Stsop2_varContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stsop2_var);
		try {
			_localctx = new SetSub_tipo_servico_op2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(SUB_TIPO_SERVICO_OP2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stsop3_varContext extends ParserRuleContext {
		public Stsop3_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stsop3_var; }
	 
		public Stsop3_varContext() { }
		public void copyFrom(Stsop3_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetSub_tipo_servico_op3Context extends Stsop3_varContext {
		public TerminalNode SUB_TIPO_SERVICO_OP3() { return getToken(Valida_formsParser.SUB_TIPO_SERVICO_OP3, 0); }
		public SetSub_tipo_servico_op3Context(Stsop3_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterSetSub_tipo_servico_op3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitSetSub_tipo_servico_op3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitSetSub_tipo_servico_op3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stsop3_varContext stsop3_var() throws RecognitionException {
		Stsop3_varContext _localctx = new Stsop3_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stsop3_var);
		try {
			_localctx = new SetSub_tipo_servico_op3Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(SUB_TIPO_SERVICO_OP3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cotacoes_descontosContext extends ParserRuleContext {
		public Cotacoes_descontosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cotacoes_descontos; }
	 
		public Cotacoes_descontosContext() { }
		public void copyFrom(Cotacoes_descontosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Auto_Cotacoes_Desc1Context extends Cotacoes_descontosContext {
		public TerminalNode CT_OP1() { return getToken(Valida_formsParser.CT_OP1, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_cotdes1Context form_cotdes1() {
			return getRuleContext(Form_cotdes1Context.class,0);
		}
		public Cotacoes_descontosContext cotacoes_descontos() {
			return getRuleContext(Cotacoes_descontosContext.class,0);
		}
		public Auto_Cotacoes_Desc1Context(Cotacoes_descontosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_Cotacoes_Desc1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_Cotacoes_Desc1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_Cotacoes_Desc1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Auto_Cotacoes_Desc2Context extends Cotacoes_descontosContext {
		public TerminalNode CT_OP2() { return getToken(Valida_formsParser.CT_OP2, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_cotdes2Context form_cotdes2() {
			return getRuleContext(Form_cotdes2Context.class,0);
		}
		public Cotacoes_descontosContext cotacoes_descontos() {
			return getRuleContext(Cotacoes_descontosContext.class,0);
		}
		public Auto_Cotacoes_Desc2Context(Cotacoes_descontosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_Cotacoes_Desc2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_Cotacoes_Desc2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_Cotacoes_Desc2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cotacoes_descontosContext cotacoes_descontos() throws RecognitionException {
		Cotacoes_descontosContext _localctx = new Cotacoes_descontosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cotacoes_descontos);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CT_OP1:
				_localctx = new Auto_Cotacoes_Desc1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(CT_OP1);
				setState(148);
				match(NEWLINE);
				setState(149);
				form_cotdes1();
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(150);
					match(NEWLINE);
					}
					break;
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CT_OP1 || _la==CT_OP2) {
					{
					setState(153);
					cotacoes_descontos();
					}
				}

				}
				break;
			case CT_OP2:
				_localctx = new Auto_Cotacoes_Desc2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(CT_OP2);
				setState(157);
				match(NEWLINE);
				setState(158);
				form_cotdes2();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(159);
					match(NEWLINE);
					}
					break;
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CT_OP1 || _la==CT_OP2) {
					{
					setState(162);
					cotacoes_descontos();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alteracoes_pessoaisContext extends ParserRuleContext {
		public Alteracoes_pessoaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alteracoes_pessoais; }
	 
		public Alteracoes_pessoaisContext() { }
		public void copyFrom(Alteracoes_pessoaisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Auto_dados_pessoais2Context extends Alteracoes_pessoaisContext {
		public TerminalNode AP_RESIDENCIA() { return getToken(Valida_formsParser.AP_RESIDENCIA, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_altpess2Context form_altpess2() {
			return getRuleContext(Form_altpess2Context.class,0);
		}
		public Alteracoes_pessoaisContext alteracoes_pessoais() {
			return getRuleContext(Alteracoes_pessoaisContext.class,0);
		}
		public Auto_dados_pessoais2Context(Alteracoes_pessoaisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_dados_pessoais2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_dados_pessoais2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_dados_pessoais2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Auto_dados_pessoais1Context extends Alteracoes_pessoaisContext {
		public TerminalNode AP_NIB() { return getToken(Valida_formsParser.AP_NIB, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_altpess1Context form_altpess1() {
			return getRuleContext(Form_altpess1Context.class,0);
		}
		public Alteracoes_pessoaisContext alteracoes_pessoais() {
			return getRuleContext(Alteracoes_pessoaisContext.class,0);
		}
		public Auto_dados_pessoais1Context(Alteracoes_pessoaisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_dados_pessoais1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_dados_pessoais1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_dados_pessoais1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Auto_dados_pessoais4Context extends Alteracoes_pessoaisContext {
		public TerminalNode AP_HAB_LIT() { return getToken(Valida_formsParser.AP_HAB_LIT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_altpess4Context form_altpess4() {
			return getRuleContext(Form_altpess4Context.class,0);
		}
		public Alteracoes_pessoaisContext alteracoes_pessoais() {
			return getRuleContext(Alteracoes_pessoaisContext.class,0);
		}
		public Auto_dados_pessoais4Context(Alteracoes_pessoaisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_dados_pessoais4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_dados_pessoais4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_dados_pessoais4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Auto_dados_pessoais3Context extends Alteracoes_pessoaisContext {
		public TerminalNode AP_ESTADO_CIVIL() { return getToken(Valida_formsParser.AP_ESTADO_CIVIL, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_altpess3Context form_altpess3() {
			return getRuleContext(Form_altpess3Context.class,0);
		}
		public Alteracoes_pessoaisContext alteracoes_pessoais() {
			return getRuleContext(Alteracoes_pessoaisContext.class,0);
		}
		public Auto_dados_pessoais3Context(Alteracoes_pessoaisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_dados_pessoais3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_dados_pessoais3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_dados_pessoais3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alteracoes_pessoaisContext alteracoes_pessoais() throws RecognitionException {
		Alteracoes_pessoaisContext _localctx = new Alteracoes_pessoaisContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alteracoes_pessoais);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP_NIB:
				_localctx = new Auto_dados_pessoais1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(AP_NIB);
				setState(168);
				match(NEWLINE);
				setState(169);
				form_altpess1();
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(170);
					match(NEWLINE);
					}
					break;
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AP_NIB) | (1L << AP_RESIDENCIA) | (1L << AP_ESTADO_CIVIL) | (1L << AP_HAB_LIT))) != 0)) {
					{
					setState(173);
					alteracoes_pessoais();
					}
				}

				}
				break;
			case AP_RESIDENCIA:
				_localctx = new Auto_dados_pessoais2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(AP_RESIDENCIA);
				setState(177);
				match(NEWLINE);
				setState(178);
				form_altpess2();
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(179);
					match(NEWLINE);
					}
					break;
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AP_NIB) | (1L << AP_RESIDENCIA) | (1L << AP_ESTADO_CIVIL) | (1L << AP_HAB_LIT))) != 0)) {
					{
					setState(182);
					alteracoes_pessoais();
					}
				}

				}
				break;
			case AP_ESTADO_CIVIL:
				_localctx = new Auto_dados_pessoais3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(AP_ESTADO_CIVIL);
				setState(186);
				match(NEWLINE);
				setState(187);
				form_altpess3();
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(188);
					match(NEWLINE);
					}
					break;
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AP_NIB) | (1L << AP_RESIDENCIA) | (1L << AP_ESTADO_CIVIL) | (1L << AP_HAB_LIT))) != 0)) {
					{
					setState(191);
					alteracoes_pessoais();
					}
				}

				}
				break;
			case AP_HAB_LIT:
				_localctx = new Auto_dados_pessoais4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(AP_HAB_LIT);
				setState(195);
				match(NEWLINE);
				setState(196);
				form_altpess4();
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(197);
					match(NEWLINE);
					}
					break;
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AP_NIB) | (1L << AP_RESIDENCIA) | (1L << AP_ESTADO_CIVIL) | (1L << AP_HAB_LIT))) != 0)) {
					{
					setState(200);
					alteracoes_pessoais();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ferias_justContext extends ParserRuleContext {
		public Ferias_justContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ferias_just; }
	 
		public Ferias_justContext() { }
		public void copyFrom(Ferias_justContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Auto_ferias_Just1Context extends Ferias_justContext {
		public TerminalNode RH_FERIAS() { return getToken(Valida_formsParser.RH_FERIAS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_ferjus1Context form_ferjus1() {
			return getRuleContext(Form_ferjus1Context.class,0);
		}
		public Ferias_justContext ferias_just() {
			return getRuleContext(Ferias_justContext.class,0);
		}
		public Auto_ferias_Just1Context(Ferias_justContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_ferias_Just1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_ferias_Just1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_ferias_Just1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Auto_ferias_Just2Context extends Ferias_justContext {
		public TerminalNode RH_FALTAS() { return getToken(Valida_formsParser.RH_FALTAS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_ferjus2Context form_ferjus2() {
			return getRuleContext(Form_ferjus2Context.class,0);
		}
		public Ferias_justContext ferias_just() {
			return getRuleContext(Ferias_justContext.class,0);
		}
		public Auto_ferias_Just2Context(Ferias_justContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_ferias_Just2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_ferias_Just2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_ferias_Just2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Auto_ferias_Just3Context extends Ferias_justContext {
		public TerminalNode RH_AUSENCIAS() { return getToken(Valida_formsParser.RH_AUSENCIAS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Valida_formsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Valida_formsParser.NEWLINE, i);
		}
		public Form_ferjus3Context form_ferjus3() {
			return getRuleContext(Form_ferjus3Context.class,0);
		}
		public Ferias_justContext ferias_just() {
			return getRuleContext(Ferias_justContext.class,0);
		}
		public Auto_ferias_Just3Context(Ferias_justContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterAuto_ferias_Just3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitAuto_ferias_Just3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitAuto_ferias_Just3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ferias_justContext ferias_just() throws RecognitionException {
		Ferias_justContext _localctx = new Ferias_justContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ferias_just);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RH_FERIAS:
				_localctx = new Auto_ferias_Just1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(RH_FERIAS);
				setState(206);
				match(NEWLINE);
				setState(207);
				form_ferjus1();
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(208);
					match(NEWLINE);
					}
					break;
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RH_FERIAS) | (1L << RH_FALTAS) | (1L << RH_AUSENCIAS))) != 0)) {
					{
					setState(211);
					ferias_just();
					}
				}

				}
				break;
			case RH_FALTAS:
				_localctx = new Auto_ferias_Just2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(RH_FALTAS);
				setState(215);
				match(NEWLINE);
				setState(216);
				form_ferjus2();
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(217);
					match(NEWLINE);
					}
					break;
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RH_FERIAS) | (1L << RH_FALTAS) | (1L << RH_AUSENCIAS))) != 0)) {
					{
					setState(220);
					ferias_just();
					}
				}

				}
				break;
			case RH_AUSENCIAS:
				_localctx = new Auto_ferias_Just3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(RH_AUSENCIAS);
				setState(224);
				match(NEWLINE);
				setState(225);
				form_ferjus3();
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(226);
					match(NEWLINE);
					}
					break;
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RH_FERIAS) | (1L << RH_FALTAS) | (1L << RH_AUSENCIAS))) != 0)) {
					{
					setState(229);
					ferias_just();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_reporte1Context extends ParserRuleContext {
		public Form_reporte1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_reporte1; }
	 
		public Form_reporte1Context() { }
		public void copyFrom(Form_reporte1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Report1Context extends Form_reporte1Context {
		public Token op;
		public Val_form_reporte_alfaContext var;
		public Form_reporte1Context form;
		public Token var_imob;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public Form_reporte1Context form_reporte1() {
			return getRuleContext(Form_reporte1Context.class,0);
		}
		public TerminalNode IMOB() { return getToken(Valida_formsParser.IMOB, 0); }
		public Valida_Form_Report1Context(Form_reporte1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Report1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Report1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Report1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_reporte1Context form_reporte1() throws RecognitionException {
		Form_reporte1Context _localctx = new Form_reporte1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_form_reporte1);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new Valida_Form_Report1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((Valida_Form_Report1Context)_localctx).op = match(T__0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(235);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__1);
				setState(242);
				((Valida_Form_Report1Context)_localctx).var = val_form_reporte_alfa();
				setState(243);
				match(NEWLINE);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(244);
					((Valida_Form_Report1Context)_localctx).form = form_reporte1();
					}
				}

				}
				break;
			case T__2:
				_localctx = new Valida_Form_Report1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				((Valida_Form_Report1Context)_localctx).op = match(T__2);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(248);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(T__1);
				setState(255);
				((Valida_Form_Report1Context)_localctx).var = val_form_reporte_alfa();
				setState(256);
				match(NEWLINE);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(257);
					form_reporte1();
					}
				}

				}
				break;
			case T__3:
				_localctx = new Valida_Form_Report1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				((Valida_Form_Report1Context)_localctx).op = match(T__3);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(261);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				match(T__1);
				setState(268);
				((Valida_Form_Report1Context)_localctx).var_imob = match(IMOB);
				setState(269);
				match(NEWLINE);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(270);
					form_reporte1();
					}
				}

				}
				break;
			case T__4:
				_localctx = new Valida_Form_Report1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				((Valida_Form_Report1Context)_localctx).op = match(T__4);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(274);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(T__1);
				setState(281);
				((Valida_Form_Report1Context)_localctx).var = val_form_reporte_alfa();
				setState(282);
				match(NEWLINE);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(283);
					form_reporte1();
					}
				}

				}
				break;
			case T__5:
				_localctx = new Valida_Form_Report1Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				((Valida_Form_Report1Context)_localctx).op = match(T__5);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(287);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(T__1);
				setState(294);
				((Valida_Form_Report1Context)_localctx).var = val_form_reporte_alfa();
				setState(295);
				match(NEWLINE);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
					{
					setState(296);
					form_reporte1();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_reporte2Context extends ParserRuleContext {
		public Form_reporte2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_reporte2; }
	 
		public Form_reporte2Context() { }
		public void copyFrom(Form_reporte2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Report2Context extends Form_reporte2Context {
		public Token op;
		public Val_form_reporte_alfaContext var;
		public Token var_imob;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public Form_reporte2Context form_reporte2() {
			return getRuleContext(Form_reporte2Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public TerminalNode IMOB() { return getToken(Valida_formsParser.IMOB, 0); }
		public Valida_Form_Report2Context(Form_reporte2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Report2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Report2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Report2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_reporte2Context form_reporte2() throws RecognitionException {
		Form_reporte2Context _localctx = new Form_reporte2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_form_reporte2);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new Valida_Form_Report2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				((Valida_Form_Report2Context)_localctx).op = match(T__6);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(302);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(308);
				match(T__1);
				setState(309);
				((Valida_Form_Report2Context)_localctx).var = val_form_reporte_alfa();
				setState(310);
				match(NEWLINE);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(311);
					form_reporte2();
					}
				}

				}
				break;
			case T__7:
				_localctx = new Valida_Form_Report2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				((Valida_Form_Report2Context)_localctx).op = match(T__7);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(315);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(T__1);
				setState(322);
				((Valida_Form_Report2Context)_localctx).var = val_form_reporte_alfa();
				setState(323);
				match(NEWLINE);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(324);
					form_reporte2();
					}
				}

				}
				break;
			case T__8:
				_localctx = new Valida_Form_Report2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				((Valida_Form_Report2Context)_localctx).op = match(T__8);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(328);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(T__1);
				setState(335);
				((Valida_Form_Report2Context)_localctx).var_imob = match(IMOB);
				setState(336);
				match(NEWLINE);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(337);
					form_reporte2();
					}
				}

				}
				break;
			case T__9:
				_localctx = new Valida_Form_Report2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				((Valida_Form_Report2Context)_localctx).op = match(T__9);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(341);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
				match(T__1);
				setState(348);
				((Valida_Form_Report2Context)_localctx).var = val_form_reporte_alfa();
				setState(349);
				match(NEWLINE);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(350);
					form_reporte2();
					}
				}

				}
				break;
			case T__10:
				_localctx = new Valida_Form_Report2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				((Valida_Form_Report2Context)_localctx).op = match(T__10);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(354);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				match(T__1);
				setState(361);
				((Valida_Form_Report2Context)_localctx).var = val_form_reporte_alfa();
				setState(362);
				match(NEWLINE);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(363);
					form_reporte2();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_reporte3Context extends ParserRuleContext {
		public Form_reporte3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_reporte3; }
	 
		public Form_reporte3Context() { }
		public void copyFrom(Form_reporte3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Report3Context extends Form_reporte3Context {
		public Token op;
		public Val_form_reporte_alfaContext var;
		public Token var_imob;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public Form_reporte3Context form_reporte3() {
			return getRuleContext(Form_reporte3Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public TerminalNode IMOB() { return getToken(Valida_formsParser.IMOB, 0); }
		public Valida_Form_Report3Context(Form_reporte3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Report3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Report3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Report3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_reporte3Context form_reporte3() throws RecognitionException {
		Form_reporte3Context _localctx = new Form_reporte3Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_form_reporte3);
		int _la;
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new Valida_Form_Report3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				((Valida_Form_Report3Context)_localctx).op = match(T__11);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(369);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375);
				match(T__1);
				setState(376);
				((Valida_Form_Report3Context)_localctx).var = val_form_reporte_alfa();
				setState(377);
				match(NEWLINE);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
					{
					setState(378);
					form_reporte3();
					}
				}

				}
				break;
			case T__12:
				_localctx = new Valida_Form_Report3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				((Valida_Form_Report3Context)_localctx).op = match(T__12);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(382);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				match(T__1);
				setState(389);
				((Valida_Form_Report3Context)_localctx).var = val_form_reporte_alfa();
				setState(390);
				match(NEWLINE);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
					{
					setState(391);
					form_reporte3();
					}
				}

				}
				break;
			case T__13:
				_localctx = new Valida_Form_Report3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				((Valida_Form_Report3Context)_localctx).op = match(T__13);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(395);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
				match(T__1);
				setState(402);
				((Valida_Form_Report3Context)_localctx).var_imob = match(IMOB);
				setState(403);
				match(NEWLINE);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
					{
					setState(404);
					form_reporte3();
					}
				}

				}
				break;
			case T__14:
				_localctx = new Valida_Form_Report3Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				((Valida_Form_Report3Context)_localctx).op = match(T__14);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(408);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
				match(T__1);
				setState(415);
				((Valida_Form_Report3Context)_localctx).var = val_form_reporte_alfa();
				setState(416);
				match(NEWLINE);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
					{
					setState(417);
					form_reporte3();
					}
				}

				}
				break;
			case T__15:
				_localctx = new Valida_Form_Report3Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				((Valida_Form_Report3Context)_localctx).op = match(T__15);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(421);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				match(T__1);
				setState(428);
				((Valida_Form_Report3Context)_localctx).var = val_form_reporte_alfa();
				setState(429);
				match(NEWLINE);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
					{
					setState(430);
					form_reporte3();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_cotdes1Context extends ParserRuleContext {
		public Form_cotdes1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_cotdes1; }
	 
		public Form_cotdes1Context() { }
		public void copyFrom(Form_cotdes1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Ctdes1Context extends Form_cotdes1Context {
		public Token op;
		public Val_form_reporte_alfaContext var;
		public Token var_int;
		public Token var_moeda;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public Form_cotdes1Context form_cotdes1() {
			return getRuleContext(Form_cotdes1Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public TerminalNode INT() { return getToken(Valida_formsParser.INT, 0); }
		public TerminalNode MOEDA() { return getToken(Valida_formsParser.MOEDA, 0); }
		public Valida_Form_Ctdes1Context(Form_cotdes1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Ctdes1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Ctdes1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Ctdes1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_cotdes1Context form_cotdes1() throws RecognitionException {
		Form_cotdes1Context _localctx = new Form_cotdes1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_form_cotdes1);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new Valida_Form_Ctdes1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				((Valida_Form_Ctdes1Context)_localctx).op = match(T__0);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(436);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				match(T__1);
				setState(443);
				((Valida_Form_Ctdes1Context)_localctx).var = val_form_reporte_alfa();
				setState(444);
				match(NEWLINE);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
					{
					setState(445);
					form_cotdes1();
					}
				}

				}
				break;
			case T__2:
				_localctx = new Valida_Form_Ctdes1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				((Valida_Form_Ctdes1Context)_localctx).op = match(T__2);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(449);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(455);
				match(T__1);
				setState(456);
				((Valida_Form_Ctdes1Context)_localctx).var_int = match(INT);
				setState(457);
				match(NEWLINE);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
					{
					setState(458);
					form_cotdes1();
					}
				}

				}
				break;
			case T__3:
				_localctx = new Valida_Form_Ctdes1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				((Valida_Form_Ctdes1Context)_localctx).op = match(T__3);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(462);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(468);
				match(T__1);
				setState(469);
				((Valida_Form_Ctdes1Context)_localctx).var_moeda = match(MOEDA);
				setState(470);
				match(NEWLINE);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
					{
					setState(471);
					form_cotdes1();
					}
				}

				}
				break;
			case T__4:
				_localctx = new Valida_Form_Ctdes1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				((Valida_Form_Ctdes1Context)_localctx).op = match(T__4);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(475);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				match(T__1);
				setState(482);
				((Valida_Form_Ctdes1Context)_localctx).var_int = match(INT);
				setState(483);
				match(NEWLINE);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
					{
					setState(484);
					form_cotdes1();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_cotdes2Context extends ParserRuleContext {
		public Form_cotdes2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_cotdes2; }
	 
		public Form_cotdes2Context() { }
		public void copyFrom(Form_cotdes2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Ctdes2Context extends Form_cotdes2Context {
		public Token op;
		public Val_form_reporte_alfaContext var;
		public Token var_int;
		public Token var_moeda;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public Form_cotdes2Context form_cotdes2() {
			return getRuleContext(Form_cotdes2Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public TerminalNode INT() { return getToken(Valida_formsParser.INT, 0); }
		public TerminalNode MOEDA() { return getToken(Valida_formsParser.MOEDA, 0); }
		public Valida_Form_Ctdes2Context(Form_cotdes2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Ctdes2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Ctdes2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Ctdes2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_cotdes2Context form_cotdes2() throws RecognitionException {
		Form_cotdes2Context _localctx = new Form_cotdes2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_form_cotdes2);
		int _la;
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new Valida_Form_Ctdes2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				((Valida_Form_Ctdes2Context)_localctx).op = match(T__6);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(490);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				match(T__1);
				setState(497);
				((Valida_Form_Ctdes2Context)_localctx).var = val_form_reporte_alfa();
				setState(498);
				match(NEWLINE);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(499);
					form_cotdes2();
					}
				}

				}
				break;
			case T__7:
				_localctx = new Valida_Form_Ctdes2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				((Valida_Form_Ctdes2Context)_localctx).op = match(T__7);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(503);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(509);
				match(T__1);
				setState(510);
				((Valida_Form_Ctdes2Context)_localctx).var_int = match(INT);
				setState(511);
				match(NEWLINE);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(512);
					form_cotdes2();
					}
				}

				}
				break;
			case T__8:
				_localctx = new Valida_Form_Ctdes2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				((Valida_Form_Ctdes2Context)_localctx).op = match(T__8);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(516);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				match(T__1);
				setState(523);
				((Valida_Form_Ctdes2Context)_localctx).var_moeda = match(MOEDA);
				setState(524);
				match(NEWLINE);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(525);
					form_cotdes2();
					}
				}

				}
				break;
			case T__9:
				_localctx = new Valida_Form_Ctdes2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				((Valida_Form_Ctdes2Context)_localctx).op = match(T__9);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(529);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(535);
				match(T__1);
				setState(536);
				((Valida_Form_Ctdes2Context)_localctx).var_int = match(INT);
				setState(537);
				match(NEWLINE);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(538);
					form_cotdes2();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_altpess1Context extends ParserRuleContext {
		public Form_altpess1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_altpess1; }
	 
		public Form_altpess1Context() { }
		public void copyFrom(Form_altpess1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Altpess1Context extends Form_altpess1Context {
		public Token op;
		public Token var_iban;
		public Val_form_reporte_alfaContext var;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public TerminalNode IBAN() { return getToken(Valida_formsParser.IBAN, 0); }
		public Form_altpess1Context form_altpess1() {
			return getRuleContext(Form_altpess1Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public Valida_Form_Altpess1Context(Form_altpess1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Altpess1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Altpess1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Altpess1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_altpess1Context form_altpess1() throws RecognitionException {
		Form_altpess1Context _localctx = new Form_altpess1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_form_altpess1);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new Valida_Form_Altpess1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				((Valida_Form_Altpess1Context)_localctx).op = match(T__0);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(544);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				match(T__1);
				setState(551);
				((Valida_Form_Altpess1Context)_localctx).var_iban = match(IBAN);
				setState(552);
				match(NEWLINE);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__2) {
					{
					setState(553);
					form_altpess1();
					}
				}

				}
				break;
			case T__2:
				_localctx = new Valida_Form_Altpess1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				((Valida_Form_Altpess1Context)_localctx).op = match(T__2);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(557);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
				match(T__1);
				setState(564);
				((Valida_Form_Altpess1Context)_localctx).var = val_form_reporte_alfa();
				setState(565);
				match(NEWLINE);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__2) {
					{
					setState(566);
					form_altpess1();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_altpess2Context extends ParserRuleContext {
		public Form_altpess2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_altpess2; }
	 
		public Form_altpess2Context() { }
		public void copyFrom(Form_altpess2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Altpess2Context extends Form_altpess2Context {
		public Token op;
		public Val_form_reporte_alfaContext var;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public Form_altpess2Context form_altpess2() {
			return getRuleContext(Form_altpess2Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public Valida_Form_Altpess2Context(Form_altpess2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Altpess2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Altpess2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Altpess2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_altpess2Context form_altpess2() throws RecognitionException {
		Form_altpess2Context _localctx = new Form_altpess2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_form_altpess2);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new Valida_Form_Altpess2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				((Valida_Form_Altpess2Context)_localctx).op = match(T__6);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(572);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(578);
				match(T__1);
				setState(579);
				((Valida_Form_Altpess2Context)_localctx).var = val_form_reporte_alfa();
				setState(580);
				match(NEWLINE);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__7) {
					{
					setState(581);
					form_altpess2();
					}
				}

				}
				break;
			case T__7:
				_localctx = new Valida_Form_Altpess2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				((Valida_Form_Altpess2Context)_localctx).op = match(T__7);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(585);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				match(T__1);
				setState(592);
				((Valida_Form_Altpess2Context)_localctx).var = val_form_reporte_alfa();
				setState(593);
				match(NEWLINE);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__7) {
					{
					setState(594);
					form_altpess2();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_altpess3Context extends ParserRuleContext {
		public Form_altpess3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_altpess3; }
	 
		public Form_altpess3Context() { }
		public void copyFrom(Form_altpess3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Altpess3Context extends Form_altpess3Context {
		public Token op;
		public Token var_estado_civil;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public TerminalNode ESTADO_CIVIL() { return getToken(Valida_formsParser.ESTADO_CIVIL, 0); }
		public Form_altpess3Context form_altpess3() {
			return getRuleContext(Form_altpess3Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public Valida_Form_Altpess3Context(Form_altpess3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Altpess3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Altpess3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Altpess3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_altpess3Context form_altpess3() throws RecognitionException {
		Form_altpess3Context _localctx = new Form_altpess3Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_form_altpess3);
		int _la;
		try {
			_localctx = new Valida_Form_Altpess3Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			((Valida_Form_Altpess3Context)_localctx).op = match(T__11);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD || _la==WS) {
				{
				{
				setState(600);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			match(T__1);
			setState(607);
			((Valida_Form_Altpess3Context)_localctx).var_estado_civil = match(ESTADO_CIVIL);
			setState(608);
			match(NEWLINE);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(609);
				form_altpess3();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_altpess4Context extends ParserRuleContext {
		public Form_altpess4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_altpess4; }
	 
		public Form_altpess4Context() { }
		public void copyFrom(Form_altpess4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Altpess4Context extends Form_altpess4Context {
		public Token op;
		public Token var_hab_lit;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public TerminalNode HAB_LITERARIAS() { return getToken(Valida_formsParser.HAB_LITERARIAS, 0); }
		public Form_altpess4Context form_altpess4() {
			return getRuleContext(Form_altpess4Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public Valida_Form_Altpess4Context(Form_altpess4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Altpess4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Altpess4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Altpess4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_altpess4Context form_altpess4() throws RecognitionException {
		Form_altpess4Context _localctx = new Form_altpess4Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_form_altpess4);
		int _la;
		try {
			_localctx = new Valida_Form_Altpess4Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			((Valida_Form_Altpess4Context)_localctx).op = match(T__16);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD || _la==WS) {
				{
				{
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			match(T__1);
			setState(620);
			((Valida_Form_Altpess4Context)_localctx).var_hab_lit = match(HAB_LITERARIAS);
			setState(621);
			match(NEWLINE);
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(622);
				form_altpess4();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_ferjus1Context extends ParserRuleContext {
		public Form_ferjus1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_ferjus1; }
	 
		public Form_ferjus1Context() { }
		public void copyFrom(Form_ferjus1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Ferjus1Context extends Form_ferjus1Context {
		public Token op;
		public DateContext var_data;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Form_ferjus1Context form_ferjus1() {
			return getRuleContext(Form_ferjus1Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public Valida_Form_Ferjus1Context(Form_ferjus1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Ferjus1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Ferjus1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Ferjus1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_ferjus1Context form_ferjus1() throws RecognitionException {
		Form_ferjus1Context _localctx = new Form_ferjus1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_form_ferjus1);
		int _la;
		try {
			_localctx = new Valida_Form_Ferjus1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			((Valida_Form_Ferjus1Context)_localctx).op = match(T__0);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD || _la==WS) {
				{
				{
				setState(626);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
			match(T__1);
			setState(633);
			((Valida_Form_Ferjus1Context)_localctx).var_data = date();
			setState(634);
			match(NEWLINE);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(635);
				form_ferjus1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_ferjus2Context extends ParserRuleContext {
		public Form_ferjus2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_ferjus2; }
	 
		public Form_ferjus2Context() { }
		public void copyFrom(Form_ferjus2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Ferjus2Context extends Form_ferjus2Context {
		public Token op;
		public DateContext var_data;
		public Val_form_reporte_alfaContext var;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Form_ferjus2Context form_ferjus2() {
			return getRuleContext(Form_ferjus2Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public Valida_Form_Ferjus2Context(Form_ferjus2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Ferjus2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Ferjus2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Ferjus2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_ferjus2Context form_ferjus2() throws RecognitionException {
		Form_ferjus2Context _localctx = new Form_ferjus2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_form_ferjus2);
		int _la;
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new Valida_Form_Ferjus2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				((Valida_Form_Ferjus2Context)_localctx).op = match(T__6);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(639);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(645);
				match(T__1);
				setState(646);
				((Valida_Form_Ferjus2Context)_localctx).var_data = date();
				setState(647);
				match(NEWLINE);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__7) {
					{
					setState(648);
					form_ferjus2();
					}
				}

				}
				break;
			case T__7:
				_localctx = new Valida_Form_Ferjus2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				((Valida_Form_Ferjus2Context)_localctx).op = match(T__7);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(652);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(658);
				match(T__1);
				setState(659);
				((Valida_Form_Ferjus2Context)_localctx).var = val_form_reporte_alfa();
				setState(660);
				match(NEWLINE);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__7) {
					{
					setState(661);
					form_ferjus2();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_ferjus3Context extends ParserRuleContext {
		public Form_ferjus3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_ferjus3; }
	 
		public Form_ferjus3Context() { }
		public void copyFrom(Form_ferjus3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Valida_Form_Ferjus3Context extends Form_ferjus3Context {
		public Token op;
		public DateContext var_data;
		public Val_form_reporte_alfaContext var;
		public TerminalNode NEWLINE() { return getToken(Valida_formsParser.NEWLINE, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Form_ferjus3Context form_ferjus3() {
			return getRuleContext(Form_ferjus3Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public Val_form_reporte_alfaContext val_form_reporte_alfa() {
			return getRuleContext(Val_form_reporte_alfaContext.class,0);
		}
		public Valida_Form_Ferjus3Context(Form_ferjus3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterValida_Form_Ferjus3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitValida_Form_Ferjus3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitValida_Form_Ferjus3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_ferjus3Context form_ferjus3() throws RecognitionException {
		Form_ferjus3Context _localctx = new Form_ferjus3Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_form_ferjus3);
		int _la;
		try {
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new Valida_Form_Ferjus3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				((Valida_Form_Ferjus3Context)_localctx).op = match(T__11);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(667);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673);
				match(T__1);
				setState(674);
				((Valida_Form_Ferjus3Context)_localctx).var_data = date();
				setState(675);
				match(NEWLINE);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(676);
					form_ferjus3();
					}
				}

				}
				break;
			case T__12:
				_localctx = new Valida_Form_Ferjus3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				((Valida_Form_Ferjus3Context)_localctx).op = match(T__12);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD || _la==WS) {
					{
					{
					setState(680);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(686);
				match(T__1);
				setState(687);
				((Valida_Form_Ferjus3Context)_localctx).var = val_form_reporte_alfa();
				setState(688);
				match(NEWLINE);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(689);
					form_ferjus3();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(Valida_formsParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Valida_formsParser.INT, i);
		}
		public List<TerminalNode> BARRA() { return getTokens(Valida_formsParser.BARRA); }
		public TerminalNode BARRA(int i) {
			return getToken(Valida_formsParser.BARRA, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(INT);
			setState(695);
			match(BARRA);
			setState(696);
			match(INT);
			setState(697);
			match(BARRA);
			setState(698);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Val_form_reporte_alfaContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(Valida_formsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Valida_formsParser.WS, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Valida_formsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Valida_formsParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(Valida_formsParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Valida_formsParser.INT, i);
		}
		public Val_form_reporte_alfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_form_reporte_alfa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterVal_form_reporte_alfa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitVal_form_reporte_alfa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitVal_form_reporte_alfa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Val_form_reporte_alfaContext val_form_reporte_alfa() throws RecognitionException {
		Val_form_reporte_alfaContext _localctx = new Val_form_reporte_alfaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_val_form_reporte_alfa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << WORD) | (1L << WS))) != 0)) {
				{
				{
				setState(700);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << WORD) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Valida_formsListener ) ((Valida_formsListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Valida_formsVisitor ) return ((Valida_formsVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u02c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\5\2?\n\2\3\2"+
		"\3\2\5\2C\n\2\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\5\3L\n\3\3\3\3\3\3\3\3\3\5"+
		"\3R\n\3\3\3\5\3U\n\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\3\5\3^\n\3\3\3\3\3\3\3"+
		"\3\3\5\3d\n\3\3\3\5\3g\n\3\5\3i\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\5\bw\n\b\3\b\5\bz\n\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\b"+
		"\5\b\u0083\n\b\3\b\3\b\3\b\3\b\5\b\u0089\n\b\3\b\5\b\u008c\n\b\5\b\u008e"+
		"\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u009a\n\f\3\f\5\f\u009d"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u00a3\n\f\3\f\5\f\u00a6\n\f\5\f\u00a8\n\f\3\r"+
		"\3\r\3\r\3\r\5\r\u00ae\n\r\3\r\5\r\u00b1\n\r\3\r\3\r\3\r\3\r\5\r\u00b7"+
		"\n\r\3\r\5\r\u00ba\n\r\3\r\3\r\3\r\3\r\5\r\u00c0\n\r\3\r\5\r\u00c3\n\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00c9\n\r\3\r\5\r\u00cc\n\r\5\r\u00ce\n\r\3\16\3"+
		"\16\3\16\3\16\5\16\u00d4\n\16\3\16\5\16\u00d7\n\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00dd\n\16\3\16\5\16\u00e0\n\16\3\16\3\16\3\16\3\16\5\16\u00e6\n"+
		"\16\3\16\5\16\u00e9\n\16\5\16\u00eb\n\16\3\17\3\17\7\17\u00ef\n\17\f\17"+
		"\16\17\u00f2\13\17\3\17\3\17\3\17\3\17\5\17\u00f8\n\17\3\17\3\17\7\17"+
		"\u00fc\n\17\f\17\16\17\u00ff\13\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17"+
		"\3\17\3\17\7\17\u0109\n\17\f\17\16\17\u010c\13\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0112\n\17\3\17\3\17\7\17\u0116\n\17\f\17\16\17\u0119\13\17\3\17"+
		"\3\17\3\17\3\17\5\17\u011f\n\17\3\17\3\17\7\17\u0123\n\17\f\17\16\17\u0126"+
		"\13\17\3\17\3\17\3\17\3\17\5\17\u012c\n\17\5\17\u012e\n\17\3\20\3\20\7"+
		"\20\u0132\n\20\f\20\16\20\u0135\13\20\3\20\3\20\3\20\3\20\5\20\u013b\n"+
		"\20\3\20\3\20\7\20\u013f\n\20\f\20\16\20\u0142\13\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0148\n\20\3\20\3\20\7\20\u014c\n\20\f\20\16\20\u014f\13\20\3"+
		"\20\3\20\3\20\3\20\5\20\u0155\n\20\3\20\3\20\7\20\u0159\n\20\f\20\16\20"+
		"\u015c\13\20\3\20\3\20\3\20\3\20\5\20\u0162\n\20\3\20\3\20\7\20\u0166"+
		"\n\20\f\20\16\20\u0169\13\20\3\20\3\20\3\20\3\20\5\20\u016f\n\20\5\20"+
		"\u0171\n\20\3\21\3\21\7\21\u0175\n\21\f\21\16\21\u0178\13\21\3\21\3\21"+
		"\3\21\3\21\5\21\u017e\n\21\3\21\3\21\7\21\u0182\n\21\f\21\16\21\u0185"+
		"\13\21\3\21\3\21\3\21\3\21\5\21\u018b\n\21\3\21\3\21\7\21\u018f\n\21\f"+
		"\21\16\21\u0192\13\21\3\21\3\21\3\21\3\21\5\21\u0198\n\21\3\21\3\21\7"+
		"\21\u019c\n\21\f\21\16\21\u019f\13\21\3\21\3\21\3\21\3\21\5\21\u01a5\n"+
		"\21\3\21\3\21\7\21\u01a9\n\21\f\21\16\21\u01ac\13\21\3\21\3\21\3\21\3"+
		"\21\5\21\u01b2\n\21\5\21\u01b4\n\21\3\22\3\22\7\22\u01b8\n\22\f\22\16"+
		"\22\u01bb\13\22\3\22\3\22\3\22\3\22\5\22\u01c1\n\22\3\22\3\22\7\22\u01c5"+
		"\n\22\f\22\16\22\u01c8\13\22\3\22\3\22\3\22\3\22\5\22\u01ce\n\22\3\22"+
		"\3\22\7\22\u01d2\n\22\f\22\16\22\u01d5\13\22\3\22\3\22\3\22\3\22\5\22"+
		"\u01db\n\22\3\22\3\22\7\22\u01df\n\22\f\22\16\22\u01e2\13\22\3\22\3\22"+
		"\3\22\3\22\5\22\u01e8\n\22\5\22\u01ea\n\22\3\23\3\23\7\23\u01ee\n\23\f"+
		"\23\16\23\u01f1\13\23\3\23\3\23\3\23\3\23\5\23\u01f7\n\23\3\23\3\23\7"+
		"\23\u01fb\n\23\f\23\16\23\u01fe\13\23\3\23\3\23\3\23\3\23\5\23\u0204\n"+
		"\23\3\23\3\23\7\23\u0208\n\23\f\23\16\23\u020b\13\23\3\23\3\23\3\23\3"+
		"\23\5\23\u0211\n\23\3\23\3\23\7\23\u0215\n\23\f\23\16\23\u0218\13\23\3"+
		"\23\3\23\3\23\3\23\5\23\u021e\n\23\5\23\u0220\n\23\3\24\3\24\7\24\u0224"+
		"\n\24\f\24\16\24\u0227\13\24\3\24\3\24\3\24\3\24\5\24\u022d\n\24\3\24"+
		"\3\24\7\24\u0231\n\24\f\24\16\24\u0234\13\24\3\24\3\24\3\24\3\24\5\24"+
		"\u023a\n\24\5\24\u023c\n\24\3\25\3\25\7\25\u0240\n\25\f\25\16\25\u0243"+
		"\13\25\3\25\3\25\3\25\3\25\5\25\u0249\n\25\3\25\3\25\7\25\u024d\n\25\f"+
		"\25\16\25\u0250\13\25\3\25\3\25\3\25\3\25\5\25\u0256\n\25\5\25\u0258\n"+
		"\25\3\26\3\26\7\26\u025c\n\26\f\26\16\26\u025f\13\26\3\26\3\26\3\26\3"+
		"\26\5\26\u0265\n\26\3\27\3\27\7\27\u0269\n\27\f\27\16\27\u026c\13\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0272\n\27\3\30\3\30\7\30\u0276\n\30\f\30\16\30"+
		"\u0279\13\30\3\30\3\30\3\30\3\30\5\30\u027f\n\30\3\31\3\31\7\31\u0283"+
		"\n\31\f\31\16\31\u0286\13\31\3\31\3\31\3\31\3\31\5\31\u028c\n\31\3\31"+
		"\3\31\7\31\u0290\n\31\f\31\16\31\u0293\13\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0299\n\31\5\31\u029b\n\31\3\32\3\32\7\32\u029f\n\32\f\32\16\32\u02a2"+
		"\13\32\3\32\3\32\3\32\3\32\5\32\u02a8\n\32\3\32\3\32\7\32\u02ac\n\32\f"+
		"\32\16\32\u02af\13\32\3\32\3\32\3\32\3\32\5\32\u02b5\n\32\5\32\u02b7\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\7\34\u02c0\n\34\f\34\16\34\u02c3"+
		"\13\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668\2\4\4\2,,..\5\2$$,,..\2\u0332\2B\3\2\2\2\4h\3\2\2"+
		"\2\6j\3\2\2\2\bl\3\2\2\2\nn\3\2\2\2\fp\3\2\2\2\16\u008d\3\2\2\2\20\u008f"+
		"\3\2\2\2\22\u0091\3\2\2\2\24\u0093\3\2\2\2\26\u00a7\3\2\2\2\30\u00cd\3"+
		"\2\2\2\32\u00ea\3\2\2\2\34\u012d\3\2\2\2\36\u0170\3\2\2\2 \u01b3\3\2\2"+
		"\2\"\u01e9\3\2\2\2$\u021f\3\2\2\2&\u023b\3\2\2\2(\u0257\3\2\2\2*\u0259"+
		"\3\2\2\2,\u0266\3\2\2\2.\u0273\3\2\2\2\60\u029a\3\2\2\2\62\u02b6\3\2\2"+
		"\2\64\u02b8\3\2\2\2\66\u02c1\3\2\2\28\u02c4\3\2\2\2:C\3\2\2\2;<\5\4\3"+
		"\2<>\5\2\2\2=?\7-\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\2\2\3AC\3\2\2"+
		"\2B:\3\2\2\2B;\3\2\2\2C\3\3\2\2\2DE\5\6\4\2EF\7-\2\2FH\5\16\b\2GI\7-\2"+
		"\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\4\3\2KJ\3\2\2\2KL\3\2\2\2Li\3\2\2"+
		"\2MN\5\b\5\2NO\7-\2\2OQ\5\26\f\2PR\7-\2\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2"+
		"\2SU\5\4\3\2TS\3\2\2\2TU\3\2\2\2Ui\3\2\2\2VW\5\n\6\2WX\7-\2\2XZ\5\30\r"+
		"\2Y[\7-\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\4\3\2]\\\3\2\2\2]^\3\2"+
		"\2\2^i\3\2\2\2_`\5\f\7\2`a\7-\2\2ac\5\32\16\2bd\7-\2\2cb\3\2\2\2cd\3\2"+
		"\2\2df\3\2\2\2eg\5\4\3\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hD\3\2\2\2hM\3\2"+
		"\2\2hV\3\2\2\2h_\3\2\2\2i\5\3\2\2\2jk\7\24\2\2k\7\3\2\2\2lm\7\25\2\2m"+
		"\t\3\2\2\2no\7\26\2\2o\13\3\2\2\2pq\7\27\2\2q\r\3\2\2\2rs\5\20\t\2st\7"+
		"-\2\2tv\5\34\17\2uw\7-\2\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\5\16\b\2yx"+
		"\3\2\2\2yz\3\2\2\2z\u008e\3\2\2\2{|\5\22\n\2|}\7-\2\2}\177\5\36\20\2~"+
		"\u0080\7-\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081"+
		"\u0083\5\16\b\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008e\3"+
		"\2\2\2\u0084\u0085\5\24\13\2\u0085\u0086\7-\2\2\u0086\u0088\5 \21\2\u0087"+
		"\u0089\7-\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u008c\5\16\b\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008dr\3\2\2\2\u008d{\3\2\2\2\u008d\u0084\3\2\2\2\u008e"+
		"\17\3\2\2\2\u008f\u0090\7\30\2\2\u0090\21\3\2\2\2\u0091\u0092\7\31\2\2"+
		"\u0092\23\3\2\2\2\u0093\u0094\7\32\2\2\u0094\25\3\2\2\2\u0095\u0096\7"+
		"\33\2\2\u0096\u0097\7-\2\2\u0097\u0099\5\"\22\2\u0098\u009a\7-\2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5\26"+
		"\f\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a8\3\2\2\2\u009e"+
		"\u009f\7\34\2\2\u009f\u00a0\7-\2\2\u00a0\u00a2\5$\23\2\u00a1\u00a3\7-"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a6\5\26\f\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3"+
		"\2\2\2\u00a7\u0095\3\2\2\2\u00a7\u009e\3\2\2\2\u00a8\27\3\2\2\2\u00a9"+
		"\u00aa\7\35\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ad\5&\24\2\u00ac\u00ae\7-"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00b1\5\30\r\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00ce\3"+
		"\2\2\2\u00b2\u00b3\7\36\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b6\5(\25\2\u00b5"+
		"\u00b7\7-\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00ba\5\30\r\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00ce\3\2\2\2\u00bb\u00bc\7\37\2\2\u00bc\u00bd\7-\2\2\u00bd\u00bf\5*"+
		"\26\2\u00be\u00c0\7-\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00ce\3\2\2\2\u00c4\u00c5\7 \2\2\u00c5\u00c6\7-\2\2\u00c6"+
		"\u00c8\5,\27\2\u00c7\u00c9\7-\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\5\30\r\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00a9\3\2\2\2\u00cd\u00b2\3\2"+
		"\2\2\u00cd\u00bb\3\2\2\2\u00cd\u00c4\3\2\2\2\u00ce\31\3\2\2\2\u00cf\u00d0"+
		"\7!\2\2\u00d0\u00d1\7-\2\2\u00d1\u00d3\5.\30\2\u00d2\u00d4\7-\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5\32"+
		"\16\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00eb\3\2\2\2\u00d8"+
		"\u00d9\7\"\2\2\u00d9\u00da\7-\2\2\u00da\u00dc\5\60\31\2\u00db\u00dd\7"+
		"-\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00e0\5\32\16\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00eb\3"+
		"\2\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\7-\2\2\u00e3\u00e5\5\62\32\2\u00e4"+
		"\u00e6\7-\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e9\5\32\16\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00cf\3\2\2\2\u00ea\u00d8\3\2\2\2\u00ea\u00e1\3\2"+
		"\2\2\u00eb\33\3\2\2\2\u00ec\u00f0\7\3\2\2\u00ed\u00ef\t\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\5\66"+
		"\34\2\u00f5\u00f7\7-\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u012e\3\2\2\2\u00f9\u00fd\7\5\2\2\u00fa\u00fc\t\2"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\4"+
		"\2\2\u0101\u0102\5\66\34\2\u0102\u0104\7-\2\2\u0103\u0105\5\34\17\2\u0104"+
		"\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u012e\3\2\2\2\u0106\u010a\7\6"+
		"\2\2\u0107\u0109\t\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010e\7\4\2\2\u010e\u010f\7*\2\2\u010f\u0111\7-\2\2\u0110\u0112"+
		"\5\34\17\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u012e\3\2\2\2"+
		"\u0113\u0117\7\7\2\2\u0114\u0116\t\2\2\2\u0115\u0114\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7\4\2\2\u011b\u011c\5\66\34\2\u011c\u011e\7"+
		"-\2\2\u011d\u011f\5\34\17\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u012e\3\2\2\2\u0120\u0124\7\b\2\2\u0121\u0123\t\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\4\2\2\u0128\u0129\5\66"+
		"\34\2\u0129\u012b\7-\2\2\u012a\u012c\5\34\17\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u00ec\3\2\2\2\u012d\u00f9\3\2"+
		"\2\2\u012d\u0106\3\2\2\2\u012d\u0113\3\2\2\2\u012d\u0120\3\2\2\2\u012e"+
		"\35\3\2\2\2\u012f\u0133\7\t\2\2\u0130\u0132\t\2\2\2\u0131\u0130\3\2\2"+
		"\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\4\2\2\u0137\u0138\5\66\34\2"+
		"\u0138\u013a\7-\2\2\u0139\u013b\5\36\20\2\u013a\u0139\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u0171\3\2\2\2\u013c\u0140\7\n\2\2\u013d\u013f\t\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\4\2\2\u0144"+
		"\u0145\5\66\34\2\u0145\u0147\7-\2\2\u0146\u0148\5\36\20\2\u0147\u0146"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0171\3\2\2\2\u0149\u014d\7\13\2\2"+
		"\u014a\u014c\t\2\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0151\7\4\2\2\u0151\u0152\7*\2\2\u0152\u0154\7-\2\2\u0153\u0155\5\36"+
		"\20\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0171\3\2\2\2\u0156"+
		"\u015a\7\f\2\2\u0157\u0159\t\2\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015e\7\4\2\2\u015e\u015f\5\66\34\2\u015f\u0161\7"+
		"-\2\2\u0160\u0162\5\36\20\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0171\3\2\2\2\u0163\u0167\7\r\2\2\u0164\u0166\t\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\4\2\2\u016b\u016c\5\66"+
		"\34\2\u016c\u016e\7-\2\2\u016d\u016f\5\36\20\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u012f\3\2\2\2\u0170\u013c\3\2"+
		"\2\2\u0170\u0149\3\2\2\2\u0170\u0156\3\2\2\2\u0170\u0163\3\2\2\2\u0171"+
		"\37\3\2\2\2\u0172\u0176\7\16\2\2\u0173\u0175\t\2\2\2\u0174\u0173\3\2\2"+
		"\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7\4\2\2\u017a\u017b\5\66\34\2"+
		"\u017b\u017d\7-\2\2\u017c\u017e\5 \21\2\u017d\u017c\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u01b4\3\2\2\2\u017f\u0183\7\17\2\2\u0180\u0182\t\2\2\2"+
		"\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\4\2\2\u0187"+
		"\u0188\5\66\34\2\u0188\u018a\7-\2\2\u0189\u018b\5 \21\2\u018a\u0189\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018b\u01b4\3\2\2\2\u018c\u0190\7\20\2\2\u018d"+
		"\u018f\t\2\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0194\7\4\2\2\u0194\u0195\7*\2\2\u0195\u0197\7-\2\2\u0196\u0198\5 \21"+
		"\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u01b4\3\2\2\2\u0199\u019d"+
		"\7\21\2\2\u019a\u019c\t\2\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u01a0\u01a1\7\4\2\2\u01a1\u01a2\5\66\34\2\u01a2\u01a4\7-\2\2"+
		"\u01a3\u01a5\5 \21\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b4"+
		"\3\2\2\2\u01a6\u01aa\7\22\2\2\u01a7\u01a9\t\2\2\2\u01a8\u01a7\3\2\2\2"+
		"\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\4\2\2\u01ae\u01af\5\66\34\2"+
		"\u01af\u01b1\7-\2\2\u01b0\u01b2\5 \21\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u0172\3\2\2\2\u01b3\u017f\3\2\2\2\u01b3"+
		"\u018c\3\2\2\2\u01b3\u0199\3\2\2\2\u01b3\u01a6\3\2\2\2\u01b4!\3\2\2\2"+
		"\u01b5\u01b9\7\3\2\2\u01b6\u01b8\t\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bd\7\4\2\2\u01bd\u01be\5\66\34\2\u01be\u01c0\7"+
		"-\2\2\u01bf\u01c1\5\"\22\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01ea\3\2\2\2\u01c2\u01c6\7\5\2\2\u01c3\u01c5\t\2\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7\4\2\2\u01ca\u01cb\7$"+
		"\2\2\u01cb\u01cd\7-\2\2\u01cc\u01ce\5\"\22\2\u01cd\u01cc\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01ea\3\2\2\2\u01cf\u01d3\7\6\2\2\u01d0\u01d2\t\2"+
		"\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7\4"+
		"\2\2\u01d7\u01d8\7)\2\2\u01d8\u01da\7-\2\2\u01d9\u01db\5\"\22\2\u01da"+
		"\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01ea\3\2\2\2\u01dc\u01e0\7\7"+
		"\2\2\u01dd\u01df\t\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e3\u01e4\7\4\2\2\u01e4\u01e5\7$\2\2\u01e5\u01e7\7-\2\2\u01e6\u01e8"+
		"\5\"\22\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2"+
		"\u01e9\u01b5\3\2\2\2\u01e9\u01c2\3\2\2\2\u01e9\u01cf\3\2\2\2\u01e9\u01dc"+
		"\3\2\2\2\u01ea#\3\2\2\2\u01eb\u01ef\7\t\2\2\u01ec\u01ee\t\2\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7\4\2\2\u01f3"+
		"\u01f4\5\66\34\2\u01f4\u01f6\7-\2\2\u01f5\u01f7\5$\23\2\u01f6\u01f5\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0220\3\2\2\2\u01f8\u01fc\7\n\2\2\u01f9"+
		"\u01fb\t\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff"+
		"\u0200\7\4\2\2\u0200\u0201\7$\2\2\u0201\u0203\7-\2\2\u0202\u0204\5$\23"+
		"\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0220\3\2\2\2\u0205\u0209"+
		"\7\13\2\2\u0206\u0208\t\2\2\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2"+
		"\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209"+
		"\3\2\2\2\u020c\u020d\7\4\2\2\u020d\u020e\7)\2\2\u020e\u0210\7-\2\2\u020f"+
		"\u0211\5$\23\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0220\3\2"+
		"\2\2\u0212\u0216\7\f\2\2\u0213\u0215\t\2\2\2\u0214\u0213\3\2\2\2\u0215"+
		"\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2"+
		"\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7\4\2\2\u021a\u021b\7$\2\2\u021b"+
		"\u021d\7-\2\2\u021c\u021e\5$\23\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u0220\3\2\2\2\u021f\u01eb\3\2\2\2\u021f\u01f8\3\2\2\2\u021f"+
		"\u0205\3\2\2\2\u021f\u0212\3\2\2\2\u0220%\3\2\2\2\u0221\u0225\7\3\2\2"+
		"\u0222\u0224\t\2\2\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228"+
		"\u0229\7\4\2\2\u0229\u022a\7&\2\2\u022a\u022c\7-\2\2\u022b\u022d\5&\24"+
		"\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u023c\3\2\2\2\u022e\u0232"+
		"\7\5\2\2\u022f\u0231\t\2\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0235\u0236\7\4\2\2\u0236\u0237\5\66\34\2\u0237\u0239\7-\2\2\u0238"+
		"\u023a\5&\24\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0221\3\2\2\2\u023b\u022e\3\2\2\2\u023c\'\3\2\2\2\u023d\u0241"+
		"\7\t\2\2\u023e\u0240\t\2\2\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0244\u0245\7\4\2\2\u0245\u0246\5\66\34\2\u0246\u0248\7-\2\2\u0247"+
		"\u0249\5(\25\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0258\3\2"+
		"\2\2\u024a\u024e\7\n\2\2\u024b\u024d\t\2\2\2\u024c\u024b\3\2\2\2\u024d"+
		"\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0251\u0252\7\4\2\2\u0252\u0253\5\66\34\2\u0253"+
		"\u0255\7-\2\2\u0254\u0256\5(\25\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0258\3\2\2\2\u0257\u023d\3\2\2\2\u0257\u024a\3\2\2\2\u0258"+
		")\3\2\2\2\u0259\u025d\7\16\2\2\u025a\u025c\t\2\2\2\u025b\u025a\3\2\2\2"+
		"\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260"+
		"\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7\4\2\2\u0261\u0262\7\'\2\2\u0262"+
		"\u0264\7-\2\2\u0263\u0265\5*\26\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265+\3\2\2\2\u0266\u026a\7\23\2\2\u0267\u0269\t\2\2\2\u0268\u0267"+
		"\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026e\7\4\2\2\u026e\u026f\7("+
		"\2\2\u026f\u0271\7-\2\2\u0270\u0272\5,\27\2\u0271\u0270\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272-\3\2\2\2\u0273\u0277\7\3\2\2\u0274\u0276\t\2\2\2"+
		"\u0275\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7\4\2\2\u027b"+
		"\u027c\5\64\33\2\u027c\u027e\7-\2\2\u027d\u027f\5.\30\2\u027e\u027d\3"+
		"\2\2\2\u027e\u027f\3\2\2\2\u027f/\3\2\2\2\u0280\u0284\7\t\2\2\u0281\u0283"+
		"\t\2\2\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\7\4"+
		"\2\2\u0288\u0289\5\64\33\2\u0289\u028b\7-\2\2\u028a\u028c\5\60\31\2\u028b"+
		"\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u029b\3\2\2\2\u028d\u0291\7\n"+
		"\2\2\u028e\u0290\t\2\2\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0294\u0295\7\4\2\2\u0295\u0296\5\66\34\2\u0296\u0298\7-\2\2\u0297"+
		"\u0299\5\60\31\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3"+
		"\2\2\2\u029a\u0280\3\2\2\2\u029a\u028d\3\2\2\2\u029b\61\3\2\2\2\u029c"+
		"\u02a0\7\16\2\2\u029d\u029f\t\2\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3"+
		"\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3\u02a4\7\4\2\2\u02a4\u02a5\5\64\33\2\u02a5\u02a7\7"+
		"-\2\2\u02a6\u02a8\5\62\32\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02b7\3\2\2\2\u02a9\u02ad\7\17\2\2\u02aa\u02ac\t\2\2\2\u02ab\u02aa\3"+
		"\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7\4\2\2\u02b1\u02b2\5\66"+
		"\34\2\u02b2\u02b4\7-\2\2\u02b3\u02b5\5\62\32\2\u02b4\u02b3\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u029c\3\2\2\2\u02b6\u02a9\3\2"+
		"\2\2\u02b7\63\3\2\2\2\u02b8\u02b9\7$\2\2\u02b9\u02ba\7+\2\2\u02ba\u02bb"+
		"\7$\2\2\u02bb\u02bc\7+\2\2\u02bc\u02bd\7$\2\2\u02bd\65\3\2\2\2\u02be\u02c0"+
		"\t\3\2\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\67\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5\13\2\2"+
		"\2\u02c59\3\2\2\2w>BHKQTZ]cfhvy\177\u0082\u0088\u008b\u008d\u0099\u009c"+
		"\u00a2\u00a5\u00a7\u00ad\u00b0\u00b6\u00b9\u00bf\u00c2\u00c8\u00cb\u00cd"+
		"\u00d3\u00d6\u00dc\u00df\u00e5\u00e8\u00ea\u00f0\u00f7\u00fd\u0104\u010a"+
		"\u0111\u0117\u011e\u0124\u012b\u012d\u0133\u013a\u0140\u0147\u014d\u0154"+
		"\u015a\u0161\u0167\u016e\u0170\u0176\u017d\u0183\u018a\u0190\u0197\u019d"+
		"\u01a4\u01aa\u01b1\u01b3\u01b9\u01c0\u01c6\u01cd\u01d3\u01da\u01e0\u01e7"+
		"\u01e9\u01ef\u01f6\u01fc\u0203\u0209\u0210\u0216\u021d\u021f\u0225\u022c"+
		"\u0232\u0239\u023b\u0241\u0248\u024e\u0255\u0257\u025d\u0264\u026a\u0271"+
		"\u0277\u027e\u0284\u028b\u0291\u0298\u029a\u02a0\u02a7\u02ad\u02b4\u02b6"+
		"\u02c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}