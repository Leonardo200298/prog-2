

public class CondMayorTiempo extends Condicion {

	private int tiempo;
	public CondMayorTiempo(int tt) {
	    tiempo = tt;
	}

	@Override
	public boolean cumple(Pieza3D ee) {
	   return ee.getTiempo()>tiempo;	
	}

}
