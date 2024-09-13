package practico5.ejercicio5;
import java.util.ArrayList;

public class Lote {
    private ArrayList<Mineral> minerales;

    public Lote(){
        this.minerales = new ArrayList<>();
    }
    public boolean sePuedeSembrar(Grano gg){
        return minerales.contains(gg.getMineral());
    }
    
  /*   public Lote mineralDeCalidad(Mineral mm){
        return mm.getPuntuacionDeCalidad() > 7 ? new LoteEspecial() : new LoteComun();
    } */
    public ArrayList<Mineral> getMinerales(){
        return this.minerales;
    }

    public void addMineral(Mineral mm){
        this.getMinerales().add(mm);
    }
}
