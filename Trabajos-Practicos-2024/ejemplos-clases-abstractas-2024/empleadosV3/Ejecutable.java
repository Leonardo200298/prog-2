package empleadosV3;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e1 = new Empleado("jj",1);
		Empleado e2 = new Empleado("aa",2);
		Empleado e3 = new Empleado("bb", 3);
		
		e1.setCalculador(new CalculadorSueldoFijo(100));
		e2.setCalculador(new CalculadorSueldoComision(0.003));
		e3.setCalculador(new CalculadorSueldoHoras(10));
		e2.setVentas(10000);
		e3.setHoras(100);
		Empresa ee = new Empresa();
		ee.addEmpleado(e1);
		ee.addEmpleado(e2);
		ee.addEmpleado(e3);
		
		System.out.println(ee.totalSueldos());
		
		e3.setCalculador(new CalculadorSueldoFijo(20000));
		

		System.out.println(ee.totalSueldos());
		//System.out.println(((Empleado)e2).getSueldo());
		
		CalculadorSueldoFijo calc1 = new CalculadorSueldoFijo(1000);
		CalculadorSueldoHoras calc2 = new CalculadorSueldoHoras(20);
		CalculadorSuma calc3 = new CalculadorSuma(calc1, calc2);
		CalculadorSuma calc4 = new CalculadorSuma(calc3, calc1);
		
		e3.setCalculador(calc4);
		System.out.println(ee.totalSueldos());
	}

}
