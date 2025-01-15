
public class Computadora extends ElementoCola{
    private double velocidad;
    private String nombre;
    
    public Computadora(double velocidad, String nombre) {
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Computadora [velocidad=" + velocidad + ", nombre=" + nombre + "]";
    }

    @Override
    public boolean esMayor(ElementoCola ee) {
        return this.getVelocidad() > ((Computadora) ee).getVelocidad();
    }

    
}