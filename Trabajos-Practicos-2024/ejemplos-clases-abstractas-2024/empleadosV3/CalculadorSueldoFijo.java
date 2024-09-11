package empleadosV3;

public class CalculadorSueldoFijo extends CalculadorSueldo {

	double sueldo;
	
	
	public CalculadorSueldoFijo(double sueldo) {
		super();
		this.sueldo = sueldo;
	}


	@Override
	public double calcularSueldo(Empleado ee) {
		return sueldo;
	}

}
