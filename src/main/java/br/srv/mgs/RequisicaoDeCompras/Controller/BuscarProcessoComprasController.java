package br.srv.mgs.RequisicaoDeCompras.Controller;

import br.com.sankhya.jape.event.PersistenceEvent;
import br.com.sankhya.jape.vo.DynamicVO;
import br.srv.mgs.RequisicaoDeCompras.Model.ProcessoComprasModel;

public class BuscarProcessoComprasController {
    ProcessoComprasModel processoComprasModel = new ProcessoComprasModel();



    public void inicializaAtributos(PersistenceEvent persistenceEvent) throws Exception {
        DynamicVO vo = (DynamicVO) persistenceEvent.getVo();
        processoComprasModel.setVo(vo);


    }
}
