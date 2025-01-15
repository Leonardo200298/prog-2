package practico8.ejercicio1;

import java.time.LocalDate;

public class Link extends ElementoSA{
    private String direccion;
    private int tamanio;
  
    
    public Link(String nombre, LocalDate fechaCreacion, String direccion, int tamanio) {
        super(nombre, fechaCreacion);
        this.direccion = direccion;
        this.tamanio = tamanio;
    }

    @Override
    public int getTamanio() {
        return this.tamanio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int cantidadDeElementos() {
        return 1;
    }
    
}
