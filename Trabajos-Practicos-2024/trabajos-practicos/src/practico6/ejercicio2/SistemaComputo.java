package practico6.ejercicio2;
import java.util.ArrayList;

public class SistemaComputo {
    private ArrayList<Proceso> colaEspera;
    private ArrayList<Computadora> cola;
    private OrdenarPorComputadora ordenParaComp;
    private OrdenarProceso ordenParaProc;

    public SistemaComputo(){
        this.colaEspera = new ArrayList<>();
        this.cola = new ArrayList<>();
    }
  
    public ArrayList<Proceso> getColaEspera() {
        return new ArrayList<>(colaEspera);
    }

    public void setColaEspera(Proceso ce) {
        if (!colaEspera.contains(ce)) {
            colaEspera.add(ce);
        }
    }

    public ArrayList<Computadora> getCola() {
        return new ArrayList<>(cola);
    }

    public void agregarEleColaEspera(Computadora cc){
        int i = 0;
        while (i < cola.size() && ordenParaComp.ordenarPorVelocidad(cc,cola.get(i))) {
            i++;
        }
        if (i < cola.size()) {
            cola.add(i, cola.get(i));
        }else{
            cola.add(cola.get(i));
        }
    }

    public void agregarEleAdentroCola(Proceso pp){
        int i = 0;
        while (i< colaEspera.size() && ordenParaProc.ordenPorProceso(pp, colaEspera.get(i))) {
            i++;
        }
        if (i < colaEspera.size()) {
            colaEspera.add(i, colaEspera.get(i));
        }else{
            colaEspera.add(pp);
        }
    }
}
