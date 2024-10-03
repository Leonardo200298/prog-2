package practico8.ejercicio2;

import java.util.ArrayList;

public class ComboPostal extends ElementoEnvio{
    private ArrayList<ElementoEnvio> envios;

    

    public ComboPostal(String ciudadDestino) {
        super(ciudadDestino);
        this.envios = new ArrayList<>();
    }

    @Override
    public double getPeso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPeso'");
    }
    
}
