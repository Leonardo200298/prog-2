package practico2.ejercicio3;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.setNombre(nombre);
        this.ciudades = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void addCiudad(Ciudad c) {
        ciudades.add(c);
    }

    @Override
    public String toString() {
        return "Provincia: " + nombre;
    }

}
