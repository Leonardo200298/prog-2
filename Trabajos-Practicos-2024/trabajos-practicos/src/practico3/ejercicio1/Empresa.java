package practico3.ejercicio1;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    private ArrayList<Encuesta> encuestas;

    public Empresa(){
        this.empleados = new ArrayList<>();
        this.encuestas = new ArrayList<>();
    }

    public void addEncuesta(Encuesta e){
        encuestas.add(e);
    }
    public void resultadoEncuesta(Empleado e){
        int count = 0;
        for (Encuesta ee : encuestas) {
            if (ee.SeRealizo() && ee.equals(e)) {
                count++;
            }
    
        }
        e.setSueldo(count);
    }
    public void setearSueldosEmpleados(){
        for (Empleado empleado : empleados) {
            resultadoEncuesta(empleado);
        }
    }
}
