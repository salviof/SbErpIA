/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.ia;

import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ItfFabConfigModulo;

/**
 *
 * @author salvio
 */
public enum FabConfigErpIA implements ItfFabConfigModulo {

    NOME_MODELO_PERSONA_PADRAO;

    @Override
    public String getValorPadrao() {
        switch (this) {
            case NOME_MODELO_PERSONA_PADRAO:
                return "não definido";

            default:
                throw new AssertionError(this.name());

        }
    }
}
