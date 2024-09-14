import java.util.ArrayList;

public class Hijo extends Padre{
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Padre> todaFamilia;


    public Hijo(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.todaFamilia = new ArrayList<>();
    }

    public void agregarFamiliar(Padre pp){
        if (!this.getFamiliares().contains(pp)) {
            this.getFamiliares().add(pp);
        }
    }

    public ArrayList<Padre> getFamiliares(){
        return this.todaFamilia;
    }
    @Override
    public boolean conseguirTrabajo(Hijo hijx) {
        return true;
        
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
