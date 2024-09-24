package practico7.ejercicio3;

public class CondicionSol extends Condicion{
    private int primerTope;
    private int segundoTope;

    public CondicionSol(int primerTope, int segundoTope){
        this.primerTope = primerTope;
        this.segundoTope = segundoTope;
    }


    @Override
    public boolean cumple(Planta pp) {
        return pp.getSol() >= this.primerTope && pp.getSol() <= this.segundoTope;
    }
    
}
