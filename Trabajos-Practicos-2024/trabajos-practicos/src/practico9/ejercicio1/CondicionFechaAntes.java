package practico9.ejercicio1;

import java.time.LocalDate;

public class CondicionFechaAntes extends Condicion{
    private LocalDate fecha;

    public CondicionFechaAntes(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoSA ee) {
        return fecha.isBefore(ee.getFechaDeCreacion());
    }

    
}
