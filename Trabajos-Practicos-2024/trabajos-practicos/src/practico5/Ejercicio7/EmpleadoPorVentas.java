package practico5.Ejercicio7;

public class EmpleadoPorVentas extends Empleado{
    private double ventas;
    private double porcentajeVentas;

    public EmpleadoPorVentas(String nombre, String apellido, int dni, double sueldo, double ventas,
            double porcentajeVentas) {
        super(nombre, apellido, dni, sueldo);
        this.ventas = ventas;
        this.porcentajeVentas = porcentajeVentas;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getPorcentajeVentas() {
        return porcentajeVentas;
    }

    public void setPorcentajeVentas(double porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }
    public double getSueldo(){
        return super.getSueldo() +(ventas*porcentajeVentas);
    }
    
}
