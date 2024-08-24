package practico3.ejercicio2;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Producto> productos;

    public Fabrica(){
        this.productos = new ArrayList<>();
    }
    public double precioDeTodosLosProductos(){
        double aux=0;
        for (Producto pp : productos) {
           aux+=pp.getCostoFabricacion() + pp.getValorDeVenta(); 
        }
        return aux;
    }

    public ArrayList<Producto> getProductosDisponibles(){
        ArrayList productosDisponibles = new ArrayList<>();
        for (Producto pp : productos) {
            if (pp.isVendido()) {
                productosDisponibles.add(pp);
            }
        }
        return productosDisponibles;
    }
}
