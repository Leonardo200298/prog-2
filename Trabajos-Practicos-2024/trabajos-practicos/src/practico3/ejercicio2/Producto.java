package practico3.ejercicio2;

public class Producto {
    private boolean vendido;
    private String tipo;
    private double peso;
    private double costoFabricacion;
    private double valorVenta;
    private String tipoDeMadera;
    private String color;
    private double tasaDeRecarga;

    public Producto(boolean vendido, String tipo, double peso, double costoFabricacion, double valorVenta,
            String tipoDeMadera, String color, double tasaDeRecarga) {
        this.vendido = false;
        this.tipo = tipo;
        this.peso = peso;
        this.costoFabricacion = costoFabricacion;
        this.valorVenta = valorVenta;
        this.tipoDeMadera = tipoDeMadera;
        this.color = color;
        this.tasaDeRecarga = 1.30;
    }
    public boolean isVendido() {
        return vendido;
    }
    public void setVendido(boolean vendido) {
        this.vendido = true;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getTipoDeMadera() {
        return tipoDeMadera;
    }
    public void setTipoDeMadera(String tipoDeMadera) {
        this.tipoDeMadera = tipoDeMadera;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getCostoFabricacion() {
        return costoFabricacion;
    }
    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }
    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }
    public double getTasaDeRecarga(){
        return this.tasaDeRecarga;
    }
    public double getValorDeVenta(){
        return this.costoFabricacion()*this.getTasaDeRecarga();
    }
    
}
