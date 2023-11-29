package prefinal_2021;

public class CondicionAnio extends Condicion{
    private int anio;

    public CondicionAnio(int anio){
        this.anio = anio;
    }

    @Override
    public boolean cumple(Video e) {
        /* ● Devolver un listado con los videos del año 2020.
 */
        return e.getAnioPublicacion() == anio;
    }
    
}
