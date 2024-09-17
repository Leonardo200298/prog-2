package practico6.ejercicio1Refactoring;

public class Pelicula extends Item{
    private String infoFilmografica;
    private int cantCopias;

    public Pelicula(String infoFilmografica, int cantCopias){
        this.infoFilmografica = infoFilmografica;
        this.cantCopias = cantCopias;
    }

    public String getInfoFilmografica() {
        return infoFilmografica;
    }

    public void setInfoFilmografica(String infoFilmografica) {
        this.infoFilmografica = infoFilmografica;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    @Override
    public boolean alquiler() {
        return this.getCantCopias() > 0;
    }

    
}
