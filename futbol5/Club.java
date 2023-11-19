package futbol5;

import java.util.ArrayList;

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
    
}
