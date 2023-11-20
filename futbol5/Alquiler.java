package futbol5;

import java.time.LocalDate;


public class Alquiler{
    private LocalDate fecha;
    private int id_cancha;
    private double precioAlquiler;

    public Alquiler(int id_cancha, double pago_alquiler){
        this.id_cancha = id_cancha;
        this.precioAlquiler = pago_alquiler;
        this.fecha = LocalDate.now();
    }
    public int getIdCancha(){
        return id_cancha;
    }
    public double getPrecioAlquiler(){
        return precioAlquiler;
    }
    public LocalDate getFecha(){
        return fecha;
    }
}
