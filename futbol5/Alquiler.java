package futbol5;

import java.time.LocalDate;


public class Alquiler{
    private LocalDate fecha;
    private int id_cancha;
    private double pago_alquiler;

    public Alquiler(int id_cancha, double pago_alquiler){
        this.id_cancha = id_cancha;
        this.pago_alquiler = pago_alquiler;
        this.fecha = LocalDate.now();
    }
    public int getIdCancha(){
        return id_cancha;
    }
   
}
