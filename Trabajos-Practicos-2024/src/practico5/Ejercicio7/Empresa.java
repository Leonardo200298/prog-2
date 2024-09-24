package practico5.Ejercicio7;
import java.util.ArrayList;
public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa(){
        empleados = new ArrayList<>();
    }
    public void addEmpleado(Empleado ee){
        empleados.add(ee);
    }
    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    public double getGastoEnSueldos(){
        double total = 0;
        for (Empleado empleado : empleados) {
            total+=empleado.getSueldo();
        }
        return total;
    }

}
