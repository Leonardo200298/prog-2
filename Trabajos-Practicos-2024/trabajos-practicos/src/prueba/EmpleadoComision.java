package prueba;

public class EmpleadoComision extends Empleado{
    private int cantVentas;
    private double comisionPorVenta;
    public EmpleadoComision(String nombre, String apellido, String dni, int numero, double sueldo, double comision) {
        super(nombre, apellido, dni, numero, sueldo);
        this.comisionPorVenta = comision;
        this.cantVentas = 0;
    }

    public int getCantVentas() {
        return cantVentas;
    }
    public void addVenta() {
        this.addVentas(1);
    }

    public void addVentas(int cantVentas) {
        this.cantVentas += cantVentas;
    }

    public double getSueldo() {
        return 0.1;
    }

}

