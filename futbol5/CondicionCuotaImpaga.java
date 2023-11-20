package futbol5;

public class CondicionCuotaImpaga extends Condicion{

    @Override
    public boolean cumple(Socio socio) {
        return !socio.getCuotaPaga();
    }
    
}
