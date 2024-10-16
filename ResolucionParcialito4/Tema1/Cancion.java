import java.time.LocalDate;
import java.util.ArrayList;

public class Cancion {
    private String titulo;
    private String interprete;
    private ArrayList<String> generos;
    private LocalDate lanzamiento;

    public Cancion(String titulo, String interprete, LocalDate lanzamiento) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.lanzamiento = lanzamiento;
        generos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
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
