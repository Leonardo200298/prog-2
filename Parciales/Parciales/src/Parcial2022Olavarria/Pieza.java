package Parcial2022Olavarria;

import java.util.ArrayList;

public class Pieza extends ElementoPieza {
    private String color;
    private int encastre;
    private int peso;
    private double costo;

    public Pieza(String m, String color, int encastre, int peso, double costo) {
        super(m);
        this.color = color;
        this.encastre = encastre;
        this.peso = peso;
        this.costo = costo;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getCantEncastres() {
        return encastre;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public ArrayList<ElementoPieza> buscar(Condicion cc) {
        ArrayList<ElementoPieza> aux = new ArrayList<>();
        if (cc.cumpleElem(this)) {
            aux.add(this);
        }
        return aux;
    }

}
