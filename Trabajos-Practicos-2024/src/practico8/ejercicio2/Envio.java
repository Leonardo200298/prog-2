package practico8.ejercicio2;

public abstract class Envio {
    private int tracking;

public Envio(int tracking){
    this.tracking=tracking;
}
public int getTracking() {
    return tracking;
}
public void setTracking(int i) {
    tracking = i;
}
public abstract String getDireccion();
public abstract int getPeso();
public abstract String getRetiro();
}
