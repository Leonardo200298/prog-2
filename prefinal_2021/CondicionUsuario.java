package prefinal_2021;

public class CondicionUsuario extends Condicion{
    private String usuario;

    public CondicionUsuario(String usuario){
        this.usuario = usuario;
    }

    @Override
    public boolean cumple(Video e) {
        return e.getUsuario().contains(usuario);
    }
    
}
