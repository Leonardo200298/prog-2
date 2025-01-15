package practico11.ejercicio1;

import java.util.Comparator;

public class ComparadorEdad extends Compara{
    private Compara siguienteCriterio;
    
    public ComparadorEdad(Compara siguienteComparador) {
        super(siguienteComparador);
      
    }

    @Override
    public int compara(Socio arg0, Socio arg1) {
        return arg0.getEdad() - arg1.getEdad();
    }

   
    
}
