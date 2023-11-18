package futbol5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cancha extends ElementoRegistro{
    private LocalDate fecha;
    private int id_cancha;
    private double pago_alquiler;

    public Cancha(int id_cancha, double pago_alquiler){
        this.id_cancha = id_cancha;
        this.pago_alquiler = pago_alquiler;
        this.fecha = LocalDate.now();
    }
    public int getIdCancha(){
        return id_cancha;
    }
    @Override
    public ArrayList<Cancha> canchasAlquilasSegunId(int id) {
        ArrayList salida = new ArrayList<>();
        if (id == this.getIdCancha()) {
            salida.add(this);
        }
        return salida;
    }
}
