package practico11.ejercicio1;

public class ComparadorApellido extends Compara{
    private Compara siguienteCriterio;
    
    public ComparadorApellido(Compara siguienteCriterio){
        super(siguienteCriterio);
    }

    @Override
    public int compara(Socio arg0, Socio arg1) {
        return arg0.getApellido().compareTo(arg1.getApellido());
    }
    
}
