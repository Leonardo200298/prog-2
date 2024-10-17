public class FiltroXDirector extends Filtro {
    private String director;

    public FiltroXDirector(String director) {
        this.director = director;
    }

    public boolean cumple(Pelicula pp) {
        return pp.getDirector().equals(director);
    }
}
