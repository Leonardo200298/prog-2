package practico6.ejercicio2;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Proceso> colaProcesos; 
    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> procesos;

    public Sistema(){
        colaProcesos = new ArrayList<>();
        computadoras = new ArrayList<>();
        procesos = new ArrayList<>();
    }
    
    public void addComputadora(Computadora c){
        if (computadoras.isEmpty()) {
            computadoras.add(c);
        }else{
            for (int i = 0; i < computadoras.size(); i++) {
                if (c.getRapidez()>computadoras.get(i).getRapidez()) {
                    computadoras.add(i,c);
                }
            }
            
        }
        
    }
    public void addProceso(Proceso p){
        procesos.add(p);
    }
    public Proceso getPrimerProceso(){
        return procesos.getFirst();
    }
    public void ejecutarProcesos(){
        if (hayPcDisponible()) {
       for (Computadora pc : computadoras) {
        if (pc.isDisponiblidad()) {
            pc.ejecutar(getPrimerProceso());
        }
       }
        }else{
            addProcesoAcola(getPrimerProceso());
       }
    }

    
    public boolean hayPcDisponible(){
        for (Computadora pc : computadoras) {
        if (!pc.isDisponiblidad()) {
            return false;
        }
    }
    return true;
    }
    public void addProcesoAcola(Proceso p){
        if (colaProcesos.isEmpty()) {
            colaProcesos.add(p);
        }else{
            for (int i = 0; i < colaProcesos.size(); i++) {
                if (p.getRequerimientoMemoria()>colaProcesos.get(i).getRequerimientoMemoria()) {
                    colaProcesos.add(i,p);
                }
            }
        }
    }
    
}
