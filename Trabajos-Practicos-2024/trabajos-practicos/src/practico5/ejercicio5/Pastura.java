package practico5.ejercicio5;

public class Pastura extends Grano{
    
    public Pastura(String tipo, Mineral mineral) {
        super(tipo, mineral);
        
    }

    static final int superficieHectareas = 50;

    public static int restriccionDeHectareas(){
        return superficieHectareas;
    }
    
}
