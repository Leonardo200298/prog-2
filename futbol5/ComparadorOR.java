package futbol5;

import java.util.Comparator;

public class ComparadorOR implements Comparator<Socio>{
    private ComparadorOR comp1;
    private ComparadorOR comp2;

    public ComparadorOR(ComparadorOR comp1, ComparadorOR comp2){
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Socio arg0, Socio arg1) {
        int resultado = this.comp1.compare(arg0, arg1);
        if (resultado != 0) {
            resultado = this.comp2.compare(arg0, arg1);
        }
        return resultado;
    }
    
}
