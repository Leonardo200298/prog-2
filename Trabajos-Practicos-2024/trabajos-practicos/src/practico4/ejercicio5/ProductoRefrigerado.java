package practico4.ejercicio5;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco{
    private int cdo__supervicion_alimentaria;
    private double temperatura_de_mantenimiento;
    public ProductoRefrigerado(LocalDate fecha_de_vencimiento, int nro_lote, LocalDate fehca_de_envasado,
            String granja_de_origen, int cdo__supervicion_alimentaria, double temperatura_de_mantenimiento) {
        super(fecha_de_vencimiento, nro_lote, fehca_de_envasado, granja_de_origen);
        this.cdo__supervicion_alimentaria = cdo__supervicion_alimentaria;
        this.temperatura_de_mantenimiento = temperatura_de_mantenimiento;
    }
    public int getCdo__supervicion_alimentaria() {
        return cdo__supervicion_alimentaria;
    }
    public void setCdo__supervicion_alimentaria(int cdo__supervicion_alimentaria) {
        this.cdo__supervicion_alimentaria = cdo__supervicion_alimentaria;
    }
    public double getTemperatura_de_mantenimiento() {
        return temperatura_de_mantenimiento;
    }
    public void setTemperatura_de_mantenimiento(double temperatura_de_mantenimiento) {
        this.temperatura_de_mantenimiento = temperatura_de_mantenimiento;
    }
    

}
