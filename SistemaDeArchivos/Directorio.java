package SistemaDeArchivos;

import java.util.ArrayList;

public class Directorio extends ElementoSistema{
    private ArrayList<ElementoSistema> elementos;

    public Directorio(String nombre,double tamanio) {
        super(nombre,tamanio);
        this.elementos = new ArrayList<>();
    }
    
}
