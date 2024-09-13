package practico5.ejercicio7;

public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private double sueldo_mensual;

    public Empleado(String nombre, String apellido, String dni, double sueldo_mensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo_mensual = sueldo_mensual;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    
    
}
