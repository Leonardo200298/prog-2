import java.time.LocalDate;
import java.util.ArrayList;

public class UsuarioCancion {
    private String nombre;
    private LocalDate nacimiento;
    private ArrayList<Cancion> canciones;
    private FiltroCancion preferencias;

    public UsuarioCancion(String nombre, LocalDate nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        canciones = new ArrayList<>();
    }

    public boolean leVaAGustar(Cancion cc) {
        if (preferencias.cumple(cc))
            return true;
        else
            return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

}
