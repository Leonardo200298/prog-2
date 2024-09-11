package empleadosV3;

public class CalculadorSuma extends CalculadorSueldo {

	CalculadorSueldo c1, c2;
	
	
	public CalculadorSuma(CalculadorSueldo c1, CalculadorSueldo c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	public double calcularSueldo(Empleado ee) {
		// TODO Auto-generated method stub
		return c1.calcularSueldo(ee) +  c2.calcularSueldo(ee);
	}

}
