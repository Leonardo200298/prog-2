package prefinal_2021;

public class CondicionNOT extends Condicion{
    private CondicionNOT cond;

    
    
    public CondicionNOT(CondicionNOT cond) {
        this.cond = cond;
    }



    @Override
    public boolean cumple(Video e) {
        return !cond.cumple(e);
    }
    
}
