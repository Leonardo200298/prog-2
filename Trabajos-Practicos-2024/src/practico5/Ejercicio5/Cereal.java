package practico5.Ejercicio5;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<Mineral> mineralesNecesarios;
    public Cereal(String nombre){
        this.nombre=nombre;
        mineralesNecesarios=new ArrayList<>();
    }
    public ArrayList<Mineral> getMineralesNecesarios() {
        return mineralesNecesarios;
    }
    public void addMineral(Mineral aa){
        mineralesNecesarios.add(aa);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
