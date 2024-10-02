import java.util.ArrayList;

public class Pieza extends Pieza3D{
  
  private String color;
  private int tiempo;
  private int pla;
  
  
	public Pieza(String nombre, String descripcion, String color, int tiempo, int pla) {
	super(nombre, descripcion);
	this.color = color;
	this.tiempo = tiempo;
	this.pla = pla;
}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public int getPla() {
		return pla;
	}
	public void setPla(int pla) {
		this.pla = pla;
	}
	public int getCantidadSimples() {
		return 1;
	}
	public ArrayList<String> getColores(){
		ArrayList<String> salida = new ArrayList<String>();
		salida.add(color);
		return salida;
	}
	
	public ArrayList<Pieza> buscar(Condicion cc){
		ArrayList<Pieza> salida = new ArrayList<Pieza>();
		if (cc.cumple(this)) {
			salida.add(this);
		}
		return salida;
	}
}
