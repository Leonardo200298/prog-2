package practico4.ejercicio5;

import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends ProductoRefrigerado{
    private String metodoDeCongelacionEmpleado;
    private double tiempoDeExposicion;
    public ProductoCongeladoNitrogeno(LocalDate fecha_de_vencimiento, int nro_lote, LocalDate fehca_de_envasado,
            String granja_de_origen, int cdo__supervicion_alimentaria, double temperatura_de_mantenimiento,
            String metodoDeCongelacionEmpleado, double tiempoDeExposicion) {
        super(fecha_de_vencimiento, nro_lote, fehca_de_envasado, granja_de_origen, cdo__supervicion_alimentaria,
                temperatura_de_mantenimiento);
        this.metodoDeCongelacionEmpleado = metodoDeCongelacionEmpleado;
        this.tiempoDeExposicion = tiempoDeExposicion;
    }
    public String getMetodoDeCongelacionEmpleado() {
        return metodoDeCongelacionEmpleado;
    }
    public void setMetodoDeCongelacionEmpleado(String metodoDeCongelacionEmpleado) {
        this.metodoDeCongelacionEmpleado = metodoDeCongelacionEmpleado;
    }
    public double getTiempoDeExposicion() {
        return tiempoDeExposicion;
    }
    public void setTiempoDeExposicion(double tiempoDeExposicion) {
        this.tiempoDeExposicion = tiempoDeExposicion;
    }
    

}
