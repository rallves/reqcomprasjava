package br.srv.mgs.RequisicaoDeCompras.View.EventosDeTabela;

import br.com.sankhya.extensions.eventoprogramavel.EventoProgramavelJava;
import br.com.sankhya.jape.event.PersistenceEvent;
import br.com.sankhya.jape.event.TransactionContext;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;

import java.math.BigDecimal;

public class BuscarCodigoUnidadeProduto implements EventoProgramavelJava {
    @Override
    public void beforeInsert(PersistenceEvent persistenceEvent) throws Exception {
        DynamicVO itensProdutosVO = (DynamicVO) persistenceEvent.getVo();
        BigDecimal codprod = itensProdutosVO.asBigDecimal("CODPROD");

        JapeWrapper produtoDAO = JapeFactory.dao("Produto");
        DynamicVO produtoVO = produtoDAO.findByPK(codprod);
        String codvol = produtoVO.asString("CODVOL");
        String controle = " ";
        BigDecimal codlocalpadrao = produtoVO.asBigDecimal("CODLOCALPADRAO");

        itensProdutosVO.setProperty("UNID", String.valueOf(codvol));
        itensProdutosVO.setProperty("CONTROLE", String.valueOf(controle));
        itensProdutosVO.setProperty("CODLOCALPD", codlocalpadrao);
    }

    @Override
    public void beforeUpdate(PersistenceEvent persistenceEvent) throws Exception {
        DynamicVO itensProdutosVO = (DynamicVO) persistenceEvent.getVo();
        BigDecimal codprod = itensProdutosVO.asBigDecimal("CODPROD");

        JapeWrapper produtoDAO = JapeFactory.dao("Produto");
        DynamicVO produtoVO = produtoDAO.findByPK(codprod);
        String codvol = produtoVO.asString("CODVOL");
        String controle = " ";
        BigDecimal codlocalpadrao = produtoVO.asBigDecimal("CODLOCALPADRAO");

        itensProdutosVO.setProperty("UNID", String.valueOf(codvol));
        itensProdutosVO.setProperty("CONTROLE", String.valueOf(controle));
        itensProdutosVO.setProperty("CODLOCALPD", codlocalpadrao);
    }

    @Override
    public void beforeDelete(PersistenceEvent persistenceEvent) throws Exception {

    }

    @Override
    public void afterInsert(PersistenceEvent persistenceEvent) throws Exception {

    }

    @Override
    public void afterUpdate(PersistenceEvent persistenceEvent) throws Exception {

    }

    @Override
    public void afterDelete(PersistenceEvent persistenceEvent) throws Exception {

    }

    @Override
    public void beforeCommit(TransactionContext transactionContext) throws Exception {

    }
}
