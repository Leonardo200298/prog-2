package practico8.ejercicio3;
/* En One Piece cada personaje
individual posee un nombre, una edad, un peso y fuerza */
public class Personaje  extends ElementoOP{

    private int edad;
    private int peso;
    static int fuerza = 125;
    private Fruta modificador;

    public Personaje (String nombre, int edad, int peso){
        super(nombre);
        this.edad = edad;
        this.peso = peso;
        modificador = null;
    }
    public Personaje (String nombre, int edad, int peso,Fruta modificador){
        super(nombre);
        this.edad = edad;
        this.peso = peso;
        this.modificador = modificador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getFuerza() {
        return fuerza;
    }

    public static void setFuerza(int ff) {
        fuerza = ff;
    }
    public void setFruta(Fruta ff){
        modificador = ff;
    }

}
