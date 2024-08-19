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
            for (Ciudad ciudad : p.ciudadesQueMasGastan(c)) {
                if (ciudad.getPoblacion() < this.habitantesCiudad && ciudad.recaudacion() < ciudad.getGastos()) {
                    
                    ciudadesQueMasGast.add(ciudad);
                }
            }
        }
        return ciudadesQueMasGast;
    }
    public ArrayList<Provincia> provinciasConMasDeLasCiudadesEnCrisis(Ciudad c){

        ArrayList<Provincia> pmc = new ArrayList<>();
        for (Provincia p : provincias) {
           if (c.gastaMasDeLoQueRecauda(c) && p.masDeLasMitad(c)) {
                pmc.add(p);
           }
        }
        return pmc;
    }

}
