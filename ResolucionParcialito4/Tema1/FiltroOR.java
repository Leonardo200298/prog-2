public class FiltroOR extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroOR(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(Cancion cc) {
        return f1.cumple(cc) || f2.cumple(cc);
    }

}
