package practico5.Ejercicio6;

public class ContribuyenteEspecial extends Contribuyente {
    private int monto;
     private double porcentajeEspecial;
     private double porcentajeAbono;

    public ContribuyenteEspecial (String nombre,int montoFacturado,int monto, double porcentajeEspecial,double porcentajeAbono){
        super(nombre, montoFacturado);
        this.monto=monto;
        this.porcentajeEspecial=porcentajeEspecial;
        this.porcentajeAbono=porcentajeAbono;
    }
    public double abono(){
        return (super.abono() * porcentajeAbono)+(monto * porcentajeEspecial);
    }
}
