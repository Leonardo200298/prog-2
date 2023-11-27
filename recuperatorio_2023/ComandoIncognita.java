package recuperatorio_2023;

import java.util.ArrayList;

public class ComandoIncognita extends Comando{

    public ComandoIncognita(String instruccion, double gastoDeBateria, int unidadesDeTiempo) {
        super(instruccion, gastoDeBateria, unidadesDeTiempo);
        
    }
    public ArrayList<String> getInstrucciones() {
        ArrayList<String> salida = new ArrayList<>();
        return salida;
    }
    
    public int cantidadDeTarjetas(){
        return 0;
    }
    @Override
    public Tarjeta getCopia(Condicion condicion) {
        
        return null;
    }
}
