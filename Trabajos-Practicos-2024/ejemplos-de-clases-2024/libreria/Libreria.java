package libreria;

import java.util.ArrayList;

public class Libreria {

	ArrayList<Cliente> clientes;
	
	
	public double getPrecio(Producto pp, Cliente cc) {
		double valorProducto = pp.getPrecio();
		return valorProducto - valorProducto*cc.getDescuento();
	}
	public boolean compro(Cliente cc, Producto pp) {
		return cc.yaCompro(pp);
	}
	
	public boolean leGustaProducto(Cliente cc,Producto pp ) {
		return cc.leGusta(pp);
	}
	
	
public ArrayList<Cliente> clientesQueLesGusta(Producto pp){
		ArrayList<Cliente> salida = new ArrayList<Cliente>();
		for(int i = 0; i<clientes.size();i++) {
			Cliente cc = clientes.get(i);
			if (cc.leGusta(pp)) {
				salida.add(cc);
			}
		}
		return salida;
	}
}
