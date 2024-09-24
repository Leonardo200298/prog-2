package practico5.Ejercicio8;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private ArrayList<String> temas;
    private Trabajo t;
    public Evaluador(String nombre){
        this.nombre=nombre;
        temas= new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addTema(String tema){
        temas.add(tema);
    }
    public ArrayList<String> getTemas() {
        return temas;
    }
    public void setTP(Trabajo tt) {
        t=tt;
    }
}
