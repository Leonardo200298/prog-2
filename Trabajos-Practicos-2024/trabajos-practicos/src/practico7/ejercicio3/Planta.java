package practico7.ejercicio3;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private int riesgo;
    private int sol;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, int riesgo,
            int sol) {
        this.nombreCientifico = nombreCientifico;
        this.nombresVulgares = new ArrayList<>();
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.riesgo = riesgo;
        this.sol = sol;
    }

    public boolean contieneNombreVulgar(String nombreVulgar){
        return this.nombresVulgares.contains(nombreVulgar);
    }

    public void setNombresVulgares(String nombreVulgar){
        if (!this.nombresVulgares.contains(nombreVulgar)) {
            this.nombresVulgares.add(nombreVulgar);
        }
    }

    public ArrayList<String> getNombresVulgares(){
        return new ArrayList<>(nombresVulgares);
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        if (riesgo>=1 && riesgo<=10) {
            
            this.riesgo = riesgo;
        }
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        if (sol>=1 && sol<=10) {
            this.sol = sol;
            
        }
    }

    
}

