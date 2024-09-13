package practico5.ejercicio5;

public class Mineral {
    private String topoMineral;
    private int puntuacionDeCalidad;

    public Mineral(String topoMineral, int puntuacionDeCalidad) {
        this.topoMineral = topoMineral;
        this.puntuacionDeCalidad = puntuacionDeCalidad;
    }

    public String getTopoMineral() {
        return topoMineral;
    }

    public void setTopoMineral(String topoMineral) {
        this.topoMineral = topoMineral;
    }

    public int getPuntuacionDeCalidad() {
        return puntuacionDeCalidad;
    }

    public void setPuntuacionDeCalidad(int puntuacionDeCalidad) {
        this.puntuacionDeCalidad = puntuacionDeCalidad;
    }

    
}
