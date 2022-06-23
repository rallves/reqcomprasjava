package br.srv.mgs.RequisicaoDeCompras.View.TarefasDeServico;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;
import br.srv.mgs.RequisicaoDeCompras.commons.NativeSqlDecorator;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class gravarRegistro implements TarefaJava {
    private BigDecimal Idinstprn;
    private BigDecimal CodigoParceiro;
    private BigDecimal CodigoNatureza;
    private BigDecimal CodigoLotacao;
    private BigDecimal CentroResultado;
    private BigDecimal CodigoProjeto;
    private Timestamp  DataNegociacao;
    private String JustificativaCompra;
    private BigDecimal ValorOrcamento;
    private BigDecimal CodigoTipoOperacao;
    private BigDecimal TipoDeNegociacao;
    private String JustificativaReferencia;
    private String EmailGrupoDemandante;
    private String JustificativaAprovadorHierarquico;
    private String EmailCoordenadorCompras;
    private Timestamp DataEnvioProcesso;
    private Timestamp DataLiberacaoProcesso;
    private BigDecimal MatriculaComprador;
    private String EmailComprador;
    private BigDecimal NumeroUnicoNota;
    private String JustificativaEnvioComprador;
    private String JustificativaProcessoComprador;
    private String JustificativaOrcamento;
    private String EmailModalidadeCompra;
    private BigDecimal MatriculaModalidadeCompra;
    private String JustificativaAceiteAreaDemandante;
    private BigDecimal CodigoProcesso;
    private BigDecimal CodigoMotivo;
    private String DescricaoInstrumento;
    private BigDecimal UsuarioFila;
    private BigDecimal NumeroOSCompras;

    public gravarRegistro(BigDecimal idinstprn, BigDecimal codigoParceiro, BigDecimal codigoNatureza, BigDecimal codigoLotacao, BigDecimal centroResultado, BigDecimal codigoProjeto, Timestamp dataNegociacao, String justificativaCompra, BigDecimal valorOrcamento, BigDecimal codigoTipoOperacao, BigDecimal tipoDeNegociacao, String justificativaReferencia, String emailGrupoDemandante, String justificativaAprovadorHierarquico, String emailCoordenadorCompras, Timestamp dataEnvioProcesso, Timestamp dataLiberacaoProcesso, BigDecimal matriculaComprador, String emailComprador, BigDecimal numeroUnicoNota, String justificativaEnvioComprador, String justificativaProcessoComprador, String justificativaOrcamento, String emailModalidadeCompra, BigDecimal matriculaModalidadeCompra, String justificativaAceiteAreaDemandante, BigDecimal codigoProcesso, BigDecimal codigoMotivo, String descricaoInstrumento, BigDecimal usuarioFila, BigDecimal numeroOSCompras) {
        Idinstprn = idinstprn;
        CodigoParceiro = codigoParceiro;
        CodigoNatureza = codigoNatureza;
        CodigoLotacao = codigoLotacao;
        CentroResultado = centroResultado;
        CodigoProjeto = codigoProjeto;
        DataNegociacao = dataNegociacao;
        JustificativaCompra = justificativaCompra;
        ValorOrcamento = valorOrcamento;
        CodigoTipoOperacao = codigoTipoOperacao;
        TipoDeNegociacao = tipoDeNegociacao;
        JustificativaReferencia = justificativaReferencia;
        EmailGrupoDemandante = emailGrupoDemandante;
        JustificativaAprovadorHierarquico = justificativaAprovadorHierarquico;
        EmailCoordenadorCompras = emailCoordenadorCompras;
        DataEnvioProcesso = dataEnvioProcesso;
        DataLiberacaoProcesso = dataLiberacaoProcesso;
        MatriculaComprador = matriculaComprador;
        EmailComprador = emailComprador;
        NumeroUnicoNota = numeroUnicoNota;
        JustificativaEnvioComprador = justificativaEnvioComprador;
        JustificativaProcessoComprador = justificativaProcessoComprador;
        JustificativaOrcamento = justificativaOrcamento;
        EmailModalidadeCompra = emailModalidadeCompra;
        MatriculaModalidadeCompra = matriculaModalidadeCompra;
        JustificativaAceiteAreaDemandante = justificativaAceiteAreaDemandante;
        CodigoProcesso = codigoProcesso;
        CodigoMotivo = codigoMotivo;
        DescricaoInstrumento = descricaoInstrumento;
        UsuarioFila = usuarioFila;
        NumeroOSCompras = numeroOSCompras;
    }

    public gravarRegistro() {
    }

    public BigDecimal getIdinstprn() {
        return Idinstprn;
    }

    public void setIdinstprn(BigDecimal idinstprn) {
        Idinstprn = idinstprn;
    }

    public BigDecimal getCodigoParceiro() {
        return CodigoParceiro;
    }

    public void setCodigoParceiro(BigDecimal codigoParceiro) {
        CodigoParceiro = codigoParceiro;
    }

    public BigDecimal getCodigoNatureza() {
        return CodigoNatureza;
    }

    public void setCodigoNatureza(BigDecimal codigoNatureza) {
        CodigoNatureza = codigoNatureza;
    }

    public BigDecimal getCodigoLotacao() {
        return CodigoLotacao;
    }

    public void setCodigoLotacao(BigDecimal codigoLotacao) {
        CodigoLotacao = codigoLotacao;
    }

    public BigDecimal getCentroResultado() {
        return CentroResultado;
    }

    public void setCentroResultado(BigDecimal centroResultado) {
        CentroResultado = centroResultado;
    }

    public BigDecimal getCodigoProjeto() {
        return CodigoProjeto;
    }

    public void setCodigoProjeto(BigDecimal codigoProjeto) {
        CodigoProjeto = codigoProjeto;
    }

    public Timestamp getDataNegociacao() {
        return DataNegociacao;
    }

    public void setDataNegociacao(Timestamp dataNegociacao) {
        DataNegociacao = dataNegociacao;
    }

    public String getJustificativaCompra() {
        return JustificativaCompra;
    }

    public void setJustificativaCompra(String justificativaCompra) {
        JustificativaCompra = justificativaCompra;
    }

    public BigDecimal getValorOrcamento() {
        return ValorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        ValorOrcamento = valorOrcamento;
    }

    public BigDecimal getCodigoTipoOperacao() {
        return CodigoTipoOperacao;
    }

    public void setCodigoTipoOperacao(BigDecimal codigoTipoOperacao) {
        CodigoTipoOperacao = codigoTipoOperacao;
    }

    public BigDecimal getTipoDeNegociacao() {
        return TipoDeNegociacao;
    }

    public void setTipoDeNegociacao(BigDecimal tipoDeNegociacao) {
        TipoDeNegociacao = tipoDeNegociacao;
    }

    public String getJustificativaReferencia() {
        return JustificativaReferencia;
    }

    public void setJustificativaReferencia(String justificativaReferencia) {
        JustificativaReferencia = justificativaReferencia;
    }

    public String getEmailGrupoDemandante() {
        return EmailGrupoDemandante;
    }

    public void setEmailGrupoDemandante(String emailGrupoDemandante) {
        EmailGrupoDemandante = emailGrupoDemandante;
    }

    public String getJustificativaAprovadorHierarquico() {
        return JustificativaAprovadorHierarquico;
    }

    public void setJustificativaAprovadorHierarquico(String justificativaAprovadorHierarquico) {
        JustificativaAprovadorHierarquico = justificativaAprovadorHierarquico;
    }

    public String getEmailCoordenadorCompras() {
        return EmailCoordenadorCompras;
    }

    public void setEmailCoordenadorCompras(String emailCoordenadorCompras) {
        EmailCoordenadorCompras = emailCoordenadorCompras;
    }

    public Timestamp getDataEnvioProcesso() {
        return DataEnvioProcesso;
    }

    public void setDataEnvioProcesso(Timestamp dataEnvioProcesso) {
        DataEnvioProcesso = dataEnvioProcesso;
    }

    public Timestamp getDataLiberacaoProcesso() {
        return DataLiberacaoProcesso;
    }

    public void setDataLiberacaoProcesso(Timestamp dataLiberacaoProcesso) {
        DataLiberacaoProcesso = dataLiberacaoProcesso;
    }

    public BigDecimal getMatriculaComprador() {
        return MatriculaComprador;
    }

    public void setMatriculaComprador(BigDecimal matriculaComprador) {
        MatriculaComprador = matriculaComprador;
    }

    public String getEmailComprador() {
        return EmailComprador;
    }

    public void setEmailComprador(String emailComprador) {
        EmailComprador = emailComprador;
    }

    public BigDecimal getNumeroUnicoNota() {
        return NumeroUnicoNota;
    }

    public void setNumeroUnicoNota(BigDecimal numeroUnicoNota) {
        NumeroUnicoNota = numeroUnicoNota;
    }

    public String getJustificativaEnvioComprador() {
        return JustificativaEnvioComprador;
    }

    public void setJustificativaEnvioComprador(String justificativaEnvioComprador) {
        JustificativaEnvioComprador = justificativaEnvioComprador;
    }

    public String getJustificativaProcessoComprador() {
        return JustificativaProcessoComprador;
    }

    public void setJustificativaProcessoComprador(String justificativaProcessoComprador) {
        JustificativaProcessoComprador = justificativaProcessoComprador;
    }

    public String getJustificativaOrcamento() {
        return JustificativaOrcamento;
    }

    public void setJustificativaOrcamento(String justificativaOrcamento) {
        JustificativaOrcamento = justificativaOrcamento;
    }

    public String getEmailModalidadeCompra() {
        return EmailModalidadeCompra;
    }

    public void setEmailModalidadeCompra(String emailModalidadeCompra) {
        EmailModalidadeCompra = emailModalidadeCompra;
    }

    public BigDecimal getMatriculaModalidadeCompra() {
        return MatriculaModalidadeCompra;
    }

    public void setMatriculaModalidadeCompra(BigDecimal matriculaModalidadeCompra) {
        MatriculaModalidadeCompra = matriculaModalidadeCompra;
    }

    public String getJustificativaAceiteAreaDemandante() {
        return JustificativaAceiteAreaDemandante;
    }

    public void setJustificativaAceiteAreaDemandante(String justificativaAceiteAreaDemandante) {
        JustificativaAceiteAreaDemandante = justificativaAceiteAreaDemandante;
    }

    public BigDecimal getCodigoProcesso() {
        return CodigoProcesso;
    }

    public void setCodigoProcesso(BigDecimal codigoProcesso) {
        CodigoProcesso = codigoProcesso;
    }

    public BigDecimal getCodigoMotivo() {
        return CodigoMotivo;
    }

    public void setCodigoMotivo(BigDecimal codigoMotivo) {
        CodigoMotivo = codigoMotivo;
    }

    public String getDescricaoInstrumento() {
        return DescricaoInstrumento;
    }

    public void setDescricaoInstrumento(String descricaoInstrumento) {
        DescricaoInstrumento = descricaoInstrumento;
    }

    public BigDecimal getUsuarioFila() {
        return UsuarioFila;
    }

    public void setUsuarioFila(BigDecimal usuarioFila) {
        UsuarioFila = usuarioFila;
    }

    public BigDecimal getNumeroOSCompras() {
        return NumeroOSCompras;
    }

    public void setNumeroOSCompras(BigDecimal numeroOSCompras) {
        NumeroOSCompras = numeroOSCompras;
    }
    private BigDecimal buscarValorItens(BigDecimal idInstanciaProcesso, BigDecimal idInstanciaTarefa){
        NativeSqlDecorator nativeSqlValorOrcamento = new NativeSqlDecorator("SELECT NVL(SUM(VLRMD), 0)\n" +
                "FROM AD_CMPPRODS\n" +
                "WHERE IDINSTPRN = :IDINSTPRN AND IDINSTTAR = :IDINSTTAR");
        return null;
    }

    @Override
    public void executar(ContextoTarefa contextoTarefa) throws Exception {
        gravarRegistro gravarNovoRegistro = new gravarRegistro();
        gravarNovoRegistro.setIdinstprn(new BigDecimal(contextoTarefa.getIdInstanceProcesso().toString()));
        gravarNovoRegistro.setCodigoTipoOperacao(new BigDecimal(String.valueOf(contextoTarefa.getCampo("TOPCOMP"))));
        gravarNovoRegistro.setCodigoParceiro(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODPARC"))));
        gravarNovoRegistro.setTipoDeNegociacao(new BigDecimal(String.valueOf(contextoTarefa.getCampo("TIPNEG"))));
        gravarNovoRegistro.setCodigoNatureza(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODNAT"))));
        gravarNovoRegistro.setIdinstprn(new BigDecimal(String.valueOf(contextoTarefa.getCampo("NUMUNICO"))));
        gravarNovoRegistro.setCodigoLotacao(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODLOT"))));
        gravarNovoRegistro.setCentroResultado(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODCENCUS"))));
        gravarNovoRegistro.setCodigoProjeto(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODPROJ"))));
        gravarNovoRegistro.setDataNegociacao((Timestamp) contextoTarefa.getCampo("DTNEG"));
        gravarNovoRegistro.setJustificativaCompra(String.valueOf(contextoTarefa.getCampo("JSTCOMP")));
        gravarNovoRegistro.setJustificativaReferencia(String.valueOf(contextoTarefa.getCampo("JSTREFCMP")));
        gravarNovoRegistro.setEmailGrupoDemandante(String.valueOf(contextoTarefa.getCampo("EMAILGRCMP")));
        gravarNovoRegistro.setJustificativaAprovadorHierarquico(String.valueOf(contextoTarefa.getCampo("JSTLIBPRC")));
        gravarNovoRegistro.setEmailCoordenadorCompras(String.valueOf(contextoTarefa.getCampo("EMLCCMP")));
        //gravarNovoRegistro.setDataLiberacaoProcesso(contextoTarefa.getCampo("DTLIBPRC"));
        //gravarNovoRegistro.setMatriculaComprador(new BigDecimal(String.valueOf(contextoTarefa.getCampo("MATCMP"))));
        gravarNovoRegistro.setEmailComprador(String.valueOf(contextoTarefa.getCampo("EMLCMP")));
        gravarNovoRegistro.setJustificativaEnvioComprador(String.valueOf(contextoTarefa.getCampo("JSTENVCMP")));
        gravarNovoRegistro.setJustificativaProcessoComprador(String.valueOf(contextoTarefa.getCampo("JSTPRCCMP")));
        gravarNovoRegistro.setJustificativaOrcamento(String.valueOf(contextoTarefa.getCampo("JSTORC")));
        gravarNovoRegistro.setEmailModalidadeCompra(String.valueOf(contextoTarefa.getCampo("EMAMDCMP")));
        //gravarNovoRegistro.setMatriculaModalidadeCompra(new BigDecimal(String.valueOf(contextoTarefa.getCampo("MATMCMP"))));
        //gravarNovoRegistro.setCodigoProcesso(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODPROC"))));
        //gravarNovoRegistro.setCodigoMotivo(new BigDecimal(String.valueOf(contextoTarefa.getCampo("TIPPROC"))));
        gravarNovoRegistro.setDescricaoInstrumento(String.valueOf(contextoTarefa.getCampo("DSCINSTR")));
        //gravarNovoRegistro.setUsuarioFila(new BigDecimal(String.valueOf(contextoTarefa.getCampo("USUFIL"))));


        JapeWrapper requisicaoDeComprasDAO = JapeFactory.dao("AD_CMPREQCOMP");
        FluidCreateVO fluidCreateVO = requisicaoDeComprasDAO.create();

        fluidCreateVO.set("IDINSTPRN", gravarNovoRegistro.getIdinstprn());
        fluidCreateVO.set("CODPARC", gravarNovoRegistro.getCodigoParceiro());
        fluidCreateVO.set("CODNAT", gravarNovoRegistro.getCodigoNatureza());
        fluidCreateVO.set("CODLOT", gravarNovoRegistro.getCodigoLotacao());
        fluidCreateVO.set("CODCENCUS", gravarNovoRegistro.getCentroResultado());
        fluidCreateVO.set("CODPROJ", gravarNovoRegistro.getCodigoProjeto());
        fluidCreateVO.set("DTNEG", gravarNovoRegistro.getDataNegociacao());
        fluidCreateVO.set("JSTCOMP", gravarNovoRegistro.getJustificativaCompra());
        //fluidCreateVO.set("VLRORC", gravarNovoRegistro.getValorOrcamento());
        fluidCreateVO.set("CODTIPOPER", gravarNovoRegistro.getCodigoTipoOperacao());
        fluidCreateVO.set("CODTIPVENDA",gravarNovoRegistro.getTipoDeNegociacao() );
        fluidCreateVO.set("JSTREFCMP", gravarNovoRegistro.getJustificativaReferencia());
        fluidCreateVO.set("EMLGRCMP", gravarNovoRegistro.getEmailGrupoDemandante());
        //fluidCreateVO.set("JSTLIBPRC", gravarNovoRegistro.getJustificativaAprovadorHierarquico() );
        //fluidCreateVO.set("EMLCCMP", gravarNovoRegistro.getEmailCoordenadorCompras() );
        //fluidCreateVO.set("DTENVPRC", gravarNovoRegistro.getDataEnvioProcesso());
        //fluidCreateVO.set("DTLIBPRC", gravarNovoRegistro.getDataLiberacaoProcesso() );
        //fluidCreateVO.set("CODIGO", gravarNovoRegistro.getMatriculaComprador());
        //fluidCreateVO.set("EMLCMP",gravarNovoRegistro.getEmailComprador() );
        //fluidCreateVO.set("NUMUNICO", gravarNovoRegistro.getNumeroUnicoNota());
        //fluidCreateVO.set("JSTENVCMP", gravarNovoRegistro.getJustificativaEnvioComprador());
        //fluidCreateVO.set("JSTPRCCMP", gravarNovoRegistro.getJustificativaProcessoComprador());
        //fluidCreateVO.set("EMAMDCMP", gravarNovoRegistro.getEmailModalidadeCompra() );
        //fluidCreateVO.set("MATMCMP", gravarNovoRegistro.getMatriculaModalidadeCompra());
        //fluidCreateVO.set("JSTACORC", gravarNovoRegistro.getJustificativaOrcamento());
        //fluidCreateVO.set("CODPROC", gravarNovoRegistro.getCodigoProcesso());
        //fluidCreateVO.set("CODOCOROS", gravarNovoRegistro.getCodigoMotivo());
        //fluidCreateVO.set("DSCINSTR", gravarNovoRegistro.getDescricaoInstrumento() );
        //fluidCreateVO.set("USUFIL", gravarNovoRegistro.getUsuarioFila());
        //fluidCreateVO.set("NUMOS", gravarNovoRegistro.getNumeroOSCompras());



        fluidCreateVO.save();





    }
}
