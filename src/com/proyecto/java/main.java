package com.proyecto.java;

public class main {
    public static void main(String[] args) {


        Policia policia = new Policia("Juan", "Pérez", "12345");


        ArmaCorta armaCorta = new ArmaCorta(15, 250, "Glock", 9, "EN USO", true);


        if (armaCorta.enCondicion()) {
            System.out.println("El arma está en condiciones de ser usada.");
        } else {
            System.out.println("El arma no está en condiciones de ser usada.");
        }


        ArmaLarga armaLarga = new ArmaLarga(30, 500, "Rifle", 12, "EN USO", "Defensa Nacional", 5, true);


        ArmaLarga otraArmaLarga = new ArmaLarga(30, 600, "Rifle", 12, "EN USO", "Defensa Nacional", 3, true);
        int comparacion = armaLarga.compareTo(otraArmaLarga);
        if (comparacion > 0) {
            System.out.println("El arma larga 1 es más potente que el arma larga 2.");
        } else if (comparacion < 0) {
            System.out.println("El arma larga 2 es más potente que el arma larga 1.");
        } else {
            System.out.println("Las dos armas largas son iguales en nivel.");
        }
    }
}































