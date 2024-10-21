package Parcial2023TresArroyos;

public class CostoFijo extends Costo {
    private double costo;

    public CostoFijo(double costo) {
        this.costo = costo;
    }

    public double calculo(Presupuesto p) {
        return costo;
    }
}
