package practico7.ejercicio4;

public class Ficha extends ElementoJuego{
    private int fortaleza;
    private int espacioDelTablero;
    private int poderDeDestruccion;

    public Ficha(int fortaleza, int espacioDelTablero, int poderDeDestruccion) {
        this.fortaleza = fortaleza;
        this.espacioDelTablero = espacioDelTablero;
        this.poderDeDestruccion = poderDeDestruccion;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacioDelTablero() {
        return espacioDelTablero;
    }

    public void setEspacioDelTablero(int espacioDelTablero) {
        this.espacioDelTablero = espacioDelTablero;
    }

    public int getPoderDeDestruccion() {
        return poderDeDestruccion;
    }

    public void setPoderDeDestruccion(int poderDeDestruccion) {
        this.poderDeDestruccion = poderDeDestruccion;
    }

    @Override
    public int getDificultad() {
        return 0;
    }
    
}
