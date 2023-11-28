package prefinal_2021;

public class PlaylistLenta extends Playlist{
    private ElementoSitio referencia;
    private double duracionExtra;
    public PlaylistLenta(String titulo, double demora, double duracionExtra) {
        super(titulo, demora);
        this.duracionExtra = duracionExtra;
        
    }
    /*● Playlist lenta, cuya duración se calcula como la suma de la duración de todo su contenido más 35
segundos. */
    public double duracionDeCancion(){
        return referencia.duracionDeCancion() + this.duracionExtra;
    }
}
