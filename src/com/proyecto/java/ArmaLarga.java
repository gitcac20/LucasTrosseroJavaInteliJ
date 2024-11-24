package com.proyecto.java;
public class ArmaLarga extends Arma implements Comparable<ArmaLarga> {
    private String justificativoUso;
    private int nivelArma; // Nivel del 1 al 5
    private boolean tieneSello; // Si tiene sello del RENAR

    public ArmaLarga(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, String justificativoUso, int nivelArma, boolean tieneSello) {
        super(cantidadMuniciones, alcance, marca, calibre, estado);
        this.justificativoUso = justificativoUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }

    @Override
    public int compareTo(ArmaLarga otraArma) {
        return Integer.compare(this.nivelArma, otraArma.nivelArma); // Comparar por nivel
    }

    @Override
    public String toString() {
        return "Arma Larga [Marca=" + getMarca() + ", Calibre=" + getCalibre() + ", Estado=" + getEstado() +
                ", Alcance=" + getAlcance() + ", Municiones=" + getCantidadMuniciones() + ", Justificativo de Uso=" + justificativoUso +
                ", Nivel=" + nivelArma + ", Tiene Sello RENAR=" + tieneSello + "]";
    }

    // Getters y Setters
    public String getJustificativoUso() { return justificativoUso; }
    public int getNivelArma() { return nivelArma; }
    public boolean isTieneSello() { return tieneSello; }
}

