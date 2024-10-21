package Parcial2023TresArroyos;

public class FiltroXtiempo {
    private int tiempo;

    public FiltroXtiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean cumple(PresupuestoAbstracto pp) {
        return pp.getTiempoEstimado() < tiempo;
    }
}
