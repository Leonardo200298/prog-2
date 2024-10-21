package Parcial2023TresArroyos;

import java.util.ArrayList;

public class TareaAvanzada extends Tarea {

    public TareaAvanzada(String nombre) {
        super(nombre);
    }

    @Override
    public int getTiempoEstimado() {
        int suma = 0;
        for (PresupuestoAbstracto pp : presupuestos) {
            int tiempo = pp.getTiempoEstimado();
            if (tiempo > suma) {
                suma = tiempo;
            }
        }
        return suma;
    }

    @Override
    public ArrayList<String> getMateriales() {
        ArrayList<String> aux = new ArrayList<>();
        for (PresupuestoAbstracto pp : presupuestos) {
            aux.addAll(pp.getMateriales());
        }
        return aux;
    }

    @Override
    public int getCantEmpleados() {
        int suma = 0;
        for (PresupuestoAbstracto p : presupuestos) {
            suma += p.getCantEmpleados();
        }
        return suma;
    }

}
