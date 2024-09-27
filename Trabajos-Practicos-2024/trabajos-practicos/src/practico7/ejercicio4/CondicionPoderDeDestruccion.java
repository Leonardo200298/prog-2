package practico7.ejercicio4;

public class CondicionPoderDeDestruccion extends Condicion{
    private int topePoderDestruccion;

    public CondicionPoderDeDestruccion(int topePoderDestruccion) {
        this.topePoderDestruccion = topePoderDestruccion;
    }

    public int getTopePoderDestruccion() {
        return topePoderDestruccion;
    }

    public void setTopePoderDestruccion(int topePoderDestruccion) {
        this.topePoderDestruccion = topePoderDestruccion;
    }

    @Override
    public boolean cumple(Ficha ff) {
        return ff.getPoderDeDestruccion() > this.topePoderDestruccion;
    }

    
}
