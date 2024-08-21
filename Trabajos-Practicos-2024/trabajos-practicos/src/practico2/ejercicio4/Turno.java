package practico2.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Turno {
    private LocalDate fecha;

    

    public Turno(LocalDate fecha, boolean reserva){
        this.fecha = LocalDate.now();
        this.reserva = reserva;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }
  
    



    
}
