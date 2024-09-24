package practico7.ejercicio2;

public class filtroOR extends Filtro {

    Filtro a;
    Filtro b;

    public filtroOR (Filtro a, Filtro b){
        this.a=a;
        this.b=b;
    }

    public boolean cumple(Documento d){
        return a.cumple(d) || b.cumple(d);
    }

}
