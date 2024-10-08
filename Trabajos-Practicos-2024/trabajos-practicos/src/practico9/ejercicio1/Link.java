package practico9.ejercicio1;

import java.util.ArrayList;

public class Link extends ElementoSA{
    private static double peso = 1.0;

    public Link(String nombre) {
        super(nombre);
        
    }

    @Override
    public double getTamanio() {
        return 1;
    }

    public static double getPeso() {
        return peso;
    }

    public static void setPeso(double peso) {
        Link.peso = peso;
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
