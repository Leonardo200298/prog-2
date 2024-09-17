package practico6.ejercicio1;

import java.util.ArrayList;

public class SistemaDeAlquiler {
    private ArrayList<Item> items;
    private ArrayList<Cliente> clientes;

    public SistemaDeAlquiler(){
        items = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void setItems(Item item) {
        items.add(item);
    }

    public ArrayList<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }

    public void setClientes(Cliente cliente) {
        clientes.add(cliente);
    }
    public void alquilarItem(Item i, Cliente c){
        for (Item item :items) {
            if (item.equals(i)) {
                i.sePuedeAlquilar();
                setClientes(c);
            }
        }
    }
    

    
}
