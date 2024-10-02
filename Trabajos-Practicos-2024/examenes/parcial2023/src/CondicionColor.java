
public class CondicionColor extends Condicion {

	private String color;
	public CondicionColor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumple(Pieza3D pieza) {
		// TODO Auto-generated method stub
		return pieza.getColores().contains(color);
	}

}
