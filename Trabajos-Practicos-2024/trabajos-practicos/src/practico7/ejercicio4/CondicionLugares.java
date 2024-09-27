package practico7.ejercicio4;

public class CondicionLugares extends Condicion{
    private int espacio;

    

    public CondicionLugares(int espacio) {
        this.espacio = espacio;
    }

    @Override
    public boolean cumple(Ficha ff) {
        return ff.getEspacioDelTablero() > this.espacio;
    }
    
}
