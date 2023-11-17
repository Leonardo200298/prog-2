package futbol5;

import java.time.LocalDate;

public class Registro {
    private LocalDate fecha;
    private int id_cancha;
    private double pago_alquiler;

    public Registro(int id_cancha, double pago_alquiler){
        this.id_cancha = id_cancha;
        this.pago_alquiler = pago_alquiler;
        this.fecha = LocalDate.now();
    }
}
