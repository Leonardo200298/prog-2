package ver2;

public class CondicionNot extends Condicion {

	Condicion c1;//GET Y SET
	
	
	public CondicionNot(Condicion c1) {
		this.c1 = c1;

	}
	public boolean cumple(Medicamento mm) {
	
		return ! c1.cumple(mm);
	}


}
