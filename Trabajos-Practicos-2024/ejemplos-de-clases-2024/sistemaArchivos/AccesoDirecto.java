package sistemaArchivos;

import sistemaArchivos.condiciones.Condicion;

import java.util.ArrayList;

public class AccesoDirecto extends ElementoSA{
    private static final String PREFIJO = "Acceso directo a ";
    private static final double TAM_DEFECTO = 1.0;
    private ElementoSA destino;
    public AccesoDirecto(ElementoSA destino) {
        super(PREFIJO+destino.getNombre());
        this.destino = destino;
    }

    @Override
    public double getTamanio() {
        return TAM_DEFECTO;
    }

    @Override
    public int cantElementos() {
        return 1;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        return new ArrayList<>();
    }
}
