

public class Proceso extends ElementoCola{
    private String nombre;
    private double memoriaRequerida;
    
    public Proceso(String nombre, double memoriaRequerida) {
        this.nombre = nombre;
        this.memoriaRequerida = memoriaRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public void setMemoriaRequerida(double memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }

    @Override
    public boolean esMayor(ElementoCola ee) {
        return this.getMemoriaRequerida() > ((Proceso) ee).getMemoriaRequerida();
    }

    
}
