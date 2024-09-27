package sistemaArchivos;

import sistemaArchivos.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class ElementoSA {
    protected String nombre;    //get y set
    protected LocalDate fCreacion;  //get

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fCreacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        try {
            ElementoSA that = (ElementoSA) o;
            return nombre.equals(that.getNombre());
        } catch (Exception e){
            return false;
        }
    }

    public abstract double getTamanio();

    protected abstract int cantElementos();

    protected abstract ArrayList<Archivo> buscar(Condicion condicion);
    public String toString(){
        return nombre;
    }
}
