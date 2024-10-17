package practico8.ejercicio1;

public class Comprimido extends Directorio{
    static int tasaCompresion =10;
    public Comprimido(String nombre) {
        super(nombre);
    
    }

    public static int getTasaCompresion() {
        return tasaCompresion;
    }
    public static void setTasaCompresion(int tasaCompresion) {
        Comprimido.tasaCompresion = tasaCompresion;
    }
    public String comprimir(){
        return "Comprimido";
    }

}
