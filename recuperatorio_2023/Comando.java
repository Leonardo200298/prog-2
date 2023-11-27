package recuperatorio_2023;

import java.util.ArrayList;

public class Comando extends Tarjeta{
    private String instruccion;
    private double gastoDeBateria;
    private int unidadesDeTiempo;

    public Comando(String instruccion, double gastoDeBateria, int unidadesDeTiempo){
        this.instruccion = instruccion;
        this.gastoDeBateria = gastoDeBateria;
        this.unidadesDeTiempo = unidadesDeTiempo;

    }

    @Override
    public int getTiempoDeEjecucion() {
        return unidadesDeTiempo;
    }

    @Override
    public double getCantidadDeEnergiaNecesaria() {
        return gastoDeBateria;
    }

    @Override
    public Tarjeta getCopia(Condicion condicion) {
        if (condicion.cumple(this)) {
            return new Comando(this.instruccion, this.gastoDeBateria, this.unidadesDeTiempo);
        }
        return null;
    }
    public String getInstruccion(){
        return instruccion;
    }
    @Override
    public ArrayList<String> getInstrucciones() {
        ArrayList<String> salida = new ArrayList<>();
        salida.add(instruccion);
        return salida;
    }
  
}
