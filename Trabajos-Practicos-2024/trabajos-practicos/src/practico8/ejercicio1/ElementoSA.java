package practico8.ejercicio1;

import java.time.LocalDate;

public abstract class ElementoSA {

    private String nombre;
    private LocalDate fechaCreacion;


    public ElementoSA(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public abstract int getTamanio();
    public abstract int cantidadDeElementos();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    } 
    
}
