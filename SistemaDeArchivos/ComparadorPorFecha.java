package SistemaDeArchivos;

import java.util.Comparator;

public class ComparadorPorFecha implements Comparator<ElementoSistema>{

    @Override
    public int compare(ElementoSistema arg0, ElementoSistema arg1) {
        return arg0.fechaDeCreacion.compareTo(arg1.getFechaDeCreacion());
    }
    
}
