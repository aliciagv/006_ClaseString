/*
 *Dada una cadena, debe de contabilizar el número de vocales que contiene
 */
package com.cice.ejercicios;

/**
 *
 * @author Alicia
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "Esta es una cadena de caracteres";
        cadena= cadena.toLowerCase();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++; // contador= contador +1 ó contador +=1;
                    break;

            }
        }
        System.out.println("En el string aparacen " + contador + " vocales");
    }

}
