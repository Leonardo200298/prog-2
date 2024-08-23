package practico2.ejercicio4;

import java.time.LocalDate;


public class Turno {
    private LocalDate fecha;
    private Cancha cancha;
    private Usuario usuario;

    public Turno(LocalDate fecha, Cancha cancha, Usuario usuario){
        this.fecha = fecha;
        this.cancha = cancha;
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
