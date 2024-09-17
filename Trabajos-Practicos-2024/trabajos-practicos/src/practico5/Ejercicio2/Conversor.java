package practico5.Ejercicio2;

public class Conversor {
  static final double pulgada = 2.54;
  static final double kilo=0.453592;
  static final double litro=3.78541;
  
  public static double convertirCentimetroPulgada(int cm){
   return pulgada *cm;
  }
  public static double convertirLibraKilo(int libra){
    return kilo*libra;
  }
  public static double convertirGalonLitro(int galon){
    return litro*galon;
  }
  public static void main(String[] args){
    
    System.out.println(Conversor.convertirCentimetroPulgada(2));
  }
  
  
}
