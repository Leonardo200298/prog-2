package practico2.ejercicio3;

public class Impuesto {
    private String nombre;
    private double monto;

    public Impuesto(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

}
