package practico6.ejercicio2;

public class OrdenarPorRam extends OrdenarProceso{

    @Override
    public boolean ordenPorProceso(Proceso pp, Proceso pp1) {
        return pp.getRAM() > pp1.getRAM();
    }
    
}
