package practico3.ejercicio3;

import java.util.ArrayList;

public class Jugar {
    private ArrayList<Jugador> jugadores;
    private int jugadorQueQuiero;

    public Jugar(int jugadorQueQuiero) {
        this.jugadores = new ArrayList<>();
        this.jugadorQueQuiero = jugadorQueQuiero;
    }
    public boolean puedoJugar(){
        return jugadores.size()%2 == 0;
    }
    public ArrayList<Jugador> getJugadores(){
        return this.jugadores;
    }
    public void setJugadorQueQuiero(int jj){
        this.jugadorQueQuiero = jj;
    }
    public void elegirJugadores(){

        ArrayList<Jugador> jugadoresDisponibles = new ArrayList<>();
        if (puedoJugar()) {
            jugadoresDisponibles = this.getJugadores();
            eligeJugador(jugadoresDisponibles);
        }
    }
    public void eligeJugador(ArrayList<Jugador> jugadoresDisponibles){

        for (int i = 0; i < jugadoresDisponibles.size(); i++) {
            if (this.jugadorQueQuiero > 0 && this.jugadorQueQuiero < jugadoresDisponibles.size()) {
                Jugador j1 = jugadoresDisponibles.get(jugadorQueQuiero);
                jugadoresDisponibles.remove(jugadorQueQuiero);
                Jugador j2 = jugadoresDisponibles.get(jugadoresDisponibles.size()-1);
                
                jugar(j1,j2);
            }
        }
    }
    private void jugar(Jugador j1, Jugador j2) {
        Jugador jj;
        for (Caracteristica cj1 : j1.getCaracteristicas()) {
            for (Caracteristica cj2 : j2.getCaracteristicas()) {
                if (cj1.getAltura() > cj2.getAltura()) {
                    jj = j1;
                    System.out.println("El jugador ganador es" + jj.getNombreReal());
                }else{
                    jj = j2;
                }
                if (cj1.getAltura() == cj2.getAltura()) {
                    if (cj1.getPeso() > cj2.getPeso()) {
                        jj = j1;
                        System.out.println("El jugador ganador es" + jj.getNombreReal());
                    }else{
                        jj = j2;
                    }
                    System.out.println("Volver a jugar hasta que enseñen Strategy");
                    jugadores.clear();
                }
            }
        }
    }
}
