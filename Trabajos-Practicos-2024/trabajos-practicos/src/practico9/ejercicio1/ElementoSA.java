package practico9.ejercicio1;
import java.time.LocalDate;

public class ElementoSA {
    private String nombre;
    private LocalDate fechaDeCreacion;

    public ElementoSA(String nombre){
        this.nombre = nombre;
        this.fechaDeCreacion = LocalDate.now();
    }
}
