package practico5.Ejercicio6;

public class Contribuyente {
    private String nombre;
    private int codIdTributario;
    private int montoFacturado;
    static int contador=0;
    public Contribuyente(String nombre,int montoFacturado) {
        this.montoFacturado=montoFacturado;
        this.nombre = nombre;

        this.codIdTributario = contador++;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCodIdTributario() {
        return codIdTributario;
    }
    public void setCodIdTributario(int codIdTributario) {
        this.codIdTributario = codIdTributario;
    }
    
    public static int getContador() {
        return contador;
    }
    public double abono() {
        return montoFacturado;
    }
    public void setMontoFacturado(int montoFacturado) {
        this.montoFacturado = montoFacturado;
    }
    


    
}
