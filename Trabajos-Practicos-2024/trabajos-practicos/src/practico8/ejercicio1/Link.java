package practico8.ejercicio1;

public class Link extends ElementoSA{
    private String direccion;
    private int tamanio;
    public Link(String direccion){
        super();
        this.direccion = direccion;
        this.tamanio = 1;
    }
    
    @Override
    public int getTamanio() {
        return this.tamanio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
