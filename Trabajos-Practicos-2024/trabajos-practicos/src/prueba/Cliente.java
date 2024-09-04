package prueba;

public class Cliente extends Persona{

    private double compras;
    public Cliente(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }
    public double getCompras() {
        return compras;
    }
    public void addCompra(double compra) {
        this.compras += compra;
    }

    public boolean recibeDescuento() {
        return this.getCompras() >= 5000;
    }
}
