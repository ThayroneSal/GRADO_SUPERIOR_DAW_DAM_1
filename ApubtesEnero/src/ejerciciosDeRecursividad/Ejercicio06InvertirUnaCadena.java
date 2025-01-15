package ejerciciosDeRecursividad;

public class Ejercicio06InvertirUnaCadena {

    /*Invertir una cadena
Escribe una función recursiva que invierta una cadena de texto.
Ejemplo: invertir("recursivo") → "ovisrucer". */

public static void main(String[] args) {
    
    String cadena = "recursivo";
    String resultado = invertido(cadena);
    System.out.println("La frase recursivo al reves es: " + resultado);

}

public static String invertido (String str){
 if (str.isEmpty()){
    
 }
 return str;

 //Función charAt en Java se utiliza para devolver el carácter en un índice específico de una cadena.
 //Puedes utilizarla de la siguiente manera: char ch = str.charAt(1);donde strestá tu cadena y 1es el índice
 // del carácter al que quieres acceder.

 //preguntar a Andres si puede explicar lo del charAt o lo vamos a ver mas adelante.
}

}
