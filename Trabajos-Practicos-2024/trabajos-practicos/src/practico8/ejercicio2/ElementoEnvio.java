package practico8.ejercicio2;

public abstract class ElementoEnvio {
    private String ciudadDestino;

    public ElementoEnvio(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    public abstract double getPeso();
}
