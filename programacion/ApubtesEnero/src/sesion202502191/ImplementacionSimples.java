package sesion202502191;

interface Sonido { /* Interfaz no me deja definir el metodo */ /*se implementa el metodo */
    void hacerSonido();
}
interface Subir {
    void subirArbol();

}
class Gato implements Sonido, Subir { /* Se implementa la interfaz */
    public void hacerSonido(){
        System.out.println("Miau");
    }
    public void subirArbol(){
        System.out.println("Sube árboles.");
    }
}

class Perro implements Sonido { 
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class ImplementacionSimples { /* Clase principal */
    public static void main(String[] args) {
        Sonido garfield = new Gato();
        Sonido patan = new Perro();
        System.out.print("Garfield hace ");
        garfield.hacerSonido();
        if (garfield instanceof Subir){
            ((Subir) garfield).subirArbol(); /* Se usa un Casting para llamar subir porque grafild lo definimos en sanido */
        }
        garfield.hacerSonido();
        System.out.print("Patán hace (de vez en cuando) ");
        patan.hacerSonido();

    }
}

