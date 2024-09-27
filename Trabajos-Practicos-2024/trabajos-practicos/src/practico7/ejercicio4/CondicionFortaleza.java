package practico7.ejercicio4;

public class CondicionFortaleza extends Condicion{
    private int fortaleza;

    public CondicionFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha ff) {
        return ff.getFortaleza() > this.fortaleza;
    }
    
}
