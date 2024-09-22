package practico7.ejercicio2;

public class CondicionContenidoTextual extends Condicion{
    private String texto;

    public CondicionContenidoTextual(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean cumple(Documento dd) {
        return dd.getContenidoTextual().equalsIgnoreCase(this.texto.toUpperCase());
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
