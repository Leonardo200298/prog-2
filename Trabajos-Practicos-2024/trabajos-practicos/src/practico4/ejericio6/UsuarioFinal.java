package practico4.ejericio6;

public class UsuarioFinal {
    
    private String nombre_usuario;
    private String contrasenia;


    public UsuarioFinal(String nombre, String apellido, int edad, String nombre_usuario, String contrasenia) {
        
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    

}
