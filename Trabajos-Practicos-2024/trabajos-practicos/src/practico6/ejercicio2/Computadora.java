package practico6.ejercicio2;

public class Computadora {
    private String nombreDePC;
    private double velocidad;

    public Computadora(String nombreDePC, double velocidad) {
        this.nombreDePC = nombreDePC;
        this.velocidad = velocidad;
    }

    public String getNombreDePC() {
        return nombreDePC;
    }

    public void setNombreDePC(String nombreDePC) {
        this.nombreDePC = nombreDePC;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    
    
}
