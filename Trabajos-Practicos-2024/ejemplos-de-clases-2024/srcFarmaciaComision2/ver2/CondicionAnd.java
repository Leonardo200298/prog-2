package ver2;

public class CondicionAnd extends Condicion {

	Condicion c1;//GET Y SET
	Condicion c2;
	
	public CondicionAnd(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2= c2;
	}
	public boolean cumple(Medicamento mm) {
	
		return c1.cumple(mm) && c2.cumple(mm);
	}

}
