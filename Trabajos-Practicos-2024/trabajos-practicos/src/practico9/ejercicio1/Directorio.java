package practico9.ejercicio1;

import java.util.ArrayList;


public class Directorio extends ElementoSA{
    private ArrayList<ElementoSA> archivos;

    public Directorio(String nombre) {
        super(nombre);
        this.archivos = new ArrayList<>();
  
    }   

    public ArrayList<ElementoSA> getArchivos() {
        return new ArrayList<>(archivos);
    }

    public void setArchivos(ElementoSA archivo) {
        archivos.add(archivo);
    }


    @Override
    public double getTamanio() {
        double acumulador = 0;
        for (ElementoSA elemento : this.archivos) {
            acumulador+= elemento.getTamanio();
        }
        return acumulador;
       
        
    }

    @Override
    public ArrayList<ElementoSA> busqueda(Condicion ee) {
        ArrayList<ElementoSA> salida = new ArrayList<>();
        for (ElementoSA elemento : archivos) {
            salida.addAll(elemento.busqueda(ee);
            
        }
        return salida;
    }
    
}
