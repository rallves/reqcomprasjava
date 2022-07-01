package br.srv.mgs.RequisicaoDeCompras.Model;

import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProcessoComprasModel {
    private DynamicVO MASTERVO;
    private DynamicVO vo;
    private JapeWrapper CMPPRODSDAO = JapeFactory.dao("AD_CMPREQCOMP");


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

    public ProcessoComprasModel(DynamicVO vo) throws Exception {
        this.vo = vo;
        inicializaAtributos();

    }

    public void setVo(DynamicVO vo) throws Exception {
        this.vo = vo;
        inicializaAtributos();
    }

    private void inicializaAtributos() throws Exception {
        MASTERVO = (DynamicVO) JapeFactory.dao("AD_CMPREQCOMP").find("IDINSTPRN = ? ", vo.asBigDecimal("IDINSTPRN"));
        CODIGOPARCEIRO = vo.asBigDecimal("CODPARC");
        CODIGONATUREZA = vo.asBigDecimal("CODNAT");
        CODIGOLOTACAO = vo.asBigDecimal("CODLOT");
        CENTRORESULTADO = vo.asBigDecimal("CODCENCUS");
        CODIGOPROJETO = vo.asBigDecimal("CODPROJ");
        DATANEGOCIACAO = vo.asTimestamp("DTNEG");
        JUSTIFICATIVACOMPRA = vo.asString("JSTCOMP");
        VALORORCAMENTO = vo.asBigDecimal("VLRORC");
        CODIGOTIPOOPERACAO = vo.asBigDecimal("CODTIPOPER");
        TIPODENEGOCIACAO = vo.asBigDecimal("CODTIPVENDA");
        JUSTIFICATIVAREFERENCIA = vo.asString("JSTREFCMP");
        EMAILGRUPODEMANDANTE = vo.asString("EMLGRCMP");
        JUSTIFICATIVAAPROVADORHIERARQUICO = vo.asString("JSTLIBPRC");
        EMAILCOORDENADORCOMPRAS = vo.asString("EMLCCMP");
        DATAENVIOPROCESSO = vo.asTimestamp("DTENVPRC");
        DATALIBERACAOPROCESSO = vo.asTimestamp("DTLIBPRC");
        MATRICULACOMPRADOR = vo.asBigDecimal("CODIGO");
        EMAILCOMPRADOR = vo.asString("EMLCMP");
        NUMEROUNICONOTA = vo.asBigDecimal("NUMUNICO");
        JUSTIFICATIVAENVIOCOMPRA = vo.asString("JSTENVCMP");
        JUSTIFICATIVAPROCESSOCOMPRADOR = vo.asString("JSTPRCCMP");
        JUSTIFICATIVAORCAMENTO = vo.asString("JSTORC");
        EMAILMODALIDADECOMPRA = vo.asString("EMAMDCMP");
        MATRICULAMODALIDADECOMPRA = vo.asBigDecimal("MATMCMP");
        JUSTIFICATIVAAREADEMANDANTE = vo.asString("JSTACORC");
        CODIGOPROCESSO = vo.asBigDecimal("CODPROC");
        CODIGOMOTIVO = vo.asBigDecimal("CODOCOROS");
        DESCRICAOINSTRUMENTO = vo.asString("DSCINSTR");
        USUARIOFILA = vo.asBigDecimal("USUFIL");
        NUMEROOSCOMPRA = vo.asBigDecimal("NUMOS");


    }
}
