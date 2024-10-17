public class FiltroXInterprete extends FiltroCancion {
    private String interprete;

    public FiltroXInterprete(String interprete) {
        this.interprete = interprete;
    }

    public boolean cumple(Cancion cc) {
        return cc.getInterprete().equals(interprete);
    }
}
