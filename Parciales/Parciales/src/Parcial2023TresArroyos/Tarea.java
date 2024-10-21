package Parcial2023TresArroyos;

import java.util.ArrayList;

public class Tarea extends PresupuestoAbstracto {
    protected ArrayList<PresupuestoAbstracto> presupuestos;

    public Tarea(String nombre) {
        super(nombre);
        presupuestos = new ArrayList<>();
    }

    @Override
    public int getCantEmpleados() {
        int nroEmpl = 0;
        for (PresupuestoAbstracto pp : presupuestos) {
            int aux = pp.getCantEmpleados();
            if (aux > nroEmpl) {
                nroEmpl = aux;
            }
        }

        return nroEmpl;
    }

    @Override
    public ArrayList<String> getMateriales() {
        ArrayList<String> aux = new ArrayList<>();
        for (PresupuestoAbstracto pp : presupuestos) {
            for (String material : pp.getMateriales()) {
                if (!aux.contains(material)) {
                    aux.add(material);
                }
            }
        }
        return aux;
    }

    @Override
    public int getTiempoEstimado() {
        int suma = 0;
        for (PresupuestoAbstracto pp : presupuestos) {
            suma += pp.getTiempoEstimado();
        }
        return suma;
    }

    @Override
    public ArrayList<PresupuestoAbstracto> buscar(Filtro ff) {
        ArrayList<PresupuestoAbstracto> pp = new ArrayList<>();
        if (ff.cumple(this)) {
            pp.add(this);
        } else {
            for (PresupuestoAbstracto pres : presupuestos) {
                pp.addAll(pres.buscar(ff));
            }
        }
        return pp;
    }

    @Override
    public double getCostoPresupuesto() {
        double suma = 0;
        for (PresupuestoAbstracto pp : presupuestos) {
            suma += pp.getCostoPresupuesto();
        }
        return suma;
    }
}
