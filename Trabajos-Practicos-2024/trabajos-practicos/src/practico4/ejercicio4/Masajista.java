package practico4.ejercicio4;

import java.time.LocalDate;

public class Masajista extends IntegranteCuerpoTecnico{

    private String titulo;
    private int cantAniosXP;
    private boolean disponiblee;

    public Masajista(String nombre, String apellido, Long pasaporte, LocalDate fecha_de_nacimiento,
            boolean estarEnElPais, boolean concentrado, String titulo, int cantAniosXP) {
        super(nombre, apellido, pasaporte, fecha_de_nacimiento, estarEnElPais, concentrado);
        this.titulo = titulo;
        this.cantAniosXP = cantAniosXP;
        this.disponiblee = false;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantAniosXP() {
        return cantAniosXP;
    }

    public void setCantAniosXP(int cantAniosXP) {
        this.cantAniosXP = cantAniosXP;
    }

    public boolean isDisponiblee() {
        return disponiblee;
    }
    public void setDisponiblee(boolean disponiblee) {
        this.disponiblee = true;
    }
    public void disponibilidad(){
        if (super.isConcentrado(this.isDisponiblee()) && super.isConcentrado(!this.isDisponiblee())){
            super.disponible(this.isDisponiblee());
        }
    }

}
