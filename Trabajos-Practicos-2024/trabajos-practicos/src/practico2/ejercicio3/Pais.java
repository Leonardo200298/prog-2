package practico2.ejercicio3;

import java.util.ArrayList;

public class Pais {
    private ArrayList<Provincia> provincias;
    private int habitantesMinimos = 100000;

    public Pais() {
        this.provincias = new ArrayList<>();
    }

    public void addProvincia(Provincia p) {
        provincias.add(p);
    }

    public ArrayList<Ciudad> getCiudadesMasGastadoras() {
        ArrayList<Ciudad> aux = new ArrayList<>();
        for (Provincia p : provincias) {
            for (Ciudad ciudad : p.getCiudades()) {
                if (ciudad.getPoblacion() > habitantesMinimos && ciudad.recaudacion() < 0) {
                    aux.add(ciudad);
                }
            }
        }
        return aux;
    }

    public ArrayList<Provincia> getProvinciasMasDeficit() {
        ArrayList<Provincia> aux = new ArrayList<>();
        ArrayList<Ciudad> aux2 = new ArrayList<>();
        for (Provincia provincia : provincias) {
            for (Ciudad c : provincia.getCiudades()) {
                if (c.recaudacion() < 0 && c.getPoblacion() > habitantesMinimos) {
                    aux2.add(c);
                }
            }
            if (aux2.size() > (provincia.getCiudades().size() / 2)) {
                aux.add(provincia);
            }

        }
        return aux;
    }

}
