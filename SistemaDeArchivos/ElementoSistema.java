package SistemaDeArchivos;

import java.time.LocalDate;

public class ElementoSistema {
    private String nombre;
    private LocalDate fechaDeCreacion;
    private double tamanio;
    public ElementoSistema(String nombre, double tamanio){
        this.nombre = nombre;
        this.fechaDeCreacion = LocalDate.now();
        this.tamanio = tamanio;
    }
     
}
