package Parcial2023Quequen;

import java.util.ArrayList;

public class ColeccionTematica extends Producto {
    protected ArrayList<Producto> productos;
    private double extra;

    public ColeccionTematica(String nombre, double extra) {
        super(nombre);
        this.extra = extra;
        productos = new ArrayList<>();
    }

    public void addProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public int getPeso() {
        int suma = 0;
        for (Producto pp : productos) {
            suma += pp.getPeso();
        }
        return suma;
    }

    @Override
    public double getVolumen() {
        double suma = 0;
        for (Producto producto : productos) {
            suma += producto.getVolumen();
        }
        double ext = extra * this.getCantColeccionables();
        return suma + ext;
    }

    @Override
    public ArrayList<String> getListaTematica() {
        ArrayList<String> aux = new ArrayList<>();
        for (Producto pp : productos) {
            for (String string : pp.getListaTematica()) {
                if (!aux.contains(string)) {
                    aux.add(string);
                }

            }
        }
        return aux;
    }

    @Override
    public ArrayList<Coleccionable> buscar(Cond ff) {
        ArrayList<Coleccionable> aux = new ArrayList<>();
        for (Producto pp : productos) {
            aux.addAll(pp.buscar(ff));
        }
        return aux;
    }

    @Override
    public int getCantColeccionables() {
        int suma = 0;
        for (Producto producto : productos) {
            suma += producto.getCantColeccionables();
        }
        return suma;
    }

}
