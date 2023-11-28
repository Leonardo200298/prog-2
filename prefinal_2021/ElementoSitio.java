package prefinal_2021;

import java.util.ArrayList;

public abstract class ElementoSitio {
    public abstract ArrayList<Video> buscar(Condicion c);
    public abstract ArrayList<String> getPalabrasClave();
    public abstract int cantidadVideos();
    public abstract double duracionDeCancion();
}

