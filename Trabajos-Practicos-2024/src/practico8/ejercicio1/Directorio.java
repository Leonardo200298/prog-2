package practico8.ejercicio1;
//Los directorios tienen un
//nombre, una fecha de creación y además contienen un conjunto de archivos y un conjunto de
//sub-directorios

import java.util.ArrayList;

public class Directorio extends ElementoSA {

    protected ArrayList<ElementoSA>  elementos;
    public Directorio (String nombre){
        super(nombre);
        elementos = new ArrayList<>();
    }
    public void addElemento(ElementoSA ee){
        elementos.add(ee);
    }
    @Override
    public double getTamanio() {
        double suma=0;
        for (ElementoSA ee : elementos) {
            suma+=ee.getTamanio();
        }
        return suma;
    }
    public int getCantElementos(){
        int suma=0;
        for (ElementoSA ee : elementos) {
            suma+=ee.getCantElementos();
        }
        return suma;
    }
    
    

}
