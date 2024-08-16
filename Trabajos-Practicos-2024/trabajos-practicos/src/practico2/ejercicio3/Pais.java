package practico2.ejercicio3;

import java.util.ArrayList;

public class Pais {
  
    private ArrayList <Provincia> provincias;

    public Pais(){
        this.provincias = new ArrayList<>();
    }
    
    public ArrayList<Ciudad> gastaMasDeLoQueRecaudan(Ciudad d){
        ArrayList<Ciudad> aux = new ArrayList<>();
        for (Provincia p : provincias) {
            if (p.gastaMasDeLoQueRecaudda(d)){
                aux.add(d);
            }
        }
        return aux;
    }
    public ArrayList<Provincia> provinciasConDeficit(){
        ArrayList<Provincia> aux = new ArrayList<>();
        for (Provincia provincia : provincias) {
            if (provincia.ciudadesConDeficit()){
                aux.add(provincia);
            }
        }
        return aux;
    }
}
