package practico5.ejercicio7;

public class SueldoPorVenta extends Sueldo{
    private double comisionPorVenta;
    @Override
    public double pagarSueldo(Empleado emp) {
        return emp.getSueldo_mensual() + this.getComisionPorVenta();
    }
    public double getComisionPorVenta() {
        return comisionPorVenta;
    }
    public void setComisionPorVenta(double comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }
    
}
