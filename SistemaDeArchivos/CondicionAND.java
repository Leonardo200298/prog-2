package SistemaDeArchivos;

public class CondicionAND extends Condicion{
    private CondicionAND condicion1;
    private CondicionAND condicion2;

    public CondicionAND(CondicionAND condicion1, CondicionAND condicion2){
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(ElementoSistema e) {
        return condicion1.cumple(e) && condicion2.cumple(e);
    }
    
}
