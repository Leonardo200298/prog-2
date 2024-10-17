package practico8.ejercicio2;
/*es una modalidad por la cual se agrupa un conjunto de envíos
(cualquier tipo de envío). Todos los envíos incluidos en un combo postal deben tener
la misma ciudad de destino */

import java.util.ArrayList;

public class EnvioCombo extends Envio{

    private ArrayList<Envio> paquetes;
    public EnvioCombo(int tracking){
        super(tracking);
        paquetes = new ArrayList<>();
    }
    public void addPaquete(Envio ee){
        ee.setTracking(this.getTracking());
        if (paquetes.isEmpty()) {
            paquetes.add(ee);    
        }else if (ee.getDireccion().equals(paquetes.get(0).getDireccion())) { 
            paquetes.add(ee);
        }
    }
    @Override
    public String getDireccion() {
        return paquetes.get(0).getDireccion();
    }
    @Override
    public void setTracking(int i){
        super.setTracking(i); //seteo mi tracking con el metodo del padre y desp los hijos con mi implementacion
        for (Envio envio : paquetes) {
            envio.setTracking(i);
        }
    }
    @Override
    public int getPeso() {
        int suma=0;
       for (Envio envio : paquetes) {
        suma +=envio.getPeso();
       }
       return suma;
    }
    @Override
    public String getRetiro() {
        return paquetes.get(0).getRetiro();
    }
}
