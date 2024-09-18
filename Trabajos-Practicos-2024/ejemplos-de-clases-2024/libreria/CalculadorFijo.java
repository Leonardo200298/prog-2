package libreria;



public class CalculadorFijo extends CalculadorPrecio {

	double fijo;
	
	public CalculadorFijo(double fijo) {
		super();
		this.fijo = fijo;
	}

	public  double getPrecio(Producto pp) {
		return fijo;
	}
}
