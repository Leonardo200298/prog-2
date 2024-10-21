package Parcial2023Quequen;

import java.util.ArrayList;

public abstract class Producto {
    private String nombre;
    static double costo;
    static double precioGramo;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setCosto(double costo) {
        Coleccionable.costo = costo;
    }

    public static double getPrecioGramo() {
        return precioGramo;
    }

    public static void setPrecioGramo(double precioGramo) {
        Coleccionable.precioGramo = precioGramo;
    }

    public abstract int getPeso();

    public abstract double getVolumen();

    public abstract ArrayList<String> getListaTematica();

    public abstract ArrayList<Coleccionable> buscar(Cond ff);

    public abstract int getCantColeccionables();

    public double getCosto() {
        return (this.getCantColeccionables() * costo) + (this.getPeso() * precioGramo);
    }
}
