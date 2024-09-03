package practico4.ejericio6;
import java.util.ArrayList;

public class Jerarquico extends Persona{

    private ArrayList<Empleado> empleados_a_cargo;
    private int nro_legajo;
    private String cargo;
    private double sueldo;
    public Jerarquico(String nombre, String apellido, int edad, int nro_legajo, double sueldo, String cargo) {
        super(nombre, apellido, edad);
        this.nro_legajo = nro_legajo;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.empleados_a_cargo = new ArrayList<>();
    }

    

    public ArrayList<Empleado> getEmpleados_a_cargo() {
        return empleados_a_cargo;
    }



    public void setEmpleados_a_cargo(ArrayList<Empleado> empleados_a_cargo) {
        this.empleados_a_cargo = empleados_a_cargo;
    }



    public int getNro_legajo() {
        return nro_legajo;
    }



    public void setNro_legajo(int nro_legajo) {
        this.nro_legajo = nro_legajo;
    }



    public String getCargo() {
        return cargo;
    }



    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public double getSueldo() {
        return sueldo;
    }



    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }



    public ArrayList<Empleado> getEmpleadosACargo(){
        return this.empleados_a_cargo;
    }

    public void agregarEmpleadoACargo(Empleado ee){
        this.getEmpleadosACargo().add(ee);
    }



}
