package SistemaDeArchivos;

public class CondicionOR extends Condicion{
    CondicionOR condicion1;
    CondicionOR condicion2;

    public CondicionOR(CondicionOR condicion1, CondicionOR condicion2){
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(ElementoSistema e) {
        return condicion1.cumple(e) || condicion2.cumple(e);
    }
    
}
