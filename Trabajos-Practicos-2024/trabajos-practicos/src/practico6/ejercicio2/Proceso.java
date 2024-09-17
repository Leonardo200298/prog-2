package practico6.ejercicio2;

public class Proceso {
    private String nombreTarea;
    private int requerimientoMemoria;
    public Proceso(String nombreTarea, int requerimientoMemoria) {
        this.nombreTarea = nombreTarea;
        this.requerimientoMemoria = requerimientoMemoria;
    }
    public String getNombreTarea() {
        return nombreTarea;
    }
    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }
    public int getRequerimientoMemoria() {
        return requerimientoMemoria;
    }
    public void setRequerimientoMemoria(int requerimientoMemoria) {
        this.requerimientoMemoria = requerimientoMemoria;
    }
    
}
