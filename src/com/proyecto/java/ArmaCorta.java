package com.proyecto.java;
public class ArmaCorta extends Arma {
    private boolean esAutomatica; // Si es automática

    public ArmaCorta(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(cantidadMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    // Método para verificar si el arma puede disparar a más de 200m
    public boolean efectividad() {
        return getAlcance() > 200;
    }

    public boolean isEsAutomatica() { return esAutomatica; }

    @Override
    public String toString() {
        return "Arma Corta [Marca=" + getMarca() + ", Calibre=" + getCalibre() + ", Estado=" + getEstado() +
                ", Alcance=" + getAlcance() + ", Municiones=" + getCantidadMuniciones() + ", Automática=" + esAutomatica + "]";
    }
}



