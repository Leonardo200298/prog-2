package practico7.ejercicio4;
import java.util.ArrayList;

public class Tablero extends ElementoJuego{
    private ArrayList<Ficha> fichas;
    private int puntajeMinimo;

    public Tablero(int puntajeMinimo) {
        this.fichas = new ArrayList<>();
        this.puntajeMinimo = puntajeMinimo;
    }


    public void agregarFicha(Ficha ff){
        if (!this.fichas.contains(ff)) {
            fichas.add(ff);
        }
    }

    public ArrayList<Ficha> getFichas(){
        return new ArrayList<>(fichas);
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public ArrayList<Ficha> busqueda(Condicion cc){
        ArrayList<Ficha> salida = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if (cc.cumple(ficha)) {
                salida.add(ficha);
            }
        }
        return salida;
    }

    @Override
    public int getDificultad() {
        int acumuladorFortaleza=0;
        int poderDeDestruccion = 0;
        for (Ficha ficha : fichas) {
            acumuladorFortaleza += ficha.getFortaleza();
            poderDeDestruccion += ficha.getPoderDeDestruccion();
        }
        return acumuladorFortaleza/poderDeDestruccion;
        
    }
    
}
