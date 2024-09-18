package libreria;

import java.util.ArrayList;
import java.util.Objects;

public class Producto {

	private String nombre; //get y set
	private String autor;//get y set

	private int cantPaginas;//get y set
	private String resumen;//get y set
	private ArrayList<String> generos;
	
	private CalculadorPrecio calculadora;//AGREGAR AL CONSTRUCTOR
	public Producto(String nombre, String autor, CalculadorPrecio precio, int cantPaginas, String resumen) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.calculadora = precio;
		this.setCantPaginas(cantPaginas);
		this.resumen = resumen;
		this.generos = new ArrayList<>();

	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecio() {
		return calculadora.getPrecio(this);
	}

	public int getCantPaginas() {
		
		return cantPaginas;
	}

	public void setCantPaginas(int cantPaginas) {
		if (cantPaginas >0)
			this.cantPaginas = cantPaginas;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	
	public void setGeneros(ArrayList<String> generos) {
		// NO, ROMPE ENCAPSULAMIENTO
		//this.generos = generos;
		for(int i = 0; i< generos.size();i++) {
			this.addGenero(generos.get(i));
		}
	}
	
	public void addGenero(String ss) {
		if (! generos.contains(ss.toLowerCase())){
			generos.add(ss.toLowerCase());
		}
	}
	
	public boolean tieneGenero(String ss) {
		return generos.contains(ss.toLowerCase());
	}
	
	public void removeGenero(String ss) {
		generos.remove(ss.toLowerCase());
	}
	
	public void removeAllGeneros() {
		generos.clear();
	}
	
	public void addGenerosDeCero(ArrayList<String> nuevosGeneros) {
		this.removeAllGeneros();
		this.setGeneros(nuevosGeneros);
	}

	public ArrayList<String> getGeneros(){
/*		ArrayList<String> genCopia = new ArrayList<String>();
		genCopia.addAll(generos);
		return genCopia;
*/
	/*	ArrayList<String> genCopia = new ArrayList<String>(generos);
		return genCopia;
	*/
	
		//return (ArrayList<String>)generos.clone();
		return 	new ArrayList<String>(generos);
	}



	public boolean equals(Object obj) {
	   try {
		   Producto pp = (Producto)obj;
		   return this.getNombre().equalsIgnoreCase(pp.getNombre()) &&
				   this.getAutor().equalsIgnoreCase(pp.getAutor());
	   } catch(Exception e) {
		   return false;
	   }
	
	}
	
	
}
