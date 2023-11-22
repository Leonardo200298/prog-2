package futbol5;

import java.util.Comparator;

public class ComparadorNOT implements Comparator<Socio>{
    private ComparadorNOT comp;

    public ComparadorNOT(ComparadorNOT comp){
        this.comp = comp;
    }

    @Override
    public int compare(Socio arg0, Socio arg1) {
        return this.comp.compare(arg0, arg1) * -1;
    }
    
}
