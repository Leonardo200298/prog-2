package SistemaDeArchivos;

import java.util.Comparator;

public class ComparadorPorTamanioDescendente implements Comparator<ElementoSistema>{

    @Override
    public int compare(ElementoSistema arg0, ElementoSistema arg1) {
        return (int) (arg0.getTamanio() - arg1.getTamanio());
    }
    
}
