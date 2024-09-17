package practico6.ejercicio1;

public class Vehiculo extends Item{
   // De los vehículos, se registra marca, kms y patente
   private String marca;
   private int kms;
   private int patente;
   private String tipo;
   private Cliente clienteQueRenta;
public Vehiculo(String marca, int kms, int patente, String tipo) {
    this.marca = marca;
    this.kms = kms;
    this.patente = patente;
    this.tipo = tipo;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public int getKms() {
    return kms;
}
public void setKms(int kms) {
    this.kms = kms;
}
public int getPatente() {
    return patente;
}
public void setPatente(int patente) {
    this.patente = patente;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
@Override
public boolean sePuedeAlquilar() {
    if (clienteQueRenta != null) 
        return true;
    else
        return false;
}

   
}
