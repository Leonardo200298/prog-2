package Parcial2022Olavarria;

import java.util.ArrayList;

public abstract class ElementoPieza implements Comparable<ElementoPieza> {
    private String marca;

    public ElementoPieza(String m) {
        marca = m;
    }

    public abstract int getPeso();

    public abstract String getColor();

    public abstract int getCantEncastres();

    public abstract double getCosto();

    public abstract ArrayList<ElementoPieza> buscar(Condicion cc);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            ElementoPieza otro = (ElementoPieza) obj;
            return this.getMarca().equals(otro.getMarca()) && this.getCosto() == otro.getCosto();
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int compareTo(ElementoPieza arg0) {
        if (this.marca.equals(arg0.getMarca())) {
            if (this.getCosto() != (arg0.getCosto())) {
                if (this.getCosto() > arg0.getCosto()) {
                    return 1;
                } else if (this.getCosto() < arg0.getCosto()) {
                    return -1;
                } else {
                    if (this.getCantEncastres() > (arg0.getCantEncastres())) {
                        return 1;
                    } else if (this.getCantEncastres() < arg0.getCantEncastres()) {
                        return -1;
                    } else {
                        return this.getColor().compareTo(arg0.getColor());
                    }
                }
            }
        }
        return this.getMarca().compareTo(arg0.getMarca());
    }

}
