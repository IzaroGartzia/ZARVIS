package com.zarvis.vista;

public class Actividad {

    //Atributos de las clase
    private int id;
    private String nombre;
    private Cliente[] clientes = new Cliente[10];
    private double precio;
    private String dia;
    private String hora;
    private CentroCivico centroCivico;
    private Empleado empleado;

    //Constructor Actividad completo


    public Actividad(int id, String nombre, Cliente[] clientes, double precio, String dia, String hora, CentroCivico centroCivico, Empleado empleado) {
        this.id = id;
        this.nombre = nombre;
        this.clientes = clientes;
        this.precio = precio;
        this.dia = dia;
        this.hora = hora;
        this.centroCivico = centroCivico;
        this.empleado = empleado;
    }

    //Contructor Actividad sin array de clientes
    public Actividad(int id, String nombre, double precio, String dia, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.dia = dia;
        this.hora = hora;
    }


    public int getId() {
        return id;
    }

    public Actividad(int id) {
        this.id = id;
    }

    //Getter y setter de casi todo
    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    //Getter de nombre solo metodo de lectura.
    public String getNombre() {
        return nombre;
    }
}
