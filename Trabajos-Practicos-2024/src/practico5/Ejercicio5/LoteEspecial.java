package practico5.Ejercicio5;

public class LoteEspecial extends Lote{
    public LoteEspecial(int hectareas){
        super(hectareas);
    }
    public void addMineral(Mineral mm){
        if (mm.getInteres()=="Primario") {
            this.getMinerales().add(mm);
        }
    }
}
