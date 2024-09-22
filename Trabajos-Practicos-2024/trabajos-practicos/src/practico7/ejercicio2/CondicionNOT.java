package practico7.ejercicio2;

public class CondicionNOT extends Condicion{
    private Condicion c1;

    

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Documento dd) {
        return !c1.cumple(dd);
    }

}
