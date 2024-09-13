package practico5.ejercicio6;

import java.util.ArrayList;

public class Ciudad {
    private ArrayList<Contribuyente> contribuyentes;

    public Ciudad(){
        this.contribuyentes = new ArrayList<>();
    }

    public ArrayList<Contribuyente> getContribuyentes() {
        return contribuyentes;
    }

    public void addContribuyente(Contribuyente cc){
        this.getContribuyentes().add(cc);
    }
}
