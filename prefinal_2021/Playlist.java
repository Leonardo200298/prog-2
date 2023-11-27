package prefinal_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Playlist extends ElementoSitio{
    private String titulo;
    private ArrayList<ElementoSitio> videos;

    @Override
    public ArrayList<Video> buscar(Condicion c) {
        ArrayList <Video> salida = new ArrayList<>();
        for (ElementoSitio i : videos) {
                if (c.cumple(i)) {
                    salida.addAll(i.buscar(c));
                }
        }
        return salida;
    }

    public void ordenar(Condicion condicion,Comparator<ElementoSitio> comp){
        ArrayList<ElementoSitio> arregloAordenar = new ArrayList<>();
        arregloAordenar.addAll(this.buscar(condicion));
        if (arregloAordenar.size() > 0) {
            Collections.sort(arregloAordenar, comp);
        }

    }
 
}
