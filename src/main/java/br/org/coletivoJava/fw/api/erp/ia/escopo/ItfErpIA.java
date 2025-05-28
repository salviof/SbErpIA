/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.ia.escopo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

/**
 *
 * @author salvio
 */
public interface ItfErpIA {

    public boolean personaCriarAtualizar(ItfPersona pPersona);

    public String obterResposta(ItfPersona persona, ItfUsuario pUSuario, String texto);

    public String obterResposta(ItfUsuario pUSuario, String texto);

    public String obterRespostaUsuarioLogado(String texto);

    public String obterRespostaUsuarioLogado(ItfPersona persona, String texto);

}
