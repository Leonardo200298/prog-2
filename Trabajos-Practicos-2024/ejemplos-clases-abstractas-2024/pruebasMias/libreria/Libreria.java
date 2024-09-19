import java.util.ArrayList;

public class Libreria {
    private String nombreLibreria;
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;

    public Libreria(String nombreLibreria) {
        this.nombreLibreria = nombreLibreria;
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public double conocerPrecio(Producto pp, Cliente cc){
        double descuento = cc.getDescuento();
        return pp.getPrecio() - descuento;

    }
    public ArrayList<Cliente> getClientesQueLesGustaUnProducto(Producto pp){
        ArrayList<Cliente> clientesQueLesGustaUnProducto = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.leGusta(pp)) {
                clientesQueLesGustaUnProducto.add(cliente);
            }
        }
        return clientesQueLesGustaUnProducto;
    }
}
