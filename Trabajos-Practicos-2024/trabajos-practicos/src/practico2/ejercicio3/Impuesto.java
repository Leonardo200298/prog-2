package practico2.ejercicio3;

public class Impuesto {
    String nombreImpuesto;
    double valor;

    public Impuesto(String nombreImpuesto, double valor){
        this.nombreImpuesto = nombreImpuesto;
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public String getNombreImpuesto() {
        return nombreImpuesto;
    }
    public void setNombreImpuesto(String nombreImpuesto) {
        this.nombreImpuesto = nombreImpuesto;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
