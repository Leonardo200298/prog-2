package SistemaDeArchivos;

import java.util.Comparator;

public class ComparaddorCompuestoOR implements Comparator<ElementoSistema>{
    private ComparaddorCompuestoOR comp1;
    private ComparaddorCompuestoOR comp2;

    public ComparaddorCompuestoOR(ComparaddorCompuestoOR comp1, ComparaddorCompuestoOR comp2){
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(ElementoSistema arg0, ElementoSistema arg1) {
        int resultado = this.comp1.compare(arg0, arg1);
        if (resultado != 0) {
            resultado = this.comp2.compare(arg0, arg1);
        }
        return resultado;
    }
    
}
