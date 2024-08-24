package practico2.ejercicio1;

import java.util.ArrayList;

public class Temporada {
    private int numeroTemporada;
    private ArrayList<Episodio> episodios;

    public Temporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
        episodios = new ArrayList<>();
    }

    public int getEpisodiosVistos() {
        int contador = 0;
        for (Episodio ep : episodios) {
            if (ep.isVisto()) {
                contador++;
            }
        }
        return contador;
    }

    public double promedioDeCalificacionDeEpisodio() {
        int acumulador = 0;
        for (Episodio ep : episodios) {
            acumulador += ep.getCalificacion();
        }
        return acumulador / episodios.size();
    }

    public int getCantEpisodios() {
        return episodios.size();
    }

    public boolean vioTodosLosEpisodios() {
        boolean flag = false;
        int i = 0;
        while (!flag && i < episodios.size()) {
            if (!episodios.get(i).isVisto()) {
                flag = false;
                return flag;
            }
            i++;
        }
        return flag;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

}
