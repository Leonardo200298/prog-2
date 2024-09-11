package practico6.ejercicio1;

public class Vehiculo extends Producto{
    private String marca;
    private double kms;
    private String patente;
    private boolean disponibilidad;
    
    public Vehiculo(String marca, double kms, String patente) {
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
        this.disponibilidad = true;

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
    public boolean estaDisponible() {
        return this.getDisponibilidad();
    }

    public boolean getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(){
        this.disponibilidad = false;
    }

}
