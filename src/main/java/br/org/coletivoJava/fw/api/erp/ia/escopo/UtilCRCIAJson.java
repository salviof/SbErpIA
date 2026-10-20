/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.ia.escopo;

/**
 *
 * @author salvio
 */
public class UtilCRCIAJson {

    /**
     * Cada propriedade é um par {nome, definição JSON}.
     */
    public static String formato(String[]... pPropriedades) {
        return "{\"type\":\"json_schema\",\"schema\":" + objeto(pPropriedades) + "}";
    }

    public static String objeto(String[]... pPropriedades) {
        StringBuilder propriedades = new StringBuilder();
        StringBuilder obrigatorias = new StringBuilder();
        for (String[] propriedade : pPropriedades) {
            if (propriedades.length() > 0) {
                propriedades.append(",");
                obrigatorias.append(",");
            }
            propriedades.append("\"").append(propriedade[0]).append("\":").append(propriedade[1]);
            obrigatorias.append("\"").append(propriedade[0]).append("\"");
        }
        return "{\"type\":\"object\",\"properties\":{" + propriedades
                + "},\"required\":[" + obrigatorias + "],\"additionalProperties\":false}";
    }

    public static String[] texto(String pNome) {
        return new String[]{pNome, "{\"type\":\"string\"}"};
    }

    public static String[] listaTexto(String pNome) {
        return new String[]{pNome, "{\"type\":\"array\",\"items\":{\"type\":\"string\"}}"};
    }

    public static String[] listaObjetos(String pNome, String[]... pPropriedades) {
        return new String[]{pNome, "{\"type\":\"array\",\"items\":" + objeto(pPropriedades) + "}"};
    }

}
