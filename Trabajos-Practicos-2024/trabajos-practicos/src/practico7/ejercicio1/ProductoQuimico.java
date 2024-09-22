package practico7.ejercicio1;
import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<String> estadosPatologicos;
    

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }
    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<>(estadosPatologicos);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    


    

}
