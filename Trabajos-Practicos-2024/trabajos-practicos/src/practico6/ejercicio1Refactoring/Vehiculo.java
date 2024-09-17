package practico6.ejercicio1Refactoring;

public class Vehiculo extends Item{
    private String marca;
    private double kms;
    private String patente;
    private Cliente cliente;
    
    public Vehiculo(String marca, double kms, String patente) {
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public boolean alquiler() {
        return this.cliente == null;
    }

    
}
