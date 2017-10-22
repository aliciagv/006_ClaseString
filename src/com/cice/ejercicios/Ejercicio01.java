/*
 *Dado un array de strings, vamos a mostrar por consola la cadena de mayor número de caracteres.
 * String[] cadenas={"java Duke Nuke", "Esto es una cadena de gran longitud"}
 */
package com.cice.ejercicios;

/**
 *
 * @author Alicia
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cadenas = {"java Duke Nuke", "Esto es una cadena de gran longitud", "Esto es otra cadena"};
        String cadena = null;
        int longitud = 0;
        for (String cad : cadenas) {
            if (cadena == null) {
                cadena = cad;
                longitud = cadena.length();
            } else if (longitud < cad.length()) {
                cadena = cad;
                longitud = cadena.length();
            }
          
        }
        System.out.println("La cadena más larga es: " + cadena + " con longitud: " + longitud );
    }

}
