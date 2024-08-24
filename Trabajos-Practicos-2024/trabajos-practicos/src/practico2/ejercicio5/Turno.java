package practico2.ejercicio5;

import java.time.LocalDate;

public class Turno {
    private boolean libre;
    private LocalDate fecha;
    private Cliente cliente;
    private Peluquero peluquero;

    public Turno(){

    }

    public Turno(LocalDate fecha,Cliente cliente, Peluquero peluquero){
        this.libre = true;
        this.fecha = fecha;
        this.cliente = cliente;
        this.peluquero = peluquero;
    }
    public LocalDate getFecha(){
        return this.fecha;
    }
    public boolean isLibre() {
        return libre;
    }
    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
        peluquero.agregarTurno(this);
    }
    
}
