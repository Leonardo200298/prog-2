package practico9.ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fechaDeCreacion;

    public ElementoSA(String nombre){
        this.nombre = nombre;
        this.fechaDeCreacion = LocalDate.now();
    }

    public abstract double getTamanio();
    public abstract ArrayList<ElementoSA> busqueda(Condicion ee);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    
}
