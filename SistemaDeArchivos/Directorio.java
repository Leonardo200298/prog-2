package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Directorio extends ElementoSistema{
    private ArrayList<ElementoSistema> elementos;

    public Directorio(String nombre,double tamanio) {
        super(nombre,tamanio);
        this.elementos = new ArrayList<>();
    }
    @Override
    public double getTamanio() {
        int tamanio=0;
        for (ElementoSistema i : elementos) {
            tamanio+=i.getTamanio();
        }
        return tamanio;
    }
   
    @Override
    public ArrayList<ElementoSistema> buscar(Condicion condicion) {
        ArrayList<ElementoSistema> salida= new ArrayList<>();
        for (ElementoSistema e : elementos) {
            if (condicion.cumple(this)) {
                salida.addAll(e.buscar(condicion));
            }
        }
        return salida;
    }
    public ArrayList<ElementoSistema> buscarConOrdenamiento(Condicion condicion, Comparator<ElementoSistema> comparador){
      /*   ArrayList<ElementoSistema> salida = new ArrayList<>();
        for (ElementoSistema it : elementos) {
            if (condicion.cumple(this)){

            }
        }
        return salida; */
        ArrayList <ElementoSistema> elementosConBusqueda = new ArrayList<>();
        elementosConBusqueda.addAll(this.buscar(condicion));
        if (elementosConBusqueda.size()>0) {
            Collections.sort(elementosConBusqueda,comparador);
        }
        
        return elementosConBusqueda;
    }
    @Override
    public String getNombre() {
        
        return super.nombre;
    }
    @Override
    public LocalDate getFechaDeCreacion() {
        return super.fechaDeCreacion;
    }

}
