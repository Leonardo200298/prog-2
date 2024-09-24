package practico5.Ejercicio8;

import java.util.ArrayList;

public class Trabajo {
    private String tipo;
    private ArrayList<String> temas;
    private Evaluador ee;

    public Trabajo(String tipo){
        this.tipo = tipo;
        temas= new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getTemas() {
        return temas;
    }

    public void addTema(String tema) {
        temas.add(tema);
    }

    public void setTemas(ArrayList<String> temas) {
        this.temas = temas;
    }

    public Evaluador getEe() {
        return ee;
    }

    public void setEe(Evaluador ee) {
        this.ee = ee;
    }
    

}
