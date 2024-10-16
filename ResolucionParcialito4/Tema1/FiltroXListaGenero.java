public class FiltroXListaGenero extends Filtro {
    private String genero;

    public FiltroXListaGenero(String genero) {
        this.genero = genero;
    }

    public boolean cumple(Cancion cc) {
        return cc.getGenero(genero);
    }
}
