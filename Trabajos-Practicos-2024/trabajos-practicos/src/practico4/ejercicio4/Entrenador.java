package practico4.ejercicio4;

import java.time.LocalDate;

public class Entrenador extends IntegranteCuerpoTecnico{

    private int id_federacion;
    private boolean disponiblee;

    public Entrenador(String nombre, String apellido, Long pasaporte, LocalDate fecha_de_nacimiento,
            boolean estarEnElPais, boolean concentrado, int id_federacion) {
        super(nombre, apellido, pasaporte, fecha_de_nacimiento, estarEnElPais, concentrado);
        this.id_federacion = id_federacion;
        this.disponiblee = false;
    }

    public int getId_federacion() {
        return id_federacion;
    }

    public void setId_federacion(int id_federacion) {
        this.id_federacion = id_federacion;
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
