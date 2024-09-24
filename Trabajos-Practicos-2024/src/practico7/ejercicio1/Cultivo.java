package practico7.ejercicio1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesProbables;

    public Cultivo(String nombre){
        this.nombre = nombre;
        enfermedadesProbables = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addEnfermedad(Enfermedad ee){
        enfermedadesProbables.add(ee);
    }
    
    public boolean productoPosibleUso(Producto pp){
        ArrayList<Enfermedad> aux = new ArrayList<>();
        for (Enfermedad enfermedad : enfermedadesProbables) {
            if (enfermedad.getPatologias().containsAll(pp.getPatologias())) {
                aux.add(enfermedad);
            }
        }
        if (aux.containsAll(enfermedadesProbables)) 
            return true;
        else
            return false;
    }
}
