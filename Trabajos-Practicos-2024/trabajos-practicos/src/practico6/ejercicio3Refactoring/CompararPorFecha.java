package practico6.ejercicio3Refactoring;

public class CompararPorFecha extends ComparadorTransporte{

    @Override
    public boolean comparar(Transporte t1, Transporte t2) {
        return t1.getFecha().isBefore(t2.getFecha());
    }
    
}
