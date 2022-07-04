package br.srv.mgs.RequisicaoDeCompras.View.TarefasDeServico;

import br.com.sankhya.extensions.eventoprogramavel.EventoProgramavelJava;
import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;
import br.srv.mgs.RequisicaoDeCompras.Controller.ProcessoComprasController;

public class GravarProcessoCompraView  implements TarefaJava {
    @Override
    public void executar(ContextoTarefa contextoTarefa) throws Exception {
        ProcessoComprasController processoComprasController = new ProcessoComprasController();
        processoComprasController.executar(contextoTarefa);
    }
}
