package SistemaDeArchivos;

import java.time.LocalDate;

public class CondicionPorFechaAntes extends Condicion{
    private LocalDate fecha;

    public CondicionPorFechaAntes(){
        this.fecha = LocalDate.now();
    }

    @Override
    public boolean cumple(ElementoSistema e) {
        return e.getFechaDeCreacion().isBefore(this.fecha);
    }
    
}
