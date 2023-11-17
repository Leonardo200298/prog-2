package futbol5;

import java.util.Comparator;

public class ComparadorPorNombreApellido implements Comparator<Socio>{
  


    @Override
    public int compare(Socio arg0, Socio arg1) {
        int comparadorPorNombre = arg0.getNombre().compareTo(arg1.getNombre());
        if (comparadorPorNombre == 0){
            return arg0.getApellido().compareTo(arg1.getApellido());
        }
        return comparadorPorNombre;
    }
    
}
