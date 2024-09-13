package practico5.ejercicio6ClaseAbstraca;

public class Contribuyente {
    private String nombre;
    private int cod_id_tributaria;
    private double monto_fijo;


    public Contribuyente(String nombre, int cod_id_tributaria, double monto_fijo){
        this.nombre = nombre;
        this.cod_id_tributaria = cod_id_tributaria;
        this.monto_fijo = monto_fijo;
    }

    public void pagarImpuesto(Impuesto im){
        im.pagarImpuesto(this);
    }


    public double getMontoFijo(){
        return this.monto_fijo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCod_id_tributaria() {
        return cod_id_tributaria;
    }
    public void setCod_id_tributaria(int cod_id_tributaria) {
        this.cod_id_tributaria = cod_id_tributaria;
    }

    
}
