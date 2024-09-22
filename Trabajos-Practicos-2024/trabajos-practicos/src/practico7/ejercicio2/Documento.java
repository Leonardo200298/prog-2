package practico7.ejercicio2;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> listaAutores;
    private String contenidoTextual;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, String contenidoTextual) {
        this.titulo = titulo;
        this.listaAutores = new ArrayList<>();
        this.contenidoTextual = contenidoTextual;
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public ArrayList<String> getListaAutores() {
        return new ArrayList<>(listaAutores);
    }
    public void setListaAutores(String autor) {
        if (!listaAutores.contains(autor)) {
            
            this.listaAutores.add(autor);
        }
    }
    public String getContenidoTextual() {
        return contenidoTextual;
    }
    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }
    public void setPalabrasClave(String palabraClave) {
        if (!palabraClave.contains(palabraClave)) {
            this.palabrasClave.add(palabraClave);
        }
    }
    
    public boolean existePalabraClave(String palabraClave){
        return this.palabrasClave.contains(palabraClave.toUpperCase());
    }

    public boolean existeAutor(String autor){
        return this.listaAutores.contains(autor.toUpperCase());
    }
    
}
