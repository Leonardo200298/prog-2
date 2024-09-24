package practico7.ejercicio1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> patologias;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        patologias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addPatologia(String p){
        patologias.add(p);
    }
    public ArrayList<String> getPatologias(){
        return new ArrayList<>(patologias);
    }
}
