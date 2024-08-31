package practico4.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProductoCongeladoAire extends ProductoRefrigerado{
    private ArrayList<String> composicionDelAire;
    public ProductoCongeladoAire(LocalDate fecha_de_vencimiento, int nro_lote, LocalDate fehca_de_envasado,
            String granja_de_origen, int cdo__supervicion_alimentaria, double temperatura_de_mantenimiento) {
        super(fecha_de_vencimiento, nro_lote, fehca_de_envasado, granja_de_origen, cdo__supervicion_alimentaria,
                temperatura_de_mantenimiento);
    
                this.composicionDelAire = new ArrayList<>();
            }

            public ArrayList<String> getComposicionDelAire(){
                return this.composicionDelAire;
            }

            public void agregarCompuestoDeAire(String elemento){
                this.composicionDelAire.add(elemento);
            }

}
