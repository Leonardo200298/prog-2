package futbol5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
  private ArrayList<Socio> socios;
  private ArrayList<Alquiler> alquileres;


  public Club(){
    this.socios = new ArrayList<>();
    this.alquileres = new ArrayList<>();
  }

  public void addSocio(Socio socio){
    if (!this.socios.contains(socio)) {
        this.socios.add(socio);
    }
  }
  public void addAlquileres(Alquiler alquiler){
    if (!this.alquileres.contains(alquiler)){
        this.alquileres.add(alquiler);
    }
  }
  public ArrayList <Socio> ordenarSocios(Comparator <Socio> comp, Condicion condicion){
    ArrayList<Socio> salida = new ArrayList<>();
    for (Socio iterable : socios) {
      if (condicion.cumple(iterable)) {
        salida.add(iterable);
      }
    }
    Collections.sort(salida, comp);
    return salida;
  }



}
