
public class CondicionNot extends Condicion {

	private Condicion negada;
	public CondicionNot(Condicion cc) {
       negada = cc;
	}

	@Override
	public boolean cumple(Pieza3D ee) {
		return ! negada.cumple(ee);
	}

}
