package practico11.ejercicio1;

public class CondicionSocioPrecio extends Condicion{
    private double precio;
    
    public CondicionSocioPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Socio ss) {
        return ss.precioCancha(precio);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
