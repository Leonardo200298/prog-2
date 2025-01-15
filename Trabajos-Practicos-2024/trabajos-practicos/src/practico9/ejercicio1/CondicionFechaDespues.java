package practico9.ejercicio1;

import java.time.LocalDate;

public class CondicionFechaDespues extends Condicion{
    private LocalDate fecha;

    public CondicionFechaDespues(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoSA ee) {
        return fecha.isAfter(ee.getFechaDeCreacion());
    }

    
}
