package prefinal_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Playlist extends ElementoSitio {
    private String titulo;
    private ArrayList<ElementoSitio> videos;
    private double demora;

    public Playlist(String titulo, double demora){
        this.titulo = titulo;
        this.demora = demora;
        this.videos = new ArrayList<>();
    }

    @Override
    public ArrayList<Video> buscar(Condicion c) {
        ArrayList<Video> salida = new ArrayList<>();
        for (ElementoSitio i : videos) {
            if (c.cumple(i)) {
                salida.addAll(i.buscar(c));
            }
        }
        return salida;
    }

    public void ordenar(Condicion condicion, Comparator<ElementoSitio> comp) {
        ArrayList<ElementoSitio> arregloAordenar = new ArrayList<>();
        arregloAordenar.addAll(this.buscar(condicion));
        if (arregloAordenar.size() > 0) {
            Collections.sort(arregloAordenar, comp);
        }

    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> salida = new ArrayList<>();
        for (int i = 0; i < videos.size(); i++) {
            ArrayList<String> palabrasClaveAux = videos.get(i).getPalabrasClave();
            for (String st : palabrasClaveAux) {
                if (!salida.contains(st)) {
                    salida.add(st);
                }
            }
        }
        return salida;
    }
   
    @Override
    public int cantidadVideos() {
        int acumulador = 0;
        for (ElementoSitio video : videos) {
            acumulador+=video.cantidadVideos();
        }
        return acumulador;
    }

    @Override
    public double duracionDeCancion() {
        double acumulador = 0.0;
        for (ElementoSitio e : videos) {
            acumulador+=e.duracionDeCancion();
        }
        return acumulador + this.demora;
    }
   
}
