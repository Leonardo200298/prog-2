package practico8.ejercicio2;

public abstract class ElementoEnvio {
    private String ciudadDestino;
    private int numeroTraking;

    public ElementoEnvio(String ciudadDestino, int numeroTraking) {
        this.ciudadDestino = ciudadDestino;
        this.numeroTraking = numeroTraking;
    }
    
    public abstract double getPeso();

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getNumeroTraking() {
        return numeroTraking;
    }

    public void setNumeroTraking(int numeroTraking) {
        this.numeroTraking = numeroTraking;
    }
}
