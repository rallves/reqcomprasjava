package br.srv.mgs.RequisicaoDeCompras.View.TarefasDeServico;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import com.sankhya.util.TimeUtils;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class SetarCamposParametros implements TarefaJava {
    private BigDecimal idInstanciaProcesso;
    private Timestamp dataAtual;
    private BigDecimal tipoOperacaoCompra;
    private BigDecimal codigoParceiro;
    private BigDecimal tipoDeNegociacao;

    public SetarCamposParametros() {
    }

    public SetarCamposParametros(BigDecimal idInstanciaProcesso, Timestamp dataAtual, BigDecimal tipoOperacaoCompra, BigDecimal codigoParceiro, BigDecimal tipoDeNegociacao) {
        this.idInstanciaProcesso = idInstanciaProcesso;
        this.dataAtual = dataAtual;
        this.tipoOperacaoCompra = tipoOperacaoCompra;
        this.codigoParceiro = codigoParceiro;
        this.tipoDeNegociacao = tipoDeNegociacao;
    }

    public BigDecimal getIdInstanciaProcesso() {
        return idInstanciaProcesso;
    }

    public void setIdInstanciaProcesso(BigDecimal idInstanciaProcesso) {
        this.idInstanciaProcesso = idInstanciaProcesso;
    }

    public Timestamp getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Timestamp dataAtual) {
        this.dataAtual = dataAtual;
    }

    public BigDecimal getTipoOperacaoCompra() {
        return tipoOperacaoCompra;
    }

    public void setTipoOperacaoCompra(BigDecimal tipoOperacaoCompra) {
        this.tipoOperacaoCompra = tipoOperacaoCompra;
    }

    public BigDecimal getCodigoParceiro() {
        return codigoParceiro;
    }

    public void setCodigoParceiro(BigDecimal codigoParceiro) {
        this.codigoParceiro = codigoParceiro;
    }

    public BigDecimal getTipoDeNegociacao() {
        return tipoDeNegociacao;
    }

    public void setTipoDeNegociacao(BigDecimal tipoDeNegociacao) {
        this.tipoDeNegociacao = tipoDeNegociacao;
    }

    @Override
    public void executar(ContextoTarefa contextoTarefa) throws Exception {
        JapeWrapper ad_cmpparam = JapeFactory.dao("AD_CMPPARAM");
        DynamicVO ad_cmpparamVO = ad_cmpparam.findByPK(new BigDecimal(1));


        BigDecimal codtipvenda = ad_cmpparamVO.asBigDecimal("CODTIPVENDA");



        SetarCamposParametros setarCamposParametros = new SetarCamposParametros();

        setarCamposParametros.setCodigoParceiro(ad_cmpparamVO.asBigDecimal("CODPARC"));
        setarCamposParametros.setTipoOperacaoCompra(ad_cmpparamVO.asBigDecimal("CODTIPOPER"));
        setarCamposParametros.setDataAtual(TimeUtils.getNow());
        setarCamposParametros.setIdInstanciaProcesso((BigDecimal) contextoTarefa.getIdInstanceProcesso());
        setarCamposParametros.setTipoDeNegociacao(ad_cmpparamVO.asBigDecimal("CODTIPVENDA"));


        contextoTarefa.setCampo("NUMUNICO", String.valueOf(setarCamposParametros.getIdInstanciaProcesso()));
        contextoTarefa.setCampo("DTNEG", String.valueOf(setarCamposParametros.getDataAtual()));
        contextoTarefa.setCampo("TOPCOMP", String.valueOf(setarCamposParametros.getTipoOperacaoCompra()));
        contextoTarefa.setCampo("CODPARC", String.valueOf(setarCamposParametros.getCodigoParceiro()));
        contextoTarefa.setCampo("TIPNEG", String.valueOf(setarCamposParametros.getTipoDeNegociacao()));
        contextoTarefa.setCampo("IDINSTPRN_PRC", contextoTarefa.getIdInstanceProcesso().toString());
    }
}

