package figuras;

public class Figura3D {

	private String nombre;
	private double altura;
	private Figura base;
	
	public Figura3D(String nombre, double altura, Figura base) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.base = base;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Figura getBase() {
		return base;
	}

	public void setBase(Figura base) {
		this.base = base;
	}
	
	public double getVolumen() {
		return base.getArea()*altura;
	}
	
	public double getSuperficie() {
		return base.getPerimetro()*altura +base.getArea()*2;
	}
	
}
