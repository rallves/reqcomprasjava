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
}
