package practico5.ejercicio5;

public class LoteEspecial extends Lote{
    public LoteEspecial(){

    }

    public void AgregarMineralPrimario(Mineral mm){
        if (mm.getTopoMineral() == "Primario") {
            this.addMineral(mm);
        }
    }
}
