package ver2;
import java.util.ArrayList;

public class Farmacia {

	private ArrayList<Medicamento> remedios;
	

	public Farmacia() {
		remedios = new ArrayList<Medicamento>();

	}
	
	public void addMedicamento(Medicamento mm) {
		
		if (!remedios.contains(mm) ){
			remedios.add(mm);
		}
			
	}
	
	public boolean tieneMedicamento(Medicamento mm) {
		return remedios.contains(mm);
	}
	public void removeMedicamento(Medicamento mm) {
		remedios.remove(mm);
	}
	
	
	public double getSumaPrecios() {
		double suma =0;
		for(int i = 0; i<remedios.size();i++) {
			suma = suma + remedios.get(i).getPrecio();
		}
		return suma;
	}

	public ArrayList<Medicamento> buscar(Condicion con){
		ArrayList<Medicamento> salida= new ArrayList<Medicamento>();
		for(int i = 0; i<remedios.size();i++) {
			Medicamento mm = remedios.get(i);
			if (con.cumple(mm))
				salida.add(mm);
		}
		return salida;
	}

}