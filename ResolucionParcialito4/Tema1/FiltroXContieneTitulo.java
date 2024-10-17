public class FiltroXContieneTitulo extends FiltroCancion {
    private String palabra;

    public FiltroXContieneTitulo(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Cancion cc) {
        return cc.getTitulo().contains(palabra);
    }
}
