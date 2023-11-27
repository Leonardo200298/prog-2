package recuperatorio_2023;

public class CondicionOR extends Condicion{
    private CondicionOR condi1;
    private CondicionOR condi2;

    public CondicionOR(CondicionOR condi1, CondicionOR condi2){
        this.condi1 = condi1;
        this.condi2 = condi2;

    }
    @Override
    public boolean cumple(Comando comando) {
        return condi1.cumple(comando) || condi2.cumple(comando);
    }
    
}
