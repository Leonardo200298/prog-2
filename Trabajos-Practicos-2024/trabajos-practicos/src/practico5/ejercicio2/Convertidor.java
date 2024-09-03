package practico5.ejercicio2;

public class Convertidor {
    final static double pulgada = 2.54;
    final static double libra = 0.453592; 
    final static double galon = 3.78541;


    public static double convertirAPulgada(double cm){
        return Convertidor.pulgada * cm;
    }
    public static double convertirALibra(double cm){
        return Convertidor.libra * cm;
    }
    public static double convertirAGalon(double cm){
        return Convertidor.galon * cm;
    }
}
