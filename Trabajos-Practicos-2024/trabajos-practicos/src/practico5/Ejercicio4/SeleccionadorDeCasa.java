package practico5.Ejercicio4;
import java.util.ArrayList;

class SeleccionadorDeCasas {
 private ArrayList<Casa> casas;
  public SeleccionadorDeCasas(){
    casas=new ArrayList<>();
    
  }
  public Casa seleccionarCasa(Alumno aa){
    for(int i=0;i<casas.size();i++){
      if(casas.get(i).getCualidades().containsAll(aa.getCualidades()) && (aa.getCasa()!=null)){
        Casa c = casas.get(i).addAlumno(aa); 
        if(c!=null){
          return c;
        }
      }
    }
    return null;
  }
}