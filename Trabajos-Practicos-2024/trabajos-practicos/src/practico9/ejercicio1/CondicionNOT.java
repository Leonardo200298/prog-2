package practico9.ejercicio1;

public class CondicionNOT extends Condicion{
    private Condicion condicion;

    public CondicionNOT(Condicion condicion){
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(ElementoSA ee) {
        return !condicion.cumple(ee);
    }
}
