package empleadosV3;

public class CalculadorSueldoHoras extends CalculadorSueldo {

	  double precioHora;
	  
	  
	  
	public CalculadorSueldoHoras(double precioHora) {
		super();
		this.precioHora = precioHora;
	}



	public double calcularSueldo(Empleado ee) {
	
		return ee.getHoras()*precioHora;
	}

}
