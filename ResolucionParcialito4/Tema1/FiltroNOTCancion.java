public class FiltroNOTCancion extends FiltroCancion {
    private FiltroCancion f1;

    public FiltroNOTCancion(FiltroCancion f1) {
        this.f1 = f1;

    }

    public boolean cumple(Cancion cc) {
        return !f1.cumple(cc);
    }

}
