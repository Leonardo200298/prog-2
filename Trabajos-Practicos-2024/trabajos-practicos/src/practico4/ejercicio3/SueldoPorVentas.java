package practico4.ejercicio3;

public class SueldoPorVentas extends Sueldo{
    private  int ventasEmpleado;
    private double porcentaje;

    public SueldoPorVentas(double salarioFijo, int ventasEmpleado) {
        super(salarioFijo);
        this.ventasEmpleado = ventasEmpleado;
        porcentaje = 0;
    }
    
    public double getSalario(){
        
        return  this.getVentasEmpleado() * super.getSalario();
    }



    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int cantVentas) {
        if (cantVentas>=5) {
           porcentaje = 1.10;
        }else if (cantVentas>=10){
            porcentaje = 1.20;
        }
    }
    public void setVentas(int ventas) {
        this.ventasEmpleado = ventas;
    }
    public int getVentasEmpleado(){
        return this.ventasEmpleado;
    }
}
