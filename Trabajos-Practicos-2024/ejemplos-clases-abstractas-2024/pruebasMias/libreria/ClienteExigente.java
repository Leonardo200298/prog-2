public class ClienteExigente extends Cliente{

    public ClienteExigente(String nombre, String apellido, String dni, String direccion, double descuento) {
        super(nombre, apellido, dni, direccion, descuento);
       
    }
    @Override
    public boolean leGusta(Producto pp) {
        boolean leGustaP = super.leGusta(pp);
        if (leGustaP) {
            for (Genero genre : super.getListaGenero()) {
                if (pp.getGeneros().equals(genre)) {
                    return true;
                }
            }
        }
        return false;
    }
}
