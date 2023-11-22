package SistemaDeArchivos;

public class CondicionNOT extends Condicion{
    CondicionNOT condicion;

    public CondicionNOT(CondicionNOT condicion){
        this.condicion = condicion;
    }
    
    @Override
    public boolean cumple(ElementoSistema e) {
        return !condicion.cumple(e);
    }

}
