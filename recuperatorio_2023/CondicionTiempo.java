package recuperatorio_2023;

public class CondicionTiempo extends Condicion{
    private int tiempo;

    public CondicionTiempo(int tiempo){
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(Comando comando) {
        return comando.getTiempoDeEjecucion() > this.tiempo;
    }
    
}
