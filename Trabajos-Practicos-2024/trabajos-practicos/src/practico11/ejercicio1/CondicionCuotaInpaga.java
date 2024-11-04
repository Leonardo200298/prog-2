package practico11.ejercicio1;

public class CondicionCuotaInpaga extends Condicion{
    private boolean cuotaInpaga;
    public CondicionCuotaInpaga(boolean cuotaInpaga){
        this.cuotaInpaga = cuotaInpaga;
    } 

    @Override
    public boolean cumple(Socio ss) {
        return ss.isUltimaCuotaPaga() == this.cuotaInpaga;
    }

    public boolean isCuotaInpaga() {
        return cuotaInpaga;
    }

    public void setCuotaInpaga(boolean cuotaInpaga) {
        this.cuotaInpaga = cuotaInpaga;
    }
    
}
