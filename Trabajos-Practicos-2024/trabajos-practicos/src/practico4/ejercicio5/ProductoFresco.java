package practico4.ejercicio5;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
    private LocalDate fecha_de_envasado;
    private String granja_de_origen;

    public ProductoFresco(LocalDate fecha_de_vencimiento, int nro_lote, LocalDate fehca_de_envasado, String granja_de_origen) {
        super(fecha_de_vencimiento, nro_lote);
        this.fecha_de_envasado = fecha_de_vencimiento;
        this.granja_de_origen = granja_de_origen;
    }

    public LocalDate getFecha_de_envasado() {
        return fecha_de_envasado;
    }

    public void setFecha_de_envasado(LocalDate fecha_de_envasado) {
        this.fecha_de_envasado = fecha_de_envasado;
    }

    public String getGranja_de_origen() {
        return granja_de_origen;
    }

    public void setGranja_de_origen(String granja_de_origen) {
        this.granja_de_origen = granja_de_origen;
    }
    

}
