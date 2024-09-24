package practico7.ejercicio3;

public class CondicionRiesgo extends Condicion{
    private int tope;

    public CondicionRiesgo(int tope){
        this.tope = tope;
    }

    @Override
    public boolean cumple(Planta pp) {
        return pp.getRiesgo() < this.tope;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    
    
}
