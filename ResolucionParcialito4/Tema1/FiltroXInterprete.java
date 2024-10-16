public class FiltroXInterprete extends Filtro {
    private String interprete;

    public FiltroXInterprete(String interprete) {
        this.interprete = interprete;
    }

    public boolean cumple(Cancion cc) {
        return cc.getInterprete().equals(interprete);
    }
}
