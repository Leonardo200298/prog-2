package empleadosV3;

import java.util.ArrayList;

public class Empresa {

	ArrayList<Empleado> empleados;
	
	public Empresa() {
		empleados = new ArrayList<Empleado>();
	}
	
	public void addEmpleado(Empleado ee) {
		if (!empleados.contains(ee))
				empleados.add(ee);
	}
	
	public double totalSueldos() {
		double suma = 0;
		for(int i=0;i<empleados.size();i++) {
			Empleado ee = empleados.get(i);
			suma = suma + ee.getSueldo();
		}
		return suma;
	}
}
