package practico7.ejercicio2;

public class CondicionTitulo extends Condicion{
    private String titulo;

    public CondicionTitulo(String titulo){
        super();
        this.titulo = titulo;
    }

    
    @Override
    public boolean cumple(Documento dd) {
        return dd.getTitulo().equalsIgnoreCase(this.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
