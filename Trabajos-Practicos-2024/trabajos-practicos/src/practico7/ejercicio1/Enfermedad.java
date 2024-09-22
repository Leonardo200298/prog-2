package practico7.ejercicio1;
import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<ProductoQuimico> estadosPatologicosQueTrataELProductoQuimico;

    public void llenarEstadosPatologicos(ProductoQuimico pp){
        this.estadosPatologicosQueTrataELProductoQuimico.add(pp);
    }

    public ArrayList<ProductoQuimico> getEstadosPatologicosQueTrataELProductoQuimico(){
        return new ArrayList<>(estadosPatologicosQueTrataELProductoQuimico);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
