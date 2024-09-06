package practico5.ejercicio4;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Cualidad> cualidades;
    private ArrayList<Familiar> familiaresQueAsistieronAlaEscuela;


    public Alumno(String nombre){
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiaresQueAsistieronAlaEscuela = new ArrayList<>();
    }

    public ArrayList<Familiar> getFamiliares(){
        return this.familiaresQueAsistieronAlaEscuela;
    }

    public void addFamiliares(Familiar familiar){
        this.getFamiliares().add(familiar);
    }

    public void addNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<Cualidad> getCualidades(){
        return this.cualidades;
    }

    public void addCualidad(Cualidad cualidad){
        this.getCualidades().add(cualidad);
    }

}
