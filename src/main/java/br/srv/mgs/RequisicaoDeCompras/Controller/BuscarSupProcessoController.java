package br.srv.mgs.RequisicaoDeCompras.Controller;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.jape.event.PersistenceEvent;
import br.com.sankhya.jape.vo.DynamicVO;
import br.srv.mgs.RequisicaoDeCompras.Model.MateriaisEServicosModel;

public class BuscarSupProcessoController {

    MateriaisEServicosModel model = new MateriaisEServicosModel();
    public void beforeInsert(PersistenceEvent persistenceEvent) throws Exception {
        inicializaAtributos(persistenceEvent);



    }
    public void executar(ContextoTarefa contextoTarefa){
        inicializaAtributos(contextoTarefa);
    }




    private void inicializaAtributos(PersistenceEvent persistenceEvent) throws Exception {
        DynamicVO vo = (DynamicVO) persistenceEvent.getVo();
        model.setVo(vo);
    }
    private void inicializaAtributos(ContextoTarefa contextoTarefa){
        //desenvolver
    }




}
