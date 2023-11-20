package futbol5;

import java.util.Comparator;

public class ComparadorPorCuotaPaga implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
       return Boolean.compare(o1.getCuotaPaga(), o2.getCuotaPaga());
    }
    
}
