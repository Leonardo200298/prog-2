package futbol5;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuotaPaga;
    private ArrayList<Alquiler> canchasQueAlquile;

    public Socio (String nombre, String apellido, int edad, boolean cuotaPaga){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotaPaga = cuotaPaga;
        this.canchasQueAlquile = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public boolean getCuotaPaga(){
        return cuotaPaga;
    }
    public int totalDeAlquileresDeEsaCancha(int nro_id_cancha){
        int cantidad = 0;
        for (Alquiler alq : canchasQueAlquile) {
            if (alq.getIdCancha() == nro_id_cancha) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public boolean alquilerMayor(double precio){
        for (Alquiler alquiler : canchasQueAlquile) {
            if (alquiler.getPrecioAlquiler()>precio){
                return true;
            }
        }
        return false;
    }
}
