package Parcial2023TresArroyos;

public class CostoFijoCantDias extends Costo {
    private double costo;

    public CostoFijoCantDias(double costo) {
        this.costo = costo;
    }

    public double calculo(Presupuesto p) {
        return p.getTiempoEstimado() * costo;
    }
}
