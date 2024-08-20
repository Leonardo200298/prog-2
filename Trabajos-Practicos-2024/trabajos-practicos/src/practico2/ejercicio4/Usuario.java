package practico2.ejercicio4;

public class Usuario {
    private String nombre;
    private String apellido;

    public Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
