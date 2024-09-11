package practico6.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {
    private Cliente cliente;
    private Producto producto;
    private LocalDate fechaLimite;

    
    public Alquiler(Cliente cliente, Producto producto, LocalDate fechaLimite){
        this.cliente = cliente;
        this.producto = producto;
        this.fechaLimite = fechaLimite;

    }

    public LocalDate getFechaLimite(){
        return this.fechaLimite;
    }
    public boolean estaVencido(){
        return this.getFechaLimite().isBefore(LocalDate.now());
    }


    public ArrayList<Cliente> clientesQueSeLesVencioElAlquiler(Alquiler a1){
        ArrayList<Cliente> aux = new ArrayList<>();
        if (a1.estaVencido()) {
            aux.add(a1.cliente);
        }
        return aux;
    }

    public void alquilar(Producto productoParaAlquilar){
        if (producto.estaDisponible()) {
            this.producto = productoParaAlquilar;
        }else{
            System.out.println("El producto +" + producto + " no esta disponible");
        }
    }

    @Override
    public String toString() {
        return "Alquiler [cliente=" + cliente + ", producto=" + producto + ", fechaLimite=" + fechaLimite
                ;
    }

    

}
