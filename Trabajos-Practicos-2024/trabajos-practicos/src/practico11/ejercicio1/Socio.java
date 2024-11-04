package practico11.ejercicio1;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean ultimaCuotaPaga;
    private ArrayList<AlquilerCancha> listaCanchasAlquiladas;


    public Socio(String nombre, String apellido, int edad, boolean ultimaCuotaPaga, Condicion condicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimaCuotaPaga = ultimaCuotaPaga;
        this.listaCanchasAlquiladas = new ArrayList<>();

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isUltimaCuotaPaga() {
        return ultimaCuotaPaga;
    }
    public void setUltimaCuotaPaga(boolean ultimaCuotaPaga) {
        this.ultimaCuotaPaga = ultimaCuotaPaga;
    }
    public boolean contieneCancha(int idCancha){
        boolean bandera = false;
        for (AlquilerCancha alquilerCancha : listaCanchasAlquiladas) {
            if (alquilerCancha.esIgual(idCancha)) {
                bandera = true;
            }
        }
        return bandera;
    }
    
    public boolean precioCancha(double precio){
        for (AlquilerCancha alquilerCancha : listaCanchasAlquiladas) {
            if (alquilerCancha.getPrecio() > precio) {
                return true;
            }
        }
        return false;
    }

}
