package practico4.ejercicio5;

import java.time.LocalDate;

public class ProductoCongeladoAgua extends ProductoRefrigerado{
    private double litroDeAgua;
    private double gramoDeSal;
    public ProductoCongeladoAgua(LocalDate fecha_de_vencimiento, int nro_lote, LocalDate fehca_de_envasado,
            String granja_de_origen, int cdo__supervicion_alimentaria, double temperatura_de_mantenimiento,
            double litroDeAgua, double gramoDeSal) {
        super(fecha_de_vencimiento, nro_lote, fehca_de_envasado, granja_de_origen, cdo__supervicion_alimentaria,
                temperatura_de_mantenimiento);
        this.litroDeAgua = litroDeAgua;
        this.gramoDeSal = gramoDeSal;
        
    }

    

    public double getLitroDeAgua() {
        return litroDeAgua;
    }



    public void setLitroDeAgua(double litroDeAgua) {
        this.litroDeAgua = litroDeAgua;
    }



    public double getGramoDeSal() {
        return gramoDeSal;
    }



    public void setGramoDeSal(double gramoDeSal) {
        this.gramoDeSal = gramoDeSal;
    }



    public double salinidad(){
        return this.getGramoDeSal() * this.getLitroDeAgua();
    }

}
