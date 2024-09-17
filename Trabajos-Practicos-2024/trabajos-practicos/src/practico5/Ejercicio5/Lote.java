package practico5.Ejercicio5;

import java.util.ArrayList;

public class Lote {
    private int hectareas;
    private ArrayList<Mineral> minerales;
    public Lote(int hectareas) {
        this.hectareas = hectareas;
        this.minerales = new ArrayList<>();
    }
    public int getHectareas() {
        return hectareas;
    }
    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }
    public ArrayList<Mineral> getMinerales(){
        return minerales;
    }
    
}
