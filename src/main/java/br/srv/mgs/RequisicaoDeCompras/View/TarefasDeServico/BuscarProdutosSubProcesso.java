package br.srv.mgs.RequisicaoDeCompras.View.TarefasDeServico;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;

import java.math.BigDecimal;
import java.util.Collection;

public class BuscarProdutosSubProcesso implements TarefaJava {
    @Override
    public void executar(ContextoTarefa contextoTarefa) throws Exception {




        BigDecimal idinstprn_prc =  new BigDecimal(String.valueOf(contextoTarefa.getCampo("IDINSTPRN_PRC")));


        JapeWrapper ad_cmpprodsDAO = JapeFactory.dao("AD_CMPPRODS");
        Collection<DynamicVO> vos = ad_cmpprodsDAO.find("IDINSTPRN = ?", idinstprn_prc);

            for (DynamicVO vo : vos) {
                FluidCreateVO ad_cmpprodsFCVO = ad_cmpprodsDAO.create();

                ad_cmpprodsFCVO.set("IDINSTPRN", new BigDecimal(contextoTarefa.getIdInstanceProcesso().toString()));
                ad_cmpprodsFCVO.set("IDINSTTAR", new BigDecimal(0));
                //diariaAcvFCVO.set("CODREGISTRO", codregistro);
                ad_cmpprodsFCVO.set("IDTAREFA", "UserTask_198zqu7");
                ad_cmpprodsFCVO.set("CODPROD", vo.asBigDecimal("CODPROD"));
                ad_cmpprodsFCVO.set("QTD", vo.asBigDecimal("QTD"));
                ad_cmpprodsFCVO.set("UNID", vo.asString("UNID"));
                ad_cmpprodsFCVO.set("VLRMD", vo.asBigDecimal("VLRMD"));
                ad_cmpprodsFCVO.set("ARQORC", vo.asBlob("ARQORC"));
                ad_cmpprodsFCVO.set("ARQMPRC", vo.asBlob("ARQMPRC"));
                ad_cmpprodsFCVO.set("CODPARC", vo.asBigDecimal("CODPARC"));
                ad_cmpprodsFCVO.set("CONTROLE", vo.asString("CONTROLE"));
                ad_cmpprodsFCVO.set("CODLOCALPD", vo.asBigDecimal("CODLOCALPD"));

                ad_cmpprodsFCVO.save();

            }












    }
}
