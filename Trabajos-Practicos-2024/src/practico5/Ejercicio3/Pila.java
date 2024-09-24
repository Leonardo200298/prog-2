package practico5.Ejercicio3;
import java.util.ArrayList;
class Pila {
  
    private ArrayList<Object> objetos;
    
    public Pila(){
      objetos = new ArrayList<>();
    }
    
    public void push(Object o){
      objetos.add(o);
    }
    
    public Object pop(){
      Object aux = new Object();
      int lastIndex=objetos.size()-1;
      aux = objetos.get(lastIndex);
      objetos.remove(lastIndex);
      return aux;
    }
    public Object top(){
      int i =0;
     return objetos.get(i);
    }
    public int size(){
      return objetos.size();
    }
    public ArrayList<Object> copy(){
      ArrayList<Object> aux=new ArrayList<>();
       aux.addAll(objetos); 
      return aux;
    } 
    public ArrayList<Object> reverse(){
       ArrayList<Object> aux=new ArrayList<>();
       ArrayList<Object> aux2=new ArrayList<>();
          aux2=objetos;
      for(int i=0;i<aux.size();i++){
        aux.add(this.pop());
      }
      objetos.addAll(aux2);
      return aux;
    }
    
    
  }