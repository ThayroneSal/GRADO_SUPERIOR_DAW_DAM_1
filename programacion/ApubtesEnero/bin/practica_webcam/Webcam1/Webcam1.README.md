package practica_webcam.Webcam;

# Creamo la clase `WEBCAM`

public class Webcam {

 ## Atributos

private String resolucion;
private int fps;
private boolean encendida;
private double tamanoArchivo;

## Constructor

public Webcam(String resolucion, int fps){
    this.resolucion=resolucion;
    this.fps=fps;
    this.encendida=false; // camera apagada por defecto.
    this.tamanoArchivo=0.0;
    }

 ## Getters y Setters

#public String getResolucion(){
    return resolucion;
    }

## Modifica resolucion


 public void setResolucion(String resolucion){
    this.resolucion=resolucion;
    }

## retorna fps

public int getFps(){
    return fps;
    }

 ## Modifica fps

public void setFps(int fps){
    this.fps=fps;
    }

## Retorna encendida

public boolean getEncendida(){
    return encendida;
    }

## Modifica encendida

public void setEncendida(boolean encendida){
    this.encendida=encendida;
    }

## Retorna tamanoArchivo

public double getTamanoArchivo(){
    return tamanoArchivo;
    }

## Modifica tamanoArchivo

public void setTamanoArchivo(double tamanoArchivo){
    this.tamanoArchivo=tamanoArchivo;
    }

## metodo para encender la camera

    public void encender(){
        this.encendida=true;
        System.out.println("La camera esta encendida");
    }

## Metodo para apagar la camera

    public void apagar(){
        this.encendida=false;
        System.out.println("La camera esta apagada");
    }

## Metodo para tomar una foto

    public String tomarFoto() {
        if (encendida) {
            double ancho = Integer.parseInt(resolucion.split("x")[0]);
            double alto = Integer.parseInt(resolucion.split("x")[1]);
            tamanoArchivo = (ancho * alto * fps) / 1000000.0;
            System.out.println( "Foto tomada con resolución " + resolucion + " y tamaño estimado de " + tamanoArchivo + " MB.");
        }
        else {
            System.out.println("La cámara está apagada. Enciéndela para tomar una foto.");
        }
        return null;
    }

# METODOS EXTRA

## Cambia la resolución de la cámara

      public void cambiarResolucion(String nuevaResolucion) {
        this.resolucion = nuevaResolucion;
        System.out.println("\n Resolución cambiada a: " + nuevaResolucion);
    }

## Calcula el consumo de datos en una videollamada

    public double calcularConsumoDatos(int tiempoSegundos) {
        String[] partes = resolucion.split("x");
        int ancho = Integer.parseInt(partes[0]);
        int alto = Integer.parseInt(partes[1]);


### Fórmula: (ancho * alto * fps * tiempoSegundos) / 1000000.0

        double consumo = (ancho * alto * fps * tiempoSegundos) / 1000000.0;
        return consumo;
    }

# Método principal Main

    public static void main(String[] args) {

## Crear una instancia de Webcam con una resolución de "1920x1080" y 30 FPS.
 
        Webcam miWebcam = new Webcam ("1920x1080", 30);

## Intentar tomar una foto con la cámara apagada

        System.out.println("\n Intentando tomar una foto con la cámara apagada:");
        miWebcam.apagar();
        miWebcam.tomarFoto();

## Encender la cámara y tomar una foto

        System.out.println("\n Encendiendo la cámara y tomo una foto:");
        miWebcam.encender();
        miWebcam.tomarFoto();

## Apagar la cámara

        System.out.println("\n Apagando la cámara:");
        miWebcam.apagar();

## EXTRA - cambia la resolución

        miWebcam.cambiarResolucion("1280x720");
        miWebcam.tomarFoto();


## Calcular consumo de datos en una videollamada de 60 segundos

        double consumo = miWebcam.calcularConsumoDatos(60);
        System.out.println("\n Consumo de datos en 60 segundos: " + consumo + " MB.");

    }

}

Markdown permite agregar formato al texto, como encabezados, negritas, cursivas, listas, enlaces, imágenes, y más, utilizando una sintaxis simple y fácil de recordar. Por ejemplo:

Negritas: **texto en negrita**

Cursivas: *texto en cursiva*

Encabezados: # Título principal, ## Subtítulo, ### Sub-subtítulo

Listas:

- Elemento de lista

1. Elemento numerado

Enlaces: [Texto del enlace](URL)

Imágenes: ![Texto alternativo](URL de la imagen)

Markdown es ampliamente utilizado en plataformas como GitHub, Reddit, y en muchas aplicaciones de blogging y documentación debido a su simplicidad y versatilidad. Los archivos Markdown suelen tener la extensión .md.