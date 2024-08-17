package practico2.ejercicio1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;
        this.calificacion = -1;
    }

    public void setCalificacion(int calificacion){
        if (calificacion>=1 && calificacion<=5){
            this.calificacion = calificacion;
        }
        System.out.println("No se puede setear");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }
    
}
