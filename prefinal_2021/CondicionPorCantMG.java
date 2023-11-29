package prefinal_2021;

public class CondicionPorCantMG extends Condicion{
    private int cantMG;

    public CondicionPorCantMG(int cantMG){
        this.cantMG = cantMG;
    }

    @Override
    public boolean cumple(Video e) {
        return e.getCantidadMG() > this.cantMG;
    }
    
}
