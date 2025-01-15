package practico11.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    private ArrayList<Socio> socios;
    private Condicion condicion;


    public Club(Condicion condicion){
        this.socios = new ArrayList<>();
        this.condicion = condicion;
       
    }

        public ArrayList<Socio> buscar(Comparator<Socio> orden){
        ArrayList<Socio> salida = new ArrayList<>();
        for (Socio index : this.socios) {
            if (this.condicion.cumple(index)) {
                salida.add(index);
            }
        }
        Collections.sort(salida, orden);
        return salida;
    }

    public Condicion getCondicion() {
        return condicion;
    }
    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

}
