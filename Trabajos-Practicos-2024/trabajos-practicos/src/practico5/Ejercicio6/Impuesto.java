package practico5.Ejercicio6;

public class Impuesto {
    private String nombre;
    private int valor;
    public Impuesto(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
