package futbol5;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuotaPaga;
    private List<String> canchasQueAlquile;

    public Socio (String nombre, String apellido, int edad, boolean cuotaPaga){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotaPaga = cuotaPaga;
        this.canchasQueAlquile = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
  
    
}
