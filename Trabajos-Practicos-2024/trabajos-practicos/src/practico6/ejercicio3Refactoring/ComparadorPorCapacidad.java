package practico6.ejercicio3Refactoring;

public class ComparadorPorCapacidad extends ComparadorTransporte{

    @Override
    public boolean comparar(Transporte t1, Transporte t2) {
        return t1.getCapacidadDeCarga() > t2.getCapacidadDeCarga();
    }
    
}
