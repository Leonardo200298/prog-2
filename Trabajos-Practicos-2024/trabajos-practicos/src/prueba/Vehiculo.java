package prueba;

import java.time.LocalDate;

public class Vehiculo {
    private String patente;
    private String marca;
    private int kilometros;
    private LocalDate fechaPatentamiento;

    public Vehiculo(String patente, String marca, int kilometros) {
        this.patente = patente;
        this.marca = marca;
        this.kilometros = kilometros;
    }

    public Vehiculo(String kilometros, String marca) {
        this(kilometros, marca, 0);
    }

    public String getInformacion(){
        return "Patente: " + this.patente +
               " - Marca: " + this.marca +
               " - Kilometros: " + this.kilometros +
               " - Fecha patentamiento: " + this.fechaPatentamiento;
    }

    public static void main(String[] args) {
        Vehiculo golcito = new Vehiculo("12ABC09", "Gol");
        System.out.println(golcito.getInformacion());
    }
}