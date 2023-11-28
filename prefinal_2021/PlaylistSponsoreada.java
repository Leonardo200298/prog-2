package prefinal_2021;

import java.util.ArrayList;

public class PlaylistSponsoreada extends Playlist{
    private Video videoSponsoreado;
    public PlaylistSponsoreada(String titulo, double demora) {
        super(titulo, demora);
        this.videoSponsoreado = videoSponsoreado;
    }

  

    @Override
    public ArrayList<Video> buscar(Condicion c) {
        ArrayList<Video> salida = super.buscar(c);
        salida.add(0,videoSponsoreado);
        return salida;
    }
    /* Playlists o grupos sponsoreados. Estos elementos tienen la particularidad de que si se les pide un
listado de videos, siempre agregan al principio del resultado un video particular, aunque no cumpla con
la condición de búsqueda. Notar que este video puede variar con el tiempo y debe poder cambiarse en
tiempo de ejecución. */



    public Video getVideoSponsoreado() {
        return videoSponsoreado;
    }



    public void setVideoSponsoreado(Video videoSponsoreado) {
        this.videoSponsoreado = videoSponsoreado;
    }
}
