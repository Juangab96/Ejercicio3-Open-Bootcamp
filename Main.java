package com.ejercicio;

//Ejercicio 1

public class Tema_3 {
    public static void main(String[] args) {

        int Numeros = Suma(5, 7, 8);
        System.out.println("La suma es: " + Numeros);

        public static int Suma ( int a, int b, int c){
            return a + b + c;
        }
    }

    //Ejercicio 2

    class Coche {
        public int numPuertas = 4;

        public void IncrementoPuertas() {
            this.numPuertas++;
        }
    }
        Coche miCoche = new Coche();

        miCoche.IncrementoPuertas();
        System.out.println("El número de puertas es: " + miCoche.numPuertas);

        miCoche.IncrementoPuertas();
        System.out.println("El número de puertas es: " + miCoche.numPuertas);
    }
}



