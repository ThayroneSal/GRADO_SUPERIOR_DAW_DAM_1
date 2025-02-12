package practica_webcam;

/*
 * # Ejercicio: Clase Webcam📸
## Objetivo
Crear una clase `Webcam` que represente una cámara web con diversas propiedades y
comportamientos.
## Requisitos📄
### Atributos
La clase debe incluir los siguientes atributos:
1. **Resolución** (en píxeles, representada como una cadena en el formato "ancho👉
x alto", por ejemplo, "1920x1080").
2. **Frecuencia de cuadros por segundo (FPS)** (número entero).👉
3. **Estado de encendido/apagado** (booleano).👉
4. **Tamaño estimado del archivo de imagen generado (en MB, tipo `double`).**👉
### Métodos
1. Implementa un **constructor** que inicialice la resolución, FPS y establezca la
cámara como apagada por defecto.
2. Implementa los **métodos getters y setters** necesarios.
3. Implementa un método `encender()` que active la cámara.
4. Implementa un método `apagar()` que la desactive.
5. Implementa un método `tomarFoto()` que:
- Solo funcione si la cámara está encendida.
- Devuelva un mensaje indicando que la foto fue tomada con la resolución y el
tamaño estimado del archivo.
- Calcule el tamaño estimado del archivo de imagen usando la siguiente fórmula:
```
tamaño = (ancho * alto * FPS) / 1000000.0
```
Donde `ancho` y `alto` se obtienen de la resolución proporcionada en el
formato "ancho x alto".
### Prueba en el `main`📚
1. Crea una instancia de `Webcam` con una resolución de "1920x1080" y 30 FPS.
2. Intenta tomar una foto con la cámara apagada.
3. Enciende la cámara y toma una foto.
4. Apaga la cámara.
---
### Extras (Opcionales)✨
Si quieres practicar aún más, podrías agregar (aunque no cuente para nota):
- Un método para cambiar la resolución en tiempo de ejecución y recalcular el
tamaño de la foto.
- Un método para calcular el consumo de datos en una videollamada según la
resolución, tiempo en segundos y FPS.
¡Mucho ánimo! 🚀

 */


public class ejemplo11_webcam {
    // Atributos
    private String resolucion;
    private int fps;
    private boolean encendida;
    private double tamanoArchivo;

    // Constructor
    public ejemplo11_webcam(String resolucion, int fps) {
        this.resolucion = resolucion;
        this.fps = fps;
        this.encendida = false; // Por defecto, la cámara está apagada
        this.tamanoArchivo = 0.0;
    }

    // Getters y Setters
    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    // Métodos
    public void encender() {
        this.encendida = true;
        System.out.println("La cámara se ha encendido.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("La cámara se ha apagado.");
    }

    public String tomarFoto() {
        if (encendida) {
            double ancho = Double.parseDouble(resolucion.split("x")[0]);
            double alto = Double.parseDouble(resolucion.split("x")[1]);
            tamanoArchivo = (ancho * alto * fps) / 1000000.0;
            return "Foto tomada con resolución " + resolucion + " y tamaño estimado de " + tamanoArchivo + " MB.";
        } else {
            return "La cámara está apagada. Enciéndela para tomar una foto.";
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de Webcam
        ejemplo_webcam miWebcam = new ejemplo_webcam ("1920x1080", 30);

        // Intentar tomar una foto con la cámara apagada
        System.out.println("\nIntentando tomar una foto con la cámara apagada:");
        miWebcam.tomarFoto();

        // Encender la cámara y tomar una foto
        System.out.println("\nEncendiendo la cámara y tomando una foto:");
        miWebcam.encender();
        miWebcam.tomarFoto();

        // Apagar la cámara
        System.out.println("\nApagando la cámara:");
        miWebcam.apagar();


    }
}
