package SistemaDeArchivos;

public class CondicionPalabra extends Condicion{
    /* ● Todos los elementos cuyo nombre contenga la palabra “parcial”.
● Todos los elementos que se hayan modificado luego del 15-10-2020.
● Todos los elementos que fueron creados antes del 15-03-2020 y cuyo nombre sea
igual a “parcial”.
● Cualquier combinación lógica (and, or y not) de búsquedas simples */
    private String nombre;
    public CondicionPalabra(String nombre){
        this.nombre = nombre;
    }
    @Override
    public boolean cumple(ElementoSistema e) {
      
        return e.getNombre().contains(nombre);
    }
    
}
