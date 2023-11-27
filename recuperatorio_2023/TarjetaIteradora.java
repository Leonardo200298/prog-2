package recuperatorio_2023;

import java.util.ArrayList;

public class TarjetaIteradora extends Tarjeta{
    private int topeDeIteraciones;
    private Tarjeta referencia;

    
    public TarjetaIteradora(int topeDeIteraciones) {
        this.topeDeIteraciones = topeDeIteraciones;
        
    }

    @Override
    public int getTiempoDeEjecucion() {
        return referencia.getTiempoDeEjecucion() * topeDeIteraciones;
    }

    @Override
    public double getCantidadDeEnergiaNecesaria() {
        return referencia.getCantidadDeEnergiaNecesaria() * topeDeIteraciones;
    }

    @Override
    public Tarjeta getCopia(Condicion condicion) {
        Tarjeta copia = referencia.getCopia(condicion);
        if (copia != null) {
            return new TarjetaIteradora(this.getTopeDeIteraciones());
        }else{
           return null; 
        }
        
    }
    public int getTopeDeIteraciones(){
        return topeDeIteraciones;
    }
    @Override
    public ArrayList<String> getInstrucciones() {
        ArrayList<String> comandosIterativos = referencia.getInstrucciones();
        ArrayList<String> salida = new ArrayList<>();
        for (int i = 0; i < topeDeIteraciones; i++) {
            salida.addAll(comandosIterativos);
        }
        return salida;
    }
    
}
