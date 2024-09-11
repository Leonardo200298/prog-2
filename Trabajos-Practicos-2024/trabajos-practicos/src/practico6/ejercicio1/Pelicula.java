package practico6.ejercicio1;

import java.time.LocalDate;

public class Pelicula extends Producto{
    private String informacionFilmografica;
    private int cantidadDisponible;
    private LocalDate fechaDeAlquiler;

    public Pelicula(String informacionFilmografica, int cantidadDisponible,LocalDate fechaDeAlquiler){
        this.informacionFilmografica = informacionFilmografica;
        this.cantidadDisponible = cantidadDisponible;
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeAlquiler(){
        return this.fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(){
        this.fechaDeAlquiler = LocalDate.now();
    }

    public String getInformacionFilmografica() {
        return informacionFilmografica;
    }



    public void setInformacionFilmografica(String informacionFilmografica) {
        this.informacionFilmografica = informacionFilmografica;
    }



    public int getCantidadDisponible() {
        return cantidadDisponible;
    }



    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public boolean estaDisponible() {
        if (this.getCantidadDisponible() > 0) {
            return true;
        }
        return false;
    }



}
