public class FiltroNOT extends FiltroCancion {
    private FiltroCancion f1;

    public FiltroNOT(FiltroCancion f1) {
        this.f1 = f1;

    }

    public boolean cumple(Cancion cc) {
        return !f1.cumple(cc);
    }

}
