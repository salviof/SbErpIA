/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.ia.escopo;

/**
 *
 * @author desenvolvedorninja01
 */
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;
import com.super_bits.modulosSB.SBCore.modulos.erp.InfoApiERPCarameloCode;

@InfoApiERPCarameloCode(descricaoApi = "IA ERP", nomeApi = "IA", slugInicial = "IA")
public enum ERP_IA implements ItfApiErpSuperBits<ItfErpIA> {

    OLHAMA,
    DEEPSEEK,
    GPT,
    GEMINI,
    COPILOT,
    AZURE_OPENAI;

    @Override
    public Class<? extends ItfErpIA> getInterface() {
        return ItfErpIA.class;
    }

}
