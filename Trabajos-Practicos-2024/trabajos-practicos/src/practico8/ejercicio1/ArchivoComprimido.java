package practico8.ejercicio1;

import java.time.LocalDate;

public class ArchivoComprimido extends Archivo{
    private int tasaCompresion;

    public ArchivoComprimido(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion, int tamanio,
            int tasaCompresion) {
        super(nombre, fechaCreacion, fechaModificacion, tamanio);
        this.tasaCompresion = tasaCompresion;
    }

    public int getTasaCompresion() {
        return tasaCompresion;
    }
    public void setTasaCompresion(int tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }
    
}
