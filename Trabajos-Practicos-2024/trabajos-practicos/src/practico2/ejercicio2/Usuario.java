package practico2.ejercicio2;

public class Usuario {
    private String nombre;
    private int telefono;
    private String mail;
    private AgendaPersonal agenda;

    public Usuario(String nombre, int telefono, String mail, AgendaPersonal agenda) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.agenda = agenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public AgendaPersonal getAgenda() {
        return agenda;
    }

    public void setAgenda(AgendaPersonal agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + ", Telefono: " + telefono + ", Mail: " + mail;
    }

}
