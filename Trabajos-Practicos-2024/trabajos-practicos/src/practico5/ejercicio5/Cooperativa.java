package practico5.ejercicio5;
import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Lote> lotes;
    
    public Cooperativa(){
        this.lotes = new ArrayList<>();
    }
    public ArrayList<Lote> getLotes(){
        return this.lotes;
    }
    public void addLote(Lote lote){
        this.getLotes().add(lote);
    }

    public ArrayList<Lote> lotesSegunGrano(Grano gg){
        ArrayList<Lote> lotesSegunGrano = new ArrayList<>();
        for (Lote lote : lotes) {
            if (lote.sePuedeSembrar(gg)) {
                lotesSegunGrano.add(lote);
            }
        }
        return lotesSegunGrano;
    }

    public Lote tipoDeLote(Lote ll) {
        int contador = 0;
        for (Lote lote : lotes) {
            for (Mineral mineral : lote.getMinerales()) {
                if (mineral.getTopoMineral() == "Primario") {
                    contador++;

                }
            }
            if (contador == lote.getMinerales().size()) {
                return new LoteEspecial();
            } else {
                return new LoteComun();
            }
        }
        return null;
    }
}
