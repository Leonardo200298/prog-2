package practico4.ejercicio1y2;

import java.util.ArrayList;

public class Alarma {
    
    private ArrayList<Zona> zonas;
    private Timbre timbre;
    public Alarma(){
        
        this.zonas = new ArrayList<>();
        this.timbre = new Timbre();

    }

    public void comprobar(){
        for (Zona zona : zonas) {
            if (zona.hayMovimiento()) {
                String ruidoDeTimbre = this.timbre.hacerSonar();
                System.out.println(ruidoDeTimbre);
            }
        }
    }

}
