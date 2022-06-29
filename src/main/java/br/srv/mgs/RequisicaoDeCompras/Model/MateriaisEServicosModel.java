package br.srv.mgs.RequisicaoDeCompras.Model;
import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.jape.event.PersistenceEvent;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;
import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Collection;

public class MateriaisEServicosModel {

    private DynamicVO MASTERVO;
    private DynamicVO vo;
    private JapeWrapper CMPPRODSDAO = JapeFactory.dao("AD_CMPPRODS");


    private FluidCreateVO FLUIDCREATEVO;
    private BigDecimal CODPROD;
    private  BigDecimal IDINSTPRN_PRC;
    private  BigDecimal IDINSTTAR;
    private String IDTAREFA;
    private BigDecimal QTD;
    private  String UNID;
    private byte[] ARQORC;
    private byte[] ARQMPRC;
    private BigDecimal CODPARC;
    private String CONTROLE;
    private BigDecimal CODLOCALPD;
    public MateriaisEServicosModel() {
    }
    public FluidCreateVO getFLUIDCREATEVO() {
        return FLUIDCREATEVO;
    }
    public void setFLUIDCREATEVO(FluidCreateVO FLUIDCREATEVO) {
        this.FLUIDCREATEVO = FLUIDCREATEVO;
    }
    public JapeWrapper getCMPPRODSDAO() {
        return CMPPRODSDAO;
    }
    public void setCMPPRODSDAO(JapeWrapper CMPPRODSDAO) {
        this.CMPPRODSDAO = CMPPRODSDAO;
    }
    public BigDecimal getCODPROD() {
        return CODPROD;
    }
    public void setCODPROD(BigDecimal CODPROD) {
        this.CODPROD = CODPROD;
    }
    public BigDecimal getIDINSTPRN_PRC() {
        return IDINSTPRN_PRC;
    }
    public void setIDINSTPRN(BigDecimal IDINSTPRN_PRC) {
        this.IDINSTPRN_PRC = IDINSTPRN_PRC;
    }
    public BigDecimal getIDINSTTAR() {
        return IDINSTTAR;
    }
    public void setIDINSTTAR(BigDecimal IDINSTTAR) {
        this.IDINSTTAR = IDINSTTAR;
    }
    public String getIDTAREFA() {
        return IDTAREFA;
    }
    public void setIDTAREFA(String IDTAREFA) {
        this.IDTAREFA = IDTAREFA;
    }
    public BigDecimal getQTD() {
        return QTD;
    }
    public void setQTD(BigDecimal QTD) {
        this.QTD = QTD;
    }
    public String getUNID() {
        return UNID;
    }
    public void setUNID(String UNID) {
        this.UNID = UNID;
    }
    public byte[] getARQORC() {
        return ARQORC;
    }
    public void setARQORC(byte [] ARQORC) {
        this.ARQORC = ARQORC;
    }
    public byte[] getARQMPRC() {
        return ARQMPRC;
    }
    public void setARQMPRC(byte [] ARQMPRC) {
        this.ARQMPRC = ARQMPRC;
    }
    public BigDecimal getCODPARC() {
        return CODPARC;
    }
    public void setCODPARC(BigDecimal CODPARC) {
        this.CODPARC = CODPARC;
    }
    public String getCONTROLE() {
        return CONTROLE;
    }
    public void setCONTROLE(String CONTROLE) {
        this.CONTROLE = CONTROLE;
    }
    public BigDecimal getCODLOCALPD() {
        return CODLOCALPD;
    }
    public void setCODLOCALPD(BigDecimal CODLOCALPD) {
        this.CODLOCALPD = CODLOCALPD;
    }

    public boolean setarItensProcesso(ContextoTarefa contextoTarefa) throws Exception {
        MateriaisEServicosModel materiaisEServicos = new MateriaisEServicosModel();
        materiaisEServicos.setIDINSTPRN(new BigDecimal(String.valueOf(contextoTarefa.getCampo("IDINSTPRN_PRC"))));
        BigDecimal idinstprn_prc = materiaisEServicos.getIDINSTPRN_PRC();
        materiaisEServicos.setCMPPRODSDAO(JapeFactory.dao("AD_CMPPRODS"));
        Collection<DynamicVO> vos = getCMPPRODSDAO().find("IDINSTPRN = ?", idinstprn_prc);
        for (DynamicVO vo : vos) {
            materiaisEServicos.setFLUIDCREATEVO(getCMPPRODSDAO().create());
            getFLUIDCREATEVO().set("IDINSTPRN", new BigDecimal(contextoTarefa.getIdInstanceProcesso().toString()));
            getFLUIDCREATEVO().set("IDINSTTAR", new BigDecimal(0));
            getFLUIDCREATEVO().set("IDTAREFA", "UserTask_198zqu7");
            getFLUIDCREATEVO().set("CODPROD", vo.asBigDecimal("CODPROD"));
            getFLUIDCREATEVO().set("QTD", vo.asBigDecimal("QTD"));
            getFLUIDCREATEVO().set("UNID", vo.asString("UNID"));
            getFLUIDCREATEVO().set("VLRMD", vo.asBigDecimal("VLRMD"));
            getFLUIDCREATEVO().set("ARQORC", vo.asBlob("ARQORC"));
            getFLUIDCREATEVO().set("ARQMPRC", vo.asBlob("ARQMPRC"));
            getFLUIDCREATEVO().set("CODPARC", vo.asBigDecimal("CODPARC"));
            getFLUIDCREATEVO().set("CONTROLE", vo.asString("CONTROLE"));
            getFLUIDCREATEVO().set("CODLOCALPD", vo.asBigDecimal("CODLOCALPD"));
            getFLUIDCREATEVO().save();
        }
        return true;
    }

    public MateriaisEServicosModel(DynamicVO MASTERVO) {
        this.MASTERVO = MASTERVO;
    }

    public MateriaisEServicosModel(FluidCreateVO FLUIDCREATEVO) {
        this.FLUIDCREATEVO = FLUIDCREATEVO;
    }

    private void inicializaAtributos() throws Exception {
        MASTERVO = (DynamicVO) JapeFactory.dao("AD_CMPPRODS").find("IDINSTPRN = ? ", vo.asBigDecimal("IDINSTPRN"));
        CODPROD = vo.asBigDecimal("CODPROD");
        IDINSTPRN_PRC = vo.asBigDecimal("IDINSTPRN_PRC");
        IDINSTTAR = vo.asBigDecimal(String.valueOf(BigDecimal.ZERO));
        IDTAREFA = vo.asString("0");
        QTD = vo.asBigDecimal("QTD");
        UNID = vo.asString("UNID");
        ARQORC = vo.asBlob("ARQORC");
        ARQMPRC = vo.asBlob("ARQMPRC");
        CODPARC = vo.asBigDecimal("CORPARC");
        CONTROLE = vo.asString("CONTROLE");
        CODLOCALPD = vo.asBigDecimal("CODLOCALPD");


    }

    public void setVo(DynamicVO vo) throws Exception {
        this.vo = vo;
        inicializaAtributos();
    }






}