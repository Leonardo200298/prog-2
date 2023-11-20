package futbol5;

public class CondicionPrecioMayor extends Condicion {
    private double precio;

    public CondicionPrecioMayor(double precio){
        this.precio = precio;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.alquilerMayor(precio);
    }
    
}
