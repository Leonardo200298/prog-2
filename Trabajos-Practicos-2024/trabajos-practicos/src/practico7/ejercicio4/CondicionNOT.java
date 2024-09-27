package practico7.ejercicio4;

public class CondicionNOT extends Condicion{
    private Condicion con;

    

    public CondicionNOT(Condicion con) {
        this.con = con;
    }

    @Override
    public boolean cumple(Ficha ff) {
        return !con.cumple(ff);

    }

}
