package com.zarvis.vista;

public class Usuario {
    private String id;
    private String password;
    private int tipo;

    public Usuario(String id, String password, int tipo) {
        this.id = id;
        this.password = password;
        this.tipo = tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
