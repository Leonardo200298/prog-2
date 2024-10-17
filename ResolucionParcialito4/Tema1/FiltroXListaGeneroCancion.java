public class FiltroXListaGeneroCancion extends FiltroCancion {
    private String genero;

    public FiltroXListaGeneroCancion(String genero) {
        this.genero = genero;
    }

    public boolean cumple(Cancion cc) {
        return cc.getGenero(genero);
    }
}
