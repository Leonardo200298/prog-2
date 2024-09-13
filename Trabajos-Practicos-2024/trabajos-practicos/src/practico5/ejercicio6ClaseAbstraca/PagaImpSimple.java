package practico5.ejercicio6ClaseAbstraca;

public class PagaImpSimple extends Impuesto{
    private double impuesto;
    @Override
    public double pagarImpuesto(Contribuyente cc) {
        return cc.getMontoFijo()+this.getImpuesto();
    }
    public double getImpuesto() {
        return impuesto;
    }
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
}
