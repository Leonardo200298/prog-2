package practico8.ejercicio1;

public class Link extends ElementoSA{
    static int tamanio=1;
    private String vinculo;

    public Link(String nombre, String vinculo) {
        super(nombre);
        this.vinculo = vinculo;
    }

    @Override
    public double getTamanio() {
       return tamanio;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    @Override
    public int getCantElementos() {
       return 1;
    }
    

}
