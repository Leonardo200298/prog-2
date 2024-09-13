package practico5.ejercicio6;

public class ContribuyenteComerciante extends Contribuyente{
    private double montoEnConceptoDeVentas;
    public ContribuyenteComerciante(String nombre, int cod_id_tributaria, double monto_fijo,double montoEnConceptoDeVentas) {
        super(nombre, cod_id_tributaria, monto_fijo);
        this.montoEnConceptoDeVentas = montoEnConceptoDeVentas;
    }
    
    public double getMontoEnConceptoDeVentas() {
        return montoEnConceptoDeVentas;
    }
    public void setMontoEnConceptoDeVentas(double montoEnConceptoDeVentas) {
        this.montoEnConceptoDeVentas = montoEnConceptoDeVentas;
    }
    
    
}
