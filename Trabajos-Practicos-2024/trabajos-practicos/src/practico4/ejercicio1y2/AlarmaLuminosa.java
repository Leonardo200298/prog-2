package practico4.ejercicio1y2;

import java.util.ArrayList;

public class AlarmaLuminosa extends Alarma{
     private ArrayList<Zona> zonas;
    private Timbre timbre;
    private Luz luz;
    public AlarmaLuminosa(){
        
        this.zonas = new ArrayList<>();
        this.timbre = new Timbre();

    }

    public void comprobar(){
        for (Zona zona : zonas) {
            if (zona.hayMovimiento()) {
                String ruidoDeTimbre = this.timbre.hacerSonar();
                luz.setLuzParpadeante(true);
                System.out.println(ruidoDeTimbre);
            }
        }
    }

}
