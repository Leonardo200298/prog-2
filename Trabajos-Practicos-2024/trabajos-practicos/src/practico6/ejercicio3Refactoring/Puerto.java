package practico6.ejercicio3Refactoring;
import java.util.ArrayList;

public class Puerto {
    private ArrayList<Transporte> cola;
    private ArrayList<Transporte> transportes;
    private ComparadorTransporte comparadorDeTransporte;

    public Puerto() {
        this.cola = new ArrayList<>();
        this.transportes = new ArrayList<>();
    }

    public void agregarElementosOrdenadosAlaCola(Transporte tt){
        int lugar = 0;
        while (lugar < this.cola.size() && comparadorDeTransporte.comparar(tt, cola.get(lugar))) {
            lugar++;
        }
        if (lugar < this.cola.size()) {
            cola.add(lugar, tt);    
        }else{
            cola.add(tt);
        }
    }


    public void descargarTransporte(){
        int i = 0;
        while (this.transportes.size()>0) {
            this.transportes.add(this.cola.get(i));
            i++;
            this.cola.remove(i);
        }

    }

    public ArrayList<Transporte> getCola() {
        return new ArrayList<>(cola);
    }
    //no agrega repetidos
    public void setCola(Transporte col) {
        if (!cola.contains(col)) {
            cola.add(col);
        }
    }
    public ArrayList<Transporte> getTransportes() {
        return new ArrayList<>(transportes);
    }
    public void setTransportes(Transporte trans) {
        if (!transportes.contains(trans)) {
            transportes.add(trans);
        }
    }

    

    

}
