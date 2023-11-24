package recuperatorio_2023;

import java.util.ArrayList;


public abstract class Tarjeta {
    public abstract int getTiempoDeEjecucion();
    public abstract double getCantidadDeEnergiaNecesaria();
    public abstract Tarjeta getCopia(Condicion condicion);
    public abstract ArrayList<String> getInstrucciones();

    public int cantidadDeTarjetas(){
        return 1;
    }
}
