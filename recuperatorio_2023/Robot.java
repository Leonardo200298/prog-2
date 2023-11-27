package recuperatorio_2023;

public class Robot {
    private int nivelDeBateria;

    public Robot(int nivelDeBateria){
        this.nivelDeBateria = nivelDeBateria;
    }

    public int getNivelDeBateria(){
        return nivelDeBateria;
    }

    public void descargarBateria (double cantidad){
        this.nivelDeBateria = (int) (cantidad - this.nivelDeBateria);
        if (this.nivelDeBateria < 0){
            this.nivelDeBateria = 0;
        }
    }

    public boolean sePuedeEjecutar (Tarjeta consumo){
        return this.getNivelDeBateria() > consumo.getCantidadDeEnergiaNecesaria();
    }

    public String ejecutar(Tarjeta programa){
        if (this.sePuedeEjecutar(programa)){
            this.descargarBateria(programa.getCantidadDeEnergiaNecesaria());
            return programa.cantidadDeTarjetas() + "-" +  programa.getInstrucciones();
        }
        return null;
    }
}
