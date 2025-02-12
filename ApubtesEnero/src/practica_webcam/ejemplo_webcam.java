package practica_webcam;

/*Esta vez quiero que hagáis el ejercicio que os mando adjunto en formato Markdown. 
Quiero que generéis un proyecto nuevo en GitHub (así lo practicáis) y que convirtáis 
este archivo adjunto en el README.
md del proyecto, además de realizar las tareas que en el documento se exponen. 
La entrega será enlace a vuestro proyecto. 
 */
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

public class ejemplo_webcam {
    // Atributos
    private String resolucion;
    private int fps;
    private boolean encendida;
    private double tamanoArchivo;

    // Constructor
    public ejemplo_webcam(String resolucion, int fps) {
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

    public boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    // Métodos
    public void encender() {
        this.encendida = true;
        System.out.println("Cámara encendida.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("Cámara apagada.");
    }

    public void tomarFoto() {
        if (!encendida) {
            System.out.println("Error: La cámara está apagada. Enciéndela para tomar una foto.");
            return;
        }

        // Extraer ancho y alto de la resolución
        String[] partes = resolucion.split("x");
        int ancho = Integer.parseInt(partes[0]);
        int alto = Integer.parseInt(partes[1]);

        // Calcular tamaño estimado del archivo
        tamanoArchivo = (ancho * alto * fps) / 1000000.0;

        // Mostrar mensaje
        System.out.println("Foto tomada con resolución " + resolucion + ".");
        System.out.println("Tamaño estimado del archivo: " + tamanoArchivo + " MB.");
    }

        /*EXTRA */
        public void cambiarResolucion(String nuevaResolucion) {
            this.resolucion = nuevaResolucion;
            System.out.println("Resolución cambiada a: " + nuevaResolucion);
        }
        public double calcularConsumoDatos(int tiempoSegundos) {
            String[] partes = resolucion.split("x");
            int ancho = Integer.parseInt(partes[0]);
            int alto = Integer.parseInt(partes[1]);

            // Fórmula: (ancho * alto * fps * tiempoSegundos) / 1000000.0
            double consumo = (ancho * alto * fps * tiempoSegundos) / 1000000.0;
            return consumo;
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

        //EXTRA

        // Cambiar resolución
        miWebcam.cambiarResolucion("1280x720");
        miWebcam.tomarFoto();

        // Calcular consumo de datos en una videollamada de 60 segundos
        double consumo = miWebcam.calcularConsumoDatos(60);
        System.out.println("Consumo de datos en 60 segundos: " + consumo + " MB.");


    }
}




