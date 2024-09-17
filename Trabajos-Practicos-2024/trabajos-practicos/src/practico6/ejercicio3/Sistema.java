package practico6.ejercicio3;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Vehiculo> colaEspera;
    private ArrayList<Vehiculo> colaCamiones;
    public Sistema() {
        colaEspera=new ArrayList<>();
        colaCamiones = new ArrayList<>();
    }
    public void addCamion(Vehiculo c){
        if (colaCamiones.isEmpty()) {
            colaCamiones.add(c);
        }else{
            for (int i = 0; i < colaCamiones.size(); i++) {
                if (colaCamiones.get(i).getFechaCarga().isAfter(c.getFechaCarga())) {
                    colaCamiones.add(i,c);
                }
            }
        }
    }
    public void addBarco(Vehiculo b){
        if (colaEspera.isEmpty()) {
            colaEspera.add(b);
        }else{
            for (int i = 0; i < colaEspera.size(); i++) {
                if (colaEspera.get(i).getCapacidad()<b.getCapacidad()) {
                    colaEspera.add(i,b);
                }
            }
        }
    }
    public void cargar(){
        for (int index = 0; index < colaEspera.size(); index++) {
            Vehiculo barco = colaEspera.get(index);
            for (Vehiculo camion : colaCamiones) {
                barco.setCargaParcial(camion.descarga());
            }
        }
    }

    
}
