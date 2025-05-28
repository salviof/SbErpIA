/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.ia;

/**
 *
 * @author desenvolvedorninja01
 */
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

@ApiERPColetivoJavaFW(descricaoApi = "IA ERP", nomeApi = "IA", slugInicial = "IA")
public enum ERPIA implements ItfApiErpSuperBits<ItfErpIA> {

    OLHAMA,
    DEEPSEEK,
    GPT,
    GEMINI,
    COPILOT;

    @Override
    public Class<? extends ItfErpIA> getInterface() {
        return ItfErpIA.class;
    }

}
