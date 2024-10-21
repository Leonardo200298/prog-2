package Parcial2023Quequen;

import java.util.ArrayList;

public class ColeccionablePromocional extends Coleccionable {
    private double descuento;

    public ColeccionablePromocional(String nombre, int peso, double volumen, double descuento) {
        super(nombre, peso, volumen);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public ArrayList<Coleccionable> buscar(Cond ff) {
        ArrayList<Coleccionable> aux = new ArrayList<>();
        aux.add(this);
        return aux;
    }

    @Override
    public double getCosto() {
        return super.getCosto() - super.getCosto() * descuento;
    }

}
