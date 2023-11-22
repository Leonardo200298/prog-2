package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Link extends ElementoSistema{

    public Link(String nombre,double tamanio) {
        super(nombre,tamanio);
        
    }
    @Override
    public double getTamanio() {
        return super.tamanio;
    }

    @Override
    public ArrayList<ElementoSistema> buscar(Condicion condicion) {
        ArrayList<ElementoSistema> salida = new ArrayList<>();
        if (condicion.cumple(this)) {
            salida.add(this);
        }
        return salida;
    }
    @Override
    public String getNombre() {
        return super.nombre;
    }
    @Override
    public LocalDate getFechaDeCreacion() {
        return super.fechaDeCreacion; 
    }
}
