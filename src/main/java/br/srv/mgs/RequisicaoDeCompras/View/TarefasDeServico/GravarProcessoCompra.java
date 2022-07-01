package br.srv.mgs.RequisicaoDeCompras.View.TarefasDeServico;

import br.com.sankhya.extensions.eventoprogramavel.EventoProgramavelJava;
import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;
import br.com.sankhya.jape.event.PersistenceEvent;
import br.com.sankhya.jape.event.TransactionContext;
import br.srv.mgs.RequisicaoDeCompras.Controller.ProcessoComprasController;

public class GravarProcessoCompra  implements EventoProgramavelJava {


    ProcessoComprasController processoComprasController = new ProcessoComprasController();

    @Override
    public void beforeInsert(PersistenceEvent persistenceEvent) throws Exception {
        processoComprasController.beforeInsert(persistenceEvent);

    }

    @Override
    public void beforeUpdate(PersistenceEvent persistenceEvent) throws Exception {

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
