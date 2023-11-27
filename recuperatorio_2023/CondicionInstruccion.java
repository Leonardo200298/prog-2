package recuperatorio_2023;

public class CondicionInstruccion extends Condicion{
    private String instruccion;

    public CondicionInstruccion(String instruccion){
        this.instruccion = instruccion;
    }

    @Override
    public boolean cumple(Comando comando) {
        return comando.getInstruccion().contains(this.instruccion);
    }

}
