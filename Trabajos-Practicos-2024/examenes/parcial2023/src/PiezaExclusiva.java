import java.util.ArrayList;

public class PiezaExclusiva extends Pieza {

	private int costoExtra;
	public PiezaExclusiva(String nombre, String descripcion, String color, int tiempo, int pla) {
		super(nombre, descripcion, color, tiempo, pla);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Pieza> buscar(Condicion cc){
		return new ArrayList<Pieza>();
	}
	
	public int getCosto() {
		return super.getCosto() + costoExtra;
	}

	public int getCostoExtra() {
		return costoExtra;
	}

	public void setCostoExtra(int costoExtra) {
		this.costoExtra = costoExtra;
	}
	
	

}
