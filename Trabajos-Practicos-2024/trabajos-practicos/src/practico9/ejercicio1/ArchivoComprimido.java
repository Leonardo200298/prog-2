package practico9.ejercicio1;

import java.util.ArrayList;

public class ArchivoComprimido extends Archivo{
    private double tasaDeCompresion;

    public ArchivoComprimido(String nombre, double tamanio) {
        super(nombre, tamanio);
        //TODO Auto-generated constructor stub
    }
    
    /* El tamaño de un archivo comprimido es el tamaño de todo lo contenido
dividido el factor de compresión */
    @Override
    public double getTamanio() {
       
        return (super.getTamanio()/this.tasaDeCompresion);
    }

    public double getTasaDeCompresion() {
        return tasaDeCompresion;
    }

    public void setTasaDeCompresion(double tasaDeCompresion) {
        this.tasaDeCompresion = tasaDeCompresion;
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
