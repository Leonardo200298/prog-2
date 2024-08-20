package practico2.ejercicio4;

import java.util.ArrayList;

public class Cancha {
    private String tipo;
    private double precioPorHora;
    private ArrayList<Turno> turnos;

    public Cancha(String tipo, double precioPorHora){
        this.tipo = tipo;
        this.precioPorHora = precioPorHora;
        this.turnos = new ArrayList<>();
    }
}
