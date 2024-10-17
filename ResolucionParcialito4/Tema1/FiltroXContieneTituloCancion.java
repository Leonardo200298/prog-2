public class FiltroXContieneTituloCancion extends FiltroCancion {
    private String palabra;

    public FiltroXContieneTituloCancion(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Cancion cc) {
        return cc.getTitulo().contains(palabra);
    }
}
