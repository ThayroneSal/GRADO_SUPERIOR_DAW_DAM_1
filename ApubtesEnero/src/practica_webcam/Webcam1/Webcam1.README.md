package practica_webcam.Webcam;

public class Webcam {

 /**
     *@ Atributos
     */

private String resolucion;
private int fps;
private boolean encendida;
private double tamanoArchivo;

/**
 * Constructor
 * @param resolucion
 * @param fps
 */

public Webcam(String resolucion, int fps){
    this.resolucion=resolucion;
    this.fps=fps;
    this.encendida=false; // camera apagada por defecto.
    this.tamanoArchivo=0.0;
    }
/**
 * Getters y Setters
 * @return
 */
public String getResolucion(){
    return resolucion;
    }

    /**
     * Modifica resolucion
     * @param resolucion
    */

public void setResolucion(String resolucion){
    this.resolucion=resolucion;
    }

/**
 *  retorna fps
 * @return
 */

public int getFps(){
    return fps;
    }
/**
 * Modifica fps
 * @param fps
 */

public void setFps(int fps){
    this.fps=fps;
    }

    /**
     * Retorna encendida
     * @return
     */

public boolean getEncendida(){
    return encendida;
    }

    /**
     * Modifica encendida
     * @param encendida
     */
public void setEncendida(boolean encendida){
    this.encendida=encendida;
    }

    /**
     * Retorna tamanoArchivo
     * @return
     */

public double getTamanoArchivo(){
    return tamanoArchivo;
    }

    /**
     * Modifica tamanoArchivo
     * @param tamanoArchivo
     */
public void setTamanoArchivo(double tamanoArchivo){
    this.tamanoArchivo=tamanoArchivo;
    }

    /**
     * Metodos
     * metodo para encender la camera
     */

    public void encender(){
        this.encendida=true;
        System.out.println("La camera esta encendida");
    }

    /**
     * Metodo para apagar la camera
     */

    public void apagar(){
        this.encendida=false;
        System.out.println("La camera esta apagada");
    }

    /**
     * Metodo para tomar una foto
     * @return
     */

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

      /* METODOS EXTRA */
      /**
       * Cambia la resolución de la cámara
       * @param nuevaResolucion
       */
      public void cambiarResolucion(String nuevaResolucion) {
        this.resolucion = nuevaResolucion;
        System.out.println("\n Resolución cambiada a: " + nuevaResolucion);
    }
    /**
     * Calcula el consumo de datos en una videollamada
     * @param tiempoSegundos
     * @return
     */
    public double calcularConsumoDatos(int tiempoSegundos) {
        String[] partes = resolucion.split("x");
        int ancho = Integer.parseInt(partes[0]);
        int alto = Integer.parseInt(partes[1]);

        /**
         * Fórmula: (ancho * alto * fps * tiempoSegundos) / 1000000.0
         * @
         */
        double consumo = (ancho * alto * fps * tiempoSegundos) / 1000000.0;
        return consumo;
    }
    /**
     * Método principal Main
     * @param args
     */

    public static void main(String[] args) {
        /**
         * Crear una instancia de Webcam con una resolución de "1920x1080" y 30 FPS.
         */
        Webcam miWebcam = new Webcam ("1920x1080", 30);

        /**
         * Intentar tomar una foto con la cámara apagada
         */
        System.out.println("\n Intentando tomar una foto con la cámara apagada:");
        miWebcam.apagar();
        miWebcam.tomarFoto();

        /**
         * Encender la cámara y tomar una foto
         */
        System.out.println("\n Encendiendo la cámara y tomo una foto:");
        miWebcam.encender();
        miWebcam.tomarFoto();

        /**
         * Apagar la cámara
         */
        System.out.println("\n Apagando la cámara:");
        miWebcam.apagar();

        /**
         * EXTRA - cambia la resolución
         */
        miWebcam.cambiarResolucion("1280x720");
        miWebcam.tomarFoto();

        /**
         * Calcular consumo de datos en una videollamada de 60 segundos
         */
        double consumo = miWebcam.calcularConsumoDatos(60);
        System.out.println("\n Consumo de datos en 60 segundos: " + consumo + " MB.");

    }

}

