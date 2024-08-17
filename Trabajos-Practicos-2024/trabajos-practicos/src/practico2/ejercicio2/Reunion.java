package practico2.ejercicio2;
import java.util.ArrayList;
public class Reunion {
    private String lugar;
    private String tema;
    private int duracionMinutos;
    private ArrayList<Usuario> usuarios;

    public Reunion(String lugar, String tema, int duracionMinutos) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracionMinutos = duracionMinutos;
        usuarios = new ArrayList<>();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    

    
}
