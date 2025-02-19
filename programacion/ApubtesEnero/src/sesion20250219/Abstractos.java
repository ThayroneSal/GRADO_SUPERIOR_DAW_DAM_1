package sesion20250219;

 abstract class Empleado{
    // quiero que todos los empleados tenga un nombre, salario y un metodo que resuma esta informacion.
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
     }

    public abstract void resumen();

     }

public class Abstractos {

}

class Gerente extends Empleado{
    private String departamento;

    public Gerente (String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento=departamento;
    }
}
