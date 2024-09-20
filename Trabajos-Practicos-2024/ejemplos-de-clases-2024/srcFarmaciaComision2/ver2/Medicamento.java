package ver2;
import java.util.ArrayList;

public class Medicamento {
/* De cada uno de ellos guarda,
 *  el nombre, laboratorio, precio, 
 *  un conjunto de síntomas que trata.
*/
	private String nombre;
	private String laboratorio;
	private double precio;
	private ArrayList<String> sintomas;
	public Medicamento(String nombre, String laboratorio, double precio) {
		super();
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.precio = precio;
		sintomas = new ArrayList<String>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void addSintoma(String ss) {
		if (!sintomas.contains(ss.toUpperCase())) {
			sintomas.add(ss.toUpperCase());
		}
	}
	public boolean tieneSintoma(String ss) {
	/*	if (sintomas.contains(ss.toUpperCase())) {
			return true;
		}else {
			return false;
		}*/
		return sintomas.contains(ss.toUpperCase());
	}
	
	public void removerSintoma(String ss) {
		sintomas.remove(ss);
	}
	
	public boolean equals(Object o1) {
		try {
			Medicamento mm = (Medicamento)o1;
			for(int i =0; i<sintomas.size();i++) {
				if (!mm.tieneSintoma(sintomas.get(i))) {
					return false;
				}
			}
			return nombre.equalsIgnoreCase(mm.getNombre())&&
					laboratorio.equalsIgnoreCase(mm.getLaboratorio())&&
					precio == mm.getPrecio() &&
					this.cantidadSintomas() == mm.cantidadSintomas();
					
		} catch(Exception ee) {
			return false;
		}
	}
	
	public int cantidadSintomas() {
		return sintomas.size();
	}
	
	public String toString() {
		return nombre + "-" + laboratorio + "-" + precio+ "-" + sintomas;
	}
}
