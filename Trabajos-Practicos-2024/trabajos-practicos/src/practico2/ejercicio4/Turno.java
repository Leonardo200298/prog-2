package practico2.ejercicio4;

import java.time.LocalDate;


public class Turno {
    private LocalDate fecha;
    private ArrayList<Usuario> usuarios;

    public Turno(LocalDate fecha){
        this.fecha = LocalDate.now();
        this.usuarios = new ArrayList<>();
    }
}
