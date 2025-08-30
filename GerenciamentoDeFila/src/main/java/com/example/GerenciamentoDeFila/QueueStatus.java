package com.example.GerenciamentoDeFila;

import java.util.List;

public class QueueStatus {

    private final PasswordInfo currentPassword;
    private final List<PasswordInfo> lastPasswords;


    public QueueStatus(PasswordInfo currentPassword, List<PasswordInfo> lastPasswords){
        this.currentPassword = currentPassword;
        this.lastPasswords = lastPasswords;
    }

    public PasswordInfo getCurrentPassword() {
        return currentPassword;
    }

    public List<PasswordInfo> getLastPasswords() {
        return lastPasswords;
    }
}
