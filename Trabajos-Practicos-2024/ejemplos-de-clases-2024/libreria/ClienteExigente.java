package libreria;

public class ClienteExigente extends Cliente {

	
	public ClienteExigente(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
		
	}

	public boolean leGusta(Producto pp) {
		boolean meGusta = super.leGusta(pp);
		if (meGusta) {
			for(int i = 0; i<generos.size();i++) {
				if (pp.tieneGenero(generos.get(i))) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
		
	}
	
	

}
