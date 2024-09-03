package practico5.ejercicio3;
import java.util.ArrayList;
import java.util.Collections;

public class Pila {
    private ArrayList<Object> elementos;

    public Pila(){
        elementos = new ArrayList<>();
    }
    public void push(Object o){
        elementos.add(o);
    }
    public Object pop(){
        Object aux = new Object();
        for (Object object : elementos) {
            aux = object;
        }
        elementos.remove(aux);
        return aux;
    }
    public Object top(){
        return elementos.get(0);
    }
    public int size(){
        int count=0;
        for (Object object : elementos) {
            count++;
        }
        return count;
    }
    public ArrayList<Object> copy(){
        ArrayList<Object> aux = new ArrayList<>();
        aux.addAll(elementos);
        return aux;
    }
    public ArrayList<Object> reverse(){
        ArrayList<Object> aux = new ArrayList<>();
      aux = copy();
        Collections.reverse(aux);
        return aux;
    }
}
