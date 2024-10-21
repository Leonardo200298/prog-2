package Parcial2023TresArroyos;

public class FiltroXmaterial extends Filtro {
    private String mat;

    public FiltroXmaterial(String material) {
        mat = material;
    }

    public boolean cumple(PresupuestoAbstracto pp) {
        return pp.getMateriales().contains(mat);
    }

}
