package practico6.ejercicio3;
import java.util.ArrayList;

public class ColaDeEspera {
    private ArrayList<Vehiculo> vehiculosEnEspera;
    private ComparadorDeVehiculo comparador;

    public ColaDeEspera(ComparadorDeVehiculo comparador) {
        this.vehiculosEnEspera = new ArrayList<>();
        this.comparador = comparador;
    }

    
}
