package practico7.ejercicio2;

public class FiltroXnombre extends Filtro {
    private String titulo;

    public FiltroXnombre(String n){
        titulo = n;
    }
    public boolean cumple(Documento d){
        if (d.getTitulo().equals(titulo)) 
            return true;
        else
            return false;
    }
}
