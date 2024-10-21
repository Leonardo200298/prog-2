package Parcial2023TresArroyos;

public class FiltroAND extends Filtro {
    private Filtro c1;

    private Filtro c2;

    public FiltroAND(Filtro c1, Filtro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(PresupuestoAbstracto pp) {
        return c1.cumple(pp) && c2.cumple(pp);
    }
}
