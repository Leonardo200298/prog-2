package practico7.ejercicio2;

public class CondicionAutor extends Condicion{
    private String autor;

    public CondicionAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento dd) {
        return dd.existeAutor(this.autor);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
