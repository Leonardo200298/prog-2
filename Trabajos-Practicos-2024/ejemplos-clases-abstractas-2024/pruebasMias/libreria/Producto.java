import java.util.ArrayList;

public class Producto {

    private String nombre;
    private String autor;
    private int cantPaginas;
    private double precio;
    private String resumen;
    private ArrayList<Genero> generos;
    private CalculadoraPrecio calculadora;


    public Producto(String nombre, String autor, int cantPaginas, double precio, String resumen) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.precio = precio;
        this.resumen = resumen;
        this.generos = new ArrayList<>();
    }

    public ArrayList<Genero> getGeneros(){
        return new ArrayList<>(generos);
    }

    public void setGenero(Genero gg){
        this.generos.add(gg);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public double getPrecio() {
        return calculadora.getPrecio(this);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    

    
    
}