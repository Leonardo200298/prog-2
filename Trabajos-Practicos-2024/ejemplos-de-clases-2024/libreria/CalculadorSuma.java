package libreria;

public class CalculadorSuma extends CalculadorPrecio {

	CalculadorPrecio c1, c2;
	
	
	
	
	public CalculadorSuma(CalculadorPrecio c1, CalculadorPrecio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}




	public double getPrecio(Producto pp) {
		// TODO Auto-generated method stub
		return c1.getPrecio(pp) + c2.getPrecio(pp);
	}

}
