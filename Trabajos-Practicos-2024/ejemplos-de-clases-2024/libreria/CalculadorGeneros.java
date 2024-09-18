package libreria;

public class CalculadorGeneros extends CalculadorPrecio {

	double precioGenero;
	
	public CalculadorGeneros(double precioGenero) {
		super();
		this.precioGenero = precioGenero;
	}

	public double getPrecio(Producto pp) {
		// TODO Auto-generated method stub
		return pp.getGeneros().size()*precioGenero;
	}

}
