import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private ArrayList<String> listaAutoresFavoritos;
    private ArrayList<Genero> listaGenerosFavoritos;
    private ArrayList<Producto> listaDeCompras;
    private double descuento;
    
    public Cliente(String nombre, String apellido, String dni, String direccion, double descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.listaAutoresFavoritos = new ArrayList<>();
        this.listaGenerosFavoritos = new ArrayList<>();
        this.listaDeCompras = new ArrayList<>();
        this.descuento = descuento;
    }



    public void setListaDeAutoresFavoritos(String autor){
        this.listaAutoresFavoritos.add(autor);
    }

    public ArrayList<String> getListaDeAutoresFavoritos(){
        return new ArrayList<>(listaAutoresFavoritos);
    }

    public void setListaGenerosFavoritos(Genero gg){
        this.listaGenerosFavoritos.add(gg);
    }

    public ArrayList<Genero> getListaGenero(){
        return new ArrayList<>(listaGenerosFavoritos);
    }

    public void setListaDeComprar(Producto pp){
        this.listaDeCompras.add(pp);
    }

    public ArrayList<Producto> getListaDeCompras(){
        return new ArrayList<>(listaDeCompras);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
