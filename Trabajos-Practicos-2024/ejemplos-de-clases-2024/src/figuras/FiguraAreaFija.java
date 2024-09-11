package figuras;

public abstract class FiguraAreaFija extends Figura {

	double area;
	
	public FiguraAreaFija(double aa) {
		super("AreaFija");
		area =aa;
	}
	public double getArea() {
		
		return area;
	}

	

}
