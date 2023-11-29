package prefinal_2021;

public class CondicionVisualizaciones extends Condicion{
    private int reproducciones;

    public CondicionVisualizaciones(int reproducciones){
        this.reproducciones = reproducciones;
    }

    @Override
    public boolean cumple(Video e) {
        return e.getCantidadVisualizaciones() > reproducciones;
    }
    
}
