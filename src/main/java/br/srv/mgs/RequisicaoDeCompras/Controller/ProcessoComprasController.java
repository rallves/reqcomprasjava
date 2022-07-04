package br.srv.mgs.RequisicaoDeCompras.Controller;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.jape.event.PersistenceEvent;
import br.com.sankhya.jape.vo.DynamicVO;
import br.srv.mgs.RequisicaoDeCompras.Model.ProcessoComprasModel;

public class ProcessoComprasController {
    ProcessoComprasModel processoComprasModel = new ProcessoComprasModel();


    public void executar(ContextoTarefa contextoTarefa) throws Exception {
        inicializaAtributos(contextoTarefa);

    }
    public void inicializaAtributos(ContextoTarefa contextoTarefa) throws Exception {
        processoComprasModel.setAtributos(contextoTarefa);
        processoComprasModel.gravarProcessoCompra();
    }

}
