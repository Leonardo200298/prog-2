package ver2;

public class FarmaciaControladora extends Farmacia {

	Condicion criterio;//GET Y SET
	
	public FarmaciaControladora(Condicion cc) {
		super();
		criterio = cc;
	}
	public void addMedicamento(Medicamento mmm) {
		if (criterio.cumple(mmm)) {
			super.addMedicamento(mmm);
		}
	}
	
	
}
