package Parcial2023TresArroyos;

public class FiltroXempl extends Filtro {
    private int empl;

    public FiltroXempl(int emp) {
        empl = emp;
    }

    public boolean cumple(PresupuestoAbstracto pp) {
        return pp.getCantEmpleados() < empl;
    }
}
