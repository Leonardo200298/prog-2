package practico8.ejercicio2;

public class CartaPaquete extends ElementoEnvio{
    private String destinarioDireccion;
    private String remitenteDireccion;
    private String retiroEnSucursal;
    private double peso;

    

    public CartaPaquete(String ciudadDestino, String destinarioDireccion, String remitenteDireccion,
            String retiroEnSucursal, double peso) {
        super(ciudadDestino);
        this.destinarioDireccion = destinarioDireccion;
        this.remitenteDireccion = remitenteDireccion;
        this.retiroEnSucursal = retiroEnSucursal;
        this.peso = peso;
    }

    public String getDestinarioDireccion() {
        return destinarioDireccion;
    }

    public void setDestinarioDireccion(String destinarioDireccion) {
        this.destinarioDireccion = destinarioDireccion;
    }

    public String getRemitenteDireccion() {
        return remitenteDireccion;
    }

    public void setRemitenteDireccion(String remitenteDireccion) {
        this.remitenteDireccion = remitenteDireccion;
    }

    public String getRetiroEnSucursal() {
        return retiroEnSucursal;
    }

    public void setRetiroEnSucursal(String retiroEnSucursal) {
        this.retiroEnSucursal = retiroEnSucursal;
    }
    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    
}
