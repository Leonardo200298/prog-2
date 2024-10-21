package Parcial2023TresArroyos;

import java.util.ArrayList;

public abstract class PresupuestoAbstracto {
    private String nombre;

    public PresupuestoAbstracto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract ArrayList<String> getMateriales();

    public abstract int getCantEmpleados();

    public abstract int getTiempoEstimado();

    public abstract ArrayList<PresupuestoAbstracto> buscar(Filtro ff);

    public abstract double getCostoPresupuesto();
}
