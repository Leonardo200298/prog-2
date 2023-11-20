package futbol5;

public class CondicionPorEdad extends Condicion{
    private int edad;

    public CondicionPorEdad(int edad){
        this.edad = edad;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getEdad() > this.edad;
    }
    
    
}
