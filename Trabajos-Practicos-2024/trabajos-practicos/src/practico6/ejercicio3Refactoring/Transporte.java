package practico6.ejercicio3Refactoring;
import java.time.LocalDate;


public class Transporte {
    private double capacidadDeCarga;
    private LocalDate fecha;

    public Transporte(double capacidadDeCarga, LocalDate fecha) {
        this.capacidadDeCarga = capacidadDeCarga;
        this.fecha = fecha;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    
}
