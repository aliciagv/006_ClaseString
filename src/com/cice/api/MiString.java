
package com.cice.api;

/**
 *
 * @author Alicia
 */
public class MiString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String cadena="Mi cadena de caracteres";
        String cadena2= new String("Mi cadena de caracteres 2");
        
        int tamaño=cadena.length(); // nos devuelve el tamaño del string(número de caracteres)
        System.out.println(tamaño);
        
        //.charAt(int pos) -> devolvernos el caracter que hay en una posición dada (pos de 0 a lenght -1)
        char c= cadena.charAt(1);
        System.out.println(c);
        
        //.indexOf(String cadena), método sobrecargado -> posición de ese caracter o cadena
        //Si no encuentra devuelve -1
        String mail="test1@gmail.com";
        System.out.println(mail.indexOf("@"));
        System.out.println(mail.indexOf("#"));
        
        //.indexOf(String cad, int pos) -> dada la posición inicio buscara desde ahí el caracter dado
        //Si no encuentra devuelve - 1
        
        System.out.println(mail.indexOf("a", 5));
        System.out.println("La letra a se encuentra en " + mail.indexOf("a",9));
        
        //.lastIndexOf() -> La última posición de un caracter en una cadena
        System.out.println(mail + ": La letra t se encuentra en la última posición: "+ mail.lastIndexOf("t"));
        
        //.lastIndexOf(String cad,int pos) -> devuelve la últimoa posición de un caracter dada una posición inicial de busqueda
        //La búsqueda la realiza desde atrás
        // Si no se encuentra devuelve -1
        System.out.println(mail + " : La letra m se encuentra en la última posición: " + mail.lastIndexOf("m",10));
        
        //.substring(int pos1,int pos2) -> devuelve un string con el trozo de cadena comprendido entre la pos1 y pos2 -1
        System.out.println(mail +" Substring desde la posicion 5 a la 8: " +mail.substring(5, 8));
        
        System.out.println(mail+ " El correo es: "+ mail.substring(0,mail.indexOf("@")));
        
        //.split(String cadena) -> devolvemos un array con los trozos de  cadena resultantes de usar la cadena de entrada como separador`+
        
        String[] arr= cadena2.split(" ");
        for (String s: arr){
            System.out.println(s);
        }
        
        //.trim() > eliminar los espacios en blanco en una cadena de caracteres al inicio y al final.
        String nuevaCadena= "   Esto es una cadena con espacios en blanco    ";
        System.out.println(nuevaCadena);
        System.out.println(nuevaCadena.trim());
        
        //.replace(String cad1, String cad2) -> sustituir la cad1 por cad2
        System.out.println(nuevaCadena.trim().replace("a", "o"));
        
        //.valueOf(tipo primitivo valor) -> devolvemos un String
        String valor= String.valueOf(12345);
        System.out.println("valor =" + valor);
        
        //PARSEOS -> Clases de envoltura
        // int -> Integer
        //double -> Double 
        
        //de String a entero
        int numero = Integer.parseInt(valor);
        System.out.println(numero);
        double decimal =Double.parseDouble("123.32");
        System.out.println(decimal);
        
    }
    
}
