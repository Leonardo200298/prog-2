package practico7.ejercicio3;

public class CondicionNombreCientifico extends Condicion{
    private String nombreCientifico;


    public CondicionNombreCientifico(String nombreCientifico){
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public boolean cumple(Planta pp) {
        return pp.getNombreCientifico().equalsIgnoreCase(nombreCientifico);
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    
}
