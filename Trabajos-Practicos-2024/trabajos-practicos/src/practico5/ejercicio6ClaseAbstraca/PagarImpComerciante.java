package practico5.ejercicio6ClaseAbstraca;

public class PagarImpComerciante extends Impuesto{
    private double montoVenta;
    @Override
    public double pagarImpuesto(Contribuyente cc) {
        return cc.getMontoFijo() + this.getMontoVenta();
    }
    public double getMontoVenta() {
        return montoVenta;
    }
    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }
    
}
