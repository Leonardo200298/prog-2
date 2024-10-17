package practico8.ejercicio3;

public abstract class ElementoOP {
    private String nombre;

    public ElementoOP (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract int getFuerza();
    public abstract int getPeso();
    public abstract int getEdad();
}
