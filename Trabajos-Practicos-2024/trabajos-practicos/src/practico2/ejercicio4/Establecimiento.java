package practico2.ejercicio4;

import java.util.ArrayList;
import java.time.LocalDate;

public class Establecimiento {
    private ArrayList<Cancha> canchas;
    //no se si lo dejo a este arrayList
    private ArrayList<Usuario> socios;
  


    public Establecimiento(){
        this.usuarios = new ArrayList<>();
        this.socios = new ArrayList<>();
        this.turnos = new ArrayList<>();
  

    }

    public void agregarSocio(Usuario u){
   /*      for (Turno t : turnos) {
            if () {
                
            }
        }
        if (){
            socios.add(u);
        } */
    }
    public void sacarTurno(LocalDate fecha, Usuario usuario, Cancha cancha){
        if (socios.contains(usuario)) {
            
        }
    }
    //en Cancha estan los turnos diponibles, tambien tengo todas las canchas

    public void socios(){
        
    }
}
