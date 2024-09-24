package practico6.ejercicio2;

public class Computadora {
    private String nombre;
    private int rapidez;
    private boolean disponiblidad;
    public Computadora(String nombre, int rapidez) {
        this.nombre = nombre;
        this.rapidez = rapidez;
        disponiblidad=true;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getRapidez() {
        return rapidez;
    }
    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }
    public boolean isDisponiblidad() {
        return disponiblidad;
    }
    public void setDisponiblidad(boolean disponiblidad) {
        this.disponiblidad = disponiblidad;
    }
    public String ejecutar(Proceso primerProceso) {
        return "Ejecutado: "+ primerProceso.getNombreTarea();
    }

    
}
