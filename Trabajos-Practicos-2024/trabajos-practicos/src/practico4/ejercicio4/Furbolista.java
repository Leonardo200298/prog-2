package practico4.ejercicio4;

import java.time.LocalDate;

public class Furbolista extends IntegranteCuerpoTecnico{
    private String posicion;
    private boolean esZurdo;
    private boolean disponiblee;

    public Furbolista(String nombre, String apellido, Long pasaporte, LocalDate fecha_de_nacimiento,
            boolean estarEnElPais, boolean concentrado, String posicion, boolean esZurdo) {
        super(nombre, apellido, pasaporte, fecha_de_nacimiento, estarEnElPais, concentrado);
        this.posicion = posicion;
        this.esZurdo = false;
        this.disponiblee = false;
  
    }
    public void setearZurdo(){
        this.esZurdo = true;
    }
    public boolean getEsZurdo(){
        return this.esZurdo;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
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
