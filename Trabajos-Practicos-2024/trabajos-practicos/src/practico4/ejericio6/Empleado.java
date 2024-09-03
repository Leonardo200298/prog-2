package practico4.ejericio6;
public class Empleado extends Persona{

    private int nro_legajo;
    private double sueldo;
    private String cargo;
  
    public Empleado(String nombre, String apellido, int edad, int nro_legajo, double sueldo, String cargo) {
      
        super(nombre,apellido, edad);
        this.nro_legajo = nro_legajo;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public int getNro_legajo() {
        return nro_legajo;
    }

    public void setNro_legajo(int nro_legajo) {
        this.nro_legajo = nro_legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = "Empleado";

    }

}
