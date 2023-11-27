package recuperatorio_2023;

public class CondicionBateria extends Condicion{

    private double bateria;

    public CondicionBateria(double bateria){
        this.bateria = bateria;
    }

    @Override
    public boolean cumple(Comando comando) {
        return comando.getCantidadDeEnergiaNecesaria() < this.bateria;
    }
    
}
