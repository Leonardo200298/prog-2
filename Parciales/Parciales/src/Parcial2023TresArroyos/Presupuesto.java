package Parcial2023TresArroyos;

import java.util.ArrayList;

public class Presupuesto extends PresupuestoAbstracto {
    private ArrayList<String> materiales;
    private int empleados;
    private int tiempoEstimado;
    private Costo costoPresu;

    public Presupuesto(String nombre, int empleados, int tiempoEstimado, Costo costoPresu) {
        super(nombre);
        this.empleados = empleados;
        this.tiempoEstimado = tiempoEstimado;
        this.costoPresu = costoPresu;
        materiales = new ArrayList<>();
    }

    public void addMaterial(String m) {
        materiales.add(m);
    }

    @Override
    public int getCantEmpleados() {
        return empleados;
    }

    @Override
    public ArrayList<String> getMateriales() {
        return new ArrayList<>(materiales);
    }

    @Override
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    @Override
    public ArrayList<PresupuestoAbstracto> buscar(Filtro ff) {
        ArrayList<PresupuestoAbstracto> pp = new ArrayList<>();
        if (ff.cumple(this)) {
            pp.add(this);
        }
        return pp;
    }

    public Costo getFormaCosto() {
        return costoPresu;
    }

    public void setCostoPresu(Costo costoPresu) {
        this.costoPresu = costoPresu;
    }

    @Override
    public double getCostoPresupuesto() {
        return costoPresu.calculo(this);
    }

}
