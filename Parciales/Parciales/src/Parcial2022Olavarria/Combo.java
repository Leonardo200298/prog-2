package Parcial2022Olavarria;

import java.util.ArrayList;
import java.util.Collections;

public class Combo extends ElementoPieza {
    private ArrayList<ElementoPieza> piezas;
    private double descuento;

    public Combo(String m, double descuento) {
        super(m);
        this.descuento = descuento;
        piezas = new ArrayList<>();
    }

    public void addPieza(ElementoPieza p) {
        piezas.add(p);
    }

    public void removePieza(ElementoPieza p) {
        piezas.remove(p);
    }

    public boolean contienePieza(ElementoPieza p) {
        return piezas.contains(p);
    }

    public int getCantElementos() {
        return piezas.size();
    }

    @Override
    public int getPeso() {
        int suma = 0;
        for (ElementoPieza p : piezas) {
            suma += p.getPeso();
        }
        return suma;
    }

    @Override
    public String getColor() {

        if (this.getCantElementos() > 0) {
            return piezas.get(getCantElementos() - 1).getColor();
        } else
            return null;

    }

    @Override
    public int getCantEncastres() {
        int suma = 0, encastre = 0;
        for (ElementoPieza elementoPieza : piezas) {
            suma += elementoPieza.getCantEncastres();

        }
        encastre = this.getCantElementos();
        return suma / encastre;
    }

    @Override
    public double getCosto() {
        double suma = 0;
        for (ElementoPieza elementoPieza : piezas) {
            suma += elementoPieza.getCosto();
        }
        descuento = descuento * suma;
        return suma - descuento;
    }

    @Override
    public ArrayList<ElementoPieza> buscar(Condicion cc) {
        ArrayList<ElementoPieza> aux = new ArrayList<>();
        if (cc.cumpleElem(this)) {
            aux.add(this);
        }
        for (ElementoPieza elementoPieza : piezas) {
            aux.addAll(elementoPieza.buscar(cc));
        }
        Collections.sort(aux);
        return aux;
    }

}
