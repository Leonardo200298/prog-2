package empleadosV3;

public class CalculadorSueldoComision extends CalculadorSueldo {

	double porcentaje;
	
	
	public CalculadorSueldoComision(double porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}


	public double calcularSueldo(Empleado ee) {
		
		return ee.getVentas()*porcentaje;
	}

}
