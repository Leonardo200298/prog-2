package recuperatorio_2023;

public class CondicionNOT extends Condicion{
    private CondicionNOT cond;

    public CondicionNOT(CondicionNOT cond){
        this.cond = cond;
    }

    @Override
    public boolean cumple(Comando comando) {
        return !cond.cumple(comando);
    }
    
}
