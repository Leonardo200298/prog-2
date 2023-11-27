package recuperatorio_2023;

public class CondicionAND extends Condicion{
    private CondicionAND condi1;
    private CondicionAND condi2;

    public CondicionAND(CondicionAND condi1, CondicionAND condi2){
        this.condi1 = condi1;
        this.condi2 = condi2;

    }

    @Override
    public boolean cumple(Comando comando) {
        return condi1.cumple(comando) && condi2.cumple(comando);
    }
    
}
