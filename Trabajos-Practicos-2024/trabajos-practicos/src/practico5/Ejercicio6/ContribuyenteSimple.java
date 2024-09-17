package practico5.Ejercicio6;

public class ContribuyenteSimple extends Contribuyente{
    private int abono;

    public ContribuyenteSimple(String nombre,int montoFacturado, int abono) {
        super(nombre, montoFacturado);
        this.abono = abono;
    }

    public double abono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    

}
