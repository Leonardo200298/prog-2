package Parcial2023TresArroyos;

public class FiltroNOT {
    private Filtro c1;

    public FiltroNOT(Filtro c1) {
        this.c1 = c1;

    }

    public boolean cumple(PresupuestoAbstracto pp) {
        return !c1.cumple(pp);
    }
}
