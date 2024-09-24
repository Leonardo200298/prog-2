package practico5.Ejercicio8;

import java.util.ArrayList;

public class Asignador {
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajos;
    public Asignador() {
        evaluadores=new ArrayList<>();
        trabajos = new ArrayList<>();
    }
    public ArrayList<Evaluador> getEvaluadores() {
        return evaluadores;
    }
    public ArrayList<Trabajo> getTrabajos() {
        return trabajos;
    }
    
    public void asignarEvaluador(Evaluador ee){
        for (Trabajo t : trabajos) {
            if (t.getTemas().containsAll(ee.getTemas())) {
                t.setEe(ee);
            }
        }
    }
    public void asignarTrabajo(Trabajo tt){
        for (Evaluador e : evaluadores) {
            if (e.getTemas().containsAll(tt.getTemas())) {
                e.setTP(tt);
            }
        }
    }
    
    
}
