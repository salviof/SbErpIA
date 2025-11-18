/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.ia.escopo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

import java.util.List;

/**
 * @author salvio
 */
public interface ItfPersona extends ComoEntidadeSimples {

    public String getDescricao();

    public void setDescricao(String descricao);

    public String getTonalidade();

    public void setTonalidade(String tonalidade);

    public String getObjetivo();

    public void setObjetivo(String objetivo);

    public String getRegrasResposta();

    public void setRegrasResposta(String regrasResposta);

    public int getLimitePalavras();

    public void setLimitePalavras(int limitePalavras);

    public String getContexto();

    public void setContexto(String contexto);

    public String getInstrucoesAdicionais();

    public void setInstrucoesAdicionais(String instrucoesAdicionais);

    public String getTipoPersona();

    public void setTipoPersona(String tipoPersona);

    public String getPublicoAlvo();

    public void setPublicoAlvo(String publicoAlvo);

    public String getIdioma();

    public void setIdioma(String idioma);

    public String getTipoRespostasPadrao();

    public void setTipoRespostasPadrao(String tipoRespostasPadrao);

    public String getPalavrasProibidas();

    public void setPalavrasProibidas(String palavrasProibidas);

    public boolean isStatus();

    public void setStatus(boolean status);

    public String getTextoModelFileIA();

    public void setTextoModelFileIA(String textoModelFileIA);

}
