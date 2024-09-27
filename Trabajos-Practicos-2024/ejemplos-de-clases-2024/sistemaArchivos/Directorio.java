package sistemaArchivos;

import sistemaArchivos.condiciones.Condicion;

import javax.swing.text.Element;
import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ElementoSA {
    private ArrayList<ElementoSA> elementos;

    public Directorio(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSA nuevo){
        this.elementos.add(nuevo);
    }

    public boolean tieneElemento(ElementoSA elem){
        return elementos.contains(elem);
    }

    public void removeElemento(ElementoSA aBorrar){
        this.elementos.remove(aBorrar);  //NO OLVIDAR EL EQUALS
    }

    public double getTamanio(){
        //return elementos.size(); MAL: solo recorre un niveld
        /*for (int i = 0; i < elementos.size(); i++) {
            ElementoSA elem = elementos.get(i);
            //hago algo con elem
        }*/
        double total = 0.0;
        for (ElementoSA elem:elementos) {
            //hago algo con elem
            total += elem.getTamanio();
        }
        return total;
    }

    public int cantElementos(){
        int total = 0;
        for (ElementoSA elem:elementos) {
            total += elem.cantElementos();
        }
        return total+1;
    }

    public ArrayList<Archivo> buscar(Condicion condicion){
        ArrayList<Archivo> retorno = new ArrayList<>();
        for (ElementoSA elem:elementos){
            ArrayList<Archivo> resultadoParcial = elem.buscar(condicion);
            for (Archivo archivoQueCumple:resultadoParcial)
                retorno.add(archivoQueCumple);
        }
        return retorno;
    }
}
