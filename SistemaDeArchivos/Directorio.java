package SistemaDeArchivos;

import java.util.ArrayList;

public class Directorio extends ElementoSistema{
    private ArrayList<ElementoSistema> elementos;

    public Directorio(String nombre,double tamanio) {
        super(nombre,tamanio);
        this.elementos = new ArrayList<>();
    }
    @Override
    public int getTamanio() {
        int tamanio=0;
        for (ElementoSistema i : elementos) {
            tamanio+=i.getTamanio();
        }
        return tamanio;
    }
   /*  public String getPalabraEntreLosElementos(String palabra){
       
    } */
    @Override
    public ArrayList<ElementoSistema> buscar(Condicion condicion) {
        ArrayList<ElementoSistema> salida= new ArrayList<>();
        for (ElementoSistema e : elementos) {
            if (condicion.cumple(this)) {
                salida.addAll(e.buscar(condicion));
            }
        }
        return salida;
    }
}
