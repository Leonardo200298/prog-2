package prefinal_2021;

import java.util.ArrayList;
import java.util.Collections;

public class Video extends ElementoSitio implements Comparable<Video>{
    private String titulo;
    private String usuarioQueSubioElVideo;
    private double duracion;
    private int cantidadVisualizaciones;
    private int cantidadMG;
    private int cantidadNOMG;
    private int anioPublicacion;
    private ArrayList<String> palabrasClave;

    public Video(String titulo, String usuarioQueSubioElVideo, double duracion, int cantidadVisualizaciones,
            int cantidadMG, int cantidadNOMG, int anioPublicacion) {
        this.titulo = titulo;
        this.usuarioQueSubioElVideo = usuarioQueSubioElVideo;
        this.duracion = duracion;
        this.cantidadVisualizaciones = cantidadVisualizaciones;
        this.cantidadMG = cantidadMG;
        this.cantidadNOMG = cantidadNOMG;
        this.anioPublicacion = anioPublicacion;
        this.palabrasClave = new ArrayList<>();
    }

    @Override
    public ArrayList<Video> buscar(Condicion c) {
        ArrayList <Video> salida = new ArrayList<>();
        if (c.cumple(this)) {
            salida.add(this);
        }
        Collections.sort(salida);
        return salida;
    }
    public String getUsuario(){
        return usuarioQueSubioElVideo;
    }
    @Override
    public int compareTo(Video o) {
        return usuarioQueSubioElVideo.compareTo(o.getUsuario());
    }

    /* Los listados deben devolverse ordenados por el nombre del usuario que subió el video,
     */
    
    
}
