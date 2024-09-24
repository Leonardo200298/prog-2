package practico6.ejercicio3;

import java.time.LocalDate;

public class Vehiculo {
    private int capacidad;
    private int cargaParcial;
    private LocalDate fechaCarga;
    private boolean estado;

    public Vehiculo(int capacidad) {
        this.capacidad = capacidad;
    }
    


    public Vehiculo(int capacidad, LocalDate fechaCarga) {
        this.capacidad = capacidad;
        this.fechaCarga = fechaCarga;
    }



    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }



    public LocalDate getFechaCarga() {
        return fechaCarga;
    }



    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public int getCargaParcial() {
        return cargaParcial;
    }



    public void setCargaParcial(int cargaParcial) {
        if ((this.cargaParcial + cargaParcial)<capacidad ) {
            setEstadoDeCarga(true);
            this.cargaParcial += cargaParcial;
        }
        if (this.cargaParcial==capacidad) {
            setEstadoDeCarga(false);
        }
    }



    private void setEstadoDeCarga(boolean b) {
        this.estado = b;
    }



    public int descarga() {
        return capacidad;
    }
    

    
}
