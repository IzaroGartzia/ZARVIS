package com.zarvis.vista;

public class CentroCivico {

    private int id;
    public String name;
    private Actividad[]actividades;
    private Empleado[]empleados;
    private Cliente[]clientes;

    public CentroCivico(int id, String name, Actividad[] actividades, Empleado[] empleados, Cliente[] clientes) {
        this.id = id;
        this.name = name;
        this.actividades = actividades;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    public CentroCivico(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CentroCivico(int id) {
        this.id = id;
    }

    public CentroCivico() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actividad[] getActividades() {
        return actividades;
    }

    public void setActividades(Actividad[] actividades) {
        this.actividades = actividades;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getId() {
        return id;
    }
}
