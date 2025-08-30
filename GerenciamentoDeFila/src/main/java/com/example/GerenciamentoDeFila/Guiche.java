package com.example.GerenciamentoDeFila;

public class Guiche {
    private final int numero;
    private GuicheStatus status;

     public Guiche(int numero){
         this.numero = numero;
         this.status = GuicheStatus.OFFLINE;
     }

     public GuicheStatus getStatus(){
         return status;
     }

     public int getNumero(){
         return numero;
     }

     public void setStatus(GuicheStatus status){
         this.status = status;
     }
}
