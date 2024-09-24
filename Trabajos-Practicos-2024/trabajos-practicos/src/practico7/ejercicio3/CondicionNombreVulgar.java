package practico7.ejercicio3;

public class CondicionNombreVulgar extends Condicion{
    private String nombreVulgar;

    public CondicionNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    @Override
    public boolean cumple(Planta pp) {
        return pp.contieneNombreVulgar(this.nombreVulgar);
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }
    
}
