package practico8.ejercicio1;

import java.time.LocalDate;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fCreacion;
   
    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fCreacion = LocalDate.now();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getfCreacion() {
        return fCreacion;
    }
    public abstract double getTamanio();
    public abstract int getCantElementos();
    
}
