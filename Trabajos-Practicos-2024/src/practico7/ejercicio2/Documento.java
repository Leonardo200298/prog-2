package practico7.ejercicio2;
import java.util.ArrayList;
public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, String contenido){
        this.titulo = titulo;
        this.contenido = contenido;
        autores = new ArrayList<>();
        palabrasClave = new ArrayList<>();
    }
    public void addPalabra(String ss){
        palabrasClave.add(ss);
    }
    public boolean contienePalabra(String s){
        return palabrasClave.contains(s);
    }
    public void addAutor(String a){
        autores.add(a);
    }

    public String getTitulo() {
        return titulo;
    }
    public ArrayList<String> getAutor(){
        return autores;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    

}
