import java.util.ArrayList;

public abstract class Pieza3D {
	private String nombre;
	private String descripcion;
	  
    private  static int precioGramo=12;
    private  static int costoSegundo=45;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	public Pieza3D(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	    
	}

	public abstract int getPla();
	public abstract int getCantidadSimples();
	public abstract int getTiempo();
	public abstract ArrayList<String> getColores() ;
	public abstract ArrayList<Pieza> buscar(Condicion pp);
	// calcula como la cantidad de PLA necesario por
	//el precio del gramo PLA más la cantidad 
	//de segundos de impresión por un costo de segundo de impresión. 

    
	public int getCosto() {
		return this.getPla()*Pieza3D.getPrecioGramo() + 
				this.getTiempo()*Pieza3D.getCostoSegundo();
	}
	
	public static int getPrecioGramo() {
		return precioGramo;
	}
	public static void setPrecioGramo(int precioGramo) {
		Pieza3D.precioGramo = precioGramo;
	}
	public static int getCostoSegundo() {
		return costoSegundo;
	}
	public static void setCostoSegundo(int costoSegundo) {
		Pieza3D.costoSegundo = costoSegundo;
	}
	
	
}
