package practico6.ejercicio3;

import java.time.LocalDate;

public class Vehiculo {
    private double capacidad;
    private LocalDate fechaCarga;

    public Vehiculo(double capacidad, LocalDate fechaCarga) {
        this.capacidad = capacidad;
        this.fechaCarga = fechaCarga;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    
    
}
