package prueba;

public public class Empleado extends Persona{
    private int legajo;

    public Empleado(String nombre, int legajo) {
        super(nombre);
        this.legajo = legajo;
    }

    public String toString(String empresa) {
        return super.toString() + " legajo: "+
                legajo + " empresa: "+empresa;
    }

} 
    

