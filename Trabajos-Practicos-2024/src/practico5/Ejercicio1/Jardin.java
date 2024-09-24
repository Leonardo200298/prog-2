package practico5.Ejercicio1;
import java.util.ArrayList;

class Jardin {
  private ArrayList<Planta> coleccion;
  
  public Jardin(){
    coleccion= new ArrayList<>();
  }
  public void addPlanta(Planta pp){
    coleccion.add(pp);
  }
}