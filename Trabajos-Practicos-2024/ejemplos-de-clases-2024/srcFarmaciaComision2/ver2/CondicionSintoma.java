package ver2;

public class CondicionSintoma extends Condicion {

	private String sintoma;
	
	
	public CondicionSintoma(String sintoma) {
		super();
		this.sintoma = sintoma;
	}


	public boolean cumple(Medicamento mm) {
		// TODO Auto-generated method stub
		return mm.tieneSintoma(sintoma);
	}

}
