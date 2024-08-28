package practico3.ejercicio3;

import java.util.ArrayList;

public class Jugador {
    //heroe o villano
    private String tipoPersonaje;
    private String nombreReal;
    private String nombrePJ;
    private ArrayList<Caracteristica> caracteristicas;
    public Jugador(String tipoPersonaje, String nombreReal, String nombrePJ) {
        this.tipoPersonaje = tipoPersonaje;
        this.nombreReal = nombreReal;
        this.nombrePJ = nombrePJ;
        this.caracteristicas = new ArrayList<>();
    }
    public String getTipoPersonaje() {
        return tipoPersonaje;
    }
    public void setTipoPersonaje(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }
    public String getNombreReal() {
        return nombreReal;
    }
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }
    public String getNombrePJ() {
        return nombrePJ;
    }
    public void setNombrePJ(String nombrePJ) {
        this.nombrePJ = nombrePJ;
    }
    public ArrayList<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(Caracteristica cc){
        this.caracteristicas.add(cc);
    }
    
 


}
