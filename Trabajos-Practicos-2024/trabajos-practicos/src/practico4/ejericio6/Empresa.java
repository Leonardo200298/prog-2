package practico4.ejericio6;
import java.util.ArrayList;


public class Empresa {
    
    private ArrayList<Persona> empleados;

    public Empresa(){
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Persona> getEmpleados(){
        return this.empleados;
    }

    public void agregarEmpleado(Persona pp){
        this.getEmpleados().add(pp);
    }
    
    public String cadenaDePersonas(){
        String resultado = "";
        for (Persona persona : this.getEmpleados()) {
            resultado += "Nombre: " + persona.getNombre() + "\n";
            resultado += "Apellido: " + persona.getApellido() + "\n";
            resultado += "Edad: " + persona.getEdad() + "\n";
            resultado += "Cargo: " + persona.getCargo() + "\n";

        }
        return resultado;
    }
}
