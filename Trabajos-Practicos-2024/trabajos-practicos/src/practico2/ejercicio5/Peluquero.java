package practico2.ejercicio5;
import java.util.ArrayList;

public class Peluquero {
    private String nombre;
    private ArrayList<Turno> turnos;

    public Peluquero(String nombre){
        this.nombre = nombre;
        this.turnos = new ArrayList<>();
    }
    public void agregarTurno(Turno t){
        turnos.add(t);
    }
   
    
}
