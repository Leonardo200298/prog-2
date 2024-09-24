package practico7.ejercicio2;

public class fltroNOT extends Filtro {
    Filtro a;

    public fltroNOT (Filtro a){
        this.a =a;
    }

    public boolean cumple(Documento d){

        return !a.cumple(d);
    }

}
