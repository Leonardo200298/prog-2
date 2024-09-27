package practico7.ejercicio4;

public class FichaEspecial extends Ficha{

    public FichaEspecial(int fortaleza, int espacioDelTablero, int poderDeDestruccion) {
        super(fortaleza, espacioDelTablero, poderDeDestruccion);
        
    }
    public int getPoderDeDestruccion(){
        return super.getFortaleza()/super.getEspacioDelTablero();
    }
}
