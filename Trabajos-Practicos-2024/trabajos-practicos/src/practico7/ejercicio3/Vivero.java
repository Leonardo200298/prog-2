package practico7.ejercicio3;

import java.util.ArrayList;

public class Vivero {
    private ArrayList<Planta> plantas;

    public Vivero(){
        this.plantas = new ArrayList<>();
    }

    public void addPlanta(Planta pp){
        if (!this.plantas.contains(pp)) {
            
            this.plantas.add(pp);
        }

    }

    public ArrayList<Planta> buscar(Condicion cc){
        ArrayList<Planta> salida = new ArrayList<>();
        for (Planta planta : plantas) {
            if (cc.cumple(planta)) {
                this.addPlanta(planta);
            }
        }
        return salida;
    }
}
