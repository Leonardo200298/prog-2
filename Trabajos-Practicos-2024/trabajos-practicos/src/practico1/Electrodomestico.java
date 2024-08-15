package practico1;

public class Electrodomestico {
    private String nombre;
    private double precio_base;
    private String color;
    private int consumo_energetico;
    private double peso;

    public Electrodomestico(String nombre, double precio_base, String color, int consumo_energetico, double peso){
        this.nombre = nombre;
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }
    public Electrodomestico(String nombre){
        this.nombre = nombre;
        this.precio_base = 100.00;
        this.color = "gris plata";
        this.consumo_energetico = 10;
        this.peso = 2.0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio_base() {
        return precio_base;
    }
    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getConsumo_energetico() {
        return consumo_energetico;
    }
    public void setConsumo_energetico(int consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean esBajoConsumo(){
        return this.consumo_energetico< 45;
    }
    public double getBalance(){
        return this.precio_base / this.peso;
    }
    public boolean esAltaGama(){
        return this.getBalance() > 3;
    }
    
}
