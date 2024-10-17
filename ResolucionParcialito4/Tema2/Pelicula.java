import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String director;
    private ArrayList<String> generos;
    private LocalDate lanzamiento;

    public Pelicula(String titulo, String director, LocalDate lanzamiento) {
        this.titulo = titulo;
        this.director = director;
        this.lanzamiento = lanzamiento;
        generos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setInterprete(String director) {
        this.director = director;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public boolean getGenero(String ss) {
        return generos.contains(ss);
    }
}
