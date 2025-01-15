package practico11.ejercicio1;

public class CondicionCancha extends Condicion{
    private int idCancha;
    
    public CondicionCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public boolean cumple(Socio ss) {
        return ss.contieneCancha(idCancha);
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }
}
