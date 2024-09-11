package practico6.ejercicio3;

public class ComparadorPorCapacidad extends ComparadorDeVehiculo{
    @Override
    public boolean comparaVehiculos(Vehiculo v1, Vehiculo v2) {
        
        return v1.getCapacidad() > v2.getCapacidad();
    }
}
