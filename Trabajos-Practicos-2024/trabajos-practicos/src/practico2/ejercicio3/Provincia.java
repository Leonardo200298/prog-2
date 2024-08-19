package practico2.ejercicio3;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad> ciudades;


    public Provincia(){
        this.ciudades = new ArrayList<>();
   
    }




    public ArrayList<Ciudad> getCiudades(){
        return this.ciudades;
    }
}
