package libreria;

import java.util.ArrayList;

public  class Cliente {

	private String nombre;
	private String apellido;
	private int dni;
	protected ArrayList<String> generos;
	private ArrayList<String> autoresF;
	private ArrayList<Producto> compras;
	//MAL
	private double  descuento;
	
	public Cliente(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		descuento = 10;
		generos = new ArrayList<String>();
		autoresF = new ArrayList<String>();
		compras = new ArrayList<Producto>();
	}

	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public double getDescuento() {
		return descuento;
	}



	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	public void addGeneroFavorito(String ss) {
		if (! generos.contains(ss.toLowerCase())){
			generos.add(ss.toLowerCase());
		}
	}
	public boolean leGustaGenero(String ss) {
		return generos.contains(ss.toLowerCase());
	}
	
	public void noMeGustaMasGenero(String ss) {
		generos.remove(ss.toLowerCase());
	}
	

	public void addAutorFavorito(String ss) {
		if (! autoresF.contains(ss.toLowerCase())){
			autoresF.add(ss.toLowerCase());
		}
	}
	public boolean leGustaAutor(String ss) {
		return autoresF.contains(ss.toLowerCase());
	}
	
	public void noMeGustaMasAutor(String ss) {
		autoresF.remove(ss.toLowerCase());
	}
	

	public void addCompra(Producto ss) {
		compras.add(ss);
		
	}
	public boolean yaCompro(Producto ss) {
		return compras.contains(ss);
	}



	public  boolean leGusta(Producto pp) {
		String autor = pp.getAutor();
		if (!this.leGustaAutor(autor)) {
			return false;
		} else { 
			return true;
		}
	};

	
	
	
}
