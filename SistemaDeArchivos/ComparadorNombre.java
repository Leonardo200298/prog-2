package SistemaDeArchivos;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoSistema>{

    @Override
    public int compare(ElementoSistema arg0, ElementoSistema arg1) {
        return arg0.getNombre().compareTo(arg1.getNombre());
    }
    
}
