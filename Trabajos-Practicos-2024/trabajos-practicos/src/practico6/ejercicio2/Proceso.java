package practico6.ejercicio2;

public class Proceso {
    private String nombre;
    private double ram;

    public Proceso(String nombre, double ram) {
        this.nombre = nombre;
        this.ram = ram;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getRAM() {
        return ram;
    }
    public void setRAM(double ram) {
        this.ram = ram;
    }

    
}
