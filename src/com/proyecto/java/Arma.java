package com.proyecto.java;



    public abstract class Arma {
        private int cantidadMuniciones;
        private double alcance;
        private String marca;
        private int calibre;
        private String estado;
        public Arma(int cantidadMuniciones, double alcance, String marca, int calibre, String estado) {
            this.cantidadMuniciones = cantidadMuniciones;
            this.alcance = alcance;
            this.marca = marca;
            this.calibre = calibre;
            this.estado = estado;
        }


        public boolean enCondicion() {
            return this.estado.equals("EN USO") && this.calibre >= 9;
        }


        public int getCantidadMuniciones() { return cantidadMuniciones; }
        public double getAlcance() { return alcance; }
        public String getMarca() { return marca; }
        public int getCalibre() { return calibre; }
        public String getEstado() { return estado; }
    }



