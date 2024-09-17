package practico5.Ejercicio5;

public class LoteComun extends Lote {
        public LoteComun(int hectareas){
            super(hectareas);
        }
        public void addMineral(Mineral mm){
            if (mm.getInteres()=="Secundario") {
                this.getMinerales().add(mm);
            }
        }
}
