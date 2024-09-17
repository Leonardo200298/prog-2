package practico5.Ejercicio4;
import java.util.ArrayList;

class Casa {
  /*Cada una de
las casas cuenta con un conjunto de cualidades que deben tener los alumnos para poder
pertenecer a dicha casa y una cantidad máxima de alumnos que pueden aceptar. De esta
forma, si la casa se encuentra llena, ya no puede recibir nuevos alumnos.*/
 private ArrayList<String> cualidades;
 private ArrayList<Alumno> alumnos;
 static final int MAX_ALUMNOS=30;
  
  public Casa(){
    cualidades = new ArrayList<>();
    alumnos = new ArrayList<>();
  }
  public Casa addAlumno(Alumno aa){
    if(alumnos.size()<MAX_ALUMNOS){
      alumnos.add(aa);
      aa.addCasa(this);
      return this;
    }else{
      return null;
    }
  }
  public void addCualidades(String cc){
    cualidades.add(cc);
  }
  public ArrayList<String> getCualidades(){
    return cualidades;
  }
  public boolean tieneEspacio(){
    return alumnos.size()<MAX_ALUMNOS;
  }
}
