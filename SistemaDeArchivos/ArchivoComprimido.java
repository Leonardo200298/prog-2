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
    public double getTamanio() {
        return super.getTamanio()*this.getTasaDeCompresion();
    }
    @Override
    public ArrayList<ElementoSistema> buscar(Condicion condicion) {
        ArrayList<ElementoSistema> salida = new ArrayList<>();
        if (condicion.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
   

}
