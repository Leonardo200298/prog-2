package figuras;

public class FiguraFija extends FiguraAreaFija {

	double perimetro;
	public FiguraFija(double aa, double per) {
		super(aa);
		perimetro = per;
	}
	public double getPerimetro() {
		
		return perimetro;
	}

}
