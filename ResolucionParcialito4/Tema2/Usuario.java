import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private LocalDate nacimiento;
    private ArrayList<Pelicula> peliculas;
    private Filtro preferencias;

    public Usuario(String nombre, LocalDate nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        peliculas = new ArrayList<>();
    }

    public boolean leVaAGustar(Pelicula pp) {
        if (preferencias.cumple(pp))
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
