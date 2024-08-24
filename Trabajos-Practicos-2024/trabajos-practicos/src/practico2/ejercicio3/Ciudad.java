package practico2.ejercicio3;

import java.util.ArrayList;

public class Ciudad {
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private int poblacion;
    private double gastos;

    public Ciudad(double imp1, double imp2, double imp3, double imp4, double imp5,int poblacion, double gastos){
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.poblacion = poblacion;
        this.gastos = gastos;
        this.impuestos = new ArrayList<>();

    }
    /* las ciudades que gastan más de lo que recaudan,  */
    public double recaudacion(){
        return this.imp1 + this.imp2 + this.imp3 + this.imp4 + this.imp5;
    }
    public boolean gastaMasDeLoQueRecauda(Ciudad c){

        return c.gastos>this.recaudacion();
    }
    public int getPoblacion(){
        return this.poblacion;
    }
  
}
