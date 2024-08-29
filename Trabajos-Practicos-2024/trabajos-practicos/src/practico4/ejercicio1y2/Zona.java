package practico4.ejercicio1y2;

import java.util.ArrayList;

public class Zona {
    private String lugar;
    private ArrayList<Sensor> sensores;
    public Zona(String pieza, String banio, String estar) {
       
        this.lugar = lugar;
        this.sensores = new ArrayList<>();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean hayMovimiento() {
        for (Sensor sensor : sensores) {
            if (sensor.activaSensor(this.lugar)) {
                return true;
            }
        }
        return false;
    }
    
    
}
