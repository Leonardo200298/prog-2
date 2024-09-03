package practico5.ejercicio1;

import java.time.LocalDate;

public class Planta {
    private String nombre_cientifico;
    private String nombre_comun;
    private String pais_de_origen;
    private LocalDate fecha_de_compra;
    static int contador = 0;
    private int id;
/* 1 - El Jardín privado
Se desea implementar un sistema de gestión de plantas para un Jardín privado, de cada planta
se guarda su nombre científico, su nombre común, país de origen, fecha de compra y un
identificador único. Cada vez que se crea una planta nueva para la colección, se debe asignar
un número nuevo de forma automática e incremental.  */
    public Planta(String nombre_cientifico, String nombre_comun, String pais_de_origen, LocalDate fecha_de_compra){
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_comun = nombre_comun;
        this.pais_de_origen = pais_de_origen;
        this.fecha_de_compra = fecha_de_compra;
        this.id = contador++;
    }
    public String getNombre_cientifico() {
        return nombre_cientifico;
    }
    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }
    public String getNombre_comun() {
        return nombre_comun;
    }
    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }
    public String getPais_de_origen() {
        return pais_de_origen;
    }
    public void setPais_de_origen(String pais_de_origen) {
        this.pais_de_origen = pais_de_origen;
    }
    public LocalDate getFecha_de_compra() {
        return fecha_de_compra;
    }
    public void setFecha_de_compra(LocalDate fecha_de_compra) {
        this.fecha_de_compra = fecha_de_compra;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Planta.contador = contador;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
