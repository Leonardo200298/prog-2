package practico5.ejercicio6ClaseAbstraca;

import java.util.ArrayList;

import practico5.ejercicio6.Contribuyente;

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
