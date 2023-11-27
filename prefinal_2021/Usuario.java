package prefinal_2021;

public class Usuario implements Comparable<Usuario>{
    private String nombre_de_usuario;
    private int anio_de_registro_en_la_plataforma;
    private String email;

    public Usuario(String nombre_de_usuario, int anio_de_registro_en_la_plataforma, String email) {
        this.nombre_de_usuario = nombre_de_usuario;
        this.anio_de_registro_en_la_plataforma = anio_de_registro_en_la_plataforma;
        this.email = email;
    }

    public String getNombre_de_usuario() {
        return nombre_de_usuario;
    }

    public int getAnio_de_registro_en_la_plataforma() {
        return anio_de_registro_en_la_plataforma;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Usuario o) {
        int resultado = nombre_de_usuario.compareTo(o.getNombre_de_usuario());
        if (resultado == 0) {
            return email.compareTo(o.getEmail());
        }
        return resultado;
    }
    
    
}
