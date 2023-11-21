package SistemaDeArchivos;

import java.util.ArrayList;

public class Archivo extends ElementoSistema{
  

    public Archivo(String nombre,double tamanio) {
        super(nombre,tamanio);
        
    }

    @Override
    public int getTamanio() {
        // TODO Auto-generated method stub
        return 1;
    }
    @Override
    public ArrayList<ElementoSistema> buscar(Condicion condicion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }
  
}
