package practico5.ejercicio6ClaseAbstraca;

public class PagarImpProgramador extends Impuesto{
    private double ventaPorDesarrolloSoftware;
    @Override
    public double pagarImpuesto(Contribuyente cc) {
        return cc.getMontoFijo()+this.getVentaPorDesarrolloSoftware();
    }
    public double getVentaPorDesarrolloSoftware() {
        return ventaPorDesarrolloSoftware;
    }
    public void setVentaPorDesarrolloSoftware(double ventaPorDesarrolloSoftware) {
        this.ventaPorDesarrolloSoftware = ventaPorDesarrolloSoftware;
    }

    
    
}
