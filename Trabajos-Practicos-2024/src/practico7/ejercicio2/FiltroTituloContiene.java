package practico7.ejercicio2;

public class FiltroTituloContiene extends Filtro {
    private String palabra;

    public FiltroTituloContiene(String palabra){
        this.palabra = palabra;
    }
    public boolean cumple(Documento d){
        if (d.getTitulo().contains(palabra))
            return true;
        else
            return false;
    }
}
