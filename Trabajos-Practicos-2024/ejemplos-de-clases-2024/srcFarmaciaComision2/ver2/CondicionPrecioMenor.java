package ver2;

public class CondicionPrecioMenor extends Condicion {

    private double maximo;//GET Y SET
    public CondicionPrecioMenor(double val) {
    	maximo = val;
    }
	public boolean cumple(Medicamento mm) {
		return mm.getPrecio()<maximo;
	}

}
