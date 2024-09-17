package practico6.ejercicio2;

public class OrdenarPorComputadora extends OrdenarComputador{

    @Override
    public boolean ordenarPorVelocidad(Computadora cc, Computadora cc1) {
        return cc.getVelocidad() > cc1.getVelocidad();
    }
    
}
