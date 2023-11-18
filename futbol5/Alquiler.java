package futbol5;

import java.util.ArrayList;

public class Alquiler extends ElementoRegistro{
    private ArrayList<ElementoRegistro> elementos;

    public Alquiler(){
        this.elementos = new ArrayList<>();
    }
    @Override
    public ArrayList<Cancha> canchasAlquilasSegunId(int id) {
        ArrayList salida = new ArrayList<>();
        for (ElementoRegistro e : elementos) {
            ArrayList<Cancha> canchasQueCumplen = e.canchasAlquilasSegunId(id);
            salida.addAll(canchasQueCumplen);
        }
        return salida;
        
    }
    
}
