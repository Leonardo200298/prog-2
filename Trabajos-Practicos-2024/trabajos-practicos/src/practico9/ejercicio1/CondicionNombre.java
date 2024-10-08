package practico9.ejercicio1;

public class CondicionNombre extends Condicion{
    private String nombre;

    public CondicionNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoSA ee) {
        return nombre.equalsIgnoreCase(ee.getNombre());
    }

}
