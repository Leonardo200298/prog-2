package practico7.ejercicio1;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private ArrayList<Cultivo> cultivoNoUsar;
    private ArrayList<String> patologias;

    public Producto(String nn){
        nombre = nn;
        cultivoNoUsar = new ArrayList<>();
        patologias = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addCultivo(Cultivo cc){
        cultivoNoUsar.add(cc);
    }
    public void addPatologia(String ss){
        patologias.add(ss);
    }

    public ArrayList<String> getPatologias() {
       return new ArrayList<>(patologias);
    }
    public ArrayList<Cultivo> getCultivosProhibidos() {
        return new ArrayList<>(cultivoNoUsar);
     }
}
