package prueba;

public class Dado {
    private int nroCaras;

    public Dado(int nroCaras) {
        this.nroCaras = nroCaras;
    }

    public int tirar(){
        return  (int)(1+Math.random()*nroCaras);
    }

    public int getNroCaras() {
        return nroCaras;
    }

    public void setNroCaras(int nroCaras) {
        this.nroCaras = nroCaras;
    }
}
