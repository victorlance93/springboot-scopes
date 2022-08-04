package com.sprinbootscopes.springbootscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    private Remetente noreplay;

    private Remetente techTeam;
    @Autowired
    public void enviarConfirmacaoCadastro(){
        System.out.println(noreplay);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("tech@lance.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-vindo á Tech Elite");
    }
}
