package practico4.ejercicio1y2;

public class Sensor {
    private boolean sensorEspecifico;

    public Sensor() {
        this.sensorEspecifico = false;

    }

    public void setLugarDeLaCasa(boolean flag){
        this.sensorEspecifico = flag;
    }

    public boolean activaSensor(String lugar){
        setLugarDeLaCasa(true);
        return true;
    }
    

}
