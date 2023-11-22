package SistemaDeArchivos;

import java.util.Comparator;

public class ComparadorCompuestoAND implements Comparator<ElementoSistema>{
    private ComparadorCompuestoAND comp1;
    private ComparadorCompuestoAND comp2;

    public ComparadorCompuestoAND(ComparadorCompuestoAND comp1, ComparadorCompuestoAND comp2){
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(ElementoSistema arg0, ElementoSistema arg1) {
        int resultado = this.comp1.compare(arg0, arg1);
        if (resultado == 0){
            resultado = this.comp2.compare(arg0, arg1);
        }
        return resultado;
    }
    
}
