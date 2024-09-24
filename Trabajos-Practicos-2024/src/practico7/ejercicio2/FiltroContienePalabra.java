package practico7.ejercicio2;

public class FiltroContienePalabra extends Filtro{
    private String palabra;
    public FiltroContienePalabra(String p){
        palabra = p;
    }
    
    public boolean cumple(Documento d){
        if (d.contienePalabra(palabra)) 
            return true;
        else
            return false;
    }
}
