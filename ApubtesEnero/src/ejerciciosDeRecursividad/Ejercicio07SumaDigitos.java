package ejerciciosDeRecursividad;

public class Ejercicio07SumaDigitos {

/*Sumar dígitos de un número
Escribe una función recursiva que sume los dígitos de un número.
Ejemplo: sumaDigitos(123) = 1 + 2 + 3 = 6. */

    
public static void main(String[] args) {
    
    System.out.println(sumaDigitos(123));
}

public static int sumaDigitos (int n){

if (n==0) return 0;
return n%10 + sumaDigitos(n/10); // se usa para hacer la resta de una divison entre 10, con ellos siempre va cortando la ultima sifra.
                                 // estudiar la funcion de modulo es muy importante.
}

}
