package practico2.ejercicio3;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad> ciudades;
    private int corte;

    public Provincia(int corte){
        this.ciudades = new ArrayList<>();
        this.corte = corte;
    }
    public ArrayList<Ciudad> ciudadesQueMasGastan(Ciudad c){
        ArrayList<Ciudad> ciudadesGastadoras = new ArrayList<>();
        for (Ciudad ciudad : ciudades) {
            if (ciudad.gastaMasDeLoQueRecauda(c)) {
                ciudadesGastadoras.add(ciudad);
            }
        }
        return ciudadesGastadoras;
    }

    public boolean masDeLasMitad(Ciudad c){
        int contador = 0;
        int contador2 = 0;
        for (Ciudad ciudad : ciudades) {
            
            if (ciudad.gastaMasDeLoQueRecauda(c)) {
                contador++;
                
            }else{
                contador2++;
            }
        }
      
        return contador>contador2;
    }
}
