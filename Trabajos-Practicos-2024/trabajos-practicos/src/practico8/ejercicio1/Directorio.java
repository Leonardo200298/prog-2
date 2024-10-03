package practico8.ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ElementoSA{
    private ArrayList<ElementoSA> archivos;

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.archivos = new ArrayList<>();
    }

    public boolean existeElElemento(Directorio dd){
        return archivos.contains(dd);
    }

    public void tamañoTotal(Directorio dd){
        if (!existeElElemento(dd)) {
            System.out.println("No existe el elemento");
        }
        System.out.println("La cantidad de elemenetos del directorio " + 
            dd.getNombre() + " es " + dd.getTamanio());
        
    }


    public int cantidadDeElementosDeDirectorio(Directorio dd){
        return dd.cantidadDeElementos();
    }

    @Override
    public int getTamanio() {
        int acumulador = 0;
        for (ElementoSA elemento : archivos) {
            acumulador += elemento.getTamanio();
        }
        return acumulador;
      
    }

    public ArrayList<ElementoSA> getArchivos() {
        return new ArrayList<>(archivos);
    }

    @Override
    public int cantidadDeElementos() {
        int acumulador = 0;
        for (ElementoSA elemento : archivos) {
            acumulador += elemento.cantidadDeElementos();
        }
        return acumulador;
    }
}
