public class FiltroNOT extends Filtro {
    private Filtro f1;

    public FiltroNOT(Filtro f1) {
        this.f1 = f1;

    }

    public boolean cumple(Pelicula pp) {
        return !f1.cumple(pp);
    }

}
