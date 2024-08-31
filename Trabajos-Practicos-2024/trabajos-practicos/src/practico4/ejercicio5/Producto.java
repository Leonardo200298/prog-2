package practico4.ejercicio5;

import java.time.LocalDate;

public class Producto {
    private LocalDate fecha_de_vencimiento;
    private int nro_lote;

    public Producto(LocalDate fecha_de_vencimiento, int nro_lote){
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.nro_lote = nro_lote;
    }

    public LocalDate getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(LocalDate fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public int getNro_lote() {
        return nro_lote;
    }

    public void setNro_lote(int nro_lote) {
        this.nro_lote = nro_lote;
    }
    
    public static void main(String[] args) {
        Producto p1 = new Producto(null, 0);
        System.out.println();
    }
    
    
}
