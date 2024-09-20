package practico7.ejercicio1;
import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedades = new ArrayList<>();
    }

    public boolean puedeTratar(ProductoQuimico pp){
        //provisorio
        for (Enfermedad enfermedad : this.enfermedades) {
            if (enfermedad.getEstadosPatologicosQueTrataELProductoQuimico().contains(pp)) {
                return true;
            }
        }
        return false;
    }
}
