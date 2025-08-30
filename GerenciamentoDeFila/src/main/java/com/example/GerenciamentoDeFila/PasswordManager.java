package com.example.GerenciamentoDeFila;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PasswordManager {
    private final AtomicInteger novaSenha = new AtomicInteger(1);
    private final AtomicInteger senhaPrioritaria= new AtomicInteger(1);


    private final LinkedList<PasswordInfo> ultimasSenhas = new LinkedList<>();
    private static final int MAX_HISTORICO = 5;

    public PasswordInfo ProximaSenhaNormal() {

        return new PasswordInfo(novaSenha.getAndIncrement(), "", 0);
    }

    public PasswordInfo proximaSenhaPrioritaria() {

        return new PasswordInfo(senhaPrioritaria.getAndIncrement(), "P", 0);
    }

    public void adicionarAoHistorico(PasswordInfo senha){
        ultimasSenhas.addFirst(senha);
        if(ultimasSenhas.size()>MAX_HISTORICO){
            ultimasSenhas.removeLast();
        }
    }

    public List<PasswordInfo> getUltimasSenha() {
        return ultimasSenhas;
    }
}
