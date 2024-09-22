package practico7.ejercicio2;

public class CondicionTopePalabrasClave extends Condicion{
    private int tope;

    public CondicionTopePalabrasClave(int tope) {
        this.tope = tope;
    }

    @Override
    public boolean cumple(Documento dd) {
        return dd.getPalabrasClave().size() <= this.tope;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    
}
