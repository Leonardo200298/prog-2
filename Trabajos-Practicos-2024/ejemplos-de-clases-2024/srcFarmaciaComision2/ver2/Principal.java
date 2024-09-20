package ver2;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Medicamento m1 = new Medicamento("Aspirinetas", "Bayer",3.5);
		m1.addSintoma("tos");
		m1.addSintoma("cefalea");
		m1.addSintoma("fiebre");
		Medicamento m2 = new Medicamento("Cafiaspirina", "Bayer",5.5);
		m2.addSintoma("cefalea");
		m2.addSintoma("fiebre");
		Medicamento m3 = new Medicamento("Novalgina", "Bago",100);
		Medicamento m4 = new Medicamento("Dexalergin", "Elea",13.5);
		
		Farmacia laNueva = new Farmacia();
		laNueva.addMedicamento(m1);
		laNueva.addMedicamento(m2);
		laNueva.addMedicamento(m3);
		laNueva.addMedicamento(m4);
		
		CondicionLaboratorio clab = new CondicionLaboratorio("Bayer");
		CondicionPrecioMenor cMenor = new CondicionPrecioMenor(12);
		CondicionSintoma cSin = new CondicionSintoma("tos");
		
		CondicionAnd cand1 = new CondicionAnd(clab, cMenor);
		CondicionAnd cand2 = new CondicionAnd(cand1, cSin);
		
		CondicionNot cnot = new CondicionNot(clab);
		CondicionOr cor = new CondicionOr(clab, new CondicionLaboratorio("Elea"));
		ArrayList<Medicamento> busqueda = 
				laNueva.buscar(cor);
		
		System.out.println(busqueda);
	}
}
