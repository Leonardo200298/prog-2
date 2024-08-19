package practico2.ejercicio3;
import java.util.ArrayList;
public class Ciudad {
    ArrayList<Impuesto> impuestos;
    private int poblacion;
    private double gastos;

    public Ciudad(int poblacion, double gastos){
        this.impuestos = new ArrayList<>();
        this.poblacion = poblacion;
        this.gastos = gastos;
        
    }
    /* las ciudades que gastan más de lo que recaudan,  */
    public double recaudacion(){
        int recaudacion = 0;
        for (Impuesto impuesto : impuestos) {
            recaudacion+=impuesto.getValor();
        }
        recaudacion-=this.gastos;
        return recaudacion;
    }

    public int getPoblacion(){
        return this.poblacion;
    }
    public ArrayList<Impuesto> getImpuestos(){
        return this.impuestos;
    }
    public double getGastos(){
        return this.gastos;
    }
}
