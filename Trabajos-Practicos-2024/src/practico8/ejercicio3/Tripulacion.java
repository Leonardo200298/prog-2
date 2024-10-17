package practico8.ejercicio3;
import java.util.ArrayList;
/*posee un nombre, y una fuerza que se
calcula como la suma de la fuerza de cada uno de sus componentes. El peso de una
tripulación/barco queda determinado por el peso del primero de sus componentes, mientras
que la edad es la mayor de las edades de sus componentes.  */

public class Tripulacion extends ElementoOP {

    private ArrayList<ElementoOP> personajes;

    public Tripulacion(String nombre) {
        super(nombre);
        personajes = new ArrayList<>();
    }
    public void addTripulacion(ElementoOP ee){
        personajes.add(ee);
    }
    @Override
    public int getFuerza() {
        int suma = 0;
        for (ElementoOP elementoOP : personajes) {
            suma+=elementoOP.getFuerza();
        }
        return suma;
    }
    @Override
    public int getPeso() {
        return personajes.get(0).getPeso();
    }
    @Override
    public int getEdad() {
        int edad=0;
        for (ElementoOP elementoOP : personajes) {
            if (edad<elementoOP.getEdad()) {
                edad=elementoOP.getEdad();
            }
        }
        return edad;
    }
    


}
