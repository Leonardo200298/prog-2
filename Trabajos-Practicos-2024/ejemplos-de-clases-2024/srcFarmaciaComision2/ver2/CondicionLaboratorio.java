package ver2;

public class CondicionLaboratorio extends Condicion{
	
	private String lab; //GET Y SET
	
	public CondicionLaboratorio(String ll) {
		lab = ll;
	}
	
	public boolean cumple(Medicamento mm) {
		
		return mm.getLaboratorio().equalsIgnoreCase(lab);
	}

}
