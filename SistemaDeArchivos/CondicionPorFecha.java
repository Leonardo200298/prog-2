package SistemaDeArchivos;

import java.time.LocalDate;

public class CondicionPorFecha extends Condicion{
    private LocalDate fecha;

    public CondicionPorFecha(){
        this.fecha = LocalDate.now();
    }

    @Override
    public boolean cumple(ElementoSistema e) {
        
        return e.getFechaDeCreacion().isAfter(this.fecha);
    }
    
}
