import java.time.LocalDate;

public class FiltroXFechaLanzamientoCancion extends FiltroCancion {
    private LocalDate fecha;

    public FiltroXFechaLanzamientoCancion(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean cumple(Cancion cc) {
        return cc.getLanzamiento().isAfter(fecha);
    }

}
