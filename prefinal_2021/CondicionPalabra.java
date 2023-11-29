package prefinal_2021;

public class CondicionPalabra extends Condicion{
    private String palabraClave; 
    @Override
    public boolean cumple(Video e) {
        return e.contienePalabraClave(palabraClave);
    }
    
}
