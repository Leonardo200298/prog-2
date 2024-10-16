import java.time.LocalDate;

public class FiltroXFechaLanzamiento extends Filtro {
    private LocalDate fecha;

    public FiltroXFechaLanzamiento(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean cumple(Cancion cc) {
        return cc.getLanzamiento().isAfter(fecha);
    }
}
