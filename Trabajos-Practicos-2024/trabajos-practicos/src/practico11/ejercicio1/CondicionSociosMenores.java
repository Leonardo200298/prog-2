package practico11.ejercicio1;

public class CondicionSociosMenores extends Condicion{
    private int edad;
     
    public CondicionSociosMenores(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Socio ss) {
        return ss.getEdad() == this.edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
