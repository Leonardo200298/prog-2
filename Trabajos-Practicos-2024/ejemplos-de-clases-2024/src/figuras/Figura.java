package figuras;

import java.util.ArrayList;


public abstract class Figura {
   String nombre;

  public Figura(String nombre) {
	
	this.nombre = nombre;
  }
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
  
	public abstract  double getArea();
	
	public abstract double getPerimetro();
  
  
	public String getDatosCompletos() {
		return this.getNombre()+"("
	           +this.getArea()+","
				+this.getPerimetro()+")";
		
	}
	
	public static void main(String[] args) {
		//Figura f1 = new Figura("cualquiera");
	    Circulo c1 = new Circulo(19);
	    Rectangulo r1 = new Rectangulo(10,10);
	    //FiguraAreaFija af1 = new FiguaraAreaFija(10);
	    FiguraFija f1 = new FiguraFija(10,10);
	    Figura f = c1;
	   // f= r1;
	   // f=f1;
	    
	    AdministradorFiguras ad = new AdministradorFiguras();
	    
	    ad.imprimir(c1);
	    ad.imprimir(r1);
	    ad.imprimir(f1);
	    ad.imprimir(f);
	    
	    		
	    
	}
}
