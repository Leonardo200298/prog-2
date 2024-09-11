package figuras;

public  class Circulo extends Figura{
	double radio;

	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return radio*radio*Math.PI;
	}
	
	public double getPerimetro() {
		return radio*2*Math.PI;
	}
	
	public double getDiametro() {
		return radio*2;
	}
}
