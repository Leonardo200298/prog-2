package practico5.ejercicio6;

public class ContribuyenteProgramador extends Contribuyente{
    private double valorPorElDesarrolloDelSoftware;
    public ContribuyenteProgramador(String nombre, int cod_id_tributaria, double monto_fijo,double valorPorElDesarrolloDelSoftware) {
        super(nombre, cod_id_tributaria, monto_fijo);
        this.valorPorElDesarrolloDelSoftware = valorPorElDesarrolloDelSoftware;
    }
    public double getValorPorElDesarrolloDelSoftware() {
        return valorPorElDesarrolloDelSoftware;
    }
    public void setValorPorElDesarrolloDelSoftware(double valorPorElDesarrolloDelSoftware) {
        this.valorPorElDesarrolloDelSoftware = valorPorElDesarrolloDelSoftware;
    }
    
}
