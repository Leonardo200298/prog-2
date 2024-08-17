package practico2.ejercicio2;
import java.util.ArrayList;

public class AgendaPersonal {
    private ArrayList<Reunion> reuniones;

    public AgendaPersonal(){
        reuniones = new ArrayList<>();
    }

    public void addReunion(Reunion r){
        reuniones.add(r);

    }
    public String getDatosReunion(Reunion r){
        if (reuniones.contains(r)) {
            return "Lugar: "+r.getLugar()+"\n"+"Tema: "+r.getTema();
        }
        return "";
    }
}
