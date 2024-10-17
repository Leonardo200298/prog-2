public class FiltroOR extends FiltroCancion {
    private FiltroCancion f1;
    private FiltroCancion f2;

    public FiltroOR(FiltroCancion f1, FiltroCancion f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(Cancion cc) {
        return f1.cumple(cc) || f2.cumple(cc);
    }

}
