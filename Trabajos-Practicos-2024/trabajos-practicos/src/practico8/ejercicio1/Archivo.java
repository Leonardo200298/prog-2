package practico8.ejercicio1;
import java.time.LocalDate;

public class Archivo extends ElementoSA{
    private LocalDate fechaModificacion;
    private int tamanio;

    public Archivo(LocalDate fechaModificacion, int tamanio) {
        this.fechaModificacion = fechaModificacion;
        this.tamanio = tamanio;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }


    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public int getTamanio() {
        return this.tamanio;
    }
    
}
