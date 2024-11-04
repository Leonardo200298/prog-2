package practico11.ejercicio1;

import java.time.LocalDate;

public class AlquilerCancha {
    private LocalDate fechaAlquiler;
    private int idCancha;
    private double precio;
    public AlquilerCancha(int idCancha, double precio) {
        this.fechaAlquiler = LocalDate.now();
        this.idCancha = idCancha;
        this.precio = precio;
    }
    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    public int getIdCancha() {
        return idCancha;
    }
    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean esIgual(int idCancha){
        return this.idCancha == idCancha;
    }

    
}
