package SistemaDeArchivos;

import java.util.ArrayList;

public class Link extends ElementoSistema{

    public Link(String nombre,double tamanio) {
        super(nombre,tamanio);
        
    }
    @Override
    public int getTamanio() {
        // TODO Auto-generated method stub
        return 1;
    }
    @Override
    public ArrayList<ElementoSistema> buscar(Condicion condicion) {
        ArrayList<ElementoSistema> salida = new ArrayList<>();
        if (condicion.cumple(this)) {
            salida.add(this);
        }
        return salida;
    }
}
