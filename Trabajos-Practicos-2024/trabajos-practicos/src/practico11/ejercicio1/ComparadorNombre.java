package practico11.ejercicio1;

import java.util.Comparator;

public class ComparadorNombre extends Compara{
    private Compara siguienteCriterio;

    public ComparadorNombre(Compara siguienteCriterio){
        super(siguienteCriterio);
    }

    @Override
    public int compara(Socio arg0, Socio arg1) {
        return arg0.getNombre().compareTo(arg1.getNombre());
    }
    
}
