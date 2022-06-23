package br.srv.mgs.RequisicaoDeCompras.View.EventosDeTabela;

import br.com.sankhya.extensions.eventoprogramavel.EventoProgramavelJava;
import br.com.sankhya.jape.event.PersistenceEvent;
import br.com.sankhya.jape.event.TransactionContext;
import br.com.sankhya.jape.vo.DynamicVO;
import br.srv.mgs.RequisicaoDeCompras.commons.NativeSqlDecorator;
import br.srv.mgs.RequisicaoDeCompras.commons.VariaveisFlow;

import java.math.BigDecimal;

public class CalcularOrcamento implements EventoProgramavelJava {
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
        DynamicVO produtoVO = (DynamicVO) persistenceEvent.getVo();
        BigDecimal idinstprn = produtoVO.asBigDecimal("IDINSTPRN");
        BigDecimal qtd = produtoVO.asBigDecimal("QTD");


        NativeSqlDecorator nativeSqlDecoratorValorTotal = new NativeSqlDecorator("SELECT nvl(SUM(VLRMD), 0) VLRTOT\n" +
                "FROM AD_CMPPRODS\n" +
                "WHERE IDINSTPRN = :IDINSTPRN");
        BigDecimal valorOrcamento = BigDecimal.ZERO;
        nativeSqlDecoratorValorTotal.setParametro("IDINSTPRN", new BigDecimal(idinstprn.toString()));
        if (nativeSqlDecoratorValorTotal.proximo()){
            valorOrcamento = nativeSqlDecoratorValorTotal.getValorBigDecimal("VLRTOT");

        }
        VariaveisFlow.setVariavel(idinstprn, BigDecimal.ZERO, "VLRORC", valorOrcamento.multiply(qtd));
        //contextoEvento.setCampo("VLRORC", String.valueOf(valorOrcamento));

    }

    @Override
    public void afterUpdate(PersistenceEvent persistenceEvent) throws Exception {
        DynamicVO produtoVO = (DynamicVO) persistenceEvent.getVo();
        BigDecimal idinstprn = produtoVO.asBigDecimal("IDINSTPRN");
        BigDecimal qtd = produtoVO.asBigDecimal("QTD");


        NativeSqlDecorator nativeSqlDecoratorValorTotal = new NativeSqlDecorator("SELECT nvl(SUM(VLRMD), 0) VLRTOT\n" +
                "FROM AD_CMPPRODS\n" +
                "WHERE IDINSTPRN = :IDINSTPRN");
        BigDecimal valorOrcamento = BigDecimal.ZERO;
        nativeSqlDecoratorValorTotal.setParametro("IDINSTPRN", new BigDecimal(idinstprn.toString()));
        if (nativeSqlDecoratorValorTotal.proximo()){
            valorOrcamento = nativeSqlDecoratorValorTotal.getValorBigDecimal("VLRTOT");

        }
        VariaveisFlow.setVariavel(idinstprn, BigDecimal.ZERO, "VLRORC", valorOrcamento.multiply(qtd));
        //contextoEvento.setCampo("VLRORC", String.valueOf(valorOrcamento));

    }

    @Override
    public void afterDelete(PersistenceEvent persistenceEvent) throws Exception {
        DynamicVO produtoVO = (DynamicVO) persistenceEvent.getVo();
        BigDecimal idinstprn = produtoVO.asBigDecimal("IDINSTPRN");
        BigDecimal qtd = produtoVO.asBigDecimal("QTD");


        NativeSqlDecorator nativeSqlDecoratorValorTotal = new NativeSqlDecorator("SELECT nvl(SUM(VLRMD), 0) VLRTOT\n" +
                "FROM AD_CMPPRODS\n" +
                "WHERE IDINSTPRN = :IDINSTPRN");
        BigDecimal valorOrcamento = BigDecimal.ZERO;
        nativeSqlDecoratorValorTotal.setParametro("IDINSTPRN", new BigDecimal(idinstprn.toString()));
        if (nativeSqlDecoratorValorTotal.proximo()){
            valorOrcamento = nativeSqlDecoratorValorTotal.getValorBigDecimal("VLRTOT");

        }
        VariaveisFlow.setVariavel(idinstprn, BigDecimal.ZERO, "VLRORC", valorOrcamento.multiply(qtd));
        //contextoEvento.setCampo("VLRORC", String.valueOf(valorOrcamento));
    }

    @Override
    public void beforeCommit(TransactionContext transactionContext) throws Exception {

    }
}
