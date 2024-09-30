package practico8.ejercicio1;
import java.util.ArrayList;

public class Directorio extends ElementoSA{
    private ArrayList<ElementoSA> archivos;


    public Directorio(){
        this.archivos = new ArrayList<>();
    }

    @Override
    public int getTamanio() {
        int acumulador = 0;
        for (ElementoSA elemento : archivos) {
            acumulador += elemento.getTamanio();
        }
        return acumulador;
      
    }

    public ArrayList<ElementoSA> getArchivos() {
        return new ArrayList<>(archivos);
    }
}
