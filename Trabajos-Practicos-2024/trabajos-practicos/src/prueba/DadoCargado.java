package prueba;

public class DadoCargado extends Dado{
    public static final int VAL_MIN = 3;

    public DadoCargado(int nroCaras) {
        super(nroCaras);
    }

    public int tirar(){
        int valor = super.tirar();
        if (valor<VAL_MIN) return valor;
        else return super.getNroCaras();
    }

    public static void main(String[] args) {
        DadoCargado dc= new DadoCargado(6);
        for (int i = 0; i < 20; i++) {
            System.out.println(dc.tirar());
        }
    }
}