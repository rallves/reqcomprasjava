package br.srv.mgs.RequisicaoDeCompras.Model;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProcessoComprasModel {
    private DynamicVO MASTERVO;

    private ContextoTarefa ct;
    private JapeWrapper CMPPRODSDAO = JapeFactory.dao("AD_CMPREQCOMP");

    private FluidCreateVO cp = CMPPRODSDAO.create();


    private BigDecimal IDINSTPRN;
    private BigDecimal CODIGOPARCEIRO;
    private BigDecimal CODIGONATUREZA;
    private BigDecimal CODIGOLOTACAO;
    private BigDecimal CENTRORESULTADO;
    private BigDecimal CODIGOPROJETO;
    private Timestamp DATANEGOCIACAO;
    private String JUSTIFICATIVACOMPRA;
    private BigDecimal VALORORCAMENTO;
    private BigDecimal CODIGOTIPOOPERACAO;
    private BigDecimal TIPODENEGOCIACAO;
    private String JUSTIFICATIVAREFERENCIA;
    private String EMAILGRUPODEMANDANTE;
    private String JUSTIFICATIVAAPROVADORHIERARQUICO;
    private String EMAILCOORDENADORCOMPRAS;
    private Timestamp DATAENVIOPROCESSO;
    private Timestamp DATALIBERACAOPROCESSO;
    private BigDecimal MATRICULACOMPRADOR;
    private String EMAILCOMPRADOR;
    private BigDecimal NUMEROUNICONOTA;
    private String JUSTIFICATIVAENVIOCOMPRA;
    private String JUSTIFICATIVAPROCESSOCOMPRADOR;
    private String JUSTIFICATIVAORCAMENTO;
    private String EMAILMODALIDADECOMPRA;
    private BigDecimal MATRICULAMODALIDADECOMPRA;
    private String JUSTIFICATIVAAREADEMANDANTE;
    private BigDecimal CODIGOPROCESSO;
    private BigDecimal CODIGOMOTIVO;
    private String DESCRICAOINSTRUMENTO;
    private BigDecimal USUARIOFILA;
    private BigDecimal NUMEROOSCOMPRA;

    public ProcessoComprasModel() {
    }

    public ProcessoComprasModel(BigDecimal IDINSTPRN) throws Exception {
        this.IDINSTPRN = (BigDecimal) CMPPRODSDAO.findByPK(IDINSTPRN);
        inicializaAtributos();
    }
    public ProcessoComprasModel(ContextoTarefa contextoTarefa) throws Exception {
        inicializaAtributos();
        cp.set("IDINSTPRN", IDINSTPRN);
        cp.set("CODIGOPARCEIRO", CODIGOPARCEIRO);
        cp.set("CODIGONATUREZA", CODIGONATUREZA);
        cp.set("CODIGOLOTACAO", CODIGOLOTACAO);
        cp.set("CENTRORESULTADO", CENTRORESULTADO);
        cp.set("CODIGOPROJETO", CODIGOPROJETO);
        cp.set("DATANEGOCIACAO", DATANEGOCIACAO);
        cp.set("JUSTIFICATIVACOMPRA", JUSTIFICATIVACOMPRA);
        cp.set("VALORORCAMENTO", VALORORCAMENTO);
        cp.set("CODIGOTIPOOPERACAO", CODIGOTIPOOPERACAO);
        cp.set("TIPODENEGOCIACAO", TIPODENEGOCIACAO);
        cp.set("JUSTIFICATIVAREFERENCIA", JUSTIFICATIVAREFERENCIA);
        cp.set("EMAILGRUPODEMANDANTE", EMAILGRUPODEMANDANTE);
        cp.set("JUSTIFICATIVAAPROVADORHIERARQUICO", JUSTIFICATIVAAPROVADORHIERARQUICO);
        cp.set("EMAILCOORDENADORCOMPRAS", EMAILCOORDENADORCOMPRAS);
        cp.set("DATAENVIOPROCESSO", DATAENVIOPROCESSO);
        cp.set("DATALIBERACAOPROCESSO", DATALIBERACAOPROCESSO);
        cp.set("MATRICULACOMPRADOR", MATRICULACOMPRADOR);
        cp.set("EMAILCOMPRADOR", EMAILCOMPRADOR);
        cp.set("NUMEROUNICONOTA", NUMEROUNICONOTA);
        cp.set("JUSTIFICATIVAENVIOCOMPRA", JUSTIFICATIVAENVIOCOMPRA);
        cp.set("JUSTIFICATIVAPROCESSOCOMPRADOR", JUSTIFICATIVAPROCESSOCOMPRADOR);
        cp.set("JUSTIFICATIVAORCAMENTO", JUSTIFICATIVAORCAMENTO);
        cp.set("EMAILMODALIDADECOMPRA", EMAILMODALIDADECOMPRA);
        cp.set("MATRICULAMODALIDADECOMPRA", MATRICULAMODALIDADECOMPRA);
        cp.set("JUSTIFICATIVAAREADEMANDANTE", JUSTIFICATIVAAREADEMANDANTE);
        cp.set("CODIGOPROCESSO", CODIGOPROCESSO);
        cp.set("CODIGOMOTIVO", CODIGOMOTIVO);
        cp.set("DESCRICAOINSTRUMENTO", DESCRICAOINSTRUMENTO);
        cp.set("USUARIOFILA", USUARIOFILA);
        cp.set("NUMEROOSCOMPRA", NUMEROOSCOMPRA);
    }


    public void setAtributos(ContextoTarefa contextoTarefa) throws Exception {
        this.ct = contextoTarefa;
        inicializaAtributos();


    }
    public void gravarProcessoCompra(){

    }

    private void inicializaAtributos() throws Exception {
        IDINSTPRN = (BigDecimal) ct.getCampo("IDINSTPRN");
        CODIGOPARCEIRO = (BigDecimal) ct.getCampo("CODPARC");
        CODIGONATUREZA = (BigDecimal) ct.getCampo("CODNAT");
        CODIGOLOTACAO = (BigDecimal) ct.getCampo("CODLOT");
        CENTRORESULTADO = (BigDecimal) ct.getCampo("CODCENCUS");
        CODIGOPROJETO = (BigDecimal) ct.getCampo("CODPROJ");
        DATANEGOCIACAO = (Timestamp) ct.getCampo("DTNEG");
        JUSTIFICATIVACOMPRA = (String) ct.getCampo("JSTCOMP");
        VALORORCAMENTO = (BigDecimal) ct.getCampo("VLRORC");
        CODIGOTIPOOPERACAO = (BigDecimal) ct.getCampo("CODTIPOPER");
        TIPODENEGOCIACAO = (BigDecimal) ct.getCampo("CODTIPVENDA");
        JUSTIFICATIVAREFERENCIA = (String) ct.getCampo("JSTREFCMP");
        EMAILGRUPODEMANDANTE = (String) ct.getCampo("EMLGRCMP");
        JUSTIFICATIVAAPROVADORHIERARQUICO = (String) ct.getCampo("JSTLIBPRC");
        EMAILCOORDENADORCOMPRAS = (String) ct.getCampo("EMLCCMP");
        DATAENVIOPROCESSO = (Timestamp) ct.getCampo("DTENVPRC");
        DATALIBERACAOPROCESSO = (Timestamp) ct.getCampo("DTLIBPRC");
        MATRICULACOMPRADOR = (BigDecimal) ct.getCampo("CODIGO");
        EMAILCOMPRADOR = (String) ct.getCampo("EMLCMP");
        NUMEROUNICONOTA = (BigDecimal) ct.getCampo("NUMUNICO");
        JUSTIFICATIVAENVIOCOMPRA = (String) ct.getCampo("JSTENVCMP");
        JUSTIFICATIVAPROCESSOCOMPRADOR = (String) ct.getCampo("JSTPRCCMP");
        JUSTIFICATIVAORCAMENTO = (String) ct.getCampo("JSTORC");
        EMAILMODALIDADECOMPRA = (String) ct.getCampo("EMAMDCMP");
        MATRICULAMODALIDADECOMPRA = (BigDecimal) ct.getCampo("MATMCMP");
        JUSTIFICATIVAAREADEMANDANTE = (String) ct.getCampo("JSTACORC");
        CODIGOPROCESSO = (BigDecimal) ct.getCampo("CODPROC");
        CODIGOMOTIVO = (BigDecimal) ct.getCampo("CODOCOROS");
        DESCRICAOINSTRUMENTO = (String) ct.getCampo("DSCINSTR");
        USUARIOFILA = (BigDecimal) ct.getCampo("USUFIL");
        NUMEROOSCOMPRA = (BigDecimal) ct.getCampo("NUMOS");


    }
}
