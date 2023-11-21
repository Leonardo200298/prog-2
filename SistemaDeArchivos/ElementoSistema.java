package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSistema {
    private String nombre;
    private LocalDate fechaDeCreacion;
    private double tamanio;

    public ElementoSistema(String nombre, double tamanio){
        this.nombre = nombre;
        this.fechaDeCreacion = LocalDate.now();
        this.tamanio = tamanio;
    }
    public abstract int getTamanio();
    public abstract ArrayList<ElementoSistema> buscar(Condicion condicion);
}
