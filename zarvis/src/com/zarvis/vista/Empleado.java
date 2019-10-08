package com.zarvis.vista;

public class Empleado {

    //Atributos de la clase
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;
    private String fechaalta;
    private String fechabaja;
    private Actividad [] actividades;
    private CentroCivico centroCivico;

    //Constructores de la clase


    public Empleado(String dni, String nombre, String apellido, int edad, String cargo, String fechaalta, String fechabaja, CentroCivico centroCivico) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.fechaalta = fechaalta;
        this.fechabaja = fechabaja;
        this.centroCivico = centroCivico;
    }

   public Empleado(String dni, String nombre, String apellido, int edad, String cargo, String fechaalta, String fechabaja, Actividad[] actividades) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.fechaalta = fechaalta;
        this.fechabaja = fechabaja;
        this.actividades = actividades;
    }

    public Empleado(String dni) {
        this.dni = dni;
    }

    //Getter y Setter de la clase
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(String fechaalta) {
        this.fechaalta = fechaalta;
    }

    public String getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(String fechabaja) {
        this.fechabaja = fechabaja;
    }

   /* public Actividad[] getActividades() {
        return actividades;
    }

    public void setActividades(Actividad[] actividades) {
        this.actividades = actividades;
    }*/
}
