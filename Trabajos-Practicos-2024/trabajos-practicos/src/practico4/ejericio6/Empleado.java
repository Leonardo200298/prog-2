package practico4.ejericio6;
import java.util.ArrayList;
public class Empleado{
    private String nombre;
    private String apellido;
    private int edad;
    private int nro_legajo;
    private double sueldo;
    private String cargo;
    private ArrayList<UsuarioFinal> usuariosRegistrados;
    public Empleado(String nombre, String apellido, int edad, int nro_legajo, double sueldo, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
     
        this.nro_legajo = nro_legajo;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
    public void registrarUsuario(){
        //registro al usuario
    }
}
