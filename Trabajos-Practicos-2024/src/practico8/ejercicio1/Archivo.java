package practico8.ejercicio1;
//. Los archivos se definen por un nombre, una fecha
//de creación, una fecha de última modificación y un tamaño. 

import java.time.LocalDate;

public class Archivo extends ElementoSA {

    private LocalDate fModificacion;
    private int tamanio;

    public Archivo (String nombre, int tamanio){
        super(nombre);
        this.tamanio = tamanio;
    }

   
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }


    public void setfModificacion(LocalDate fModificacion) {
        this.fModificacion = fModificacion;
    }

    public LocalDate getfModificacion() {
        return fModificacion;
    }


    @Override
    public int getCantElementos() {
       return 1;
    }
    
}
