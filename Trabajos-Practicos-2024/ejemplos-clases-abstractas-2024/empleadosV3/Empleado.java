package empleadosV3;

public  class Empleado {
/*La forma de calcular el sueldo se puede cambiar
 * Calculador de Sueldo
 * 
 */
	private String nombre;
	private int dni;
	
	private double ventas;
	
	private double horas;
	
	
	private CalculadorSueldo calculador;
	
	
	public CalculadorSueldo getCalculador() {
		return calculador;
	}

	public void setCalculador(CalculadorSueldo calculador) {
		this.calculador = calculador;
	}

	public Empleado(String nombre, int dni ) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	
		
	}
	
	public double getSueldo() {
		return calculador.calcularSueldo(this);
	}
	




	public double getVentas() {
		return ventas;
	}



	public void setVentas(double ventas) {
		this.ventas = ventas;
	}






	public double getHoras() {
		return horas;
	}



	public void setHoras(double horas) {
		this.horas = horas;
	}





	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}


	
	public boolean equals(Object o1) {
		if (o1 instanceof Empleado) {
			Empleado ee = (Empleado)o1;
			return ee.getDni() == dni;
		} else {
			return false;
		}
	}
	
}
