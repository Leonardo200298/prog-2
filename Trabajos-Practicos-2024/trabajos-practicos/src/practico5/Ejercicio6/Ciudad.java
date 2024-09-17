package practico5.Ejercicio6;

import java.util.ArrayList;

public class Ciudad {
    private ArrayList<Impuesto> impuestos;
    private ArrayList<Contribuyente> contribuyentes;
    private int gasto;
    public Ciudad(int gasto) {
        this.gasto =gasto;
        impuestos = new ArrayList<>();
        contribuyentes = new ArrayList<>();
    }
    public int getGasto() {
        return gasto;
    }
    public void setGasto(int gasto) {
        this.gasto = gasto;
    }
    public void addContribuyentes(Contribuyente cc){
        contribuyentes.add(cc);
    }
    public void addImpuesto(Impuesto ii){
        impuestos.add(ii);
    }
    public ArrayList<Impuesto> getImpuestos() {
        return impuestos;
    }
    public ArrayList<Contribuyente> getContribuyentes() {
        return contribuyentes;
    }
    public double recaudacion(){
        double recolector = 0.0;
        for (Contribuyente contribuyente : contribuyentes) {
            recolector+=contribuyente.abono();
        }
        for (Impuesto impuesto : impuestos) {
            recolector+=impuesto.getValor();
        }
        return recolector - gasto;

    }



    

}
