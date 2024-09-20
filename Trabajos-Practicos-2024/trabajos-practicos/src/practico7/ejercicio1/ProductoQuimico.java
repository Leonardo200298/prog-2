package practico7.ejercicio1;
import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<String> cultivosQueSeDesaconsejan;
    private ArrayList<String> estadosPatologicos;

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivosQueSeDesaconsejan = new ArrayList<>();
        this.estadosPatologicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    


    

}
