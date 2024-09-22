package practico7.ejercicio2;

public class CondicionListaPalabrasClave extends Condicion{
    private String palabra;

    public CondicionListaPalabrasClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento dd) {
        return dd.existePalabraClave(this.palabra);
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    
}
