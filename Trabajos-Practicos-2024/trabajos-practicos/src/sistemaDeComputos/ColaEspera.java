import java.util.ArrayList;
public class ColaEspera {
    
    private ArrayList<ElementoCola> elementos;

    public ColaEspera(){
        this.elementos = new ArrayList<>();
    }


    public void agregarElemento(ElementoCola cc){
        boolean inserto = false;
        int indice=0;
        while (!inserto && indice < this.elementos.size()) {
            if (cc.esMayor(this.elementos.get(indice))) {
                elementos.add(indice,cc);
                indice++;
            }

        }
        if (!inserto) {
            elementos.add(cc);
        }
    }

    public ElementoCola getSiguiente(){
        if (tieneElementos())
            return this.elementos.remove(0);
        else
            return null;

    }

    public boolean tieneElementos(){
        return !this.elementos.isEmpty();
    }
}
