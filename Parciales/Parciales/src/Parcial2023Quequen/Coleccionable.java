package Parcial2023Quequen;

import java.util.ArrayList;

public class Coleccionable extends Producto {
    private int peso;
    private double volumen;
    private ArrayList<String> caracteristicas;

    public Coleccionable(String nombre, int peso, double volumen) {
        super(nombre);
        this.peso = peso;
        this.volumen = volumen;
        caracteristicas = new ArrayList<>();

    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public ArrayList<String> getListaTematica() {
        return new ArrayList<>(caracteristicas);
    }

    @Override
    public ArrayList<Coleccionable> buscar(Cond ff) {
        ArrayList<Coleccionable> aux = new ArrayList<>();
        if (ff.cumpleCondicion(this)) {
            aux.add(this);
        }
        return aux;
    }

    @Override
    public int getCantColeccionables() {
        return 1;
    }

}
