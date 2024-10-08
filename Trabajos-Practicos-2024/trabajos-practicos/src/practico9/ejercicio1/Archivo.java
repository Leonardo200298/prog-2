package practico9.ejercicio1;

import java.util.ArrayList;

public class Archivo extends ElementoSA{
    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public ArrayList<ElementoSA> busqueda(Condicion ee) {
        ArrayList<ElementoSA> salida = new ArrayList<>();
        if (ee.cumple(this)) {
            salida.add(this);
        }
        return salida;
    }
    
    
}
