package practico5.ejercicio5;

public class LoteComun extends Lote{
    public LoteComun(){

    }

    public void agregarMineralSecundario(Mineral mm){
        if (mm.getTopoMineral() == "Secundario") {
            this.addMineral(mm);
        }
    }
}
