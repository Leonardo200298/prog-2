package practico7.ejercicio2;
public class filtroAutor extends Filtro {
    String a;

    public filtroAutor( String a){
        this.a=a;
    }

    public boolean cumple(Documento d){
            if (d.getAutor().contains(a)) 
                return true;
            else
                return false;
    }

}
