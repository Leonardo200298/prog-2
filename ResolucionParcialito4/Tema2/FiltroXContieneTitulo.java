public class FiltroXContieneTitulo extends Filtro {
    private String palabra;

    public FiltroXContieneTitulo(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Pelicula pp) {
        return pp.getTitulo().contains(palabra);
    }
}
