

public class CondicionOr extends Condicion {
	private Condicion c1,c2;
	public CondicionOr(Condicion ca,Condicion cb) {
		c1 = ca;
		c2=cb;
	}

	@Override
	public boolean cumple(Pieza3D ee) {
		return c1.cumple(ee) || c2.cumple(ee);
	}

}
