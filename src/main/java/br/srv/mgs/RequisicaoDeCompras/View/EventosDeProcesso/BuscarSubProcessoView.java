package br.srv.mgs.RequisicaoDeCompras.View.EventosDeProcesso;

import br.com.sankhya.extensions.eventoprogramavel.EventoProgramavelJava;
import br.com.sankhya.extensions.flow.ContextoEvento;
import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.EventoProcessoJava;
import br.com.sankhya.extensions.flow.TarefaJava;
import br.srv.mgs.RequisicaoDeCompras.Controller.BuscarSupProcessoController;

public class BuscarSubProcessoView implements TarefaJava {
    private BuscarSupProcessoController controller = new BuscarSupProcessoController();

    public BuscarSubProcessoView(BuscarSupProcessoController controller) {
        this.controller = controller;
    }

    public BuscarSubProcessoView() {
    }

    public BuscarSupProcessoController getController() {
        return controller;
    }

    public void setController(BuscarSupProcessoController controller) {
        this.controller = controller;
    }

    @Override
    public void executar(ContextoTarefa contextoTarefa) throws Exception {
       //desenvolver


    }


}
