package br.srv.mgs.RequisicaoDeCompras.View.EventosDeProcesso;

import br.com.sankhya.extensions.flow.ContextoEvento;
import br.com.sankhya.extensions.flow.EventoProcessoJava;
import br.srv.mgs.RequisicaoDeCompras.commons.NativeSqlDecorator;

import java.math.BigDecimal;

public class CalcularValorOrcamento implements EventoProcessoJava {
    @Override
    public void executar(ContextoEvento contextoEvento) throws Exception {
        BigDecimal idInstanciaProcesso = (BigDecimal) contextoEvento.getIdInstanceProcesso();
        NativeSqlDecorator nativeSqlDecoratorValorTotal = new NativeSqlDecorator("SELECT nvl(SUM(VLRMD), 0) VLRTOT\n" +
                "FROM AD_CMPPRODS\n" +
                "WHERE IDINSTPRN = :IDINSTPRN");
        BigDecimal valorOrcamento = BigDecimal.ZERO;
        nativeSqlDecoratorValorTotal.setParametro("IDINSTPRN", contextoEvento.getIdInstanceProcesso());
        if (nativeSqlDecoratorValorTotal.proximo()){
            valorOrcamento = nativeSqlDecoratorValorTotal.getValorBigDecimal("VLRTOT");

        }
        contextoEvento.setCampo("VLRORC", String.valueOf(valorOrcamento));

    }
}
