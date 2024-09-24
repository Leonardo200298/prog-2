package practico6.ejercicio1;

public class Pelicula extends Item{
    private String nombre;
    private String director;
    private String genero;
    private int cantCopias;
    public Pelicula(String nombre, String director, String genero, int cantCopias) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.cantCopias = cantCopias;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getCantCopias() {
        return cantCopias;
    }
    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
    @Override
    public boolean sePuedeAlquilar() {
        if (getCantCopias()!=0) 
            return true;
        else
            return false;
    }

    

}
