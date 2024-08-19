package practico2.ejercicio3;

import java.util.ArrayList;

public class Pais {
  
    private ArrayList <Provincia> provincias;
    private int habitantesCiudad; 
    public Pais(){
        this.provincias = new ArrayList<>();
        this.habitantesCiudad = 100000;
    }
    /* las ciudades que gastan más de lo que recaudan,  */
    
    public ArrayList<Ciudad> ciudadesQueMasGastan(Ciudad c){
        ArrayList<Ciudad> ciudadesQueMasGast = new ArrayList<>();
        
        for (Provincia p : provincias) {
            for (Ciudad ciudad : p.getCiudades()) {
                if (ciudad.getPoblacion() < this.habitantesCiudad && ciudad.recaudacion() < ciudad.getGastos()) {
                    
                    ciudadesQueMasGast.add(ciudad);
                }
            }
        }
        return ciudadesQueMasGast;
    }
    public ArrayList<Provincia> provinciasConMasDeLasCiudadesEnCrisis(){
        ArrayList<Provincia> arrP = new ArrayList<>();
        ArrayList<Ciudad> arrC = new ArrayList<>();
        
        for (Provincia p : provincias) {
            for (Ciudad ci : p.getCiudades()) {
                if (ci.getPoblacion() < this.habitantesCiudad && ci.recaudacion() < ci.getGastos()) {
                        arrC.add(ci);
                }
                
            }
            if (p.getCiudades().size() < (arrC.size()/2)){
                arrP.add(p);
            }
        }
        return arrP;
    }

}
