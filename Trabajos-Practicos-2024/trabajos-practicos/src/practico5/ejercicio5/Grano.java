package practico5.ejercicio5;

public class Grano {
    private String tipo;
    private Mineral mineral;

    public Grano(String tipo, Mineral mineral) {
        this.tipo = tipo;
        this.mineral = mineral;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Mineral getMineral() {
        return mineral;
    }

    public void setMineral(Mineral mineral) {
        this.mineral = mineral;
    }

    
}
