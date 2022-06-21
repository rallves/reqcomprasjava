package br.srv.mgs.RequisicaoDeCompras.TarefasDeServico;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;

public class SetarDadosSubProcesso implements TarefaJava {
    @Override
    public void executar(ContextoTarefa contextoTarefa) throws Exception {
        JapeWrapper ad_cmpreqcompDAO = JapeFactory.dao("AD_CMPREQCOMP");

    }
}
