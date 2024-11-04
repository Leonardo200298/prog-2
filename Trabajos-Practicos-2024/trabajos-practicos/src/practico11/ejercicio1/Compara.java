package practico11.ejercicio1;

import java.util.Comparator;

public abstract class Compara implements Comparator<Socio>{
    private Compara siguienteComparador;
    
    public Compara(Compara siguienteComparador) {
        this.siguienteComparador = siguienteComparador;
    }
    
    @Override
    public int compare(Socio arg0, Socio arg1) {
        int resultado = siguienteComparador.compara(arg0, arg1);
        if (resultado == 0 && this.siguienteComparador != null) {
            return siguienteComparador.compara(arg0, arg1);
        }
        return resultado;
    }

    public abstract int compara(Socio s1, Socio s2); 
}
