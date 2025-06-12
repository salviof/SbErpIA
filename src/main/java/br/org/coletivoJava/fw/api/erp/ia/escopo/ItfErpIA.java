/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.ia.escopo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

import javax.annotation.Nullable;

/**
 * @author salvio
 */
public interface ItfErpIA {

    public String gerarPersona(String pNomePersona, String pPromptSystem, @Nullable String template, @Nullable Double temperature, @Nullable Boolean stream, @Nullable String quantize);

    public String obterResposta(ItfPersona pNomePersona, ItfUsuario pUsuario, String pMensagem);

    public String obterRespostaUsuarioLogado(ItfPersona pNomePersona, String pMensagem);

    public String limparSessao(ItfPersona pNomePersona, ItfUsuario pUsuario) throws Exception;

    public String limparSessaoUsuarioLogado(ItfPersona pNomePersona);

}
