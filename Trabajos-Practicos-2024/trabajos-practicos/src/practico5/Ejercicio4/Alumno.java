package practico5.Ejercicio4;
import java.util.ArrayList;

class Alumno {
 /* De un alumno se
conoce su nombre, su conjunto de cualidades y el conjunto de familiares que asisten a la
escuela*/
  private String nombre;
  private Casa casaPertenece;
  private ArrayList<String> cualidades;
  private ArrayList<Alumno> familiares;
  
  public Alumno(String nombre){
    this.nombre = nombre;
    cualidades = new ArrayList<>();
    familiares = new ArrayList<>();
  }
  public void addCualidad(String cc){
    cualidades.add(cc);
  }
  public void addFamiliar(Alumno aa){
    familiares.add(aa);
  }
  public ArrayList<String> getCualidades(){
    return cualidades;
  }
  public void addCasa(Casa cc){
    casaPertenece=cc;
  }
  public Casa getCasa(){
    return casaPertenece;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
}