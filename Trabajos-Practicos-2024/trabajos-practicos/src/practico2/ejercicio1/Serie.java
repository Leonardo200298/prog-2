package practico2.ejercicio1;

import java.util.ArrayList;

public class Serie {
    private ArrayList<Temporada> temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        temporadas = new ArrayList<>();
    }

    public void addTemporada(Temporada tt) {
        temporadas.add(tt);
    }

    public int getEpisodiosVistos(Temporada t) {
        return t.getEpisodiosVistos();
    }

    public double getPromedioTemporada(Temporada t) {
        return t.promedioDeCalificacionDeEpisodio();
    }

    public int getEpisodiosDeLaSerie() {
        int count = 0;
        for (Temporada t : temporadas) {
            count += t.getCantEpisodios();
        }
        return count;
    }

    public double getPromedioPorSerie(Temporada t) {
        int acumulador = 0;
        for (Temporada temporada : temporadas) {
            acumulador += temporada.promedioDeCalificacionDeEpisodio();
        }
        return acumulador / temporadas.size();
    }

    public boolean todosLosEpisodiosVistos(Temporada t) {
        for (Temporada temporada : temporadas) {
            if (!temporada.vioTodosLosEpisodios()) {
                return false;
            }
        }
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
