public class FiltroXListaGenero extends Filtro {
    private String genero;

    public FiltroXListaGenero(String genero) {
        this.genero = genero;
    }

    public boolean cumple(Pelicula pp) {
        return pp.getGenero(genero);
    }
}
