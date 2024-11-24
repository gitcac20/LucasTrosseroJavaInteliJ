package com.proyecto.java;

public class Policia {
    private String nombre;
    private String apellido;
    private String legajo;


    public Policia(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    @Override
    public String toString() {
        return "Policía [Nombre=" + nombre + ", Apellido=" + apellido + ", Legajo=" + legajo + "]";
    }
}
