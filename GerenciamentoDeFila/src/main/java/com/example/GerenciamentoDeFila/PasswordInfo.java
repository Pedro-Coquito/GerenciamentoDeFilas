package com.example.GerenciamentoDeFila;



public class PasswordInfo {

    private final int number;
    private final String counter;
    private final int guicheNumber;

    public PasswordInfo(int number, String counter, int guicheNumber) {
        this.number = number;
        this.counter = counter;
        this.guicheNumber = guicheNumber;
    }

    public int getNumber() {
        return number;
    }

    public String getCounter() {
        return counter;
    }

    public int getGuicheNumber(){
        return guicheNumber;
    }
}

