package practico2.ejercicio3;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad> ciudades;
    private int corte;

    public Provincia(int corte){
        this.ciudades = new ArrayList<>();
        this.corte = corte;
    }
    public boolean ciudadesConDeficit(){
        int contador = 0;
        int contador2 = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.gastaMasDeLoQueRecauda()) {
                contador++;
            }else{
                contador2++;
            }
        }
        return contador>contador2;
    }

    public ArrayList<Ciudad> masDeCienMilHabitantes(){
        ArrayList<Ciudad> aux = new ArrayList<>();
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getPoblacion() > corte) {
                aux.add(ciudad);
            }
        }
        return aux;
    }
}
