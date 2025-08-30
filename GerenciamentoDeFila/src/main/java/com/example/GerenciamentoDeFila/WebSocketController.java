package com.example.GerenciamentoDeFila;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.MessageMapping;

import java.util.Map;
import java.util.List;

@Controller
public class WebSocketController {

    private final PasswordManager passwordManager;
    private final GuicheManager guicheManager;
    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WebSocketController(PasswordManager passwordManager, GuicheManager guicheManager, SimpMessagingTemplate messagingTemplate) {
        this.guicheManager = guicheManager;
        this.messagingTemplate = messagingTemplate;
        this.passwordManager = passwordManager;
    }

    @MessageMapping("/guiche/login")
    public void login(@Payload Map<String, Integer> payload) {
        int guicheNumero = payload.get("guicheId");
        guicheManager.setStatus(guicheNumero, GuicheStatus.LIVRE);
        broadcastGuicheStatus();
    }


    @MessageMapping("/guiche/finish")
    public void finish(@Payload Map<String, Integer> payload) {
        int guicheNumero = payload.get("guicheId");
        guicheManager.setStatus(guicheNumero, GuicheStatus.LIVRE);
        broadcastGuicheStatus();
    }

    @MessageMapping("/call-normal")
    public void chamarSenhaNormal(@Payload Map<String, Integer> payload) {
        chamarSenha(passwordManager.ProximaSenhaNormal(), payload.get("guicheId"));

    }

    @MessageMapping("/call-prioritario")
    public void chamarSenhaPrioritario(@Payload Map<String, Integer> payload) {

        chamarSenha(passwordManager.proximaSenhaPrioritaria(), payload.get("guicheId"));

    }

    private void chamarSenha(PasswordInfo proximaSenhaBase, int guicheNumero) {
        List<PasswordInfo> history = passwordManager.getUltimasSenha();
        PasswordInfo proxima = new PasswordInfo(proximaSenhaBase.getNumber(), proximaSenhaBase.getCounter(), guicheNumero);
        passwordManager.adicionarAoHistorico(proxima);

        messagingTemplate.convertAndSend("/topic/passwords", new QueueStatus(proxima, history));
        broadcastGuicheStatus();


    }

    private void broadcastGuicheStatus(){
        messagingTemplate.convertAndSend("/topic/guiche-status", guicheManager.getTodosGuiches());
    }


}
    