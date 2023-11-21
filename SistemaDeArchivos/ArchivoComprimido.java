package SistemaDeArchivos;

import java.util.ArrayList;

public class ArchivoComprimido extends Archivo{
    private double tasaDeCompresion;

    public ArchivoComprimido(String nombre, double tamanio, double tasaDeCompresion) {
        super(nombre, tamanio);
        this.tasaDeCompresion = tasaDeCompresion;
    }
    public double getTasaDeCompresion(){
        return tasaDeCompresion;
    }
    @Override
    public int getTamanio() {
        return (int) (super.getTamanio()*this.getTasaDeCompresion());
    }
    @Override
    public ArrayList<ElementoSistema> buscar(Condicion condicion) {
        ArrayList<ElementoSistema> salida = new ArrayList<>();
        if (condicion.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
    /*Un archivo comprimido será incluido en el resultado de la
búsqueda, si alguno de los elementos que contiene en su interior cumple con el criterio de la
búsqueda (se agrega el archivo comprimido al resultado, pero no los elementos que contiene).*/

}
