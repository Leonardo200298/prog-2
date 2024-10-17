import java.time.LocalDate;

public class FiltroXFechaLanzamiento extends Filtro {
    private LocalDate fecha;

    public FiltroXFechaLanzamiento(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean cumple(Pelicula pp) {
        return pp.getLanzamiento().isAfter(fecha);
    }
}
