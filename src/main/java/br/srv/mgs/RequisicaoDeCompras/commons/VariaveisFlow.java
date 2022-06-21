package br.srv.mgs.RequisicaoDeCompras.commons;
import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.JapeWrapper;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;
import br.com.sankhya.jape.wrapper.fluid.FluidUpdateVO;

import java.math.BigDecimal;
import java.util.Collection;

public class VariaveisFlow {
    public static Object getVariavel(BigDecimal idInstanciaProcesso, String nome) throws Exception {
        JapeWrapper instanciaVariavelDAO = JapeFactory.dao("InstanciaVariavel");
        Collection<DynamicVO> dynamicVOS = instanciaVariavelDAO.find("IDINSTPRN = ? AND NOME = ? ", idInstanciaProcesso, nome);
        if (!dynamicVOS.isEmpty()) {
            DynamicVO vo = dynamicVOS.iterator().next();
            switch (vo.asString("TIPO")) {
                case "S":
                case "L":
                case "W":
                    return vo.asString("TEXTO");
                case "I":
                    return vo.asBigDecimal("NUMINT");
                case "F":
                    return vo.asBigDecimal("NUMDEC");
                case "D":
                case "H":
                    return vo.asTimestamp("DTA");
                case "C":
                    return vo.asString("TEXTOLONGO");
                default:
                    return null;
            }
        }
        return null;
    }

    public static void setVariavel(BigDecimal idInstanciaProcesso,BigDecimal  idInstanciaTarefa, String nome,Object variavel) throws Exception{
        JapeWrapper instanciaVariavelDAO = JapeFactory.dao("InstanciaVariavel");//TWFIVAR
        DynamicVO dynamicVO = instanciaVariavelDAO.findOne("IDINSTPRN = ? AND NOME = ? ", idInstanciaProcesso, nome);
        if (dynamicVO == null){
            JapeWrapper instanciaProcessoDAO = JapeFactory.dao("InstanciaProcesso");//TWFIPRN
            JapeWrapper elementoProcessoDAO = JapeFactory.dao("ElementoProcesso");//TWFELE
            JapeWrapper variavelProcessoDAO = JapeFactory.dao("VariavelProcesso");//TWFVAR


            DynamicVO instanciaProcessoVO = instanciaProcessoDAO.findByPK(idInstanciaProcesso);
            DynamicVO elementoProcessoVO = elementoProcessoDAO.findOne("TIPO = 'P' AND CODPRN = ? AND VERSAO = ?",
                    instanciaProcessoVO.asBigDecimal("CODPRN"),
                    instanciaProcessoVO.asBigDecimal("VERSAO"));
            DynamicVO variavelProcessoVO = variavelProcessoDAO.findOne("NUELE = ? AND NOME = ?",
                    elementoProcessoVO.asBigDecimal("NUELE"),
                    nome);


            FluidCreateVO fluidCreateVO = instanciaVariavelDAO.create();
            fluidCreateVO.set("IDINSTPRN",idInstanciaProcesso);
            fluidCreateVO.set("IDINSTTAR",idInstanciaTarefa);
            fluidCreateVO.set("NOME",nome);
            fluidCreateVO.set("TIPO",variavelProcessoVO.asString("TIPO"));
            dynamicVO = fluidCreateVO.save();

        }
        dynamicVO.asString("TIPO");
        FluidUpdateVO fluidUpdateVO = instanciaVariavelDAO.prepareToUpdate(dynamicVO);

        switch (dynamicVO.asString("TIPO")) {
            case "S":
            case "L":
            case "W":
                fluidUpdateVO.set("TEXTO",variavel);
                break;
            case "I":
                fluidUpdateVO.set("NUMINT",variavel);
                break;
            case "F":
                fluidUpdateVO.set("NUMDEC",variavel);
                break;
            case "D":
            case "H":
                fluidUpdateVO.set("DTA",variavel);
                break;
            case "C":
                fluidUpdateVO.set("TEXTOLONGO",variavel);
                break;
        }
        fluidUpdateVO.update();
    }
}
