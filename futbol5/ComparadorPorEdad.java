package futbol5;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Socio> {


    @Override
    public int compare(Socio otro, Socio otro2) {
        return otro.getEdad() - otro2.getEdad();
    }

}
