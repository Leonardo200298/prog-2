package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSistema {
    protected String nombre;
    protected LocalDate fechaDeCreacion;
    protected double tamanio;

    public ElementoSistema(String nombre, double tamanio){
        this.nombre = nombre;
        this.fechaDeCreacion = LocalDate.now();
        this.tamanio = tamanio;
    }
    public abstract String getNombre();
    public abstract LocalDate getFechaDeCreacion();
    public abstract double getTamanio();
    public abstract ArrayList<ElementoSistema> buscar(Condicion condicion);
}
