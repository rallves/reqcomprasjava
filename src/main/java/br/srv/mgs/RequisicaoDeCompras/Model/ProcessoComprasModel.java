package br.srv.mgs.RequisicaoDeCompras.Model;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;
import com.sankhya.util.TimeUtils;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProcessoComprasModel {
    private DynamicVO MASTERVO;

    private ContextoTarefa ct;
    private JapeWrapper CMPPRODSDAO = JapeFactory.dao("AD_CMPREQCOMP");

    private FluidCreateVO fc = CMPPRODSDAO.create();


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
        fc.set("IDINSTPRN_PRC", IDINSTPRN);
        fc.set("CODIGOPARCEIRO", CODIGOPARCEIRO);
        fc.set("CODIGONATUREZA", CODIGONATUREZA);
        fc.set("CODIGOLOTACAO", CODIGOLOTACAO);
        fc.set("CENTRORESULTADO", CENTRORESULTADO);
        fc.set("CODIGOPROJETO", CODIGOPROJETO);
        fc.set("DATANEGOCIACAO", DATANEGOCIACAO);
        fc.set("JUSTIFICATIVACOMPRA", JUSTIFICATIVACOMPRA);
        fc.set("VALORORCAMENTO", VALORORCAMENTO);
        fc.set("CODIGOTIPOOPERACAO", CODIGOTIPOOPERACAO);
        fc.set("TIPODENEGOCIACAO", TIPODENEGOCIACAO);
        fc.set("JUSTIFICATIVAREFERENCIA", JUSTIFICATIVAREFERENCIA);
        fc.set("EMAILGRUPODEMANDANTE", EMAILGRUPODEMANDANTE);
        fc.set("JUSTIFICATIVAAPROVADORHIERARQUICO", JUSTIFICATIVAAPROVADORHIERARQUICO);
        fc.set("EMAILCOORDENADORCOMPRAS", EMAILCOORDENADORCOMPRAS);
        fc.set("DATAENVIOPROCESSO", DATAENVIOPROCESSO);
        fc.set("DATALIBERACAOPROCESSO", DATALIBERACAOPROCESSO);
        fc.set("MATRICULACOMPRADOR", MATRICULACOMPRADOR);
        fc.set("EMAILCOMPRADOR", EMAILCOMPRADOR);
        fc.set("NUMEROUNICONOTA", NUMEROUNICONOTA);
        fc.set("JUSTIFICATIVAENVIOCOMPRA", JUSTIFICATIVAENVIOCOMPRA);
        fc.set("JUSTIFICATIVAPROCESSOCOMPRADOR", JUSTIFICATIVAPROCESSOCOMPRADOR);
        fc.set("JUSTIFICATIVAORCAMENTO", JUSTIFICATIVAORCAMENTO);
        fc.set("EMAILMODALIDADECOMPRA", EMAILMODALIDADECOMPRA);
        fc.set("MATRICULAMODALIDADECOMPRA", MATRICULAMODALIDADECOMPRA);
        fc.set("JUSTIFICATIVAAREADEMANDANTE", JUSTIFICATIVAAREADEMANDANTE);
        fc.set("CODIGOPROCESSO", CODIGOPROCESSO);
        fc.set("CODIGOMOTIVO", CODIGOMOTIVO);
        fc.set("DESCRICAOINSTRUMENTO", DESCRICAOINSTRUMENTO);
        fc.set("USUARIOFILA", USUARIOFILA);
        fc.set("NUMEROOSCOMPRA", NUMEROOSCOMPRA);

    }


    public void setAtributos(ContextoTarefa contextoTarefa) throws Exception {
        this.ct = contextoTarefa;
        inicializaAtributos();


    }
    public void gravarProcessoCompra() throws Exception {
        fc.save();
    }

    private void inicializaAtributos() throws Exception {
        IDINSTPRN = ct.getCampo("IDINSTPRN_PRC") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("IDINSTPRN_PRC").toString());
        CODIGOPARCEIRO = new BigDecimal(String.valueOf(ct.getCampo("CODPARC")));
        CODIGONATUREZA = new BigDecimal(ct.getCampo("CODNAT").toString());
        CODIGOLOTACAO = new BigDecimal(String.valueOf(ct.getCampo("CODLOT")));
        CENTRORESULTADO = new BigDecimal(String.valueOf(ct.getCampo("CODCENCUS")));
        CODIGOPROJETO = new BigDecimal(String.valueOf(ct.getCampo("CODPROJ")));
        DATANEGOCIACAO = (Timestamp) ct.getCampo("DTNEG");
        JUSTIFICATIVACOMPRA = (String) ct.getCampo("JSTCOMP");
        VALORORCAMENTO = ct.getCampo("VLRORC") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("VLRORC").toString());
        CODIGOTIPOOPERACAO = ct.getCampo("CODTIPOPER") == null ? BigDecimal.ZERO :  new BigDecimal(ct.getCampo("CODTIPOPER").toString());
        TIPODENEGOCIACAO = ct.getCampo("CODTIPVENDA") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("CODTIPVENDA").toString());
        JUSTIFICATIVAREFERENCIA = ct.getCampo("JSTREFCMP") == null ? "N/A" : (String) ct.getCampo("JSTREFCMP");
        EMAILGRUPODEMANDANTE = ct.getCampo("EMLGRCMP") == null ? "N/A" : (String) ct.getCampo("EMLGRCMP");
        JUSTIFICATIVAAPROVADORHIERARQUICO = ct.getCampo("JSTLIBPRC") == null ? "N/A" : (String) ct.getCampo("JSTLIBPRC");
        EMAILCOORDENADORCOMPRAS = ct.getCampo("EMLCCMP") == null ? "N/A" : (String) ct.getCampo("EMLCCMP");
        DATAENVIOPROCESSO =  ct.getCampo("DTENVPRC") == null ? TimeUtils.getNow() :(Timestamp)ct.getCampo("DTENVPRC");
        DATALIBERACAOPROCESSO = ct.getCampo("DTLIBPRC") ==  null ? TimeUtils.getNow() : (Timestamp) ct.getCampo("DTLIBPRC");
        MATRICULACOMPRADOR = ct.getCampo("CODIGO") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("CODIGO").toString());
        EMAILCOMPRADOR = ct.getCampo("EMLCMP") == null ? "N/A" : (String) ct.getCampo("EMLCMP");
        NUMEROUNICONOTA = ct.getCampo("NUMUNICO") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("NUMUNICO").toString());
        JUSTIFICATIVAENVIOCOMPRA = ct.getCampo("JSTENVCMP") == null ? "N/A": (String) ct.getCampo("JSTENVCMP");
        JUSTIFICATIVAPROCESSOCOMPRADOR = ct.getCampo("JSTPRCCMP") == null ? "N/A" : (String) ct.getCampo("JSTPRCCMP");
        JUSTIFICATIVAORCAMENTO = ct.getCampo("JSTORC") == null ? "N/A" : (String) ct.getCampo("JSTORC");
        EMAILMODALIDADECOMPRA = ct.getCampo("EMAMDCMP") == null ? "N/A" : (String) ct.getCampo("EMAMDCMP");
        MATRICULAMODALIDADECOMPRA = ct.getCampo("MATMCMP") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("MATMCMP").toString());
        JUSTIFICATIVAAREADEMANDANTE = ct.getCampo("JSTACORC") == null ? "N/A" : (String) ct.getCampo("JSTACORC");
        CODIGOPROCESSO = ct.getCampo("CODPROC") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("CODPROC").toString());
        CODIGOMOTIVO = ct.getCampo("CODOCOROS") ==  null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("CODOCOROS").toString());
        DESCRICAOINSTRUMENTO = ct.getCampo("DSCINSTR") == null ? "N/A" : (String) ct.getCampo("DSCINSTR");
        USUARIOFILA = ct.getCampo("USUFIL") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("USUFIL").toString());
        NUMEROOSCOMPRA = ct.getCampo("NUMOS") == null ? BigDecimal.ZERO : new BigDecimal(ct.getCampo("NUMOS").toString());
    }
}
