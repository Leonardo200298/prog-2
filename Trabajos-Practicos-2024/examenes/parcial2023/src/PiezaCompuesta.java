import java.util.ArrayList;



public class PiezaCompuesta extends Pieza3D {

	ArrayList<Pieza3D> elems;

	private int extraPla;
	private int extraTiempo;
	
	
	
	
	
	public PiezaCompuesta(String nom, String des,int extraPla, int extraTiempo) {
		super(nom,des);
		this.extraPla = extraPla;
		this.extraTiempo = extraTiempo;
		elems = new ArrayList<Pieza3D>();
	}
	public PiezaCompuesta(String nom, String des) {
		super(nom,des);
		this.extraPla = 1;
		this.extraTiempo = 45;
		elems = new ArrayList<Pieza3D>();
	}

	public int getPla() {
		int suma =0;
		for(int i=0; i<elems.size();i++) {
			suma = suma + elems.get(i).getPla();
		}	
		
		return suma + extraPla * this.getCantidadSimples();
	}
	
	public int getCantidadSimples() {
		int suma =0;
		for(int i=0; i<elems.size();i++)
			suma = suma + elems.get(i).getCantidadSimples();
	
		return suma;
	}
	
	public int getTiempo() {
		int suma =0;
		for(int i=0; i<elems.size();i++) {
			suma = suma + elems.get(i).getTiempo();
		}	
		
		return suma + extraTiempo;
	}
	public ArrayList<String> getColores() {
		ArrayList<String> salida = new ArrayList<String>();
		for(int i=0; i<elems.size();i++) {
			ArrayList<String> aux = elems.get(i).getColores();
			for(String ss : aux) {
				if (!salida.contains(ss)) {
					salida.add(ss);
				}
			}
		}	
		return salida;
	
	}
	
	public void addElemento(Pieza3D pp) {
		elems.add(pp);
	}

	public int getExtraPla() {
		return extraPla;
	}

	public void setExtraPla(int extraPla) {
		this.extraPla = extraPla;
	}

	public int getExtraTiempo() {
		return extraTiempo;
	}

	public void setExtraTiempo(int extraTiempo) {
		this.extraTiempo = extraTiempo;
	}
	
	public ArrayList<Pieza> buscar(Condicion cc){
		ArrayList<Pieza> salida = new ArrayList<Pieza>();
	    for(int i =0; i<elems.size();i++) {
	    	Pieza3D aux = elems.get(i);
	    	salida.addAll(aux.buscar(cc));
	    }
		return salida;
	}
	
	
}
