package br.srv.mgs.RequisicaoDeCompras.EventosDeTabela;

import br.com.sankhya.extensions.eventoprogramavel.EventoProgramavelJava;
import br.com.sankhya.jape.event.PersistenceEvent;
import br.com.sankhya.jape.event.TransactionContext;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.vo.EntityVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;
import br.com.sankhya.jape.wrapper.fluid.FluidUpdateVO;
import br.srv.mgs.RequisicaoDeCompras.commons.NativeSqlDecorator;

import java.math.BigDecimal;
import java.util.Collection;

public class LiberarAcessoProcesso implements EventoProgramavelJava {
    private BigDecimal CODUSU;
    private String CODIGO;
    private String OPCCMPI;
    private String OPCCMPE;
    private String OPCJUR;
    private String OPCLICI;
    private String OPCLICE;
    private String OPCONI;
    private String OPCONE;
    private String OPCUNDS;
    private String OPCUNDG;
    private String OPCUNDD;
    private String OPCDF;
    private String OPCDO;
    private String OPCDN;
    private String OPCDJ;
    private String OPCDR;
    private String OPCPR;

    public LiberarAcessoProcesso(BigDecimal CODUSU, String CODIGO, String OPCCMPI, String OPCCMPE, String OPCJUR, String OPCLICI, String OPCLICE, String OPCONI, String OPCONE, String OPCUNDS, String OPCUNDG, String OPCUNDD, String OPCDF, String OPCDO, String OPCDN, String OPCDJ, String OPCDR, String OPCPR) {
        this.CODUSU = CODUSU;
        this.CODIGO = CODIGO;
        this.OPCCMPI = OPCCMPI;
        this.OPCCMPE = OPCCMPE;
        this.OPCJUR = OPCJUR;
        this.OPCLICI = OPCLICI;
        this.OPCLICE = OPCLICE;
        this.OPCONI = OPCONI;
        this.OPCONE = OPCONE;
        this.OPCUNDS = OPCUNDS;
        this.OPCUNDG = OPCUNDG;
        this.OPCUNDD = OPCUNDD;
        this.OPCDF = OPCDF;
        this.OPCDO = OPCDO;
        this.OPCDN = OPCDN;
        this.OPCDJ = OPCDJ;
        this.OPCDR = OPCDR;
        this.OPCPR = OPCPR;
    }

    public BigDecimal getCODUSU() {
        return CODUSU;
    }

    public void setCODUSU(BigDecimal CODUSU) {
        this.CODUSU = CODUSU;
    }

    public LiberarAcessoProcesso() {
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getOPCCMPI() {
        return OPCCMPI;
    }

    public void setOPCCMPI(String OPCCMPI) {
        this.OPCCMPI = OPCCMPI;
    }

    public String getOPCCMPE() {
        return OPCCMPE;
    }

    public void setOPCCMPE(String OPCCMPE) {
        this.OPCCMPE = OPCCMPE;
    }

    public String getOPCJUR() {
        return OPCJUR;
    }

    public void setOPCJUR(String OPCJUR) {
        this.OPCJUR = OPCJUR;
    }

    public String getOPCLICI() {
        return OPCLICI;
    }

    public void setOPCLICI(String OPCLICI) {
        this.OPCLICI = OPCLICI;
    }

    public String getOPCLICE() {
        return OPCLICE;
    }

    public void setOPCLICE(String OPCLICE) {
        this.OPCLICE = OPCLICE;
    }

    public String getOPCONI() {
        return OPCONI;
    }

    public void setOPCONI(String OPCONI) {
        this.OPCONI = OPCONI;
    }

    public String getOPCONE() {
        return OPCONE;
    }

    public void setOPCONE(String OPCONE) {
        this.OPCONE = OPCONE;
    }

    public String getOPCUNDS() {
        return OPCUNDS;
    }

    public void setOPCUNDS(String OPCUNDS) {
        this.OPCUNDS = OPCUNDS;
    }

    public String getOPCUNDG() {
        return OPCUNDG;
    }

    public void setOPCUNDG(String OPCUNDG) {
        this.OPCUNDG = OPCUNDG;
    }

    public String getOPCUNDD() {
        return OPCUNDD;
    }

    public void setOPCUNDD(String OPCUNDD) {
        this.OPCUNDD = OPCUNDD;
    }

    public String getOPCDF() {
        return OPCDF;
    }

    public void setOPCDF(String OPCDF) {
        this.OPCDF = OPCDF;
    }

    public String getOPCDO() {
        return OPCDO;
    }

    public void setOPCDO(String OPCDO) {
        this.OPCDO = OPCDO;
    }

    public String getOPCDN() {
        return OPCDN;
    }

    public void setOPCDN(String OPCDN) {
        this.OPCDN = OPCDN;
    }

    public String getOPCDJ() {
        return OPCDJ;
    }

    public void setOPCDJ(String OPCDJ) {
        this.OPCDJ = OPCDJ;
    }

    public String getOPCDR() {
        return OPCDR;
    }

    public void setOPCDR(String OPCDR) {
        this.OPCDR = OPCDR;
    }

    public String getOPCPR() {
        return OPCPR;
    }

    public void setOPCPR(String OPCPR) {
        this.OPCPR = OPCPR;
    }

    public Collection buscarCodigoProcesso(Object formulario){

        LiberarAcessoProcesso processo = (LiberarAcessoProcesso) formulario;
        String opcunds = processo.getOPCUNDS();
        String opccmpe = processo.getOPCCMPE();


        //Collection<String> teste = null;



        return null;
    }
    public void gravarAcessosFlow(DynamicVO acessoFCVO, Object formulario, BigDecimal codPrn) throws Exception {
        JapeWrapper acessoProcessoFlow = JapeFactory.dao("CompartilhamentoProcesso");
        LiberarAcessoProcesso acessos = (LiberarAcessoProcesso) formulario;


        if (acessoFCVO == null){
            //INSERE NOVO REGISTRO
            FluidCreateVO fluidCreateVO = acessoProcessoFlow.create();
            fluidCreateVO.set("CODPRN", codPrn);
            fluidCreateVO.set("CODUSU", acessos.getCODUSU());
            fluidCreateVO.set("TIPUSUGRU", String.valueOf("U"));
            fluidCreateVO.set("PERMITEEDICAO", String.valueOf("N"));
            fluidCreateVO.set("PERMITECOMPARTILHAR", String.valueOf("N"));
            //SE O USUARIO POSSUIR ATIVADO O CAMPO AD_OPCUNDS  E O PROCESSO FOR REQUISICAO DE COMPRAS ELE DEVE PODER INICIAR UM PROCESSO
            if (acessos.getOPCUNDS().compareTo("S") == 0 && codPrn.compareTo(new BigDecimal(20)) == 0){
                fluidCreateVO.set("PERMITEINICIAR", String.valueOf("S"));
            }
            else{
                fluidCreateVO.set("PERMITEINICIAR", String.valueOf("N"));
            }
            fluidCreateVO.save();
        }
        else{
            //ATUALIZA O REGISTRO
            FluidUpdateVO fluidUpdateVO = acessoProcessoFlow.prepareToUpdate(acessoFCVO);
            fluidUpdateVO.set("CODPRN", codPrn);
            fluidUpdateVO.set("TIPUSUGRU", String.valueOf("U"));
            fluidUpdateVO.set("PERMITEEDICAO", String.valueOf("N"));
            fluidUpdateVO.set("PERMITECOMPARTILHAR", String.valueOf("N"));
            //SE O USUARIO POSSUIR ATIVADO O CAMPO AD_OPCUNDS ELE DEVE PODER INICIAR UM PROCESSO
            if (acessos.getOPCUNDS().compareTo("S") == 0 && codPrn.compareTo(new BigDecimal(20)) == 0){
                fluidUpdateVO.set("PERMITEINICIAR", String.valueOf("S"));
            }
            else{
                fluidUpdateVO.set("PERMITEINICIAR", String.valueOf("N"));
            }
            fluidUpdateVO.update();
        }


    }

    @Override
    public void beforeInsert(PersistenceEvent persistenceEvent) throws Exception {

    }

    @Override
    public void beforeUpdate(PersistenceEvent persistenceEvent) throws Exception {

    }

    @Override
    public void beforeDelete(PersistenceEvent persistenceEvent) throws Exception {

    }

    @Override
    public void afterInsert(PersistenceEvent persistenceEvent) throws Exception {
        BigDecimal codPrn = new BigDecimal(20);
        BigDecimal codPrnRPcAta = new BigDecimal(57);
        LiberarAcessoProcesso acessos = new LiberarAcessoProcesso();
        //CONSULTAR OS ACESSOS NA TABELA AD_CMPACS
        DynamicVO acessosECommerce = (DynamicVO) persistenceEvent.getVo();
        //SET nos atributos do acesso
        acessos.setCODUSU(acessosECommerce.asBigDecimal("CODUSU"));
        acessos.setCODIGO(acessosECommerce.asString("CODIGO")) ;
        acessos.setOPCCMPI(acessosECommerce.asString("OPCCMPI"));
        acessos.setOPCCMPE(acessosECommerce.asString("OPCCMPE"));
        acessos.setOPCJUR(acessosECommerce.asString("OPCJUR"));
        acessos.setOPCLICI(acessosECommerce.asString("OPCLICI"));
        acessos.setOPCLICE(acessosECommerce.asString("OPCLICE"));
        acessos.setOPCONI(acessosECommerce.asString("OPCONI"));
        acessos.setOPCONE(acessosECommerce.asString("OPCONE"));
        acessos.setOPCUNDS(acessosECommerce.asString("OPCUNDS"));
        acessos.setOPCUNDG(acessosECommerce.asString("OPCUNDG"));
        acessos.setOPCUNDD(acessosECommerce.asString("OPCUNDD"));
        acessos.setOPCDF(acessosECommerce.asString("OPCDF"));
        acessos.setOPCDO(acessosECommerce.asString("OPCDO"));
        acessos.setOPCDN(acessosECommerce.asString("OPCDN"));
        acessos.setOPCDJ(acessosECommerce.asString("OPCDJ"));
        acessos.setOPCDR(acessosECommerce.asString("OPCDR"));
        acessos.setOPCPR(acessosECommerce.asString("OPCPR"));

        JapeWrapper acessoProcessoFlow = JapeFactory.dao("CompartilhamentoProcesso");
        DynamicVO acessoFCVO = acessoProcessoFlow.findOne("CODPRN = ? AND CODUSU = ?", codPrn, acessos.getCODUSU());
        //gravar acessos no processo 20 - Requisição de Compras
        gravarAcessosFlow(acessoFCVO, acessos, codPrn);
        DynamicVO acessoRpAta = acessoProcessoFlow.findOne("CODPRN = ? AND CODUSU = ?", codPrnRPcAta, acessos.getCODUSU());
        gravarAcessosFlow(acessoRpAta, acessos, codPrnRPcAta );

    }

    @Override
    public void afterUpdate(PersistenceEvent persistenceEvent) throws Exception {
        BigDecimal codPrn = new BigDecimal(20);
        BigDecimal codPrnRPcAta = new BigDecimal(57);
        LiberarAcessoProcesso acessos = new LiberarAcessoProcesso();
        //CONSULTAR OS ACESSOS NA TABELA AD_CMPACS
        DynamicVO acessosECommerce = (DynamicVO) persistenceEvent.getVo();
        //SET nos atributos do acesso
        acessos.setCODUSU(acessosECommerce.asBigDecimal("CODUSU"));
        acessos.setCODIGO(acessosECommerce.asString("CODIGO")) ;
        acessos.setOPCCMPI(acessosECommerce.asString("OPCCMPI"));
        acessos.setOPCCMPE(acessosECommerce.asString("OPCCMPE"));
        acessos.setOPCJUR(acessosECommerce.asString("OPCJUR"));
        acessos.setOPCLICI(acessosECommerce.asString("OPCLICI"));
        acessos.setOPCLICE(acessosECommerce.asString("OPCLICE"));
        acessos.setOPCONI(acessosECommerce.asString("OPCONI"));
        acessos.setOPCONE(acessosECommerce.asString("OPCONE"));
        acessos.setOPCUNDS(acessosECommerce.asString("OPCUNDS"));
        acessos.setOPCUNDG(acessosECommerce.asString("OPCUNDG"));
        acessos.setOPCUNDD(acessosECommerce.asString("OPCUNDD"));
        acessos.setOPCDF(acessosECommerce.asString("OPCDF"));
        acessos.setOPCDO(acessosECommerce.asString("OPCDO"));
        acessos.setOPCDN(acessosECommerce.asString("OPCDN"));
        acessos.setOPCDJ(acessosECommerce.asString("OPCDJ"));
        acessos.setOPCDR(acessosECommerce.asString("OPCDR"));
        acessos.setOPCPR(acessosECommerce.asString("OPCPR"));

        JapeWrapper acessoProcessoFlow = JapeFactory.dao("CompartilhamentoProcesso");
        DynamicVO acessoFCVO = acessoProcessoFlow.findOne("CODPRN = ? AND CODUSU = ?", codPrn, acessos.getCODUSU());
        //gravar acessos no processo 20 - Requisição de Compras
        gravarAcessosFlow(acessoFCVO, acessos, codPrn);
        DynamicVO acessoRpAta = acessoProcessoFlow.findOne("CODPRN = ? AND CODUSU = ?", codPrnRPcAta, acessos.getCODUSU());
        gravarAcessosFlow(acessoRpAta, acessos, codPrnRPcAta );


    }

    @Override
    public void afterDelete(PersistenceEvent persistenceEvent) throws Exception {

    }

    @Override
    public void beforeCommit(TransactionContext transactionContext) throws Exception {

    }
}
