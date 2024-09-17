package practico6.ejercicio1Refactoring;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Item {
    private LocalDate fechaAlq;
    private ArrayList<Cliente> clientes;

    public abstract boolean alquiler();

    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(LocalDate fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public ArrayList<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
   
    public ArrayList<Cliente> getClientesQueNoDevolvieronItem(Item ii){
        ArrayList<Cliente> clientesAtrasados = new ArrayList<>();
        for (Cliente cli : clientes) {
            if (ii.getFechaAlq().isBefore(LocalDate.now())) {
                clientesAtrasados.add(cli);
            }
        }
        return clientesAtrasados;
    }
}
