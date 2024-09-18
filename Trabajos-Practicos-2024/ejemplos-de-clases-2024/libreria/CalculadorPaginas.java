package libreria;

public class CalculadorPaginas extends CalculadorPrecio{

	double precioPagina;
	
	public CalculadorPaginas(double precioPagina) {
		super();
		this.precioPagina = precioPagina;
	}

	public  double getPrecio(Producto pp) {
		return pp.getCantPaginas()*precioPagina;
	};
}
