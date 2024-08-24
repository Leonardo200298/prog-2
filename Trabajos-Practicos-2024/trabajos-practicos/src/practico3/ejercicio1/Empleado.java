package practico3.ejercicio1;

public class Empleado {
    private String nombreEmpleado;
    private double sueldo;
    private double plus;

    public Empleado(String nombreEmpleado, double sueldo){
        this.sueldo = sueldo;
        this.nombreEmpleado = nombreEmpleado;
        plus = 1.10;


    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }

    public double getPlus() {
        return plus;
    }

    public void setSueldo(int encuestasRealizadas){
        if (encuestasRealizadas >3){
            this.sueldo=this.sueldo * this.plus;
        }
    }

    public double getSueldo() {
        return sueldo;
    }
    
}
