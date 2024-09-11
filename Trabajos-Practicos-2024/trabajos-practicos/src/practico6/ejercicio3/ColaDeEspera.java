package practico6.ejercicio3;

import java.util.ArrayList;

public class ColaDeEspera {
    private ArrayList<Vehiculo> vehiculosEnEspera;
    private ComparadorDeVehiculo comparador;

    public ColaDeEspera(ComparadorDeVehiculo comparador) {
        this.vehiculosEnEspera = new ArrayList<>();
        this.comparador = comparador;
    }

    public void agregarVehiculo(Vehiculo v1) {
        int lugar = 0;
        while (lugar < vehiculosEnEspera.size() && comparador.comparaVehiculos(vehiculosEnEspera.get(lugar), v1)) {
            lugar++;
        }
        if (lugar < vehiculosEnEspera.size()) {
            vehiculosEnEspera.add(lugar, v1);
        } else {
            vehiculosEnEspera.add(v1);
        }
    }

    public boolean tieneVehiculos() {
        return this.vehiculosEnEspera.size() > 0;
    }

    public Vehiculo getPrimera() {
        if (vehiculosEnEspera.size() > 0) {
            Vehiculo t0 = vehiculosEnEspera.get(0);
            vehiculosEnEspera.remove(0);
            return t0;
        } else {
            return null;
        }
    }

    public void copiarA(ColaDeEspera cc) {
        while (this.tieneVehiculos()) {
            cc.agregarVehiculo(this.getPrimera());
        }
    }

}
