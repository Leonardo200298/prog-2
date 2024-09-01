package practico4.ejericio6;
import java.util.ArrayList;

public class Jerarquico extends Empleado{

    private ArrayList<Empleado> empleados_a_cargo;
    

    public Jerarquico(String nombre, String apellido, int edad, int nro_legajo, double sueldo, String cargo) {
        super(nombre, apellido, edad, nro_legajo, sueldo, cargo);

        this.empleados_a_cargo = new ArrayList<>();
    }
    public ArrayList<Empleado> getEmpleadosACargo(){
        return this.empleados_a_cargo;
    }

    public void agregarEmpleadoACargo(Empleado ee){
        this.getEmpleadosACargo().add(ee);
    }



}
