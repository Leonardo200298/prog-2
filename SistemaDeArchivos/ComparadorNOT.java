package SistemaDeArchivos;

import java.util.Comparator;

public class ComparadorNOT implements Comparator<ElementoSistema>{
    private ComparadorNOT comp;

    public ComparadorNOT(ComparadorNOT comp1){
        this.comp = comp1;
    }

    @Override
    public int compare(ElementoSistema arg0, ElementoSistema arg1) {
        return this.comp.compare(arg0, arg1) * -1;
    }
    
}
