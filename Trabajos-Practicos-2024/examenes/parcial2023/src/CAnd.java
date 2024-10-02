
public class CAnd extends Condicion {

	private Condicion c1,c2;
	public CAnd() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumple(Pieza3D pieza) {
		return c1.cumple(pieza) && c2.cumple(pieza);
	}

}
