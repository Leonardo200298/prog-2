package recuperatorio_2023;

import java.util.ArrayList;

public class Bloque extends Tarjeta{
    ArrayList<Tarjeta> elementos;
    private double gastoBateriaBloque;

    public Bloque(double gastoBateriaBloque){
        this.elementos = new ArrayList<>();
        this.gastoBateriaBloque = gastoBateriaBloque;
    }
}
