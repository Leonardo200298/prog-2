package practico7.ejercicio3;

public class CondicionClasificacionSuperior extends Condicion{
    private String clasificacionSuperior;

    public CondicionClasificacionSuperior(String clasificacionSuperior){
        this.clasificacionSuperior = clasificacionSuperior;
    }

    @Override
    public boolean cumple(Planta pp) {
        return pp.getClasificacionSuperior().equalsIgnoreCase(clasificacionSuperior);
    }
    
}
