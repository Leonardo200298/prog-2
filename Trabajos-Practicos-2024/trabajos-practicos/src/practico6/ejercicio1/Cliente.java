package practico6.ejercicio1;

public class Cliente {
    private String nombre;
    private String apellido;

    public Cliente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
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



    public void alquila() {
        System.out.println("pagar");
    }
}
