package practico4.ejercicio3;

public class EmpleadoVentas extends Empleado {
    private int cantVentas;
    private double porcentaje;
    private int ventasMin;

    public EmpleadoVentas(double sueldo, int cantVentas) {
        super(sueldo);
        this.cantVentas = cantVentas;
        this.porcentaje = 1.10;
        this.ventasMin = 5;
    }
    public double getSalario(){
        if (cantVentas>ventasMin) {
        return porcentaje * super.getSalario();
        }
        return super.getSalario();
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
    public double getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public int getVentasMin() {
        return ventasMin;
    }
    public void setVentasMin(int ventasMin) {
        this.ventasMin = ventasMin;
    }
    

}
