package practico8.ejercicio2;

import java.util.ArrayList;

public class ComboPostal extends ElementoEnvio{
    private ArrayList<ElementoEnvio> envios;

    

    public ComboPostal(String ciudadDestino, int numeroTraking) {
        super(ciudadDestino, numeroTraking);
        this.envios = new ArrayList<>();
    }

    public boolean mismaCiudad(ElementoEnvio ee) {
        
        for (ElementoEnvio elementosEnvios : envios) {
            if (!ee.getCiudadDestino().equals(elementosEnvios.getCiudadDestino())) {
                return false;
            }
        }
        return true;
    }
    
    public void agregarElementoEnvio(ElementoEnvio ee){
        if (this.mismaCiudad(ee)) {
            for (ElementoEnvio elementoEnvio : envios) {
                elementoEnvio.setNumeroTraking(ee.getNumeroTraking());
                
            }
            this.envios.add(ee);
        }
    }

    @Override
    public double getPeso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPeso'");
    }



    
    
}
