package practico2.ejercicio1;

import java.util.ArrayList;

public class Temporada {
    private int numeroTemporada;
    private ArrayList<Episodio> episodios;

    public Temporada(int numeroTemporada){
        this.numeroTemporada = numeroTemporada;
        episodios = new ArrayList<>();
    }
    public int getEpisodiosVistos(){
        int contador=0;
        for (Episodio ep : episodios) {
         if (ep.isVisto()) {
            contador++;
         }   
        }
        return contador;
    }

    public double promedioDeCalificacionDeEpisodio(){
        int acumulador=0;
        for(Episodio ep : episodios ){
            acumulador+=ep.getCalificacion();
        }
        return acumulador/episodios.size();
    }
}
