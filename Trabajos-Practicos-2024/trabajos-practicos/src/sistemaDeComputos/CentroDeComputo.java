import java.util.ArrayList;

public class CentroDeComputo {
    private ColaEspera computadora;
    private ColaEspera proceso;

    public CentroDeComputo(){
        this.computadora = new ColaEspera();
        this.proceso = new ColaEspera();
    }


    public void agregarComputadora(Computadora compu){
        this.computadora.agregarElemento(compu);
    }

    public Computadora getSiguienteComputadora(){
        return (Computadora) computadora.getSiguiente();
    }

    public Proceso getSiguienteProceso(){
        return (Proceso) proceso.getSiguiente();
    }
}
