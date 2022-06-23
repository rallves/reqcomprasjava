package br.srv.mgs.RequisicaoDeCompras.View.TarefasDeServico;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;

import java.math.BigDecimal;

public class GerarOrdemDeServico implements TarefaJava {
    @Override
    public void executar(ContextoTarefa contextoTarefa) throws Exception {
        BigDecimal numeroOS = BigDecimal.ONE;
        contextoTarefa.setCampo("NUMOS", String.valueOf(numeroOS));
        //contextoTarefa.setCampo("IDINSTPRN", contextoTarefa.getIdInstanceProcesso().toString());

    }
}
