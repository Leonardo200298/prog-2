package practico2.ejercicio3;

import java.util.ArrayList;

public class Pais {
  

    public Pais(){
        this.provincias = new ArrayList<>();
    }
    public ArrayList<Ciudad> ciudadesConMasDeCienHabitantes(Provincia p){
        return p.masDeCienMilHabitantes();
    }
    public boolean gastaMasDeLoQueRecaudan(Ciudad d){
        return d.gastaMasDeLoQueRecauda();
    }
}
