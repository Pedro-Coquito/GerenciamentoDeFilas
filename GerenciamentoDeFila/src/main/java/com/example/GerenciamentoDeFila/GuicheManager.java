package com.example.GerenciamentoDeFila;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class GuicheManager{


    private final Map<Integer, Guiche> guiches = new ConcurrentHashMap<>();
    private static final int TOTAL_GUICHE = 10;

    @PostConstruct
    public void init(){
        IntStream.rangeClosed(1, TOTAL_GUICHE).forEach(i -> guiches.put(i, new Guiche(i)));
    }

    public Guiche setStatus(int numero, GuicheStatus status){
        Guiche guiche = guiches.get(numero);
        if(guiche !=null){
            guiche.setStatus(status);
            return guiche;
        }
        return null;
    }

    public List<Guiche> getTodosGuiches(){
        return guiches.values().stream().sorted((g1, g2) -> Integer.compare(g1.getNumero(), g2.getNumero())).collect(Collectors.toList());
    }
}