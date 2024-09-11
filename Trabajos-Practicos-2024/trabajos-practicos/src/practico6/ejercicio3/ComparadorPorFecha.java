package practico6.ejercicio3;

public class ComparadorPorFecha extends ComparadorDeVehiculo{
    @Override
    public boolean comparaVehiculos(Vehiculo v1, Vehiculo v2) {
        
        return v1.getFechaCarga().isBefore(v2.getFechaCarga());
    }
}
