/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.ia.escopo;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfRespostaAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

/**
 * @author salvio
 */
public interface ItfErpIA {

    public ItfPersona gerarPersona(String pNomePersona, String pPromptSystem);

    public String obterResposta(ItfPersona pNomePersona, ItfUsuario pUsuario, String pMensagem);

    public String obterRespostaUsuarioLogado(ItfPersona pNomePersona, String pMensagem);

    public String limparSessao(ItfPersona pNomePersona, ItfUsuario pUsuario);

    public String limparSessaoUsuarioLogado(ItfPersona pNomePersona);



}
