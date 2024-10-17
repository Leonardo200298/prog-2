package practico8.ejercicio2;
/*una carta/paquete posee un destinatario con su dirección,
un remitente con su dirección, si la retiran en la sucursal de destino o la envían a
domicilio, y su peso.*/
public class EnvioPaquete extends Envio {
    private String direccion;
    private String retiro;
    private int peso;
    public EnvioPaquete(int tracking, String direccion, String retiro, int peso){
        super(tracking);
        this.direccion = direccion;
        this.retiro = retiro;
        this.peso = peso;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getRetiro() {
        return retiro;
    }
    public void setRetiro(String retiro) {
        this.retiro = retiro;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
