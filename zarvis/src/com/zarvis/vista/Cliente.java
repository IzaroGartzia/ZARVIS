package com.zarvis.vista;

public class Cliente {

    //Atributo de las clases
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;
    private String profesion;
    private String fechaalta;
    private String fechabaja;
    private Actividad[]actividades;
    private Sancion [] sanciones;
    private CentroCivico [] centroCivicos;


    public Cliente(String dni, String nombre, String apellido, int edad, String cargo, String profesion, String fechaalta, String fechabaja, Actividad[] actividades, CentroCivico[]centroCivicos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.profesion = profesion;
        this.fechaalta = fechaalta;
        this.fechabaja = fechabaja;
        this.actividades = actividades;
        this.centroCivicos = centroCivicos;
    }

    public Cliente(String dni, String nombre, String apellido, int edad, String cargo, String profesion, String fechaalta, String fechabaja, Actividad[] actividades, Sancion[] sanciones,CentroCivico[]centroCivicos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.profesion = profesion;
        this.fechaalta = fechaalta;
        this.fechabaja = fechabaja;
        this.actividades = actividades;
        this.sanciones = sanciones;
        this.centroCivicos = centroCivicos;
    }

    public Cliente(String dni, String nombre, String apellido, int edad, String cargo, String profesion, String fechaalta, String fechabaja) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.profesion = profesion;
        this.fechaalta = fechaalta;
        this.fechabaja = fechabaja;
    }

    public Cliente(String dni) {
        this.dni = dni;
    }

    public Cliente() {
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
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

    public Actividad[] getActividades() {
        return actividades;
    }

    public void setActividades(Actividad[] actividades) {
        this.actividades = actividades;
    }

    public Sancion[] getSanciones() {
        return sanciones;
    }

    public void setSanciones(Sancion[] sanciones) {
        this.sanciones = sanciones;
    }

    public CentroCivico[] getCentroCivicos() {
        return centroCivicos;
    }

    public void setCentroCivicos(CentroCivico[] centroCivicos) {
        this.centroCivicos = centroCivicos;
    }
}
