package com.zarvis.vista;

public class Usuario {
    private String id;
    private String password;

    public Usuario(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
