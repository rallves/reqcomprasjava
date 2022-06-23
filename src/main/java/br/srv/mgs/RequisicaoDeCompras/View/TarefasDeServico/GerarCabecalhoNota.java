package br.srv.mgs.RequisicaoDeCompras.View.TarefasDeServico;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;
import br.srv.mgs.RequisicaoDeCompras.commons.NativeSqlDecorator;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

public class GerarCabecalhoNota implements TarefaJava{
    private BigDecimal NumeroUnico;
    private BigDecimal NumeroContrato;
    private BigDecimal TipoOperacao;
    private BigDecimal CodigoParceiro;
    private BigDecimal TipoNegociacao;
    private BigDecimal CodigoNatureza;
    private BigDecimal CodigoLotacao;
    private BigDecimal CentroDeResultado;
    private BigDecimal CodigoProjeto;
    private Timestamp DataNegociacao;
    private String JustificativaCompra;
    private BigDecimal CodigoEmpresa;
    private Timestamp DataHoraTipoOperacao;
    private BigDecimal IdInstanciaProcesso;
    private String CifFob;

    public GerarCabecalhoNota() {
    }

    public GerarCabecalhoNota(BigDecimal numeroUnico, BigDecimal numeroContrato, BigDecimal tipoOperacao, BigDecimal codigoParceiro, BigDecimal tipoNegociacao, BigDecimal codigoNatureza, BigDecimal codigoLotacao, BigDecimal centroDeResultado, BigDecimal codigoProjeto, Timestamp dataNegociacao, String justificativaCompra, BigDecimal codigoEmpresa, Timestamp dataHoraTipoOperacao, BigDecimal idInstanciaProcesso) {
        NumeroUnico = numeroUnico;
        NumeroContrato = numeroContrato;
        TipoOperacao = tipoOperacao;
        CodigoParceiro = codigoParceiro;
        TipoNegociacao = tipoNegociacao;
        CodigoNatureza = codigoNatureza;
        CodigoLotacao = codigoLotacao;
        CentroDeResultado = centroDeResultado;
        CodigoProjeto = codigoProjeto;
        DataNegociacao = dataNegociacao;
        JustificativaCompra = justificativaCompra;
        CodigoEmpresa = codigoEmpresa;
        DataHoraTipoOperacao = dataHoraTipoOperacao;
        IdInstanciaProcesso = idInstanciaProcesso;
    }

    public BigDecimal getIdInstanciaProcesso() {
        return IdInstanciaProcesso;
    }

    public void setIdInstanciaProcesso(BigDecimal idInstanciaProcesso) {
        IdInstanciaProcesso = idInstanciaProcesso;
    }

    public String getCifFob() {
        return CifFob;
    }

    public void setCifFob(String cifFob) {
        CifFob = cifFob;
    }

    public BigDecimal getNumeroContrato() {
        return NumeroContrato;
    }

    public void setNumeroContrato(BigDecimal numeroContrato) {
        NumeroContrato = numeroContrato;
    }

    public BigDecimal getCodigoEmpresa() {
        return CodigoEmpresa;
    }

    public Timestamp getDataHoraTipoOperacao() {
        return DataHoraTipoOperacao;
    }

    public void setDataHoraTipoOperacao(Timestamp dataHoraTipoOperacao) {
        DataHoraTipoOperacao = dataHoraTipoOperacao;
    }

    public void setCodigoEmpresa(BigDecimal codigoEmpresa) {
        CodigoEmpresa = codigoEmpresa;
    }

    public BigDecimal getNumeroUnico() {
        return NumeroUnico;
    }

    public void setNumeroUnico(BigDecimal numeroUnico) {
        NumeroUnico = numeroUnico;
    }

    public BigDecimal getTipoOperacao() {
        return TipoOperacao;
    }

    public void setTipoOperacao(BigDecimal tipoOperacao) {
        TipoOperacao = tipoOperacao;
    }

    public BigDecimal getCodigoParceiro() {
        return CodigoParceiro;
    }

    public void setCodigoParceiro(BigDecimal codigoParceiro) {
        CodigoParceiro = codigoParceiro;
    }

    public BigDecimal getTipoNegociacao() {
        return TipoNegociacao;
    }

    public void setTipoNegociacao(BigDecimal tipoNegociacao) {
        TipoNegociacao = tipoNegociacao;
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

    public BigDecimal getCentroDeResultado() {
        return CentroDeResultado;
    }

    public void setCentroDeResultado(BigDecimal centroDeResultado) {
        CentroDeResultado = centroDeResultado;
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
    public BigDecimal BuscarContratoCliente(BigDecimal centroDeResultado) throws Exception {
        BigDecimal numeroContrato;
        NativeSqlDecorator nativeSqlBuscarDadosCliente = new NativeSqlDecorator("SELECT\n" +
                "CON.NUMCONTRATO CONTRATO,CON.CODPARC CLIENTE,PAR.NOMEPARC NOME_CLIENTE_CONTRATO,\n" +
                "CASE\n" +
                "WHEN CON.NUMCONTRATO = 1 THEN SIT.AD_CODCENCUS\n" +
                "ELSE CON.CODCENCUS END AS CENTRO_RESULTADO,\n" +
                "CASE\n" +
                "WHEN CON.NUMCONTRATO = 1 THEN CUS.DESCRCENCUS\n" +
                "ELSE CUS.DESCRCENCUS END AS DESCRICAO_CENTRO_RESULTADO\n" +
                ",CON.CODCENCUS ,CUS.DESCRCENCUS\n" +
                ",SIT.CODSITE UNIDADE,SIT.NOMESITE NOME_UNIDADE_FATURAMENTO\n" +
                ",SIT.AD_CODPARC CLIENTE_UNIDADE,PARSIT.NOMEPARC NOME_CLIENTE_UNIDADE\n" +
                ",LOT.CODLOT LOTACAO\n" +
                ",LOT.DESCRLOT NOME_LOTACAO\n" +
                "FROM\n" +
                "TCSCON CON\n" +
                "INNER JOIN TGFSIT SIT ON CON.NUMCONTRATO = SIT.AD_NUMCONTRATO\n" +
                "INNER JOIN TGFPAR PAR ON PAR.CODPARC = CON.CODPARC\n" +
                "LEFT JOIN TGFPAR PARSIT ON PARSIT.CODPARC= SIT.AD_CODPARC\n" +
                "INNER JOIN TSICUS CUS ON CON.CODCENCUS = CUS.CODCENCUS OR SIT.AD_CODCENCUS = CUS.CODCENCUS\n" +
                "LEFT JOIN AD_TGFLOT LOT ON SIT.CODSITE = LOT.CODSITE\n" +
                "WHERE\n" +
                "(LOT.CODLOT = :CODLOTACAO OR :CODLOTACAO IS NULL)\n" +
                "AND CON.NUMCONTRATO IS NOT NULL\n" +
                "AND ROWNUM < 2\n" +
                "ORDER BY 1,6");
        nativeSqlBuscarDadosCliente.setParametro("CODLOTACAO", centroDeResultado);
        if (nativeSqlBuscarDadosCliente.proximo()){
            numeroContrato = nativeSqlBuscarDadosCliente.getValorBigDecimal("CONTRATO");
            if (numeroContrato.compareTo(BigDecimal.ONE) > 0){
                return numeroContrato;
            }
            else{
                return BigDecimal.ZERO;
            }
        }
        return BigDecimal.ZERO;

    }
    public void InserirItensNota(BigDecimal idInstanciaProcesso, BigDecimal numeroUnicoNota) throws Exception {
        JapeWrapper itemNotaDAO = JapeFactory.dao("ItemNota");
        BigDecimal contador = BigDecimal.ONE;


        JapeWrapper ad_cmpprodsDAO = JapeFactory.dao("AD_CMPPRODS");
        Collection<DynamicVO> vos = ad_cmpprodsDAO.find("IDINSTPRN = ?", idInstanciaProcesso);

        //BigDecimal numeroUnicoNota = (BigDecimal) VariaveisFlow.getVariavel(getIdInstanciaProcesso(), "NUMOVINT");


        for (DynamicVO vo : vos) {
            FluidCreateVO fluidCreateItensVO = itemNotaDAO.create();

            //fluidCreateItensVO.set("IDINSTPRN", idInstanciaProcesso);
            //fluidCreateItensVO.set("IDINSTTAR", new BigDecimal(0));
            //diariaAcvFCVO.set("CODREGISTRO", codregistro);
            fluidCreateItensVO.set("NUNOTA", numeroUnicoNota );
            fluidCreateItensVO.set("CODEMP", BigDecimal.ONE);
            fluidCreateItensVO.set("SEQUENCIA", contador);
            fluidCreateItensVO.set("CODPROD", vo.asBigDecimal("CODPROD"));
            fluidCreateItensVO.set("CODVOL", vo.asString("UNID"));

            //fluidCreateItensVO.set("CONTROLE", );

            fluidCreateItensVO.set("QTDNEG", vo.asBigDecimal("QTD") );
            fluidCreateItensVO.set("VLRUNIT", BigDecimal.ZERO);
            fluidCreateItensVO.set("VLRTOT", BigDecimal.ZERO);

            fluidCreateItensVO.set("CODLOCALORIG", vo.asBigDecimal("CODLOCALPD"));
            fluidCreateItensVO.save();
            contador = contador.add(BigDecimal.ONE);

    }


    }


        @Override
        public void executar(ContextoTarefa contextoTarefa) throws Exception {



            GerarCabecalhoNota NovoRegistroCabecalhoNota = new GerarCabecalhoNota();
            JapeWrapper tipoOperacaoDAO = JapeFactory.dao("TipoOperacao");//TGFTOP
            DynamicVO tipoOperacaoVO = tipoOperacaoDAO.findOne("CODTIPOPER=?", new BigDecimal(String.valueOf("300"/*contextoTarefa.getCampo("TOPCOMP")*/)));
            //TGFITE

            //SET DOS CAMPOS
            NovoRegistroCabecalhoNota.setTipoOperacao(new BigDecimal(String.valueOf(contextoTarefa.getCampo("TOPCOMP"))));
            NovoRegistroCabecalhoNota.setCodigoParceiro(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODPARC"))));
            NovoRegistroCabecalhoNota.setTipoNegociacao(new BigDecimal(String.valueOf(contextoTarefa.getCampo("TIPNEG"))));
            NovoRegistroCabecalhoNota.setCodigoNatureza(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODNAT"))));
            NovoRegistroCabecalhoNota.setCodigoLotacao(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODLOT"))));
            NovoRegistroCabecalhoNota.setCentroDeResultado(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODCENCUS"))));
            NovoRegistroCabecalhoNota.setCodigoProjeto(new BigDecimal(String.valueOf(contextoTarefa.getCampo("CODPROJ"))));
            NovoRegistroCabecalhoNota.setDataNegociacao((Timestamp) contextoTarefa.getCampo("DTNEG"));
            NovoRegistroCabecalhoNota.setJustificativaCompra(String.valueOf(contextoTarefa.getCampo("JSTCOMP")));
            NovoRegistroCabecalhoNota.setCodigoEmpresa(new BigDecimal(1));
            NovoRegistroCabecalhoNota.setDataHoraTipoOperacao(tipoOperacaoVO.asTimestamp("DHALTER"));
            NovoRegistroCabecalhoNota.setNumeroContrato(BuscarContratoCliente(NovoRegistroCabecalhoNota.getCentroDeResultado()));
            NovoRegistroCabecalhoNota.setIdInstanciaProcesso(new BigDecimal(String.valueOf(contextoTarefa.getIdInstanceProcesso())));
            NovoRegistroCabecalhoNota.setCifFob(String.valueOf("F"));
            BigDecimal numunico = new BigDecimal(String.valueOf(contextoTarefa.getCampo("NUMUNICO")));


            JapeWrapper cabecalhoNotaDAO = JapeFactory.dao("CabecalhoNota");
            FluidCreateVO fluidCreateVO = cabecalhoNotaDAO.create();

            fluidCreateVO.set("CODEMP", NovoRegistroCabecalhoNota.getCodigoEmpresa());
            fluidCreateVO.set("CODCENCUS", NovoRegistroCabecalhoNota.getCentroDeResultado());
            fluidCreateVO.set("NUMNOTA", new BigDecimal(1));
            fluidCreateVO.set("DTNEG", NovoRegistroCabecalhoNota.getDataNegociacao());
            fluidCreateVO.set("CODEMPNEGOC", NovoRegistroCabecalhoNota.getCodigoEmpresa());
            fluidCreateVO.set("CODPARC", NovoRegistroCabecalhoNota.getCodigoParceiro());
            fluidCreateVO.set("CODTIPOPER", NovoRegistroCabecalhoNota.getTipoOperacao());
            fluidCreateVO.set("DHTIPOPER", NovoRegistroCabecalhoNota.getDataHoraTipoOperacao());
            //fluidCreateVO.set("DHALTER", TimeUtils.getNow());
            fluidCreateVO.set("CODPROJ", NovoRegistroCabecalhoNota.getCodigoProjeto());
            fluidCreateVO.set("CODNAT", NovoRegistroCabecalhoNota.getCodigoNatureza());
            fluidCreateVO.set("OBSERVACAO", NovoRegistroCabecalhoNota.getJustificativaCompra());
            fluidCreateVO.set("AD_CODLOT", NovoRegistroCabecalhoNota.getCodigoLotacao());
            fluidCreateVO.set("CODTIPVENDA", NovoRegistroCabecalhoNota.getTipoNegociacao());
            fluidCreateVO.set("NUMCONTRATO", NovoRegistroCabecalhoNota.getNumeroContrato());

            fluidCreateVO.set("AD_IDINSTPRN", NovoRegistroCabecalhoNota.getIdInstanciaProcesso());

            fluidCreateVO.set("CIF_FOB", NovoRegistroCabecalhoNota.getCifFob());

            DynamicVO numeroUnicoNotaVO = fluidCreateVO.save();
            BigDecimal nunota = numeroUnicoNotaVO.asBigDecimal("NUNOTA");

            contextoTarefa.setCampo("NUMOVINT", String.valueOf(nunota));

            //inserindo na tabela de itens da nota
            InserirItensNota(new BigDecimal(String.valueOf(contextoTarefa.getIdInstanceProcesso())), nunota);

        }


}
