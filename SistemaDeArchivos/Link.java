package SistemaDeArchivos;

public class Link extends ElementoSistema{
    /*  Los links son
vínculos a otro archivo o directorio y tienen un nombre, una fecha de creación y su tamaño en
disco es siempre igual a 1Kb */
    public Link(String nombre,double tamanio) {
        super(nombre,tamanio);
        
    }
    
}
