package practico2.ejercicio3;

import java.util.ArrayList;

public class Pais {
  
    private ArrayList <Provincia> provincias;

    public Pais(){
        this.provincias = new ArrayList<>();
    }
    /* las ciudades que gastan más de lo que recaudan,  */
    
    public ArrayList<Ciudad> ciudadesQueMasGastan(Ciudad c){
        ArrayList<Ciudad> ciudadesQueMasGast = new ArrayList<>();
        for (Provincia p : provincias) {
            for (Ciudad ciudad : p.ciudadesQueMasGastan(c)) {
                
                ciudadesQueMasGast.add(ciudad);
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
    /*   */
}
