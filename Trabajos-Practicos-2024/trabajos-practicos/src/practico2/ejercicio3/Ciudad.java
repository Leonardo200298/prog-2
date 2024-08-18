package practico2.ejercicio3;

import java.util.ArrayList;

public class Ciudad {
    private String nombreC;
    private ArrayList<Impuesto> impuestos;
    private int poblacion;
    private double gastos;

    public Ciudad(String nombreC, int poblacion, double gastos) {
        this.nombreC = nombreC;
        this.poblacion = poblacion;
        this.gastos = gastos;
        this.impuestos = new ArrayList<>();

    }

    /* las ciudades que gastan más de lo que recaudan, */
    public double recaudacion() {
        double recaudacion = 0;
        for (Impuesto impuesto : impuestos) {
            recaudacion += impuesto.getMonto();
        }
        recaudacion -= this.gastos;
        return recaudacion;
    }

    public int getPoblacion() {
        return this.poblacion;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public void addImpuesto(Impuesto i) {
        impuestos.add(i);
    }

    public ArrayList<Impuesto> getImpuestos() {
        return impuestos;
    }

    @Override
    public String toString() {
        return "Ciudad: " + nombreC + ", Poblacion: " + poblacion + ", Recaudacion: " + recaudacion();
    }

}
